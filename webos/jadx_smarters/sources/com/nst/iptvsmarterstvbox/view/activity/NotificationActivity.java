package com.nst.iptvsmarterstvbox.view.activity;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f31322a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31323c = "CANCELLED";

    public static PendingIntent a(int i9, Context context) {
        Intent intent = new Intent(context, (Class<?>) NotificationActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("NOTIFICATION_ID", i9);
        return PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 67108864 : 268435456);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f31322a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putBoolean("CANCELLED", true);
        editorEdit.apply();
        notificationManager.cancel(getIntent().getIntExtra("NOTIFICATION_ID", -1));
        finish();
    }
}
