package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class auh extends auf implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ aui f20755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auh(aui auiVar) {
        super(auiVar);
        this.f20755d = auiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auh(aui auiVar, int i9) {
        super(auiVar, auiVar.d().listIterator(i9));
        this.f20755d = auiVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.f20747a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f20755d.isEmpty();
        b().add(obj);
        auj.q(this.f20755d.f20756f);
        if (zIsEmpty) {
            this.f20755d.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }
}
