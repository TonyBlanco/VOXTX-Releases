package L5;

import Q5.B;
import Q5.D;
import j6.InterfaceC2101a;
import j6.InterfaceC2102b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements L5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f4080c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2101a f4081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f4082b = new AtomicReference(null);

    public static final class b implements g {
        public b() {
        }

        @Override // L5.g
        public File a() {
            return null;
        }

        @Override // L5.g
        public B.a b() {
            return null;
        }

        @Override // L5.g
        public File c() {
            return null;
        }

        @Override // L5.g
        public File d() {
            return null;
        }

        @Override // L5.g
        public File e() {
            return null;
        }

        @Override // L5.g
        public File f() {
            return null;
        }

        @Override // L5.g
        public File g() {
            return null;
        }
    }

    public d(InterfaceC2101a interfaceC2101a) {
        this.f4081a = interfaceC2101a;
        interfaceC2101a.a(new InterfaceC2101a.InterfaceC0356a() { // from class: L5.b
            @Override // j6.InterfaceC2101a.InterfaceC0356a
            public final void a(InterfaceC2102b interfaceC2102b) {
                this.f4075a.g(interfaceC2102b);
            }
        });
    }

    public static /* synthetic */ void h(String str, String str2, long j9, D d9, InterfaceC2102b interfaceC2102b) {
        ((L5.a) interfaceC2102b.get()).c(str, str2, j9, d9);
    }

    @Override // L5.a
    public g a(String str) {
        L5.a aVar = (L5.a) this.f4082b.get();
        return aVar == null ? f4080c : aVar.a(str);
    }

    @Override // L5.a
    public boolean b() {
        L5.a aVar = (L5.a) this.f4082b.get();
        return aVar != null && aVar.b();
    }

    @Override // L5.a
    public void c(final String str, final String str2, final long j9, final D d9) {
        f.f().i("Deferring native open session: " + str);
        this.f4081a.a(new InterfaceC2101a.InterfaceC0356a() { // from class: L5.c
            @Override // j6.InterfaceC2101a.InterfaceC0356a
            public final void a(InterfaceC2102b interfaceC2102b) {
                d.h(str, str2, j9, d9, interfaceC2102b);
            }
        });
    }

    @Override // L5.a
    public boolean d(String str) {
        L5.a aVar = (L5.a) this.f4082b.get();
        return aVar != null && aVar.d(str);
    }

    public final /* synthetic */ void g(InterfaceC2102b interfaceC2102b) {
        f.f().b("Crashlytics native component now available.");
        this.f4082b.set((L5.a) interfaceC2102b.get());
    }
}
