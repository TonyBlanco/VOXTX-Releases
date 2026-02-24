package com.google.android.gms.internal.firebase_messaging;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public final class zzl {
    private static final OutputStream zza = new zzj();

    public static InputStream zza(InputStream inputStream, long j9) {
        return new zzk(inputStream, 1048577L);
    }

    public static byte[] zzb(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i9 = Segment.SIZE;
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin = Math.min(i9, 2147483639 - i10);
            byte[] bArr = new byte[iMin];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = inputStream.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    return zzc(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            long j9 = i9;
            long j10 = j9 + j9;
            i9 = j10 > 2147483647L ? a.e.API_PRIORITY_OTHER : j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzc(Queue<byte[]> queue, int i9) {
        byte[] bArr = new byte[i9];
        int i10 = i9;
        while (i10 > 0) {
            byte[] bArrRemove = queue.remove();
            int iMin = Math.min(i10, bArrRemove.length);
            System.arraycopy(bArrRemove, 0, bArr, i9 - i10, iMin);
            i10 -= iMin;
        }
        return bArr;
    }
}
