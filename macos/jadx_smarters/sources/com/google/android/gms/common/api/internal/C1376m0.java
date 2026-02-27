package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.AbstractC1418q;
import w4.C2916d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1376m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1353b f26669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2916d f26670b;

    public /* synthetic */ C1376m0(C1353b c1353b, C2916d c2916d, AbstractC1374l0 abstractC1374l0) {
        this.f26669a = c1353b;
        this.f26670b = c2916d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1376m0)) {
            C1376m0 c1376m0 = (C1376m0) obj;
            if (AbstractC1418q.b(this.f26669a, c1376m0.f26669a) && AbstractC1418q.b(this.f26670b, c1376m0.f26670b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1418q.c(this.f26669a, this.f26670b);
    }

    public final String toString() {
        return AbstractC1418q.d(this).a("key", this.f26669a).a("feature", this.f26670b).toString();
    }
}
