package com.difrancescogianmarco.arcore_flutter_plugin

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.embedding.engine.plugins.activity.ActivityAware
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding

class ArcoreFlutterPlugin : FlutterPlugin, ActivityAware {

    override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        // Initialize plugin resources here
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        // Clean up plugin resources here
    }

    override fun onAttachedToActivity(binding: ActivityPluginBinding) {
        // Handle activity attachment
    }

    override fun onDetachedFromActivityForConfigChanges() {
        // Handle activity detachment for config changes
    }

    override fun onReattachedToActivityForConfigChanges(binding: ActivityPluginBinding) {
        // Handle reattachment to activity after config changes
    }

    override fun onDetachedFromActivity() {
        // Handle activity detachment
    }
}
