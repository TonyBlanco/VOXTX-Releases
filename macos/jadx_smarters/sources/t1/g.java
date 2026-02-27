package T1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f9511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9513c;

    public g(Context context, Uri uri) {
        this.f9512b = context.getApplicationContext();
        this.f9511a = uri;
    }

    @Override // T1.c
    public void a() {
        Object obj = this.f9513c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException e9) {
                if (Log.isLoggable("LocalUriFetcher", 2)) {
                    Log.v("LocalUriFetcher", "failed to close data", e9);
                }
            }
        }
    }

    @Override // T1.c
    public final Object b(O1.i iVar) {
        Object objD = d(this.f9511a, this.f9512b.getContentResolver());
        this.f9513c = objD;
        return objD;
    }

    public abstract void c(Object obj);

    @Override // T1.c
    public void cancel() {
    }

    public abstract Object d(Uri uri, ContentResolver contentResolver);

    @Override // T1.c
    public String getId() {
        return this.f9511a.toString();
    }
}
