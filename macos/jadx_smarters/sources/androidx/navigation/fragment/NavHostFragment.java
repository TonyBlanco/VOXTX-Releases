package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.n;
import androidx.navigation.r;
import androidx.navigation.s;
import androidx.navigation.v;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f16340a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f16341c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f16342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16344f;

    public static NavController z(Fragment fragment) {
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).B();
            }
            Fragment fragmentX0 = parentFragment.getParentFragmentManager().x0();
            if (fragmentX0 instanceof NavHostFragment) {
                return ((NavHostFragment) fragmentX0).B();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return r.b(view);
        }
        Dialog dialog = fragment instanceof DialogInterfaceOnCancelListenerC1144d ? ((DialogInterfaceOnCancelListenerC1144d) fragment).getDialog() : null;
        if (dialog != null && dialog.getWindow() != null) {
            return r.b(dialog.getWindow().getDecorView());
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    public final int A() {
        int id = getId();
        return (id == 0 || id == -1) ? b.f16350a : id;
    }

    public final NavController B() {
        n nVar = this.f16340a;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    public void D(NavController navController) {
        navController.l().a(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
        navController.l().a(x());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f16344f) {
            getParentFragmentManager().m().v(this).i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        ((DialogFragmentNavigator) this.f16340a.l().d(DialogFragmentNavigator.class)).h(fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        n nVar = new n(requireContext());
        this.f16340a = nVar;
        nVar.D(this);
        this.f16340a.E(requireActivity().getOnBackPressedDispatcher());
        n nVar2 = this.f16340a;
        Boolean bool = this.f16341c;
        nVar2.c(bool != null && bool.booleanValue());
        this.f16341c = null;
        this.f16340a.F(getViewModelStore());
        D(this.f16340a);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f16344f = true;
                getParentFragmentManager().m().v(this).i();
            }
            this.f16343e = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f16340a.y(bundle2);
        }
        int i9 = this.f16343e;
        if (i9 != 0) {
            this.f16340a.A(i9);
        } else {
            Bundle arguments = getArguments();
            int i10 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle3 = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i10 != 0) {
                this.f16340a.B(i10, bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(A());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f16342d;
        if (view != null && r.b(view) == this.f16340a) {
            r.e(this.f16342d, null);
        }
        this.f16342d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f16472p);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(v.f16473q, 0);
        if (resourceId != 0) {
            this.f16343e = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.f16368r);
        if (typedArrayObtainStyledAttributes2.getBoolean(c.f16369s, false)) {
            this.f16344f = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrimaryNavigationFragmentChanged(boolean z9) {
        n nVar = this.f16340a;
        if (nVar != null) {
            nVar.c(z9);
        } else {
            this.f16341c = Boolean.valueOf(z9);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundleZ = this.f16340a.z();
        if (bundleZ != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundleZ);
        }
        if (this.f16344f) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i9 = this.f16343e;
        if (i9 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i9);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        r.e(view, this.f16340a);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.f16342d = view2;
            if (view2.getId() == getId()) {
                r.e(this.f16342d, this.f16340a);
            }
        }
    }

    public s x() {
        return new a(requireContext(), getChildFragmentManager(), A());
    }
}
