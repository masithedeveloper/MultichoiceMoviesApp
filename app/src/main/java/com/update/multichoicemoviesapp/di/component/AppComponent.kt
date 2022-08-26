package com.update.multichoicemoviesapp.di.component

import android.app.Application
import com.update.multichoicemoviesapp.MoviesApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class)])

interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(app: MoviesApp)

    override fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}