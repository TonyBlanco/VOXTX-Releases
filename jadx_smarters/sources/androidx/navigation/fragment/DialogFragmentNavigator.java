package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.s;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class DialogFragmentNavigator extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f16334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16335c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f16336d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1184n f16337e = new InterfaceC1184n() { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.InterfaceC1184n
        public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
            if (bVar == AbstractC1180j.b.ON_STOP) {
                DialogInterfaceOnCancelListenerC1144d dialogInterfaceOnCancelListenerC1144d = (DialogInterfaceOnCancelListenerC1144d) interfaceC1186p;
                if (dialogInterfaceOnCancelListenerC1144d.requireDialog().isShowing()) {
                    return;
                }
                NavHostFragment.z(dialogInterfaceOnCancelListenerC1144d).u();
            }
        }
    };

    public static class a extends k implements androidx.navigation.b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f16339k;

        public a(s sVar) {
            super(sVar);
        }

        public final a A(String str) {
            this.f16339k = str;
            return this;
        }

        @Override // androidx.navigation.k
        public void p(Context context, AttributeSet attributeSet) {
            super.p(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, c.f16353c);
            String string = typedArrayObtainAttributes.getString(c.f16354d);
            if (string != null) {
                A(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String z() {
            String str = this.f16339k;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
    }

    public DialogFragmentNavigator(Context context, m mVar) {
        this.f16333a = context;
        this.f16334b = mVar;
    }

    @Override // androidx.navigation.s
    public void c(Bundle bundle) {
        if (bundle != null) {
            this.f16335c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i9 = 0; i9 < this.f16335c; i9++) {
                DialogInterfaceOnCancelListenerC1144d dialogInterfaceOnCancelListenerC1144d = (DialogInterfaceOnCancelListenerC1144d) this.f16334b.h0("androidx-nav-fragment:navigator:dialog:" + i9);
                if (dialogInterfaceOnCancelListenerC1144d != null) {
                    dialogInterfaceOnCancelListenerC1144d.getLifecycle().a(this.f16337e);
                } else {
                    this.f16336d.add("androidx-nav-fragment:navigator:dialog:" + i9);
                }
            }
        }
    }

    @Override // androidx.navigation.s
    public Bundle d() {
        if (this.f16335c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f16335c);
        return bundle;
    }

    @Override // androidx.navigation.s
    public boolean e() {
        if (this.f16335c == 0) {
            return false;
        }
        if (this.f16334b.K0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        m mVar = this.f16334b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i9 = this.f16335c - 1;
        this.f16335c = i9;
        sb.append(i9);
        Fragment fragmentH0 = mVar.h0(sb.toString());
        if (fragmentH0 != null) {
            fragmentH0.getLifecycle().c(this.f16337e);
            ((DialogInterfaceOnCancelListenerC1144d) fragmentH0).dismiss();
        }
        return true;
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this);
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public k b(a aVar, Bundle bundle, p pVar, s.a aVar2) {
        if (this.f16334b.K0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String strZ = aVar.z();
        if (strZ.charAt(0) == '.') {
            strZ = this.f16333a.getPackageName() + strZ;
        }
        Fragment fragmentA = this.f16334b.q0().a(this.f16333a.getClassLoader(), strZ);
        if (!DialogInterfaceOnCancelListenerC1144d.class.isAssignableFrom(fragmentA.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + aVar.z() + " is not an instance of DialogFragment");
        }
        DialogInterfaceOnCancelListenerC1144d dialogInterfaceOnCancelListenerC1144d = (DialogInterfaceOnCancelListenerC1144d) fragmentA;
        dialogInterfaceOnCancelListenerC1144d.setArguments(bundle);
        dialogInterfaceOnCancelListenerC1144d.getLifecycle().a(this.f16337e);
        m mVar = this.f16334b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i9 = this.f16335c;
        this.f16335c = i9 + 1;
        sb.append(i9);
        dialogInterfaceOnCancelListenerC1144d.show(mVar, sb.toString());
        return aVar;
    }

    public void h(Fragment fragment) {
        if (this.f16336d.remove(fragment.getTag())) {
            fragment.getLifecycle().a(this.f16337e);
        }
    }
}
