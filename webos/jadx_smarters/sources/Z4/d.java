package z4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.common.internal.C1422v;
import com.google.android.gms.common.internal.C1425y;
import com.google.android.gms.common.internal.InterfaceC1424x;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.google.android.gms.common.api.e implements InterfaceC1424x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.g f52843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.AbstractC0252a f52844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f52845f;

    static {
        a.g gVar = new a.g();
        f52843d = gVar;
        c cVar = new c();
        f52844e = cVar;
        f52845f = new com.google.android.gms.common.api.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C1425y c1425y) {
        super(context, f52845f, c1425y, e.a.f26452c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1424x
    public final Task a(final C1422v c1422v) {
        AbstractC1388t.a aVarA = AbstractC1388t.a();
        aVarA.d(zaf.zaa);
        aVarA.c(false);
        aVarA.b(new InterfaceC1383q() { // from class: z4.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                a.g gVar = d.f52843d;
                ((C3056a) ((e) obj).getService()).A(c1422v);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(aVarA.a());
    }
}
