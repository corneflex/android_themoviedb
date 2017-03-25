package com.corneflex.themoviedb.data.entity.mapper

import com.corneflex.themoviedb.data.entity.LanguageEntity
import com.corneflex.themoviedb.domain.model.Language
import fr.xebia.extras.selma.Mapper

@Mapper
interface LanguageMapper : EntityMapper<LanguageEntity, Language> {
    override fun transform(entity: LanguageEntity): Language
}
