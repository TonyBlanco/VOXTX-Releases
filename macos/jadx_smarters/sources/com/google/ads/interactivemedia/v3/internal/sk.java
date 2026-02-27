package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sk implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24514b;

    public /* synthetic */ sk(ca caVar, int i9) {
        this.f24514b = i9;
        this.f24513a = caVar;
    }

    public /* synthetic */ sk(sp spVar, int i9) {
        this.f24514b = i9;
        this.f24513a = spVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f24514b != 0) {
            ca.h((ca) this.f24513a);
            return true;
        }
        sp.N((sp) this.f24513a, message);
        return true;
    }
}
