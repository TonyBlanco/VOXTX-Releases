package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ev extends at {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1333s f22863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final am f22865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f22866i;

    private ev(int i9, Throwable th, int i10) {
        this(i9, th, i10, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ev(int i9, Throwable th, int i10, String str, int i11, C1333s c1333s, int i12, boolean z9) {
        String str2;
        if (i9 == 0) {
            str2 = "Source error";
        } else if (i9 != 1) {
            str2 = "Unexpected runtime error";
        } else {
            str2 = str + " error, index=" + i11 + ", format=" + String.valueOf(c1333s) + ", format_supported=" + cq.N(i12);
        }
        if (!TextUtils.isEmpty(null)) {
            str2 = str2 + ": " + ((String) null);
        }
        this(str2, th, i10, i9, str, i11, c1333s, i12, null, SystemClock.elapsedRealtime(), z9);
    }

    private ev(String str, Throwable th, int i9, int i10, String str2, int i11, C1333s c1333s, int i12, am amVar, long j9, boolean z9) {
        boolean z10;
        super(str, th, i9, j9);
        int i13 = i10;
        if (!z9) {
            z10 = true;
        } else if (i13 == 1) {
            i13 = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        af.u(z10);
        af.u(th != null);
        this.f22860c = i13;
        this.f22861d = str2;
        this.f22862e = i11;
        this.f22863f = c1333s;
        this.f22864g = i12;
        this.f22865h = amVar;
        this.f22866i = z9;
    }

    public static ev b(Throwable th, String str, int i9, C1333s c1333s, int i10, boolean z9, int i11) {
        return new ev(1, th, i11, str, i9, c1333s, c1333s == null ? 4 : i10, z9);
    }

    public static ev c(IOException iOException, int i9) {
        return new ev(0, iOException, i9);
    }

    public static ev d(RuntimeException runtimeException, int i9) {
        return new ev(2, runtimeException, i9);
    }

    public final ev a(am amVar) {
        String message = getMessage();
        int i9 = cq.f22640a;
        return new ev(message, getCause(), this.f20673a, this.f22860c, this.f22861d, this.f22862e, this.f22863f, this.f22864g, amVar, this.f20674b, this.f22866i);
    }
}
