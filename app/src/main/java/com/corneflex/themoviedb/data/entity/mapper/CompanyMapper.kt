package com.corneflex.themoviedb.data.entity.mapper

import com.corneflex.themoviedb.data.entity.CompanyEntity
import com.corneflex.themoviedb.domain.model.Company

fun CompanyEntity.toCompany():Company = Company(
        this.id,
        this.description,
        this.headquarters,
        this.name,
        this.logoPath,
        this.parentCompany)