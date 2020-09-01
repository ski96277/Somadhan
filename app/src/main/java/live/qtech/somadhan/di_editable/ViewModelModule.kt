package live.qtech.somadhan.di_editable

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import live.qtech.somadhan.di.ViewModelKey
import live.qtech.somadhan.ui.splash.SplashViewModel

@Module
abstract class ViewModelModule {


    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindSplashViewModel(viewModel: SplashViewModel): ViewModel


}