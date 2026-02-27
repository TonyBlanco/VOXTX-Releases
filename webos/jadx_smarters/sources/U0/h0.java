package u0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends BroadcastReceiver {
    public static boolean a(Context context) {
        Intent intent = new Intent(context, (Class<?>) h0.class);
        intent.setPackage(context.getPackageName());
        return context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
    }
}
