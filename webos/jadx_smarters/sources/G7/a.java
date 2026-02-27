package G7;

import android.app.Activity;
import android.app.UiModeManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends Activity {
    public final boolean a() {
        return ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (a()) {
            requestWindowFeature(0);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
