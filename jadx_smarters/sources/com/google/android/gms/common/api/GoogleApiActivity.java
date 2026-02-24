package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C1363g;
import com.google.android.gms.common.internal.r;
import w4.C2914b;
import w4.C2920h;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26414a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i9, boolean z9) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i9);
        intent.putExtra("notify_manager", z9);
        return intent;
    }

    public final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            C2920h.q().r(this, ((Integer) r.m(num)).intValue(), 2, this);
            this.f26414a = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f26414a = 1;
        } catch (ActivityNotFoundException e9) {
            if (extras.getBoolean("notify_manager", true)) {
                C1363g.t(this).F(new C2914b(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String strConcat = "Activity not found while launching " + pendingIntent.toString() + InstructionFileId.DOT;
                if (Build.FINGERPRINT.contains("generic")) {
                    strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", strConcat, e9);
            }
            this.f26414a = 1;
            finish();
        } catch (IntentSender.SendIntentException e10) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f26414a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                C1363g c1363gT = C1363g.t(this);
                if (i10 == -1) {
                    c1363gT.G();
                } else if (i10 == 0) {
                    c1363gT.F(new C2914b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i9 == 2) {
            this.f26414a = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f26414a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f26414a = bundle.getInt("resolution");
        }
        if (this.f26414a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f26414a);
        super.onSaveInstanceState(bundle);
    }
}
