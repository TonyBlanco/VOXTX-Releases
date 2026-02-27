package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class agz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final agz f19748a = new agz();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f19749b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f19750c = new ArrayList();

    private agz() {
    }

    public static agz a() {
        return f19748a;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.f19750c);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.f19749b);
    }

    public final void d(agt agtVar) {
        this.f19749b.add(agtVar);
    }

    public final void e(agt agtVar) {
        boolean zG = g();
        this.f19749b.remove(agtVar);
        this.f19750c.remove(agtVar);
        if (!zG || g()) {
            return;
        }
        ahe.b().f();
    }

    public final void f(agt agtVar) {
        boolean zG = g();
        this.f19750c.add(agtVar);
        if (zG) {
            return;
        }
        ahe.b().e();
    }

    public final boolean g() {
        return this.f19750c.size() > 0;
    }
}
