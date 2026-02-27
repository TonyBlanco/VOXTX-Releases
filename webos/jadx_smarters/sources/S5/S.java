package s5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S {
    public static Object[] a(Object[] objArr, int i9, int i10, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i9, i10, objArr2.getClass());
    }

    public static Object[] b(Object[] objArr, int i9) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
    }

    public static Map c(int i9) {
        return C2733n.y(i9);
    }

    public static Map d() {
        return C2733n.t();
    }
}
