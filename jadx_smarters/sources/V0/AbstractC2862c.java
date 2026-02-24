package v0;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: v0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2862c {

    /* JADX INFO: renamed from: v0.c$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f51252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f51253b;
    }

    public static long a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j9 = aVar.f51253b;
        randomAccessFile.seek(aVar.f51252a);
        int iMin = (int) Math.min(16384L, j9);
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        while (true) {
            int i9 = randomAccessFile.read(bArr, 0, iMin);
            if (i9 == -1) {
                break;
            }
            crc32.update(bArr, 0, i9);
            j9 -= (long) i9;
            if (j9 == 0) {
                break;
            }
            iMin = (int) Math.min(16384L, j9);
        }
        return crc32.getValue();
    }

    public static a b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j9 = length - 22;
        if (j9 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j10 = length - 65558;
        long j11 = j10 >= 0 ? j10 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j9);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f51253b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.f51252a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            j9--;
        } while (j9 >= j11);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
