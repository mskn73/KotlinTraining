package com.franhernandez.kotlintraining

import android.content.Context
import android.widget.Toast

/**
 * Created by moskis on 06/04/2017.
 */

fun Context.toast(text: CharSequence, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}