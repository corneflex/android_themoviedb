package com.corneflex.themoviedb.data.repository

import com.corneflex.themoviedb.data.entity.LanguageEntity
import com.corneflex.themoviedb.data.entity.mapper.LanguageMapper
import com.corneflex.themoviedb.data.entity.mapper.MovieMapper
import com.corneflex.themoviedb.data.net.MoviesService
import com.corneflex.themoviedb.domain.model.Movie
import com.corneflex.themoviedb.domain.repository.MovieRepository
import fr.xebia.extras.selma.Selma
import io.reactivex.Observable
import javax.inject.Inject

class MovieDataRepository @Inject constructor(val moviesService:MoviesService) : MovieRepository {

    val mapper = Selma.builder(MovieMapper::class.java).build()

    override fun getPopularMovies(page: Int): Observable<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMovie(id: Int): Observable<Movie> {
        return moviesService.getMovie(id).map { mapper.transform(it)}
    }

}