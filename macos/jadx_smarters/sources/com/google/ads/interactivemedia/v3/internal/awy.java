package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class awy implements Comparator {
    public static awy b(Comparator comparator) {
        return comparator instanceof awy ? (awy) comparator : new auq(comparator);
    }

    public static awy c() {
        return awx.f20860a;
    }

    public awy a() {
        return new axi(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public final awy d(ati atiVar) {
        return new auo(atiVar, this);
    }

    public final List e(Iterable iterable) {
        Object[] objArrA = axo.A(iterable);
        Arrays.sort(objArrA, this);
        List listAsList = Arrays.asList(objArrA);
        atp.k(listAsList);
        return listAsList instanceof Collection ? new ArrayList(listAsList) : axo.t(listAsList.iterator());
    }
}
