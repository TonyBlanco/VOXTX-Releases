package b4;

import android.os.Handler;
import b4.InterfaceC1215f;
import d4.AbstractC1684a;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: b4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1215f {

    /* JADX INFO: renamed from: b4.f$a */
    public interface a {

        /* JADX INFO: renamed from: b4.f$a$a, reason: collision with other inner class name */
        public static final class C0211a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList f17573a = new CopyOnWriteArrayList();

            /* JADX INFO: renamed from: b4.f$a$a$a, reason: collision with other inner class name */
            public static final class C0212a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f17574a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f17575b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f17576c;

                public C0212a(Handler handler, a aVar) {
                    this.f17574a = handler;
                    this.f17575b = aVar;
                }

                public void d() {
                    this.f17576c = true;
                }
            }

            public static /* synthetic */ void d(C0212a c0212a, int i9, long j9, long j10) {
                c0212a.f17575b.F(i9, j9, j10);
            }

            public void b(Handler handler, a aVar) {
                AbstractC1684a.e(handler);
                AbstractC1684a.e(aVar);
                e(aVar);
                this.f17573a.add(new C0212a(handler, aVar));
            }

            public void c(final int i9, final long j9, final long j10) {
                for (final C0212a c0212a : this.f17573a) {
                    if (!c0212a.f17576c) {
                        c0212a.f17574a.post(new Runnable() { // from class: b4.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC1215f.a.C0211a.d(c0212a, i9, j9, j10);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                for (C0212a c0212a : this.f17573a) {
                    if (c0212a.f17575b == aVar) {
                        c0212a.d();
                        this.f17573a.remove(c0212a);
                    }
                }
            }
        }

        void F(int i9, long j9, long j10);
    }

    long b();

    S d();

    long e();

    void g(Handler handler, a aVar);

    void h(a aVar);
}
