package R8;

import D.AbstractC0519b;
import Q8.i;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class a extends e {
    public a(Activity activity) {
        super(activity);
    }

    @Override // R8.e
    public void a(int i9, String... strArr) {
        AbstractC0519b.h((Activity) c(), strArr, i9);
    }

    @Override // R8.e
    public Context b() {
        return (Context) c();
    }

    @Override // R8.e
    public boolean i(String str) {
        return AbstractC0519b.l((Activity) c(), str);
    }

    @Override // R8.e
    public void j(String str, String str2, String str3, int i9, int i10, String... strArr) {
        FragmentManager fragmentManager = ((Activity) c()).getFragmentManager();
        if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof i) {
            Log.d("ActPermissionHelper", "Found existing fragment, not showing rationale.");
        } else {
            i.a(str2, str3, str, i9, i10, strArr).b(fragmentManager, "RationaleDialogFragment");
        }
    }
}
