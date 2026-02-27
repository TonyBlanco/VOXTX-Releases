package M4;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;

/* JADX INFO: loaded from: classes3.dex */
public final class T3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0832v f4500a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzcf f4502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4503e;

    public T3(C0760i4 c0760i4, C0832v c0832v, String str, zzcf zzcfVar) {
        this.f4503e = c0760i4;
        this.f4500a = c0832v;
        this.f4501c = str;
        this.f4502d = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrF = null;
        try {
            try {
                C0760i4 c0760i4 = this.f4503e;
                InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
                if (interfaceC0799p1 == null) {
                    c0760i4.f4245a.d().r().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrF = interfaceC0799p1.F(this.f4500a, this.f4501c);
                    this.f4503e.E();
                }
            } catch (RemoteException e9) {
                this.f4503e.f4245a.d().r().b("Failed to send event to the service to bundle", e9);
            }
        } finally {
            this.f4503e.f4245a.N().H(this.f4502d, bArrF);
        }
    }
}
