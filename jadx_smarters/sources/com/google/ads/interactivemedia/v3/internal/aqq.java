package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20554c = 1;

    public aqq(String str, Object obj, int i9) {
        this.f20552a = str;
        this.f20553b = obj;
    }

    public static aqq a(String str, boolean z9) {
        return new aqq(str, Boolean.valueOf(z9), 1);
    }

    public final Object b() {
        aqt aqtVarA = aqv.a();
        if (aqtVarA != null) {
            return aqtVarA.a(this.f20552a, ((Boolean) this.f20553b).booleanValue());
        }
        if (aqv.b() != null) {
            aqv.b().a();
        }
        return this.f20553b;
    }
}
