package C2;

import C2.p;
import java.util.Arrays;
import z2.EnumC3016d;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC3016d f994c;

    public static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EnumC3016d f997c;

        @Override // C2.p.a
        public p a() {
            String str = "";
            if (this.f995a == null) {
                str = " backendName";
            }
            if (this.f997c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f995a, this.f996b, this.f997c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C2.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f995a = str;
            return this;
        }

        @Override // C2.p.a
        public p.a c(byte[] bArr) {
            this.f996b = bArr;
            return this;
        }

        @Override // C2.p.a
        public p.a d(EnumC3016d enumC3016d) {
            if (enumC3016d == null) {
                throw new NullPointerException("Null priority");
            }
            this.f997c = enumC3016d;
            return this;
        }
    }

    public d(String str, byte[] bArr, EnumC3016d enumC3016d) {
        this.f992a = str;
        this.f993b = bArr;
        this.f994c = enumC3016d;
    }

    @Override // C2.p
    public String b() {
        return this.f992a;
    }

    @Override // C2.p
    public byte[] c() {
        return this.f993b;
    }

    @Override // C2.p
    public EnumC3016d d() {
        return this.f994c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f992a.equals(pVar.b())) {
            if (Arrays.equals(this.f993b, pVar instanceof d ? ((d) pVar).f993b : pVar.c()) && this.f994c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f992a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f993b)) * 1000003) ^ this.f994c.hashCode();
    }
}
