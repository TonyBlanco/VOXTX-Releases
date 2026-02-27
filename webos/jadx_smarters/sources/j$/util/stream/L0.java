package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f42466a;

    static {
        int[] iArr = new int[EnumC1964f3.values().length];
        f42466a = iArr;
        try {
            iArr[EnumC1964f3.REFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f42466a[EnumC1964f3.INT_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f42466a[EnumC1964f3.LONG_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f42466a[EnumC1964f3.DOUBLE_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
