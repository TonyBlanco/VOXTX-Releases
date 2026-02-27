package com.amazonaws.mobileconnectors.appsync.subscription;

import B1.e;
import F1.h;
import K1.d;
import android.util.Log;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import v1.InterfaceC2868f;
import v1.InterfaceC2868f.a;
import v1.InterfaceC2868f.b;
import v1.i;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionObject<D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> {
    private static final String CONTENT_TYPE = "application/json";
    private static final MediaType MEDIA_TYPE = MediaType.parse(CONTENT_TYPE);
    private static final String TAG = "SubscriptionObject";
    public h normalizer;
    public d scalarTypeAdapters;
    public t subscription;
    private boolean cancelled = false;
    public Set<String> topics = new HashSet();
    public Set<AppSyncSubscriptionCall.Callback> listeners = new HashSet();

    private void notifyDisconnectionEventToAllListeners() {
        Iterator<AppSyncSubscriptionCall.Callback> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onCompleted();
        }
    }

    private void notifyErrorToAllListeners(B1.b bVar) {
        Iterator<AppSyncSubscriptionCall.Callback> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onFailure(bVar);
        }
    }

    private void propagateMessageToAllListeners(i iVar) {
        for (AppSyncSubscriptionCall.Callback callback : this.listeners) {
            Log.v(TAG, "Propagating message to : " + callback.toString());
            callback.onResponse(iVar);
        }
    }

    public void addListener(AppSyncSubscriptionCall.Callback callback) {
        Log.v(TAG, "Adding listener to " + this);
        this.listeners.add(callback);
    }

    public Set<AppSyncSubscriptionCall.Callback> getListeners() {
        return this.listeners;
    }

    public Set<String> getTopics() {
        return this.topics;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void onFailure(B1.b bVar) {
        if (bVar.getCause() instanceof SubscriptionDisconnectedException) {
            notifyDisconnectionEventToAllListeners();
        } else {
            notifyErrorToAllListeners(bVar);
        }
    }

    public void onMessage(String str) throws Throwable {
        try {
            ResponseBody responseBodyCreate = ResponseBody.create(str, MEDIA_TYPE);
            t tVar = this.subscription;
            i iVarF = new K1.a(tVar, tVar.responseFieldMapper(), this.scalarTypeAdapters, this.normalizer).f(responseBodyCreate.source());
            if (iVarF.e()) {
                Log.w(TAG, "Errors detected in parsed subscription message");
            }
            propagateMessageToAllListeners(iVarF);
        } catch (Exception e9) {
            Log.e(TAG, "Failed to parse: " + str, e9);
            notifyErrorToAllListeners(new e("Failed to parse http response", e9));
        }
    }

    public void setCancelled() {
        this.cancelled = true;
    }
}
