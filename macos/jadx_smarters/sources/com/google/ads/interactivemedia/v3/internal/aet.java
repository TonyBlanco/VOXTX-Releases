package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19406e;

    public aet(int i9, int i10) {
        this(Integer.MIN_VALUE, i9, i10);
    }

    public aet(int i9, int i10, int i11) {
        String str;
        if (i9 != Integer.MIN_VALUE) {
            str = i9 + "/";
        } else {
            str = "";
        }
        this.f19402a = str;
        this.f19403b = i10;
        this.f19404c = i11;
        this.f19405d = Integer.MIN_VALUE;
        this.f19406e = "";
    }

    private final void d() {
        if (this.f19405d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.f19405d;
    }

    public final String b() {
        d();
        return this.f19406e;
    }

    public final void c() {
        int i9 = this.f19405d;
        int i10 = i9 == Integer.MIN_VALUE ? this.f19403b : i9 + this.f19404c;
        this.f19405d = i10;
        this.f19406e = this.f19402a + i10;
    }
}
