package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class brk implements brq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final brq[] f22160a;

    public brk(brq... brqVarArr) {
        this.f22160a = brqVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brq
    public final brp a(Class cls) {
        brq[] brqVarArr = this.f22160a;
        for (int i9 = 0; i9 < 2; i9++) {
            brq brqVar = brqVarArr[i9];
            if (brqVar.b(cls)) {
                return brqVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brq
    public final boolean b(Class cls) {
        brq[] brqVarArr = this.f22160a;
        for (int i9 = 0; i9 < 2; i9++) {
            if (brqVarArr[i9].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
