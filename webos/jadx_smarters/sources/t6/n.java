package t6;

/* JADX INFO: loaded from: classes3.dex */
public enum n implements e6.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int number;

    n(int i9) {
        this.number = i9;
    }

    @Override // e6.f
    public int getNumber() {
        return this.number;
    }
}
