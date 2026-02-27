package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.AbstractC1357d;
import com.google.android.gms.common.api.internal.AbstractC1379o;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.AbstractC1392v;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC1375m;
import com.google.android.gms.common.api.internal.C1351a;
import com.google.android.gms.common.api.internal.C1353b;
import com.google.android.gms.common.api.internal.C1363g;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.common.api.internal.C1372k0;
import com.google.android.gms.common.api.internal.C1373l;
import com.google.android.gms.common.api.internal.C1381p;
import com.google.android.gms.common.api.internal.C1382p0;
import com.google.android.gms.common.api.internal.InterfaceC1386s;
import com.google.android.gms.common.api.internal.J0;
import com.google.android.gms.common.internal.AbstractC1404c;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import d.AbstractC1617D;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    protected final C1363g zaa;
    private final Context zab;
    private final String zac;
    private final com.google.android.gms.common.api.a zad;
    private final a.d zae;
    private final C1353b zaf;
    private final Looper zag;
    private final int zah;

    @NotOnlyInitialized
    private final GoogleApiClient zai;
    private final InterfaceC1386s zaj;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f26452c = new C0254a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1386s f26453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f26454b;

        /* JADX INFO: renamed from: com.google.android.gms.common.api.e$a$a, reason: collision with other inner class name */
        public static class C0254a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public InterfaceC1386s f26455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Looper f26456b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f26455a == null) {
                    this.f26455a = new C1351a();
                }
                if (this.f26456b == null) {
                    this.f26456b = Looper.getMainLooper();
                }
                return new a(this.f26455a, this.f26456b);
            }
        }

        public a(InterfaceC1386s interfaceC1386s, Account account, Looper looper) {
            this.f26453a = interfaceC1386s;
            this.f26454b = looper;
        }
    }

    public e(Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    public e(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        r.n(context, "Null context is not permitted.");
        r.n(aVar, "Api must not be null.");
        r.n(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) r.n(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : getApiFallbackAttributionTag(context);
        this.zac = attributionTag;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.f26454b;
        C1353b c1353bA = C1353b.a(aVar, dVar, attributionTag);
        this.zaf = c1353bA;
        this.zai = new C1382p0(this);
        C1363g c1363gT = C1363g.t(context2);
        this.zaa = c1363gT;
        this.zah = c1363gT.k();
        this.zaj = aVar2.f26453a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            A.j(activity, c1363gT, c1353bA);
        }
        c1363gT.H(this);
    }

    public e(Context context, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }

    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    public C1406e.a createClientSettingsBuilder() {
        C1406e.a aVar = new C1406e.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    public Task<Boolean> disconnectService() {
        return this.zaa.v(this);
    }

    public <A extends a.b, T extends AbstractC1357d> T doBestEffortWrite(T t9) {
        f(2, t9);
        return t9;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(AbstractC1388t abstractC1388t) {
        return g(2, abstractC1388t);
    }

    public <A extends a.b, T extends AbstractC1357d> T doRead(T t9) {
        f(0, t9);
        return t9;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doRead(AbstractC1388t abstractC1388t) {
        return g(0, abstractC1388t);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends a.b, T extends AbstractC1379o, U extends AbstractC1392v> Task<Void> doRegisterEventListener(T t9, U u9) {
        r.m(t9);
        r.m(u9);
        r.n(t9.b(), "Listener has already been released.");
        r.n(u9.a(), "Listener has already been released.");
        r.b(AbstractC1418q.b(t9.b(), u9.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.w(this, t9, u9, new Runnable() { // from class: com.google.android.gms.common.api.n
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b> Task<Void> doRegisterEventListener(C1381p c1381p) {
        r.m(c1381p);
        r.n(c1381p.f26690a.b(), "Listener has already been released.");
        r.n(c1381p.f26691b.a(), "Listener has already been released.");
        return this.zaa.w(this, c1381p.f26690a, c1381p.f26691b, c1381p.f26692c);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C1371k.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C1371k.a aVar, int i9) {
        r.n(aVar, "Listener key cannot be null.");
        return this.zaa.x(this, aVar, i9);
    }

    public <A extends a.b, T extends AbstractC1357d> T doWrite(T t9) {
        f(1, t9);
        return t9;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doWrite(AbstractC1388t abstractC1388t) {
        return g(1, abstractC1388t);
    }

    public final AbstractC1357d f(int i9, AbstractC1357d abstractC1357d) {
        abstractC1357d.zak();
        this.zaa.C(this, i9, abstractC1357d);
        return abstractC1357d;
    }

    public final Task g(int i9, AbstractC1388t abstractC1388t) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.D(this, i9, abstractC1388t, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C1353b getApiKey() {
        return this.zaf;
    }

    public a.d getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C1371k registerListener(L l9, String str) {
        return C1373l.a(l9, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zab(Looper looper, C1372k0 c1372k0) {
        C1406e c1406eA = createClientSettingsBuilder().a();
        a.f fVarBuildClient = ((a.AbstractC0252a) r.m(this.zad.a())).buildClient(this.zab, looper, c1406eA, (Object) this.zae, (GoogleApiClient.b) c1372k0, (GoogleApiClient.c) c1372k0);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof AbstractC1404c)) {
            ((AbstractC1404c) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(fVarBuildClient instanceof AbstractServiceConnectionC1375m)) {
            return fVarBuildClient;
        }
        AbstractC1617D.a(fVarBuildClient);
        throw null;
    }

    public final J0 zac(Context context, Handler handler) {
        return new J0(context, handler, createClientSettingsBuilder().a());
    }
}
