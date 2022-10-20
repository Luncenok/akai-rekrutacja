package com.example.rekrutacja

import android.app.Application
import com.google.android.material.color.DynamicColors

class RekrutacjaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}