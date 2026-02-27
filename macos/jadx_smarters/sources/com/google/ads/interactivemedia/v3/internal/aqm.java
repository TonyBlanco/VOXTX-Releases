package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class aqm implements aqt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aqn f20515a;

    public aqm(aqn aqnVar) {
        this.f20515a = aqnVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqt
    public final Boolean a(String str, boolean z9) {
        try {
            return Boolean.valueOf(this.f20515a.f20520e.getBoolean(str, z9));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f20515a.f20520e.getString(str, String.valueOf(z9)));
        }
    }
}
