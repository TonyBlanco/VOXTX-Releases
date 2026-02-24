package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1396x implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f26728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1400z f26729b;

    public C1396x(C1400z c1400z, BasePendingResult basePendingResult) {
        this.f26729b = c1400z;
        this.f26728a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.f.a
    public final void a(Status status) {
        this.f26729b.f26741a.remove(this.f26728a);
    }
}
