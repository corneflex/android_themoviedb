package com.corneflex.themoviedb.data.entity.mapper

import com.corneflex.themoviedb.data.entity.MovieEntity
import com.corneflex.themoviedb.domain.model.Movie
import fr.xebia.extras.selma.Mapper
import java.util.*

@Mapper(withCustom = arrayOf(CompanyMapper::class, LanguageMapper::class))
interface MovieMapper : EntityMapper<MovieEntity, Movie>


