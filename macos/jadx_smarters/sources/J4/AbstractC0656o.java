package J4;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: J4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0656o {
    public static int a(int i9) {
        if ((i9 < 0 || i9 > 1) && (i9 < 1000 || i9 >= 1006)) {
            return 1;
        }
        return i9;
    }

    public static Status b(int i9) {
        if (i9 == 1) {
            i9 = 13;
        }
        return new Status(i9);
    }
}
