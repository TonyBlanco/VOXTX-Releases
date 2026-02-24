package M4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class K3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4340a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f5 f4342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzcf f4344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4345g;

    public K3(C0760i4 c0760i4, String str, String str2, f5 f5Var, boolean z9, zzcf zzcfVar) {
        this.f4345g = c0760i4;
        this.f4340a = str;
        this.f4341c = str2;
        this.f4342d = f5Var;
        this.f4343e = z9;
        this.f4344f = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e9;
        Bundle bundle2 = new Bundle();
        try {
            try {
                C0760i4 c0760i4 = this.f4345g;
                InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
                if (interfaceC0799p1 == null) {
                    c0760i4.f4245a.d().r().c("Failed to get user properties; not connected to service", this.f4340a, this.f4341c);
                    this.f4345g.f4245a.N().G(this.f4344f, bundle2);
                    return;
                }
                com.google.android.gms.common.internal.r.m(this.f4342d);
                List<V4> listB = interfaceC0799p1.b(this.f4340a, this.f4341c, this.f4343e, this.f4342d);
                bundle = new Bundle();
                if (listB != null) {
                    for (V4 v42 : listB) {
                        String str = v42.f4522j;
                        if (str != null) {
                            bundle.putString(v42.f4519g, str);
                        } else {
                            Long l9 = v42.f4521i;
                            if (l9 != null) {
                                bundle.putLong(v42.f4519g, l9.longValue());
                            } else {
                                Double d9 = v42.f4524l;
                                if (d9 != null) {
                                    bundle.putDouble(v42.f4519g, d9.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f4345g.E();
                    this.f4345g.f4245a.N().G(this.f4344f, bundle);
                    return;
                } catch (RemoteException e10) {
                    e9 = e10;
                    this.f4345g.f4245a.d().r().c("Failed to get user properties; remote exception", this.f4340a, e9);
                    this.f4345g.f4245a.N().G(this.f4344f, bundle);
                    return;
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
            }
        } catch (RemoteException e11) {
            bundle = bundle2;
            e9 = e11;
        } catch (Throwable th2) {
            th = th2;
        }
        this.f4345g.f4245a.N().G(this.f4344f, bundle2);
        throw th;
    }
}
