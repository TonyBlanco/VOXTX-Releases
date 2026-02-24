package androidx.activity;

import D.AbstractActivityC0525h;
import D.AbstractC0519b;
import D.AbstractC0521d;
import D.C0526i;
import F0.c;
import P.C0979v;
import P.InterfaceC0981x;
import a.C1071a;
import a.InterfaceC1072b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.C;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC1179i;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.q;
import androidx.lifecycle.z;
import b.AbstractC1191a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m0.AbstractC2215a;
import m0.C2218d;

/* JADX INFO: loaded from: classes.dex */
public abstract class ComponentActivity extends AbstractActivityC0525h implements InterfaceC1186p, N, InterfaceC1179i, F0.e, l, androidx.activity.result.d {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    private J.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<O.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<O.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<O.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<O.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<O.a> mOnTrimMemoryListeners;
    final F0.d mSavedStateRegistryController;
    private M mViewModelStore;
    final C1071a mContextAwareHelper = new C1071a();
    private final C0979v mMenuHostHelper = new C0979v(new Runnable() { // from class: androidx.activity.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f13515a.invalidateMenu();
        }
    });
    private final q mLifecycleRegistry = new q(this);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e9) {
                if (!TextUtils.equals(e9.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e9;
                }
            }
        }
    }

    public class b extends ActivityResultRegistry {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f13490a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractC1191a.C0206a f13491c;

            public a(int i9, AbstractC1191a.C0206a c0206a) {
                this.f13490a = i9;
                this.f13491c = c0206a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f13490a, this.f13491c.a());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0156b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f13493a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f13494c;

            public RunnableC0156b(int i9, IntentSender.SendIntentException sendIntentException) {
                this.f13493a = i9;
                this.f13494c = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f13493a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f13494c));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public void f(int i9, AbstractC1191a abstractC1191a, Object obj, AbstractC0521d abstractC0521d) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC1191a.C0206a c0206aB = abstractC1191a.b(componentActivity, obj);
            if (c0206aB != null) {
                new Handler(Looper.getMainLooper()).post(new a(i9, c0206aB));
                return;
            }
            Intent intentA = abstractC1191a.a(componentActivity, obj);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC0519b.h(componentActivity, stringArrayExtra, i9);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                AbstractC0519b.m(componentActivity, intentA, i9, bundle);
                return;
            }
            androidx.activity.result.e eVar = (androidx.activity.result.e) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC0519b.n(componentActivity, eVar.e(), i9, eVar.a(), eVar.c(), eVar.d(), 0, bundle);
            } catch (IntentSender.SendIntentException e9) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0156b(i9, e9));
            }
        }
    }

    public static class c {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class d {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public M f13497b;
    }

    public ComponentActivity() {
        F0.d dVarA = F0.d.a(this);
        this.mSavedStateRegistryController = dVarA;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i9 = Build.VERSION.SDK_INT;
        getLifecycle().a(new InterfaceC1184n() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC1184n
            public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
                if (bVar == AbstractC1180j.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        c.a(viewPeekDecorView);
                    }
                }
            }
        });
        getLifecycle().a(new InterfaceC1184n() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC1184n
            public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
                if (bVar == AbstractC1180j.b.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().a();
                }
            }
        });
        getLifecycle().a(new InterfaceC1184n() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.InterfaceC1184n
            public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
        dVarA.c();
        C.c(this);
        if (i9 <= 23) {
            getLifecycle().a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new c.InterfaceC0023c() { // from class: androidx.activity.c
            @Override // F0.c.InterfaceC0023c
            public final Bundle a() {
                return this.f13516a.d1();
            }
        });
        addOnContextAvailableListener(new InterfaceC1072b() { // from class: androidx.activity.d
            @Override // a.InterfaceC1072b
            public final void a(Context context) {
                this.f13517a.e1(context);
            }
        });
    }

    private void c1() {
        O.a(getWindow().getDecorView(), this);
        P.a(getWindow().getDecorView(), this);
        F0.f.a(getWindow().getDecorView(), this);
        n.a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        c1();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0981x interfaceC0981x) {
        this.mMenuHostHelper.c(interfaceC0981x);
    }

    public void addMenuProvider(InterfaceC0981x interfaceC0981x, InterfaceC1186p interfaceC1186p) {
        this.mMenuHostHelper.d(interfaceC0981x, interfaceC1186p);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC0981x interfaceC0981x, InterfaceC1186p interfaceC1186p, AbstractC1180j.c cVar) {
        this.mMenuHostHelper.e(interfaceC0981x, interfaceC1186p, cVar);
    }

    public final void addOnConfigurationChangedListener(O.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(InterfaceC1072b interfaceC1072b) {
        this.mContextAwareHelper.a(interfaceC1072b);
    }

    public final void addOnMultiWindowModeChangedListener(O.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(O.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(O.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(O.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public final /* synthetic */ Bundle d1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    public final /* synthetic */ void e1(Context context) {
        Bundle bundleB = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (bundleB != null) {
            this.mActivityResultRegistry.g(bundleB);
        }
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f13497b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new M();
            }
        }
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1179i
    public AbstractC2215a getDefaultViewModelCreationExtras() {
        C2218d c2218d = new C2218d();
        if (getApplication() != null) {
            c2218d.c(J.a.f15868g, getApplication());
        }
        c2218d.c(C.f15836a, this);
        c2218d.c(C.f15837b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c2218d.c(C.f15838c, getIntent().getExtras());
        }
        return c2218d;
    }

    public J.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new F(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f13496a;
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC1186p
    public AbstractC1180j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.l
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // F0.e
    public final F0.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.N
    public M getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        if (this.mActivityResultRegistry.b(i9, i10, intent)) {
            return;
        }
        super.onActivityResult(i9, i10, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<O.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        z.g(this);
        if (L.a.d()) {
            this.mOnBackPressedDispatcher.g(d.a(this));
        }
        int i9 = this.mContentLayoutId;
        if (i9 != 0) {
            setContentView(i9);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i9, Menu menu) {
        if (i9 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i9, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        if (i9 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<O.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0526i(z9));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z9, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<O.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0526i(z9, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<O.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i9, Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i9, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<O.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new D.M(z9));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z9, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<O.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new D.M(z9, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i9, View view, Menu menu) {
        if (i9 != 0) {
            return true;
        }
        super.onPreparePanel(i9, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.b(i9, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i9, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        M m9 = this.mViewModelStore;
        if (m9 == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            m9 = eVar.f13497b;
        }
        if (m9 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f13496a = objOnRetainCustomNonConfigurationInstance;
        eVar2.f13497b = m9;
        return eVar2;
    }

    @Override // D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1180j lifecycle = getLifecycle();
        if (lifecycle instanceof q) {
            ((q) lifecycle).o(AbstractC1180j.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i9) {
        super.onTrimMemory(i9);
        Iterator<O.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i9));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(AbstractC1191a abstractC1191a, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b bVar) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC1191a, bVar);
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(AbstractC1191a abstractC1191a, androidx.activity.result.b bVar) {
        return registerForActivityResult(abstractC1191a, this.mActivityResultRegistry, bVar);
    }

    public void removeMenuProvider(InterfaceC0981x interfaceC0981x) {
        this.mMenuHostHelper.l(interfaceC0981x);
    }

    public final void removeOnConfigurationChangedListener(O.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(InterfaceC1072b interfaceC1072b) {
        this.mContextAwareHelper.e(interfaceC1072b);
    }

    public final void removeOnMultiWindowModeChangedListener(O.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(O.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(O.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(O.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (J0.b.d()) {
                J0.b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            J0.b.b();
        } catch (Throwable th) {
            J0.b.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i9) {
        c1();
        super.setContentView(i9);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        c1();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        c1();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i9) {
        super.startActivityForResult(intent, i9);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i9, Bundle bundle) {
        super.startActivityForResult(intent, i9, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12, bundle);
    }
}
