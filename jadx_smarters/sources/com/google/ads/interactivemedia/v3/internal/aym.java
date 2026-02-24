package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class aym extends ayf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ayl f20944b;

    public aym(avi aviVar, Executor executor, Callable callable) {
        super(aviVar);
        this.f20944b = new ayk(this, callable, executor);
        q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axz
    public final void i() {
        ayl aylVar = this.f20944b;
        if (aylVar != null) {
            aylVar.h();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayf
    public final void p() {
        ayl aylVar = this.f20944b;
        if (aylVar != null) {
            aylVar.f();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayf
    public final void s(aye ayeVar) {
        super.s(ayeVar);
        if (ayeVar == aye.OUTPUT_FUTURE_DONE) {
            this.f20944b = null;
        }
    }
}
