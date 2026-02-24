package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC1357d;
import com.google.android.gms.common.api.internal.C1367i;
import com.google.android.gms.common.api.internal.InterfaceC1361f;
import com.google.android.gms.common.api.internal.InterfaceC1377n;
import com.google.android.gms.common.api.internal.X0;
import com.google.android.gms.common.api.internal.Y;
import com.google.android.gms.common.api.internal.e1;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.common.internal.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import s.C2695a;
import w4.C2920h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class GoogleApiClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f26415a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f26416a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f26419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f26420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f26421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f26422g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Context f26424i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public C1367i f26426k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public c f26428m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Looper f26429n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f26417b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f26418c = new HashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Map f26423h = new C2695a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Map f26425j = new C2695a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f26427l = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public C2920h f26430o = C2920h.q();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public a.AbstractC0252a f26431p = O4.d.f6525c;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final ArrayList f26432q = new ArrayList();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final ArrayList f26433r = new ArrayList();

        public a(Context context) {
            this.f26424i = context;
            this.f26429n = context.getMainLooper();
            this.f26421f = context.getPackageName();
            this.f26422g = context.getClass().getName();
        }

        public a a(com.google.android.gms.common.api.a aVar) {
            r.n(aVar, "Api must not be null");
            this.f26425j.put(aVar, null);
            List<Scope> impliedScopes = ((a.e) r.n(aVar.c(), "Base client builder must not be null")).getImpliedScopes(null);
            this.f26418c.addAll(impliedScopes);
            this.f26417b.addAll(impliedScopes);
            return this;
        }

        public a b(b bVar) {
            r.n(bVar, "Listener must not be null");
            this.f26432q.add(bVar);
            return this;
        }

        public a c(c cVar) {
            r.n(cVar, "Listener must not be null");
            this.f26433r.add(cVar);
            return this;
        }

        public GoogleApiClient d() {
            r.b(!this.f26425j.isEmpty(), "must call addApi() to add at least one API");
            C1406e c1406eF = f();
            Map mapJ = c1406eF.j();
            C2695a c2695a = new C2695a();
            C2695a c2695a2 = new C2695a();
            ArrayList arrayList = new ArrayList();
            com.google.android.gms.common.api.a aVar = null;
            boolean z9 = false;
            for (com.google.android.gms.common.api.a aVar2 : this.f26425j.keySet()) {
                Object obj = this.f26425j.get(aVar2);
                boolean z10 = mapJ.get(aVar2) != null;
                c2695a.put(aVar2, Boolean.valueOf(z10));
                e1 e1Var = new e1(aVar2, z10);
                arrayList.add(e1Var);
                a.AbstractC0252a abstractC0252a = (a.AbstractC0252a) r.m(aVar2.a());
                a.f fVarBuildClient = abstractC0252a.buildClient(this.f26424i, this.f26429n, c1406eF, obj, (b) e1Var, (c) e1Var);
                c2695a2.put(aVar2.b(), fVarBuildClient);
                if (abstractC0252a.getPriority() == 1) {
                    z9 = obj != null;
                }
                if (fVarBuildClient.providesSignIn()) {
                    if (aVar != null) {
                        throw new IllegalStateException(aVar2.d() + " cannot be used with " + aVar.d());
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                if (z9) {
                    throw new IllegalStateException("With using " + aVar.d() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
                r.r(this.f26416a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.d());
                r.r(this.f26417b.equals(this.f26418c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.d());
            }
            Y y9 = new Y(this.f26424i, new ReentrantLock(), this.f26429n, c1406eF, this.f26430o, this.f26431p, c2695a, this.f26432q, this.f26433r, c2695a2, this.f26427l, Y.n(c2695a2.values(), true), arrayList);
            synchronized (GoogleApiClient.f26415a) {
                GoogleApiClient.f26415a.add(y9);
            }
            if (this.f26427l >= 0) {
                X0.i(this.f26426k).j(this.f26427l, y9, this.f26428m);
            }
            return y9;
        }

        public a e(Handler handler) {
            r.n(handler, "Handler must not be null");
            this.f26429n = handler.getLooper();
            return this;
        }

        public final C1406e f() {
            O4.a aVar = O4.a.f6513k;
            Map map = this.f26425j;
            com.google.android.gms.common.api.a aVar2 = O4.d.f6529g;
            if (map.containsKey(aVar2)) {
                aVar = (O4.a) this.f26425j.get(aVar2);
            }
            return new C1406e(this.f26416a, this.f26417b, this.f26423h, this.f26419d, this.f26420e, this.f26421f, this.f26422g, aVar, false);
        }
    }

    public interface b extends InterfaceC1361f {
    }

    public interface c extends InterfaceC1377n {
    }

    public abstract void connect();

    public abstract void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void disconnect();

    public AbstractC1357d e(AbstractC1357d abstractC1357d) {
        throw new UnsupportedOperationException();
    }

    public AbstractC1357d f(AbstractC1357d abstractC1357d) {
        throw new UnsupportedOperationException();
    }

    public a.f g(a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public Context h() {
        throw new UnsupportedOperationException();
    }

    public Looper i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean j();

    public abstract void k(c cVar);

    public abstract void l(c cVar);
}
