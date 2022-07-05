package com.example.homwork7

import android.content.Context
import android.text.InputType
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.FrameLayout

class MyDynamicEditText(context: Context, hint: String, isNumeric: Boolean) {
    private val editText: EditText
    val frameLayout: FrameLayout = LayoutInflater.from(context).inflate(R.layout.fields, null) as FrameLayout

    init {
        editText = frameLayout.getChildAt(0)  as EditText
        editText.hint = hint
        if(isNumeric)
            editText.inputType = InputType.TYPE_CLASS_NUMBER
    }

}