package t6;

/* JADX INFO: loaded from: classes3.dex */
public enum j implements e6.f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    j(int i9) {
        this.number = i9;
    }

    @Override // e6.f
    public int getNumber() {
        return this.number;
    }
}
