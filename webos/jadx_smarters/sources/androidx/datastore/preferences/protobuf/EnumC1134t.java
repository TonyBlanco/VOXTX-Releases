package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1134t {
    private static final /* synthetic */ EnumC1134t[] $VALUES;
    public static final EnumC1134t BOOL;
    public static final EnumC1134t BOOL_LIST;
    public static final EnumC1134t BOOL_LIST_PACKED;
    public static final EnumC1134t BYTES;
    public static final EnumC1134t BYTES_LIST;
    public static final EnumC1134t DOUBLE;
    public static final EnumC1134t DOUBLE_LIST;
    public static final EnumC1134t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC1134t ENUM;
    public static final EnumC1134t ENUM_LIST;
    public static final EnumC1134t ENUM_LIST_PACKED;
    public static final EnumC1134t FIXED32;
    public static final EnumC1134t FIXED32_LIST;
    public static final EnumC1134t FIXED32_LIST_PACKED;
    public static final EnumC1134t FIXED64;
    public static final EnumC1134t FIXED64_LIST;
    public static final EnumC1134t FIXED64_LIST_PACKED;
    public static final EnumC1134t FLOAT;
    public static final EnumC1134t FLOAT_LIST;
    public static final EnumC1134t FLOAT_LIST_PACKED;
    public static final EnumC1134t GROUP;
    public static final EnumC1134t GROUP_LIST;
    public static final EnumC1134t INT32;
    public static final EnumC1134t INT32_LIST;
    public static final EnumC1134t INT32_LIST_PACKED;
    public static final EnumC1134t INT64;
    public static final EnumC1134t INT64_LIST;
    public static final EnumC1134t INT64_LIST_PACKED;
    public static final EnumC1134t MAP;
    public static final EnumC1134t MESSAGE;
    public static final EnumC1134t MESSAGE_LIST;
    public static final EnumC1134t SFIXED32;
    public static final EnumC1134t SFIXED32_LIST;
    public static final EnumC1134t SFIXED32_LIST_PACKED;
    public static final EnumC1134t SFIXED64;
    public static final EnumC1134t SFIXED64_LIST;
    public static final EnumC1134t SFIXED64_LIST_PACKED;
    public static final EnumC1134t SINT32;
    public static final EnumC1134t SINT32_LIST;
    public static final EnumC1134t SINT32_LIST_PACKED;
    public static final EnumC1134t SINT64;
    public static final EnumC1134t SINT64_LIST;
    public static final EnumC1134t SINT64_LIST_PACKED;
    public static final EnumC1134t STRING;
    public static final EnumC1134t STRING_LIST;
    public static final EnumC1134t UINT32;
    public static final EnumC1134t UINT32_LIST;
    public static final EnumC1134t UINT32_LIST_PACKED;
    public static final EnumC1134t UINT64;
    public static final EnumC1134t UINT64_LIST;
    public static final EnumC1134t UINT64_LIST_PACKED;
    private static final EnumC1134t[] VALUES;
    private final b collection;
    private final Class<?> elementType;
    private final int id;
    private final A javaType;
    private final boolean primitiveScalar;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14762b;

        static {
            int[] iArr = new int[A.values().length];
            f14762b = iArr;
            try {
                iArr[A.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14762b[A.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14762b[A.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f14761a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14761a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14761a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z9) {
            this.isList = z9;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        b bVar = b.SCALAR;
        A a9 = A.DOUBLE;
        EnumC1134t enumC1134t = new EnumC1134t("DOUBLE", 0, 0, bVar, a9);
        DOUBLE = enumC1134t;
        A a10 = A.FLOAT;
        EnumC1134t enumC1134t2 = new EnumC1134t("FLOAT", 1, 1, bVar, a10);
        FLOAT = enumC1134t2;
        A a11 = A.LONG;
        EnumC1134t enumC1134t3 = new EnumC1134t("INT64", 2, 2, bVar, a11);
        INT64 = enumC1134t3;
        EnumC1134t enumC1134t4 = new EnumC1134t("UINT64", 3, 3, bVar, a11);
        UINT64 = enumC1134t4;
        A a12 = A.INT;
        EnumC1134t enumC1134t5 = new EnumC1134t("INT32", 4, 4, bVar, a12);
        INT32 = enumC1134t5;
        EnumC1134t enumC1134t6 = new EnumC1134t("FIXED64", 5, 5, bVar, a11);
        FIXED64 = enumC1134t6;
        EnumC1134t enumC1134t7 = new EnumC1134t("FIXED32", 6, 6, bVar, a12);
        FIXED32 = enumC1134t7;
        A a13 = A.BOOLEAN;
        EnumC1134t enumC1134t8 = new EnumC1134t("BOOL", 7, 7, bVar, a13);
        BOOL = enumC1134t8;
        A a14 = A.STRING;
        EnumC1134t enumC1134t9 = new EnumC1134t("STRING", 8, 8, bVar, a14);
        STRING = enumC1134t9;
        A a15 = A.MESSAGE;
        EnumC1134t enumC1134t10 = new EnumC1134t("MESSAGE", 9, 9, bVar, a15);
        MESSAGE = enumC1134t10;
        A a16 = A.BYTE_STRING;
        EnumC1134t enumC1134t11 = new EnumC1134t("BYTES", 10, 10, bVar, a16);
        BYTES = enumC1134t11;
        EnumC1134t enumC1134t12 = new EnumC1134t("UINT32", 11, 11, bVar, a12);
        UINT32 = enumC1134t12;
        A a17 = A.ENUM;
        EnumC1134t enumC1134t13 = new EnumC1134t("ENUM", 12, 12, bVar, a17);
        ENUM = enumC1134t13;
        EnumC1134t enumC1134t14 = new EnumC1134t("SFIXED32", 13, 13, bVar, a12);
        SFIXED32 = enumC1134t14;
        EnumC1134t enumC1134t15 = new EnumC1134t("SFIXED64", 14, 14, bVar, a11);
        SFIXED64 = enumC1134t15;
        EnumC1134t enumC1134t16 = new EnumC1134t("SINT32", 15, 15, bVar, a12);
        SINT32 = enumC1134t16;
        EnumC1134t enumC1134t17 = new EnumC1134t("SINT64", 16, 16, bVar, a11);
        SINT64 = enumC1134t17;
        EnumC1134t enumC1134t18 = new EnumC1134t("GROUP", 17, 17, bVar, a15);
        GROUP = enumC1134t18;
        b bVar2 = b.VECTOR;
        EnumC1134t enumC1134t19 = new EnumC1134t("DOUBLE_LIST", 18, 18, bVar2, a9);
        DOUBLE_LIST = enumC1134t19;
        EnumC1134t enumC1134t20 = new EnumC1134t("FLOAT_LIST", 19, 19, bVar2, a10);
        FLOAT_LIST = enumC1134t20;
        EnumC1134t enumC1134t21 = new EnumC1134t("INT64_LIST", 20, 20, bVar2, a11);
        INT64_LIST = enumC1134t21;
        EnumC1134t enumC1134t22 = new EnumC1134t("UINT64_LIST", 21, 21, bVar2, a11);
        UINT64_LIST = enumC1134t22;
        EnumC1134t enumC1134t23 = new EnumC1134t("INT32_LIST", 22, 22, bVar2, a12);
        INT32_LIST = enumC1134t23;
        EnumC1134t enumC1134t24 = new EnumC1134t("FIXED64_LIST", 23, 23, bVar2, a11);
        FIXED64_LIST = enumC1134t24;
        EnumC1134t enumC1134t25 = new EnumC1134t("FIXED32_LIST", 24, 24, bVar2, a12);
        FIXED32_LIST = enumC1134t25;
        EnumC1134t enumC1134t26 = new EnumC1134t("BOOL_LIST", 25, 25, bVar2, a13);
        BOOL_LIST = enumC1134t26;
        EnumC1134t enumC1134t27 = new EnumC1134t("STRING_LIST", 26, 26, bVar2, a14);
        STRING_LIST = enumC1134t27;
        EnumC1134t enumC1134t28 = new EnumC1134t("MESSAGE_LIST", 27, 27, bVar2, a15);
        MESSAGE_LIST = enumC1134t28;
        EnumC1134t enumC1134t29 = new EnumC1134t("BYTES_LIST", 28, 28, bVar2, a16);
        BYTES_LIST = enumC1134t29;
        EnumC1134t enumC1134t30 = new EnumC1134t("UINT32_LIST", 29, 29, bVar2, a12);
        UINT32_LIST = enumC1134t30;
        EnumC1134t enumC1134t31 = new EnumC1134t("ENUM_LIST", 30, 30, bVar2, a17);
        ENUM_LIST = enumC1134t31;
        EnumC1134t enumC1134t32 = new EnumC1134t("SFIXED32_LIST", 31, 31, bVar2, a12);
        SFIXED32_LIST = enumC1134t32;
        EnumC1134t enumC1134t33 = new EnumC1134t("SFIXED64_LIST", 32, 32, bVar2, a11);
        SFIXED64_LIST = enumC1134t33;
        EnumC1134t enumC1134t34 = new EnumC1134t("SINT32_LIST", 33, 33, bVar2, a12);
        SINT32_LIST = enumC1134t34;
        EnumC1134t enumC1134t35 = new EnumC1134t("SINT64_LIST", 34, 34, bVar2, a11);
        SINT64_LIST = enumC1134t35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC1134t enumC1134t36 = new EnumC1134t("DOUBLE_LIST_PACKED", 35, 35, bVar3, a9);
        DOUBLE_LIST_PACKED = enumC1134t36;
        EnumC1134t enumC1134t37 = new EnumC1134t("FLOAT_LIST_PACKED", 36, 36, bVar3, a10);
        FLOAT_LIST_PACKED = enumC1134t37;
        EnumC1134t enumC1134t38 = new EnumC1134t("INT64_LIST_PACKED", 37, 37, bVar3, a11);
        INT64_LIST_PACKED = enumC1134t38;
        EnumC1134t enumC1134t39 = new EnumC1134t("UINT64_LIST_PACKED", 38, 38, bVar3, a11);
        UINT64_LIST_PACKED = enumC1134t39;
        EnumC1134t enumC1134t40 = new EnumC1134t("INT32_LIST_PACKED", 39, 39, bVar3, a12);
        INT32_LIST_PACKED = enumC1134t40;
        EnumC1134t enumC1134t41 = new EnumC1134t("FIXED64_LIST_PACKED", 40, 40, bVar3, a11);
        FIXED64_LIST_PACKED = enumC1134t41;
        EnumC1134t enumC1134t42 = new EnumC1134t("FIXED32_LIST_PACKED", 41, 41, bVar3, a12);
        FIXED32_LIST_PACKED = enumC1134t42;
        EnumC1134t enumC1134t43 = new EnumC1134t("BOOL_LIST_PACKED", 42, 42, bVar3, a13);
        BOOL_LIST_PACKED = enumC1134t43;
        EnumC1134t enumC1134t44 = new EnumC1134t("UINT32_LIST_PACKED", 43, 43, bVar3, a12);
        UINT32_LIST_PACKED = enumC1134t44;
        EnumC1134t enumC1134t45 = new EnumC1134t("ENUM_LIST_PACKED", 44, 44, bVar3, a17);
        ENUM_LIST_PACKED = enumC1134t45;
        EnumC1134t enumC1134t46 = new EnumC1134t("SFIXED32_LIST_PACKED", 45, 45, bVar3, a12);
        SFIXED32_LIST_PACKED = enumC1134t46;
        EnumC1134t enumC1134t47 = new EnumC1134t("SFIXED64_LIST_PACKED", 46, 46, bVar3, a11);
        SFIXED64_LIST_PACKED = enumC1134t47;
        EnumC1134t enumC1134t48 = new EnumC1134t("SINT32_LIST_PACKED", 47, 47, bVar3, a12);
        SINT32_LIST_PACKED = enumC1134t48;
        EnumC1134t enumC1134t49 = new EnumC1134t("SINT64_LIST_PACKED", 48, 48, bVar3, a11);
        SINT64_LIST_PACKED = enumC1134t49;
        EnumC1134t enumC1134t50 = new EnumC1134t("GROUP_LIST", 49, 49, bVar2, a15);
        GROUP_LIST = enumC1134t50;
        EnumC1134t enumC1134t51 = new EnumC1134t("MAP", 50, 50, b.MAP, A.VOID);
        MAP = enumC1134t51;
        $VALUES = new EnumC1134t[]{enumC1134t, enumC1134t2, enumC1134t3, enumC1134t4, enumC1134t5, enumC1134t6, enumC1134t7, enumC1134t8, enumC1134t9, enumC1134t10, enumC1134t11, enumC1134t12, enumC1134t13, enumC1134t14, enumC1134t15, enumC1134t16, enumC1134t17, enumC1134t18, enumC1134t19, enumC1134t20, enumC1134t21, enumC1134t22, enumC1134t23, enumC1134t24, enumC1134t25, enumC1134t26, enumC1134t27, enumC1134t28, enumC1134t29, enumC1134t30, enumC1134t31, enumC1134t32, enumC1134t33, enumC1134t34, enumC1134t35, enumC1134t36, enumC1134t37, enumC1134t38, enumC1134t39, enumC1134t40, enumC1134t41, enumC1134t42, enumC1134t43, enumC1134t44, enumC1134t45, enumC1134t46, enumC1134t47, enumC1134t48, enumC1134t49, enumC1134t50, enumC1134t51};
        EMPTY_TYPES = new Type[0];
        EnumC1134t[] enumC1134tArrValues = values();
        VALUES = new EnumC1134t[enumC1134tArrValues.length];
        for (EnumC1134t enumC1134t52 : enumC1134tArrValues) {
            VALUES[enumC1134t52.id] = enumC1134t52;
        }
    }

    private EnumC1134t(String str, int i9, int i10, b bVar, A a9) {
        int i11;
        this.id = i10;
        this.collection = bVar;
        this.javaType = a9;
        int i12 = a.f14761a[bVar.ordinal()];
        this.elementType = (i12 == 1 || i12 == 2) ? a9.getBoxedType() : null;
        this.primitiveScalar = (bVar != b.SCALAR || (i11 = a.f14762b[a9.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : true;
    }

    public static EnumC1134t forId(int i9) {
        if (i9 < 0) {
            return null;
        }
        EnumC1134t[] enumC1134tArr = VALUES;
        if (i9 >= enumC1134tArr.length) {
            return null;
        }
        return enumC1134tArr[i9];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i9 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i9 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i9];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i9++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                    Type type = actualTypeArguments[i10];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i11 = 0; i11 < typeParameters.length; i11++) {
                            if (type == typeParameters[i11]) {
                                actualTypeArguments[i10] = typeArr[i11];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static EnumC1134t valueOf(String str) {
        return (EnumC1134t) Enum.valueOf(EnumC1134t.class, str);
    }

    public static EnumC1134t[] values() {
        return (EnumC1134t[]) $VALUES.clone();
    }

    public A getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
