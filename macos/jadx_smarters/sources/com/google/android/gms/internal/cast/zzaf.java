package com.google.android.gms.internal.cast;

import F4.a;
import F4.b;
import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;
import o4.C2326c;
import o4.C2333j;
import o4.InterfaceC2322E;
import o4.J;
import o4.M;
import o4.V;
import o4.t0;
import o4.w0;
import q4.i;
import q4.k;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf {
    private static final C2775b zza = new C2775b("CastDynamiteModule");

    public static w0 zza(Context context, C2326c c2326c, zzal zzalVar, Map map) throws C2333j, RemoteException {
        return zzf(context).zze(b.Z(context.getApplicationContext()), c2326c, zzalVar, map);
    }

    public static InterfaceC2322E zzb(Context context, C2326c c2326c, a aVar, t0 t0Var) {
        if (aVar == null) {
            return null;
        }
        try {
            return zzf(context).zzf(c2326c, aVar, t0Var);
        } catch (RemoteException | C2333j e9) {
            zza.b(e9, "Unable to call %s on %s.", "newCastSessionImpl", zzaj.class.getSimpleName());
            return null;
        }
    }

    public static J zzc(Service service, a aVar, a aVar2) {
        if (aVar != null && aVar2 != null) {
            try {
                return zzf(service.getApplicationContext()).zzg(b.Z(service), aVar, aVar2);
            } catch (RemoteException | C2333j e9) {
                zza.b(e9, "Unable to call %s on %s.", "newReconnectionServiceImpl", zzaj.class.getSimpleName());
            }
        }
        return null;
    }

    public static M zzd(Context context, String str, String str2, V v9) {
        try {
            return zzf(context).zzh(str, str2, v9);
        } catch (RemoteException | C2333j e9) {
            zza.b(e9, "Unable to call %s on %s.", "newSessionImpl", zzaj.class.getSimpleName());
            return null;
        }
    }

    public static i zze(Context context, AsyncTask asyncTask, k kVar, int i9, int i10, boolean z9, long j9, int i11, int i12, int i13) {
        try {
            return zzf(context.getApplicationContext()).zzi(b.Z(asyncTask), kVar, i9, i10, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS);
        } catch (RemoteException | C2333j e9) {
            zza.b(e9, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", zzaj.class.getSimpleName());
            return null;
        }
    }

    private static zzaj zzf(Context context) throws C2333j {
        try {
            IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f26902b, "com.google.android.gms.cast.framework.dynamite").d("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderD == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof zzaj ? (zzaj) iInterfaceQueryLocalInterface : new zzai(iBinderD);
        } catch (DynamiteModule.a e9) {
            throw new C2333j(e9);
        }
    }
}
