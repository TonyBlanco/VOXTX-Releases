package pub.devrel.easypermissions;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.appcompat.app.b;

/* JADX INFO: loaded from: classes4.dex */
public class AppSettingsDialogHolderActivity extends b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f46739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46740e;

    public static Intent u1(Context context, Q8.b bVar) {
        Intent intent = new Intent(context, (Class<?>) AppSettingsDialogHolderActivity.class);
        intent.putExtra("extra_app_settings", bVar);
        return intent;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        setResult(i10, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i9) {
        if (i9 == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f46740e);
            startActivityForResult(data, 7534);
        } else if (i9 == -2) {
            setResult(0);
            finish();
        } else {
            throw new IllegalStateException("Unknown button type: " + i9);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q8.b bVarA = Q8.b.a(getIntent(), this);
        this.f46740e = bVarA.c();
        this.f46739d = bVarA.f(this, this);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a aVar = this.f46739d;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f46739d.dismiss();
    }
}
