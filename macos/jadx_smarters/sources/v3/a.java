package V3;

import P3.h;
import P3.i;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.C1682C;
import d4.M;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.AbstractC2675d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f10038q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f10039r = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringBuilder f10040o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f10041p;

    public a() {
        super("SubripDecoder");
        this.f10040o = new StringBuilder();
        this.f10041p = new ArrayList();
    }

    private Charset C(M m9) {
        Charset charsetP = m9.P();
        return charsetP != null ? charsetP : AbstractC2675d.f49724c;
    }

    public static float D(int i9) {
        if (i9 == 0) {
            return 0.08f;
        }
        if (i9 == 1) {
            return 0.5f;
        }
        if (i9 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long E(Matcher matcher, int i9) {
        String strGroup = matcher.group(i9 + 1);
        long j9 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) AbstractC1684a.e(matcher.group(i9 + 2))) * 60000) + (Long.parseLong((String) AbstractC1684a.e(matcher.group(i9 + 3))) * 1000);
        String strGroup2 = matcher.group(i9 + 4);
        if (strGroup2 != null) {
            j9 += Long.parseLong(strGroup2);
        }
        return j9 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P3.b B(android.text.Spanned r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.a.B(android.text.Spanned, java.lang.String):P3.b");
    }

    public final String F(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = f10039r.matcher(strTrim);
        int i9 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i9;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i9 += length;
        }
        return sb.toString();
    }

    @Override // P3.h
    public i z(byte[] bArr, int i9, boolean z9) {
        StringBuilder sb;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        C1682C c1682c = new C1682C();
        M m9 = new M(bArr, i9);
        Charset charsetC = C(m9);
        while (true) {
            String strT = m9.t(charsetC);
            int i10 = 0;
            if (strT == null) {
                break;
            }
            if (strT.length() != 0) {
                try {
                    Integer.parseInt(strT);
                    strT = m9.t(charsetC);
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (strT == null) {
                    AbstractC1681B.j("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f10038q.matcher(strT);
                if (matcher.matches()) {
                    c1682c.a(E(matcher, 1));
                    c1682c.a(E(matcher, 6));
                    this.f10040o.setLength(0);
                    this.f10041p.clear();
                    while (true) {
                        String strT2 = m9.t(charsetC);
                        if (TextUtils.isEmpty(strT2)) {
                            break;
                        }
                        if (this.f10040o.length() > 0) {
                            this.f10040o.append("<br>");
                        }
                        this.f10040o.append(F(strT2, this.f10041p));
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.f10040o.toString());
                    while (true) {
                        if (i10 >= this.f10041p.size()) {
                            str2 = null;
                            break;
                        }
                        str2 = (String) this.f10041p.get(i10);
                        if (str2.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        }
                        i10++;
                    }
                    arrayList.add(B(spannedFromHtml, str2));
                    arrayList.add(P3.b.f7184s);
                } else {
                    sb = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb.append(str);
                    sb.append(strT);
                    AbstractC1681B.j("SubripDecoder", sb.toString());
                }
            }
        }
        return new b((P3.b[]) arrayList.toArray(new P3.b[0]), c1682c.d());
    }
}
