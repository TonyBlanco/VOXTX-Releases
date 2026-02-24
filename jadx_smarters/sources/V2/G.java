package V2;

import P2.v0;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface G {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f9876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9878c;

        public a(byte[] bArr, String str, int i9) {
            this.f9876a = bArr;
            this.f9877b = str;
            this.f9878c = i9;
        }

        public byte[] a() {
            return this.f9876a;
        }

        public String b() {
            return this.f9877b;
        }
    }

    public interface b {
        void a(G g9, byte[] bArr, int i9, int i10, byte[] bArr2);
    }

    public interface c {
        G a(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f9879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9880b;

        public d(byte[] bArr, String str) {
            this.f9879a = bArr;
            this.f9880b = str;
        }

        public byte[] a() {
            return this.f9879a;
        }

        public String b() {
            return this.f9880b;
        }
    }

    Map a(byte[] bArr);

    d b();

    byte[] c();

    void d(b bVar);

    void e(byte[] bArr, v0 v0Var);

    void f(byte[] bArr, byte[] bArr2);

    void g(byte[] bArr);

    int h();

    CryptoConfig i(byte[] bArr);

    boolean j(byte[] bArr, String str);

    void k(byte[] bArr);

    byte[] l(byte[] bArr, byte[] bArr2);

    a m(byte[] bArr, List list, int i9, HashMap map);

    void release();
}
