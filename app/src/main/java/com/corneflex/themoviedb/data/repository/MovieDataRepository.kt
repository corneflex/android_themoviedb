package com.corneflex.themoviedb.data.repository

import com.corneflex.themoviedb.data.entity.LanguageEntity
import com.corneflex.themoviedb.data.entity.MovieEntity
import com.corneflex.themoviedb.data.entity.mapper.toMovie
import com.corneflex.themoviedb.data.net.MoviesService
import com.corneflex.themoviedb.domain.model.Movie
import com.corneflex.themoviedb.domain.repository.MovieRepository
import io.reactivex.Observable
import javax.inject.Inject

class MovieDataRepository @Inject constructor(val moviesService:MoviesService) : MovieRepository {

    override fun getPopularMovies(page: Int): Observable<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMovie(id: Int): Observable<Movie> {
        return moviesService.getMovie(id).map(MovieEntity::toMovie)
    }

}