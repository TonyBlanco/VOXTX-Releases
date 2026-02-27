package androidx.fragment.app;

import P.L;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.N;
import e0.AbstractC1728b;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f15142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f15143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f15144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15145d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15146e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15147a;

        public a(View view) {
            this.f15147a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f15147a.removeOnAttachStateChangeListener(this);
            L.p0(this.f15147a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15149a;

        static {
            int[] iArr = new int[AbstractC1180j.c.values().length];
            f15149a = iArr;
            try {
                iArr[AbstractC1180j.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15149a[AbstractC1180j.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15149a[AbstractC1180j.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15149a[AbstractC1180j.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public t(l lVar, v vVar, Fragment fragment) {
        this.f15142a = lVar;
        this.f15143b = vVar;
        this.f15144c = fragment;
    }

    public t(l lVar, v vVar, Fragment fragment, s sVar) {
        this.f15142a = lVar;
        this.f15143b = vVar;
        this.f15144c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = sVar.f15141n;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public t(l lVar, v vVar, ClassLoader classLoader, i iVar, s sVar) {
        this.f15142a = lVar;
        this.f15143b = vVar;
        Fragment fragmentA = iVar.a(classLoader, sVar.f15129a);
        this.f15144c = fragmentA;
        Bundle bundle = sVar.f15138k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.setArguments(sVar.f15138k);
        fragmentA.mWho = sVar.f15130c;
        fragmentA.mFromLayout = sVar.f15131d;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = sVar.f15132e;
        fragmentA.mContainerId = sVar.f15133f;
        fragmentA.mTag = sVar.f15134g;
        fragmentA.mRetainInstance = sVar.f15135h;
        fragmentA.mRemoving = sVar.f15136i;
        fragmentA.mDetached = sVar.f15137j;
        fragmentA.mHidden = sVar.f15139l;
        fragmentA.mMaxState = AbstractC1180j.c.values()[sVar.f15140m];
        Bundle bundle2 = sVar.f15141n;
        fragmentA.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        if (m.F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public void a() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f15144c);
        }
        Fragment fragment = this.f15144c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        l lVar = this.f15142a;
        Fragment fragment2 = this.f15144c;
        lVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        int iJ = this.f15143b.j(this.f15144c);
        Fragment fragment = this.f15144c;
        fragment.mContainer.addView(fragment.mView, iJ);
    }

    public void c() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f15144c);
        }
        Fragment fragment = this.f15144c;
        Fragment fragment2 = fragment.mTarget;
        t tVarM = null;
        if (fragment2 != null) {
            t tVarM2 = this.f15143b.m(fragment2.mWho);
            if (tVarM2 == null) {
                throw new IllegalStateException("Fragment " + this.f15144c + " declared target fragment " + this.f15144c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f15144c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            tVarM = tVarM2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (tVarM = this.f15143b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f15144c + " declared target fragment " + this.f15144c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (tVarM != null && (m.f15044P || tVarM.k().mState < 1)) {
            tVarM.m();
        }
        Fragment fragment4 = this.f15144c;
        fragment4.mHost = fragment4.mFragmentManager.t0();
        Fragment fragment5 = this.f15144c;
        fragment5.mParentFragment = fragment5.mFragmentManager.w0();
        this.f15142a.g(this.f15144c, false);
        this.f15144c.performAttach();
        this.f15142a.b(this.f15144c, false);
    }

    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f15144c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int iMin = this.f15146e;
        int i9 = b.f15149a[fragment2.mMaxState.ordinal()];
        if (i9 != 1) {
            iMin = i9 != 2 ? i9 != 3 ? i9 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment3 = this.f15144c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                iMin = Math.max(this.f15146e, 2);
                View view = this.f15144c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f15146e < 4 ? Math.min(iMin, fragment3.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f15144c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        C.e.b bVarL = (!m.f15044P || (viewGroup = (fragment = this.f15144c).mContainer) == null) ? null : C.n(viewGroup, fragment.getParentFragmentManager()).l(this);
        if (bVarL == C.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == C.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f15144c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f15144c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (m.F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f15144c);
        }
        return iMin;
    }

    public void e() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f15144c);
        }
        Fragment fragment = this.f15144c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f15144c.mState = 1;
            return;
        }
        this.f15142a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f15144c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        l lVar = this.f15142a;
        Fragment fragment3 = this.f15144c;
        lVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void f() {
        String resourceName;
        if (this.f15144c.mFromLayout) {
            return;
        }
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f15144c);
        }
        Fragment fragment = this.f15144c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f15144c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i9 = fragment2.mContainerId;
            if (i9 == 0) {
                viewGroup = null;
            } else {
                if (i9 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f15144c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.n0().c(this.f15144c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f15144c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f15144c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f15144c.mContainerId) + " (" + resourceName + ") for fragment " + this.f15144c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f15144c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f15144c.mView;
        if (view != null) {
            boolean z9 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f15144c;
            fragment5.mView.setTag(AbstractC1728b.f40133a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f15144c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (L.V(this.f15144c.mView)) {
                L.p0(this.f15144c.mView);
            } else {
                View view2 = this.f15144c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f15144c.performViewCreated();
            l lVar = this.f15142a;
            Fragment fragment7 = this.f15144c;
            lVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f15144c.mView.getVisibility();
            float alpha = this.f15144c.mView.getAlpha();
            if (m.f15044P) {
                this.f15144c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f15144c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View viewFindFocus = fragment8.mView.findFocus();
                    if (viewFindFocus != null) {
                        this.f15144c.setFocusedView(viewFindFocus);
                        if (m.F0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f15144c);
                        }
                    }
                    this.f15144c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f15144c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z9 = true;
                }
                fragment9.mIsNewlyAdded = z9;
            }
        }
        this.f15144c.mState = 2;
    }

    public void g() {
        Fragment fragmentF;
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f15144c);
        }
        Fragment fragment = this.f15144c;
        boolean zIsChangingConfigurations = true;
        boolean z9 = fragment.mRemoving && !fragment.isInBackStack();
        if (!z9 && !this.f15143b.o().l(this.f15144c)) {
            String str = this.f15144c.mTargetWho;
            if (str != null && (fragmentF = this.f15143b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f15144c.mTarget = fragmentF;
            }
            this.f15144c.mState = 0;
            return;
        }
        j jVar = this.f15144c.mHost;
        if (jVar instanceof N) {
            zIsChangingConfigurations = this.f15143b.o().i();
        } else if (jVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) jVar.f()).isChangingConfigurations();
        }
        if (z9 || zIsChangingConfigurations) {
            this.f15143b.o().c(this.f15144c);
        }
        this.f15144c.performDestroy();
        this.f15142a.d(this.f15144c, false);
        for (t tVar : this.f15143b.k()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (this.f15144c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f15144c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f15144c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f15143b.f(str2);
        }
        this.f15143b.q(this);
    }

    public void h() {
        View view;
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f15144c);
        }
        Fragment fragment = this.f15144c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f15144c.performDestroyView();
        this.f15142a.n(this.f15144c, false);
        Fragment fragment2 = this.f15144c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.o(null);
        this.f15144c.mInLayout = false;
    }

    public void i() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f15144c);
        }
        this.f15144c.performDetach();
        this.f15142a.e(this.f15144c, false);
        Fragment fragment = this.f15144c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f15143b.o().l(this.f15144c)) {
            return;
        }
        if (m.F0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f15144c);
        }
        this.f15144c.initState();
    }

    public void j() {
        Fragment fragment = this.f15144c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (m.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f15144c);
            }
            Fragment fragment2 = this.f15144c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f15144c.mSavedFragmentState);
            View view = this.f15144c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f15144c;
                fragment3.mView.setTag(AbstractC1728b.f40133a, fragment3);
                Fragment fragment4 = this.f15144c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f15144c.performViewCreated();
                l lVar = this.f15142a;
                Fragment fragment5 = this.f15144c;
                lVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f15144c.mState = 2;
            }
        }
    }

    public Fragment k() {
        return this.f15144c;
    }

    public final boolean l(View view) {
        if (view == this.f15144c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f15144c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f15145d) {
            if (m.F0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f15145d = true;
            while (true) {
                int iD = d();
                Fragment fragment = this.f15144c;
                int i9 = fragment.mState;
                if (iD == i9) {
                    if (m.f15044P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            C cN = C.n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f15144c.mHidden) {
                                cN.c(this);
                            } else {
                                cN.e(this);
                            }
                        }
                        Fragment fragment2 = this.f15144c;
                        m mVar = fragment2.mFragmentManager;
                        if (mVar != null) {
                            mVar.D0(fragment2);
                        }
                        Fragment fragment3 = this.f15144c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    this.f15145d = false;
                    return;
                }
                if (iD <= i9) {
                    switch (i9 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.f15144c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (m.F0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f15144c);
                            }
                            Fragment fragment4 = this.f15144c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment5 = this.f15144c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                C.n(viewGroup3, fragment5.getParentFragmentManager()).d(this);
                            }
                            this.f15144c.mState = 3;
                            break;
                        case 4:
                            w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i9 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                C.n(viewGroup2, fragment.getParentFragmentManager()).b(C.e.c.from(this.f15144c.mView.getVisibility()), this);
                            }
                            this.f15144c.mState = 4;
                            break;
                        case 5:
                            v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f15145d = false;
            throw th;
        }
    }

    public void n() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f15144c);
        }
        this.f15144c.performPause();
        this.f15142a.f(this.f15144c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f15144c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f15144c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f15144c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f15144c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f15144c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f15144c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f15144c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f15144c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void p() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f15144c);
        }
        View focusedView = this.f15144c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (m.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f15144c);
                sb.append(" resulting in focused view ");
                sb.append(this.f15144c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f15144c.setFocusedView(null);
        this.f15144c.performResume();
        this.f15142a.i(this.f15144c, false);
        Fragment fragment = this.f15144c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.f15144c.performSaveInstanceState(bundle);
        this.f15142a.j(this.f15144c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f15144c.mView != null) {
            t();
        }
        if (this.f15144c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f15144c.mSavedViewState);
        }
        if (this.f15144c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f15144c.mSavedViewRegistryState);
        }
        if (!this.f15144c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f15144c.mUserVisibleHint);
        }
        return bundle;
    }

    public Fragment.m r() {
        Bundle bundleQ;
        if (this.f15144c.mState <= -1 || (bundleQ = q()) == null) {
            return null;
        }
        return new Fragment.m(bundleQ);
    }

    public s s() {
        s sVar = new s(this.f15144c);
        Fragment fragment = this.f15144c;
        if (fragment.mState <= -1 || sVar.f15141n != null) {
            sVar.f15141n = fragment.mSavedFragmentState;
        } else {
            Bundle bundleQ = q();
            sVar.f15141n = bundleQ;
            if (this.f15144c.mTargetWho != null) {
                if (bundleQ == null) {
                    sVar.f15141n = new Bundle();
                }
                sVar.f15141n.putString("android:target_state", this.f15144c.mTargetWho);
                int i9 = this.f15144c.mTargetRequestCode;
                if (i9 != 0) {
                    sVar.f15141n.putInt("android:target_req_state", i9);
                }
            }
        }
        return sVar;
    }

    public void t() {
        if (this.f15144c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f15144c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f15144c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f15144c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f15144c.mSavedViewRegistryState = bundle;
    }

    public void u(int i9) {
        this.f15146e = i9;
    }

    public void v() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f15144c);
        }
        this.f15144c.performStart();
        this.f15142a.k(this.f15144c, false);
    }

    public void w() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f15144c);
        }
        this.f15144c.performStop();
        this.f15142a.l(this.f15144c, false);
    }
}
