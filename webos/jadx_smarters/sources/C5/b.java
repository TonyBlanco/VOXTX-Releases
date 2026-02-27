package C5;

import A5.f;
import C5.a;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.zzef;
import g6.AbstractC1838a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class b implements C5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5.a f1160c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L4.a f1161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1162b;

    public class a implements a.InterfaceC0011a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1163a;

        public a(String str) {
            this.f1163a = str;
        }
    }

    public b(L4.a aVar) {
        r.m(aVar);
        this.f1161a = aVar;
        this.f1162b = new ConcurrentHashMap();
    }

    public static C5.a d(f fVar, Context context, g6.d dVar) {
        r.m(fVar);
        r.m(context);
        r.m(dVar);
        r.m(context.getApplicationContext());
        if (f1160c == null) {
            synchronized (b.class) {
                try {
                    if (f1160c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.w()) {
                            dVar.b(A5.b.class, new Executor() { // from class: C5.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new g6.b() { // from class: C5.d
                                @Override // g6.b
                                public final void a(AbstractC1838a abstractC1838a) {
                                    b.e(abstractC1838a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.v());
                        }
                        f1160c = new b(zzef.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return f1160c;
    }

    public static /* synthetic */ void e(AbstractC1838a abstractC1838a) {
        throw null;
    }

    @Override // C5.a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (D5.b.d(str) && D5.b.b(str2, bundle) && D5.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f1161a.a(str, str2, bundle);
        }
    }

    @Override // C5.a
    public void b(String str, String str2, Object obj) {
        if (D5.b.d(str) && D5.b.e(str, str2)) {
            this.f1161a.c(str, str2, obj);
        }
    }

    @Override // C5.a
    public a.InterfaceC0011a c(String str, a.b bVar) {
        r.m(bVar);
        if (!D5.b.d(str) || f(str)) {
            return null;
        }
        L4.a aVar = this.f1161a;
        Object dVar = "fiam".equals(str) ? new D5.d(aVar, bVar) : "clx".equals(str) ? new D5.f(aVar, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.f1162b.put(str, dVar);
        return new a(str);
    }

    public final boolean f(String str) {
        return (str.isEmpty() || !this.f1162b.containsKey(str) || this.f1162b.get(str) == null) ? false : true;
    }
}
