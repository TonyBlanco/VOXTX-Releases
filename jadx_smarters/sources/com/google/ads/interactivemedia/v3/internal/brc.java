package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public class brc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile brs f22148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile bpb f22149b;

    static {
        int i9 = bqb.f22028b;
    }

    public final int a() {
        if (this.f22149b != null) {
            return this.f22149b.d();
        }
        if (this.f22148a != null) {
            return this.f22148a.ax();
        }
        return 0;
    }

    public final bpb b() {
        if (this.f22149b != null) {
            return this.f22149b;
        }
        synchronized (this) {
            try {
                if (this.f22149b != null) {
                    return this.f22149b;
                }
                this.f22149b = this.f22148a == null ? bpb.f21870b : this.f22148a.au();
                return this.f22149b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final brs c(brs brsVar) {
        if (this.f22148a == null) {
            synchronized (this) {
                if (this.f22148a == null) {
                    try {
                        this.f22148a = brsVar;
                        this.f22149b = bpb.f21870b;
                    } catch (bqw unused) {
                        this.f22148a = brsVar;
                        this.f22149b = bpb.f21870b;
                    }
                }
            }
        }
        return this.f22148a;
    }

    public final brs d(brs brsVar) {
        brs brsVar2 = this.f22148a;
        this.f22149b = null;
        this.f22148a = brsVar;
        return brsVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brc)) {
            return false;
        }
        brc brcVar = (brc) obj;
        brs brsVar = this.f22148a;
        brs brsVar2 = brcVar.f22148a;
        return (brsVar == null && brsVar2 == null) ? b().equals(brcVar.b()) : (brsVar == null || brsVar2 == null) ? brsVar != null ? brsVar.equals(brcVar.c(brsVar.ba())) : c(brsVar2.ba()).equals(brsVar2) : brsVar.equals(brsVar2);
    }

    public int hashCode() {
        return 1;
    }
}
