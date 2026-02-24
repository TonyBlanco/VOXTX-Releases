package j$.util.stream;

import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class EnumC1959e3 {
    public static final EnumC1959e3 DISTINCT;
    public static final EnumC1959e3 ORDERED;
    public static final EnumC1959e3 SHORT_CIRCUIT;
    public static final EnumC1959e3 SIZED;
    public static final EnumC1959e3 SORTED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f42622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f42623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f42624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f42625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f42626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f42627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f42628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f42629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f42630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f42631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f42632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f42633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f42634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f42635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f42636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f42637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumC1959e3[] f42638v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f42639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42643e;

    static {
        EnumC1954d3 enumC1954d3 = EnumC1954d3.SPLITERATOR;
        C1949c3 c1949c3U = u(enumC1954d3);
        EnumC1954d3 enumC1954d32 = EnumC1954d3.STREAM;
        c1949c3U.a(enumC1954d32);
        EnumC1954d3 enumC1954d33 = EnumC1954d3.OP;
        c1949c3U.f42602a.put(enumC1954d33, 3);
        EnumC1959e3 enumC1959e3 = new EnumC1959e3("DISTINCT", 0, 0, c1949c3U);
        DISTINCT = enumC1959e3;
        C1949c3 c1949c3U2 = u(enumC1954d3);
        c1949c3U2.a(enumC1954d32);
        c1949c3U2.f42602a.put(enumC1954d33, 3);
        EnumC1959e3 enumC1959e32 = new EnumC1959e3("SORTED", 1, 1, c1949c3U2);
        SORTED = enumC1959e32;
        C1949c3 c1949c3U3 = u(enumC1954d3);
        c1949c3U3.a(enumC1954d32);
        Map map = c1949c3U3.f42602a;
        map.put(enumC1954d33, 3);
        EnumC1954d3 enumC1954d34 = EnumC1954d3.TERMINAL_OP;
        map.put(enumC1954d34, 2);
        EnumC1954d3 enumC1954d35 = EnumC1954d3.UPSTREAM_TERMINAL_OP;
        map.put(enumC1954d35, 2);
        EnumC1959e3 enumC1959e33 = new EnumC1959e3("ORDERED", 2, 2, c1949c3U3);
        ORDERED = enumC1959e33;
        C1949c3 c1949c3U4 = u(enumC1954d3);
        c1949c3U4.a(enumC1954d32);
        c1949c3U4.f42602a.put(enumC1954d33, 2);
        EnumC1959e3 enumC1959e34 = new EnumC1959e3("SIZED", 3, 3, c1949c3U4);
        SIZED = enumC1959e34;
        C1949c3 c1949c3U5 = u(enumC1954d33);
        c1949c3U5.a(enumC1954d34);
        EnumC1959e3 enumC1959e35 = new EnumC1959e3("SHORT_CIRCUIT", 4, 12, c1949c3U5);
        SHORT_CIRCUIT = enumC1959e35;
        f42638v = new EnumC1959e3[]{enumC1959e3, enumC1959e32, enumC1959e33, enumC1959e34, enumC1959e35};
        f42622f = k(enumC1954d3);
        f42623g = k(enumC1954d32);
        f42624h = k(enumC1954d33);
        k(enumC1954d34);
        k(enumC1954d35);
        int i9 = 0;
        for (EnumC1959e3 enumC1959e36 : values()) {
            i9 |= enumC1959e36.f42643e;
        }
        f42625i = i9;
        int i10 = f42623g;
        f42626j = i10;
        int i11 = i10 << 1;
        f42627k = i11;
        f42628l = i10 | i11;
        EnumC1959e3 enumC1959e37 = DISTINCT;
        f42629m = enumC1959e37.f42641c;
        f42630n = enumC1959e37.f42642d;
        EnumC1959e3 enumC1959e38 = SORTED;
        f42631o = enumC1959e38.f42641c;
        f42632p = enumC1959e38.f42642d;
        EnumC1959e3 enumC1959e39 = ORDERED;
        f42633q = enumC1959e39.f42641c;
        f42634r = enumC1959e39.f42642d;
        EnumC1959e3 enumC1959e310 = SIZED;
        f42635s = enumC1959e310.f42641c;
        f42636t = enumC1959e310.f42642d;
        f42637u = SHORT_CIRCUIT.f42641c;
    }

    private EnumC1959e3(String str, int i9, int i10, C1949c3 c1949c3) {
        EnumC1954d3[] enumC1954d3ArrValues = EnumC1954d3.values();
        int length = enumC1954d3ArrValues.length;
        int i11 = 0;
        while (true) {
            Map map = c1949c3.f42602a;
            if (i11 >= length) {
                this.f42639a = map;
                int i12 = i10 * 2;
                this.f42640b = i12;
                this.f42641c = 1 << i12;
                this.f42642d = 2 << i12;
                this.f42643e = 3 << i12;
                return;
            }
            j$.util.A.r(map, enumC1954d3ArrValues[i11], 0);
            i11++;
        }
    }

    static int i(int i9, int i10) {
        return i9 | (i10 & (i9 == 0 ? f42625i : ~(((f42626j & i9) << 1) | i9 | ((f42627k & i9) >> 1))));
    }

    private static int k(EnumC1954d3 enumC1954d3) {
        int iIntValue = 0;
        for (EnumC1959e3 enumC1959e3 : values()) {
            iIntValue |= ((Integer) enumC1959e3.f42639a.get(enumC1954d3)).intValue() << enumC1959e3.f42640b;
        }
        return iIntValue;
    }

    static int l(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i9 = iCharacteristics & 4;
        int i10 = f42622f;
        return (i9 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i10 : iCharacteristics & i10 & (-5);
    }

    private static C1949c3 u(EnumC1954d3 enumC1954d3) {
        C1949c3 c1949c3 = new C1949c3(new EnumMap(EnumC1954d3.class));
        c1949c3.a(enumC1954d3);
        return c1949c3;
    }

    public static EnumC1959e3 valueOf(String str) {
        return (EnumC1959e3) Enum.valueOf(EnumC1959e3.class, str);
    }

    public static EnumC1959e3[] values() {
        return (EnumC1959e3[]) f42638v.clone();
    }

    static int y(int i9) {
        return i9 & ((~i9) >> 1) & f42626j;
    }

    final boolean q(int i9) {
        return (i9 & this.f42643e) == this.f42641c;
    }

    final boolean t(int i9) {
        int i10 = this.f42643e;
        return (i9 & i10) == i10;
    }
}
