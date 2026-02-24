package M;

import M.f;
import M.g;
import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.c f4118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f4119b;

    /* JADX INFO: renamed from: M.a$a, reason: collision with other inner class name */
    public class RunnableC0067a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f4120a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Typeface f4121c;

        public RunnableC0067a(g.c cVar, Typeface typeface) {
            this.f4120a = cVar;
            this.f4121c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4120a.b(this.f4121c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f4123a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4124c;

        public b(g.c cVar, int i9) {
            this.f4123a = cVar;
            this.f4124c = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4123a.a(this.f4124c);
        }
    }

    public a(g.c cVar, Handler handler) {
        this.f4118a = cVar;
        this.f4119b = handler;
    }

    public final void a(int i9) {
        this.f4119b.post(new b(this.f4118a, i9));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f4147a);
        } else {
            a(eVar.f4148b);
        }
    }

    public final void c(Typeface typeface) {
        this.f4119b.post(new RunnableC0067a(this.f4118a, typeface));
    }
}
