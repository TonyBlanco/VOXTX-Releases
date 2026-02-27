package a0;

import androidx.datastore.preferences.protobuf.AbstractC1116a;
import androidx.datastore.preferences.protobuf.AbstractC1137w;
import androidx.datastore.preferences.protobuf.AbstractC1139y;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1137w implements P {
    private static final g DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC1139y.b strings_ = AbstractC1137w.t();

    public static final class a extends AbstractC1137w.a implements P {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public a u(Iterable iterable) {
            o();
            ((g) this.f14765c).J(iterable);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1137w.F(g.class, gVar);
    }

    public static g L() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public final void J(Iterable iterable) {
        K();
        AbstractC1116a.c(iterable, this.strings_);
    }

    public final void K() {
        if (this.strings_.t()) {
            return;
        }
        this.strings_ = AbstractC1137w.A(this.strings_);
    }

    public List M() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1137w
    public final Object s(AbstractC1137w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f11440a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1137w.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
