package live.qtech.somadhan.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import live.qtech.somadhan.base.BaseActivity
import live.qtech.somadhan.BuildConfig
import live.qtech.somadhan.R
import live.qtech.somadhan.databinding.SplashActivityBinding
import java.util.concurrent.TimeUnit

@SuppressLint("SetTextI18n")
class SplashActivity : BaseActivity<SplashActivityBinding>() {
    private lateinit var viewModel: SplashViewModel
    private var disposable: Disposable? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding.lifecycleOwner = this
        viewModel = ViewModelProvider(this, viewModelFactory).get(SplashViewModel::class.java)

        whiteNotificationBar(dataBinding.toolBar)
        dataBinding.loading = true
        if (BuildConfig.DEBUG) dataBinding.appVersionTv.text = "Developer version: ${BuildConfig.VERSION_NAME}"
        else dataBinding.appVersionTv.text = BuildConfig.VERSION_NAME
    }

    override fun layoutRes(): Int = R.layout.splash_activity

    override fun onResume() {
        super.onResume()
        disposable = Observable.timer(2, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
//                if (sharedPrefHelper.getBoolean(KeyFrame.LOGIN_STATUS)) ScreenNavigator.navigateSurveyHomeActivity(activityContext)
//                else ScreenNavigator.navigateLoginActivity(activityContext)
            }
    }

    override fun onDestroy() {
        super.onDestroy()
        disposable?.dispose()
    }
}