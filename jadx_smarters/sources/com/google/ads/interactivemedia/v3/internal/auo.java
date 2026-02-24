package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class auo extends awy implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ati f20763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final awy f20764b;

    public auo(ati atiVar, awy awyVar) {
        atp.k(atiVar);
        this.f20763a = atiVar;
        this.f20764b = awyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awy, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f20764b.compare(this.f20763a.a(obj), this.f20763a.a(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auo) {
            auo auoVar = (auo) obj;
            if (this.f20763a.equals(auoVar.f20763a) && this.f20764b.equals(auoVar.f20764b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20763a, this.f20764b});
    }

    public final String toString() {
        return this.f20764b + ".onResultOf(" + this.f20763a + ")";
    }
}
