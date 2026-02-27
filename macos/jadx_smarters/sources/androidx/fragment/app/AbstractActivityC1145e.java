package androidx.fragment.app;

import D.AbstractC0519b;
import D.O;
import F0.c;
import a.InterfaceC1072b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import n0.AbstractC2242a;

/* JADX INFO: renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1145e extends ComponentActivity implements AbstractC0519b.f, AbstractC0519b.g {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    boolean mResumed;
    final h mFragments = h.b(new c());
    final androidx.lifecycle.q mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
    boolean mStopped = true;

    /* JADX INFO: renamed from: androidx.fragment.app.e$a */
    public class a implements c.InterfaceC0023c {
        public a() {
        }

        @Override // F0.c.InterfaceC0023c
        public Bundle a() {
            Bundle bundle = new Bundle();
            AbstractActivityC1145e.this.markFragmentsCreated();
            AbstractActivityC1145e.this.mFragmentLifecycleRegistry.h(AbstractC1180j.b.ON_STOP);
            Parcelable parcelableX = AbstractActivityC1145e.this.mFragments.x();
            if (parcelableX != null) {
                bundle.putParcelable(AbstractActivityC1145e.FRAGMENTS_TAG, parcelableX);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$b */
    public class b implements InterfaceC1072b {
        public b() {
        }

        @Override // a.InterfaceC1072b
        public void a(Context context) {
            AbstractActivityC1145e.this.mFragments.a(null);
            Bundle bundleB = AbstractActivityC1145e.this.getSavedStateRegistry().b(AbstractActivityC1145e.FRAGMENTS_TAG);
            if (bundleB != null) {
                AbstractActivityC1145e.this.mFragments.w(bundleB.getParcelable(AbstractActivityC1145e.FRAGMENTS_TAG));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$c */
    public class c extends j implements N, androidx.activity.l, androidx.activity.result.d, q {
        public c() {
            super(AbstractActivityC1145e.this);
        }

        @Override // androidx.fragment.app.q
        public void a(m mVar, Fragment fragment) {
            AbstractActivityC1145e.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.g
        public View c(int i9) {
            return AbstractActivityC1145e.this.findViewById(i9);
        }

        @Override // androidx.fragment.app.g
        public boolean d() {
            Window window = AbstractActivityC1145e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry getActivityResultRegistry() {
            return AbstractActivityC1145e.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1186p
        public AbstractC1180j getLifecycle() {
            return AbstractActivityC1145e.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.l
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return AbstractActivityC1145e.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.N
        public M getViewModelStore() {
            return AbstractActivityC1145e.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.j
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC1145e.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.j
        public LayoutInflater j() {
            return AbstractActivityC1145e.this.getLayoutInflater().cloneInContext(AbstractActivityC1145e.this);
        }

        @Override // androidx.fragment.app.j
        public boolean l(Fragment fragment) {
            return !AbstractActivityC1145e.this.isFinishing();
        }

        @Override // androidx.fragment.app.j
        public boolean m(String str) {
            return AbstractC0519b.l(AbstractActivityC1145e.this, str);
        }

        @Override // androidx.fragment.app.j
        public void p() {
            AbstractActivityC1145e.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC1145e i() {
            return AbstractActivityC1145e.this;
        }
    }

    public AbstractActivityC1145e() {
        f1();
    }

    private void f1() {
        getSavedStateRegistry().h(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    public static boolean g1(m mVar, AbstractC1180j.c cVar) {
        boolean zG1 = false;
        for (Fragment fragment : mVar.s0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zG1 |= g1(fragment.getChildFragmentManager(), cVar);
                }
                A a9 = fragment.mViewLifecycleOwner;
                if (a9 != null && a9.getLifecycle().b().isAtLeast(AbstractC1180j.c.STARTED)) {
                    fragment.mViewLifecycleOwner.f(cVar);
                    zG1 = true;
                }
                if (fragment.mLifecycleRegistry.b().isAtLeast(AbstractC1180j.c.STARTED)) {
                    fragment.mLifecycleRegistry.o(cVar);
                    zG1 = true;
                }
            }
        }
        return zG1;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC2242a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.t().W(str, fileDescriptor, printWriter, strArr);
    }

    public m getSupportFragmentManager() {
        return this.mFragments.t();
    }

    @Deprecated
    public AbstractC2242a getSupportLoaderManager() {
        return AbstractC2242a.b(this);
    }

    public void markFragmentsCreated() {
        while (g1(getSupportFragmentManager(), AbstractC1180j.c.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        this.mFragments.u();
        super.onActivityResult(i9, i10, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.u();
        super.onConfigurationChanged(configuration);
        this.mFragments.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(AbstractC1180j.b.ON_CREATE);
        this.mFragments.f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i9, Menu menu) {
        return i9 == 0 ? super.onCreatePanelMenu(i9, menu) | this.mFragments.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i9, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.h(AbstractC1180j.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        if (i9 == 0) {
            return this.mFragments.k(menuItem);
        }
        if (i9 != 6) {
            return false;
        }
        return this.mFragments.e(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z9) {
        this.mFragments.j(z9);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.u();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i9, Menu menu) {
        if (i9 == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(i9, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.h(AbstractC1180j.b.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9) {
        this.mFragments.n(z9);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i9, View view, Menu menu) {
        return i9 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu) : super.onPreparePanel(i9, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        this.mFragments.u();
        super.onRequestPermissionsResult(i9, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.s();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(AbstractC1180j.b.ON_RESUME);
        this.mFragments.p();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.h(AbstractC1180j.b.ON_START);
        this.mFragments.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.h(AbstractC1180j.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(O o9) {
        AbstractC0519b.j(this, o9);
    }

    public void setExitSharedElementCallback(O o9) {
        AbstractC0519b.k(this, o9);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i9) {
        startActivityFromFragment(fragment, intent, i9, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i9, Bundle bundle) {
        if (i9 == -1) {
            AbstractC0519b.m(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i9, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        if (i9 == -1) {
            AbstractC0519b.n(this, intentSender, i9, intent, i10, i11, i12, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        AbstractC0519b.c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        AbstractC0519b.f(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0519b.o(this);
    }

    @Override // D.AbstractC0519b.g
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i9) {
    }
}
