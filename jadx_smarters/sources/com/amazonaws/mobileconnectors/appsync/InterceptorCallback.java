package com.amazonaws.mobileconnectors.appsync;

import B1.b;
import B1.d;
import D1.a;
import android.os.Message;
import android.util.Log;
import com.amazonaws.mobileconnectors.appsync.AppSyncOfflineMutationInterceptor;
import java.util.Map;
import org.json.JSONObject;
import v1.C2863a;
import v1.InterfaceC2868f;
import v1.i;

/* JADX INFO: loaded from: classes.dex */
class InterceptorCallback implements a.InterfaceC0015a {
    private static final String TAG = "InterceptorCallback";
    AppSyncOfflineMutationManager appSyncOfflineMutationManager;
    String clientState;
    InterfaceC2868f currentMutation;
    a.InterfaceC0015a customerCallBack;
    InterfaceC2868f originalMutation;
    final AppSyncOfflineMutationInterceptor.QueueUpdateHandler queueHandler;
    String recordIdentifier;
    boolean shouldRetry = true;

    public InterceptorCallback(a.InterfaceC0015a interfaceC0015a, AppSyncOfflineMutationInterceptor.QueueUpdateHandler queueUpdateHandler, InterfaceC2868f interfaceC2868f, InterfaceC2868f interfaceC2868f2, String str, String str2, AppSyncOfflineMutationManager appSyncOfflineMutationManager) {
        this.customerCallBack = interfaceC0015a;
        this.queueHandler = queueUpdateHandler;
        this.originalMutation = interfaceC2868f;
        this.currentMutation = interfaceC2868f2;
        this.clientState = str;
        this.recordIdentifier = str2;
        this.appSyncOfflineMutationManager = appSyncOfflineMutationManager;
    }

    @Override // D1.a.InterfaceC0015a
    public void onCompleted() {
        Log.d(TAG, "Thread:[" + Thread.currentThread().getId() + "]: onCompleted()");
    }

    @Override // D1.a.InterfaceC0015a
    public void onFailure(b bVar) {
        String str = TAG;
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: onFailure() " + bVar.getLocalizedMessage());
        if (!(bVar instanceof d)) {
            this.shouldRetry = false;
            this.customerCallBack.onFailure(bVar);
            this.appSyncOfflineMutationManager.setInProgressMutationAsCompleted(this.recordIdentifier);
            Message message = new Message();
            message.obj = new MutationInterceptorMessage(this.originalMutation, this.currentMutation);
            message.what = 500;
            this.queueHandler.sendMessage(message);
            return;
        }
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Network Exception " + bVar.getLocalizedMessage());
        StringBuilder sb = new StringBuilder();
        sb.append("Thread:[");
        sb.append(Thread.currentThread().getId());
        sb.append("]: Will retry mutation when back on network");
        Log.v(str, sb.toString());
        this.queueHandler.setMutationInProgressStatusToFalse();
    }

    @Override // D1.a.InterfaceC0015a
    public void onFetch(a.b bVar) {
        Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: onFetch()");
        this.customerCallBack.onFetch(bVar);
    }

    @Override // D1.a.InterfaceC0015a
    public void onResponse(a.d dVar) {
        Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: onResponse()");
        if (!this.shouldRetry || !ConflictResolutionHandler.conflictPresent(dVar.f1323b)) {
            this.customerCallBack.onResponse(dVar);
            this.appSyncOfflineMutationManager.setInProgressMutationAsCompleted(this.recordIdentifier);
            Message message = new Message();
            message.obj = new MutationInterceptorMessage();
            message.what = 400;
            this.queueHandler.sendMessage(message);
            return;
        }
        this.shouldRetry = false;
        String string = new JSONObject((Map) ((C2863a) ((i) dVar.f1323b.e()).d().get(0)).a().get("data")).toString();
        Message message2 = new Message();
        MutationInterceptorMessage mutationInterceptorMessage = new MutationInterceptorMessage(this.originalMutation, this.currentMutation);
        mutationInterceptorMessage.serverState = string;
        mutationInterceptorMessage.clientState = this.clientState;
        mutationInterceptorMessage.requestIdentifier = this.recordIdentifier;
        mutationInterceptorMessage.requestClassName = this.currentMutation.getClass().getSimpleName();
        message2.obj = mutationInterceptorMessage;
        message2.what = 600;
        this.queueHandler.sendMessage(message2);
    }
}
