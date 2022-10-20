package com.example.rekrutacja.ext

import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE

fun View.toggleVisibility() {
    visibility = if (visibility == VISIBLE) INVISIBLE else VISIBLE
}