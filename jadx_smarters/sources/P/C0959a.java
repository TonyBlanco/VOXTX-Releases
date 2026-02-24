package P;

import Q.C;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: P.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0959a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f6806c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f6807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f6808b;

    /* JADX INFO: renamed from: P.a$a, reason: collision with other inner class name */
    public static final class C0078a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0959a f6809a;

        public C0078a(C0959a c0959a) {
            this.f6809a = c0959a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f6809a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            Q.D dB = this.f6809a.b(view);
            if (dB != null) {
                return (AccessibilityNodeProvider) dB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f6809a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Q.C cY0 = Q.C.y0(accessibilityNodeInfo);
            cY0.p0(L.Z(view));
            cY0.g0(L.U(view));
            cY0.l0(L.r(view));
            cY0.t0(L.L(view));
            this.f6809a.g(view, cY0);
            cY0.e(accessibilityNodeInfo.getText(), view);
            List listC = C0959a.c(view);
            for (int i9 = 0; i9 < listC.size(); i9++) {
                cY0.b((C.a) listC.get(i9));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f6809a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f6809a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i9, Bundle bundle) {
            return this.f6809a.j(view, i9, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i9) {
            this.f6809a.l(view, i9);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f6809a.m(view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: P.a$b */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i9, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i9, bundle);
        }
    }

    public C0959a() {
        this(f6806c);
    }

    public C0959a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f6807a = accessibilityDelegate;
        this.f6808b = new C0078a(this);
    }

    public static List c(View view) {
        List list = (List) view.getTag(C.c.f788H);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f6807a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public Q.D b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f6807a, view);
        if (accessibilityNodeProviderA != null) {
            return new Q.D(accessibilityNodeProviderA);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f6808b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrP = Q.C.p(view.createAccessibilityNodeInfo().getText());
            for (int i9 = 0; clickableSpanArrP != null && i9 < clickableSpanArrP.length; i9++) {
                if (clickableSpan.equals(clickableSpanArrP[i9])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f6807a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, Q.C c9) {
        this.f6807a.onInitializeAccessibilityNodeInfo(view, c9.x0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f6807a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f6807a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i9, Bundle bundle) {
        List listC = c(view);
        boolean zB = false;
        int i10 = 0;
        while (true) {
            if (i10 >= listC.size()) {
                break;
            }
            C.a aVar = (C.a) listC.get(i10);
            if (aVar.b() == i9) {
                zB = aVar.d(view, bundle);
                break;
            }
            i10++;
        }
        if (!zB) {
            zB = b.b(this.f6807a, view, i9, bundle);
        }
        return (zB || i9 != C.c.f800a || bundle == null) ? zB : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i9, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C.c.f789I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i9)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i9) {
        this.f6807a.sendAccessibilityEvent(view, i9);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f6807a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
