package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1139y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f14768a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f14769b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f14770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f14771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1123h f14772e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        boolean a(int i9);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends List, RandomAccess {
        void k();

        boolean t();

        b w(int i9);
    }

    static {
        byte[] bArr = new byte[0];
        f14770c = bArr;
        f14771d = ByteBuffer.wrap(bArr);
        f14772e = AbstractC1123h.h(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i9, int i10) {
        int i11 = i(i10, bArr, i9, i10);
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public static int f(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return q0.m(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((O) obj).b().a((O) obj2).r();
    }

    public static int i(int i9, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i9 = (i9 * 31) + bArr[i12];
        }
        return i9;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f14768a);
    }
}
