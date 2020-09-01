package live.qtech.somadhan.dialog.customer_dialog_picker

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import live.qtech.somadhan.R

class CustomerPickerDialog(private val mContext: Context) : AlertDialog.Builder(mContext) {
    @SuppressLint("InflateParams")
    override fun show(): AlertDialog {
        val view = LayoutInflater.from(mContext).inflate(R.layout.z_temp_view, null)
//        view.findViewById<TextView>(R.id.dialogTitleTv).setOnClickListener {
//            Timber.e("asdf")
//
//        }
        return super.show()
    }

}