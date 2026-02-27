package d1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import org.apache.http.util.LangUtils;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1649a {
    START,
    CENTER,
    END;

    private static final boolean HAS_RTL = true;

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0312a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39467a;

        static {
            int[] iArr = new int[EnumC1649a.values().length];
            f39467a = iArr;
            try {
                iArr[EnumC1649a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39467a[EnumC1649a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39467a[EnumC1649a.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i9 = C0312a.f39467a[ordinal()];
        if (i9 == 1) {
            return HAS_RTL ? 8388611 : 3;
        }
        if (i9 == 2) {
            return 1;
        }
        if (i9 == 3) {
            return HAS_RTL ? 8388613 : 5;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(LangUtils.HASH_SEED)
    public int getTextAlignment() {
        int i9 = C0312a.f39467a[ordinal()];
        if (i9 != 2) {
            return i9 != 3 ? 5 : 6;
        }
        return 4;
    }
}
