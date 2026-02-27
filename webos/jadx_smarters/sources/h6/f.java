package h6;

import I5.C0637c;
import I5.F;
import I5.InterfaceC0639e;
import I5.r;
import L.u;
import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h6.j;
import j6.InterfaceC2102b;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2102b f41673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f41674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2102b f41675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f41676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f41677e;

    public f(final Context context, final String str, Set set, InterfaceC2102b interfaceC2102b, Executor executor) {
        this(new InterfaceC2102b() { // from class: h6.c
            @Override // j6.InterfaceC2102b
            public final Object get() {
                return f.j(context, str);
            }
        }, set, executor, interfaceC2102b, context);
    }

    public f(InterfaceC2102b interfaceC2102b, Set set, Executor executor, InterfaceC2102b interfaceC2102b2, Context context) {
        this.f41673a = interfaceC2102b;
        this.f41676d = set;
        this.f41677e = executor;
        this.f41675c = interfaceC2102b2;
        this.f41674b = context;
    }

    public static C0637c g() {
        final F fA = F.a(E5.a.class, Executor.class);
        return C0637c.f(f.class, i.class, j.class).b(r.k(Context.class)).b(r.k(A5.f.class)).b(r.n(g.class)).b(r.m(s6.i.class)).b(r.j(fA)).f(new I5.h() { // from class: h6.b
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return f.h(fA, interfaceC0639e);
            }
        }).d();
    }

    public static /* synthetic */ f h(F f9, InterfaceC0639e interfaceC0639e) {
        return new f((Context) interfaceC0639e.a(Context.class), ((A5.f) interfaceC0639e.a(A5.f.class)).q(), interfaceC0639e.c(g.class), interfaceC0639e.g(s6.i.class), (Executor) interfaceC0639e.b(f9));
    }

    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    @Override // h6.i
    public Task a() {
        return u.a(this.f41674b) ^ true ? Tasks.forResult("") : Tasks.call(this.f41677e, new Callable() { // from class: h6.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f41671a.i();
            }
        });
    }

    @Override // h6.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        k kVar = (k) this.f41673a.get();
        if (!kVar.i(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        kVar.g();
        return j.a.GLOBAL;
    }

    public final /* synthetic */ String i() {
        String string;
        synchronized (this) {
            try {
                k kVar = (k) this.f41673a.get();
                List listC = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i9 = 0; i9 < listC.size(); i9++) {
                    l lVar = (l) listC.get(i9);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put(ClientCookie.VERSION_ATTR, "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public final /* synthetic */ Void k() {
        synchronized (this) {
            ((k) this.f41673a.get()).k(System.currentTimeMillis(), ((s6.i) this.f41675c.get()).a());
        }
        return null;
    }

    public Task l() {
        if (this.f41676d.size() > 0 && !(!u.a(this.f41674b))) {
            return Tasks.call(this.f41677e, new Callable() { // from class: h6.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f41672a.k();
                }
            });
        }
        return Tasks.forResult(null);
    }
}
