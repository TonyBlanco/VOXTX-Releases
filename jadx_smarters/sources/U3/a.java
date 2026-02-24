package U3;

import P3.h;
import P3.i;
import U3.c;
import android.text.Layout;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.AbstractC2673b;
import r5.AbstractC2675d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f9726t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f9728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map f9729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f9730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f9731s;

    public a(List list) {
        super("SsaDecoder");
        this.f9730r = -3.4028235E38f;
        this.f9731s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f9727o = false;
            this.f9728p = null;
            return;
        }
        this.f9727o = true;
        String strE = k0.E((byte[]) list.get(0));
        AbstractC1684a.a(strE.startsWith("Format:"));
        this.f9728p = (b) AbstractC1684a.e(b.a(strE));
        H(new M((byte[]) list.get(1)), AbstractC2675d.f49724c);
    }

    public static int B(long j9, List list, List list2) {
        int i9;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i9 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j9) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j9) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        list.add(i9, Long.valueOf(j9));
        list2.add(i9, i9 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i9 - 1)));
        return i9;
    }

    public static float C(int i9) {
        if (i9 == 0) {
            return 0.05f;
        }
        if (i9 != 1) {
            return i9 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static P3.b D(java.lang.String r8, U3.c r9, U3.c.b r10, float r11, float r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.a.D(java.lang.String, U3.c, U3.c$b, float, float):P3.b");
    }

    public static Map J(M m9, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strT = m9.t(charset);
            if (strT == null || (m9.a() != 0 && m9.h(charset) == '[')) {
                break;
            }
            if (strT.startsWith("Format:")) {
                aVarA = c.a.a(strT);
            } else if (strT.startsWith("Style:")) {
                if (aVarA == null) {
                    AbstractC1681B.j("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strT);
                } else {
                    c cVarB = c.b(strT, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f9737a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long K(String str) {
        Matcher matcher = f9726t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) k0.j(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) k0.j(matcher.group(2))) * 60000000) + (Long.parseLong((String) k0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) k0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int L(int i9) {
        switch (i9) {
            case -1:
                break;
            case 0:
            default:
                AbstractC1681B.j("SsaDecoder", "Unknown alignment: " + i9);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static int M(int i9) {
        switch (i9) {
            case -1:
                break;
            case 0:
            default:
                AbstractC1681B.j("SsaDecoder", "Unknown alignment: " + i9);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static Layout.Alignment N(int i9) {
        switch (i9) {
            case -1:
                return null;
            case 0:
            default:
                AbstractC1681B.j("SsaDecoder", "Unknown alignment: " + i9);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public final Charset E(M m9) {
        Charset charsetP = m9.P();
        return charsetP != null ? charsetP : AbstractC2675d.f49724c;
    }

    public final void F(String str, b bVar, List list, List list2) {
        int i9;
        StringBuilder sb;
        AbstractC1684a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", bVar.f9736e);
        if (strArrSplit.length != bVar.f9736e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long jK = K(strArrSplit[bVar.f9732a]);
            if (jK == -9223372036854775807L) {
                sb = new StringBuilder();
            } else {
                long jK2 = K(strArrSplit[bVar.f9733b]);
                if (jK2 != -9223372036854775807L) {
                    Map map = this.f9729q;
                    c cVar = (map == null || (i9 = bVar.f9734c) == -1) ? null : (c) map.get(strArrSplit[i9].trim());
                    String str2 = strArrSplit[bVar.f9735d];
                    P3.b bVarD = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f9730r, this.f9731s);
                    int iB = B(jK2, list2, list);
                    for (int iB2 = B(jK, list2, list); iB2 < iB; iB2++) {
                        ((List) list.get(iB2)).add(bVarD);
                    }
                    return;
                }
                sb = new StringBuilder();
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        AbstractC1681B.j("SsaDecoder", sb.toString());
    }

    public final void G(M m9, List list, List list2, Charset charset) {
        b bVarA = this.f9727o ? this.f9728p : null;
        while (true) {
            String strT = m9.t(charset);
            if (strT == null) {
                return;
            }
            if (strT.startsWith("Format:")) {
                bVarA = b.a(strT);
            } else if (strT.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    AbstractC1681B.j("SsaDecoder", "Skipping dialogue line before complete format: " + strT);
                } else {
                    F(strT, bVarA, list, list2);
                }
            }
        }
    }

    public final void H(M m9, Charset charset) {
        while (true) {
            String strT = m9.t(charset);
            if (strT == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strT)) {
                I(m9, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strT)) {
                this.f9729q = J(m9, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strT)) {
                AbstractC1681B.g("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strT)) {
                return;
            }
        }
    }

    public final void I(M m9, Charset charset) {
        while (true) {
            String strT = m9.t(charset);
            if (strT == null) {
                return;
            }
            if (m9.a() != 0 && m9.h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strT.split(":");
            if (strArrSplit.length == 2) {
                String strE = AbstractC2673b.e(strArrSplit[0].trim());
                strE.hashCode();
                if (strE.equals("playresx")) {
                    this.f9730r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f9731s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    @Override // P3.h
    public i z(byte[] bArr, int i9, boolean z9) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        M m9 = new M(bArr, i9);
        Charset charsetE = E(m9);
        if (!this.f9727o) {
            H(m9, charsetE);
        }
        G(m9, arrayList, arrayList2, charsetE);
        return new d(arrayList, arrayList2);
    }
}
