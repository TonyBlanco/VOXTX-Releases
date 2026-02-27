package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
final class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24438c;

    public rq(String str, boolean z9, boolean z10) {
        this.f24436a = str;
        this.f24437b = z9;
        this.f24438c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == rq.class) {
            rq rqVar = (rq) obj;
            if (TextUtils.equals(this.f24436a, rqVar.f24436a) && this.f24437b == rqVar.f24437b && this.f24438c == rqVar.f24438c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f24436a.hashCode() + 31) * 31) + (true != this.f24437b ? 1237 : 1231)) * 31) + (true != this.f24438c ? 1237 : 1231);
    }
}
