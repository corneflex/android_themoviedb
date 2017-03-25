package com.corneflex.themoviedb.data.entity.mapper

import com.corneflex.themoviedb.data.entity.CompanyEntity
import com.corneflex.themoviedb.domain.model.Company
import fr.xebia.extras.selma.Mapper

@Mapper
interface CompanyMapper : EntityMapper<CompanyEntity, Company> {
    override fun transform(entity: CompanyEntity):Company
}

