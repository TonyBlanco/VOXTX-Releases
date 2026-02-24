package K5;

import C5.a;
import android.os.Bundle;
import j6.InterfaceC2101a;
import j6.InterfaceC2102b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2101a f3811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile M5.a f3812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile N5.b f3813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3814d;

    public d(InterfaceC2101a interfaceC2101a) {
        this(interfaceC2101a, new N5.c(), new M5.f());
    }

    public d(InterfaceC2101a interfaceC2101a, N5.b bVar, M5.a aVar) {
        this.f3811a = interfaceC2101a;
        this.f3813c = bVar;
        this.f3814d = new ArrayList();
        this.f3812b = aVar;
        f();
    }

    public static a.InterfaceC0011a j(C5.a aVar, e eVar) {
        a.InterfaceC0011a interfaceC0011aC = aVar.c("clx", eVar);
        if (interfaceC0011aC == null) {
            L5.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0011aC = aVar.c("crash", eVar);
            if (interfaceC0011aC != null) {
                L5.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return interfaceC0011aC;
    }

    public M5.a d() {
        return new M5.a() { // from class: K5.b
            @Override // M5.a
            public final void a(String str, Bundle bundle) {
                this.f3809a.g(str, bundle);
            }
        };
    }

    public N5.b e() {
        return new N5.b() { // from class: K5.a
            @Override // N5.b
            public final void a(N5.a aVar) {
                this.f3808a.h(aVar);
            }
        };
    }

    public final void f() {
        this.f3811a.a(new InterfaceC2101a.InterfaceC0356a() { // from class: K5.c
            @Override // j6.InterfaceC2101a.InterfaceC0356a
            public final void a(InterfaceC2102b interfaceC2102b) {
                this.f3810a.i(interfaceC2102b);
            }
        });
    }

    public final /* synthetic */ void g(String str, Bundle bundle) {
        this.f3812b.a(str, bundle);
    }

    public final /* synthetic */ void h(N5.a aVar) {
        synchronized (this) {
            try {
                if (this.f3813c instanceof N5.c) {
                    this.f3814d.add(aVar);
                }
                this.f3813c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void i(InterfaceC2102b interfaceC2102b) {
        L5.f.f().b("AnalyticsConnector now available.");
        C5.a aVar = (C5.a) interfaceC2102b.get();
        M5.e eVar = new M5.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) == null) {
            L5.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        L5.f.f().b("Registered Firebase Analytics listener.");
        M5.d dVar = new M5.d();
        M5.c cVar = new M5.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator it = this.f3814d.iterator();
                while (it.hasNext()) {
                    dVar.a((N5.a) it.next());
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f3813c = dVar;
                this.f3812b = cVar;
            } finally {
            }
        }
    }
}
