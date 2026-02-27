package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.ads.interactivemedia.v3.internal.z1;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import w4.C2914b;
import w4.C2920h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f26586a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f26587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f26588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2920h f26589e;

    public b1(InterfaceC1369j interfaceC1369j, C2920h c2920h) {
        super(interfaceC1369j);
        this.f26587c = new AtomicReference(null);
        this.f26588d = new zau(Looper.getMainLooper());
        this.f26589e = c2920h;
    }

    public static final int e(Y0 y02) {
        if (y02 == null) {
            return -1;
        }
        return y02.a();
    }

    public final void a(C2914b c2914b, int i9) {
        this.f26587c.set(null);
        b(c2914b, i9);
    }

    public abstract void b(C2914b c2914b, int i9);

    public abstract void c();

    public final void d() {
        this.f26587c.set(null);
        c();
    }

    public final void h(C2914b c2914b, int i9) {
        AtomicReference atomicReference;
        Y0 y02 = new Y0(c2914b, i9);
        do {
            atomicReference = this.f26587c;
            if (z1.a(atomicReference, null, y02)) {
                this.f26588d.post(new a1(this, y02));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i9, int i10, Intent intent) {
        Y0 y02 = (Y0) this.f26587c.get();
        if (i9 != 1) {
            if (i9 == 2) {
                int i11 = this.f26589e.i(getActivity());
                if (i11 == 0) {
                    d();
                    return;
                } else {
                    if (y02 == null) {
                        return;
                    }
                    if (y02.b().H() == 18 && i11 == 18) {
                        return;
                    }
                }
            }
        } else if (i10 == -1) {
            d();
            return;
        } else if (i10 == 0) {
            if (y02 != null) {
                a(new C2914b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, y02.b().toString()), e(y02));
                return;
            }
            return;
        }
        if (y02 != null) {
            a(y02.b(), y02.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new C2914b(13, null), e((Y0) this.f26587c.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f26587c.set(bundle.getBoolean("resolving_error", false) ? new Y0(new C2914b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Y0 y02 = (Y0) this.f26587c.get();
        if (y02 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", y02.a());
        bundle.putInt("failed_status", y02.b().H());
        bundle.putParcelable("failed_resolution", y02.b().J());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f26586a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f26586a = false;
    }
}
