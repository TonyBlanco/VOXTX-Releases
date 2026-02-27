package b4;

import O2.AbstractC0928w0;
import android.net.Uri;
import d4.AbstractC1684a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;

/* JADX INFO: renamed from: b4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1227s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f17602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f17608k;

    /* JADX INFO: renamed from: b4.s$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f17609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f17612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f17613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f17614f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f17615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f17616h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17617i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f17618j;

        public b() {
            this.f17611c = 1;
            this.f17613e = Collections.emptyMap();
            this.f17615g = -1L;
        }

        public b(C1227s c1227s) {
            this.f17609a = c1227s.f17598a;
            this.f17610b = c1227s.f17599b;
            this.f17611c = c1227s.f17600c;
            this.f17612d = c1227s.f17601d;
            this.f17613e = c1227s.f17602e;
            this.f17614f = c1227s.f17604g;
            this.f17615g = c1227s.f17605h;
            this.f17616h = c1227s.f17606i;
            this.f17617i = c1227s.f17607j;
            this.f17618j = c1227s.f17608k;
        }

        public C1227s a() {
            AbstractC1684a.j(this.f17609a, "The uri must be set.");
            return new C1227s(this.f17609a, this.f17610b, this.f17611c, this.f17612d, this.f17613e, this.f17614f, this.f17615g, this.f17616h, this.f17617i, this.f17618j);
        }

        public b b(int i9) {
            this.f17617i = i9;
            return this;
        }

        public b c(byte[] bArr) {
            this.f17612d = bArr;
            return this;
        }

        public b d(int i9) {
            this.f17611c = i9;
            return this;
        }

        public b e(Map map) {
            this.f17613e = map;
            return this;
        }

        public b f(String str) {
            this.f17616h = str;
            return this;
        }

        public b g(long j9) {
            this.f17615g = j9;
            return this;
        }

        public b h(long j9) {
            this.f17614f = j9;
            return this;
        }

        public b i(Uri uri) {
            this.f17609a = uri;
            return this;
        }

        public b j(String str) {
            this.f17609a = Uri.parse(str);
            return this;
        }

        public b k(long j9) {
            this.f17610b = j9;
            return this;
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.datasource");
    }

    public C1227s(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C1227s(Uri uri, long j9, int i9, byte[] bArr, Map map, long j10, long j11, String str, int i10, Object obj) {
        byte[] bArr2 = bArr;
        long j12 = j9 + j10;
        AbstractC1684a.a(j12 >= 0);
        AbstractC1684a.a(j10 >= 0);
        AbstractC1684a.a(j11 > 0 || j11 == -1);
        this.f17598a = uri;
        this.f17599b = j9;
        this.f17600c = i9;
        this.f17601d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f17602e = Collections.unmodifiableMap(new HashMap(map));
        this.f17604g = j10;
        this.f17603f = j12;
        this.f17605h = j11;
        this.f17606i = str;
        this.f17607j = i10;
        this.f17608k = obj;
    }

    public C1227s(Uri uri, long j9, long j10) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j9, j10, null, 0, null);
    }

    public static String c(int i9) {
        if (i9 == 1) {
            return HttpGet.METHOD_NAME;
        }
        if (i9 == 2) {
            return "POST";
        }
        if (i9 == 3) {
            return HttpHead.METHOD_NAME;
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f17600c);
    }

    public boolean d(int i9) {
        return (this.f17607j & i9) == i9;
    }

    public C1227s e(long j9) {
        long j10 = this.f17605h;
        return f(j9, j10 != -1 ? j10 - j9 : -1L);
    }

    public C1227s f(long j9, long j10) {
        return (j9 == 0 && this.f17605h == j10) ? this : new C1227s(this.f17598a, this.f17599b, this.f17600c, this.f17601d, this.f17602e, this.f17604g + j9, j10, this.f17606i, this.f17607j, this.f17608k);
    }

    public C1227s g(Uri uri) {
        return new C1227s(uri, this.f17599b, this.f17600c, this.f17601d, this.f17602e, this.f17604g, this.f17605h, this.f17606i, this.f17607j, this.f17608k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f17598a + ", " + this.f17604g + ", " + this.f17605h + ", " + this.f17606i + ", " + this.f17607j + "]";
    }
}
