package com.difrancescogianmarco.arcore_flutter_plugin

import android.app.Activity
import android.content.Context
import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.embedding.engine.plugins.activity.ActivityAware
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.PluginRegistry.Registrar

class ArcoreFlutterPlugin : FlutterPlugin, ActivityAware {

    companion object {
        lateinit var context: Context
        lateinit var activity: Activity
        lateinit var channel: MethodChannel

        // Optional if you want to keep support for V1 registrars (not needed unless you're supporting old versions)
        @JvmStatic
        fun registerWith(registrar: Registrar) {
            context = registrar.context()
            activity = registrar.activity()
        }
    }

    override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        context = binding.applicationContext
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {}

    override fun onAttachedToActivity(binding: ActivityPluginBinding) {
        activity = binding.activity
    }

    override fun onDetachedFromActivityForConfigChanges() {}

    override fun onReattachedToActivityForConfigChanges(binding: ActivityPluginBinding) {
        activity = binding.activity
    }

    override fun onDetachedFromActivity() {}
}
