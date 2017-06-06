package com.corneflex.themoviedb.inject.modules

import android.app.Activity
import com.corneflex.themoviedb.MainActivity
import com.corneflex.themoviedb.inject.components.MainActivitySubComponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = arrayOf(MainActivitySubComponent::class))
internal abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindYourActivityInjectorFactory(builder: MainActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>
}
