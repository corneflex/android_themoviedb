package com.corneflex.themoviedb.data.repository.datasource

import com.corneflex.themoviedb.data.entity.MovieEntity
import com.corneflex.themoviedb.data.net.MoviesService
import io.reactivex.Observable

class MovieCloudDataStore( val service: MoviesService) : MovieDataStore{
    override fun getLatest(): Observable<MovieEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMovie(id: Int): Observable<MovieEntity> {
        return service.getMovie(id)
    }


}
