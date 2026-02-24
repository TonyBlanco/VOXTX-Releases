package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bjw extends bjy implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f21592a = new ArrayList();

    public final void a(bjy bjyVar) {
        this.f21592a.add(bjyVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bjw) && ((bjw) obj).f21592a.equals(this.f21592a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f21592a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f21592a.iterator();
    }
}
