package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class ng implements ms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f23866a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private my f23867b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.ms
    public final void a() {
        this.f23867b = null;
        avo avoVarM = avo.m(this.f23866a);
        this.f23866a.clear();
        int size = avoVarM.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((my) avoVarM.get(i9)).j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.ms
    public final void b(Exception exc, boolean z9) {
        this.f23867b = null;
        avo avoVarM = avo.m(this.f23866a);
        this.f23866a.clear();
        int size = avoVarM.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((my) avoVarM.get(i9)).k(exc, z9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ms
    public final void c(my myVar) {
        this.f23866a.add(myVar);
        if (this.f23867b != null) {
            return;
        }
        this.f23867b = myVar;
        myVar.l();
    }

    public final void d(my myVar) {
        this.f23866a.remove(myVar);
        if (this.f23867b == myVar) {
            this.f23867b = null;
            if (this.f23866a.isEmpty()) {
                return;
            }
            my myVar2 = (my) this.f23866a.iterator().next();
            this.f23867b = myVar2;
            myVar2.l();
        }
    }
}
