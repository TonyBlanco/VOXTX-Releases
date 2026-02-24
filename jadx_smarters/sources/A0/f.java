package a0;

import androidx.datastore.preferences.protobuf.AbstractC1137w;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1137w implements P {
    private static final f DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f();

    public static final class a extends AbstractC1137w.a implements P {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public a u(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            o();
            ((f) this.f14765c).J().put(str, hVar);
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final H f11441a = H.d(r0.b.STRING, "", r0.b.MESSAGE, h.Q());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1137w.F(f.class, fVar);
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public static f O(InputStream inputStream) {
        return (f) AbstractC1137w.D(DEFAULT_INSTANCE, inputStream);
    }

    public final Map J() {
        return L();
    }

    public Map K() {
        return Collections.unmodifiableMap(M());
    }

    public final I L() {
        if (!this.preferences_.j()) {
            this.preferences_ = this.preferences_.n();
        }
        return this.preferences_;
    }

    public final I M() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1137w
    public final Object s(AbstractC1137w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f11440a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1137w.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f11441a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
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
