package d4;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K {
    public static void a(Context context, String str, int i9, int i10, int i11) {
        if (k0.f39777a >= 26) {
            NotificationManager notificationManager = (NotificationManager) AbstractC1684a.e((NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
            com.amplifyframework.storage.s3.service.c.a();
            NotificationChannel notificationChannelA = com.amplifyframework.storage.s3.service.b.a(str, context.getString(i9), i11);
            if (i10 != 0) {
                notificationChannelA.setDescription(context.getString(i10));
            }
            notificationManager.createNotificationChannel(notificationChannelA);
        }
    }

    public static void b(Context context, int i9, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) AbstractC1684a.e((NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
        if (notification != null) {
            notificationManager.notify(i9, notification);
        } else {
            notificationManager.cancel(i9);
        }
    }
}
