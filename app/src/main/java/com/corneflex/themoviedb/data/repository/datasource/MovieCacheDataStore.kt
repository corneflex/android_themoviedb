package com.corneflex.themoviedb.data.repository.datasource

import com.corneflex.themoviedb.data.cache.MovieCacheProviders
import com.corneflex.themoviedb.data.entity.MovieEntity
import io.reactivex.Observable
import io.rx_cache2.DynamicKey
import io.rx_cache2.EvictDynamicKey
import io.rx_cache2.Reply
import javax.inject.Inject

class MovieCacheDataStore @Inject constructor(val cacheProviders: MovieCacheProviders, val movieCloudDataStore: MovieCloudDataStore) : MovieDataStore {
    override fun getLatest(): Observable<MovieEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMovie(id: Int): Observable<MovieEntity> {
       return cacheProviders.getMovie(movieCloudDataStore.getMovie(id), DynamicKey(id), EvictDynamicKey(false))
    }


}
