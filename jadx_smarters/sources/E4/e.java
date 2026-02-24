package E4;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f1698b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f1699a = null;

    public static d a(Context context) {
        return f1698b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.f1699a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f1699a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1699a;
    }
}
