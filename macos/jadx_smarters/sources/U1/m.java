package U1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f9671b = new Handler(Looper.getMainLooper(), new b());

    public static class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((l) message.obj).b();
            return true;
        }
    }

    public void a(l lVar) {
        AbstractC2539h.a();
        if (this.f9670a) {
            this.f9671b.obtainMessage(1, lVar).sendToTarget();
            return;
        }
        this.f9670a = true;
        lVar.b();
        this.f9670a = false;
    }
}
