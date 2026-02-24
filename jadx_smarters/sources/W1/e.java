package W1;

import P1.a;
import W1.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static e f10211f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f10212a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f10213b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f10214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public P1.a f10216e;

    public e(File file, int i9) {
        this.f10214c = file;
        this.f10215d = i9;
    }

    public static synchronized a d(File file, int i9) {
        try {
            if (f10211f == null) {
                f10211f = new e(file, i9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10211f;
    }

    @Override // W1.a
    public void a(S1.c cVar) {
        try {
            e().V(this.f10213b.a(cVar));
        } catch (IOException e9) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e9);
            }
        }
    }

    @Override // W1.a
    public void b(S1.c cVar, a.b bVar) {
        String strA = this.f10213b.a(cVar);
        this.f10212a.a(cVar);
        try {
            try {
                a.b bVarO = e().o(strA);
                if (bVarO != null) {
                    try {
                        if (bVar.a(bVarO.f(0))) {
                            bVarO.e();
                        }
                        bVarO.b();
                    } catch (Throwable th) {
                        bVarO.b();
                        throw th;
                    }
                }
            } catch (IOException e9) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e9);
                }
            }
            this.f10212a.b(cVar);
        } catch (Throwable th2) {
            this.f10212a.b(cVar);
            throw th2;
        }
    }

    @Override // W1.a
    public File c(S1.c cVar) {
        try {
            a.d dVarQ = e().q(this.f10213b.a(cVar));
            if (dVarQ != null) {
                return dVarQ.a(0);
            }
            return null;
        } catch (IOException e9) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e9);
            return null;
        }
    }

    public final synchronized P1.a e() {
        try {
            if (this.f10216e == null) {
                this.f10216e = P1.a.s(this.f10214c, 1, 1, this.f10215d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10216e;
    }
}
