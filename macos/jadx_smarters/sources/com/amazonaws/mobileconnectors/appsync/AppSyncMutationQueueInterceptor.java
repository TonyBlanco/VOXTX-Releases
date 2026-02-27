package com.amazonaws.mobileconnectors.appsync;

import D1.a;
import D1.b;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class AppSyncMutationQueueInterceptor implements a {
    Map<String, ConflictMutation> mutationMap;

    public AppSyncMutationQueueInterceptor(Map<String, ConflictMutation> map) {
        this.mutationMap = map;
    }

    @Override // D1.a
    public void dispose() {
    }

    @Override // D1.a
    public void interceptAsync(a.c cVar, b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        this.mutationMap.containsKey(cVar.f1314b.operationId());
    }
}
