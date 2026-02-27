package A2;

import C2.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import z2.C3014b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f71c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f72d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f73e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f74f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f75g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f76h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f71c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f72d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f73e = strA3;
        f74f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C3014b.b("proto"), C3014b.b("json"))));
        f75g = new a(strA, null);
        f76h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f77a = str;
        this.f78b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // C2.g
    public Set a() {
        return f74f;
    }

    public byte[] b() {
        String str = this.f78b;
        if (str == null && this.f77a == null) {
            return null;
        }
        String str2 = this.f77a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f78b;
    }

    public String e() {
        return this.f77a;
    }

    @Override // C2.f
    public byte[] getExtras() {
        return b();
    }

    @Override // C2.f
    public String getName() {
        return "cct";
    }
}
