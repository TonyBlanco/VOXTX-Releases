package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vp implements Comparator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f24876i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vp f24875h = new vp(7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vp f24874g = new vp(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vp f24873f = new vp(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ vp f24872e = new vp(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ vp f24871d = new vp(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ vp f24870c = new vp(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vp f24869b = new vp(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ vp f24868a = new vp(0);

    private /* synthetic */ vp(int i9) {
        this.f24876i = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24876i) {
            case 0:
                return ((vr) Collections.max((List) obj)).compareTo((vr) Collections.max((List) obj2));
            case 1:
                return ((C1333s) obj2).f24463h - ((C1333s) obj).f24463h;
            case 2:
                List list = (List) obj;
                List list2 = (List) obj2;
                aut autVarJ = aut.j();
                vp vpVar = f24874g;
                aut autVarB = autVarJ.c((wc) Collections.max(list, vpVar), (wc) Collections.max(list2, vpVar), vpVar).b(list.size(), list2.size());
                vp vpVar2 = f24875h;
                return autVarB.c((wc) Collections.max(list, vpVar2), (wc) Collections.max(list2, vpVar2), vpVar2).a();
            case 3:
                return ((vz) ((List) obj).get(0)).compareTo((vz) ((List) obj2).get(0));
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int i9 = wd.f24959a;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                int i10 = wd.f24959a;
                return 0;
            case 6:
                return wc.d((wc) obj, (wc) obj2);
            default:
                return wc.a((wc) obj, (wc) obj2);
        }
    }
}
