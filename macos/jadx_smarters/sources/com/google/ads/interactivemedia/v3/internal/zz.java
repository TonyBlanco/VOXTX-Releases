package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aac f25321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aac f25322b;

    public zz(aac aacVar, aac aacVar2) {
        this.f25321a = aacVar;
        this.f25322b = aacVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zz.class == obj.getClass()) {
            zz zzVar = (zz) obj;
            if (this.f25321a.equals(zzVar.f25321a) && this.f25322b.equals(zzVar.f25322b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25321a.hashCode() * 31) + this.f25322b.hashCode();
    }

    public final String toString() {
        return "[" + String.valueOf(this.f25321a) + (this.f25321a.equals(this.f25322b) ? "" : ", ".concat(String.valueOf(this.f25322b))) + "]";
    }
}
