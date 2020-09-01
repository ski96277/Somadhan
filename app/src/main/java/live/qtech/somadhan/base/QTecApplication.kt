package live.qtech.somadhan.base

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import live.qtech.somadhan.helper.FontsOverride
import live.qtech.somadhan.helper.SharedPrefHelper
import live.qtech.somadhan.util.KeyFrame
import live.qtech.somadhan.BuildConfig
import timber.log.Timber
import javax.inject.Inject

class QTecApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var helper: SharedPrefHelper


    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
        createNotificationServiceChannel()
        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/OpenSans-Regular.ttf")
        DaggerApplicationComponent.builder().application(this).build().inject(this)


    }


    private fun createNotificationServiceChannel() {
        Timber.e("Creating notification channel ID")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(KeyFrame.NOTIFICATION_CHANNEL_ID, "Survey sync service channel", NotificationManager.IMPORTANCE_DEFAULT)
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(serviceChannel)
        }
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}