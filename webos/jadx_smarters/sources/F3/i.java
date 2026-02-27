package F3;

import android.net.Uri;
import d4.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1981d;

    public i(String str, long j9, long j10) {
        this.f1980c = str == null ? "" : str;
        this.f1978a = j9;
        this.f1979b = j10;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j9 = this.f1979b;
            if (j9 != -1) {
                long j10 = this.f1978a;
                if (j10 + j9 == iVar.f1978a) {
                    long j11 = iVar.f1979b;
                    return new i(strC, j10, j11 != -1 ? j9 + j11 : -1L);
                }
            }
            long j12 = iVar.f1979b;
            if (j12 != -1) {
                long j13 = iVar.f1978a;
                if (j13 + j12 == this.f1978a) {
                    return new i(strC, j13, j9 != -1 ? j12 + j9 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return b0.e(str, this.f1980c);
    }

    public String c(String str) {
        return b0.d(str, this.f1980c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1978a == iVar.f1978a && this.f1979b == iVar.f1979b && this.f1980c.equals(iVar.f1980c);
    }

    public int hashCode() {
        if (this.f1981d == 0) {
            this.f1981d = ((((527 + ((int) this.f1978a)) * 31) + ((int) this.f1979b)) * 31) + this.f1980c.hashCode();
        }
        return this.f1981d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f1980c + ", start=" + this.f1978a + ", length=" + this.f1979b + ")";
    }
}
