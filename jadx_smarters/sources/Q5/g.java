package Q5;

import Q5.B;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends B.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8224b;

    public static final class b extends B.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f8226b;

        @Override // Q5.B.d.b.a
        public B.d.b a() {
            String str = "";
            if (this.f8225a == null) {
                str = " filename";
            }
            if (this.f8226b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new g(this.f8225a, this.f8226b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q5.B.d.b.a
        public B.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f8226b = bArr;
            return this;
        }

        @Override // Q5.B.d.b.a
        public B.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f8225a = str;
            return this;
        }
    }

    public g(String str, byte[] bArr) {
        this.f8223a = str;
        this.f8224b = bArr;
    }

    @Override // Q5.B.d.b
    public byte[] b() {
        return this.f8224b;
    }

    @Override // Q5.B.d.b
    public String c() {
        return this.f8223a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.d.b)) {
            return false;
        }
        B.d.b bVar = (B.d.b) obj;
        if (this.f8223a.equals(bVar.c())) {
            if (Arrays.equals(this.f8224b, bVar instanceof g ? ((g) bVar).f8224b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8223a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8224b);
    }

    public String toString() {
        return "File{filename=" + this.f8223a + ", contents=" + Arrays.toString(this.f8224b) + "}";
    }
}
