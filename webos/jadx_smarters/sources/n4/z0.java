package n4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;
import n4.AbstractC2268e;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends a.AbstractC0252a {
    @Override // com.google.android.gms.common.api.a.AbstractC0252a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C1406e c1406e, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        AbstractC2268e.c cVar2 = (AbstractC2268e.c) obj;
        com.google.android.gms.common.internal.r.n(cVar2, "Setting the API options is required.");
        return new t4.Q(context, looper, c1406e, cVar2.f45383b, cVar2.f45386e, cVar2.f45384c, cVar2.f45385d, bVar, cVar);
    }
}
