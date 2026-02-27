package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class avd implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ave f20784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20786c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20788e;

    public avd(ave aveVar) {
        this.f20784a = aveVar;
        this.f20785b = aveVar.f20789b.f20798i;
        avf avfVar = aveVar.f20789b;
        this.f20787d = avfVar.f20793d;
        this.f20788e = avfVar.f20792c;
    }

    private final void a() {
        if (this.f20784a.f20789b.f20793d != this.f20787d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f20785b != -2 && this.f20788e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = this.f20784a.a(this.f20785b);
        this.f20786c = this.f20785b;
        this.f20785b = this.f20784a.f20789b.f20801l[this.f20785b];
        this.f20788e--;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        axo.J(this.f20786c != -1);
        avf avfVar = this.f20784a.f20789b;
        int i9 = this.f20786c;
        avfVar.j(i9, axo.F(avfVar.f20790a[i9]));
        int i10 = this.f20785b;
        avf avfVar2 = this.f20784a.f20789b;
        if (i10 == avfVar2.f20792c) {
            this.f20785b = this.f20786c;
        }
        this.f20786c = -1;
        this.f20787d = avfVar2.f20793d;
    }
}
