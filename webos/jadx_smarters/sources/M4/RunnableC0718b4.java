package M4;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0718b4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4608a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f5 f4611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4613g;

    public RunnableC0718b4(C0760i4 c0760i4, AtomicReference atomicReference, String str, String str2, String str3, f5 f5Var, boolean z9) {
        this.f4613g = c0760i4;
        this.f4608a = atomicReference;
        this.f4609c = str2;
        this.f4610d = str3;
        this.f4611e = f5Var;
        this.f4612f = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C0760i4 c0760i4;
        InterfaceC0799p1 interfaceC0799p1;
        AtomicReference atomicReference2;
        List listB0;
        synchronized (this.f4608a) {
            try {
                try {
                    c0760i4 = this.f4613g;
                    interfaceC0799p1 = c0760i4.f4743d;
                } catch (RemoteException e9) {
                    this.f4613g.f4245a.d().r().d("(legacy) Failed to get user properties; remote exception", null, this.f4609c, e9);
                    this.f4608a.set(Collections.emptyList());
                    atomicReference = this.f4608a;
                }
                if (interfaceC0799p1 == null) {
                    c0760i4.f4245a.d().r().d("(legacy) Failed to get user properties; not connected to service", null, this.f4609c, this.f4610d);
                    this.f4608a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    com.google.android.gms.common.internal.r.m(this.f4611e);
                    atomicReference2 = this.f4608a;
                    listB0 = interfaceC0799p1.b(this.f4609c, this.f4610d, this.f4612f, this.f4611e);
                } else {
                    atomicReference2 = this.f4608a;
                    listB0 = interfaceC0799p1.b0(null, this.f4609c, this.f4610d, this.f4612f);
                }
                atomicReference2.set(listB0);
                this.f4613g.E();
                atomicReference = this.f4608a;
                atomicReference.notify();
            } finally {
                this.f4608a.notify();
            }
        }
    }
}
