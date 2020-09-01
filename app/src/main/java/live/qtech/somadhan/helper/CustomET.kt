package live.qtech.somadhan.helper

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import live.qtech.somadhan.util.KeyFrame

open class CustomET : AppCompatEditText{

    constructor(context: Context) : super(context){
        applyCustomFont(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context,attrs){
        applyCustomFont(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr:Int) : super(context,attrs,defStyleAttr){
        applyCustomFont(context)
    }

    private fun applyCustomFont(context: Context) {
        val customFont = FontsOverride.getTypeface(KeyFrame.CUSTOM_REGULAR_FONT, context)
        typeface = customFont
    }
}