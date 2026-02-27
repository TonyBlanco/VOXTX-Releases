package com.amazonaws.mobileconnectors.appsync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes.dex */
class ConnectivityWatcher {
    private BroadcastReceiver broadcastReceiver;
    private final Callback callback;
    private final ConnectivityManager connManager;
    private final Context context;
    private ConnectivityManager.NetworkCallback networkCallback;

    public interface Callback {
        void onConnectivityChanged(boolean z9);
    }

    public class ConnectivityChangeReceiver extends BroadcastReceiver {
        private ConnectivityChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                ConnectivityWatcher.this.callback.onConnectivityChanged(ConnectivityWatcher.this.isNetworkConnected());
            }
        }
    }

    public class NetworkCallback extends ConnectivityManager.NetworkCallback {
        private boolean isConnected;

        private NetworkCallback() {
            this.isConnected = ConnectivityWatcher.this.isNetworkConnected();
        }

        private void checkConnected() {
            boolean zIsNetworkConnected = ConnectivityWatcher.this.isNetworkConnected();
            if (this.isConnected != zIsNetworkConnected) {
                this.isConnected = zIsNetworkConnected;
                ConnectivityWatcher.this.callback.onConnectivityChanged(zIsNetworkConnected);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            checkConnected();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            checkConnected();
        }
    }

    public ConnectivityWatcher(Context context, Callback callback) {
        this.context = context.getApplicationContext();
        this.callback = callback;
        this.connManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNetworkConnected() {
        NetworkInfo activeNetworkInfo = this.connManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void registerBroadcastReceiver() {
        if (this.broadcastReceiver == null) {
            ConnectivityChangeReceiver connectivityChangeReceiver = new ConnectivityChangeReceiver();
            this.broadcastReceiver = connectivityChangeReceiver;
            this.context.registerReceiver(connectivityChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    private void registerNetworkCallback() {
        if (this.networkCallback == null) {
            this.networkCallback = new NetworkCallback();
            this.connManager.registerNetworkCallback(new NetworkRequest.Builder().build(), this.networkCallback);
        }
    }

    private void unregisterBroadcastReceiver() {
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        if (broadcastReceiver != null) {
            this.context.unregisterReceiver(broadcastReceiver);
            this.broadcastReceiver = null;
        }
    }

    private void unregisterNetworkCallback() {
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback != null) {
            this.connManager.unregisterNetworkCallback(networkCallback);
            this.networkCallback = null;
        }
    }

    public void register() {
        registerNetworkCallback();
    }

    public void unregister() {
        unregisterNetworkCallback();
    }
}
