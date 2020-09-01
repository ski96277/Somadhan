package live.qtech.somadhan.di_editable

import dagger.Module
import dagger.android.ContributesAndroidInjector
import live.qtech.somadhan.di.ActivityScope
import live.qtech.somadhan.ui.splash.SplashActivity

@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeSplashActivity(): SplashActivity



}