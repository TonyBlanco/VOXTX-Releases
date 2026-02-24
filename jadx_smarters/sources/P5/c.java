package P5;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7292c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T5.f f7293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P5.a f7294b;

    public static final class b implements P5.a {
        public b() {
        }

        @Override // P5.a
        public void a() {
        }

        @Override // P5.a
        public String b() {
            return null;
        }

        @Override // P5.a
        public byte[] c() {
            return null;
        }

        @Override // P5.a
        public void d() {
        }

        @Override // P5.a
        public void e(long j9, String str) {
        }
    }

    public c(T5.f fVar) {
        this.f7293a = fVar;
        this.f7294b = f7292c;
    }

    public c(T5.f fVar, String str) {
        this(fVar);
        e(str);
    }

    public void a() {
        this.f7294b.d();
    }

    public byte[] b() {
        return this.f7294b.c();
    }

    public String c() {
        return this.f7294b.b();
    }

    public final File d(String str) {
        return this.f7293a.o(str, "userlog");
    }

    public final void e(String str) {
        this.f7294b.a();
        this.f7294b = f7292c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    public void f(File file, int i9) {
        this.f7294b = new f(file, i9);
    }

    public void g(long j9, String str) {
        this.f7294b.e(j9, str);
    }
}
