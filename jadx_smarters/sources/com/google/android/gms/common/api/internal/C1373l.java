package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C1371k;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1373l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f26664a = Collections.newSetFromMap(new WeakHashMap());

    public static C1371k a(Object obj, Looper looper, String str) {
        com.google.android.gms.common.internal.r.n(obj, "Listener must not be null");
        com.google.android.gms.common.internal.r.n(looper, "Looper must not be null");
        com.google.android.gms.common.internal.r.n(str, "Listener type must not be null");
        return new C1371k(looper, obj, str);
    }

    public static C1371k.a b(Object obj, String str) {
        com.google.android.gms.common.internal.r.n(obj, "Listener must not be null");
        com.google.android.gms.common.internal.r.n(str, "Listener type must not be null");
        com.google.android.gms.common.internal.r.h(str, "Listener type must not be empty");
        return new C1371k.a(obj, str);
    }

    public final void c() {
        Iterator it = this.f26664a.iterator();
        while (it.hasNext()) {
            ((C1371k) it.next()).a();
        }
        this.f26664a.clear();
    }
}
