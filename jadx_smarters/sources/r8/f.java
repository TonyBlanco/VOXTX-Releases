package R8;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;

/* JADX INFO: loaded from: classes4.dex */
public class f extends c {
    public f(Fragment fragment) {
        super(fragment);
    }

    @Override // R8.e
    public void a(int i9, String... strArr) {
        ((Fragment) c()).requestPermissions(strArr, i9);
    }

    @Override // R8.e
    public Context b() {
        return ((Fragment) c()).getActivity();
    }

    @Override // R8.e
    public boolean i(String str) {
        return ((Fragment) c()).shouldShowRequestPermissionRationale(str);
    }

    @Override // R8.c
    public m l() {
        return ((Fragment) c()).getChildFragmentManager();
    }
}
