package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public interface a {
        void a(Status status);
    }

    public abstract void addStatusListener(a aVar);

    public abstract void cancel();

    public abstract void setResultCallback(i iVar);
}
