package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class axr extends axq implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final avo f20892c;

    public axr() {
    }

    public axr(int i9, int i10) {
        this();
        atp.m(i10, i9);
        this.f20890a = i9;
        this.f20891b = i10;
    }

    public axr(avo avoVar, int i9) {
        this(avoVar.size(), i9);
        this.f20892c = avoVar;
    }

    public final Object a(int i9) {
        return this.f20892c.get(i9);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20891b < this.f20890a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20891b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i9 = this.f20891b;
        this.f20891b = i9 + 1;
        return a(i9);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20891b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i9 = this.f20891b - 1;
        this.f20891b = i9;
        return a(i9);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20891b - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
