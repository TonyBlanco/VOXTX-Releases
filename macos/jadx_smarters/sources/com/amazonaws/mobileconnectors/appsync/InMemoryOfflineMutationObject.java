package com.amazonaws.mobileconnectors.appsync;

import D1.a;
import D1.b;
import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class InMemoryOfflineMutationObject {
    private static final String TAG = "InMemoryOfflineMutationObject";
    final a.InterfaceC0015a callBack;
    final b chain;
    final Executor dispatcher;
    final String recordIdentifier;
    final a.c request;

    public InMemoryOfflineMutationObject(String str, a.c cVar, b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        this.recordIdentifier = str;
        this.request = cVar;
        this.chain = bVar;
        this.dispatcher = executor;
        this.callBack = interfaceC0015a;
    }

    public void execute() {
        Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Executing mutation by proceeding with the chain.");
        this.chain.a(this.request, this.dispatcher, this.callBack);
    }
}
