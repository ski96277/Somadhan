package live.qtech.somadhan.databiding

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import live.qtech.somadhan.helper.DateUtils
import live.qtech.somadhan.util.KeyFrame
import timber.log.Timber

object BindingAdapters {

    @JvmStatic
    @BindingAdapter("loadProfileImage")
    fun loadProfileImage(view: ImageView, imageUrl: String) {
        if (imageUrl.isNotEmpty() && imageUrl.startsWith("http")) {
            Timber.e(imageUrl)
//            Picasso.get().load(imageUrl).placeholder(R.drawable.user_avatar).centerCrop().resize(300, 300).into(view)
        }
    }

    @JvmStatic
    @BindingAdapter("convertDateDMY")
    fun convertDateDMY(view: TextView, date: String) {
        if (date.isNotEmpty()) view.text = DateUtils.convertReadableDateDMY(date)
    }

    @JvmStatic
    @BindingAdapter("layout_visibility")
    fun layoutVisibility(viewGroup: ViewGroup, status: Boolean) {
        if (status) viewGroup.visibility = View.VISIBLE else viewGroup.visibility = View.GONE
    }

    @JvmStatic
    @BindingAdapter("single_layout_visibility")
    fun singleLayoutVisibility(view: View, status: Boolean) {
        if (status) view.visibility = View.VISIBLE else view.visibility = View.GONE
    }

    @JvmStatic
    @BindingAdapter("millisToGetDate")
    fun getDateTimeFromMillis(view: TextView, millisToGetDate: Any) {
        val date: String = DateUtils.getDateTime(millisToGetDate.toString().toLong(), KeyFrame.DATE_TIME_PATTERN_2)
        view.text = date
    }
}