package Q2;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {
    public static List a(byte[] bArr) {
        long jI = i(f(bArr));
        long jI2 = i(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(jI));
        arrayList.add(b(jI2));
        return arrayList;
    }

    public static byte[] b(long j9) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j9).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static long d(byte b9, byte b10) {
        int i9;
        int i10 = b9 & 255;
        int i11 = b9 & 3;
        if (i11 != 0) {
            i9 = 2;
            if (i11 != 1 && i11 != 2) {
                i9 = b10 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i9 = 1;
        }
        int i12 = i10 >> 3;
        int i13 = i12 & 3;
        return ((long) i9) * ((long) (i12 >= 16 ? 2500 << i13 : i12 >= 12 ? Constants.MAXIMUM_UPLOAD_PARTS << (i12 & 1) : i13 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : Constants.MAXIMUM_UPLOAD_PARTS << i13));
    }

    public static long e(byte[] bArr) {
        return d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int g(ByteBuffer byteBuffer) {
        byte b9 = byteBuffer.get(26);
        return (int) ((d(byteBuffer.get(b9 + 27), byteBuffer.limit() > 1 ? byteBuffer.get(b9 + 28) : (byte) 0) * 48000) / 1000000);
    }

    public static int h(ByteBuffer byteBuffer) {
        return (int) ((d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long i(long j9) {
        return (j9 * 1000000000) / 48000;
    }
}
