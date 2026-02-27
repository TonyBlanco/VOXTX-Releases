package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1400z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26741a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f26742b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final void c(BasePendingResult basePendingResult, boolean z9) {
        this.f26741a.put(basePendingResult, Boolean.valueOf(z9));
        basePendingResult.addStatusListener(new C1396x(this, basePendingResult));
    }

    public final void d(TaskCompletionSource taskCompletionSource, boolean z9) {
        this.f26742b.put(taskCompletionSource, Boolean.valueOf(z9));
        taskCompletionSource.getTask().addOnCompleteListener(new C1398y(this, taskCompletionSource));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            java.lang.String r4 = r0.toString()
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r0 = 20
            r5.<init>(r0, r4)
            r3.h(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1400z.e(int, java.lang.String):void");
    }

    public final void f() {
        h(false, C1363g.f26616q);
    }

    public final boolean g() {
        return (this.f26741a.isEmpty() && this.f26742b.isEmpty()) ? false : true;
    }

    public final void h(boolean z9, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f26741a) {
            map = new HashMap(this.f26741a);
        }
        synchronized (this.f26742b) {
            map2 = new HashMap(this.f26742b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.b(status));
            }
        }
    }
}
