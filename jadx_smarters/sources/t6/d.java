package t6;

/* JADX INFO: loaded from: classes3.dex */
public enum d implements e6.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int number;

    d(int i9) {
        this.number = i9;
    }

    @Override // e6.f
    public int getNumber() {
        return this.number;
    }
}
