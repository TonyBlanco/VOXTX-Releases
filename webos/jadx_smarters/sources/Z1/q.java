package Z1;

import android.content.Context;
import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f10900b;

    public q(Context context, l lVar) {
        this.f10899a = context;
        this.f10900b = lVar;
    }

    public static boolean e(String str) {
        return TransferTable.COLUMN_FILE.equals(str) || "content".equals(str) || "android.resource".equals(str);
    }

    public abstract T1.c b(Context context, String str);

    public abstract T1.c c(Context context, Uri uri);

    @Override // Z1.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final T1.c a(Uri uri, int i9, int i10) {
        String scheme = uri.getScheme();
        if (e(scheme)) {
            if (!a.a(uri)) {
                return c(this.f10899a, uri);
            }
            return b(this.f10899a, a.b(uri));
        }
        if (this.f10900b == null || !(HttpHost.DEFAULT_SCHEME_NAME.equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme))) {
            return null;
        }
        return this.f10900b.a(new d(uri.toString()), i9, i10);
    }
}
