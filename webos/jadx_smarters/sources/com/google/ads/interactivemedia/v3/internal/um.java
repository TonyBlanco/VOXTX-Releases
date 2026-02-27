package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final um f24748a = new um(new bf[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final avo f24750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24751d;

    /* JADX WARN: Multi-variable type inference failed */
    public um(bf... bfVarArr) {
        this.f24750c = avo.n(bfVarArr);
        this.f24749b = bfVarArr.length;
        int i9 = 0;
        while (i9 < this.f24750c.size()) {
            int i10 = i9 + 1;
            for (int i11 = i10; i11 < this.f24750c.size(); i11++) {
                if (((bf) this.f24750c.get(i9)).equals(this.f24750c.get(i11))) {
                    cd.c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i9 = i10;
        }
    }

    public final int a(bf bfVar) {
        int iIndexOf = this.f24750c.indexOf(bfVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bf b(int i9) {
        return (bf) this.f24750c.get(i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && um.class == obj.getClass()) {
            um umVar = (um) obj;
            if (this.f24749b == umVar.f24749b && this.f24750c.equals(umVar.f24750c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f24751d;
        if (i9 != 0) {
            return i9;
        }
        int iHashCode = this.f24750c.hashCode();
        this.f24751d = iHashCode;
        return iHashCode;
    }
}
