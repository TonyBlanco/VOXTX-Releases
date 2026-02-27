package androidx.core.app;

import M0.b;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f14515a = (IconCompat) bVar.v(remoteActionCompat.f14515a, 1);
        remoteActionCompat.f14516b = bVar.l(remoteActionCompat.f14516b, 2);
        remoteActionCompat.f14517c = bVar.l(remoteActionCompat.f14517c, 3);
        remoteActionCompat.f14518d = (PendingIntent) bVar.r(remoteActionCompat.f14518d, 4);
        remoteActionCompat.f14519e = bVar.h(remoteActionCompat.f14519e, 5);
        remoteActionCompat.f14520f = bVar.h(remoteActionCompat.f14520f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.x(false, false);
        bVar.M(remoteActionCompat.f14515a, 1);
        bVar.D(remoteActionCompat.f14516b, 2);
        bVar.D(remoteActionCompat.f14517c, 3);
        bVar.H(remoteActionCompat.f14518d, 4);
        bVar.z(remoteActionCompat.f14519e, 5);
        bVar.z(remoteActionCompat.f14520f, 6);
    }
}
