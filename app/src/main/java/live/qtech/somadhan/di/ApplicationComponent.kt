package live.qtech.somadhan.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import live.qtech.somadhan.base.QTecApplication
import live.qtech.somadhan.di_editable.ActivityModule
import live.qtech.somadhan.di_editable.FragmentModule
import live.qtech.somadhan.di_editable.ViewModelModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        FragmentModule::class,
        ActivityModule::class,
        ViewModelModule::class,
        ServiceModule::class
    ]
)
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }

    fun inject(application: QTecApplication)
}