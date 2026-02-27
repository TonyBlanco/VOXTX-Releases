package C2;

import java.util.Arrays;
import z2.C3014b;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3014b f1012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1013b;

    public h(C3014b c3014b, byte[] bArr) {
        if (c3014b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f1012a = c3014b;
        this.f1013b = bArr;
    }

    public byte[] a() {
        return this.f1013b;
    }

    public C3014b b() {
        return this.f1012a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f1012a.equals(hVar.f1012a)) {
            return Arrays.equals(this.f1013b, hVar.f1013b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1012a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1013b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f1012a + ", bytes=[...]}";
    }
}
