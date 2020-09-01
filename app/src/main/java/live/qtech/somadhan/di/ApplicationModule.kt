package live.qtech.somadhan.di

import android.app.Application
import dagger.Module
import dagger.Provides
import live.qtech.somadhan.helper.SharedPrefHelper
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun provideSharedPrefHelper(application:Application) = SharedPrefHelper(application)

}