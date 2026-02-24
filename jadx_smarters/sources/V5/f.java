package V5;

import O5.AbstractC0945i;
import O5.C0956u;
import O5.EnumC0957v;
import O5.InterfaceC0955t;
import O5.P;
import O5.y;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f10083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f10084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0955t f10085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V5.a f10086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f10087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0956u f10088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f10089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f10090i;

    public class a implements SuccessContinuation {
        public a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Void r52) throws Throwable {
            JSONObject jSONObjectA = f.this.f10087f.a(f.this.f10083b, true);
            if (jSONObjectA != null) {
                d dVarB = f.this.f10084c.b(jSONObjectA);
                f.this.f10086e.c(dVarB.f10071c, jSONObjectA);
                f.this.q(jSONObjectA, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.f10083b.f10098f);
                f.this.f10089h.set(dVarB);
                ((TaskCompletionSource) f.this.f10090i.get()).trySetResult(dVarB);
            }
            return Tasks.forResult(null);
        }
    }

    public f(Context context, j jVar, InterfaceC0955t interfaceC0955t, g gVar, V5.a aVar, k kVar, C0956u c0956u) {
        AtomicReference atomicReference = new AtomicReference();
        this.f10089h = atomicReference;
        this.f10090i = new AtomicReference(new TaskCompletionSource());
        this.f10082a = context;
        this.f10083b = jVar;
        this.f10085d = interfaceC0955t;
        this.f10084c = gVar;
        this.f10086e = aVar;
        this.f10087f = kVar;
        this.f10088g = c0956u;
        atomicReference.set(b.b(interfaceC0955t));
    }

    public static f l(Context context, String str, y yVar, S5.b bVar, String str2, String str3, T5.f fVar, C0956u c0956u) {
        String strG = yVar.g();
        P p9 = new P();
        return new f(context, new j(str, yVar.h(), yVar.i(), yVar.j(), yVar, AbstractC0945i.h(AbstractC0945i.o(context), str, str3, str2), str3, str2, EnumC0957v.determineFrom(strG).getId()), p9, new g(p9), new V5.a(fVar), new c(String.format(Locale.US, "http://=", str), bVar), c0956u);
    }

    @Override // V5.i
    public Task a() {
        return ((TaskCompletionSource) this.f10090i.get()).getTask();
    }

    @Override // V5.i
    public d b() {
        return (d) this.f10089h.get();
    }

    public boolean k() {
        return !n().equals(this.f10083b.f10098f);
    }

    public final d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f10086e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f10084c.b(jSONObjectB);
                    if (dVarB != null) {
                        q(jSONObjectB, "Loaded cached settings: ");
                        long jA = this.f10085d.a();
                        if (e.IGNORE_CACHE_EXPIRATION.equals(eVar) || !dVarB.a(jA)) {
                            try {
                                L5.f.f().i("Returning cached settings.");
                                dVar = dVarB;
                            } catch (Exception e9) {
                                e = e9;
                                dVar = dVarB;
                                L5.f.f().e("Failed to get cached settings", e);
                            }
                        } else {
                            L5.f.f().i("Cached settings have expired.");
                        }
                    } else {
                        L5.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    L5.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
        return dVar;
    }

    public final String n() {
        return AbstractC0945i.s(this.f10082a).getString("existing_instance_identifier", "");
    }

    public Task o(e eVar, Executor executor) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f10089h.set(dVarM);
            ((TaskCompletionSource) this.f10090i.get()).trySetResult(dVarM);
            return Tasks.forResult(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f10089h.set(dVarM2);
            ((TaskCompletionSource) this.f10090i.get()).trySetResult(dVarM2);
        }
        return this.f10088g.i(executor).onSuccessTask(executor, new a());
    }

    public Task p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }

    public final void q(JSONObject jSONObject, String str) {
        L5.f.f().b(str + jSONObject.toString());
    }

    public final boolean r(String str) {
        SharedPreferences.Editor editorEdit = AbstractC0945i.s(this.f10082a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }
}
