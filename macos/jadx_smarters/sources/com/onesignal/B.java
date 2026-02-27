package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes4.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleApiClient f38120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f38121b;

    public B(GoogleApiClient googleApiClient) {
        this.f38120a = googleApiClient;
        this.f38121b = googleApiClient.getClass();
    }

    public void a() {
        try {
            this.f38121b.getMethod("connect", null).invoke(this.f38120a, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void b() {
        try {
            this.f38121b.getMethod("disconnect", null).invoke(this.f38120a, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public GoogleApiClient c() {
        return this.f38120a;
    }
}
