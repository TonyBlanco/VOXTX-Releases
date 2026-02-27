package t4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends com.google.android.gms.common.api.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.g f50651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.AbstractC0252a f50652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f50653f;

    static {
        a.g gVar = new a.g();
        f50651d = gVar;
        C2771D c2771d = new C2771D();
        f50652e = c2771d;
        f50653f = new com.google.android.gms.common.api.a("CastApi.API", c2771d, gVar);
    }

    public H(Context context) {
        super(context, f50653f, a.d.f26451a, e.a.f26452c);
    }

    public final Task h(final String[] strArr) {
        return doRead(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: t4.B
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                H h9 = this.f50644a;
                String[] strArr2 = strArr;
                ((C2785l) ((I) obj).getService()).A(new BinderC2772E(h9, (TaskCompletionSource) obj2), strArr2);
            }
        }).d(n4.C.f45266d).c(false).e(8425).a());
    }
}
