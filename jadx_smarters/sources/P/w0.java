package P;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import okio.Segment;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6842a;

    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f6843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f6844b;

        public a(Window window, View view) {
            this.f6843a = window;
            this.f6844b = view;
        }

        public void c(int i9) {
            View decorView = this.f6843a.getDecorView();
            decorView.setSystemUiVisibility(i9 | decorView.getSystemUiVisibility());
        }

        public void d(int i9) {
            this.f6843a.addFlags(i9);
        }

        public void e(int i9) {
            View decorView = this.f6843a.getDecorView();
            decorView.setSystemUiVisibility((~i9) & decorView.getSystemUiVisibility());
        }

        public void f(int i9) {
            this.f6843a.clearFlags(i9);
        }
    }

    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // P.w0.e
        public void b(boolean z9) {
            if (!z9) {
                e(Segment.SIZE);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(Segment.SIZE);
        }
    }

    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // P.w0.e
        public void a(boolean z9) {
            if (!z9) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f6845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f6846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s.i f6847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Window f6848d;

        public d(Window window, w0 w0Var) {
            this(window.getInsetsController(), w0Var);
            this.f6848d = window;
        }

        public d(WindowInsetsController windowInsetsController, w0 w0Var) {
            this.f6847c = new s.i();
            this.f6846b = windowInsetsController;
            this.f6845a = w0Var;
        }

        @Override // P.w0.e
        public void a(boolean z9) {
            if (z9) {
                if (this.f6848d != null) {
                    c(16);
                }
                this.f6846b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f6848d != null) {
                    d(16);
                }
                this.f6846b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // P.w0.e
        public void b(boolean z9) {
            if (z9) {
                if (this.f6848d != null) {
                    c(Segment.SIZE);
                }
                this.f6846b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f6848d != null) {
                    d(Segment.SIZE);
                }
                this.f6846b.setSystemBarsAppearance(0, 8);
            }
        }

        public void c(int i9) {
            View decorView = this.f6848d.getDecorView();
            decorView.setSystemUiVisibility(i9 | decorView.getSystemUiVisibility());
        }

        public void d(int i9) {
            View decorView = this.f6848d.getDecorView();
            decorView.setSystemUiVisibility((~i9) & decorView.getSystemUiVisibility());
        }
    }

    public static class e {
        public void a(boolean z9) {
        }

        public void b(boolean z9) {
        }
    }

    public w0(Window window, View view) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            this.f6842a = new d(window, this);
        } else {
            this.f6842a = i9 >= 26 ? new c(window, view) : i9 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    public void a(boolean z9) {
        this.f6842a.a(z9);
    }

    public void b(boolean z9) {
        this.f6842a.b(z9);
    }
}
