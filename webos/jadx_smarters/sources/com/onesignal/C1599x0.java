package com.onesignal;

import com.onesignal.C1589u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.onesignal.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1599x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f38956a;

    public C1599x0() {
        HashMap map = new HashMap();
        this.f38956a = map;
        map.put(C1589u.d.class.getName(), new C1589u.d());
        map.put(C1589u.b.class.getName(), new C1589u.b());
    }

    public final C1589u.c a() {
        return (C1589u.c) this.f38956a.get(C1589u.b.class.getName());
    }

    public C1589u.c b() {
        C1589u.c cVarA = a();
        Iterator it = cVarA.j().iterator();
        while (it.hasNext()) {
            if (((P7.a) it.next()).d().isAttributed()) {
                return cVarA;
            }
        }
        return d();
    }

    public C1589u.c c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((P7.a) it.next()).d().isAttributed()) {
                return a();
            }
        }
        return d();
    }

    public final C1589u.c d() {
        return (C1589u.c) this.f38956a.get(C1589u.d.class.getName());
    }
}
