package com.tao.mylibrary

import android.content.Context
import android.widget.FrameLayout
import android.widget.TextView

class TTView(context: Context) : FrameLayout(context) {
    private var text:TextView = TextView(context)

    init {

    }

    public fun setTTText(txt:String){
        text.setText(txt)
    }
}