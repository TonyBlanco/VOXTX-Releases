package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class avq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f20820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f20821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    avp f20822c;

    public avq() {
        this(4);
    }

    public avq(int i9) {
        this.f20820a = new Object[i9 + i9];
        this.f20821b = 0;
    }

    private final void e(int i9) {
        int i10 = i9 + i9;
        Object[] objArr = this.f20820a;
        int length = objArr.length;
        if (i10 > length) {
            this.f20820a = Arrays.copyOf(objArr, avh.e(length, i10));
        }
    }

    public avq a(Object obj, Object obj2) {
        e(this.f20821b + 1);
        axo.I(obj, obj2);
        Object[] objArr = this.f20820a;
        int i9 = this.f20821b;
        int i10 = i9 + i9;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.f20821b = i9 + 1;
        return this;
    }

    public avs b() {
        avp avpVar = this.f20822c;
        if (avpVar != null) {
            throw avpVar.a();
        }
        axe axeVarK = axe.k(this.f20821b, this.f20820a, this);
        avp avpVar2 = this.f20822c;
        if (avpVar2 == null) {
            return axeVarK;
        }
        throw avpVar2.a();
    }

    public void c(Map.Entry entry) {
        a(entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            e(this.f20821b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c((Map.Entry) it.next());
        }
    }
}
