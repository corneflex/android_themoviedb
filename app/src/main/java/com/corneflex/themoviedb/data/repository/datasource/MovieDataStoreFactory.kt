package com.corneflex.themoviedb.data.repository.datasource

import com.corneflex.themoviedb.data.cache.MovieCacheProviders
import com.corneflex.themoviedb.data.net.MoviesService
import javax.inject.Inject

class MovieDataStoreFactory @Inject constructor(val movieCache : MovieCacheProviders, val movieService : MoviesService) {


    fun create():MovieDataStore {
        return MovieCacheDataStore(movieCache, MovieCloudDataStore(movieService))
    }
}
