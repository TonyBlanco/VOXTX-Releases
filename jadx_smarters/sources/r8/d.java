package R8;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
public class d extends e {
    public d(Object obj) {
        super(obj);
    }

    @Override // R8.e
    public void a(int i9, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    @Override // R8.e
    public Context b() {
        if (c() instanceof Activity) {
            return (Context) c();
        }
        if (c() instanceof Fragment) {
            return ((Fragment) c()).getContext();
        }
        throw new IllegalStateException("Unknown host: " + c());
    }

    @Override // R8.e
    public boolean i(String str) {
        return false;
    }

    @Override // R8.e
    public void j(String str, String str2, String str3, int i9, int i10, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }
}
