package com.corneflex.themoviedb.domain.repository

import com.corneflex.themoviedb.domain.model.Movie
import io.reactivex.Observable

interface MovieRepository {
    fun getMovie(id:Int) : Observable<Movie>
    fun getPopularMovies(page:Int) : Observable<List<Movie>>
}