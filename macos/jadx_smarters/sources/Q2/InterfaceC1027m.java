package Q2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Q2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1027m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f7885a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: Q2.m$a */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f7886e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7890d;

        public a(int i9, int i10, int i11) {
            this.f7887a = i9;
            this.f7888b = i10;
            this.f7889c = i11;
            this.f7890d = d4.k0.D0(i11) ? d4.k0.j0(i11, i10) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7887a == aVar.f7887a && this.f7888b == aVar.f7888b && this.f7889c == aVar.f7889c;
        }

        public int hashCode() {
            return r5.j.b(Integer.valueOf(this.f7887a), Integer.valueOf(this.f7888b), Integer.valueOf(this.f7889c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f7887a + ", channelCount=" + this.f7888b + ", encoding=" + this.f7889c + ']';
        }
    }

    /* JADX INFO: renamed from: Q2.m$b */
    public static final class b extends Exception {
        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
        }
    }

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    boolean d();

    a e(a aVar);

    void flush();

    boolean isActive();

    void reset();
}
