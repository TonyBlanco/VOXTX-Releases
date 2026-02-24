package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f17095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f17096b = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17097a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17101e;

        public void a(int i9) {
            this.f17097a = i9 | this.f17097a;
        }

        public boolean b() {
            int i9 = this.f17097a;
            if ((i9 & 7) != 0 && (i9 & c(this.f17100d, this.f17098b)) == 0) {
                return false;
            }
            int i10 = this.f17097a;
            if ((i10 & 112) != 0 && (i10 & (c(this.f17100d, this.f17099c) << 4)) == 0) {
                return false;
            }
            int i11 = this.f17097a;
            if ((i11 & 1792) != 0 && (i11 & (c(this.f17101e, this.f17098b) << 8)) == 0) {
                return false;
            }
            int i12 = this.f17097a;
            return (i12 & 28672) == 0 || (i12 & (c(this.f17101e, this.f17099c) << 12)) != 0;
        }

        public int c(int i9, int i10) {
            if (i9 > i10) {
                return 1;
            }
            return i9 == i10 ? 2 : 4;
        }

        public void d() {
            this.f17097a = 0;
        }

        public void e(int i9, int i10, int i11, int i12) {
            this.f17098b = i9;
            this.f17099c = i10;
            this.f17100d = i11;
            this.f17101e = i12;
        }
    }

    public interface b {
        View a(int i9);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public p(b bVar) {
        this.f17095a = bVar;
    }

    public View a(int i9, int i10, int i11, int i12) {
        int iC = this.f17095a.c();
        int iD = this.f17095a.d();
        int i13 = i10 > i9 ? 1 : -1;
        View view = null;
        while (i9 != i10) {
            View viewA = this.f17095a.a(i9);
            this.f17096b.e(iC, iD, this.f17095a.b(viewA), this.f17095a.e(viewA));
            if (i11 != 0) {
                this.f17096b.d();
                this.f17096b.a(i11);
                if (this.f17096b.b()) {
                    return viewA;
                }
            }
            if (i12 != 0) {
                this.f17096b.d();
                this.f17096b.a(i12);
                if (this.f17096b.b()) {
                    view = viewA;
                }
            }
            i9 += i13;
        }
        return view;
    }

    public boolean b(View view, int i9) {
        this.f17096b.e(this.f17095a.c(), this.f17095a.d(), this.f17095a.b(view), this.f17095a.e(view));
        if (i9 == 0) {
            return false;
        }
        this.f17096b.d();
        this.f17096b.a(i9);
        return this.f17096b.b();
    }
}
