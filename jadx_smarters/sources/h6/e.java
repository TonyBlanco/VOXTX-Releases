package H6;

import org.apache.http.HttpStatus;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import x6.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e[] f2733h = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f2739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2740g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2742b;

        public b(int i9, int i10) {
            this.f2741a = i9;
            this.f2742b = i10;
        }

        public int a() {
            return this.f2741a;
        }

        public int b() {
            return this.f2742b;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f2744b;

        public c(int i9, b bVar) {
            this.f2743a = i9;
            this.f2744b = new b[]{bVar};
        }

        public c(int i9, b bVar, b bVar2) {
            this.f2743a = i9;
            this.f2744b = new b[]{bVar, bVar2};
        }

        public b[] a() {
            return this.f2744b;
        }

        public int b() {
            return this.f2743a;
        }
    }

    public e(int i9, int i10, int i11, int i12, int i13, c cVar) {
        this.f2734a = i9;
        this.f2735b = i10;
        this.f2736c = i11;
        this.f2737d = i12;
        this.f2738e = i13;
        this.f2739f = cVar;
        int iB = cVar.b();
        int iA = 0;
        for (b bVar : cVar.a()) {
            iA += bVar.a() * (bVar.b() + iB);
        }
        this.f2740g = iA;
    }

    public static e[] a() {
        int i9 = 1;
        int i10 = 5;
        e eVar = new e(1, 10, 10, 8, 8, new c(i10, new b(i9, 3)));
        int i11 = 12;
        e eVar2 = new e(2, 12, 12, 10, 10, new c(7, new b(i9, i10)));
        e eVar3 = new e(3, 14, 14, 12, 12, new c(10, new b(i9, 8)));
        e eVar4 = new e(4, 16, 16, 14, 14, new c(i11, new b(i9, i11)));
        int i12 = 18;
        e eVar5 = new e(5, 18, 18, 16, 16, new c(14, new b(i9, i12)));
        e eVar6 = new e(6, 20, 20, 18, 18, new c(i12, new b(i9, 22)));
        e eVar7 = new e(7, 22, 22, 20, 20, new c(20, new b(i9, 30)));
        int i13 = 36;
        e eVar8 = new e(8, 24, 24, 22, 22, new c(24, new b(i9, i13)));
        e eVar9 = new e(9, 26, 26, 24, 24, new c(28, new b(i9, 44)));
        e eVar10 = new e(10, 32, 32, 14, 14, new c(i13, new b(i9, 62)));
        e eVar11 = new e(11, 36, 36, 16, 16, new c(42, new b(i9, 86)));
        e eVar12 = new e(12, 40, 40, 18, 18, new c(48, new b(i9, 114)));
        e eVar13 = new e(13, 44, 44, 20, 20, new c(56, new b(i9, IjkMediaMeta.FF_PROFILE_H264_HIGH_444)));
        e eVar14 = new e(14, 48, 48, 22, 22, new c(68, new b(i9, 174)));
        int i14 = 2;
        e eVar15 = new e(15, 52, 52, 24, 24, new c(42, new b(i14, HttpStatus.SC_PROCESSING)));
        e eVar16 = new e(16, 64, 64, 14, 14, new c(56, new b(i14, 140)));
        int i15 = 4;
        e eVar17 = new e(17, 72, 72, 16, 16, new c(36, new b(i15, 92)));
        e eVar18 = new e(18, 80, 80, 18, 18, new c(48, new b(i15, 114)));
        e eVar19 = new e(19, 88, 88, 20, 20, new c(56, new b(i15, IjkMediaMeta.FF_PROFILE_H264_HIGH_444)));
        e eVar20 = new e(20, 96, 96, 22, 22, new c(68, new b(i15, 174)));
        int i16 = 6;
        return new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, new e(21, 104, 104, 24, 24, new c(56, new b(i16, 136))), new e(22, 120, 120, 18, 18, new c(68, new b(i16, 175))), new e(23, 132, 132, 20, 20, new c(62, new b(8, 163))), new e(24, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 22, 22, new c(62, new b(8, 156), new b(2, 155))), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static e h(int i9, int i10) throws g {
        if ((i9 & 1) != 0 || (i10 & 1) != 0) {
            throw g.a();
        }
        for (e eVar : f2733h) {
            if (eVar.f2735b == i9 && eVar.f2736c == i10) {
                return eVar;
            }
        }
        throw g.a();
    }

    public int b() {
        return this.f2738e;
    }

    public int c() {
        return this.f2737d;
    }

    public c d() {
        return this.f2739f;
    }

    public int e() {
        return this.f2736c;
    }

    public int f() {
        return this.f2735b;
    }

    public int g() {
        return this.f2740g;
    }

    public int i() {
        return this.f2734a;
    }

    public String toString() {
        return String.valueOf(this.f2734a);
    }
}
