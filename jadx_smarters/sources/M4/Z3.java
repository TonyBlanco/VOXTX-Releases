package M4;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class Z3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4573a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f5 f4576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4577f;

    public Z3(C0760i4 c0760i4, AtomicReference atomicReference, String str, String str2, String str3, f5 f5Var) {
        this.f4577f = c0760i4;
        this.f4573a = atomicReference;
        this.f4574c = str2;
        this.f4575d = str3;
        this.f4576e = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C0760i4 c0760i4;
        InterfaceC0799p1 interfaceC0799p1;
        AtomicReference atomicReference2;
        List listL0;
        synchronized (this.f4573a) {
            try {
                try {
                    c0760i4 = this.f4577f;
                    interfaceC0799p1 = c0760i4.f4743d;
                } catch (RemoteException e9) {
                    this.f4577f.f4245a.d().r().d("(legacy) Failed to get conditional properties; remote exception", null, this.f4574c, e9);
                    this.f4573a.set(Collections.emptyList());
                    atomicReference = this.f4573a;
                }
                if (interfaceC0799p1 == null) {
                    c0760i4.f4245a.d().r().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f4574c, this.f4575d);
                    this.f4573a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    com.google.android.gms.common.internal.r.m(this.f4576e);
                    atomicReference2 = this.f4573a;
                    listL0 = interfaceC0799p1.s0(this.f4574c, this.f4575d, this.f4576e);
                } else {
                    atomicReference2 = this.f4573a;
                    listL0 = interfaceC0799p1.l0(null, this.f4574c, this.f4575d);
                }
                atomicReference2.set(listL0);
                this.f4577f.E();
                atomicReference = this.f4573a;
                atomicReference.notify();
            } finally {
                this.f4573a.notify();
            }
        }
    }
}
