package com.corneflex.themoviedb.data.entity.mapper

interface EntityMapper<in Entity,out Model> {

    fun transform(entity: Entity) : Model
}

