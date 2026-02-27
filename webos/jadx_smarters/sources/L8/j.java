package l8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final Object[] a(Object[] objArr, boolean z9) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        if (z9 && kotlin.jvm.internal.l.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.l.d(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    public static List b(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.l.d(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
