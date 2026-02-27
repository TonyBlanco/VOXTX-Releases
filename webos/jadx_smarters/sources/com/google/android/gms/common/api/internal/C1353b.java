package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC1418q;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1353b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f26582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.d f26583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26584d;

    public C1353b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f26582b = aVar;
        this.f26583c = dVar;
        this.f26584d = str;
        this.f26581a = AbstractC1418q.c(aVar, dVar, str);
    }

    public static C1353b a(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        return new C1353b(aVar, dVar, str);
    }

    public final String b() {
        return this.f26582b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1353b)) {
            return false;
        }
        C1353b c1353b = (C1353b) obj;
        return AbstractC1418q.b(this.f26582b, c1353b.f26582b) && AbstractC1418q.b(this.f26583c, c1353b.f26583c) && AbstractC1418q.b(this.f26584d, c1353b.f26584d);
    }

    public final int hashCode() {
        return this.f26581a;
    }
}
