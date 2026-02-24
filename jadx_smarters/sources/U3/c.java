package U3;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w5.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f9739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f9740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9746j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f9753g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f9754h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f9755i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f9756j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f9757k;

        public a(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f9747a = i9;
            this.f9748b = i10;
            this.f9749c = i11;
            this.f9750d = i12;
            this.f9751e = i13;
            this.f9752f = i14;
            this.f9753g = i15;
            this.f9754h = i16;
            this.f9755i = i17;
            this.f9756j = i18;
            this.f9757k = i19;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static U3.c.a a(java.lang.String r18) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: U3.c.a.a(java.lang.String):U3.c$a");
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f9758c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f9759d = Pattern.compile(k0.D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f9760e = Pattern.compile(k0.D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Pattern f9761f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f9763b;

        public b(int i9, PointF pointF) {
            this.f9762a = i9;
            this.f9763b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f9761f.matcher(str);
            if (matcher.find()) {
                return c.e((String) AbstractC1684a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f9758c.matcher(str);
            PointF pointF = null;
            int i9 = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC1684a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i9 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i9, pointF);
        }

        public static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f9759d.matcher(str);
            Matcher matcher2 = f9760e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    AbstractC1681B.g("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) AbstractC1684a.e(strGroup)).trim()), Float.parseFloat(((String) AbstractC1684a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f9758c.matcher(str).replaceAll("");
        }
    }

    public c(String str, int i9, Integer num, Integer num2, float f9, boolean z9, boolean z10, boolean z11, boolean z12, int i10) {
        this.f9737a = str;
        this.f9738b = i9;
        this.f9739c = num;
        this.f9740d = num2;
        this.f9741e = f9;
        this.f9742f = z9;
        this.f9743g = z10;
        this.f9744h = z11;
        this.f9745i = z12;
        this.f9746j = i10;
    }

    public static c b(String str, a aVar) {
        AbstractC1684a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i9 = aVar.f9757k;
        if (length != i9) {
            AbstractC1681B.j("SsaStyle", k0.D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i9), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f9747a].trim();
            int i10 = aVar.f9748b;
            int iE = i10 != -1 ? e(strArrSplit[i10].trim()) : -1;
            int i11 = aVar.f9749c;
            Integer numH = i11 != -1 ? h(strArrSplit[i11].trim()) : null;
            int i12 = aVar.f9750d;
            Integer numH2 = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f9751e;
            float fI = i13 != -1 ? i(strArrSplit[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f9752f;
            boolean z9 = i14 != -1 && f(strArrSplit[i14].trim());
            int i15 = aVar.f9753g;
            boolean z10 = i15 != -1 && f(strArrSplit[i15].trim());
            int i16 = aVar.f9754h;
            boolean z11 = i16 != -1 && f(strArrSplit[i16].trim());
            int i17 = aVar.f9755i;
            boolean z12 = i17 != -1 && f(strArrSplit[i17].trim());
            int i18 = aVar.f9756j;
            return new c(strTrim, iE, numH, numH2, fI, z9, z10, z11, z12, i18 != -1 ? g(strArrSplit[i18].trim()) : -1);
        } catch (RuntimeException e9) {
            AbstractC1681B.k("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e9);
            return null;
        }
    }

    public static boolean c(int i9) {
        switch (i9) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i9) {
        return i9 == 1 || i9 == 3;
    }

    public static int e(String str) {
        try {
            int i9 = Integer.parseInt(str.trim());
            if (c(i9)) {
                return i9;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC1681B.j("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean f(String str) {
        try {
            int i9 = Integer.parseInt(str);
            return i9 == 1 || i9 == -1;
        } catch (NumberFormatException e9) {
            AbstractC1681B.k("SsaStyle", "Failed to parse boolean value: '" + str + "'", e9);
            return false;
        }
    }

    public static int g(String str) {
        try {
            int i9 = Integer.parseInt(str.trim());
            if (d(i9)) {
                return i9;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC1681B.j("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j9 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1684a.a(j9 <= 4294967295L);
            return Integer.valueOf(Color.argb(f.d(((j9 >> 24) & 255) ^ 255), f.d(j9 & 255), f.d((j9 >> 8) & 255), f.d((j9 >> 16) & 255)));
        } catch (IllegalArgumentException e9) {
            AbstractC1681B.k("SsaStyle", "Failed to parse color expression: '" + str + "'", e9);
            return null;
        }
    }

    public static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e9) {
            AbstractC1681B.k("SsaStyle", "Failed to parse font size: '" + str + "'", e9);
            return -3.4028235E38f;
        }
    }
}
