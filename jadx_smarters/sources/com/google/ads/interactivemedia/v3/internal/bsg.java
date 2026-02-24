package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class bsg implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f22211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boy f22212b;

    public /* synthetic */ bsg(bpb bpbVar) {
        boy boyVarB;
        if (bpbVar instanceof bsh) {
            bsh bshVar = (bsh) bpbVar;
            ArrayDeque arrayDeque = new ArrayDeque(bshVar.f());
            this.f22211a = arrayDeque;
            arrayDeque.push(bshVar);
            boyVarB = b(bshVar.f22215d);
        } else {
            this.f22211a = null;
            boyVarB = (boy) bpbVar;
        }
        this.f22212b = boyVarB;
    }

    private final boy b(bpb bpbVar) {
        while (bpbVar instanceof bsh) {
            bsh bshVar = (bsh) bpbVar;
            this.f22211a.push(bshVar);
            bpbVar = bshVar.f22215d;
        }
        return (boy) bpbVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boy next() {
        boy boyVarB;
        boy boyVar = this.f22212b;
        if (boyVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f22211a;
            boyVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            boyVarB = b(((bsh) this.f22211a.pop()).f22216e);
        } while (boyVarB.A());
        this.f22212b = boyVarB;
        return boyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22212b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
