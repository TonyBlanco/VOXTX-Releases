package i;

import P.S;
import P.T;
import P.U;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f41774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f41775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41776e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41773b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U f41777f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41772a = new ArrayList();

    public class a extends U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f41778a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41779b = 0;

        public a() {
        }

        @Override // P.T
        public void b(View view) {
            int i9 = this.f41779b + 1;
            this.f41779b = i9;
            if (i9 == h.this.f41772a.size()) {
                T t9 = h.this.f41775d;
                if (t9 != null) {
                    t9.b(null);
                }
                d();
            }
        }

        @Override // P.U, P.T
        public void c(View view) {
            if (this.f41778a) {
                return;
            }
            this.f41778a = true;
            T t9 = h.this.f41775d;
            if (t9 != null) {
                t9.c(null);
            }
        }

        public void d() {
            this.f41779b = 0;
            this.f41778a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f41776e) {
            Iterator it = this.f41772a.iterator();
            while (it.hasNext()) {
                ((S) it.next()).c();
            }
            this.f41776e = false;
        }
    }

    public void b() {
        this.f41776e = false;
    }

    public h c(S s9) {
        if (!this.f41776e) {
            this.f41772a.add(s9);
        }
        return this;
    }

    public h d(S s9, S s10) {
        this.f41772a.add(s9);
        s10.l(s9.d());
        this.f41772a.add(s10);
        return this;
    }

    public h e(long j9) {
        if (!this.f41776e) {
            this.f41773b = j9;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f41776e) {
            this.f41774c = interpolator;
        }
        return this;
    }

    public h g(T t9) {
        if (!this.f41776e) {
            this.f41775d = t9;
        }
        return this;
    }

    public void h() {
        if (this.f41776e) {
            return;
        }
        for (S s9 : this.f41772a) {
            long j9 = this.f41773b;
            if (j9 >= 0) {
                s9.h(j9);
            }
            Interpolator interpolator = this.f41774c;
            if (interpolator != null) {
                s9.i(interpolator);
            }
            if (this.f41775d != null) {
                s9.j(this.f41777f);
            }
            s9.n();
        }
        this.f41776e = true;
    }
}
