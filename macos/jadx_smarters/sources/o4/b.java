package O4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a.AbstractC0252a {
    @Override // com.google.android.gms.common.api.a.AbstractC0252a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C1406e c1406e, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        return new P4.a(context, looper, true, c1406e, P4.a.g(c1406e), bVar, cVar);
    }
}
