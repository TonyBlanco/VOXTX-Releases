package t4;

import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import n4.C2264c;
import n4.C2278j;
import n4.C2280l;
import n4.C2284p;
import org.achartengine.chart.TimeChart;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u4.AbstractC2853a;

/* JADX INFO: renamed from: t4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2791s extends z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f50734C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final x f50735A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final x f50736B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f50737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n4.r f50738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f50739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2789p f50740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f50741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f50742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f50743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f50744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f50745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f50746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x f50747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f50748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f50749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f50750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f50751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f50752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f50753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x f50754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f50755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x f50756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f50757y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x f50758z;

    static {
        Pattern pattern = AbstractC2774a.f50707a;
        f50734C = "urn:x-cast:com.google.cast.media";
    }

    public C2791s(String str) {
        super(f50734C, "MediaControlChannel", null);
        this.f50741i = -1;
        x xVar = new x(TimeChart.DAY);
        this.f50742j = xVar;
        x xVar2 = new x(TimeChart.DAY);
        this.f50743k = xVar2;
        x xVar3 = new x(TimeChart.DAY);
        this.f50744l = xVar3;
        x xVar4 = new x(TimeChart.DAY);
        this.f50745m = xVar4;
        x xVar5 = new x(10000L);
        this.f50746n = xVar5;
        x xVar6 = new x(TimeChart.DAY);
        this.f50747o = xVar6;
        x xVar7 = new x(TimeChart.DAY);
        this.f50748p = xVar7;
        x xVar8 = new x(TimeChart.DAY);
        this.f50749q = xVar8;
        x xVar9 = new x(TimeChart.DAY);
        this.f50750r = xVar9;
        x xVar10 = new x(TimeChart.DAY);
        this.f50751s = xVar10;
        x xVar11 = new x(TimeChart.DAY);
        this.f50752t = xVar11;
        x xVar12 = new x(TimeChart.DAY);
        this.f50753u = xVar12;
        x xVar13 = new x(TimeChart.DAY);
        this.f50754v = xVar13;
        x xVar14 = new x(TimeChart.DAY);
        this.f50755w = xVar14;
        x xVar15 = new x(TimeChart.DAY);
        this.f50756x = xVar15;
        x xVar16 = new x(TimeChart.DAY);
        this.f50758z = xVar16;
        this.f50757y = new x(TimeChart.DAY);
        x xVar17 = new x(TimeChart.DAY);
        this.f50735A = xVar17;
        x xVar18 = new x(TimeChart.DAY);
        this.f50736B = xVar18;
        h(xVar);
        h(xVar2);
        h(xVar3);
        h(xVar4);
        h(xVar5);
        h(xVar6);
        h(xVar7);
        h(xVar8);
        h(xVar9);
        h(xVar10);
        h(xVar11);
        h(xVar12);
        h(xVar13);
        h(xVar14);
        h(xVar15);
        h(xVar16);
        h(xVar16);
        h(xVar17);
        h(xVar18);
        w();
    }

    public static int[] D(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            iArr[i9] = jSONArray.getInt(i9);
        }
        return iArr;
    }

    public static r v(JSONObject jSONObject) {
        MediaError mediaErrorL = MediaError.L(jSONObject);
        r rVar = new r();
        Pattern pattern = AbstractC2774a.f50707a;
        rVar.f50732a = jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null;
        rVar.f50733b = mediaErrorL;
        return rVar;
    }

    public final void A() {
        InterfaceC2789p interfaceC2789p = this.f50740h;
        if (interfaceC2789p != null) {
            interfaceC2789p.zzk();
        }
    }

    public final void B() {
        InterfaceC2789p interfaceC2789p = this.f50740h;
        if (interfaceC2789p != null) {
            interfaceC2789p.zzm();
        }
    }

    public final boolean C() {
        return this.f50741i != -1;
    }

    public final long F() {
        n4.r rVar;
        C2264c c2264cI;
        if (this.f50737e == 0 || (rVar = this.f50738f) == null || (c2264cI = rVar.I()) == null) {
            return 0L;
        }
        double dT = rVar.T();
        if (dT == 0.0d) {
            dT = 1.0d;
        }
        return u(rVar.U() != 2 ? 0.0d : dT, c2264cI.J(), 0L);
    }

    public final long G() {
        C2278j c2278jQ;
        n4.r rVar = this.f50738f;
        if (rVar == null || (c2278jQ = rVar.Q()) == null) {
            return 0L;
        }
        long jH = c2278jQ.H();
        return !c2278jQ.J() ? u(1.0d, jH, -1L) : jH;
    }

    public final long H() {
        C2278j c2278jQ;
        n4.r rVar = this.f50738f;
        if (rVar == null || (c2278jQ = rVar.Q()) == null) {
            return 0L;
        }
        long jI = c2278jQ.I();
        if (c2278jQ.K()) {
            jI = u(1.0d, jI, -1L);
        }
        return c2278jQ.J() ? Math.min(jI, c2278jQ.H()) : jI;
    }

    public final long I() {
        n4.r rVar;
        MediaInfo mediaInfoN = n();
        if (mediaInfoN == null || (rVar = this.f50738f) == null) {
            return 0L;
        }
        Long l9 = this.f50739g;
        if (l9 == null) {
            if (this.f50737e == 0) {
                return 0L;
            }
            double dT = rVar.T();
            long jC0 = rVar.c0();
            return (dT == 0.0d || rVar.U() != 2) ? jC0 : u(dT, jC0, mediaInfoN.S());
        }
        if (l9.equals(4294967296000L)) {
            if (this.f50738f.Q() != null) {
                return Math.min(l9.longValue(), G());
            }
            if (K() >= 0) {
                return Math.min(l9.longValue(), K());
            }
        }
        return l9.longValue();
    }

    public final long J() throws C2790q {
        n4.r rVar = this.f50738f;
        if (rVar != null) {
            return rVar.zzb();
        }
        throw new C2790q();
    }

    public final long K() {
        MediaInfo mediaInfoN = n();
        if (mediaInfoN != null) {
            return mediaInfoN.S();
        }
        return 0L;
    }

    public final long L(v vVar, C2280l c2280l) {
        if (c2280l.M() == null && c2280l.O() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject jSONObjectQ = c2280l.Q();
        if (jSONObjectQ == null) {
            throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
        }
        long jA = a();
        try {
            jSONObjectQ.put("requestId", jA);
            jSONObjectQ.put("type", "LOAD");
        } catch (JSONException unused) {
        }
        d(jSONObjectQ.toString(), jA, null);
        this.f50742j.b(jA, vVar);
        return jA;
    }

    public final long M(v vVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long jA = a();
        try {
            jSONObject2.put("requestId", jA);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", J());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jA, null);
        this.f50743k.b(jA, vVar);
        return jA;
    }

    public final long N(v vVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long jA = a();
        try {
            jSONObject2.put("requestId", jA);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", J());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jA, null);
        this.f50744l.b(jA, vVar);
        return jA;
    }

    public final long O(v vVar) {
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", J());
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA, null);
        this.f50756x.b(jA, vVar);
        return jA;
    }

    public final long P(v vVar, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", J());
            JSONArray jSONArray = new JSONArray();
            for (int i9 : iArr) {
                jSONArray.put(i9);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA, null);
        this.f50757y.b(jA, vVar);
        return jA;
    }

    public final long Q(v vVar, C2284p[] c2284pArr, int i9, int i10, long j9, JSONObject jSONObject) {
        int length;
        String strB;
        if (c2284pArr == null || (length = c2284pArr.length) == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        if (i9 < 0 || i9 >= length) {
            throw new IllegalArgumentException("Invalid startIndex: " + i9);
        }
        if (j9 != -1 && j9 < 0) {
            throw new IllegalArgumentException("playPosition can not be negative: " + j9);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jA = a();
        this.f50742j.b(jA, vVar);
        try {
            jSONObject2.put("requestId", jA);
            jSONObject2.put("type", "QUEUE_LOAD");
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < c2284pArr.length; i11++) {
                jSONArray.put(i11, c2284pArr[i11].Q());
            }
            jSONObject2.put("items", jSONArray);
            strB = AbstractC2853a.b(Integer.valueOf(i10));
        } catch (JSONException unused) {
        }
        if (strB == null) {
            throw new IllegalArgumentException("Invalid repeat mode: " + i10);
        }
        jSONObject2.put("repeatMode", strB);
        jSONObject2.put("startIndex", i9);
        if (j9 != -1) {
            jSONObject2.put("currentTime", AbstractC2774a.b(j9));
        }
        if (jSONObject != null) {
            jSONObject2.put("customData", jSONObject);
        }
        if (C()) {
            jSONObject2.put("sequenceNumber", this.f50741i);
        }
        d(jSONObject2.toString(), jA, null);
        return jA;
    }

    public final long R(v vVar, int[] iArr, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long jA = a();
        try {
            jSONObject2.put("requestId", jA);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", J());
            JSONArray jSONArray = new JSONArray();
            for (int i9 = 0; i9 < iArr.length; i9++) {
                jSONArray.put(i9, iArr[i9]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (C()) {
                jSONObject2.put("sequenceNumber", this.f50741i);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jA, null);
        this.f50754v.b(jA, new C2788o(this, vVar));
        return jA;
    }

    public final long S(v vVar, int[] iArr, int i9, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long jA = a();
        try {
            jSONObject2.put("requestId", jA);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", J());
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jSONArray.put(i10, iArr[i10]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i9 != 0) {
                jSONObject2.put("insertBefore", i9);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (C()) {
                jSONObject2.put("sequenceNumber", this.f50741i);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jA, null);
        this.f50755w.b(jA, new C2788o(this, vVar));
        return jA;
    }

    @Override // t4.J
    public final void c() {
        g();
        w();
    }

    public final long i(v vVar, int i9, long j9, C2284p[] c2284pArr, int i10, Boolean bool, Integer num, JSONObject jSONObject) {
        if (j9 != -1 && j9 < 0) {
            throw new IllegalArgumentException("playPosition cannot be negative: " + j9);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jA = a();
        try {
            jSONObject2.put("requestId", jA);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", J());
            if (i9 != 0) {
                jSONObject2.put("currentItemId", i9);
            }
            if (i10 != 0) {
                jSONObject2.put("jump", i10);
            }
            if (c2284pArr != null && c2284pArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < c2284pArr.length; i11++) {
                    jSONArray.put(i11, c2284pArr[i11].Q());
                }
                jSONObject2.put("items", jSONArray);
            }
            if (bool != null) {
                jSONObject2.put("shuffle", bool);
            }
            String strB = AbstractC2853a.b(num);
            if (strB != null) {
                jSONObject2.put("repeatMode", strB);
            }
            if (j9 != -1) {
                jSONObject2.put("currentTime", AbstractC2774a.b(j9));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (C()) {
                jSONObject2.put("sequenceNumber", this.f50741i);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), jA, null);
        this.f50753u.b(jA, new C2788o(this, vVar));
        return jA;
    }

    public final long j(v vVar) {
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "GET_STATUS");
            n4.r rVar = this.f50738f;
            if (rVar != null) {
                jSONObject.put("mediaSessionId", rVar.zzb());
            }
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA, null);
        this.f50749q.b(jA, vVar);
        return jA;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: JSONException -> 0x005f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x005f, blocks: (B:6:0x0019, B:10:0x0042, B:14:0x0050, B:16:0x0056, B:11:0x0046), top: B:20:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(t4.v r9, n4.C2285q r10) {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            long r1 = r8.a()
            boolean r3 = r10.d()
            if (r3 == 0) goto L15
            r3 = 4294967296000(0x3e800000000, double:2.1219957909653E-311)
            goto L19
        L15:
            long r3 = r10.b()
        L19:
            java.lang.String r5 = "requestId"
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L5f
            java.lang.String r5 = "type"
            java.lang.String r6 = "SEEK"
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L5f
            java.lang.String r5 = "mediaSessionId"
            long r6 = r8.J()     // Catch: org.json.JSONException -> L5f
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L5f
            java.lang.String r5 = "currentTime"
            double r6 = t4.AbstractC2774a.b(r3)     // Catch: org.json.JSONException -> L5f
            r0.put(r5, r6)     // Catch: org.json.JSONException -> L5f
            int r5 = r10.c()     // Catch: org.json.JSONException -> L5f
            r6 = 1
            java.lang.String r7 = "resumeState"
            if (r5 != r6) goto L46
            java.lang.String r5 = "PLAYBACK_START"
        L42:
            r0.put(r7, r5)     // Catch: org.json.JSONException -> L5f
            goto L50
        L46:
            int r5 = r10.c()     // Catch: org.json.JSONException -> L5f
            r6 = 2
            if (r5 != r6) goto L50
            java.lang.String r5 = "PLAYBACK_PAUSE"
            goto L42
        L50:
            org.json.JSONObject r5 = r10.a()     // Catch: org.json.JSONException -> L5f
            if (r5 == 0) goto L5f
            java.lang.String r5 = "customData"
            org.json.JSONObject r10 = r10.a()     // Catch: org.json.JSONException -> L5f
            r0.put(r5, r10)     // Catch: org.json.JSONException -> L5f
        L5f:
            java.lang.String r10 = r0.toString()
            r0 = 0
            r8.d(r10, r1, r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            r8.f50739g = r10
            t4.x r10 = r8.f50746n
            t4.n r0 = new t4.n
            r0.<init>(r8, r9)
            r10.b(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C2791s.k(t4.v, n4.q):long");
    }

    public final long l(v vVar, long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", J());
            JSONArray jSONArray = new JSONArray();
            for (int i9 = 0; i9 < jArr.length; i9++) {
                jSONArray.put(i9, jArr[i9]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), jA, null);
        this.f50750r.b(jA, vVar);
        return jA;
    }

    public final long m(v vVar) {
        JSONObject jSONObject = new JSONObject();
        long jA = a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "SKIP_AD");
            jSONObject.put("mediaSessionId", J());
        } catch (JSONException e9) {
            this.f50654a.f(String.format(Locale.ROOT, "Error creating SkipAd message: %s", e9.getMessage()), new Object[0]);
        }
        d(jSONObject.toString(), jA, null);
        this.f50736B.b(jA, vVar);
        return jA;
    }

    public final MediaInfo n() {
        n4.r rVar = this.f50738f;
        if (rVar == null) {
            return null;
        }
        return rVar.S();
    }

    public final n4.r o() {
        return this.f50738f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025e A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0268 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027b A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028b A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0298 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a2 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b1 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b8 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c9 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:38:0x0094, B:40:0x00a0, B:41:0x00ad, B:43:0x00b3, B:46:0x00c7, B:48:0x00cd, B:50:0x00d9, B:52:0x00ed, B:73:0x0128, B:75:0x013d, B:77:0x0159, B:79:0x015f, B:81:0x0165, B:83:0x016b, B:85:0x0171, B:87:0x017d, B:89:0x0187, B:91:0x018d, B:92:0x0195, B:94:0x019b, B:95:0x01ab, B:98:0x01b1, B:100:0x01bb, B:101:0x01cc, B:103:0x01d2, B:104:0x01e2, B:106:0x01ee, B:108:0x01fa, B:109:0x020b, B:111:0x0211, B:112:0x0221, B:114:0x022d, B:116:0x023f, B:127:0x025e, B:130:0x0263, B:132:0x0277, B:134:0x027b, B:135:0x0287, B:137:0x028b, B:138:0x0294, B:140:0x0298, B:141:0x029e, B:143:0x02a2, B:144:0x02a5, B:146:0x02aa, B:147:0x02ad, B:149:0x02b1, B:150:0x02b4, B:152:0x02b8, B:154:0x02c2, B:155:0x02c5, B:157:0x02c9, B:159:0x02e1, B:160:0x02e9, B:162:0x02ef, B:131:0x0268, B:120:0x024a, B:122:0x0252, B:158:0x02d3), top: B:167:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C2791s.r(java.lang.String):void");
    }

    public final void s(long j9, int i9) {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((x) it.next()).d(j9, i9, null);
        }
    }

    public final void t(InterfaceC2789p interfaceC2789p) {
        this.f50740h = interfaceC2789p;
    }

    public final long u(double d9, long j9, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f50737e;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j9;
        }
        long j11 = j9 + ((long) (jElapsedRealtime * d9));
        if (j10 > 0 && j11 > j10) {
            return j10;
        }
        if (j11 >= 0) {
            return j11;
        }
        return 0L;
    }

    public final void w() {
        this.f50737e = 0L;
        this.f50738f = null;
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((x) it.next()).c(AdError.CACHE_ERROR_CODE);
        }
    }

    public final void x(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f50741i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.f50654a.f(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void y() {
        InterfaceC2789p interfaceC2789p = this.f50740h;
        if (interfaceC2789p != null) {
            interfaceC2789p.zzc();
        }
    }

    public final void z() {
        InterfaceC2789p interfaceC2789p = this.f50740h;
        if (interfaceC2789p != null) {
            interfaceC2789p.zzd();
        }
    }
}
