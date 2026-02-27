package n4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import t4.AbstractC2774a;
import t4.C2775b;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public class r extends AbstractC2985a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C2283o f45491A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f45492B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final SparseArray f45493C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final a f45494D;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaInfo f45495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f45498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f45503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long[] f45505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f45508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JSONObject f45509t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45510u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f45511v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f45512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C2264c f45513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C2289v f45514y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C2278j f45515z;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C2775b f45490E = new C2775b("MediaStatus");
    public static final Parcelable.Creator<r> CREATOR = new s0();

    public class a {
        public a() {
        }
    }

    public r(MediaInfo mediaInfo, long j9, int i9, double d9, int i10, int i11, long j10, long j11, double d10, boolean z9, long[] jArr, int i12, int i13, String str, int i14, List list, boolean z10, C2264c c2264c, C2289v c2289v, C2278j c2278j, C2283o c2283o) {
        this.f45511v = new ArrayList();
        this.f45493C = new SparseArray();
        this.f45494D = new a();
        this.f45495f = mediaInfo;
        this.f45496g = j9;
        this.f45497h = i9;
        this.f45498i = d9;
        this.f45499j = i10;
        this.f45500k = i11;
        this.f45501l = j10;
        this.f45502m = j11;
        this.f45503n = d10;
        this.f45504o = z9;
        this.f45505p = jArr;
        this.f45506q = i12;
        this.f45507r = i13;
        this.f45508s = str;
        if (str != null) {
            try {
                this.f45509t = new JSONObject(this.f45508s);
            } catch (JSONException unused) {
                this.f45509t = null;
                this.f45508s = null;
            }
        } else {
            this.f45509t = null;
        }
        this.f45510u = i14;
        if (list != null && !list.isEmpty()) {
            k0(list);
        }
        this.f45512w = z10;
        this.f45513x = c2264c;
        this.f45514y = c2289v;
        this.f45515z = c2278j;
        this.f45491A = c2283o;
        boolean z11 = false;
        if (c2283o != null && c2283o.R()) {
            z11 = true;
        }
        this.f45492B = z11;
    }

    public r(JSONObject jSONObject) throws JSONException {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        i0(jSONObject, 0);
    }

    public static final boolean l0(int i9, int i10, int i11, int i12) {
        if (i9 != 1) {
            return false;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return i12 != 2;
            }
            if (i10 != 3) {
                return true;
            }
        }
        return i11 == 0;
    }

    public long[] H() {
        return this.f45505p;
    }

    public C2264c I() {
        return this.f45513x;
    }

    public C2260a J() {
        MediaInfo mediaInfo;
        List<C2260a> listH;
        C2264c c2264c = this.f45513x;
        if (c2264c == null) {
            return null;
        }
        String strH = c2264c.H();
        if (!TextUtils.isEmpty(strH) && (mediaInfo = this.f45495f) != null && (listH = mediaInfo.H()) != null && !listH.isEmpty()) {
            for (C2260a c2260a : listH) {
                if (strH.equals(c2260a.M())) {
                    return c2260a;
                }
            }
        }
        return null;
    }

    public int K() {
        return this.f45497h;
    }

    public JSONObject L() {
        return this.f45509t;
    }

    public int M() {
        return this.f45500k;
    }

    public Integer N(int i9) {
        return (Integer) this.f45493C.get(i9);
    }

    public C2284p O(int i9) {
        Integer num = (Integer) this.f45493C.get(i9);
        if (num == null) {
            return null;
        }
        return (C2284p) this.f45511v.get(num.intValue());
    }

    public C2284p P(int i9) {
        if (i9 < 0 || i9 >= this.f45511v.size()) {
            return null;
        }
        return (C2284p) this.f45511v.get(i9);
    }

    public C2278j Q() {
        return this.f45515z;
    }

    public int R() {
        return this.f45506q;
    }

    public MediaInfo S() {
        return this.f45495f;
    }

    public double T() {
        return this.f45498i;
    }

    public int U() {
        return this.f45499j;
    }

    public int V() {
        return this.f45507r;
    }

    public C2283o W() {
        return this.f45491A;
    }

    public C2284p X(int i9) {
        return P(i9);
    }

    public C2284p Y(int i9) {
        return O(i9);
    }

    public int Z() {
        return this.f45511v.size();
    }

    public List a0() {
        return this.f45511v;
    }

    public int b0() {
        return this.f45510u;
    }

    public long c0() {
        return this.f45501l;
    }

    public double d0() {
        return this.f45503n;
    }

    public C2289v e0() {
        return this.f45514y;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return (this.f45509t == null) == (rVar.f45509t == null) && this.f45496g == rVar.f45496g && this.f45497h == rVar.f45497h && this.f45498i == rVar.f45498i && this.f45499j == rVar.f45499j && this.f45500k == rVar.f45500k && this.f45501l == rVar.f45501l && this.f45503n == rVar.f45503n && this.f45504o == rVar.f45504o && this.f45506q == rVar.f45506q && this.f45507r == rVar.f45507r && this.f45510u == rVar.f45510u && Arrays.equals(this.f45505p, rVar.f45505p) && AbstractC2774a.k(Long.valueOf(this.f45502m), Long.valueOf(rVar.f45502m)) && AbstractC2774a.k(this.f45511v, rVar.f45511v) && AbstractC2774a.k(this.f45495f, rVar.f45495f) && ((jSONObject = this.f45509t) == null || (jSONObject2 = rVar.f45509t) == null || C4.l.a(jSONObject, jSONObject2)) && this.f45512w == rVar.h0() && AbstractC2774a.k(this.f45513x, rVar.f45513x) && AbstractC2774a.k(this.f45514y, rVar.f45514y) && AbstractC2774a.k(this.f45515z, rVar.f45515z) && AbstractC1418q.b(this.f45491A, rVar.f45491A) && this.f45492B == rVar.f45492B;
    }

    public boolean f0(long j9) {
        return (j9 & this.f45502m) != 0;
    }

    public boolean g0() {
        return this.f45504o;
    }

    public boolean h0() {
        return this.f45512w;
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45495f, Long.valueOf(this.f45496g), Integer.valueOf(this.f45497h), Double.valueOf(this.f45498i), Integer.valueOf(this.f45499j), Integer.valueOf(this.f45500k), Long.valueOf(this.f45501l), Long.valueOf(this.f45502m), Double.valueOf(this.f45503n), Boolean.valueOf(this.f45504o), Integer.valueOf(Arrays.hashCode(this.f45505p)), Integer.valueOf(this.f45506q), Integer.valueOf(this.f45507r), String.valueOf(this.f45509t), Integer.valueOf(this.f45510u), this.f45511v, Boolean.valueOf(this.f45512w), this.f45513x, this.f45514y, this.f45515z, this.f45491A);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018c A[EDGE_INSN: B:101:0x018c->B:102:0x0190 BREAK  A[LOOP:0: B:95:0x017a->B:99:0x0187]] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i0(org.json.JSONObject r14, int r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.r.i0(org.json.JSONObject, int):int");
    }

    public final boolean j0() {
        MediaInfo mediaInfo = this.f45495f;
        return l0(this.f45499j, this.f45500k, this.f45506q, mediaInfo == null ? -1 : mediaInfo.T());
    }

    public final void k0(List list) {
        this.f45511v.clear();
        this.f45493C.clear();
        if (list != null) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                C2284p c2284p = (C2284p) list.get(i9);
                this.f45511v.add(c2284p);
                this.f45493C.put(c2284p.K(), Integer.valueOf(i9));
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f45509t;
        this.f45508s = jSONObject == null ? null : jSONObject.toString();
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 2, S(), i9, false);
        y4.c.o(parcel, 3, this.f45496g);
        y4.c.l(parcel, 4, K());
        y4.c.g(parcel, 5, T());
        y4.c.l(parcel, 6, U());
        y4.c.l(parcel, 7, M());
        y4.c.o(parcel, 8, c0());
        y4.c.o(parcel, 9, this.f45502m);
        y4.c.g(parcel, 10, d0());
        y4.c.c(parcel, 11, g0());
        y4.c.p(parcel, 12, H(), false);
        y4.c.l(parcel, 13, R());
        y4.c.l(parcel, 14, V());
        y4.c.t(parcel, 15, this.f45508s, false);
        y4.c.l(parcel, 16, this.f45510u);
        y4.c.x(parcel, 17, this.f45511v, false);
        y4.c.c(parcel, 18, h0());
        y4.c.r(parcel, 19, I(), i9, false);
        y4.c.r(parcel, 20, e0(), i9, false);
        y4.c.r(parcel, 21, Q(), i9, false);
        y4.c.r(parcel, 22, W(), i9, false);
        y4.c.b(parcel, iA);
    }

    public final long zzb() {
        return this.f45496g;
    }
}
