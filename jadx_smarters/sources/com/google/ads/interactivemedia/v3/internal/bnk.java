package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bnk implements bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f21744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f21745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bkl f21746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f21747d;

    public bnk(Class cls, Class cls2, bkl bklVar, int i9) {
        this.f21747d = i9;
        this.f21744a = cls;
        this.f21745b = cls2;
        this.f21746c = bklVar;
    }

    public bnk(Class cls, Class cls2, bkl bklVar, int i9, byte[] bArr) {
        this.f21747d = i9;
        this.f21745b = cls;
        this.f21744a = cls2;
        this.f21746c = bklVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        if (this.f21747d != 0) {
            Class clsC = bofVar.c();
            if (clsC == this.f21745b || clsC == this.f21744a) {
                return this.f21746c;
            }
            return null;
        }
        Class clsC2 = bofVar.c();
        if (clsC2 == this.f21744a || clsC2 == this.f21745b) {
            return this.f21746c;
        }
        return null;
    }

    public final String toString() {
        String name;
        String name2;
        String string;
        StringBuilder sb;
        if (this.f21747d != 0) {
            name = this.f21744a.getName();
            name2 = this.f21745b.getName();
            string = this.f21746c.toString();
            sb = new StringBuilder();
        } else {
            name = this.f21744a.getName();
            name2 = this.f21745b.getName();
            string = this.f21746c.toString();
            sb = new StringBuilder();
        }
        sb.append("Factory[type=");
        sb.append(name);
        sb.append("+");
        sb.append(name2);
        sb.append(",adapter=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
