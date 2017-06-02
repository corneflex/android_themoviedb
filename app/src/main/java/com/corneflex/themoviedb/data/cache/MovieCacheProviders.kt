package com.corneflex.themoviedb.data.cache

import com.corneflex.themoviedb.data.entity.MovieEntity
import io.reactivex.Observable
import io.rx_cache2.DynamicKey
import io.rx_cache2.EvictDynamicKey
import io.rx_cache2.LifeCache
import io.rx_cache2.Reply
import java.util.concurrent.TimeUnit


interface MovieCacheProviders {
    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    fun getMovie(movieEntity : Observable<MovieEntity>, id : DynamicKey, evictDynamicKey : EvictDynamicKey):Observable<MovieEntity>

}
