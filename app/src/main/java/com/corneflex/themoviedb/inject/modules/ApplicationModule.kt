package com.corneflex.themoviedb.inject.modules

import android.content.Context
import com.corneflex.themoviedb.MyApplication
import com.corneflex.themoviedb.data.cache.MovieCacheProviders
import com.corneflex.themoviedb.data.net.MoviesService
import com.squareup.moshi.Moshi
import com.squareup.moshi.Rfc3339DateJsonAdapter
import dagger.Module
import dagger.Provides
import io.rx_cache2.internal.RxCache
import io.victoralbertos.jolyglot.MoshiSpeaker
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.File
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class ApplicationModule(val application: MyApplication) {

    companion object {
        val TIMEOUT : Long = 10
    }

    @Provides
    @Singleton
    fun context(): Context {
        return application
    }

    @Provides
    @Singleton
    fun providesCache(context: Context): Cache{
        val myCacheDir = File(context.getCacheDir(), "OkHttpCache")
        val cacheSize = 1024 * 1024
        val cacheDir = Cache(myCacheDir, cacheSize.toLong())
        return cacheDir
    }

    @Provides
    @Singleton
    fun providesOkHttpClient(cache: Cache): OkHttpClient{

        return OkHttpClient.Builder()
                .addInterceptor{
                    val original = it.request()
                    val originalHttpUrl = original.url()

                    val url = originalHttpUrl.newBuilder()
                            .addQueryParameter("api_key", "a7fead48e8cd9a6f55fce599736c5540")
                            .build()

                    // Request customization: add request headers
                    val requestBuilder = original.newBuilder()
                            .url(url)

                    val request = requestBuilder.build()
                    it.proceed(request)
                }
                .connectTimeout(TIMEOUT,TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                .cache(cache)
                .build()
    }

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().add (Date::class.java, Rfc3339DateJsonAdapter()).build()))
                .baseUrl("https://api.themoviedb.org/3/")
                .client(okHttpClient)
                .build()
    }

    @Provides
    @Singleton
    fun providesMovieDBService(retrofit: Retrofit): MoviesService {
        return retrofit.create(MoviesService::class.java)
    }


    @Provides
    @Singleton
    fun providesSerializerRxCache():MoshiSpeaker {
        return MoshiSpeaker()
    }

    @Provides
    @Singleton
    fun providesRxCache(context: Context, moshiSpeaker: MoshiSpeaker): RxCache {
        val myCacheDir = File(context.getCacheDir(), "RxCache")
        return  RxCache.Builder().persistence(myCacheDir, moshiSpeaker)
    }

    fun providesMovieCachecProviders(rxCache: RxCache): MovieCacheProviders {
        return rxCache.using(MovieCacheProviders::class.java)
    }

}