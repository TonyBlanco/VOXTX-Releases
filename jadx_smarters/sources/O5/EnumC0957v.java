package O5;

/* JADX INFO: renamed from: O5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0957v {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int id;

    EnumC0957v(int i9) {
        this.id = i9;
    }

    public static EnumC0957v determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.id);
    }
}
