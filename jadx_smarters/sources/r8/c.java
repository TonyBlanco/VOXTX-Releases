package R8;

import Q8.j;
import android.util.Log;
import androidx.fragment.app.m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends e {
    public c(Object obj) {
        super(obj);
    }

    @Override // R8.e
    public void j(String str, String str2, String str3, int i9, int i10, String... strArr) {
        m mVarL = l();
        if (mVarL.h0("RationaleDialogFragmentCompat") instanceof j) {
            Log.d("BSPermissionsHelper", "Found existing fragment, not showing rationale.");
        } else {
            j.A(str, str2, str3, i9, i10, strArr).B(mVarL, "RationaleDialogFragmentCompat");
        }
    }

    public abstract m l();
}
