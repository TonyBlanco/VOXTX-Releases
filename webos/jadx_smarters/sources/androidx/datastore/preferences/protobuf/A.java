package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final A BOOLEAN;
    public static final A BYTE_STRING;
    public static final A DOUBLE;
    public static final A ENUM;
    public static final A FLOAT;
    public static final A INT;
    public static final A LONG;
    public static final A MESSAGE;
    public static final A STRING;
    public static final A VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        A a9 = new A("VOID", 0, Void.class, Void.class, null);
        VOID = a9;
        Class cls = Integer.TYPE;
        A a10 = new A("INT", 1, cls, Integer.class, 0);
        INT = a10;
        A a11 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = a11;
        A a12 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = a12;
        A a13 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = a13;
        A a14 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = a14;
        A a15 = new A("STRING", 6, String.class, String.class, "");
        STRING = a15;
        A a16 = new A("BYTE_STRING", 7, AbstractC1122g.class, AbstractC1122g.class, AbstractC1122g.f14628c);
        BYTE_STRING = a16;
        A a17 = new A("ENUM", 8, cls, Integer.class, null);
        ENUM = a17;
        A a18 = new A("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = a18;
        $VALUES = new A[]{a9, a10, a11, a12, a13, a14, a15, a16, a17, a18};
    }

    private A(String str, int i9, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
