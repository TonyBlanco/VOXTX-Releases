package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes3.dex */
final class bjr extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bkl f21568a;

    public bjr(bkl bklVar) {
        this.f21568a = bklVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        bohVar.i();
        while (bohVar.p()) {
            arrayList.add(Long.valueOf(((Number) this.f21568a.read(bohVar)).longValue()));
        }
        bohVar.k();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            atomicLongArray.set(i9, ((Long) arrayList.get(i9)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        bojVar.b();
        int length = atomicLongArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            this.f21568a.write(bojVar, Long.valueOf(atomicLongArray.get(i9)));
        }
        bojVar.d();
    }
}
