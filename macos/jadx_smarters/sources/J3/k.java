package J3;

import B3.J;
import android.net.Uri;
import b4.F;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface k {

    public interface a {
        k a(H3.g gVar, F f9, j jVar);
    }

    public interface b {
        boolean a(Uri uri, F.c cVar, boolean z9);

        void e();
    }

    public static final class c extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f3251a;

        public c(Uri uri) {
            this.f3251a = uri;
        }
    }

    public static final class d extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f3252a;

        public d(Uri uri) {
            this.f3252a = uri;
        }
    }

    public interface e {
        void M(f fVar);
    }

    void a(Uri uri, J.a aVar, e eVar);

    void b(b bVar);

    void c(Uri uri);

    long d();

    g e();

    void f(b bVar);

    void g(Uri uri);

    boolean h(Uri uri);

    boolean i();

    boolean k(Uri uri, long j9);

    void l();

    f m(Uri uri, boolean z9);

    void stop();
}
