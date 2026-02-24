package O5;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: O5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0944h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f6570a = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f6571b;

    public C0944h(y yVar) {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String strC = AbstractC0945i.C(yVar.a().c());
        String strW = AbstractC0945i.w(bArr);
        Locale locale = Locale.US;
        f6571b = String.format(locale, "%s%s%s%s", strW.substring(0, 12), strW.substring(12, 16), strW.subSequence(16, 20), strC.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j9) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j9);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public static byte[] b(long j9) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j9);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final void c(byte[] bArr) {
        byte[] bArrB = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrB[0];
        bArr[9] = bArrB[1];
    }

    public final void d(byte[] bArr) {
        byte[] bArrB = b(f6570a.incrementAndGet());
        bArr[6] = bArrB[0];
        bArr[7] = bArrB[1];
    }

    public final void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrA = a(time / 1000);
        bArr[0] = bArrA[0];
        bArr[1] = bArrA[1];
        bArr[2] = bArrA[2];
        bArr[3] = bArrA[3];
        byte[] bArrB = b(time % 1000);
        bArr[4] = bArrB[0];
        bArr[5] = bArrB[1];
    }

    public String toString() {
        return f6571b;
    }
}
