package V6;

/* JADX INFO: loaded from: classes.dex */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final f[] FOR_BITS;
    private final int bits;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        FOR_BITS = new f[]{fVar2, fVar, H, fVar3};
    }

    f(int i9) {
        this.bits = i9;
    }

    public static f forBits(int i9) {
        if (i9 >= 0) {
            f[] fVarArr = FOR_BITS;
            if (i9 < fVarArr.length) {
                return fVarArr[i9];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
