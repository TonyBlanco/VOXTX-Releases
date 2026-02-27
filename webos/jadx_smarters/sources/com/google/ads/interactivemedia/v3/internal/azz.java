package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class azz implements baa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bep f20972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ beb f20973b;

    public azz(bep bepVar, beb bebVar) {
        this.f20972a = bepVar;
        this.f20973b = bebVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final azv a(Class cls) throws GeneralSecurityException {
        try {
            return new azx(this.f20972a, cls);
        } catch (IllegalArgumentException e9) {
            throw new GeneralSecurityException("Primitive type not supported", e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final azv b() {
        bep bepVar = this.f20972a;
        return new azx(bepVar, bepVar.i());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final Class c() {
        return this.f20972a.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final Class d() {
        return this.f20973b.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final Set e() {
        return this.f20972a.l();
    }
}
