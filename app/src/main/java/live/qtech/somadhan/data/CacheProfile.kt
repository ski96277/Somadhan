package live.qtech.somadhan.data
import live.qtech.somadhan.di.QTechApiUrl
import live.qtech.somadhan.helper.SharedPrefHelper
import javax.inject.Inject

class CacheProfile @Inject constructor(private val sharedPrefHelper: SharedPrefHelper, @QTechApiUrl var baseUrl:String) {
//    fun cacheProfile(profileData:ProfileResponse){
//        sharedPrefHelper.putBoolean(KeyFrame.LOGIN_STATUS,true)
//        sharedPrefHelper.putString(KeyFrame.NAME,profileData.profile.name)
//        sharedPrefHelper.putString(KeyFrame.PHONE_NUMBER,profileData.profile.phone)
//        sharedPrefHelper.putString(KeyFrame.PROFILE_PICTURE,"$baseUrl/storage/${profileData.profile.avatar}")
//
//    }
}