package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class LifecycleCallback {
    protected final InterfaceC1369j mLifecycleFragment;

    public LifecycleCallback(InterfaceC1369j interfaceC1369j) {
        this.mLifecycleFragment = interfaceC1369j;
    }

    @Keep
    private static InterfaceC1369j getChimeraLifecycleFragmentImpl(C1367i c1367i) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static InterfaceC1369j getFragment(Activity activity) {
        return getFragment(new C1367i(activity));
    }

    public static InterfaceC1369j getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public static InterfaceC1369j getFragment(C1367i c1367i) {
        if (c1367i.d()) {
            return n1.A(c1367i.b());
        }
        if (c1367i.c()) {
            return l1.c(c1367i.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityH = this.mLifecycleFragment.h();
        com.google.android.gms.common.internal.r.m(activityH);
        return activityH;
    }

    public void onActivityResult(int i9, int i10, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}
