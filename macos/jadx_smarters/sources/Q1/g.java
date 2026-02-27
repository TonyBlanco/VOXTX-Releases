package q1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import r1.C2655a;

/* JADX INFO: loaded from: classes.dex */
public class g extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.f f46798a;

    public g(p1.f fVar) {
        super(Looper.getMainLooper());
        this.f46798a = fVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        p1.f fVar = this.f46798a;
        if (fVar != null) {
            C2655a c2655a = (C2655a) message.obj;
            fVar.a(c2655a.f49629a, c2655a.f49630c);
        }
    }
}
