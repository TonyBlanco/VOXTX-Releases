package z4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.InterfaceC1361f;
import com.google.android.gms.common.api.internal.InterfaceC1377n;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.common.internal.C1425y;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a.AbstractC0252a {
    @Override // com.google.android.gms.common.api.a.AbstractC0252a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C1406e c1406e, Object obj, InterfaceC1361f interfaceC1361f, InterfaceC1377n interfaceC1377n) {
        return new e(context, looper, c1406e, (C1425y) obj, interfaceC1361f, interfaceC1377n);
    }
}
