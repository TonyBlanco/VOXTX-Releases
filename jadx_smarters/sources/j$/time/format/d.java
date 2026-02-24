package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f42053a;

    d(char c9) {
        this.f42053a = c9;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        sb.append(this.f42053a);
        return true;
    }

    public final String toString() {
        char c9 = this.f42053a;
        if (c9 == '\'') {
            return "''";
        }
        return "'" + c9 + "'";
    }
}
