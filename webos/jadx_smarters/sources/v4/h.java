package v4;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Messenger f51352a;

    public h(IBinder iBinder) {
        this.f51352a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f51352a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void c(Message message) throws RemoteException {
        Messenger messenger = this.f51352a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((h) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        Messenger messenger = this.f51352a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
