package V6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DATA_MASK_000;
    public static final c DATA_MASK_001;
    public static final c DATA_MASK_010;
    public static final c DATA_MASK_011;
    public static final c DATA_MASK_100;
    public static final c DATA_MASK_101;
    public static final c DATA_MASK_110;
    public static final c DATA_MASK_111;

    public enum a extends c {
        public a(String str, int i9) {
            super(str, i9, null);
        }

        @Override // V6.c
        public boolean isMasked(int i9, int i10) {
            return ((i9 + i10) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        DATA_MASK_000 = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: V6.c.b
            {
                a aVar2 = null;
            }

            @Override // V6.c
            public boolean isMasked(int i9, int i10) {
                return (i9 & 1) == 0;
            }
        };
        DATA_MASK_001 = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: V6.c.c
            {
                a aVar2 = null;
            }

            @Override // V6.c
            public boolean isMasked(int i9, int i10) {
                return i10 % 3 == 0;
            }
        };
        DATA_MASK_010 = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: V6.c.d
            {
                a aVar2 = null;
            }

            @Override // V6.c
            public boolean isMasked(int i9, int i10) {
                return (i9 + i10) % 3 == 0;
            }
        };
        DATA_MASK_011 = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: V6.c.e
            {
                a aVar2 = null;
            }

            @Override // V6.c
            public boolean isMasked(int i9, int i10) {
                return (((i9 / 2) + (i10 / 3)) & 1) == 0;
            }
        };
        DATA_MASK_100 = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: V6.c.f
            {
                a aVar2 = null;
            }

            @Override // V6.c
            public boolean isMasked(int i9, int i10) {
                return (i9 * i10) % 6 == 0;
            }
        };
        DATA_MASK_101 = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: V6.c.g
            {
                a aVar2 = null;
            }

            @Override // V6.c
            public boolean isMasked(int i9, int i10) {
                return (i9 * i10) % 6 < 3;
            }
        };
        DATA_MASK_110 = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: V6.c.h
            {
                a aVar2 = null;
            }

            @Override // V6.c
            public boolean isMasked(int i9, int i10) {
                return (((i9 + i10) + ((i9 * i10) % 3)) & 1) == 0;
            }
        };
        DATA_MASK_111 = cVar7;
        $VALUES = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c(String str, int i9) {
    }

    public /* synthetic */ c(String str, int i9, a aVar) {
        this(str, i9);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public abstract boolean isMasked(int i9, int i10);

    public final void unmaskBitMatrix(D6.b bVar, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            for (int i11 = 0; i11 < i9; i11++) {
                if (isMasked(i10, i11)) {
                    bVar.e(i11, i10);
                }
            }
        }
    }
}
