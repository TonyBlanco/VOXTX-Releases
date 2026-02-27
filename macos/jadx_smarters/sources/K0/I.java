package K0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class I extends G {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f3421h = true;

    @Override // K0.M
    public void e(View view, int i9, int i10, int i11, int i12) {
        if (f3421h) {
            try {
                view.setLeftTopRightBottom(i9, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f3421h = false;
            }
        }
    }
}
