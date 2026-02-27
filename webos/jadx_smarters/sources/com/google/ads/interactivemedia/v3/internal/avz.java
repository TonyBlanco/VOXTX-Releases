package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class avz extends avq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Object[] f20833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Object[] f20834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Comparator f20835f;

    public avz(Comparator comparator) {
        atp.k(comparator);
        this.f20835f = comparator;
        this.f20833d = new Object[4];
        this.f20834e = new Object[4];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avq
    public final /* bridge */ /* synthetic */ avq a(Object obj, Object obj2) {
        int i9 = this.f20821b + 1;
        int length = this.f20833d.length;
        if (i9 > length) {
            int iE = avh.e(length, i9);
            this.f20833d = Arrays.copyOf(this.f20833d, iE);
            this.f20834e = Arrays.copyOf(this.f20834e, iE);
        }
        axo.I(obj, obj2);
        Object[] objArr = this.f20833d;
        int i10 = this.f20821b;
        objArr[i10] = obj;
        this.f20834e[i10] = obj2;
        this.f20821b = i10 + 1;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avq
    public final /* bridge */ /* synthetic */ avs b() {
        int i9 = this.f20821b;
        if (i9 == 0) {
            return awb.l(this.f20835f);
        }
        if (i9 == 1) {
            Comparator comparator = this.f20835f;
            Object obj = this.f20833d[0];
            obj.getClass();
            Object obj2 = this.f20834e[0];
            obj2.getClass();
            avo avoVarP = avo.p(obj);
            atp.k(comparator);
            return new awb(new axg(avoVarP, comparator), avo.p(obj2));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f20833d, i9);
        Arrays.sort(objArrCopyOf, this.f20835f);
        Object[] objArr = new Object[this.f20821b];
        for (int i10 = 0; i10 < this.f20821b; i10++) {
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (this.f20835f.compare(objArrCopyOf[i11], objArrCopyOf[i10]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i11] + " and " + objArrCopyOf[i10]);
                }
            }
            Object obj3 = this.f20833d[i10];
            obj3.getClass();
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.f20835f);
            Object obj4 = this.f20834e[i10];
            obj4.getClass();
            objArr[iBinarySearch] = obj4;
        }
        return new awb(new axg(avo.k(objArrCopyOf), this.f20835f), avo.k(objArr));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avq
    public final /* synthetic */ void c(Map.Entry entry) {
        super.c(entry);
    }
}
