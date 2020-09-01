package live.qtech.somadhan.di_editable

import dagger.Module
import dagger.android.ContributesAndroidInjector
import live.qtech.somadhan.dialog.DateFilterDialogFragment
import live.qtech.somadhan.di.ScreenScope

@Module
abstract class FragmentModule {
    @ScreenScope
    @ContributesAndroidInjector
    abstract fun contributeDateFilterDialogFragment(): DateFilterDialogFragment

}