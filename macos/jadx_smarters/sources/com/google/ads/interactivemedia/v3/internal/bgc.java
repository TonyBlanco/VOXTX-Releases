package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bfx f21234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f21235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f21236c;

    public /* synthetic */ bgc(bfx bfxVar, List list, Integer num) {
        this.f21234a = bfxVar;
        this.f21235b = list;
        this.f21236c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bgc)) {
            return false;
        }
        bgc bgcVar = (bgc) obj;
        if (this.f21234a.equals(bgcVar.f21234a) && this.f21235b.equals(bgcVar.f21235b)) {
            Integer num = this.f21236c;
            Integer num2 = bgcVar.f21236c;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21234a, this.f21235b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f21234a, this.f21235b, this.f21236c);
    }
}
