package q4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.cast.zzaf;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AsyncTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2775b f46842c = new C2775b("FetchBitmapTask");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f46843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2547b f46844b;

    public f(Context context, int i9, int i10, boolean z9, long j9, int i11, int i12, int i13, C2547b c2547b) {
        this.f46844b = c2547b;
        this.f46843a = zzaf.zze(context.getApplicationContext(), this, new BinderC2550e(this, null), i9, i10, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        i iVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (iVar = this.f46843a) == null) {
            return null;
        }
        try {
            return iVar.l(uri);
        } catch (RemoteException e9) {
            f46842c.b(e9, "Unable to call %s on %s.", "doFetch", i.class.getSimpleName());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C2547b c2547b = this.f46844b;
        if (c2547b != null) {
            c2547b.b(bitmap);
        }
    }
}
