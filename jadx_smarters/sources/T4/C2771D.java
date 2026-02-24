package t4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;

/* JADX INFO: renamed from: t4.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2771D extends a.AbstractC0252a {
    @Override // com.google.android.gms.common.api.a.AbstractC0252a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C1406e c1406e, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        return new I(context, looper, c1406e, bVar, cVar);
    }
}
