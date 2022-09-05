package com.thatsmekaustubh.mylibrary

import android.content.Context
import android.widget.Toast

class ToasterExample {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}