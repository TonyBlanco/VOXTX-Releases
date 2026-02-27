package t4;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f50767d;

    public z(String str, String str2, String str3) {
        super(str, "MediaControlChannel", null);
        this.f50767d = Collections.synchronizedList(new ArrayList());
    }

    public final List f() {
        return this.f50767d;
    }

    public final void g() {
        synchronized (this.f50767d) {
            try {
                Iterator it = this.f50767d.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).c(AdError.CACHE_ERROR_CODE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(x xVar) {
        this.f50767d.add(xVar);
    }
}
