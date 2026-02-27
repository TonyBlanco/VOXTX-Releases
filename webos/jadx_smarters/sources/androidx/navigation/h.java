package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f16374j = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16375a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16376b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Pattern f16377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Pattern f16382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f16383i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16386c;

        public h a() {
            return new h(this.f16384a, this.f16385b, this.f16386c);
        }

        public a b(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f16385b = str;
            return this;
        }

        public a c(String str) {
            this.f16386c = str;
            return this;
        }

        public a d(String str) {
            this.f16384a = str;
            return this;
        }
    }

    public static class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16387a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16388c;

        public b(String str) {
            String[] strArrSplit = str.split("/", -1);
            this.f16387a = strArrSplit[0];
            this.f16388c = strArrSplit[1];
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i9 = this.f16387a.equals(bVar.f16387a) ? 2 : 0;
            return this.f16388c.equals(bVar.f16388c) ? i9 + 1 : i9;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f16390b = new ArrayList();

        public void a(String str) {
            this.f16390b.add(str);
        }

        public String b(int i9) {
            return (String) this.f16390b.get(i9);
        }

        public String c() {
            return this.f16389a;
        }

        public void d(String str) {
            this.f16389a = str;
        }

        public int e() {
            return this.f16390b.size();
        }
    }

    public h(String str, String str2, String str3) {
        this.f16377c = null;
        this.f16378d = false;
        this.f16379e = false;
        this.f16382h = null;
        this.f16380f = str;
        this.f16381g = str2;
        this.f16383i = str3;
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.f16379e = uri.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f16374j.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (this.f16379e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, patternCompile);
                }
                this.f16378d = false;
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    Matcher matcher2 = patternCompile.matcher(queryParameter);
                    c cVar = new c();
                    int iEnd = 0;
                    while (matcher2.find()) {
                        cVar.a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd, matcher2.start())));
                        sb2.append("(.+?)?");
                        iEnd = matcher2.end();
                    }
                    if (iEnd < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd)));
                    }
                    cVar.d(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.f16376b.put(str4, cVar);
                }
            } else {
                this.f16378d = a(str, sb, patternCompile);
            }
            this.f16377c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"));
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
            }
            b bVar = new b(str3);
            this.f16382h = Pattern.compile(("^(" + bVar.f16387a + "|[*]+)/(" + bVar.f16388c + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z9 = !str.contains(".*");
        int iEnd = 0;
        while (matcher.find()) {
            this.f16375a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            sb.append("(.+?)");
            iEnd = matcher.end();
            z9 = false;
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
        sb.append("($|(\\?(.)*))");
        return z9;
    }

    public String b() {
        return this.f16381g;
    }

    public Bundle c(Uri uri, Map map) {
        Matcher matcher;
        Matcher matcher2 = this.f16377c.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f16375a.size();
        int i9 = 0;
        while (i9 < size) {
            String str = (String) this.f16375a.get(i9);
            i9++;
            if (f(bundle, str, Uri.decode(matcher2.group(i9)), (d) map.get(str))) {
                return null;
            }
        }
        if (this.f16379e) {
            for (String str2 : this.f16376b.keySet()) {
                c cVar = (c) this.f16376b.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(cVar.c()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                for (int i10 = 0; i10 < cVar.e(); i10++) {
                    String strDecode = matcher != null ? Uri.decode(matcher.group(i10 + 1)) : null;
                    String strB = cVar.b(i10);
                    d dVar = (d) map.get(strB);
                    if (strDecode != null && !strDecode.replaceAll("[{}]", "").equals(strB) && f(bundle, strB, strDecode, dVar)) {
                        return null;
                    }
                }
            }
        }
        return bundle;
    }

    public int d(String str) {
        if (this.f16383i == null || !this.f16382h.matcher(str).matches()) {
            return -1;
        }
        return new b(this.f16383i).compareTo(new b(str));
    }

    public boolean e() {
        return this.f16378d;
    }

    public final boolean f(Bundle bundle, String str, String str2, d dVar) {
        if (dVar == null) {
            bundle.putString(str, str2);
            return false;
        }
        try {
            dVar.a().g(bundle, str, str2);
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
