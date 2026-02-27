package com.google.ads.interactivemedia.v3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class yy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ys f25220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final yx f25221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected yu f25222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25223d;

    public yy(yv yvVar, yx yxVar, long j9, long j10, long j11, long j12, long j13, int i9) {
        this.f25221b = yxVar;
        this.f25223d = i9;
        this.f25220a = new ys(yvVar, j9, j10, j11, j12, j13);
    }

    public static final int f(zi ziVar, long j9, zy zyVar) {
        if (j9 == ziVar.d()) {
            return 0;
        }
        zyVar.f25320a = j9;
        return 1;
    }

    public static final boolean g(zi ziVar, long j9) throws IOException {
        long jD = j9 - ziVar.d();
        if (jD < 0 || jD > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ziVar.i((int) jD);
        return true;
    }

    public final int a(zi ziVar, zy zyVar) throws IOException {
        while (true) {
            yu yuVar = this.f25222c;
            af.t(yuVar);
            long j9 = yuVar.f25213f;
            long j10 = yuVar.f25214g;
            long j11 = yuVar.f25215h;
            if (j10 - j9 <= this.f25223d) {
                e();
                return f(ziVar, j9, zyVar);
            }
            if (!g(ziVar, j11)) {
                return f(ziVar, j11, zyVar);
            }
            ziVar.h();
            yw ywVarA = this.f25221b.a(ziVar, yuVar.f25209b);
            int i9 = ywVarA.f25217b;
            if (i9 == -3) {
                e();
                return f(ziVar, j11, zyVar);
            }
            if (i9 == -2) {
                yu.h(yuVar, ywVarA.f25218c, ywVarA.f25219d);
            } else {
                if (i9 != -1) {
                    g(ziVar, ywVarA.f25219d);
                    e();
                    return f(ziVar, ywVarA.f25219d, zyVar);
                }
                yu.g(yuVar, ywVarA.f25218c, ywVarA.f25219d);
            }
        }
    }

    public final aab b() {
        return this.f25220a;
    }

    public final void c(long j9) {
        yu yuVar = this.f25222c;
        if (yuVar == null || yuVar.f25208a != j9) {
            long jF = this.f25220a.f(j9);
            ys ysVar = this.f25220a;
            this.f25222c = new yu(j9, jF, ysVar.f25204c, ysVar.f25205d, ysVar.f25206e, ysVar.f25207f);
        }
    }

    public final boolean d() {
        return this.f25222c != null;
    }

    public final void e() {
        this.f25222c = null;
        this.f25221b.b();
    }
}
