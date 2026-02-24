package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class azy implements baa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f20970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20971b;

    public azy(azv azvVar, int i9) {
        this.f20971b = i9;
        this.f20970a = azvVar;
    }

    public azy(beb bebVar, int i9) {
        this.f20971b = i9;
        this.f20970a = bebVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.ads.interactivemedia.v3.internal.azv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.ads.interactivemedia.v3.internal.azv, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final azv a(Class cls) throws GeneralSecurityException {
        if (this.f20971b != 0) {
            if (this.f20970a.c().equals(cls)) {
                return this.f20970a;
            }
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        try {
            return new azx((beb) this.f20970a, cls);
        } catch (IllegalArgumentException e9) {
            throw new GeneralSecurityException("Primitive type not supported", e9);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.azv, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final azv b() {
        if (this.f20971b != 0) {
            return this.f20970a;
        }
        beb bebVar = (beb) this.f20970a;
        return new azx(bebVar, bebVar.i());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final Class c() {
        int i9 = this.f20971b;
        return this.f20970a.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final Class d() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.ads.interactivemedia.v3.internal.azv, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.baa
    public final Set e() {
        return this.f20971b != 0 ? Collections.singleton(this.f20970a.c()) : ((beb) this.f20970a).l();
    }
}
