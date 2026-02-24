package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1116a implements O {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0165a implements O.a {
        public static void c(Iterable iterable, List list) {
            AbstractC1139y.a(iterable);
            if (!(iterable instanceof D)) {
                if (iterable instanceof Y) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    h(iterable, list);
                    return;
                }
            }
            List listM = ((D) iterable).m();
            D d9 = (D) list;
            int size = list.size();
            for (Object obj : listM) {
                if (obj == null) {
                    String str = "Element at index " + (d9.size() - size) + " is null.";
                    for (int size2 = d9.size() - 1; size2 >= size; size2--) {
                        d9.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1122g) {
                    d9.x((AbstractC1122g) obj);
                } else {
                    d9.add((String) obj);
                }
            }
        }

        public static void h(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static k0 k(O o9) {
            return new k0(o9);
        }

        public abstract AbstractC0165a i(AbstractC1116a abstractC1116a);

        @Override // androidx.datastore.preferences.protobuf.O.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public AbstractC0165a a(O o9) {
            if (f().getClass().isInstance(o9)) {
                return i((AbstractC1116a) o9);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static void c(Iterable iterable, List list) {
        AbstractC0165a.c(iterable, list);
    }

    public abstract int h();

    public int i(e0 e0Var) {
        int iH = h();
        if (iH != -1) {
            return iH;
        }
        int iE = e0Var.e(this);
        k(iE);
        return iE;
    }

    public k0 j() {
        return new k0(this);
    }

    public abstract void k(int i9);

    public void l(OutputStream outputStream) {
        AbstractC1125j abstractC1125jZ = AbstractC1125j.Z(outputStream, AbstractC1125j.C(d()));
        g(abstractC1125jZ);
        abstractC1125jZ.W();
    }
}
