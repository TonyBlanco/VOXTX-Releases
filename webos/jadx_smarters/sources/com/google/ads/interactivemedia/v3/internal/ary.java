package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC1404c;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class ary implements AbstractC1404c.a, AbstractC1404c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    protected final asj f20598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f20601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HandlerThread f20602e;

    public ary(Context context, String str, String str2) {
        this.f20599b = str;
        this.f20600c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f20602e = handlerThread;
        handlerThread.start();
        asj asjVar = new asj(context, handlerThread.getLooper(), this, this, 9200000);
        this.f20598a = asjVar;
        this.f20601d = new LinkedBlockingQueue();
        asjVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static agc a() {
        agl aglVarAs = agc.as();
        aglVarAs.am(32768L);
        return (agc) aglVarAs.aY();
    }

    public final agc b() {
        agc agcVar;
        try {
            agcVar = (agc) this.f20601d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            agcVar = null;
        }
        return agcVar == null ? a() : agcVar;
    }

    public final aso c() {
        try {
            return this.f20598a.a();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void d() {
        asj asjVar = this.f20598a;
        if (asjVar != null) {
            if (asjVar.isConnected() || this.f20598a.isConnecting()) {
                this.f20598a.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.a
    public final void onConnected(Bundle bundle) {
        aso asoVarC = c();
        if (asoVarC != null) {
            try {
                try {
                    this.f20601d.put(asoVarC.e(new ask(this.f20599b, this.f20600c)).a());
                } catch (Throwable unused) {
                    this.f20601d.put(a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                d();
                this.f20602e.quit();
                throw th;
            }
            d();
            this.f20602e.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.b
    public final void onConnectionFailed(C2914b c2914b) {
        try {
            this.f20601d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.a
    public final void onConnectionSuspended(int i9) {
        try {
            this.f20601d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
