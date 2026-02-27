package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ky implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23609b;

    public /* synthetic */ ky(im imVar, int i9) {
        this.f23609b = i9;
        this.f23608a = imVar;
    }

    public /* synthetic */ ky(lh lhVar, int i9) {
        this.f23609b = i9;
        this.f23608a = lhVar;
    }

    public /* synthetic */ ky(pg pgVar, int i9) {
        this.f23609b = i9;
        this.f23608a = pgVar;
    }

    public /* synthetic */ ky(TaskCompletionSource taskCompletionSource, int i9) {
        this.f23609b = i9;
        this.f23608a = taskCompletionSource;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.ads.interactivemedia.v3.internal.pg, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.f23609b;
        if (i9 == 0) {
            ((lh) this.f23608a).U();
            return;
        }
        if (i9 == 1) {
            im.V((im) this.f23608a);
            return;
        }
        if (i9 == 2) {
            ((lh) this.f23608a).g();
        } else {
            if (i9 == 3) {
                this.f23608a.n();
                return;
            }
            ((TaskCompletionSource) this.f23608a).setResult(ata.b());
        }
    }
}
