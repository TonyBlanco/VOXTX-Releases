package Q3;

import P3.b;
import P3.i;
import P3.n;
import P3.o;
import Q3.c;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.AbstractC1689f;
import d4.L;
import d4.M;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.Utf8;
import org.apache.http.message.TokenParser;
import org.chromium.net.UrlRequest;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M f7955g = new M();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L f7956h = new L();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7957i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b[] f7960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f7961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f7962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f7963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0092c f7964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7965q;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Comparator f7966c = new Comparator() { // from class: Q3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a.c((c.a) obj, (c.a) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P3.b f7967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7968b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11, boolean z9, int i12, int i13) {
            b.C0083b c0083bN = new b.C0083b().o(charSequence).p(alignment).h(f9, i9).i(i10).k(f10).l(i11).n(f11);
            if (z9) {
                c0083bN.s(i12);
            }
            this.f7967a = c0083bN.a();
            this.f7968b = i13;
        }

        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f7968b, aVar.f7968b);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int[] f7969A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int[] f7970B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final boolean[] f7971C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final int[] f7972D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int[] f7973E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final int[] f7974F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final int[] f7975G;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f7976w = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f7977x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f7978y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f7979z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7980a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f7981b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7986g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7987h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7988i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f7989j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f7990k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7991l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7992m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7993n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7994o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7995p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7996q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f7997r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7998s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7999t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f8000u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8001v;

        static {
            int iH = h(0, 0, 0, 0);
            f7977x = iH;
            int iH2 = h(0, 0, 0, 3);
            f7978y = iH2;
            f7979z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f7969A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f7970B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f7971C = new boolean[]{false, false, false, true, true, true, false};
            f7972D = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f7973E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f7974F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f7975G = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i9, int i10, int i11) {
            return h(i9, i10, i11, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                d4.AbstractC1684a.c(r4, r0, r1)
                d4.AbstractC1684a.c(r5, r0, r1)
                d4.AbstractC1684a.c(r6, r0, r1)
                d4.AbstractC1684a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L20
                r3 = 3
                if (r7 == r3) goto L1e
            L1b:
                r7 = 255(0xff, float:3.57E-43)
                goto L22
            L1e:
                r7 = 0
                goto L22
            L20:
                r7 = 127(0x7f, float:1.78E-43)
            L22:
                if (r4 <= r1) goto L27
                r4 = 255(0xff, float:3.57E-43)
                goto L28
            L27:
                r4 = 0
            L28:
                if (r5 <= r1) goto L2d
                r5 = 255(0xff, float:3.57E-43)
                goto L2e
            L2d:
                r5 = 0
            L2e:
                if (r6 <= r1) goto L32
                r0 = 255(0xff, float:3.57E-43)
            L32:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Q3.c.b.h(int, int, int, int):int");
        }

        public void a(char c9) {
            if (c9 != '\n') {
                this.f7981b.append(c9);
                return;
            }
            this.f7980a.add(d());
            this.f7981b.clear();
            if (this.f7995p != -1) {
                this.f7995p = 0;
            }
            if (this.f7996q != -1) {
                this.f7996q = 0;
            }
            if (this.f7997r != -1) {
                this.f7997r = 0;
            }
            if (this.f7999t != -1) {
                this.f7999t = 0;
            }
            while (true) {
                if ((!this.f7990k || this.f7980a.size() < this.f7989j) && this.f7980a.size() < 15) {
                    return;
                } else {
                    this.f7980a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f7981b.length();
            if (length > 0) {
                this.f7981b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f9;
            float f10;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i9 = 0; i9 < this.f7980a.size(); i9++) {
                spannableStringBuilder.append((CharSequence) this.f7980a.get(i9));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i10 = this.f7991l;
            if (i10 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f7991l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f7985f) {
                f9 = this.f7987h / 99.0f;
                f10 = this.f7986g / 99.0f;
            } else {
                f9 = this.f7987h / 209.0f;
                f10 = this.f7986g / 74.0f;
            }
            float f11 = (f9 * 0.9f) + 0.05f;
            float f12 = (f10 * 0.9f) + 0.05f;
            int i11 = this.f7988i;
            return new a(spannableStringBuilder, alignment2, f12, 0, i11 / 3 == 0 ? 0 : i11 / 3 == 1 ? 1 : 2, f11, i11 % 3 == 0 ? 0 : i11 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f7994o != f7977x, this.f7994o, this.f7984e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7981b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f7995p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f7995p, length, 33);
                }
                if (this.f7996q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7996q, length, 33);
                }
                if (this.f7997r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7998s), this.f7997r, length, 33);
                }
                if (this.f7999t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8000u), this.f7999t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f7980a.clear();
            this.f7981b.clear();
            this.f7995p = -1;
            this.f7996q = -1;
            this.f7997r = -1;
            this.f7999t = -1;
            this.f8001v = 0;
        }

        public void f(boolean z9, boolean z10, boolean z11, int i9, boolean z12, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f7982c = true;
            this.f7983d = z9;
            this.f7990k = z10;
            this.f7984e = i9;
            this.f7985f = z12;
            this.f7986g = i10;
            this.f7987h = i11;
            this.f7988i = i14;
            int i17 = i12 + 1;
            if (this.f7989j != i17) {
                this.f7989j = i17;
                while (true) {
                    if ((!z10 || this.f7980a.size() < this.f7989j) && this.f7980a.size() < 15) {
                        break;
                    } else {
                        this.f7980a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f7992m != i15) {
                this.f7992m = i15;
                int i18 = i15 - 1;
                q(f7972D[i18], f7978y, f7971C[i18], 0, f7969A[i18], f7970B[i18], f7979z[i18]);
            }
            if (i16 == 0 || this.f7993n == i16) {
                return;
            }
            this.f7993n = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, f7974F[i19], f7973E[i19]);
            n(f7976w, f7975G[i19], f7977x);
        }

        public boolean i() {
            return this.f7982c;
        }

        public boolean j() {
            return !i() || (this.f7980a.isEmpty() && this.f7981b.length() == 0);
        }

        public boolean k() {
            return this.f7983d;
        }

        public void l() {
            e();
            this.f7982c = false;
            this.f7983d = false;
            this.f7984e = 4;
            this.f7985f = false;
            this.f7986g = 0;
            this.f7987h = 0;
            this.f7988i = 0;
            this.f7989j = 15;
            this.f7990k = true;
            this.f7991l = 0;
            this.f7992m = 0;
            this.f7993n = 0;
            int i9 = f7977x;
            this.f7994o = i9;
            this.f7998s = f7976w;
            this.f8000u = i9;
        }

        public void m(int i9, int i10, int i11, boolean z9, boolean z10, int i12, int i13) {
            if (this.f7995p != -1) {
                if (!z9) {
                    this.f7981b.setSpan(new StyleSpan(2), this.f7995p, this.f7981b.length(), 33);
                    this.f7995p = -1;
                }
            } else if (z9) {
                this.f7995p = this.f7981b.length();
            }
            if (this.f7996q == -1) {
                if (z10) {
                    this.f7996q = this.f7981b.length();
                }
            } else {
                if (z10) {
                    return;
                }
                this.f7981b.setSpan(new UnderlineSpan(), this.f7996q, this.f7981b.length(), 33);
                this.f7996q = -1;
            }
        }

        public void n(int i9, int i10, int i11) {
            if (this.f7997r != -1 && this.f7998s != i9) {
                this.f7981b.setSpan(new ForegroundColorSpan(this.f7998s), this.f7997r, this.f7981b.length(), 33);
            }
            if (i9 != f7976w) {
                this.f7997r = this.f7981b.length();
                this.f7998s = i9;
            }
            if (this.f7999t != -1 && this.f8000u != i10) {
                this.f7981b.setSpan(new BackgroundColorSpan(this.f8000u), this.f7999t, this.f7981b.length(), 33);
            }
            if (i10 != f7977x) {
                this.f7999t = this.f7981b.length();
                this.f8000u = i10;
            }
        }

        public void o(int i9, int i10) {
            if (this.f8001v != i9) {
                a('\n');
            }
            this.f8001v = i9;
        }

        public void p(boolean z9) {
            this.f7983d = z9;
        }

        public void q(int i9, int i10, boolean z9, int i11, int i12, int i13, int i14) {
            this.f7994o = i9;
            this.f7991l = i14;
        }
    }

    /* JADX INFO: renamed from: Q3.c$c, reason: collision with other inner class name */
    public static final class C0092c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f8004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8005d = 0;

        public C0092c(int i9, int i10) {
            this.f8002a = i9;
            this.f8003b = i10;
            this.f8004c = new byte[(i10 * 2) - 1];
        }
    }

    public c(int i9, List list) {
        this.f7959k = i9 == -1 ? 1 : i9;
        this.f7958j = list != null && AbstractC1689f.i(list);
        this.f7960l = new b[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f7960l[i10] = new b();
        }
        this.f7961m = this.f7960l[0];
    }

    private void E() {
        for (int i9 = 0; i9 < 8; i9++) {
            this.f7960l[i9].l();
        }
    }

    private List p() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < 8; i9++) {
            if (!this.f7960l[i9].j() && this.f7960l[i9].k() && (aVarC = this.f7960l[i9].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f7966c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(((a) arrayList.get(i10)).f7967a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void A() {
        int iH = b.h(this.f7956h.h(2), this.f7956h.h(2), this.f7956h.h(2), this.f7956h.h(2));
        int iH2 = b.h(this.f7956h.h(2), this.f7956h.h(2), this.f7956h.h(2), this.f7956h.h(2));
        this.f7956h.r(2);
        this.f7961m.n(iH, iH2, b.g(this.f7956h.h(2), this.f7956h.h(2), this.f7956h.h(2)));
    }

    public final void B() {
        this.f7956h.r(4);
        int iH = this.f7956h.h(4);
        this.f7956h.r(2);
        this.f7961m.o(iH, this.f7956h.h(6));
    }

    public final void C() {
        int iH = b.h(this.f7956h.h(2), this.f7956h.h(2), this.f7956h.h(2), this.f7956h.h(2));
        int iH2 = this.f7956h.h(2);
        int iG = b.g(this.f7956h.h(2), this.f7956h.h(2), this.f7956h.h(2));
        if (this.f7956h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f7956h.g();
        int iH3 = this.f7956h.h(2);
        int iH4 = this.f7956h.h(2);
        int iH5 = this.f7956h.h(2);
        this.f7956h.r(8);
        this.f7961m.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    public final void D() {
        StringBuilder sb;
        String str;
        C0092c c0092c = this.f7964p;
        if (c0092c.f8005d != (c0092c.f8003b * 2) - 1) {
            AbstractC1681B.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f7964p.f8003b * 2) - 1) + ", but current index is " + this.f7964p.f8005d + " (sequence number " + this.f7964p.f8002a + ");");
        }
        L l9 = this.f7956h;
        C0092c c0092c2 = this.f7964p;
        l9.o(c0092c2.f8004c, c0092c2.f8005d);
        boolean z9 = false;
        while (true) {
            if (this.f7956h.b() <= 0) {
                break;
            }
            int iH = this.f7956h.h(3);
            int iH2 = this.f7956h.h(5);
            if (iH == 7) {
                this.f7956h.r(2);
                iH = this.f7956h.h(6);
                if (iH < 7) {
                    AbstractC1681B.j("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH != 0) {
                    AbstractC1681B.j("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                }
            } else if (iH != this.f7959k) {
                this.f7956h.s(iH2);
            } else {
                int iE = this.f7956h.e() + (iH2 * 8);
                while (this.f7956h.e() < iE) {
                    int iH3 = this.f7956h.h(8);
                    if (iH3 == 16) {
                        iH3 = this.f7956h.h(8);
                        if (iH3 <= 31) {
                            s(iH3);
                        } else {
                            if (iH3 <= 127) {
                                x(iH3);
                            } else if (iH3 <= 159) {
                                t(iH3);
                            } else if (iH3 <= 255) {
                                y(iH3);
                            } else {
                                sb = new StringBuilder();
                                str = "Invalid extended command: ";
                                sb.append(str);
                                sb.append(iH3);
                                AbstractC1681B.j("Cea708Decoder", sb.toString());
                            }
                            z9 = true;
                        }
                    } else if (iH3 <= 31) {
                        q(iH3);
                    } else {
                        if (iH3 <= 127) {
                            v(iH3);
                        } else if (iH3 <= 159) {
                            r(iH3);
                        } else if (iH3 <= 255) {
                            w(iH3);
                        } else {
                            sb = new StringBuilder();
                            str = "Invalid base command: ";
                            sb.append(str);
                            sb.append(iH3);
                            AbstractC1681B.j("Cea708Decoder", sb.toString());
                        }
                        z9 = true;
                    }
                }
            }
        }
        if (z9) {
            this.f7962n = p();
        }
    }

    @Override // Q3.e, P3.j
    public /* bridge */ /* synthetic */ void a(long j9) {
        super.a(j9);
    }

    @Override // Q3.e
    public i e() {
        List list = this.f7962n;
        this.f7963o = list;
        return new f((List) AbstractC1684a.e(list));
    }

    @Override // Q3.e
    public void f(n nVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1684a.e(nVar.f9699d);
        this.f7955g.S(byteBuffer.array(), byteBuffer.limit());
        while (this.f7955g.a() >= 3) {
            int iH = this.f7955g.H();
            int i9 = iH & 3;
            boolean z9 = (iH & 4) == 4;
            byte bH = (byte) this.f7955g.H();
            byte bH2 = (byte) this.f7955g.H();
            if (i9 == 2 || i9 == 3) {
                if (z9) {
                    if (i9 == 3) {
                        o();
                        int i10 = (bH & 192) >> 6;
                        int i11 = this.f7957i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            E();
                            AbstractC1681B.j("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f7957i + " current=" + i10);
                        }
                        this.f7957i = i10;
                        int i12 = bH & Utf8.REPLACEMENT_BYTE;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        C0092c c0092c = new C0092c(i10, i12);
                        this.f7964p = c0092c;
                        byte[] bArr = c0092c.f8004c;
                        int i13 = c0092c.f8005d;
                        c0092c.f8005d = i13 + 1;
                        bArr[i13] = bH2;
                    } else {
                        AbstractC1684a.a(i9 == 2);
                        C0092c c0092c2 = this.f7964p;
                        if (c0092c2 == null) {
                            AbstractC1681B.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0092c2.f8004c;
                            int i14 = c0092c2.f8005d;
                            bArr2[i14] = bH;
                            c0092c2.f8005d = i14 + 2;
                            bArr2[i14 + 1] = bH2;
                        }
                    }
                    C0092c c0092c3 = this.f7964p;
                    if (c0092c3.f8005d == (c0092c3.f8003b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // Q3.e, U2.d
    public void flush() {
        super.flush();
        this.f7962n = null;
        this.f7963o = null;
        this.f7965q = 0;
        this.f7961m = this.f7960l[0];
        E();
        this.f7964p = null;
    }

    @Override // Q3.e
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ n d() {
        return super.d();
    }

    @Override // U2.d
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // Q3.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ o b() {
        return super.b();
    }

    @Override // Q3.e
    public boolean k() {
        return this.f7962n != this.f7963o;
    }

    @Override // Q3.e
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void c(n nVar) {
        super.c(nVar);
    }

    public final void o() {
        if (this.f7964p == null) {
            return;
        }
        D();
        this.f7964p = null;
    }

    public final void q(int i9) {
        L l9;
        if (i9 != 0) {
            if (i9 == 3) {
                this.f7962n = p();
            }
            int i10 = 8;
            if (i9 == 8) {
                this.f7961m.b();
                return;
            }
            switch (i9) {
                case 12:
                    E();
                    break;
                case 13:
                    this.f7961m.a('\n');
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    break;
                default:
                    if (i9 >= 17 && i9 <= 23) {
                        AbstractC1681B.j("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i9);
                        l9 = this.f7956h;
                    } else if (i9 < 24 || i9 > 31) {
                        AbstractC1681B.j("Cea708Decoder", "Invalid C0 command: " + i9);
                    } else {
                        AbstractC1681B.j("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i9);
                        l9 = this.f7956h;
                        i10 = 16;
                    }
                    l9.r(i10);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void r(int i9) {
        b bVar;
        L l9;
        int i10 = 16;
        int i11 = 1;
        switch (i9) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i9 - 128;
                if (this.f7965q != i12) {
                    this.f7965q = i12;
                    bVar = this.f7960l[i12];
                    this.f7961m = bVar;
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f7956h.g()) {
                        this.f7960l[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f7956h.g()) {
                        this.f7960l[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f7956h.g()) {
                        this.f7960l[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f7956h.g()) {
                        this.f7960l[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f7956h.g()) {
                        this.f7960l[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f7956h.r(8);
                break;
            case 142:
                break;
            case 143:
                E();
                break;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /* 144 */:
                if (this.f7961m.i()) {
                    z();
                }
                l9 = this.f7956h;
                l9.r(i10);
                break;
            case 145:
                if (this.f7961m.i()) {
                    A();
                } else {
                    l9 = this.f7956h;
                    i10 = 24;
                    l9.r(i10);
                }
                break;
            case 146:
                if (this.f7961m.i()) {
                    B();
                }
                l9 = this.f7956h;
                l9.r(i10);
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                AbstractC1681B.j("Cea708Decoder", "Invalid C1 command: " + i9);
                break;
            case 151:
                if (this.f7961m.i()) {
                    C();
                } else {
                    l9 = this.f7956h;
                    i10 = 32;
                    l9.r(i10);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i9 - 152;
                u(i15);
                if (this.f7965q != i15) {
                    this.f7965q = i15;
                    bVar = this.f7960l[i15];
                    this.f7961m = bVar;
                }
                break;
        }
    }

    @Override // Q3.e, U2.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i9) {
        L l9;
        int i10;
        if (i9 <= 7) {
            return;
        }
        if (i9 <= 15) {
            l9 = this.f7956h;
            i10 = 8;
        } else if (i9 <= 23) {
            l9 = this.f7956h;
            i10 = 16;
        } else {
            if (i9 > 31) {
                return;
            }
            l9 = this.f7956h;
            i10 = 24;
        }
        l9.r(i10);
    }

    public final void t(int i9) {
        L l9;
        int i10;
        if (i9 <= 135) {
            l9 = this.f7956h;
            i10 = 32;
        } else {
            if (i9 > 143) {
                if (i9 <= 159) {
                    this.f7956h.r(2);
                    this.f7956h.r(this.f7956h.h(6) * 8);
                    return;
                }
                return;
            }
            l9 = this.f7956h;
            i10 = 40;
        }
        l9.r(i10);
    }

    public final void u(int i9) {
        b bVar = this.f7960l[i9];
        this.f7956h.r(2);
        boolean zG = this.f7956h.g();
        boolean zG2 = this.f7956h.g();
        boolean zG3 = this.f7956h.g();
        int iH = this.f7956h.h(3);
        boolean zG4 = this.f7956h.g();
        int iH2 = this.f7956h.h(7);
        int iH3 = this.f7956h.h(8);
        int iH4 = this.f7956h.h(4);
        int iH5 = this.f7956h.h(4);
        this.f7956h.r(2);
        int iH6 = this.f7956h.h(6);
        this.f7956h.r(2);
        bVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f7956h.h(3), this.f7956h.h(3));
    }

    public final void v(int i9) {
        if (i9 == 127) {
            this.f7961m.a((char) 9835);
        } else {
            this.f7961m.a((char) (i9 & 255));
        }
    }

    public final void w(int i9) {
        this.f7961m.a((char) (i9 & 255));
    }

    public final void x(int i9) {
        b bVar;
        char c9 = TokenParser.SP;
        if (i9 == 32) {
            bVar = this.f7961m;
        } else if (i9 == 33) {
            bVar = this.f7961m;
            c9 = 160;
        } else if (i9 == 37) {
            bVar = this.f7961m;
            c9 = 8230;
        } else if (i9 == 42) {
            bVar = this.f7961m;
            c9 = 352;
        } else if (i9 == 44) {
            bVar = this.f7961m;
            c9 = 338;
        } else if (i9 == 63) {
            bVar = this.f7961m;
            c9 = 376;
        } else if (i9 == 57) {
            bVar = this.f7961m;
            c9 = 8482;
        } else if (i9 == 58) {
            bVar = this.f7961m;
            c9 = 353;
        } else if (i9 == 60) {
            bVar = this.f7961m;
            c9 = 339;
        } else if (i9 != 61) {
            switch (i9) {
                case 48:
                    bVar = this.f7961m;
                    c9 = 9608;
                    break;
                case 49:
                    bVar = this.f7961m;
                    c9 = 8216;
                    break;
                case 50:
                    bVar = this.f7961m;
                    c9 = 8217;
                    break;
                case 51:
                    bVar = this.f7961m;
                    c9 = 8220;
                    break;
                case 52:
                    bVar = this.f7961m;
                    c9 = 8221;
                    break;
                case 53:
                    bVar = this.f7961m;
                    c9 = 8226;
                    break;
                default:
                    switch (i9) {
                        case 118:
                            bVar = this.f7961m;
                            c9 = 8539;
                            break;
                        case 119:
                            bVar = this.f7961m;
                            c9 = 8540;
                            break;
                        case 120:
                            bVar = this.f7961m;
                            c9 = 8541;
                            break;
                        case 121:
                            bVar = this.f7961m;
                            c9 = 8542;
                            break;
                        case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /* 122 */:
                            bVar = this.f7961m;
                            c9 = 9474;
                            break;
                        case 123:
                            bVar = this.f7961m;
                            c9 = 9488;
                            break;
                        case 124:
                            bVar = this.f7961m;
                            c9 = 9492;
                            break;
                        case 125:
                            bVar = this.f7961m;
                            c9 = 9472;
                            break;
                        case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                            bVar = this.f7961m;
                            c9 = 9496;
                            break;
                        case 127:
                            bVar = this.f7961m;
                            c9 = 9484;
                            break;
                        default:
                            AbstractC1681B.j("Cea708Decoder", "Invalid G2 character: " + i9);
                            return;
                    }
                    break;
            }
        } else {
            bVar = this.f7961m;
            c9 = 8480;
        }
        bVar.a(c9);
    }

    public final void y(int i9) {
        b bVar;
        char c9;
        if (i9 == 160) {
            bVar = this.f7961m;
            c9 = 13252;
        } else {
            AbstractC1681B.j("Cea708Decoder", "Invalid G3 character: " + i9);
            bVar = this.f7961m;
            c9 = '_';
        }
        bVar.a(c9);
    }

    public final void z() {
        this.f7961m.m(this.f7956h.h(4), this.f7956h.h(2), this.f7956h.h(2), this.f7956h.g(), this.f7956h.g(), this.f7956h.h(3), this.f7956h.h(3));
    }
}
