package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ats extends axq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f20720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ atm f20721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f20722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20723d;

    public ats() {
        this.f20723d = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ats(Iterator it, atm atmVar) {
        this();
        this.f20720a = it;
        this.f20721b = atmVar;
    }

    public final Object a() {
        while (this.f20720a.hasNext()) {
            Object next = this.f20720a.next();
            if (this.f20721b.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }

    public final void b() {
        this.f20723d = 3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.f20723d;
        if (i9 == 4) {
            throw new IllegalStateException();
        }
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            this.f20723d = 4;
            this.f20722c = a();
            if (this.f20723d != 3) {
                this.f20723d = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20723d = 2;
        Object obj = this.f20722c;
        this.f20722c = null;
        return obj;
    }
}
