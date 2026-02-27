package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Future;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
abstract class ayf extends ayj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f20935b = Logger.getLogger(ayf.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private avi f20936c;

    public ayf(avi aviVar) {
        super(aviVar.size());
        atp.k(aviVar);
        this.f20936c = aviVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axz
    public final String e() {
        avi aviVar = this.f20936c;
        if (aviVar == null) {
            return super.e();
        }
        aviVar.toString();
        return "futures=".concat(aviVar.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axz
    public final void h() {
        avi aviVar = this.f20936c;
        s(aye.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (aviVar != null)) {
            boolean zK = k();
            axq axqVarListIterator = aviVar.listIterator();
            while (axqVarListIterator.hasNext()) {
                ((Future) axqVarListIterator.next()).cancel(zK);
            }
        }
    }

    public abstract void p();

    public final void q() {
        avi aviVar = this.f20936c;
        aviVar.getClass();
        if (aviVar.isEmpty()) {
            p();
            return;
        }
        final avi aviVar2 = null;
        Runnable runnable = new Runnable(aviVar2) { // from class: com.google.ads.interactivemedia.v3.internal.ayd

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ avi f20931b = null;

            @Override // java.lang.Runnable
            public final void run() {
                this.f20930a.r((avi) null);
            }
        };
        axq axqVarListIterator = this.f20936c.listIterator();
        while (axqVarListIterator.hasNext()) {
            ((azd) axqVarListIterator.next()).g(runnable, ayn.f20945a);
        }
    }

    public final /* synthetic */ void r(avi aviVar) {
        int iU = u();
        atp.i(iU >= 0, "Less than 0 remaining futures");
        if (iU == 0) {
            v();
            p();
            s(aye.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    public void s(aye ayeVar) {
        atp.k(ayeVar);
        this.f20936c = null;
    }
}
