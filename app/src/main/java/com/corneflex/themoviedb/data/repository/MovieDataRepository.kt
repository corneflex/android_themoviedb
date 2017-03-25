package com.corneflex.themoviedb.data.repository

import com.corneflex.themoviedb.domain.model.Movie
import com.corneflex.themoviedb.domain.repository.MovieRepository
import io.reactivex.Observable
import javax.inject.Inject

class MovieDataRepository @Inject constructor() : MovieRepository {
    override fun getPopularMovies(page: Int): Observable<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMovie(id: String): Observable<Movie> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}