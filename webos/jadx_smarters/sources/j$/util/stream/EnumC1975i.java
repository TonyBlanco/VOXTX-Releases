package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1975i {
    public static final EnumC1975i CONCURRENT;
    public static final EnumC1975i IDENTITY_FINISH;
    public static final EnumC1975i UNORDERED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC1975i[] f42680a;

    static {
        EnumC1975i enumC1975i = new EnumC1975i("CONCURRENT", 0);
        CONCURRENT = enumC1975i;
        EnumC1975i enumC1975i2 = new EnumC1975i("UNORDERED", 1);
        UNORDERED = enumC1975i2;
        EnumC1975i enumC1975i3 = new EnumC1975i("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC1975i3;
        f42680a = new EnumC1975i[]{enumC1975i, enumC1975i2, enumC1975i3};
    }

    public static EnumC1975i valueOf(String str) {
        return (EnumC1975i) Enum.valueOf(EnumC1975i.class, str);
    }

    public static EnumC1975i[] values() {
        return (EnumC1975i[]) f42680a.clone();
    }
}
