package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class atn implements Serializable, atm {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20688a;

    @Override // com.google.ads.interactivemedia.v3.internal.atm
    public final boolean a(Object obj) {
        for (int i9 = 0; i9 < this.f20688a.size(); i9++) {
            if (!((atm) this.f20688a.get(i9)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atn) {
            return this.f20688a.equals(((atn) obj).f20688a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20688a.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f20688a;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and");
        sb.append('(');
        boolean z9 = true;
        for (Object obj : list) {
            if (!z9) {
                sb.append(',');
            }
            sb.append(obj);
            z9 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
