package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f22601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bv f22602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final by f22603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f22604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f22605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f22606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22607g;

    public ca(Looper looper, bn bnVar, by byVar) {
        this(new CopyOnWriteArraySet(), looper, bnVar, byVar);
    }

    private ca(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, bn bnVar, by byVar) {
        this.f22601a = bnVar;
        this.f22604d = copyOnWriteArraySet;
        this.f22603c = byVar;
        this.f22605e = new ArrayDeque();
        this.f22606f = new ArrayDeque();
        this.f22602b = bnVar.b(looper, new sk(this, 1));
    }

    public static /* synthetic */ void h(ca caVar) {
        Iterator it = caVar.f22604d.iterator();
        while (it.hasNext()) {
            ((bz) it.next()).b(caVar.f22603c);
            if (caVar.f22602b.c()) {
                return;
            }
        }
    }

    public final ca a(Looper looper, by byVar) {
        return new ca(this.f22604d, looper, this.f22601a, byVar);
    }

    public final void b(Object obj) {
        if (this.f22607g) {
            return;
        }
        af.s(obj);
        this.f22604d.add(new bz(obj));
    }

    public final void c() {
        if (this.f22606f.isEmpty()) {
            return;
        }
        if (!this.f22602b.c()) {
            bv bvVar = this.f22602b;
            bvVar.j(bvVar.a(0));
        }
        boolean zIsEmpty = this.f22605e.isEmpty();
        this.f22605e.addAll(this.f22606f);
        this.f22606f.clear();
        if (!zIsEmpty) {
            return;
        }
        while (!this.f22605e.isEmpty()) {
            ((Runnable) this.f22605e.peekFirst()).run();
            this.f22605e.removeFirst();
        }
    }

    public final void d(int i9, bx bxVar) {
        this.f22606f.add(new bw(new CopyOnWriteArraySet(this.f22604d), i9, bxVar, 0));
    }

    public final void e() {
        Iterator it = this.f22604d.iterator();
        while (it.hasNext()) {
            ((bz) it.next()).c(this.f22603c);
        }
        this.f22604d.clear();
        this.f22607g = true;
    }

    public final void f(Object obj) {
        for (bz bzVar : this.f22604d) {
            if (bzVar.f22597a.equals(obj)) {
                bzVar.c(this.f22603c);
                this.f22604d.remove(bzVar);
            }
        }
    }

    public final void g(int i9, bx bxVar) {
        d(i9, bxVar);
        c();
    }
}
