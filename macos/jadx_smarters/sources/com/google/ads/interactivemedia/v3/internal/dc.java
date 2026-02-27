package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;

/* JADX INFO: loaded from: classes3.dex */
public final class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f22690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f22691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22695h;

    static {
        aj.b("media3.datasource");
    }

    private dc(Uri uri, int i9, byte[] bArr, Map map, long j9, long j10, String str, int i10) {
        boolean z9 = false;
        boolean z10 = j9 >= 0;
        af.u(z10);
        af.u(z10);
        if (j10 > 0) {
            z9 = true;
        } else if (j10 == -1) {
            j10 = -1;
            z9 = true;
        }
        af.u(z9);
        this.f22688a = uri;
        this.f22689b = i9;
        this.f22690c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f22691d = Collections.unmodifiableMap(new HashMap(map));
        this.f22692e = j9;
        this.f22693f = j10;
        this.f22694g = str;
        this.f22695h = i10;
    }

    public /* synthetic */ dc(Uri uri, int i9, byte[] bArr, Map map, long j9, long j10, String str, int i10, byte[] bArr2) {
        this(uri, i9, bArr, map, j9, j10, str, i10);
    }

    public dc(Uri uri, long j9, long j10) {
        this(uri, 1, null, Collections.emptyMap(), j9, j10, null, 0);
    }

    public static String c(int i9) {
        if (i9 == 1) {
            return HttpGet.METHOD_NAME;
        }
        if (i9 == 2) {
            return "POST";
        }
        throw new IllegalStateException();
    }

    public final db a() {
        return new db(this);
    }

    public final dc b(long j9) {
        long j10 = this.f22693f;
        long j11 = j10 != -1 ? j10 - j9 : -1L;
        long j12 = 0;
        if (j9 != 0) {
            j12 = j9;
        } else if (j10 == j11) {
            return this;
        }
        return new dc(this.f22688a, this.f22689b, this.f22690c, this.f22691d, this.f22692e + j12, j11, this.f22694g, this.f22695h);
    }

    public final boolean d(int i9) {
        return (this.f22695h & i9) == i9;
    }

    public final String toString() {
        return "DataSpec[" + c(this.f22689b) + " " + String.valueOf(this.f22688a) + ", " + this.f22692e + ", " + this.f22693f + ", " + this.f22694g + ", " + this.f22695h + "]";
    }
}
