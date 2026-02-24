package A2;

import A2.d;
import B2.j;
import B2.k;
import B2.l;
import B2.m;
import B2.n;
import B2.o;
import B2.p;
import C2.h;
import C2.i;
import D2.f;
import D2.g;
import D2.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import c6.InterfaceC1275a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpHeaders;
import z2.C3014b;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1275a f80a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f81b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f82c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f83d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M2.a f84e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M2.a f85f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f86g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f87a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f88b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f89c;

        public a(URL url, j jVar, String str) {
            this.f87a = url;
            this.f88b = jVar;
            this.f89c = str;
        }

        public a a(URL url) {
            return new a(url, this.f88b, this.f89c);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f91b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f92c;

        public b(int i9, URL url, long j9) {
            this.f90a = i9;
            this.f91b = url;
            this.f92c = j9;
        }
    }

    public d(Context context, M2.a aVar, M2.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }

    public d(Context context, M2.a aVar, M2.a aVar2, int i9) {
        this.f80a = j.b();
        this.f82c = context;
        this.f81b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f83d = n(A2.a.f71c);
        this.f84e = aVar2;
        this.f85f = aVar;
        this.f86g = i9;
    }

    public static int f(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (o.b.forNumber(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = o.b.COMBINED;
        }
        return bVar.getValue();
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.getValue() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e9) {
            G2.a.d("CctTransportBackend", "Unable to find version code for package", e9);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f91b;
        if (url == null) {
            return null;
        }
        G2.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f91b);
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e9) {
            throw new IllegalArgumentException("Invalid url: " + str, e9);
        }
    }

    @Override // D2.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f81b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f82c).getSimOperator()).c("application_build", Integer.toString(h(this.f82c))).d();
    }

    @Override // D2.m
    public g b(f fVar) {
        j jVarI = i(fVar);
        URL urlN = this.f83d;
        if (fVar.c() != null) {
            try {
                A2.a aVarC = A2.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlN = n(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) H2.b.a(5, new a(urlN, jVarI, strD), new H2.a() { // from class: A2.b
                @Override // H2.a
                public final Object apply(Object obj) {
                    return this.f79a.e((d.a) obj);
                }
            }, new H2.c() { // from class: A2.c
                @Override // H2.c
                public final Object a(Object obj, Object obj2) {
                    return d.l((d.a) obj, (d.b) obj2);
                }
            });
            int i9 = bVar.f90a;
            if (i9 == 200) {
                return g.e(bVar.f92c);
            }
            if (i9 < 500 && i9 != 404) {
                return i9 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e9) {
            G2.a.d("CctTransportBackend", "Could not make request to the backend", e9);
            return g.f();
        }
    }

    public final b e(a aVar) throws IOException {
        G2.a.f("CctTransportBackend", "Making request to: %s", aVar.f87a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f87a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f86g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
        String str = aVar.f89c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f80a.a(aVar.f88b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    G2.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    G2.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    G2.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (c6.c e9) {
            e = e9;
            G2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            G2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            G2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            G2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final j i(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strJ = iVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a aVarB = B2.m.a().f(p.DEFAULT).g(this.f85f.a()).h(this.f84e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(B2.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                C3014b c3014bB = hVarE.b();
                if (c3014bB.equals(C3014b.b("proto"))) {
                    aVarJ = l.j(hVarE.a());
                } else if (c3014bB.equals(C3014b.b("json"))) {
                    aVarJ = l.i(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    G2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c3014bB);
                }
                aVarJ.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.forNumber(iVar3.g("net-type"))).b(o.b.forNumber(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarJ.b(iVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }
}
