package o2;

import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.InterfaceC2221b;

/* JADX INFO: renamed from: o2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2316k extends AbstractC2306a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f45760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Integer f45761e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f45762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f45763c;

    /* JADX INFO: renamed from: o2.k$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f45764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f45765b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0404a f45766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Point f45767d;

        /* JADX INFO: renamed from: o2.k$a$a, reason: collision with other inner class name */
        public static class ViewTreeObserverOnPreDrawListenerC0404a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference f45768a;

            public ViewTreeObserverOnPreDrawListenerC0404a(a aVar) {
                this.f45768a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called listener=" + this);
                }
                a aVar = (a) this.f45768a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.b();
                return true;
            }
        }

        public a(View view) {
            this.f45764a = view;
        }

        public final void b() {
            if (this.f45765b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (h(iG) && h(iF)) {
                i(iG, iF);
                ViewTreeObserver viewTreeObserver = this.f45764a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f45766c);
                }
                this.f45766c = null;
            }
        }

        public final Point c() {
            Point point = this.f45767d;
            if (point != null) {
                return point;
            }
            Display defaultDisplay = ((WindowManager) this.f45764a.getContext().getSystemService("window")).getDefaultDisplay();
            Point point2 = new Point();
            this.f45767d = point2;
            defaultDisplay.getSize(point2);
            return this.f45767d;
        }

        public void d(InterfaceC2313h interfaceC2313h) {
            int iG = g();
            int iF = f();
            if (h(iG) && h(iF)) {
                interfaceC2313h.e(iG, iF);
                return;
            }
            if (!this.f45765b.contains(interfaceC2313h)) {
                this.f45765b.add(interfaceC2313h);
            }
            if (this.f45766c == null) {
                ViewTreeObserver viewTreeObserver = this.f45764a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0404a viewTreeObserverOnPreDrawListenerC0404a = new ViewTreeObserverOnPreDrawListenerC0404a(this);
                this.f45766c = viewTreeObserverOnPreDrawListenerC0404a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0404a);
            }
        }

        public final int e(int i9, boolean z9) {
            if (i9 != -2) {
                return i9;
            }
            Point pointC = c();
            return z9 ? pointC.y : pointC.x;
        }

        public final int f() {
            ViewGroup.LayoutParams layoutParams = this.f45764a.getLayoutParams();
            if (h(this.f45764a.getHeight())) {
                return this.f45764a.getHeight();
            }
            if (layoutParams != null) {
                return e(layoutParams.height, true);
            }
            return 0;
        }

        public final int g() {
            ViewGroup.LayoutParams layoutParams = this.f45764a.getLayoutParams();
            if (h(this.f45764a.getWidth())) {
                return this.f45764a.getWidth();
            }
            if (layoutParams != null) {
                return e(layoutParams.width, false);
            }
            return 0;
        }

        public final boolean h(int i9) {
            return i9 > 0 || i9 == -2;
        }

        public final void i(int i9, int i10) {
            Iterator it = this.f45765b.iterator();
            while (it.hasNext()) {
                ((InterfaceC2313h) it.next()).e(i9, i10);
            }
            this.f45765b.clear();
        }
    }

    public AbstractC2316k(View view) {
        if (view == null) {
            throw new NullPointerException("View must not be null!");
        }
        this.f45762b = view;
        this.f45763c = new a(view);
    }

    @Override // o2.AbstractC2306a, o2.InterfaceC2315j
    public InterfaceC2221b e() {
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof InterfaceC2221b) {
            return (InterfaceC2221b) objJ;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public View getView() {
        return this.f45762b;
    }

    @Override // o2.AbstractC2306a, o2.InterfaceC2315j
    public void h(InterfaceC2221b interfaceC2221b) {
        k(interfaceC2221b);
    }

    @Override // o2.InterfaceC2315j
    public void i(InterfaceC2313h interfaceC2313h) {
        this.f45763c.d(interfaceC2313h);
    }

    public final Object j() {
        Integer num = f45761e;
        return num == null ? this.f45762b.getTag() : this.f45762b.getTag(num.intValue());
    }

    public final void k(Object obj) {
        Integer num = f45761e;
        if (num != null) {
            this.f45762b.setTag(num.intValue(), obj);
        } else {
            f45760d = true;
            this.f45762b.setTag(obj);
        }
    }

    public String toString() {
        return "Target for: " + this.f45762b;
    }
}
