package J4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.internal.location.zzaz;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends a.AbstractC0252a {
    @Override // com.google.android.gms.common.api.a.AbstractC0252a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C1406e c1406e, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        return new zzaz(context, looper, bVar, cVar, "activity_recognition", C1406e.a(context));
    }
}
