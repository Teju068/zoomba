package com.aimids.zoomba

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class ZombaEditText(context: Context, attributeSet: AttributeSet) :
    AppCompatEditText(context, attributeSet) {

    override fun setBackground(background: Drawable?) {
        super.setBackground(background)
    }

    override fun setBackgroundColor(color: Int) {
        super.setBackgroundColor(color)
    }
}