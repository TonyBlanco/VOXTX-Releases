package v6;

import G8.AbstractC0575i;
import G8.L;
import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import k8.k;
import k8.q;
import kotlin.jvm.internal.B;
import o8.InterfaceC2372d;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;
import p8.AbstractC2512c;
import q8.l;
import t6.C2796b;
import w8.p;

/* JADX INFO: renamed from: v6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2890d implements InterfaceC2887a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f51430d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2796b f51431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8.g f51432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51433c;

    /* JADX INFO: renamed from: v6.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: v6.d$b */
    public static final class b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51434a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map f51436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f51437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p f51438f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map, p pVar, p pVar2, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f51436d = map;
            this.f51437e = pVar;
            this.f51438f = pVar2;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L l9, InterfaceC2372d interfaceC2372d) {
            return ((b) create(l9, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            return C2890d.this.new b(this.f51436d, this.f51437e, this.f51438f, interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objD = AbstractC2512c.d();
            int i9 = this.f51434a;
            try {
                if (i9 == 0) {
                    k.b(obj);
                    URLConnection uRLConnectionOpenConnection = C2890d.this.c().openConnection();
                    kotlin.jvm.internal.l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod(HttpGet.METHOD_NAME);
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f51436d.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        B b9 = new B();
                        while (true) {
                            String line = bufferedReader.readLine();
                            b9.f43676a = line;
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        p pVar = this.f51437e;
                        this.f51434a = 1;
                        if (pVar.invoke(jSONObject, this) == objD) {
                            return objD;
                        }
                    } else {
                        p pVar2 = this.f51438f;
                        String str = "Bad response code: " + responseCode;
                        this.f51434a = 2;
                        if (pVar2.invoke(str, this) == objD) {
                            return objD;
                        }
                    }
                } else {
                    if (i9 != 1 && i9 != 2 && i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k.b(obj);
                }
            } catch (Exception e9) {
                p pVar3 = this.f51438f;
                String message = e9.getMessage();
                if (message == null) {
                    message = e9.toString();
                }
                this.f51434a = 3;
                if (pVar3.invoke(message, this) == objD) {
                    return objD;
                }
            }
            return q.f43674a;
        }
    }

    public C2890d(C2796b appInfo, o8.g blockingDispatcher, String baseUrl) {
        kotlin.jvm.internal.l.e(appInfo, "appInfo");
        kotlin.jvm.internal.l.e(blockingDispatcher, "blockingDispatcher");
        kotlin.jvm.internal.l.e(baseUrl, "baseUrl");
        this.f51431a = appInfo;
        this.f51432b = blockingDispatcher;
        this.f51433c = baseUrl;
    }

    public /* synthetic */ C2890d(C2796b c2796b, o8.g gVar, String str, int i9, kotlin.jvm.internal.g gVar2) {
        this(c2796b, gVar, (i9 & 4) != 0 ? "TryRoom" : str);
    }

    @Override // v6.InterfaceC2887a
    public Object a(Map map, p pVar, p pVar2, InterfaceC2372d interfaceC2372d) {
        Object objG = AbstractC0575i.g(this.f51432b, new b(map, pVar, pVar2, null), interfaceC2372d);
        return objG == AbstractC2512c.d() ? objG : q.f43674a;
    }

    public final URL c() {
        return new URL(new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(this.f51433c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f51431a.b()).appendPath("settings").appendQueryParameter("build_version", this.f51431a.a().a()).appendQueryParameter("display_version", this.f51431a.a().d()).build().toString());
    }
}
