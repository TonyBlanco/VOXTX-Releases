package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class avr implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20824b;

    public avr(avs avsVar) {
        Object[] objArr = new Object[avsVar.size()];
        Object[] objArr2 = new Object[avsVar.size()];
        axq axqVarListIterator = avsVar.entrySet().listIterator();
        int i9 = 0;
        while (axqVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) axqVarListIterator.next();
            objArr[i9] = entry.getKey();
            objArr2[i9] = entry.getValue();
            i9++;
        }
        this.f20823a = objArr;
        this.f20824b = objArr2;
    }

    public avq a(int i9) {
        return new avq(i9);
    }

    public final Object readResolve() {
        Object obj = this.f20823a;
        if (obj instanceof avx) {
            avx avxVar = (avx) obj;
            avi aviVar = (avi) this.f20824b;
            avq avqVarA = a(avxVar.size());
            axq axqVarListIterator = avxVar.listIterator();
            axq axqVarListIterator2 = aviVar.listIterator();
            while (axqVarListIterator.hasNext()) {
                avqVarA.a(axqVarListIterator.next(), axqVarListIterator2.next());
            }
            return avqVarA.b();
        }
        Object[] objArr = (Object[]) obj;
        Object[] objArr2 = (Object[]) this.f20824b;
        avq avqVarA2 = a(objArr.length);
        for (int i9 = 0; i9 < objArr.length; i9++) {
            avqVarA2.a(objArr[i9], objArr2[i9]);
        }
        return avqVarA2.b();
    }
}
