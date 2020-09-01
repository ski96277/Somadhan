package live.qtech.somadhan.util

object KeyFrame {

    const val SURVEY_DETAILS_ACTIVITY_KEY = "survey_object_data"
    const val NOTIFICATION_SERVICE_ID: Int = 1011
    const val NOTIFICATION_CHANNEL_ID = "Offline_data_sync"
    const val NOTIFICATION_SERVICE_MESSAGE_INTENT_KEY = "message"
    const val googleMapBaseUrl = "https://maps.googleapis.com/"

    const val CUSTOM_REGULAR_FONT = "fonts/OpenSans-Regular.ttf"
    const val CUSTOM_BOLD_FONT = "fonts/OpenSans-Bold.ttf"

    const val USER_AUTH = "token"
    const val USER_ID = "user_id"
    const val PASSWORD = "password"
    const val USER_NAME = "username"
    const val NAME = "name"
    const val LOGIN_STATUS = "login_status"

    const val FIELD_REQUIRED = "Field required!"
    const val SOMETHING_WRONG = "Something went wrong!"
    const val TRY_AGAIN_LATER = "Try after some while!"
    const val LET_US_KNOW = "Please contact developer!"
    const val UPDATE_PROFILE = "Please update your profile first!"
    const val DATE_TIME_PATTERN = "dd/MM/yyyy hh:mm:ss aa"
    const val DATE_TIME_PATTERN_2 = "dd/MM/yyyy hh:mm aa"

    // view type
    const val VIEW_MULTIPLE_CHOICE = "MultipleChoice"
    const val VIEW_RADIO_OPTION = "RadioButtons"
    const val VIEW_NUMBER_FIELD = "NumberField"
    const val VIEW_TEXT_FIELD = "TextField"
    const val VIEW_IMAGE_PICKER = "ImageField"
    const val OPERATION_STATUS = "operationStatus"
    const val SUCCESS = "success"
    const val FAIL = "fail"

    //permission handler code
    const val READ_STORAGE_PERMISSION_REQUEST_CODE: Int = 941
    const val WRITE_EXTERNAL_STORAGE_REQUEST_CODE: Int = 942
    const val CAMERA_REQUEST_CODE: Int = 943
    const val ACCESS_FINE_LOCATION_REQUEST_CODE: Int = 944
    const val ACCESS_BACKGROUND_LOCATION_REQUEST_CODE: Int = 945
    const val ACCESS_COARSE_LOCATION_REQUEST_CODE: Int = 946

    //file handler
    const val FILE_PATH_PREFIX_FROM_CACHE: String = "/data/user/0/live.qtech.somadhan/cache/"

    //exceptions
    const val EXCEPTION_NO_ANSWER_DATA_FOUND: String = "No answer is given / data selected"

    //database
    const val DB_SURVEY_INFO_TABLE: String = "SurveyInfo"
    const val DB_SURVEY_ANSWER_TABLE: String = "SurveyAnswer"
    const val DB_SURVEY_IMAGE_TABLE: String = "SurveyImageTable"

    //service
    const val IMAGE_UPLOAD_THREAD_INTERVAL_IN_SECONDS: Long = 15
    const val SYNC_THREAD_INTERVAL_IN_SECONDS: Long = 15

}