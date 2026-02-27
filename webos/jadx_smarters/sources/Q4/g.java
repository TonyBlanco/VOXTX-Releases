package q4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends zza implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // q4.i
    public final Bitmap l(Uri uri) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, uri);
        Parcel parcelZzb = zzb(1, parcelZza);
        Bitmap bitmap = (Bitmap) zzc.zza(parcelZzb, Bitmap.CREATOR);
        parcelZzb.recycle();
        return bitmap;
    }
}
