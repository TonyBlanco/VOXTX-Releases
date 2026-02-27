package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class K implements J {
    public static int i(int i9, Object obj, Object obj2) {
        I i10 = (I) obj;
        H h9 = (H) obj2;
        int iA = 0;
        if (i10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : i10.entrySet()) {
            iA += h9.a(i9, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static I j(Object obj, Object obj2) {
        I iN = (I) obj;
        I i9 = (I) obj2;
        if (!i9.isEmpty()) {
            if (!iN.j()) {
                iN = iN.n();
            }
            iN.m(i9);
        }
        return iN;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public H.a b(Object obj) {
        return ((H) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Map c(Object obj) {
        return (I) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object d(Object obj) {
        return I.f().n();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Map e(Object obj) {
        return (I) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object f(Object obj) {
        ((I) obj).k();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int g(int i9, Object obj, Object obj2) {
        return i(i9, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public boolean h(Object obj) {
        return !((I) obj).j();
    }
}
