package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class blh implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    bli f21645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    bli f21646b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f21647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ blj f21648d;

    public blh(blj bljVar) {
        this.f21648d = bljVar;
        this.f21645a = bljVar.f21662d.f21652d;
        this.f21647c = bljVar.f21661c;
    }

    public final bli a() {
        bli bliVar = this.f21645a;
        blj bljVar = this.f21648d;
        if (bliVar == bljVar.f21662d) {
            throw new NoSuchElementException();
        }
        if (bljVar.f21661c != this.f21647c) {
            throw new ConcurrentModificationException();
        }
        this.f21645a = bliVar.f21652d;
        this.f21646b = bliVar;
        return bliVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21645a != this.f21648d.f21662d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        bli bliVar = this.f21646b;
        if (bliVar == null) {
            throw new IllegalStateException();
        }
        this.f21648d.e(bliVar, true);
        this.f21646b = null;
        this.f21647c = this.f21648d.f21661c;
    }
}
