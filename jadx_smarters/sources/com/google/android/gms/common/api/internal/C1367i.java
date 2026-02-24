package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC1145e;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1367i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26639a;

    public C1367i(Activity activity) {
        com.google.android.gms.common.internal.r.n(activity, "Activity must not be null");
        this.f26639a = activity;
    }

    public final Activity a() {
        return (Activity) this.f26639a;
    }

    public final AbstractActivityC1145e b() {
        return (AbstractActivityC1145e) this.f26639a;
    }

    public final boolean c() {
        return this.f26639a instanceof Activity;
    }

    public final boolean d() {
        return this.f26639a instanceof AbstractActivityC1145e;
    }
}
