package O2;

import O2.InterfaceC0901n;
import O2.InterfaceC0920t1;
import Q2.C1019e;
import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import d4.C1701s;
import e4.C1737C;
import java.util.ArrayList;
import java.util.List;
import q3.C2540a;

/* JADX INFO: renamed from: O2.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0920t1 {

    /* JADX INFO: renamed from: O2.t1$b */
    public static final class b implements InterfaceC0901n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f6235c = new a().e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f6236d = d4.k0.A0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InterfaceC0901n.a f6237e = new InterfaceC0901n.a() { // from class: O2.u1
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return InterfaceC0920t1.b.d(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1701s f6238a;

        /* JADX INFO: renamed from: O2.t1$b$a */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int[] f6239b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C1701s.b f6240a = new C1701s.b();

            public a a(int i9) {
                this.f6240a.a(i9);
                return this;
            }

            public a b(b bVar) {
                this.f6240a.b(bVar.f6238a);
                return this;
            }

            public a c(int... iArr) {
                this.f6240a.c(iArr);
                return this;
            }

            public a d(int i9, boolean z9) {
                this.f6240a.d(i9, z9);
                return this;
            }

            public b e() {
                return new b(this.f6240a.e());
            }
        }

        public b(C1701s c1701s) {
            this.f6238a = c1701s;
        }

        public static b d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f6236d);
            if (integerArrayList == null) {
                return f6235c;
            }
            a aVar = new a();
            for (int i9 = 0; i9 < integerArrayList.size(); i9++) {
                aVar.a(integerArrayList.get(i9).intValue());
            }
            return aVar.e();
        }

        public boolean c(int i9) {
            return this.f6238a.a(i9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f6238a.equals(((b) obj).f6238a);
            }
            return false;
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i9 = 0; i9 < this.f6238a.d(); i9++) {
                arrayList.add(Integer.valueOf(this.f6238a.c(i9)));
            }
            bundle.putIntegerArrayList(f6236d, arrayList);
            return bundle;
        }

        public int hashCode() {
            return this.f6238a.hashCode();
        }
    }

    /* JADX INFO: renamed from: O2.t1$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1701s f6241a;

        public c(C1701s c1701s) {
            this.f6241a = c1701s;
        }

        public boolean a(int i9) {
            return this.f6241a.a(i9);
        }

        public boolean b(int... iArr) {
            return this.f6241a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f6241a.equals(((c) obj).f6241a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6241a.hashCode();
        }
    }

    /* JADX INFO: renamed from: O2.t1$d */
    public interface d {
        void A(C1019e c1019e);

        void B(boolean z9);

        void E(int i9);

        void J(boolean z9);

        void M(int i9, boolean z9);

        void O(b bVar);

        void P();

        void S(e eVar, e eVar2, int i9);

        void U(int i9, int i10);

        void V(Q1 q12, int i9);

        void W(C0909p1 c0909p1);

        void Y(Z3.z zVar);

        void a(boolean z9);

        void a0(C0921u c0921u);

        void b0(int i9);

        void d0(boolean z9);

        void e(C2540a c2540a);

        void f0(V1 v12);

        void g0(boolean z9, int i9);

        void h0(H0 h02, int i9);

        void i0(R0 r02);

        void j(C1737C c1737c);

        void j0(boolean z9, int i9);

        void k(List list);

        void l0(C0909p1 c0909p1);

        void m0(InterfaceC0920t1 interfaceC0920t1, c cVar);

        void n0(boolean z9);

        void onRepeatModeChanged(int i9);

        void t(C0917s1 c0917s1);

        void u(P3.f fVar);

        void z(int i9);
    }

    /* JADX INFO: renamed from: O2.t1$e */
    public static final class e implements InterfaceC0901n {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f6242l = d4.k0.A0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f6243m = d4.k0.A0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f6244n = d4.k0.A0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f6245o = d4.k0.A0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f6246p = d4.k0.A0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f6247q = d4.k0.A0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f6248r = d4.k0.A0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final InterfaceC0901n.a f6249s = new InterfaceC0901n.a() { // from class: O2.w1
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return InterfaceC0920t1.e.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6250a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final H0 f6253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f6254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f6255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f6256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f6257i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f6258j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f6259k;

        public e(Object obj, int i9, H0 h02, Object obj2, int i10, long j9, long j10, int i11, int i12) {
            this.f6250a = obj;
            this.f6251c = i9;
            this.f6252d = i9;
            this.f6253e = h02;
            this.f6254f = obj2;
            this.f6255g = i10;
            this.f6256h = j9;
            this.f6257i = j10;
            this.f6258j = i11;
            this.f6259k = i12;
        }

        public static e b(Bundle bundle) {
            int i9 = bundle.getInt(f6242l, 0);
            Bundle bundle2 = bundle.getBundle(f6243m);
            return new e(null, i9, bundle2 == null ? null : (H0) H0.f5526q.a(bundle2), null, bundle.getInt(f6244n, 0), bundle.getLong(f6245o, 0L), bundle.getLong(f6246p, 0L), bundle.getInt(f6247q, -1), bundle.getInt(f6248r, -1));
        }

        public Bundle c(boolean z9, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt(f6242l, z10 ? this.f6252d : 0);
            H0 h02 = this.f6253e;
            if (h02 != null && z9) {
                bundle.putBundle(f6243m, h02.h());
            }
            bundle.putInt(f6244n, z10 ? this.f6255g : 0);
            bundle.putLong(f6245o, z9 ? this.f6256h : 0L);
            bundle.putLong(f6246p, z9 ? this.f6257i : 0L);
            bundle.putInt(f6247q, z9 ? this.f6258j : -1);
            bundle.putInt(f6248r, z9 ? this.f6259k : -1);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f6252d == eVar.f6252d && this.f6255g == eVar.f6255g && this.f6256h == eVar.f6256h && this.f6257i == eVar.f6257i && this.f6258j == eVar.f6258j && this.f6259k == eVar.f6259k && r5.j.a(this.f6250a, eVar.f6250a) && r5.j.a(this.f6254f, eVar.f6254f) && r5.j.a(this.f6253e, eVar.f6253e);
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            return c(true, true);
        }

        public int hashCode() {
            return r5.j.b(this.f6250a, Integer.valueOf(this.f6252d), this.f6253e, this.f6254f, Integer.valueOf(this.f6255g), Long.valueOf(this.f6256h), Long.valueOf(this.f6257i), Integer.valueOf(this.f6258j), Integer.valueOf(this.f6259k));
        }
    }

    void A(TextureView textureView);

    void B(d dVar);

    void C(int i9, long j9);

    b D();

    boolean E();

    void F(boolean z9);

    H0 G(int i9);

    long H();

    long I();

    int J();

    void K(TextureView textureView);

    C1737C L();

    boolean M();

    int N();

    long P();

    long R();

    void T(int i9, List list);

    long U();

    boolean V();

    int X();

    void Y(SurfaceView surfaceView);

    boolean Z();

    long a0();

    void b(C0917s1 c0917s1);

    void b0();

    C0917s1 c();

    boolean d();

    void d0();

    long e();

    R0 e0();

    H0 f();

    long f0();

    void g();

    boolean g0();

    long getCurrentPosition();

    long getDuration();

    int getPlaybackState();

    int getRepeatMode();

    float getVolume();

    void h(List list, boolean z9);

    void i(Z3.z zVar);

    boolean isPlaying();

    void j(SurfaceView surfaceView);

    int k();

    void l(d dVar);

    void m();

    C0909p1 n();

    void o(boolean z9);

    V1 p();

    void pause();

    void play();

    void prepare();

    boolean q();

    P3.f r();

    void release();

    int s();

    void seekTo(long j9);

    void setRepeatMode(int i9);

    boolean t(int i9);

    boolean u();

    int v();

    Q1 w();

    Looper x();

    Z3.z y();

    void z();
}
