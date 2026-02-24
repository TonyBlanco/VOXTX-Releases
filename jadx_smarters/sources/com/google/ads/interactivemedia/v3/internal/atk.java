package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class atk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final atj f20686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private atj f20687c;

    public /* synthetic */ atk(String str) {
        atj atjVar = new atj(null);
        this.f20686b = atjVar;
        this.f20687c = atjVar;
        atp.k(str);
        this.f20685a = str;
    }

    public final atk a(Object obj) {
        atj atjVar = new atj(null);
        this.f20687c.f20684b = atjVar;
        this.f20687c = atjVar;
        atjVar.f20683a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f20685a);
        sb.append('{');
        atj atjVar = this.f20686b.f20684b;
        String str = "";
        while (atjVar != null) {
            Object obj = atjVar.f20683a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            atjVar = atjVar.f20684b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
