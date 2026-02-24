package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d.AbstractC1617D;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f46732a;

    public f(a aVar) {
        super(Looper.getMainLooper());
        this.f46732a = new WeakReference(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = (a) this.f46732a.get();
        if (aVar == null) {
            return;
        }
        if (message.what == -1) {
            aVar.invalidateSelf();
            return;
        }
        Iterator it = aVar.f46711i.iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            throw null;
        }
    }
}
