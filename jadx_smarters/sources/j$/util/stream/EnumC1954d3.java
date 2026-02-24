package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class EnumC1954d3 {
    public static final EnumC1954d3 OP;
    public static final EnumC1954d3 SPLITERATOR;
    public static final EnumC1954d3 STREAM;
    public static final EnumC1954d3 TERMINAL_OP;
    public static final EnumC1954d3 UPSTREAM_TERMINAL_OP;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC1954d3[] f42612a;

    static {
        EnumC1954d3 enumC1954d3 = new EnumC1954d3("SPLITERATOR", 0);
        SPLITERATOR = enumC1954d3;
        EnumC1954d3 enumC1954d32 = new EnumC1954d3("STREAM", 1);
        STREAM = enumC1954d32;
        EnumC1954d3 enumC1954d33 = new EnumC1954d3("OP", 2);
        OP = enumC1954d33;
        EnumC1954d3 enumC1954d34 = new EnumC1954d3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC1954d34;
        EnumC1954d3 enumC1954d35 = new EnumC1954d3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC1954d35;
        f42612a = new EnumC1954d3[]{enumC1954d3, enumC1954d32, enumC1954d33, enumC1954d34, enumC1954d35};
    }

    public static EnumC1954d3 valueOf(String str) {
        return (EnumC1954d3) Enum.valueOf(EnumC1954d3.class, str);
    }

    public static EnumC1954d3[] values() {
        return (EnumC1954d3[]) f42612a.clone();
    }
}
