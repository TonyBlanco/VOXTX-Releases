package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class brf extends brh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f22152a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private brf() {
    }

    public /* synthetic */ brf(byte[] bArr) {
    }

    public static List a(Object obj, long j9) {
        return (List) btf.h(obj, j9);
    }

    private static List g(Object obj, long j9, int i9) {
        List list;
        List listA = a(obj, j9);
        if (listA.isEmpty()) {
            List brdVar = listA instanceof bre ? new brd(i9) : ((listA instanceof brz) && (listA instanceof bqt)) ? ((bqt) listA).d(i9) : new ArrayList(i9);
            btf.w(obj, j9, brdVar);
            return brdVar;
        }
        if (f22152a.isAssignableFrom(listA.getClass())) {
            ArrayList arrayList = new ArrayList(listA.size() + i9);
            arrayList.addAll(listA);
            list = arrayList;
        } else {
            if (!(listA instanceof bta)) {
                if (!(listA instanceof brz) || !(listA instanceof bqt)) {
                    return listA;
                }
                bqt bqtVar = (bqt) listA;
                if (bqtVar.c()) {
                    return listA;
                }
                bqt bqtVarD = bqtVar.d(listA.size() + i9);
                btf.w(obj, j9, bqtVarD);
                return bqtVarD;
            }
            brd brdVar2 = new brd(listA.size() + i9);
            brdVar2.addAll((bta) listA);
            list = brdVar2;
        }
        btf.w(obj, j9, list);
        return list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brh
    public final List b(Object obj, long j9) {
        return g(obj, j9, 10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brh
    public final void c(Object obj, long j9) {
        Object objUnmodifiableList;
        List list = (List) btf.h(obj, j9);
        if (list instanceof bre) {
            objUnmodifiableList = ((bre) list).e();
        } else {
            if (f22152a.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof brz) && (list instanceof bqt)) {
                bqt bqtVar = (bqt) list;
                if (bqtVar.c()) {
                    bqtVar.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        btf.w(obj, j9, objUnmodifiableList);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brh
    public final void d(Object obj, Object obj2, long j9) {
        List listA = a(obj2, j9);
        List listG = g(obj, j9, listA.size());
        int size = listG.size();
        int size2 = listA.size();
        if (size > 0 && size2 > 0) {
            listG.addAll(listA);
        }
        if (size > 0) {
            listA = listG;
        }
        btf.w(obj, j9, listA);
    }
}
