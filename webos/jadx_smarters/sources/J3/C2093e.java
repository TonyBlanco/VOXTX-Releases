package j3;

import O2.AbstractC0904o;
import O2.C0897l1;
import V2.C1056m;
import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d3.w;
import d3.x;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.C1682C;
import d4.G;
import d4.M;
import d4.k0;
import e4.C1740c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: j3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2093e implements InterfaceC1672i {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final InterfaceC1678o f42920c0 = new InterfaceC1678o() { // from class: j3.d
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C2093e.A();
        }
    };

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f42921d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f42922e0 = k0.s0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f42923f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f42924g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final UUID f42925h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Map f42926i0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f42927A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f42928B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1682C f42929C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C1682C f42930D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f42931E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f42932F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f42933G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f42934H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f42935I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f42936J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f42937K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f42938L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f42939M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f42940N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f42941O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f42942P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f42943Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f42944R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f42945S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f42946T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f42947U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f42948V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f42949W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f42950X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f42951Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public byte f42952Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2091c f42953a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f42954a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2095g f42955b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public InterfaceC1674k f42956b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f42957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f42959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f42960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M f42961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f42962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M f42963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M f42964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final M f42965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M f42966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final M f42967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M f42968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f42969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f42970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f42971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f42972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f42973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f42974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f42975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f42976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f42977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f42978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f42979y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f42980z;

    /* JADX INFO: renamed from: j3.e$b */
    public final class b implements InterfaceC2090b {
        public b() {
        }

        @Override // j3.InterfaceC2090b
        public void a(int i9) throws C0897l1 {
            C2093e.this.o(i9);
        }

        @Override // j3.InterfaceC2090b
        public void b(int i9, int i10, InterfaceC1673j interfaceC1673j) throws C0897l1 {
            C2093e.this.l(i9, i10, interfaceC1673j);
        }

        @Override // j3.InterfaceC2090b
        public void c(int i9, double d9) {
            C2093e.this.r(i9, d9);
        }

        @Override // j3.InterfaceC2090b
        public void d(int i9, long j9) throws C0897l1 {
            C2093e.this.x(i9, j9);
        }

        @Override // j3.InterfaceC2090b
        public int e(int i9) {
            return C2093e.this.u(i9);
        }

        @Override // j3.InterfaceC2090b
        public boolean f(int i9) {
            return C2093e.this.z(i9);
        }

        @Override // j3.InterfaceC2090b
        public void g(int i9, String str) throws C0897l1 {
            C2093e.this.H(i9, str);
        }

        @Override // j3.InterfaceC2090b
        public void h(int i9, long j9, long j10) throws C0897l1 {
            C2093e.this.G(i9, j9, j10);
        }
    }

    /* JADX INFO: renamed from: j3.e$c */
    public static final class c {

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public byte[] f42995N;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public x f43001T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f43002U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public w f43005X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f43006Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f43008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f43012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f43013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f43014h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f43015i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public w.a f43016j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f43017k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public C1056m f43018l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f43019m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f43020n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f43021o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f43022p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f43023q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f43024r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f43025s = 0.0f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f43026t = 0.0f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f43027u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public byte[] f43028v = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f43029w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f43030x = false;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f43031y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f43032z = -1;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f42982A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f42983B = 1000;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f42984C = 200;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public float f42985D = -1.0f;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f42986E = -1.0f;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f42987F = -1.0f;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public float f42988G = -1.0f;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public float f42989H = -1.0f;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f42990I = -1.0f;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public float f42991J = -1.0f;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public float f42992K = -1.0f;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f42993L = -1.0f;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public float f42994M = -1.0f;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f42996O = 1;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f42997P = -1;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f42998Q = 8000;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public long f42999R = 0;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public long f43000S = 0;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public boolean f43003V = true;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public String f43004W = "eng";

        public static Pair k(M m9) throws C0897l1 {
            try {
                m9.V(16);
                long jX = m9.x();
                if (jX == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (jX == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (jX != 826496599) {
                    AbstractC1681B.j("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] bArrE = m9.e();
                for (int iF = m9.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw C0897l1.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C0897l1.a("Error parsing FourCC private data", null);
            }
        }

        public static boolean l(M m9) throws C0897l1 {
            try {
                int iZ = m9.z();
                if (iZ == 1) {
                    return true;
                }
                if (iZ != 65534) {
                    return false;
                }
                m9.U(24);
                if (m9.A() == C2093e.f42925h0.getMostSignificantBits()) {
                    if (m9.A() == C2093e.f42925h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C0897l1.a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List m(byte[] bArr) throws C0897l1 {
            int i9;
            int i10;
            try {
                if (bArr[0] != 2) {
                    throw C0897l1.a("Error parsing vorbis codec private", null);
                }
                int i11 = 1;
                int i12 = 0;
                while (true) {
                    i9 = bArr[i11];
                    if ((i9 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i11++;
                }
                int i13 = i11 + 1;
                int i14 = i12 + (i9 & 255);
                int i15 = 0;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i15 += 255;
                    i13++;
                }
                int i16 = i13 + 1;
                int i17 = i15 + (i10 & 255);
                if (bArr[i16] != 1) {
                    throw C0897l1.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i14];
                System.arraycopy(bArr, i16, bArr2, 0, i14);
                int i18 = i16 + i14;
                if (bArr[i18] != 3) {
                    throw C0897l1.a("Error parsing vorbis codec private", null);
                }
                int i19 = i18 + i17;
                if (bArr[i19] != 5) {
                    throw C0897l1.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i19];
                System.arraycopy(bArr, i19, bArr3, 0, bArr.length - i19);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C0897l1.a("Error parsing vorbis codec private", null);
            }
        }

        public final void f() {
            AbstractC1684a.e(this.f43005X);
        }

        public final byte[] g(String str) throws C0897l1 {
            byte[] bArr = this.f43017k;
            if (bArr != null) {
                return bArr;
            }
            throw C0897l1.a("Missing CodecPrivate for codec " + str, null);
        }

        public final byte[] h() {
            if (this.f42985D == -1.0f || this.f42986E == -1.0f || this.f42987F == -1.0f || this.f42988G == -1.0f || this.f42989H == -1.0f || this.f42990I == -1.0f || this.f42991J == -1.0f || this.f42992K == -1.0f || this.f42993L == -1.0f || this.f42994M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f42985D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f42986E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f42987F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f42988G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f42989H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f42990I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f42991J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f42992K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f42993L + 0.5f));
            byteBufferOrder.putShort((short) (this.f42994M + 0.5f));
            byteBufferOrder.putShort((short) this.f42983B);
            byteBufferOrder.putShort((short) this.f42984C);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:205:0x03fb  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0416  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0423  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x0435  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0541  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(d3.InterfaceC1674k r20, int r21) throws O2.C0897l1 {
            /*
                Method dump skipped, instruction units count: 1622
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.C2093e.c.i(d3.k, int):void");
        }

        public void j() {
            x xVar = this.f43001T;
            if (xVar != null) {
                xVar.a(this.f43005X, this.f43016j);
            }
        }

        public void n() {
            x xVar = this.f43001T;
            if (xVar != null) {
                xVar.b();
            }
        }

        public final boolean o(boolean z9) {
            return "A_OPUS".equals(this.f43008b) ? z9 : this.f43012f > 0;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f42926i0 = Collections.unmodifiableMap(map);
    }

    public C2093e() {
        this(0);
    }

    public C2093e(int i9) {
        this(new C2089a(), i9);
    }

    public C2093e(InterfaceC2091c interfaceC2091c, int i9) {
        this.f42971q = -1L;
        this.f42972r = -9223372036854775807L;
        this.f42973s = -9223372036854775807L;
        this.f42974t = -9223372036854775807L;
        this.f42980z = -1L;
        this.f42927A = -1L;
        this.f42928B = -9223372036854775807L;
        this.f42953a = interfaceC2091c;
        interfaceC2091c.b(new b());
        this.f42958d = (i9 & 1) == 0;
        this.f42955b = new C2095g();
        this.f42957c = new SparseArray();
        this.f42961g = new M(4);
        this.f42962h = new M(ByteBuffer.allocate(4).putInt(-1).array());
        this.f42963i = new M(4);
        this.f42959e = new M(G.f39651a);
        this.f42960f = new M(4);
        this.f42964j = new M();
        this.f42965k = new M();
        this.f42966l = new M(8);
        this.f42967m = new M();
        this.f42968n = new M();
        this.f42938L = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] A() {
        return new InterfaceC1672i[]{new C2093e()};
    }

    public static void F(String str, long j9, byte[] bArr) {
        byte[] bArrS;
        int i9;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                bArrS = s(j9, "%01d:%02d:%02d:%02d", 10000L);
                i9 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrS = s(j9, "%02d:%02d:%02d.%03d", 1000L);
                i9 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrS = s(j9, "%02d:%02d:%02d,%03d", 1000L);
                i9 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrS, 0, bArr, i9, bArrS.length);
    }

    private void k() {
        AbstractC1684a.i(this.f42956b0);
    }

    public static int[] p(int[] iArr, int i9) {
        return iArr == null ? new int[i9] : iArr.length >= i9 ? iArr : new int[Math.max(iArr.length * 2, i9)];
    }

    public static byte[] s(long j9, String str, long j10) {
        AbstractC1684a.a(j9 != -9223372036854775807L);
        int i9 = (int) (j9 / 3600000000L);
        long j11 = j9 - (((long) i9) * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (((long) i10) * 60000000);
        int i11 = (int) (j12 / 1000000);
        return k0.s0(String.format(Locale.US, str, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (((long) i11) * 1000000)) / j10))));
    }

    public static boolean y(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    public final boolean B(t tVar, long j9) {
        if (this.f42979y) {
            this.f42927A = j9;
            tVar.f39608a = this.f42980z;
            this.f42979y = false;
            return true;
        }
        if (this.f42976v) {
            long j10 = this.f42927A;
            if (j10 != -1) {
                tVar.f39608a = j10;
                this.f42927A = -1L;
                return true;
            }
        }
        return false;
    }

    public final void C(InterfaceC1673j interfaceC1673j, int i9) {
        if (this.f42961g.g() >= i9) {
            return;
        }
        if (this.f42961g.b() < i9) {
            M m9 = this.f42961g;
            m9.c(Math.max(m9.b() * 2, i9));
        }
        interfaceC1673j.m(this.f42961g.e(), this.f42961g.g(), i9 - this.f42961g.g());
        this.f42961g.T(i9);
    }

    public final void D() {
        this.f42945S = 0;
        this.f42946T = 0;
        this.f42947U = 0;
        this.f42948V = false;
        this.f42949W = false;
        this.f42950X = false;
        this.f42951Y = 0;
        this.f42952Z = (byte) 0;
        this.f42954a0 = false;
        this.f42964j.Q(0);
    }

    public final long E(long j9) throws C0897l1 {
        long j10 = this.f42972r;
        if (j10 != -9223372036854775807L) {
            return k0.c1(j9, j10, 1000L);
        }
        throw C0897l1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public void G(int i9, long j9, long j10) throws C0897l1 {
        k();
        if (i9 == 160) {
            this.f42943Q = false;
            this.f42944R = 0L;
            return;
        }
        if (i9 == 174) {
            this.f42975u = new c();
            return;
        }
        if (i9 == 187) {
            this.f42931E = false;
            return;
        }
        if (i9 == 19899) {
            this.f42977w = -1;
            this.f42978x = -1L;
            return;
        }
        if (i9 == 20533) {
            t(i9).f43014h = true;
            return;
        }
        if (i9 == 21968) {
            t(i9).f43030x = true;
            return;
        }
        if (i9 == 408125543) {
            long j11 = this.f42971q;
            if (j11 != -1 && j11 != j9) {
                throw C0897l1.a("Multiple Segment elements not supported", null);
            }
            this.f42971q = j9;
            this.f42970p = j10;
            return;
        }
        if (i9 == 475249515) {
            this.f42929C = new C1682C();
            this.f42930D = new C1682C();
        } else if (i9 == 524531317 && !this.f42976v) {
            if (this.f42958d && this.f42980z != -1) {
                this.f42979y = true;
            } else {
                this.f42956b0.n(new g.b(this.f42974t));
                this.f42976v = true;
            }
        }
    }

    public void H(int i9, String str) throws C0897l1 {
        if (i9 == 134) {
            t(i9).f43008b = str;
            return;
        }
        if (i9 != 17026) {
            if (i9 == 21358) {
                t(i9).f43007a = str;
                return;
            } else {
                if (i9 != 2274716) {
                    return;
                }
                t(i9).f43004W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw C0897l1.a("DocType " + str + " not supported", null);
    }

    public final int I(InterfaceC1673j interfaceC1673j, c cVar, int i9, boolean z9) throws C0897l1 {
        int i10;
        if ("S_TEXT/UTF8".equals(cVar.f43008b)) {
            J(interfaceC1673j, f42921d0, i9);
        } else if ("S_TEXT/ASS".equals(cVar.f43008b)) {
            J(interfaceC1673j, f42923f0, i9);
        } else {
            if (!"S_TEXT/WEBVTT".equals(cVar.f43008b)) {
                w wVar = cVar.f43005X;
                if (!this.f42948V) {
                    if (cVar.f43014h) {
                        this.f42941O &= -1073741825;
                        if (!this.f42949W) {
                            interfaceC1673j.m(this.f42961g.e(), 0, 1);
                            this.f42945S++;
                            if ((this.f42961g.e()[0] & 128) == 128) {
                                throw C0897l1.a("Extension bit is set in signal byte", null);
                            }
                            this.f42952Z = this.f42961g.e()[0];
                            this.f42949W = true;
                        }
                        byte b9 = this.f42952Z;
                        if ((b9 & 1) == 1) {
                            boolean z10 = (b9 & 2) == 2;
                            this.f42941O |= 1073741824;
                            if (!this.f42954a0) {
                                interfaceC1673j.m(this.f42966l.e(), 0, 8);
                                this.f42945S += 8;
                                this.f42954a0 = true;
                                this.f42961g.e()[0] = (byte) ((z10 ? 128 : 0) | 8);
                                this.f42961g.U(0);
                                wVar.c(this.f42961g, 1, 1);
                                this.f42946T++;
                                this.f42966l.U(0);
                                wVar.c(this.f42966l, 8, 1);
                                this.f42946T += 8;
                            }
                            if (z10) {
                                if (!this.f42950X) {
                                    interfaceC1673j.m(this.f42961g.e(), 0, 1);
                                    this.f42945S++;
                                    this.f42961g.U(0);
                                    this.f42951Y = this.f42961g.H();
                                    this.f42950X = true;
                                }
                                int i11 = this.f42951Y * 4;
                                this.f42961g.Q(i11);
                                interfaceC1673j.m(this.f42961g.e(), 0, i11);
                                this.f42945S += i11;
                                short s9 = (short) ((this.f42951Y / 2) + 1);
                                int i12 = (s9 * 6) + 2;
                                ByteBuffer byteBuffer = this.f42969o;
                                if (byteBuffer == null || byteBuffer.capacity() < i12) {
                                    this.f42969o = ByteBuffer.allocate(i12);
                                }
                                this.f42969o.position(0);
                                this.f42969o.putShort(s9);
                                int i13 = 0;
                                int i14 = 0;
                                while (true) {
                                    i10 = this.f42951Y;
                                    if (i13 >= i10) {
                                        break;
                                    }
                                    int iL = this.f42961g.L();
                                    if (i13 % 2 == 0) {
                                        this.f42969o.putShort((short) (iL - i14));
                                    } else {
                                        this.f42969o.putInt(iL - i14);
                                    }
                                    i13++;
                                    i14 = iL;
                                }
                                int i15 = (i9 - this.f42945S) - i14;
                                int i16 = i10 % 2;
                                ByteBuffer byteBuffer2 = this.f42969o;
                                if (i16 == 1) {
                                    byteBuffer2.putInt(i15);
                                } else {
                                    byteBuffer2.putShort((short) i15);
                                    this.f42969o.putInt(0);
                                }
                                this.f42967m.S(this.f42969o.array(), i12);
                                wVar.c(this.f42967m, i12, 1);
                                this.f42946T += i12;
                            }
                        }
                    } else {
                        byte[] bArr = cVar.f43015i;
                        if (bArr != null) {
                            this.f42964j.S(bArr, bArr.length);
                        }
                    }
                    if (cVar.o(z9)) {
                        this.f42941O |= 268435456;
                        this.f42968n.Q(0);
                        int iG = (this.f42964j.g() + i9) - this.f42945S;
                        this.f42961g.Q(4);
                        this.f42961g.e()[0] = (byte) ((iG >> 24) & 255);
                        this.f42961g.e()[1] = (byte) ((iG >> 16) & 255);
                        this.f42961g.e()[2] = (byte) ((iG >> 8) & 255);
                        this.f42961g.e()[3] = (byte) (iG & 255);
                        wVar.c(this.f42961g, 4, 2);
                        this.f42946T += 4;
                    }
                    this.f42948V = true;
                }
                int iG2 = i9 + this.f42964j.g();
                if (!"V_MPEG4/ISO/AVC".equals(cVar.f43008b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f43008b)) {
                    if (cVar.f43001T != null) {
                        AbstractC1684a.g(this.f42964j.g() == 0);
                        cVar.f43001T.d(interfaceC1673j);
                    }
                    while (true) {
                        int i17 = this.f42945S;
                        if (i17 >= iG2) {
                            break;
                        }
                        int iK = K(interfaceC1673j, wVar, iG2 - i17);
                        this.f42945S += iK;
                        this.f42946T += iK;
                    }
                } else {
                    byte[] bArrE = this.f42960f.e();
                    bArrE[0] = 0;
                    bArrE[1] = 0;
                    bArrE[2] = 0;
                    int i18 = cVar.f43006Y;
                    int i19 = 4 - i18;
                    while (this.f42945S < iG2) {
                        int i20 = this.f42947U;
                        if (i20 == 0) {
                            L(interfaceC1673j, bArrE, i19, i18);
                            this.f42945S += i18;
                            this.f42960f.U(0);
                            this.f42947U = this.f42960f.L();
                            this.f42959e.U(0);
                            wVar.b(this.f42959e, 4);
                            this.f42946T += 4;
                        } else {
                            int iK2 = K(interfaceC1673j, wVar, i20);
                            this.f42945S += iK2;
                            this.f42946T += iK2;
                            this.f42947U -= iK2;
                        }
                    }
                }
                if ("A_VORBIS".equals(cVar.f43008b)) {
                    this.f42962h.U(0);
                    wVar.b(this.f42962h, 4);
                    this.f42946T += 4;
                }
                return q();
            }
            J(interfaceC1673j, f42924g0, i9);
        }
        return q();
    }

    public final void J(InterfaceC1673j interfaceC1673j, byte[] bArr, int i9) {
        int length = bArr.length + i9;
        if (this.f42965k.b() < length) {
            this.f42965k.R(Arrays.copyOf(bArr, length + i9));
        } else {
            System.arraycopy(bArr, 0, this.f42965k.e(), 0, bArr.length);
        }
        interfaceC1673j.m(this.f42965k.e(), bArr.length, i9);
        this.f42965k.U(0);
        this.f42965k.T(length);
    }

    public final int K(InterfaceC1673j interfaceC1673j, w wVar, int i9) {
        int iA = this.f42964j.a();
        if (iA <= 0) {
            return wVar.a(interfaceC1673j, i9, false);
        }
        int iMin = Math.min(i9, iA);
        wVar.b(this.f42964j, iMin);
        return iMin;
    }

    public final void L(InterfaceC1673j interfaceC1673j, byte[] bArr, int i9, int i10) {
        int iMin = Math.min(i10, this.f42964j.a());
        interfaceC1673j.m(bArr, i9 + iMin, i10 - iMin);
        if (iMin > 0) {
            this.f42964j.l(bArr, i9, iMin);
        }
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f42928B = -9223372036854775807L;
        this.f42933G = 0;
        this.f42953a.reset();
        this.f42955b.e();
        D();
        for (int i9 = 0; i9 < this.f42957c.size(); i9++) {
            ((c) this.f42957c.valueAt(i9)).n();
        }
    }

    @Override // d3.InterfaceC1672i
    public final void b(InterfaceC1674k interfaceC1674k) {
        this.f42956b0 = interfaceC1674k;
    }

    @Override // d3.InterfaceC1672i
    public final int d(InterfaceC1673j interfaceC1673j, t tVar) {
        this.f42932F = false;
        boolean zA = true;
        while (zA && !this.f42932F) {
            zA = this.f42953a.a(interfaceC1673j);
            if (zA && B(tVar, interfaceC1673j.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i9 = 0; i9 < this.f42957c.size(); i9++) {
            c cVar = (c) this.f42957c.valueAt(i9);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    @Override // d3.InterfaceC1672i
    public final boolean h(InterfaceC1673j interfaceC1673j) {
        return new C2094f().b(interfaceC1673j);
    }

    public final void i(int i9) throws C0897l1 {
        if (this.f42929C == null || this.f42930D == null) {
            throw C0897l1.a("Element " + i9 + " must be in a Cues", null);
        }
    }

    public final void j(int i9) throws C0897l1 {
        if (this.f42975u != null) {
            return;
        }
        throw C0897l1.a("Element " + i9 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0231, code lost:
    
        throw O2.C0897l1.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r22, int r23, d3.InterfaceC1673j r24) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C2093e.l(int, int, d3.j):void");
    }

    public final com.google.android.exoplayer2.extractor.g m(C1682C c1682c, C1682C c1682c2) {
        int i9;
        if (this.f42971q == -1 || this.f42974t == -9223372036854775807L || c1682c == null || c1682c.c() == 0 || c1682c2 == null || c1682c2.c() != c1682c.c()) {
            return new g.b(this.f42974t);
        }
        int iC = c1682c.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i10 = 0;
        for (int i11 = 0; i11 < iC; i11++) {
            jArrCopyOf3[i11] = c1682c.b(i11);
            jArrCopyOf[i11] = this.f42971q + c1682c2.b(i11);
        }
        while (true) {
            i9 = iC - 1;
            if (i10 >= i9) {
                break;
            }
            int i12 = i10 + 1;
            iArrCopyOf[i10] = (int) (jArrCopyOf[i12] - jArrCopyOf[i10]);
            jArrCopyOf2[i10] = jArrCopyOf3[i12] - jArrCopyOf3[i10];
            i10 = i12;
        }
        iArrCopyOf[i9] = (int) ((this.f42971q + this.f42970p) - jArrCopyOf[i9]);
        long j9 = this.f42974t - jArrCopyOf3[i9];
        jArrCopyOf2[i9] = j9;
        if (j9 <= 0) {
            AbstractC1681B.j("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j9);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i9);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i9);
        }
        return new com.google.android.exoplayer2.extractor.b(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    public final void n(c cVar, long j9, int i9, int i10, int i11) {
        String str;
        x xVar = cVar.f43001T;
        if (xVar != null) {
            xVar.c(cVar.f43005X, j9, i9, i10, i11, cVar.f43016j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f43008b) || "S_TEXT/ASS".equals(cVar.f43008b) || "S_TEXT/WEBVTT".equals(cVar.f43008b)) {
                if (this.f42937K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j10 = this.f42935I;
                    if (j10 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        F(cVar.f43008b, j10, this.f42965k.e());
                        int iF = this.f42965k.f();
                        while (true) {
                            if (iF >= this.f42965k.g()) {
                                break;
                            }
                            if (this.f42965k.e()[iF] == 0) {
                                this.f42965k.T(iF);
                                break;
                            }
                            iF++;
                        }
                        w wVar = cVar.f43005X;
                        M m9 = this.f42965k;
                        wVar.b(m9, m9.g());
                        i10 += this.f42965k.g();
                    }
                }
                AbstractC1681B.j("MatroskaExtractor", str);
            }
            if ((268435456 & i9) != 0) {
                if (this.f42937K > 1) {
                    this.f42968n.Q(0);
                } else {
                    int iG = this.f42968n.g();
                    cVar.f43005X.c(this.f42968n, iG, 2);
                    i10 += iG;
                }
            }
            cVar.f43005X.f(j9, i9, i10, i11, cVar.f43016j);
        }
        this.f42932F = true;
    }

    public void o(int i9) throws C0897l1 {
        k();
        if (i9 == 160) {
            if (this.f42933G != 2) {
                return;
            }
            c cVar = (c) this.f42957c.get(this.f42939M);
            cVar.f();
            if (this.f42944R > 0 && "A_OPUS".equals(cVar.f43008b)) {
                this.f42968n.R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f42944R).array());
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.f42937K; i11++) {
                i10 += this.f42938L[i11];
            }
            int i12 = 0;
            while (i12 < this.f42937K) {
                long j9 = this.f42934H + ((long) ((cVar.f43011e * i12) / 1000));
                int i13 = this.f42941O;
                if (i12 == 0 && !this.f42943Q) {
                    i13 |= 1;
                }
                int i14 = this.f42938L[i12];
                int i15 = i10 - i14;
                n(cVar, j9, i13, i14, i15);
                i12++;
                i10 = i15;
            }
            this.f42933G = 0;
            return;
        }
        if (i9 == 174) {
            c cVar2 = (c) AbstractC1684a.i(this.f42975u);
            String str = cVar2.f43008b;
            if (str == null) {
                throw C0897l1.a("CodecId is missing in TrackEntry element", null);
            }
            if (y(str)) {
                cVar2.i(this.f42956b0, cVar2.f43009c);
                this.f42957c.put(cVar2.f43009c, cVar2);
            }
            this.f42975u = null;
            return;
        }
        if (i9 == 19899) {
            int i16 = this.f42977w;
            if (i16 != -1) {
                long j10 = this.f42978x;
                if (j10 != -1) {
                    if (i16 == 475249515) {
                        this.f42980z = j10;
                        return;
                    }
                    return;
                }
            }
            throw C0897l1.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i9 == 25152) {
            j(i9);
            c cVar3 = this.f42975u;
            if (cVar3.f43014h) {
                if (cVar3.f43016j == null) {
                    throw C0897l1.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f43018l = new C1056m(new C1056m.b(AbstractC0904o.f6137a, "video/webm", this.f42975u.f43016j.f39613b));
                return;
            }
            return;
        }
        if (i9 == 28032) {
            j(i9);
            c cVar4 = this.f42975u;
            if (cVar4.f43014h && cVar4.f43015i != null) {
                throw C0897l1.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i9 == 357149030) {
            if (this.f42972r == -9223372036854775807L) {
                this.f42972r = 1000000L;
            }
            long j11 = this.f42973s;
            if (j11 != -9223372036854775807L) {
                this.f42974t = E(j11);
                return;
            }
            return;
        }
        if (i9 == 374648427) {
            if (this.f42957c.size() == 0) {
                throw C0897l1.a("No valid tracks were found", null);
            }
            this.f42956b0.q();
        } else {
            if (i9 != 475249515) {
                return;
            }
            if (!this.f42976v) {
                this.f42956b0.n(m(this.f42929C, this.f42930D));
                this.f42976v = true;
            }
            this.f42929C = null;
            this.f42930D = null;
        }
    }

    public final int q() {
        int i9 = this.f42946T;
        D();
        return i9;
    }

    public void r(int i9, double d9) {
        if (i9 == 181) {
            t(i9).f42998Q = (int) d9;
        }
        if (i9 == 17545) {
            this.f42973s = (long) d9;
            return;
        }
        switch (i9) {
            case 21969:
                t(i9).f42985D = (float) d9;
                break;
            case 21970:
                t(i9).f42986E = (float) d9;
                break;
            case 21971:
                t(i9).f42987F = (float) d9;
                break;
            case 21972:
                t(i9).f42988G = (float) d9;
                break;
            case 21973:
                t(i9).f42989H = (float) d9;
                break;
            case 21974:
                t(i9).f42990I = (float) d9;
                break;
            case 21975:
                t(i9).f42991J = (float) d9;
                break;
            case 21976:
                t(i9).f42992K = (float) d9;
                break;
            case 21977:
                t(i9).f42993L = (float) d9;
                break;
            case 21978:
                t(i9).f42994M = (float) d9;
                break;
            default:
                switch (i9) {
                    case 30323:
                        t(i9).f43025s = (float) d9;
                        break;
                    case 30324:
                        t(i9).f43026t = (float) d9;
                        break;
                    case 30325:
                        t(i9).f43027u = (float) d9;
                        break;
                }
                break;
        }
    }

    @Override // d3.InterfaceC1672i
    public final void release() {
    }

    public c t(int i9) throws C0897l1 {
        j(i9);
        return this.f42975u;
    }

    public int u(int i9) {
        switch (i9) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void v(c cVar, InterfaceC1673j interfaceC1673j, int i9) {
        if (cVar.f43013g != 1685485123 && cVar.f43013g != 1685480259) {
            interfaceC1673j.q(i9);
            return;
        }
        byte[] bArr = new byte[i9];
        cVar.f42995N = bArr;
        interfaceC1673j.m(bArr, 0, i9);
    }

    public void w(c cVar, int i9, InterfaceC1673j interfaceC1673j, int i10) {
        if (i9 != 4 || !"V_VP9".equals(cVar.f43008b)) {
            interfaceC1673j.q(i10);
        } else {
            this.f42968n.Q(i10);
            interfaceC1673j.m(this.f42968n.e(), 0, i10);
        }
    }

    public void x(int i9, long j9) throws C0897l1 {
        if (i9 == 20529) {
            if (j9 == 0) {
                return;
            }
            throw C0897l1.a("ContentEncodingOrder " + j9 + " not supported", null);
        }
        if (i9 == 20530) {
            if (j9 == 1) {
                return;
            }
            throw C0897l1.a("ContentEncodingScope " + j9 + " not supported", null);
        }
        switch (i9) {
            case 131:
                t(i9).f43010d = (int) j9;
                return;
            case 136:
                t(i9).f43003V = j9 == 1;
                return;
            case 155:
                this.f42935I = E(j9);
                return;
            case 159:
                t(i9).f42996O = (int) j9;
                return;
            case 176:
                t(i9).f43019m = (int) j9;
                return;
            case 179:
                i(i9);
                this.f42929C.a(E(j9));
                return;
            case 186:
                t(i9).f43020n = (int) j9;
                return;
            case 215:
                t(i9).f43009c = (int) j9;
                return;
            case 231:
                this.f42928B = E(j9);
                return;
            case 238:
                this.f42942P = (int) j9;
                return;
            case 241:
                if (this.f42931E) {
                    return;
                }
                i(i9);
                this.f42930D.a(j9);
                this.f42931E = true;
                return;
            case 251:
                this.f42943Q = true;
                return;
            case 16871:
                t(i9).f43013g = (int) j9;
                return;
            case 16980:
                if (j9 == 3) {
                    return;
                }
                throw C0897l1.a("ContentCompAlgo " + j9 + " not supported", null);
            case 17029:
                if (j9 < 1 || j9 > 2) {
                    throw C0897l1.a("DocTypeReadVersion " + j9 + " not supported", null);
                }
                return;
            case 17143:
                if (j9 == 1) {
                    return;
                }
                throw C0897l1.a("EBMLReadVersion " + j9 + " not supported", null);
            case 18401:
                if (j9 == 5) {
                    return;
                }
                throw C0897l1.a("ContentEncAlgo " + j9 + " not supported", null);
            case 18408:
                if (j9 == 1) {
                    return;
                }
                throw C0897l1.a("AESSettingsCipherMode " + j9 + " not supported", null);
            case 21420:
                this.f42978x = j9 + this.f42971q;
                return;
            case 21432:
                int i10 = (int) j9;
                j(i9);
                if (i10 == 0) {
                    this.f42975u.f43029w = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f42975u.f43029w = 2;
                    return;
                } else if (i10 == 3) {
                    this.f42975u.f43029w = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    this.f42975u.f43029w = 3;
                    return;
                }
            case 21680:
                t(i9).f43021o = (int) j9;
                return;
            case 21682:
                t(i9).f43023q = (int) j9;
                return;
            case 21690:
                t(i9).f43022p = (int) j9;
                return;
            case 21930:
                t(i9).f43002U = j9 == 1;
                return;
            case 21998:
                t(i9).f43012f = (int) j9;
                return;
            case 22186:
                t(i9).f42999R = j9;
                return;
            case 22203:
                t(i9).f43000S = j9;
                return;
            case 25188:
                t(i9).f42997P = (int) j9;
                return;
            case 30114:
                this.f42944R = j9;
                return;
            case 30321:
                j(i9);
                int i11 = (int) j9;
                if (i11 == 0) {
                    this.f42975u.f43024r = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f42975u.f43024r = 1;
                    return;
                } else if (i11 == 2) {
                    this.f42975u.f43024r = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.f42975u.f43024r = 3;
                    return;
                }
            case 2352003:
                t(i9).f43011e = (int) j9;
                return;
            case 2807729:
                this.f42972r = j9;
                return;
            default:
                switch (i9) {
                    case 21945:
                        j(i9);
                        int i12 = (int) j9;
                        if (i12 == 1) {
                            this.f42975u.f42982A = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            this.f42975u.f42982A = 1;
                            return;
                        }
                    case 21946:
                        j(i9);
                        int iJ = C1740c.j((int) j9);
                        if (iJ != -1) {
                            this.f42975u.f43032z = iJ;
                            return;
                        }
                        return;
                    case 21947:
                        j(i9);
                        this.f42975u.f43030x = true;
                        int i13 = C1740c.i((int) j9);
                        if (i13 != -1) {
                            this.f42975u.f43031y = i13;
                            return;
                        }
                        return;
                    case 21948:
                        t(i9).f42983B = (int) j9;
                        return;
                    case 21949:
                        t(i9).f42984C = (int) j9;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean z(int i9) {
        return i9 == 357149030 || i9 == 524531317 || i9 == 475249515 || i9 == 374648427;
    }
}
