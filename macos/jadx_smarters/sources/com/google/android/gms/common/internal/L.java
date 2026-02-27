package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f26767a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2921i f26768b;

    public L(C2921i c2921i) {
        r.m(c2921i);
        this.f26768b = c2921i;
    }

    public final int a(Context context, int i9) {
        return this.f26767a.get(i9, -1);
    }

    public final int b(Context context, a.f fVar) {
        r.m(context);
        r.m(fVar);
        int i9 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iA = a(context, minApkVersion);
        if (iA == -1) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f26767a.size()) {
                    i9 = -1;
                    break;
                }
                int iKeyAt = this.f26767a.keyAt(i10);
                if (iKeyAt > minApkVersion && this.f26767a.get(iKeyAt) == 0) {
                    break;
                }
                i10++;
            }
            iA = i9 == -1 ? this.f26768b.j(context, minApkVersion) : i9;
            this.f26767a.put(minApkVersion, iA);
        }
        return iA;
    }

    public final void c() {
        this.f26767a.clear();
    }
}
