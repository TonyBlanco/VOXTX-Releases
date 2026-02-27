package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class awd extends avv {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator f20842d;

    public awd(Comparator comparator) {
        atp.k(comparator);
        this.f20842d = comparator;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avv, com.google.ads.interactivemedia.v3.internal.avg, com.google.ads.interactivemedia.v3.internal.avh
    public final /* synthetic */ void b(Object obj) {
        super.b(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avv
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ avv b(Object obj) {
        super.b(obj);
        return this;
    }

    public final awf h() {
        axg axgVar;
        Object[] objArrCopyOf = this.f20806a;
        Comparator comparator = this.f20842d;
        int i9 = this.f20807b;
        if (i9 == 0) {
            axgVar = awf.w(comparator);
        } else {
            axo.l(objArrCopyOf, i9);
            Arrays.sort(objArrCopyOf, 0, i9, comparator);
            int i10 = 1;
            for (int i11 = 1; i11 < i9; i11++) {
                Object obj = objArrCopyOf[i11];
                if (comparator.compare(obj, objArrCopyOf[i10 - 1]) != 0) {
                    objArrCopyOf[i10] = obj;
                    i10++;
                }
            }
            Arrays.fill(objArrCopyOf, i10, i9, (Object) null);
            if (i10 < (objArrCopyOf.length >> 1)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            axgVar = new axg(avo.l(objArrCopyOf, i10), comparator);
        }
        this.f20807b = axgVar.size();
        this.f20808c = true;
        return axgVar;
    }

    public final void i(Object... objArr) {
        super.g(objArr);
    }
}
