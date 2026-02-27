package Q3;

import P3.b;
import P3.i;
import P3.n;
import P3.o;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
import org.apache.http.message.TokenParser;
import org.apache.http.util.LangUtils;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7930k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f7933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f7934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f7939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f7940u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f7943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f7924y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f7925z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f7918A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f7919B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, HttpStatus.SC_PROCESSING, 103, 104, 105, 106, 107, 108, 109, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, IjkMediaMeta.FF_PROFILE_H264_HIGH_422, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f7920C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 251};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f7921D = {193, HttpStatus.SC_CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, HttpStatus.SC_ACCEPTED, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 235, HttpStatus.SC_PARTIAL_CONTENT, HttpStatus.SC_MULTI_STATUS, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f7922E = {195, 227, HttpStatus.SC_RESET_CONTENT, HttpStatus.SC_NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final boolean[] f7923F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M f7926g = new M();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f7931l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0090a f7932m = new C0090a(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7941v = 0;

    /* JADX INFO: renamed from: Q3.a$a, reason: collision with other inner class name */
    public static final class C0090a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7944a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f7945b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StringBuilder f7946c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7951h;

        /* JADX INFO: renamed from: Q3.a$a$a, reason: collision with other inner class name */
        public static class C0091a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f7952a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f7953b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f7954c;

            public C0091a(int i9, boolean z9, int i10) {
                this.f7952a = i9;
                this.f7953b = z9;
                this.f7954c = i10;
            }
        }

        public C0090a(int i9, int i10) {
            j(i9);
            this.f7951h = i10;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11) {
            if (i11 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i9, i10, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i9, int i10) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i9, int i10) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, 33);
        }

        public void e(char c9) {
            if (this.f7946c.length() < 32) {
                this.f7946c.append(c9);
            }
        }

        public void f() {
            int length = this.f7946c.length();
            if (length > 0) {
                this.f7946c.delete(length - 1, length);
                for (int size = this.f7944a.size() - 1; size >= 0; size--) {
                    C0091a c0091a = (C0091a) this.f7944a.get(size);
                    int i9 = c0091a.f7954c;
                    if (i9 != length) {
                        return;
                    }
                    c0091a.f7954c = i9 - 1;
                }
            }
        }

        public P3.b g(int i9) {
            float f9;
            int i10 = this.f7948e + this.f7949f;
            int i11 = 32 - i10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f7945b.size(); i12++) {
                spannableStringBuilder.append(k0.v1((CharSequence) this.f7945b.get(i12), i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(k0.v1(h(), i11));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i11 - spannableStringBuilder.length();
            int i13 = i10 - length;
            if (i9 == Integer.MIN_VALUE) {
                i9 = (this.f7950g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f7950g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i9 != 1) {
                if (i9 == 2) {
                    i10 = 32 - length;
                }
                f9 = ((i10 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f9 = 0.5f;
            }
            int i14 = this.f7947d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f7950g == 1) {
                i14 -= this.f7951h - 1;
            }
            return new b.C0083b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f9).l(i9).a();
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7946c);
            int length = spannableStringBuilder.length();
            int i9 = 0;
            int i10 = -1;
            int i11 = -1;
            int i12 = 0;
            int i13 = -1;
            int i14 = -1;
            boolean z9 = false;
            while (i9 < this.f7944a.size()) {
                C0091a c0091a = (C0091a) this.f7944a.get(i9);
                boolean z10 = c0091a.f7953b;
                int i15 = c0091a.f7952a;
                if (i15 != 8) {
                    boolean z11 = i15 == 7;
                    if (i15 != 7) {
                        i14 = a.f7918A[i15];
                    }
                    z9 = z11;
                }
                int i16 = c0091a.f7954c;
                i9++;
                if (i16 != (i9 < this.f7944a.size() ? ((C0091a) this.f7944a.get(i9)).f7954c : length)) {
                    if (i10 != -1 && !z10) {
                        q(spannableStringBuilder, i10, i16);
                        i10 = -1;
                    } else if (i10 == -1 && z10) {
                        i10 = i16;
                    }
                    if (i11 != -1 && !z9) {
                        o(spannableStringBuilder, i11, i16);
                        i11 = -1;
                    } else if (i11 == -1 && z9) {
                        i11 = i16;
                    }
                    if (i14 != i13) {
                        n(spannableStringBuilder, i12, i16, i13);
                        i13 = i14;
                        i12 = i16;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i12 != length) {
                n(spannableStringBuilder, i12, length, i13);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f7944a.isEmpty() && this.f7945b.isEmpty() && this.f7946c.length() == 0;
        }

        public void j(int i9) {
            this.f7950g = i9;
            this.f7944a.clear();
            this.f7945b.clear();
            this.f7946c.setLength(0);
            this.f7947d = 15;
            this.f7948e = 0;
            this.f7949f = 0;
        }

        public void k() {
            this.f7945b.add(h());
            this.f7946c.setLength(0);
            this.f7944a.clear();
            int iMin = Math.min(this.f7951h, this.f7947d);
            while (this.f7945b.size() >= iMin) {
                this.f7945b.remove(0);
            }
        }

        public void l(int i9) {
            this.f7950g = i9;
        }

        public void m(int i9) {
            this.f7951h = i9;
        }

        public void p(int i9, boolean z9) {
            this.f7944a.add(new C0091a(i9, z9, this.f7946c.length()));
        }
    }

    public a(String str, int i9, long j9) {
        this.f7930k = j9 > 0 ? j9 * 1000 : -9223372036854775807L;
        this.f7927h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i9 == 1) {
            this.f7929j = 0;
            this.f7928i = 0;
        } else if (i9 != 2) {
            if (i9 == 3) {
                this.f7929j = 0;
            } else if (i9 != 4) {
                AbstractC1681B.j("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                this.f7929j = 0;
                this.f7928i = 0;
            } else {
                this.f7929j = 1;
            }
            this.f7928i = 1;
        } else {
            this.f7929j = 1;
            this.f7928i = 0;
        }
        M(0);
        L();
        this.f7942w = true;
        this.f7943x = -9223372036854775807L;
    }

    public static boolean A(byte b9, byte b10) {
        return (b9 & 246) == 18 && (b10 & 224) == 32;
    }

    public static boolean B(byte b9, byte b10) {
        return (b9 & 247) == 17 && (b10 & 240) == 32;
    }

    public static boolean C(byte b9, byte b10) {
        return (b9 & 246) == 20 && (b10 & 240) == 32;
    }

    public static boolean D(byte b9, byte b10) {
        return (b9 & 240) == 16 && (b10 & 192) == 64;
    }

    public static boolean E(byte b9) {
        return (b9 & 240) == 16;
    }

    public static boolean G(byte b9) {
        return (b9 & 246) == 20;
    }

    public static boolean H(byte b9, byte b10) {
        return (b9 & 247) == 17 && (b10 & 240) == 48;
    }

    public static boolean I(byte b9, byte b10) {
        return (b9 & 247) == 23 && b10 >= 33 && b10 <= 35;
    }

    public static boolean J(byte b9) {
        return 1 <= b9 && b9 <= 15;
    }

    public static char p(byte b9) {
        return (char) f7919B[(b9 & 127) - 32];
    }

    public static int q(byte b9) {
        return (b9 >> 3) & 1;
    }

    public static char s(byte b9) {
        return (char) f7921D[b9 & 31];
    }

    public static char t(byte b9) {
        return (char) f7922E[b9 & 31];
    }

    public static char u(byte b9, byte b10) {
        return (b9 & 1) == 0 ? s(b10) : t(b10);
    }

    public static char v(byte b9) {
        return (char) f7920C[b9 & 15];
    }

    public static boolean z(byte b9) {
        return (b9 & 224) == 0;
    }

    public final boolean F(boolean z9, byte b9, byte b10) {
        if (!z9 || !E(b9)) {
            this.f7938s = false;
        } else {
            if (this.f7938s && this.f7939t == b9 && this.f7940u == b10) {
                this.f7938s = false;
                return true;
            }
            this.f7938s = true;
            this.f7939t = b9;
            this.f7940u = b10;
        }
        return false;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void K(byte r3, byte r4) {
        /*
            r2 = this;
            boolean r0 = J(r3)
            r1 = 0
            if (r0 == 0) goto La
        L7:
            r2.f7942w = r1
            goto L22
        La:
            boolean r3 = G(r3)
            if (r3 == 0) goto L22
            r3 = 32
            if (r4 == r3) goto L1f
            r3 = 47
            if (r4 == r3) goto L1f
            switch(r4) {
                case 37: goto L1f;
                case 38: goto L1f;
                case 39: goto L1f;
                default: goto L1b;
            }
        L1b:
            switch(r4) {
                case 41: goto L1f;
                case 42: goto L7;
                case 43: goto L7;
                default: goto L1e;
            }
        L1e:
            goto L22
        L1f:
            r3 = 1
            r2.f7942w = r3
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.a.K(byte, byte):void");
    }

    public final void L() {
        this.f7932m.j(this.f7935p);
        this.f7931l.clear();
        this.f7931l.add(this.f7932m);
    }

    public final void M(int i9) {
        int i10 = this.f7935p;
        if (i10 == i9) {
            return;
        }
        this.f7935p = i9;
        if (i9 == 3) {
            for (int i11 = 0; i11 < this.f7931l.size(); i11++) {
                ((C0090a) this.f7931l.get(i11)).l(i9);
            }
            return;
        }
        L();
        if (i10 == 3 || i9 == 1 || i9 == 0) {
            this.f7933n = Collections.emptyList();
        }
    }

    public final void N(int i9) {
        this.f7936q = i9;
        this.f7932m.m(i9);
    }

    public final boolean O() {
        return (this.f7930k == -9223372036854775807L || this.f7943x == -9223372036854775807L || j() - this.f7943x < this.f7930k) ? false : true;
    }

    public final boolean P(byte b9) {
        if (z(b9)) {
            this.f7941v = q(b9);
        }
        return this.f7941v == this.f7929j;
    }

    @Override // Q3.e, P3.j
    public /* bridge */ /* synthetic */ void a(long j9) {
        super.a(j9);
    }

    @Override // Q3.e
    public i e() {
        List list = this.f7933n;
        this.f7934o = list;
        return new f((List) AbstractC1684a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // Q3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(P3.n r10) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.a.f(P3.n):void");
    }

    @Override // Q3.e, U2.d
    public void flush() {
        super.flush();
        this.f7933n = null;
        this.f7934o = null;
        M(0);
        N(4);
        L();
        this.f7937r = false;
        this.f7938s = false;
        this.f7939t = (byte) 0;
        this.f7940u = (byte) 0;
        this.f7941v = 0;
        this.f7942w = true;
        this.f7943x = -9223372036854775807L;
    }

    @Override // Q3.e
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ n d() {
        return super.d();
    }

    @Override // U2.d
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // Q3.e, U2.d
    /* JADX INFO: renamed from: h */
    public o b() {
        o oVarI;
        o oVarB = super.b();
        if (oVarB != null) {
            return oVarB;
        }
        if (!O() || (oVarI = i()) == null) {
            return null;
        }
        this.f7933n = Collections.emptyList();
        this.f7943x = -9223372036854775807L;
        oVarI.d(j(), e(), Long.MAX_VALUE);
        return oVarI;
    }

    @Override // Q3.e
    public boolean k() {
        return this.f7933n != this.f7934o;
    }

    @Override // Q3.e
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void c(n nVar) {
        super.c(nVar);
    }

    public final List r() {
        int size = this.f7931l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i9 = 0; i9 < size; i9++) {
            P3.b bVarG = ((C0090a) this.f7931l.get(i9)).g(Integer.MIN_VALUE);
            arrayList.add(bVarG);
            if (bVarG != null) {
                iMin = Math.min(iMin, bVarG.f7200j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            P3.b bVar = (P3.b) arrayList.get(i10);
            if (bVar != null) {
                if (bVar.f7200j != iMin) {
                    bVar = (P3.b) AbstractC1684a.e(((C0090a) this.f7931l.get(i10)).g(iMin));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    @Override // Q3.e, U2.d
    public void release() {
    }

    public final void w(byte b9) {
        this.f7932m.e(TokenParser.SP);
        this.f7932m.p((b9 >> 1) & 7, (b9 & 1) == 1);
    }

    public final void x(byte b9) {
        if (b9 == 32) {
            M(2);
            return;
        }
        if (b9 == 41) {
            M(3);
            return;
        }
        switch (b9) {
            case LangUtils.HASH_OFFSET /* 37 */:
                M(1);
                N(2);
                break;
            case 38:
                M(1);
                N(3);
                break;
            case 39:
                M(1);
                N(4);
                break;
            default:
                int i9 = this.f7935p;
                if (i9 != 0) {
                    if (b9 == 33) {
                        this.f7932m.f();
                    } else {
                        switch (b9) {
                            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                this.f7933n = Collections.emptyList();
                                int i10 = this.f7935p;
                                if (i10 != 1 && i10 != 3) {
                                }
                                break;
                            case 45:
                                if (i9 == 1 && !this.f7932m.i()) {
                                    this.f7932m.k();
                                    break;
                                }
                                break;
                            case 47:
                                this.f7933n = r();
                                break;
                        }
                        L();
                    }
                    break;
                }
                break;
        }
    }

    public final void y(byte b9, byte b10) {
        int i9 = f7924y[b9 & 7];
        if ((b10 & 32) != 0) {
            i9++;
        }
        if (i9 != this.f7932m.f7947d) {
            if (this.f7935p != 1 && !this.f7932m.i()) {
                C0090a c0090a = new C0090a(this.f7935p, this.f7936q);
                this.f7932m = c0090a;
                this.f7931l.add(c0090a);
            }
            this.f7932m.f7947d = i9;
        }
        boolean z9 = (b10 & 16) == 16;
        boolean z10 = (b10 & 1) == 1;
        int i10 = (b10 >> 1) & 7;
        this.f7932m.p(z9 ? 8 : i10, z10);
        if (z9) {
            this.f7932m.f7948e = f7925z[i10];
        }
    }
}
