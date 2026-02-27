package com.flutteriptv.flutter_iptv

import android.util.Log
import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    /**
     * Placeholder for Android TV fragments that want to store watch history.
     * This implementation simply logs so the call site compiles until the MethodChannel
     * implementation lands.
     */
    fun addWatchHistory(channelIndex: Int) {
        Log.d(TAG, "addWatchHistory(channelIndex=$channelIndex)")
    }

    fun requestEpgInfo(name: String, epgId: String, callback: (Map<String, Any?>?) -> Unit) {
        Log.d(TAG, "requestEpgInfo(name=$name, epgId=$epgId)")
        callback(null)
    }

    fun getEpgInfo(channelName: String, callback: (Map<String, Any?>?) -> Unit) {
        Log.d(TAG, "getEpgInfo(channelName=$channelName)")
        callback(null)
    }

    fun toggleFavorite(channelIndex: Int, callback: (Boolean?) -> Unit) {
        Log.d(TAG, "toggleFavorite(channelIndex=$channelIndex)")
        callback(null)
    }

    fun isFavorite(channelIndex: Int, callback: (Boolean) -> Unit) {
        Log.d(TAG, "isFavorite(channelIndex=$channelIndex)")
        callback(false)
    }
}