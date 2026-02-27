package a0;

import a0.g;
import androidx.datastore.preferences.protobuf.AbstractC1137w;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1137w implements P {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC1137w.a implements P {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public a A(g.a aVar) {
            o();
            ((h) this.f14765c).f0(aVar);
            return this;
        }

        public a u(boolean z9) {
            o();
            ((h) this.f14765c).Z(z9);
            return this;
        }

        public a v(double d9) {
            o();
            ((h) this.f14765c).a0(d9);
            return this;
        }

        public a w(float f9) {
            o();
            ((h) this.f14765c).b0(f9);
            return this;
        }

        public a x(int i9) {
            o();
            ((h) this.f14765c).c0(i9);
            return this;
        }

        public a y(long j9) {
            o();
            ((h) this.f14765c).d0(j9);
            return this;
        }

        public a z(String str) {
            o();
            ((h) this.f14765c).e0(str);
            return this;
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int value;

        b(int i9) {
            this.value = i9;
        }

        public static b forNumber(int i9) {
            switch (i9) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        @Deprecated
        public static b valueOf(int i9) {
            return forNumber(i9);
        }

        public int getNumber() {
            return this.value;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC1137w.F(h.class, hVar);
    }

    public static h Q() {
        return DEFAULT_INSTANCE;
    }

    public static a Y() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public boolean P() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double R() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float S() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int T() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long U() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String V() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g W() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.L();
    }

    public b X() {
        return b.forNumber(this.valueCase_);
    }

    public final void Z(boolean z9) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z9);
    }

    public final void a0(double d9) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d9);
    }

    public final void b0(float f9) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f9);
    }

    public final void c0(int i9) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i9);
    }

    public final void d0(long j9) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j9);
    }

    public final void e0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void f0(g.a aVar) {
        this.value_ = aVar.l();
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1137w
    public final Object s(AbstractC1137w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f11440a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1137w.C(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X bVar = PARSER;
                if (bVar == null) {
                    synchronized (h.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC1137w.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
