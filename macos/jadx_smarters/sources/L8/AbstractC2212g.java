package l8;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2212g extends AbstractC2211f {
    public static List b(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        List listA = i.a(objArr);
        kotlin.jvm.internal.l.d(listA, "asList(this)");
        return listA;
    }

    public static byte[] c(byte[] bArr, byte[] destination, int i9, int i10, int i11) {
        kotlin.jvm.internal.l.e(bArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        System.arraycopy(bArr, i10, destination, i9, i11 - i10);
        return destination;
    }

    public static final Object[] d(Object[] objArr, Object[] destination, int i9, int i10, int i11) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        System.arraycopy(objArr, i10, destination, i9, i11 - i10);
        return destination;
    }

    public static /* synthetic */ byte[] e(byte[] bArr, byte[] bArr2, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i9 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        return c(bArr, bArr2, i9, i10, i11);
    }

    public static /* synthetic */ Object[] f(Object[] objArr, Object[] objArr2, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i9 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return d(objArr, objArr2, i9, i10, i11);
    }

    public static byte[] g(byte[] bArr, int i9, int i10) {
        kotlin.jvm.internal.l.e(bArr, "<this>");
        AbstractC2210e.a(i10, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i9, i10);
        kotlin.jvm.internal.l.d(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    public static Object[] h(Object[] objArr, int i9, int i10) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        AbstractC2210e.a(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i9, i10);
        kotlin.jvm.internal.l.d(objArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return objArrCopyOfRange;
    }

    public static final void i(int[] iArr, int i9, int i10, int i11) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        Arrays.fill(iArr, i10, i11, i9);
    }

    public static void j(Object[] objArr, Object obj, int i9, int i10) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        Arrays.fill(objArr, i9, i10, obj);
    }

    public static /* synthetic */ void k(int[] iArr, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length;
        }
        i(iArr, i9, i10, i11);
    }

    public static /* synthetic */ void l(Object[] objArr, Object obj, int i9, int i10, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = objArr.length;
        }
        j(objArr, obj, i9, i10);
    }
}
