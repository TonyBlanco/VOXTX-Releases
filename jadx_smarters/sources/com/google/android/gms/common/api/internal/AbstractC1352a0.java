package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1352a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f26578a;

    public AbstractC1352a0(Z z9) {
        this.f26578a = z9;
    }

    public abstract void a();

    public final void b(C1356c0 c1356c0) {
        c1356c0.f26595a.lock();
        try {
            if (c1356c0.f26605l == this.f26578a) {
                a();
            }
        } finally {
            c1356c0.f26595a.unlock();
        }
    }
}
