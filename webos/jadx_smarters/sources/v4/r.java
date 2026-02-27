package v4;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Messenger f51372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f51373b;

    public r(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f51372a = new Messenger(iBinder);
            this.f51373b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f51373b = new h(iBinder);
            this.f51372a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.f51372a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        h hVar = this.f51373b;
        if (hVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        hVar.c(message);
    }
}
