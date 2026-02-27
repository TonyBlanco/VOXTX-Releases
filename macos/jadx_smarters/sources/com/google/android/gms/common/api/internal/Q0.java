package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Status f26509c = new Status(8, "The connection to Google Play services was lost");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f26510a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f26511b = new P0(this);

    public final void a(BasePendingResult basePendingResult) {
        this.f26510a.add(basePendingResult);
        basePendingResult.zan(this.f26511b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f26510a.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.f26510a.remove(basePendingResult);
            }
        }
    }
}
