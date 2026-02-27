package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bnm implements bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f21750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bkl f21751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21752c;

    public bnm(Class cls, bkl bklVar, int i9) {
        this.f21752c = i9;
        this.f21750a = cls;
        this.f21751b = bklVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        if (this.f21752c != 0) {
            if (bofVar.c() == this.f21750a) {
                return this.f21751b;
            }
            return null;
        }
        Class<?> clsC = bofVar.c();
        if (this.f21750a.isAssignableFrom(clsC)) {
            return new bnl(this, clsC);
        }
        return null;
    }

    public final String toString() {
        String name;
        String string;
        StringBuilder sb;
        String str;
        if (this.f21752c != 0) {
            name = this.f21750a.getName();
            string = this.f21751b.toString();
            sb = new StringBuilder();
            str = "Factory[type=";
        } else {
            name = this.f21750a.getName();
            string = this.f21751b.toString();
            sb = new StringBuilder();
            str = "Factory[typeHierarchy=";
        }
        sb.append(str);
        sb.append(name);
        sb.append(",adapter=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
