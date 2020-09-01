package live.qtech.somadhan.base

import dagger.Module
import dagger.Provides
import live.qtech.somadhan.di.QTechApiUrl
import javax.inject.Singleton

@Module
class BaseUrlModule {
    @Singleton
    @Provides
    @QTechApiUrl
    fun provideBaseUrl():String = "http://167.71.228.0/"
}