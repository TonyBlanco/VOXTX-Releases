package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends Fragment implements InterfaceC1369j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WeakHashMap f26665e = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26666a = DesugarCollections.synchronizedMap(new C2695a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26667c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f26668d;

    public static l1 c(Activity activity) {
        l1 l1Var;
        WeakHashMap weakHashMap = f26665e;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (l1Var = (l1) weakReference.get()) != null) {
            return l1Var;
        }
        try {
            l1 l1Var2 = (l1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (l1Var2 == null || l1Var2.isRemoving()) {
                l1Var2 = new l1();
                activity.getFragmentManager().beginTransaction().add(l1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(l1Var2));
            return l1Var2;
        } catch (ClassCastException e9) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e9);
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f26666a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1369j
    public final void f(String str, LifecycleCallback lifecycleCallback) {
        if (this.f26666a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f26666a.put(str, lifecycleCallback);
        if (this.f26667c > 0) {
            new zzi(Looper.getMainLooper()).post(new k1(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1369j
    public final LifecycleCallback g(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f26666a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1369j
    public final Activity h() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        Iterator it = this.f26666a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i9, i10, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26667c = 1;
        this.f26668d = bundle;
        for (Map.Entry entry : this.f26666a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f26667c = 5;
        Iterator it = this.f26666a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f26667c = 3;
        Iterator it = this.f26666a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f26666a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f26667c = 2;
        Iterator it = this.f26666a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f26667c = 4;
        Iterator it = this.f26666a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
