package Y3;

import P3.b;
import Y3.f;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10648a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f10649b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f10650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f10651d;

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Comparator f10652c = new Comparator() { // from class: Y3.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.b.e((f.b) obj, (f.b) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f10653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10654b;

        public b(c cVar, int i9) {
            this.f10653a = cVar;
            this.f10654b = i9;
        }

        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f10653a.f10656b, bVar2.f10653a.f10656b);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f10658d;

        public c(String str, int i9, String str2, Set set) {
            this.f10656b = i9;
            this.f10655a = str;
            this.f10657c = str2;
            this.f10658d = set;
        }

        public static c a(String str, int i9) {
            String str2;
            String strTrim = str.trim();
            AbstractC1684a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrI1 = k0.i1(strTrim, "\\.");
            String str3 = strArrI1[0];
            HashSet hashSet = new HashSet();
            for (int i10 = 1; i10 < strArrI1.length; i10++) {
                hashSet.add(strArrI1[i10]);
            }
            return new c(str3, i9, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10659a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Y3.d f10660c;

        public d(int i9, Y3.d dVar) {
            this.f10659a = i9;
            this.f10660c = dVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f10659a, dVar.f10659a);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f10663c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f10661a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f10662b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10664d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f10665e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10666f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10667g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f10668h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10669i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f10670j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10671k = Integer.MIN_VALUE;

        public static float b(float f9, int i9) {
            if (f9 == -3.4028235E38f || i9 != 0 || (f9 >= 0.0f && f9 <= 1.0f)) {
                return f9 != -3.4028235E38f ? f9 : i9 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static Layout.Alignment c(int i9) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            AbstractC1681B.j("WebvttCueParser", "Unknown textAlignment: " + i9);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i9, float f9) {
            if (i9 == 0) {
                return 1.0f - f9;
            }
            if (i9 == 1) {
                return f9 <= 0.5f ? f9 * 2.0f : (1.0f - f9) * 2.0f;
            }
            if (i9 == 2) {
                return f9;
            }
            throw new IllegalStateException(String.valueOf(i9));
        }

        public static float e(int i9) {
            if (i9 != 4) {
                return i9 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i9) {
            if (i9 == 1) {
                return 0;
            }
            if (i9 == 3) {
                return 2;
            }
            if (i9 != 4) {
                return i9 != 5 ? 1 : 2;
            }
            return 0;
        }

        public Y3.e a() {
            return new Y3.e(g().a(), this.f10661a, this.f10662b);
        }

        public b.C0083b g() {
            float fE = this.f10668h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f10664d);
            }
            int iF = this.f10669i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f10664d);
            }
            b.C0083b c0083bR = new b.C0083b().p(c(this.f10664d)).h(b(this.f10665e, this.f10666f), this.f10666f).i(this.f10667g).k(fE).l(iF).n(Math.min(this.f10670j, d(iF, fE))).r(this.f10671k);
            CharSequence charSequence = this.f10663c;
            if (charSequence != null) {
                c0083bR.o(charSequence);
            }
            return c0083bR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10650c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10651d = Collections.unmodifiableMap(map2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i9, int i10) {
        Object foregroundColorSpan;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f10650c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(((Integer) map.get(str)).intValue());
            } else {
                Map map2 = f10651d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(((Integer) map2.get(str)).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i9, i10, 33);
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        char c9;
        str.hashCode();
        switch (str) {
            case "gt":
                c9 = '>';
                break;
            case "lt":
                c9 = '<';
                break;
            case "amp":
                c9 = '&';
                break;
            case "nbsp":
                c9 = TokenParser.SP;
                break;
            default:
                AbstractC1681B.j("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c9);
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int i9 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f10652c);
        int i10 = cVar.f10656b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f10653a.f10655a)) {
                b bVar = (b) arrayList.get(i11);
                int iG = g(i(list2, str, bVar.f10653a), i9, 1);
                int i12 = bVar.f10653a.f10656b - length;
                int i13 = bVar.f10654b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new T3.c(charSequenceSubSequence.toString(), iG), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e A[LOOP:0: B:46:0x0098->B:48:0x009e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.String r9, Y3.f.c r10, java.util.List r11, android.text.SpannableStringBuilder r12, java.util.List r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.f.d(java.lang.String, Y3.f$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.text.SpannableStringBuilder r4, Y3.d r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.i()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.i()
            r0.<init>(r1)
            T3.d.a(r4, r0, r6, r7, r2)
        L18:
            boolean r0 = r5.l()
            if (r0 == 0) goto L26
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L26:
            boolean r0 = r5.m()
            if (r0 == 0) goto L34
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L34:
            boolean r0 = r5.k()
            if (r0 == 0) goto L46
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.c()
            r0.<init>(r1)
            T3.d.a(r4, r0, r6, r7, r2)
        L46:
            boolean r0 = r5.j()
            if (r0 == 0) goto L58
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.a()
            r0.<init>(r1)
            T3.d.a(r4, r0, r6, r7, r2)
        L58:
            java.lang.String r0 = r5.d()
            if (r0 == 0) goto L6a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.d()
            r0.<init>(r1)
            T3.d.a(r4, r0, r6, r7, r2)
        L6a:
            int r0 = r5.f()
            r1 = 1
            if (r0 == r1) goto L92
            r1 = 2
            if (r0 == r1) goto L88
            r1 = 3
            if (r0 == r1) goto L78
            goto L9d
        L78:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.e()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
        L84:
            T3.d.a(r4, r0, r6, r7, r2)
            goto L9d
        L88:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.e()
            r0.<init>(r1)
            goto L84
        L92:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.e()
            int r3 = (int) r3
            r0.<init>(r3, r1)
            goto L84
        L9d:
            boolean r5 = r5.b()
            if (r5 == 0) goto Lab
            T3.a r5 = new T3.a
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.f.e(android.text.SpannableStringBuilder, Y3.d, int, int):void");
    }

    public static int f(String str, int i9) {
        int iIndexOf = str.indexOf(62, i9);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static int g(int i9, int i10, int i11) {
        if (i9 != -1) {
            return i9;
        }
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        throw new IllegalArgumentException();
    }

    public static List h(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            Y3.d dVar = (Y3.d) list.get(i9);
            int iH = dVar.h(str, cVar.f10655a, cVar.f10658d, cVar.f10657c);
            if (iH > 0) {
                arrayList.add(new d(iH, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int i(List list, String str, c cVar) {
        List listH = h(list, str, cVar);
        for (int i9 = 0; i9 < listH.size(); i9++) {
            Y3.d dVar = ((d) listH.get(i9)).f10660c;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    public static String j(String str) {
        String strTrim = str.trim();
        AbstractC1684a.a(!strTrim.isEmpty());
        return k0.j1(strTrim, "[ \\.]")[0];
    }

    public static boolean k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static P3.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f10663c = charSequence;
        return eVar.g().a();
    }

    public static Y3.e m(M m9, List list) {
        String strS = m9.s();
        if (strS == null) {
            return null;
        }
        Pattern pattern = f10648a;
        Matcher matcher = pattern.matcher(strS);
        if (matcher.matches()) {
            return n(null, matcher, m9, list);
        }
        String strS2 = m9.s();
        if (strS2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strS2);
        if (matcher2.matches()) {
            return n(strS.trim(), matcher2, m9, list);
        }
        return null;
    }

    public static Y3.e n(String str, Matcher matcher, M m9, List list) {
        e eVar = new e();
        try {
            eVar.f10661a = i.d((String) AbstractC1684a.e(matcher.group(1)));
            eVar.f10662b = i.d((String) AbstractC1684a.e(matcher.group(2)));
            p((String) AbstractC1684a.e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String strS = m9.s();
                if (TextUtils.isEmpty(strS)) {
                    eVar.f10663c = q(str, sb.toString(), list);
                    return eVar.a();
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strS.trim());
            }
        } catch (NumberFormatException unused) {
            AbstractC1681B.j("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static b.C0083b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    public static void p(String str, e eVar) {
        Matcher matcher = f10649b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC1684a.e(matcher.group(1));
            String str3 = (String) AbstractC1684a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f10664d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f10670j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f10671k = w(str3);
                } else {
                    AbstractC1681B.j("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC1681B.j("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString q(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < str2.length()) {
            char cCharAt = str2.charAt(i9);
            if (cCharAt == '&') {
                i9++;
                int iIndexOf = str2.indexOf(59, i9);
                int iIndexOf2 = str2.indexOf(32, i9);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i9, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i9 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i9++;
            } else {
                int iF = i9 + 1;
                if (iF < str2.length()) {
                    boolean z9 = str2.charAt(iF) == '/';
                    iF = f(str2, iF);
                    int i10 = iF - 2;
                    boolean z10 = str2.charAt(i10) == '/';
                    int i11 = i9 + (z9 ? 2 : 1);
                    if (!z10) {
                        i10 = iF - 1;
                    }
                    String strSubstring = str2.substring(i11, i10);
                    if (!strSubstring.trim().isEmpty()) {
                        String strJ = j(strSubstring);
                        if (k(strJ)) {
                            if (z9) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f10655a.equals(strJ)) {
                                        break;
                                    }
                                }
                            } else if (!z10) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i9 = iF;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                AbstractC1681B.j("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void s(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f10667g = r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.f10665e = i.c(str);
            eVar.f10666f = 0;
        } else {
            eVar.f10665e = Integer.parseInt(str);
            eVar.f10666f = 1;
        }
    }

    public static int t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                AbstractC1681B.j("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void u(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f10669i = t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.f10668h = i.c(str);
    }

    public static int v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                AbstractC1681B.j("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        AbstractC1681B.j("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
