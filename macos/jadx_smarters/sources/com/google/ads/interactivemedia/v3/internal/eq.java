package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class eq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1333s f22823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1333s f22824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22826e;

    public eq(String str, C1333s c1333s, C1333s c1333s2, int i9, int i10) {
        boolean z9 = true;
        if (i9 != 0) {
            if (i10 == 0) {
                i10 = 0;
            } else {
                z9 = false;
            }
        }
        af.u(z9);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f22822a = str;
        af.s(c1333s);
        this.f22823b = c1333s;
        af.s(c1333s2);
        this.f22824c = c1333s2;
        this.f22825d = i9;
        this.f22826e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eq.class == obj.getClass()) {
            eq eqVar = (eq) obj;
            if (this.f22825d == eqVar.f22825d && this.f22826e == eqVar.f22826e && this.f22822a.equals(eqVar.f22822a) && this.f22823b.equals(eqVar.f22823b) && this.f22824c.equals(eqVar.f22824c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f22825d + 527) * 31) + this.f22826e) * 31) + this.f22822a.hashCode()) * 31) + this.f22823b.hashCode()) * 31) + this.f22824c.hashCode();
    }
}
