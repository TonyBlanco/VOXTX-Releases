package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class k implements f {
    public static final k INSENSITIVE;
    public static final k LENIENT;
    public static final k SENSITIVE;
    public static final k STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ k[] f42068a;

    static {
        k kVar = new k("SENSITIVE", 0);
        SENSITIVE = kVar;
        k kVar2 = new k("INSENSITIVE", 1);
        INSENSITIVE = kVar2;
        k kVar3 = new k("STRICT", 2);
        STRICT = kVar3;
        k kVar4 = new k("LENIENT", 3);
        LENIENT = kVar4;
        f42068a = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f42068a.clone();
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
