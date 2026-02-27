package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bnl extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f21748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bnm f21749b;

    public bnl(bnm bnmVar, Class cls) {
        this.f21749b = bnmVar;
        this.f21748a = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final Object read(boh bohVar) throws IOException {
        Object obj = this.f21749b.f21751b.read(bohVar);
        if (obj == null || this.f21748a.isInstance(obj)) {
            return obj;
        }
        throw new bkf("Expected a " + this.f21748a.getName() + " but was " + obj.getClass().getName() + "; at path " + bohVar.f());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final void write(boj bojVar, Object obj) throws IOException {
        this.f21749b.f21751b.write(bojVar, obj);
    }
}
