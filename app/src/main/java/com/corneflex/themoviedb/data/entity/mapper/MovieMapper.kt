package com.corneflex.themoviedb.data.entity.mapper

import com.corneflex.themoviedb.data.entity.MovieEntity
import com.corneflex.themoviedb.domain.model.Movie

fun MovieEntity.toMovie():Movie = Movie(this.id,
        this.imdbId,
        this.voteAverage,
        this.budget,
        this.backDropPath,
        this.status,
        this.runtime,
        this.adult,
        this.homepage,
        this.title,
        this.originalLanguage,
        this.overview,
        this.originalTitle,
        this.voteCount,
        this.posterPath,
        this.video,
        this.tagLine,
        this.revenue,
        this.popularity,
        this.releaseDate,
        this.companies.map {
            it.toCompany()
        },
        this.spokenLanguages.map { it.toLanguage() })