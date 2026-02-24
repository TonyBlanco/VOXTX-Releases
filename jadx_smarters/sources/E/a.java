package E;

import L.e;
import L.s;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: E.a$a, reason: collision with other inner class name */
    public static class C0018a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, e eVar) throws Exception {
        Object objB;
        if (eVar != null) {
            try {
                objB = eVar.b();
            } catch (Exception e9) {
                if (e9 instanceof OperationCanceledException) {
                    throw new s();
                }
                throw e9;
            }
        } else {
            objB = null;
        }
        return C0018a.a(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) objB);
    }
}
