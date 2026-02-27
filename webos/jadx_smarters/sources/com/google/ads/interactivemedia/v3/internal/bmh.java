package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bmh implements bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f21704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21705b;

    public bmh(bkj bkjVar, int i9) {
        this.f21705b = i9;
        this.f21704a = bkjVar;
    }

    public bmh(bmg bmgVar, int i9) {
        this.f21705b = i9;
        this.f21704a = bmgVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.bkj, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        if (this.f21705b != 0) {
            if (bofVar.c() == Number.class) {
                return (bkl) this.f21704a;
            }
            return null;
        }
        if (bofVar.c() == Object.class) {
            return new bmi(bjtVar, this.f21704a);
        }
        return null;
    }
}
