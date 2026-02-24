package D2;

import D2.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f1326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1327b;

    public static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable f1328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f1329b;

        @Override // D2.f.a
        public f a() {
            String str = "";
            if (this.f1328a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f1328a, this.f1329b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // D2.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f1328a = iterable;
            return this;
        }

        @Override // D2.f.a
        public f.a c(byte[] bArr) {
            this.f1329b = bArr;
            return this;
        }
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f1326a = iterable;
        this.f1327b = bArr;
    }

    @Override // D2.f
    public Iterable b() {
        return this.f1326a;
    }

    @Override // D2.f
    public byte[] c() {
        return this.f1327b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f1326a.equals(fVar.b())) {
            if (Arrays.equals(this.f1327b, fVar instanceof a ? ((a) fVar).f1327b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1326a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1327b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f1326a + ", extras=" + Arrays.toString(this.f1327b) + "}";
    }
}
