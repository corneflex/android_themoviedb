package com.corneflex.themoviedb.inject.components

import android.app.Activity
import android.content.Context
import com.corneflex.themoviedb.MainActivity
import com.corneflex.themoviedb.MyApplication
import com.corneflex.themoviedb.inject.modules.ApplicationModule
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import javax.inject.Singleton


@Module(subcomponents = arrayOf(MainActivitySubComponent::class))
internal abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindYourActivityInjectorFactory(builder: MainActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>
}

@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = arrayOf(ApplicationModule::class, MainActivityModule::class))
interface ApplicationComponent {
    fun inject(application: MyApplication)
    fun Context():Context
}