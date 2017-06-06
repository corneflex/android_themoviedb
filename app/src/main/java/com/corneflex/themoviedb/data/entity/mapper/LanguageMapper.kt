package com.corneflex.themoviedb.data.entity.mapper

import com.corneflex.themoviedb.data.entity.LanguageEntity
import com.corneflex.themoviedb.domain.model.Language

fun LanguageEntity.toLanguage():Language = Language(this.name, this.iso)