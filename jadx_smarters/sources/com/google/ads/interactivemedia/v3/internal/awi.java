package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class awi implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final awi f20849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ awi[] f20850b;

    static {
        awi awiVar = new awi();
        f20849a = awiVar;
        f20850b = new awi[]{awiVar};
    }

    private awi() {
    }

    public static awi[] values() {
        return (awi[]) f20850b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        axo.J(false);
    }
}
