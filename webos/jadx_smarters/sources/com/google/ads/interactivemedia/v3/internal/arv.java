package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class arv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f20594d;

    public arv() {
    }

    public arv(byte[] bArr) {
        this();
    }

    public final arw a() {
        String str;
        if (this.f20594d == 3 && (str = this.f20591a) != null) {
            return new arw(str, this.f20592b, this.f20593c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f20591a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f20594d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f20594d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f20591a = str;
    }

    public final void c() {
        this.f20593c = true;
        this.f20594d = (byte) (this.f20594d | 2);
    }

    public final void d(boolean z9) {
        this.f20592b = z9;
        this.f20594d = (byte) (this.f20594d | 1);
    }
}
