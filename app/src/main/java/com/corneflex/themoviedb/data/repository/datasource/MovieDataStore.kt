package com.corneflex.themoviedb.data.repository.datasource

import com.corneflex.themoviedb.data.entity.MovieEntity
import com.corneflex.themoviedb.domain.model.Movie
import io.reactivex.Observable


interface MovieDataStore {
    fun getMovie(id: Int): Observable<MovieEntity>

    fun getLatest(): Observable<MovieEntity>
}
