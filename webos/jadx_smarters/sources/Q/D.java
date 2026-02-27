package Q;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7428a;

    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D f7429a;

        public a(D d9) {
            this.f7429a = d9;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i9) {
            C cB = this.f7429a.b(i9);
            if (cB == null) {
                return null;
            }
            return cB.x0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i9) {
            List listC = this.f7429a.c(str, i9);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((C) listC.get(i10)).x0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i9, int i10, Bundle bundle) {
            return this.f7429a.f(i9, i10, bundle);
        }
    }

    public static class b extends a {
        public b(D d9) {
            super(d9);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i9) {
            C cD = this.f7429a.d(i9);
            if (cD == null) {
                return null;
            }
            return cD.x0();
        }
    }

    public static class c extends b {
        public c(D d9) {
            super(d9);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i9, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f7429a.a(i9, C.y0(accessibilityNodeInfo), str, bundle);
        }
    }

    public D() {
        this.f7428a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public D(Object obj) {
        this.f7428a = obj;
    }

    public void a(int i9, C c9, String str, Bundle bundle) {
    }

    public C b(int i9) {
        return null;
    }

    public List c(String str, int i9) {
        return null;
    }

    public C d(int i9) {
        return null;
    }

    public Object e() {
        return this.f7428a;
    }

    public boolean f(int i9, int i10, Bundle bundle) {
        return false;
    }
}
