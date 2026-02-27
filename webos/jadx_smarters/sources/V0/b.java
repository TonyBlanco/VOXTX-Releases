package V0;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9841d;

    public b(boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f9838a = z9;
        this.f9839b = z10;
        this.f9840c = z11;
        this.f9841d = z12;
    }

    public boolean a() {
        return this.f9838a;
    }

    public boolean b() {
        return this.f9840c;
    }

    public boolean c() {
        return this.f9841d;
    }

    public boolean d() {
        return this.f9839b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9838a == bVar.f9838a && this.f9839b == bVar.f9839b && this.f9840c == bVar.f9840c && this.f9841d == bVar.f9841d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f9838a;
        int i9 = r02;
        if (this.f9839b) {
            i9 = r02 + 16;
        }
        int i10 = i9;
        if (this.f9840c) {
            i10 = i9 + JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        return this.f9841d ? i10 + 4096 : i10;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f9838a), Boolean.valueOf(this.f9839b), Boolean.valueOf(this.f9840c), Boolean.valueOf(this.f9841d));
    }
}
