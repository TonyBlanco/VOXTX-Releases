package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class F3 {
    public static final F3 MAYBE_MORE;
    public static final F3 NO_MORE;
    public static final F3 UNLIMITED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ F3[] f42425a;

    static {
        F3 f32 = new F3("NO_MORE", 0);
        NO_MORE = f32;
        F3 f33 = new F3("MAYBE_MORE", 1);
        MAYBE_MORE = f33;
        F3 f34 = new F3("UNLIMITED", 2);
        UNLIMITED = f34;
        f42425a = new F3[]{f32, f33, f34};
    }

    public static F3 valueOf(String str) {
        return (F3) Enum.valueOf(F3.class, str);
    }

    public static F3[] values() {
        return (F3[]) f42425a.clone();
    }
}
