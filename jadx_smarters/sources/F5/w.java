package f5;

import P.E;
import P.L;
import P.X;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f40823a;

        public a(View view) {
            this.f40823a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f40823a.getContext().getSystemService("input_method")).showSoftInput(this.f40823a, 1);
        }
    }

    public class b implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f40824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f40825b;

        public b(d dVar, e eVar) {
            this.f40824a = dVar;
            this.f40825b = eVar;
        }

        @Override // P.E
        public X a(View view, X x9) {
            return this.f40824a.a(view, x9, new e(this.f40825b));
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            L.p0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        X a(View view, X x9, e eVar);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f40829d;

        public e(int i9, int i10, int i11, int i12) {
            this.f40826a = i9;
            this.f40827b = i10;
            this.f40828c = i11;
            this.f40829d = i12;
        }

        public e(e eVar) {
            this.f40826a = eVar.f40826a;
            this.f40827b = eVar.f40827b;
            this.f40828c = eVar.f40828c;
            this.f40829d = eVar.f40829d;
        }
    }

    public static void a(View view, d dVar) {
        L.E0(view, new b(dVar, new e(L.J(view), view.getPaddingTop(), L.I(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i9) {
        return TypedValue.applyDimension(1, i9, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float fY = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fY += L.y((View) parent);
        }
        return fY;
    }

    public static boolean e(View view) {
        return L.E(view) == 1;
    }

    public static PorterDuff.Mode f(int i9, PorterDuff.Mode mode) {
        if (i9 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i9 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i9 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i9) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(View view) {
        if (L.V(view)) {
            L.p0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}
