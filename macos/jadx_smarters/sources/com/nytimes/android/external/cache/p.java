package com.nytimes.android.external.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p COLLECTED;
    public static final p EXPIRED;
    public static final p EXPLICIT;
    public static final p REPLACED;
    public static final p SIZE;

    public enum a extends p {
        public a(String str, int i9) {
            super(str, i9, null);
        }

        @Override // com.nytimes.android.external.cache.p
        public boolean wasEvicted() {
            return false;
        }
    }

    static {
        a aVar = new a("EXPLICIT", 0);
        EXPLICIT = aVar;
        p pVar = new p("REPLACED", 1) { // from class: com.nytimes.android.external.cache.p.b
            {
                a aVar2 = null;
            }

            @Override // com.nytimes.android.external.cache.p
            public boolean wasEvicted() {
                return false;
            }
        };
        REPLACED = pVar;
        p pVar2 = new p("COLLECTED", 2) { // from class: com.nytimes.android.external.cache.p.c
            {
                a aVar2 = null;
            }

            @Override // com.nytimes.android.external.cache.p
            public boolean wasEvicted() {
                return true;
            }
        };
        COLLECTED = pVar2;
        p pVar3 = new p("EXPIRED", 3) { // from class: com.nytimes.android.external.cache.p.d
            {
                a aVar2 = null;
            }

            @Override // com.nytimes.android.external.cache.p
            public boolean wasEvicted() {
                return true;
            }
        };
        EXPIRED = pVar3;
        p pVar4 = new p("SIZE", 4) { // from class: com.nytimes.android.external.cache.p.e
            {
                a aVar2 = null;
            }

            @Override // com.nytimes.android.external.cache.p
            public boolean wasEvicted() {
                return true;
            }
        };
        SIZE = pVar4;
        $VALUES = new p[]{aVar, pVar, pVar2, pVar3, pVar4};
    }

    private p(String str, int i9) {
    }

    public /* synthetic */ p(String str, int i9, a aVar) {
        this(str, i9);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public abstract boolean wasEvicted();
}
