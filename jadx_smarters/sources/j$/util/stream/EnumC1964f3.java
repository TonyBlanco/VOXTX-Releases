package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1964f3 {
    public static final EnumC1964f3 DOUBLE_VALUE;
    public static final EnumC1964f3 INT_VALUE;
    public static final EnumC1964f3 LONG_VALUE;
    public static final EnumC1964f3 REFERENCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC1964f3[] f42647a;

    static {
        EnumC1964f3 enumC1964f3 = new EnumC1964f3("REFERENCE", 0);
        REFERENCE = enumC1964f3;
        EnumC1964f3 enumC1964f32 = new EnumC1964f3("INT_VALUE", 1);
        INT_VALUE = enumC1964f32;
        EnumC1964f3 enumC1964f33 = new EnumC1964f3("LONG_VALUE", 2);
        LONG_VALUE = enumC1964f33;
        EnumC1964f3 enumC1964f34 = new EnumC1964f3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC1964f34;
        f42647a = new EnumC1964f3[]{enumC1964f3, enumC1964f32, enumC1964f33, enumC1964f34};
    }

    public static EnumC1964f3 valueOf(String str) {
        return (EnumC1964f3) Enum.valueOf(EnumC1964f3.class, str);
    }

    public static EnumC1964f3[] values() {
        return (EnumC1964f3[]) f42647a.clone();
    }
}
