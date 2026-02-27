package com.onesignal;

import android.content.Context;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.onesignal.C1530a;
import com.onesignal.F1;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.onesignal.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1577p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38800b = "com.onesignal.p1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f38801a;

    /* JADX INFO: renamed from: com.onesignal.p1$a */
    public class a extends m.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.m f38802a;

        public a(androidx.fragment.app.m mVar) {
            this.f38802a = mVar;
        }

        @Override // androidx.fragment.app.m.l
        public void e(androidx.fragment.app.m mVar, Fragment fragment) {
            super.e(mVar, fragment);
            if (fragment instanceof DialogInterfaceOnCancelListenerC1144d) {
                this.f38802a.v1(this);
                C1577p1.this.f38801a.a();
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.p1$b */
    public interface b {
        void a(String str, C1530a.c cVar);
    }

    /* JADX INFO: renamed from: com.onesignal.p1$c */
    public interface c {
        void a();
    }

    public C1577p1(c cVar) {
        this.f38801a = cVar;
    }

    public boolean b(Context context) {
        if (!(context instanceof androidx.appcompat.app.b)) {
            return false;
        }
        androidx.fragment.app.m supportFragmentManager = ((androidx.appcompat.app.b) context).getSupportFragmentManager();
        supportFragmentManager.d1(new a(supportFragmentManager), true);
        List listS0 = supportFragmentManager.s0();
        int size = listS0.size();
        if (size <= 0) {
            return false;
        }
        Fragment fragment = (Fragment) listS0.get(size - 1);
        return fragment.isVisible() && (fragment instanceof DialogInterfaceOnCancelListenerC1144d);
    }

    public boolean c() {
        if (F1.P() == null) {
            F1.c1(F1.v.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (b(F1.P())) {
                F1.c1(F1.v.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        } catch (NoClassDefFoundError e9) {
            F1.c1(F1.v.INFO, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e9);
        }
        C1530a c1530aB = C1533b.b();
        boolean zL = C1.l(new WeakReference(F1.P()));
        if (zL && c1530aB != null) {
            c1530aB.d(f38800b, this.f38801a);
            F1.c1(F1.v.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return !zL;
    }
}
