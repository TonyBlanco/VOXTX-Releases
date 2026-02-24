package S5;

import L5.f;
import com.amazonaws.services.s3.internal.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import okio.Segment;
import org.apache.http.client.methods.HttpGet;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f9431c = new HashMap();

    public a(String str, Map map) {
        this.f9429a = str;
        this.f9430b = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0029, code lost:
    
        if (r1.getValue() != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        r1 = java.net.URLEncoder.encode((java.lang.String) r1.getValue(), "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (r7.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        r1 = (java.util.Map.Entry) r7.next();
        r0.append("&");
        r0.append((java.lang.String) r1.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r1.getValue() == null) goto L5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.util.Map r7) throws java.io.UnsupportedEncodingException {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = ""
            java.lang.String r5 = "UTF-8"
            if (r3 == 0) goto L36
        L2b:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r5)
            goto L37
        L36:
            r1 = r4
        L37:
            r0.append(r1)
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r3 = "&"
            r0.append(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L36
            goto L2b
        L5e:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.a.a(java.util.Map):java.lang.String");
    }

    public final String b(String str, Map map) throws UnsupportedEncodingException {
        String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strA;
        }
        if (!str.endsWith("&")) {
            strA = "&" + strA;
        }
        return str + strA;
    }

    public c c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String strE = null;
        inputStream = null;
        try {
            String strB = b(this.f9429a, this.f9430b);
            f.f().i("GET Request URL: " + strB);
            httpsURLConnection = (HttpsURLConnection) new URL(strB).openConnection();
            try {
                httpsURLConnection.setReadTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
                httpsURLConnection.setConnectTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
                httpsURLConnection.setRequestMethod(HttpGet.METHOD_NAME);
                for (Map.Entry entry : this.f9431c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strE = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, strE);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f9431c.put(str, str2);
        return this;
    }

    public final String e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[Segment.SIZE];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i9 = bufferedReader.read(cArr);
            if (i9 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i9);
        }
    }
}
