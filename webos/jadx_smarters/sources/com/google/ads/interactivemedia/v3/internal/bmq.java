package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
final class bmq extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        bohVar.i();
        while (bohVar.p()) {
            try {
                arrayList.add(Integer.valueOf(bohVar.b()));
            } catch (NumberFormatException e9) {
                throw new bkf(e9);
            }
        }
        bohVar.k();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            atomicIntegerArray.set(i9, ((Integer) arrayList.get(i9)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        bojVar.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i9 = 0; i9 < length; i9++) {
            bojVar.i(r6.get(i9));
        }
        bojVar.d();
    }
}
