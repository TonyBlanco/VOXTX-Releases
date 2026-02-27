package M4;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;

/* JADX INFO: renamed from: M4.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0712a4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4586a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f5 f4588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzcf f4589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4590f;

    public RunnableC0712a4(C0760i4 c0760i4, String str, String str2, f5 f5Var, zzcf zzcfVar) {
        this.f4590f = c0760i4;
        this.f4586a = str;
        this.f4587c = str2;
        this.f4588d = f5Var;
        this.f4589e = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C0760i4 c0760i4 = this.f4590f;
                InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
                if (interfaceC0799p1 == null) {
                    c0760i4.f4245a.d().r().c("Failed to get conditional properties; not connected to service", this.f4586a, this.f4587c);
                } else {
                    com.google.android.gms.common.internal.r.m(this.f4588d);
                    arrayList = a5.v(interfaceC0799p1.s0(this.f4586a, this.f4587c, this.f4588d));
                    this.f4590f.E();
                }
            } catch (RemoteException e9) {
                this.f4590f.f4245a.d().r().d("Failed to get conditional properties; remote exception", this.f4586a, this.f4587c, e9);
            }
        } finally {
            this.f4590f.f4245a.N().F(this.f4589e, arrayList);
        }
    }
}
