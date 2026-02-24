package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.AbstractC1404c;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class arz implements AbstractC1404c.a, AbstractC1404c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    protected final asj f20603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f20606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HandlerThread f20607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aru f20608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f20609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20610h;

    public arz(Context context, int i9, String str, String str2, aru aruVar) {
        this.f20604b = str;
        this.f20610h = i9;
        this.f20605c = str2;
        this.f20608f = aruVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f20607e = handlerThread;
        handlerThread.start();
        this.f20609g = System.currentTimeMillis();
        asj asjVar = new asj(context, handlerThread.getLooper(), this, this, 19621000);
        this.f20603a = asjVar;
        this.f20606d = new LinkedBlockingQueue();
        asjVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static ast b() {
        return new ast();
    }

    private final void e(int i9, long j9) {
        f(i9, j9, null);
    }

    private final void f(int i9, long j9, Exception exc) {
        this.f20608f.c(i9, System.currentTimeMillis() - j9, exc);
    }

    public final aso a() {
        try {
            return this.f20603a.a();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final ast c() {
        ast astVar;
        try {
            astVar = (ast) this.f20606d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            f(AdError.INTERSTITIAL_AD_TIMEOUT, this.f20609g, e9);
            astVar = null;
        }
        e(3004, this.f20609g);
        if (astVar != null) {
            aru.g(astVar.f20654c == 7 ? afj.f19444c : afj.f19443b);
        }
        return astVar == null ? b() : astVar;
    }

    public final void d() {
        asj asjVar = this.f20603a;
        if (asjVar != null) {
            if (asjVar.isConnected() || this.f20603a.isConnecting()) {
                this.f20603a.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.a
    public final void onConnected(Bundle bundle) {
        aso asoVarA = a();
        if (asoVarA != null) {
            try {
                ast astVarF = asoVarA.f(new ass(this.f20610h, this.f20604b, this.f20605c));
                e(5011, this.f20609g);
                this.f20606d.put(astVarF);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.b
    public final void onConnectionFailed(C2914b c2914b) {
        try {
            e(4012, this.f20609g);
            this.f20606d.put(b());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.a
    public final void onConnectionSuspended(int i9) {
        try {
            e(4011, this.f20609g);
            this.f20606d.put(b());
        } catch (InterruptedException unused) {
        }
    }
}
