package q1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p1.InterfaceC2388b;
import r1.C2655a;

/* JADX INFO: renamed from: q1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC2529b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2388b f46776a;

    public HandlerC2529b(InterfaceC2388b interfaceC2388b) {
        super(Looper.getMainLooper());
        this.f46776a = interfaceC2388b;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        InterfaceC2388b interfaceC2388b = this.f46776a;
        if (interfaceC2388b != null) {
            C2655a c2655a = (C2655a) message.obj;
            interfaceC2388b.a(c2655a.f49629a, c2655a.f49630c);
        }
    }
}
