package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f26513a;

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        this.f26513a.f26516b.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e9) {
                this.f26513a.f26515a.m(e9);
            }
        } finally {
            this.f26513a.f26516b.unlock();
        }
    }
}
