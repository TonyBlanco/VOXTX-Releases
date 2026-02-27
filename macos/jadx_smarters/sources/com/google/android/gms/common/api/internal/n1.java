package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC1145e;
import androidx.fragment.app.Fragment;
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
public final class n1 extends Fragment implements InterfaceC1369j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WeakHashMap f26676e = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26677a = DesugarCollections.synchronizedMap(new C2695a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26678c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f26679d;

    public static n1 A(AbstractActivityC1145e abstractActivityC1145e) {
        n1 n1Var;
        WeakHashMap weakHashMap = f26676e;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC1145e);
        if (weakReference != null && (n1Var = (n1) weakReference.get()) != null) {
            return n1Var;
        }
        try {
            n1 n1Var2 = (n1) abstractActivityC1145e.getSupportFragmentManager().h0("SupportLifecycleFragmentImpl");
            if (n1Var2 == null || n1Var2.isRemoving()) {
                n1Var2 = new n1();
                abstractActivityC1145e.getSupportFragmentManager().m().e(n1Var2, "SupportLifecycleFragmentImpl").j();
            }
            weakHashMap.put(abstractActivityC1145e, new WeakReference(n1Var2));
            return n1Var2;
        } catch (ClassCastException e9) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e9);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f26677a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1369j
    public final void f(String str, LifecycleCallback lifecycleCallback) {
        if (this.f26677a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f26677a.put(str, lifecycleCallback);
        if (this.f26678c > 0) {
            new zzi(Looper.getMainLooper()).post(new m1(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1369j
    public final LifecycleCallback g(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f26677a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1369j
    public final /* synthetic */ Activity h() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        Iterator it = this.f26677a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i9, i10, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26678c = 1;
        this.f26679d = bundle;
        for (Map.Entry entry : this.f26677a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f26678c = 5;
        Iterator it = this.f26677a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f26678c = 3;
        Iterator it = this.f26677a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f26677a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f26678c = 2;
        Iterator it = this.f26677a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f26678c = 4;
        Iterator it = this.f26677a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
