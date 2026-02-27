package com.google.ads.interactivemedia.v3.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class btk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final btk f22265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final btk f22266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final btk f22267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final btk f22268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final btk f22269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final btk f22270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final btk f22271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final btk f22272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final btk f22273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final btk f22274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final btk f22275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final btk f22276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final btk f22277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final btk f22278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final btk f22279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final btk f22280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final btk f22281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final btk f22282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ btk[] f22283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final btl f22284t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f22285u;

    static {
        btk btkVar = new btk("DOUBLE", 0, btl.DOUBLE, 1);
        f22265a = btkVar;
        btk btkVar2 = new btk("FLOAT", 1, btl.FLOAT, 5);
        f22266b = btkVar2;
        btl btlVar = btl.LONG;
        btk btkVar3 = new btk("INT64", 2, btlVar, 0);
        f22267c = btkVar3;
        btk btkVar4 = new btk("UINT64", 3, btlVar, 0);
        f22268d = btkVar4;
        btl btlVar2 = btl.INT;
        btk btkVar5 = new btk("INT32", 4, btlVar2, 0);
        f22269e = btkVar5;
        btk btkVar6 = new btk("FIXED64", 5, btlVar, 1);
        f22270f = btkVar6;
        btk btkVar7 = new btk("FIXED32", 6, btlVar2, 5);
        f22271g = btkVar7;
        btk btkVar8 = new btk("BOOL", 7, btl.BOOLEAN, 0);
        f22272h = btkVar8;
        btk btkVar9 = new btk("STRING", 8, btl.STRING, 2);
        f22273i = btkVar9;
        btl btlVar3 = btl.MESSAGE;
        btk btkVar10 = new btk("GROUP", 9, btlVar3, 3);
        f22274j = btkVar10;
        btk btkVar11 = new btk("MESSAGE", 10, btlVar3, 2);
        f22275k = btkVar11;
        btk btkVar12 = new btk("BYTES", 11, btl.BYTE_STRING, 2);
        f22276l = btkVar12;
        btk btkVar13 = new btk("UINT32", 12, btlVar2, 0);
        f22277m = btkVar13;
        btk btkVar14 = new btk("ENUM", 13, btl.ENUM, 0);
        f22278n = btkVar14;
        btk btkVar15 = new btk("SFIXED32", 14, btlVar2, 5);
        f22279o = btkVar15;
        btk btkVar16 = new btk("SFIXED64", 15, btlVar, 1);
        f22280p = btkVar16;
        btk btkVar17 = new btk("SINT32", 16, btlVar2, 0);
        f22281q = btkVar17;
        btk btkVar18 = new btk("SINT64", 17, btlVar, 0);
        f22282r = btkVar18;
        f22283s = new btk[]{btkVar, btkVar2, btkVar3, btkVar4, btkVar5, btkVar6, btkVar7, btkVar8, btkVar9, btkVar10, btkVar11, btkVar12, btkVar13, btkVar14, btkVar15, btkVar16, btkVar17, btkVar18};
    }

    private btk(String str, int i9, btl btlVar, int i10) {
        this.f22284t = btlVar;
        this.f22285u = i10;
    }

    public static btk[] values() {
        return (btk[]) f22283s.clone();
    }

    public final btl a() {
        return this.f22284t;
    }
}
