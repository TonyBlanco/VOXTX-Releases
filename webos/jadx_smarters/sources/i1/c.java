package I1;

import D1.a;
import J1.h;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.simpleframework.xml.strategy.Name;
import v1.InterfaceC2868f;
import w1.AbstractC2902b;
import x1.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements D1.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final MediaType f2784j = MediaType.parse("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpUrl f2785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f2786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1.d f2787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E1.b f2789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K1.d f2790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Call f2792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f2793i;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0015a f2794a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.c f2795c;

        /* JADX INFO: renamed from: I1.c$a$a, reason: collision with other inner class name */
        public class C0047a implements Callback {
            public C0047a() {
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                if (c.this.f2793i) {
                    return;
                }
                a aVar = a.this;
                c.this.f2789e.d(iOException, "Failed to execute http call for operation %s", aVar.f2795c.f1314b.name().name());
                a.this.f2794a.onFailure(new B1.d("Failed to execute http call", iOException));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                if (c.this.f2793i) {
                    return;
                }
                a.this.f2794a.onResponse(new a.d(response));
                a.this.f2794a.onCompleted();
            }
        }

        public a(a.InterfaceC0015a interfaceC0015a, a.c cVar) {
            this.f2794a = interfaceC0015a;
            this.f2795c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2794a.onFetch(a.b.NETWORK);
            try {
                c cVar = c.this;
                cVar.f2792h = cVar.c(this.f2795c.f1314b);
                if (c.this.f2792h != null) {
                    c.this.f2792h.enqueue(new C0047a());
                } else {
                    this.f2794a.onFailure(new B1.d("Failed to prepare http call, prepared call was null"));
                }
            } catch (IOException e9) {
                c.this.f2789e.d(e9, "Failed to prepare http call for operation %s", this.f2795c.f1314b.name().name());
                this.f2794a.onFailure(new B1.d("Failed to prepare http call", e9));
            }
        }
    }

    public c(HttpUrl httpUrl, Call.Factory factory, AbstractC2902b.c cVar, boolean z9, K1.d dVar, E1.b bVar, boolean z10) {
        this.f2785a = (HttpUrl) g.c(httpUrl, "serverUrl == null");
        this.f2786b = (Call.Factory) g.c(factory, "httpCallFactory == null");
        this.f2787c = x1.d.d(cVar);
        this.f2788d = z9;
        this.f2790f = (K1.d) g.c(dVar, "scalarTypeAdapters == null");
        this.f2789e = (E1.b) g.c(bVar, "logger == null");
        this.f2791g = z10;
    }

    public static String b(RequestBody requestBody) {
        Buffer buffer = new Buffer();
        try {
            requestBody.writeTo(buffer);
            return buffer.readByteString().md5().hex();
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }

    public final Call c(InterfaceC2868f interfaceC2868f) throws IOException {
        RequestBody requestBodyD = d(interfaceC2868f);
        Request.Builder builderHeader = new Request.Builder().url(this.f2785a).post(requestBodyD).header("Accept", "application/json").header("CONTENT_TYPE", "application/json").header("X-APOLLO-OPERATION-ID", interfaceC2868f.operationId());
        if (this.f2787c.f()) {
            AbstractC2902b.c cVar = (AbstractC2902b.c) this.f2787c.e();
            builderHeader = builderHeader.header("X-APOLLO-CACHE-KEY", b(requestBodyD)).header("X-APOLLO-CACHE-FETCH-STRATEGY", cVar.f51590a.name()).header("X-APOLLO-EXPIRE-TIMEOUT", String.valueOf(cVar.a())).header("X-APOLLO-EXPIRE-AFTER-READ", Boolean.toString(cVar.f51593d)).header("X-APOLLO-PREFETCH", Boolean.toString(this.f2788d));
        }
        return this.f2786b.newCall(builderHeader.build());
    }

    public final RequestBody d(InterfaceC2868f interfaceC2868f) throws IOException {
        h hVarG;
        String strReplaceAll;
        Buffer buffer = new Buffer();
        h hVarI = h.i(buffer);
        hVarI.c();
        if (this.f2791g) {
            hVarG = hVarI.g(Name.MARK);
            strReplaceAll = interfaceC2868f.operationId();
        } else {
            hVarG = hVarI.g("query");
            strReplaceAll = interfaceC2868f.queryDocument().replaceAll("\\n", "");
        }
        hVarG.p(strReplaceAll);
        hVarI.g("variables").c();
        interfaceC2868f.variables().marshaller().marshal(new J1.d(hVarI, this.f2790f));
        hVarI.e();
        hVarI.e();
        hVarI.close();
        return RequestBody.create(f2784j, buffer.readByteString());
    }

    @Override // D1.a
    public void dispose() {
        this.f2793i = true;
        Call call = this.f2792h;
        if (call != null) {
            call.cancel();
        }
        this.f2792h = null;
    }

    @Override // D1.a
    public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        if (this.f2793i) {
            return;
        }
        executor.execute(new a(interfaceC0015a, cVar));
    }
}
