package com.google.ads.interactivemedia.v3.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class bsa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bsa f22197a = new bsa();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap f22199c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bsj f22198b = new brl();

    private bsa() {
    }

    public static bsa a() {
        return f22197a;
    }

    public final bsi b(Class cls) {
        bqu.j(cls, "messageType");
        bsi bsiVarA = (bsi) this.f22199c.get(cls);
        if (bsiVarA == null) {
            bsiVarA = this.f22198b.a(cls);
            bqu.j(cls, "messageType");
            bqu.j(bsiVarA, "schema");
            bsi bsiVar = (bsi) this.f22199c.putIfAbsent(cls, bsiVarA);
            if (bsiVar != null) {
                return bsiVar;
            }
        }
        return bsiVarA;
    }

    public final bsi c(Object obj) {
        return b(obj.getClass());
    }
}
