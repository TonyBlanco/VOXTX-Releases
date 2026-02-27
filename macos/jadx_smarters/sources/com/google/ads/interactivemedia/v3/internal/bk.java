package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bk f21593a = new bk(avo.o());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final avo f21594b;

    public bk(List list) {
        this.f21594b = avo.m(list);
    }

    public final avo a() {
        return this.f21594b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(int i9) {
        for (int i10 = 0; i10 < this.f21594b.size(); i10++) {
            bj bjVar = (bj) this.f21594b.get(i10);
            if (bjVar.c() && bjVar.a() == i9) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bk.class != obj.getClass()) {
            return false;
        }
        return this.f21594b.equals(((bk) obj).f21594b);
    }

    public final int hashCode() {
        return this.f21594b.hashCode();
    }
}
