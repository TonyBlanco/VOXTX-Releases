package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class xc implements xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wv f25036a = n(false, -9223372036854775807L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wv f25037b = new wv(2, -9223372036854775807L, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wv f25038c = new wv(3, -9223372036854775807L, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f25039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private wx f25040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f25041f;

    public xc(String str) {
        this.f25039d = cq.R("ExoPlayer:Loader:".concat(str));
    }

    public static wv n(boolean z9, long j9) {
        return new wv(z9 ? 1 : 0, j9, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xd
    public final void a() throws IOException {
        i(Integer.MIN_VALUE);
    }

    public final long b(wy wyVar, ww wwVar, int i9) {
        Looper looperMyLooper = Looper.myLooper();
        af.t(looperMyLooper);
        this.f25041f = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new wx(this, looperMyLooper, wyVar, wwVar, i9, jElapsedRealtime).c(0L);
        return jElapsedRealtime;
    }

    public final void g() {
        wx wxVar = this.f25040e;
        af.t(wxVar);
        wxVar.a(false);
    }

    public final void h() {
        this.f25041f = null;
    }

    public final void i(int i9) throws IOException {
        IOException iOException = this.f25041f;
        if (iOException != null) {
            throw iOException;
        }
        wx wxVar = this.f25040e;
        if (wxVar != null) {
            if (i9 == Integer.MIN_VALUE) {
                i9 = wxVar.f25020a;
            }
            wxVar.b(i9);
        }
    }

    public final void j() {
        k(null);
    }

    public final void k(wz wzVar) {
        wx wxVar = this.f25040e;
        if (wxVar != null) {
            wxVar.a(true);
        }
        if (wzVar != null) {
            this.f25039d.execute(new xa(wzVar));
        }
        this.f25039d.shutdown();
    }

    public final boolean l() {
        return this.f25041f != null;
    }

    public final boolean m() {
        return this.f25040e != null;
    }
}
