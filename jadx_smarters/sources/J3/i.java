package J3;

import J3.f;
import J3.g;
import O2.AbstractC0904o;
import O2.C0897l1;
import V2.C1056m;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import b4.I;
import com.amplifyframework.core.model.ModelIdentifier;
import d4.AbstractC1684a;
import d4.b0;
import d4.k0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l3.AbstractC2187l;
import okio.Segment;
import org.apache.http.protocol.HTTP;
import s5.D;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements I.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f3246a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f3247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f3220d = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f3221e = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f3223f = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f3225g = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f3227h = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f3228i = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f3229j = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f3230k = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f3231l = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f3232m = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f3233n = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f3234o = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f3235p = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f3236q = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f3237r = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f3238s = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f3239t = c("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f3240u = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f3241v = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f3242w = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f3243x = c("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f3244y = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f3245z = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pattern f3194A = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Pattern f3195B = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Pattern f3196C = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Pattern f3197D = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Pattern f3198E = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Pattern f3199F = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Pattern f3200G = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Pattern f3201H = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Pattern f3202I = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Pattern f3203J = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Pattern f3204K = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Pattern f3205L = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Pattern f3206M = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Pattern f3207N = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Pattern f3208O = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Pattern f3209P = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Pattern f3210Q = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Pattern f3211R = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Pattern f3212S = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Pattern f3213T = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Pattern f3214U = c("AUTOSELECT");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final Pattern f3215V = c("DEFAULT");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Pattern f3216W = c("FORCED");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Pattern f3217X = c("INDEPENDENT");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Pattern f3218Y = c("GAP");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Pattern f3219Z = c("PRECISE");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f3222e0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f3224f0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f3226g0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class a extends IOException {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BufferedReader f3248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue f3249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3250c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f3249b = queue;
            this.f3248a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f3250c != null) {
                return true;
            }
            if (!this.f3249b.isEmpty()) {
                this.f3250c = (String) AbstractC1684a.e((String) this.f3249b.poll());
                return true;
            }
            do {
                String line = this.f3248a.readLine();
                this.f3250c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f3250c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f3250c;
            this.f3250c = null;
            return str;
        }
    }

    public i() {
        this(g.f3170n, null);
    }

    public i(g gVar, f fVar) {
        this.f3246a = gVar;
        this.f3247c = fVar;
    }

    public static long A(String str, Pattern pattern) {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    public static String B(String str, Map map) {
        Matcher matcher = f3226g0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int C(BufferedReader bufferedReader, boolean z9, int i9) throws IOException {
        while (i9 != -1 && Character.isWhitespace(i9) && (z9 || !k0.E0(i9))) {
            i9 = bufferedReader.read();
        }
        return i9;
    }

    public static boolean b(BufferedReader bufferedReader) throws IOException {
        int i9 = bufferedReader.read();
        if (i9 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i9 = bufferedReader.read();
        }
        int iC = C(bufferedReader, true, i9);
        for (int i10 = 0; i10 < 7; i10++) {
            if (iC != "#EXTM3U".charAt(i10)) {
                return false;
            }
            iC = bufferedReader.read();
        }
        return k0.E0(C(bufferedReader, false, iC));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static C1056m d(String str, C1056m.b[] bVarArr) {
        C1056m.b[] bVarArr2 = new C1056m.b[bVarArr.length];
        for (int i9 = 0; i9 < bVarArr.length; i9++) {
            bVarArr2[i9] = bVarArr[i9].c(null);
        }
        return new C1056m(str, bVarArr2);
    }

    public static String e(long j9, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j9);
    }

    public static g.b f(ArrayList arrayList, String str) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            g.b bVar = (g.b) arrayList.get(i9);
            if (str.equals(bVar.f3188d)) {
                return bVar;
            }
        }
        return null;
    }

    public static g.b g(ArrayList arrayList, String str) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            g.b bVar = (g.b) arrayList.get(i9);
            if (str.equals(bVar.f3189e)) {
                return bVar;
            }
        }
        return null;
    }

    public static g.b h(ArrayList arrayList, String str) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            g.b bVar = (g.b) arrayList.get(i9);
            if (str.equals(bVar.f3187c)) {
                return bVar;
            }
        }
        return null;
    }

    public static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    public static C1056m.b k(String str, String str2, Map map) throws C0897l1 {
        String strU = u(str, f3204K, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strZ = z(str, f3205L, map);
            return new C1056m.b(AbstractC0904o.f6140d, "video/mp4", Base64.decode(strZ.substring(strZ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C1056m.b(AbstractC0904o.f6140d, "hls", k0.s0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strU)) {
            return null;
        }
        String strZ2 = z(str, f3205L, map);
        byte[] bArrDecode = Base64.decode(strZ2.substring(strZ2.indexOf(44)), 0);
        UUID uuid = AbstractC0904o.f6141e;
        return new C1056m.b(uuid, "video/mp4", AbstractC2187l.a(uuid, bArrDecode));
    }

    public static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    public static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f o(g gVar, f fVar, b bVar, String str) throws C0897l1, a {
        String strZ;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        long j9;
        int i9;
        f.b bVar2;
        int i10;
        String strV;
        long j10;
        long j11;
        Object c1056m;
        long j12;
        long j13;
        g gVar2 = gVar;
        f fVar2 = fVar;
        boolean z9 = gVar2.f3193c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        f.C0052f c0052f = new f.C0052f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z10 = false;
        String str3 = "";
        boolean z11 = z9;
        f.C0052f c0052fY = c0052f;
        String strU = str3;
        int i11 = 0;
        String strZ2 = null;
        long j14 = -9223372036854775807L;
        boolean zQ = false;
        long jP0 = 0;
        boolean z12 = false;
        int i12 = 0;
        long j15 = 0;
        int iM = 1;
        long jM = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        boolean z13 = false;
        C1056m c1056mD = null;
        long j17 = 0;
        Object obj = null;
        long j18 = 0;
        boolean z14 = false;
        long j19 = -1;
        String str4 = null;
        String strL = null;
        int i13 = 0;
        long j20 = 0;
        long jN = 0;
        boolean z15 = false;
        f.d dVar = null;
        long jA = 0;
        long j21 = 0;
        ArrayList arrayList7 = arrayList4;
        f.b bVar3 = null;
        while (bVar.a()) {
            String strB = bVar.b();
            if (strB.startsWith("#EXT")) {
                arrayList6.add(strB);
            }
            if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strZ3 = z(strB, f3237r, map);
                if ("VOD".equals(strZ3)) {
                    i11 = 1;
                } else if ("EVENT".equals(strZ3)) {
                    i11 = 2;
                }
            } else if (strB.equals("#EXT-X-I-FRAMES-ONLY")) {
                z15 = true;
            } else if (strB.startsWith("#EXT-X-START")) {
                j14 = (long) (j(strB, f3197D) * 1000000.0d);
                zQ = q(strB, f3219Z, z10);
            } else if (strB.startsWith("#EXT-X-SERVER-CONTROL")) {
                c0052fY = y(strB);
            } else if (strB.startsWith("#EXT-X-PART-INF")) {
                j16 = (long) (j(strB, f3235p) * 1000000.0d);
            } else if (strB.startsWith("#EXT-X-MAP")) {
                String strZ4 = z(strB, f3205L, map);
                String strV2 = v(strB, f3199F, map);
                if (strV2 != null) {
                    String[] strArrI1 = k0.i1(strV2, "@");
                    j19 = Long.parseLong(strArrI1[z10 ? 1 : 0]);
                    if (strArrI1.length > 1) {
                        j17 = Long.parseLong(strArrI1[1]);
                    }
                }
                if (j19 == -1) {
                    j17 = 0;
                }
                String str5 = str4;
                if (strZ2 != null && str5 == null) {
                    throw C0897l1.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                dVar = new f.d(strZ4, j17, j19, strZ2, str5);
                if (j19 != -1) {
                    j17 += j19;
                }
                str4 = str5;
                j19 = -1;
            } else {
                String str6 = str4;
                if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                    jM = 1000000 * ((long) m(strB, f3233n));
                } else {
                    if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        jN = n(strB, f3244y);
                        str4 = str6;
                        j15 = jN;
                    } else if (strB.startsWith("#EXT-X-VERSION")) {
                        iM = m(strB, f3236q);
                    } else {
                        if (strB.startsWith("#EXT-X-DEFINE")) {
                            String strV3 = v(strB, f3224f0, map);
                            if (strV3 != null) {
                                strZ = (String) gVar2.f3179l.get(strV3);
                                if (strZ != null) {
                                }
                                arrayList = arrayList7;
                                arrayList2 = arrayList6;
                                str2 = strL;
                                j9 = jN;
                                i9 = i11;
                            } else {
                                strV3 = z(strB, f3210Q, map);
                                strZ = z(strB, f3222e0, map);
                            }
                            map.put(strV3, strZ);
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            str2 = strL;
                            j9 = jN;
                            i9 = i11;
                        } else if (strB.startsWith("#EXTINF")) {
                            jA = A(strB, f3245z);
                            strU = u(strB, f3194A, str3, map);
                        } else {
                            String str7 = str3;
                            if (strB.startsWith("#EXT-X-SKIP")) {
                                int iM2 = m(strB, f3240u);
                                AbstractC1684a.g(fVar2 != null && arrayList3.isEmpty());
                                int i14 = (int) (j15 - ((f) k0.j(fVar)).f3135k);
                                int i15 = iM2 + i14;
                                if (i14 < 0 || i15 > fVar2.f3142r.size()) {
                                    throw new a();
                                }
                                str3 = str7;
                                String str8 = str6;
                                long j22 = j20;
                                while (i14 < i15) {
                                    f.d dVarB = (f.d) fVar2.f3142r.get(i14);
                                    ArrayList arrayList8 = arrayList7;
                                    ArrayList arrayList9 = arrayList6;
                                    if (j15 != fVar2.f3135k) {
                                        dVarB = dVarB.b(j22, (fVar2.f3134j - i12) + dVarB.f3157e);
                                    }
                                    arrayList3.add(dVarB);
                                    j22 += dVarB.f3156d;
                                    long j23 = dVarB.f3163k;
                                    if (j23 != -1) {
                                        i10 = i15;
                                        j17 = dVarB.f3162j + j23;
                                    } else {
                                        i10 = i15;
                                    }
                                    int i16 = dVarB.f3157e;
                                    f.d dVar2 = dVarB.f3155c;
                                    C1056m c1056m2 = dVarB.f3159g;
                                    String str9 = dVarB.f3160h;
                                    String str10 = dVarB.f3161i;
                                    if (str10 == null || !str10.equals(Long.toHexString(jN))) {
                                        str8 = dVarB.f3161i;
                                    }
                                    jN++;
                                    i14++;
                                    fVar2 = fVar;
                                    obj = c1056m2;
                                    strZ2 = str9;
                                    j18 = j22;
                                    i15 = i10;
                                    i13 = i16;
                                    dVar = dVar2;
                                    arrayList7 = arrayList8;
                                    arrayList6 = arrayList9;
                                }
                                gVar2 = gVar;
                                fVar2 = fVar;
                                j20 = j22;
                                str4 = str8;
                            } else {
                                ArrayList arrayList10 = arrayList7;
                                arrayList2 = arrayList6;
                                str3 = str7;
                                if (strB.startsWith("#EXT-X-KEY")) {
                                    String strZ5 = z(strB, f3202I, map);
                                    String strU2 = u(strB, f3203J, HTTP.IDENTITY_CODING, map);
                                    if ("NONE".equals(strZ5)) {
                                        treeMap.clear();
                                        strV = null;
                                        strZ2 = null;
                                    } else {
                                        strV = v(strB, f3206M, map);
                                        if (HTTP.IDENTITY_CODING.equals(strU2)) {
                                            if ("AES-128".equals(strZ5)) {
                                                strZ2 = z(strB, f3205L, map);
                                            }
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            str4 = strV;
                                        } else {
                                            String str11 = strL;
                                            strL = str11 == null ? l(strZ5) : str11;
                                            C1056m.b bVarK = k(strB, strU2, map);
                                            if (bVarK != null) {
                                                treeMap.put(strU2, bVarK);
                                                strZ2 = null;
                                            }
                                        }
                                        strZ2 = null;
                                        gVar2 = gVar;
                                        fVar2 = fVar;
                                        str4 = strV;
                                    }
                                    obj = strZ2;
                                    gVar2 = gVar;
                                    fVar2 = fVar;
                                    str4 = strV;
                                } else {
                                    String str12 = strL;
                                    if (strB.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] strArrI12 = k0.i1(z(strB, f3198E, map), "@");
                                        j19 = Long.parseLong(strArrI12[0]);
                                        if (strArrI12.length > 1) {
                                            j17 = Long.parseLong(strArrI12[1]);
                                        }
                                    } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i12 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                        gVar2 = gVar;
                                        fVar2 = fVar;
                                        strL = str12;
                                        str4 = str6;
                                        arrayList7 = arrayList10;
                                        arrayList6 = arrayList2;
                                        z10 = false;
                                        z12 = true;
                                    } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                                        i13++;
                                    } else {
                                        if (strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jP0 == 0) {
                                                jP0 = k0.P0(k0.W0(strB.substring(strB.indexOf(58) + 1))) - j20;
                                            } else {
                                                i9 = i11;
                                                str2 = str12;
                                            }
                                        } else if (strB.equals("#EXT-X-GAP")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            strL = str12;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z10 = false;
                                            z14 = true;
                                        } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            strL = str12;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z10 = false;
                                            z11 = true;
                                        } else if (strB.equals("#EXT-X-ENDLIST")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            strL = str12;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z10 = false;
                                            z13 = true;
                                        } else if (strB.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            i9 = i11;
                                            str2 = str12;
                                            arrayList5.add(new f.c(Uri.parse(b0.d(str, z(strB, f3205L, map))), t(strB, f3195B, -1L), s(strB, f3196C, -1)));
                                        } else {
                                            i9 = i11;
                                            str2 = str12;
                                            if (!strB.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j9 = jN;
                                                if (strB.startsWith("#EXT-X-PART")) {
                                                    String strE = e(j9, strZ2, str6);
                                                    String strZ6 = z(strB, f3205L, map);
                                                    long j24 = (long) (j(strB, f3234o) * 1000000.0d);
                                                    bVar2 = bVar3;
                                                    boolean zQ2 = q(strB, f3217X, false) | (z11 && arrayList10.isEmpty());
                                                    boolean zQ3 = q(strB, f3218Y, false);
                                                    String strV4 = v(strB, f3199F, map);
                                                    if (strV4 != null) {
                                                        String[] strArrI13 = k0.i1(strV4, "@");
                                                        j13 = Long.parseLong(strArrI13[0]);
                                                        if (strArrI13.length > 1) {
                                                            j21 = Long.parseLong(strArrI13[1]);
                                                        }
                                                        j12 = -1;
                                                    } else {
                                                        j12 = -1;
                                                        j13 = -1;
                                                    }
                                                    if (j13 == j12) {
                                                        j21 = 0;
                                                    }
                                                    if (obj == null && !treeMap.isEmpty()) {
                                                        C1056m.b[] bVarArr = (C1056m.b[]) treeMap.values().toArray(new C1056m.b[0]);
                                                        C1056m c1056m3 = new C1056m(str2, bVarArr);
                                                        if (c1056mD == null) {
                                                            c1056mD = d(str2, bVarArr);
                                                        }
                                                        obj = c1056m3;
                                                    }
                                                    arrayList = arrayList10;
                                                    arrayList.add(new f.b(strZ6, dVar, j24, i13, j18, obj, strZ2, strE, j21, j13, zQ3, zQ2, false));
                                                    j18 += j24;
                                                    if (j13 != j12) {
                                                        j21 += j13;
                                                    }
                                                } else {
                                                    bVar2 = bVar3;
                                                    arrayList = arrayList10;
                                                    if (!strB.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
                                                        String strE2 = e(j9, strZ2, str6);
                                                        long j25 = j9 + 1;
                                                        String strB2 = B(strB, map);
                                                        f.d dVar3 = (f.d) map2.get(strB2);
                                                        if (j19 == -1) {
                                                            j10 = 0;
                                                        } else {
                                                            if (z15 && dVar == null && dVar3 == null) {
                                                                dVar3 = new f.d(strB2, 0L, j17, null, null);
                                                                map2.put(strB2, dVar3);
                                                            }
                                                            j10 = j17;
                                                        }
                                                        if (obj != null || treeMap.isEmpty()) {
                                                            j11 = j25;
                                                            c1056m = obj;
                                                        } else {
                                                            j11 = j25;
                                                            C1056m.b[] bVarArr2 = (C1056m.b[]) treeMap.values().toArray(new C1056m.b[0]);
                                                            c1056m = new C1056m(str2, bVarArr2);
                                                            if (c1056mD == null) {
                                                                c1056mD = d(str2, bVarArr2);
                                                            }
                                                        }
                                                        arrayList3.add(new f.d(strB2, dVar != null ? dVar : dVar3, strU, jA, i13, j20, c1056m, strZ2, strE2, j10, j19, z14, arrayList));
                                                        j18 = j20 + jA;
                                                        arrayList7 = new ArrayList();
                                                        if (j19 != -1) {
                                                            j10 += j19;
                                                        }
                                                        j17 = j10;
                                                        gVar2 = gVar;
                                                        fVar2 = fVar;
                                                        str4 = str6;
                                                        obj = c1056m;
                                                        strU = str3;
                                                        j20 = j18;
                                                        i11 = i9;
                                                        bVar3 = bVar2;
                                                        arrayList6 = arrayList2;
                                                        z14 = false;
                                                        j19 = -1;
                                                        jA = 0;
                                                        strL = str2;
                                                        jN = j11;
                                                    }
                                                }
                                                gVar2 = gVar;
                                                fVar2 = fVar;
                                                str4 = str6;
                                                i11 = i9;
                                                bVar3 = bVar2;
                                                jN = j9;
                                                strL = str2;
                                                arrayList7 = arrayList;
                                                arrayList6 = arrayList2;
                                            } else if (bVar3 == null && "PART".equals(z(strB, f3208O, map))) {
                                                String strZ7 = z(strB, f3205L, map);
                                                long jT = t(strB, f3200G, -1L);
                                                long jT2 = t(strB, f3201H, -1L);
                                                long j26 = jN;
                                                String strE3 = e(j26, strZ2, str6);
                                                if (obj == null && !treeMap.isEmpty()) {
                                                    C1056m.b[] bVarArr3 = (C1056m.b[]) treeMap.values().toArray(new C1056m.b[0]);
                                                    C1056m c1056m4 = new C1056m(str2, bVarArr3);
                                                    if (c1056mD == null) {
                                                        c1056mD = d(str2, bVarArr3);
                                                    }
                                                    obj = c1056m4;
                                                }
                                                if (jT == -1 || jT2 != -1) {
                                                    bVar3 = new f.b(strZ7, dVar, 0L, i13, j18, obj, strZ2, strE3, jT != -1 ? jT : 0L, jT2, false, false, true);
                                                }
                                                gVar2 = gVar;
                                                fVar2 = fVar;
                                                jN = j26;
                                                str4 = str6;
                                                arrayList7 = arrayList10;
                                                i11 = i9;
                                                arrayList6 = arrayList2;
                                                strL = str2;
                                            }
                                        }
                                        arrayList = arrayList10;
                                        j9 = jN;
                                    }
                                    gVar2 = gVar;
                                    fVar2 = fVar;
                                    strL = str12;
                                    str4 = str6;
                                }
                                arrayList7 = arrayList10;
                                arrayList6 = arrayList2;
                            }
                        }
                        bVar2 = bVar3;
                        gVar2 = gVar;
                        fVar2 = fVar;
                        str4 = str6;
                        i11 = i9;
                        bVar3 = bVar2;
                        jN = j9;
                        strL = str2;
                        arrayList7 = arrayList;
                        arrayList6 = arrayList2;
                    }
                    z10 = false;
                }
                str4 = str6;
                z10 = false;
            }
        }
        int i17 = i11;
        f.b bVar4 = bVar3;
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList6;
        HashMap map3 = new HashMap();
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            f.c cVar = (f.c) arrayList5.get(i18);
            long size = cVar.f3150b;
            if (size == -1) {
                size = (j15 + ((long) arrayList3.size())) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = cVar.f3151c;
            if (size2 == -1 && j16 != -9223372036854775807L) {
                size2 = (arrayList11.isEmpty() ? ((f.d) D.d(arrayList3)).f3153n : arrayList11).size() - 1;
            }
            Uri uri = cVar.f3149a;
            map3.put(uri, new f.c(uri, size, size2));
        }
        if (bVar4 != null) {
            arrayList11.add(bVar4);
        }
        return new f(i17, str, arrayList12, j14, zQ, jP0, z12, i12, j15, iM, jM, j16, z11, z13, jP0 != 0, c1056mD, arrayList3, arrayList11, c0052fY, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x033d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static J3.g p(J3.i.b r37, java.lang.String r38) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.i.p(J3.i$b, java.lang.String):J3.g");
    }

    public static boolean q(String str, Pattern pattern, boolean z9) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z9;
    }

    public static double r(String str, Pattern pattern, double d9) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) AbstractC1684a.e(matcher.group(1))) : d9;
    }

    public static int s(String str, Pattern pattern, int i9) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) AbstractC1684a.e(matcher.group(1))) : i9;
    }

    public static long t(String str, Pattern pattern, long j9) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) AbstractC1684a.e(matcher.group(1))) : j9;
    }

    public static String u(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) AbstractC1684a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    public static String v(String str, Pattern pattern, Map map) {
        return u(str, pattern, null, map);
    }

    public static int w(String str, Map map) {
        String strV = v(str, f3212S, map);
        if (TextUtils.isEmpty(strV)) {
            return 0;
        }
        String[] strArrI1 = k0.i1(strV, ",");
        int i9 = k0.t(strArrI1, "public.accessibility.describes-video") ? IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED : 0;
        if (k0.t(strArrI1, "public.accessibility.transcribes-spoken-dialog")) {
            i9 |= 4096;
        }
        if (k0.t(strArrI1, "public.accessibility.describes-music-and-sound")) {
            i9 |= 1024;
        }
        return k0.t(strArrI1, "public.easy-to-read") ? i9 | Segment.SIZE : i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int x(String str) {
        boolean zQ = q(str, f3215V, false);
        ?? r02 = zQ;
        if (q(str, f3216W, false)) {
            r02 = (zQ ? 1 : 0) | 2;
        }
        return q(str, f3214U, false) ? r02 | 4 : r02;
    }

    public static f.C0052f y(String str) {
        double dR = r(str, f3238s, -9.223372036854776E18d);
        long j9 = dR == -9.223372036854776E18d ? -9223372036854775807L : (long) (dR * 1000000.0d);
        boolean zQ = q(str, f3239t, false);
        double dR2 = r(str, f3241v, -9.223372036854776E18d);
        long j10 = dR2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dR2 * 1000000.0d);
        double dR3 = r(str, f3242w, -9.223372036854776E18d);
        return new f.C0052f(j9, zQ, j10, dR3 != -9.223372036854776E18d ? (long) (dR3 * 1000000.0d) : -9223372036854775807L, q(str, f3243x, false));
    }

    public static String z(String str, Pattern pattern, Map map) throws C0897l1 {
        String strV = v(str, pattern, map);
        if (strV != null) {
            return strV;
        }
        throw C0897l1.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // b4.I.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h a(Uri uri, InputStream inputStream) throws C0897l1 {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw C0897l1.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    k0.o(bufferedReader);
                    throw C0897l1.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return o(this.f3246a, this.f3247c, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            k0.o(bufferedReader);
        }
    }
}
