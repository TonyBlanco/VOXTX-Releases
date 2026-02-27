package com.google.ads.interactivemedia.v3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.internal.http2.Settings;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
public final class afe {
    public static long a(ByteBuffer byteBuffer) {
        j(byteBuffer);
        return h(byteBuffer, byteBuffer.position() + 16);
    }

    public static long b(ByteBuffer byteBuffer) {
        j(byteBuffer);
        return h(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairI = i(randomAccessFile, 0);
        return pairI != null ? pairI : i(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    public static void d(ByteBuffer byteBuffer, long j9) {
        j(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j9 >= 0 && j9 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j9);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j9);
    }

    public static X509Certificate[][] e(String str) throws afb, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairC = c(randomAccessFile);
            if (pairC == null) {
                throw new afb("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairC.first;
            long jLongValue = ((Long) pairC.second).longValue();
            long j9 = (-20) + jLongValue;
            if (j9 >= 0) {
                randomAccessFile.seek(j9);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new afb("ZIP64 APK not supported");
                }
            }
            long jA = a(byteBuffer);
            if (jA >= jLongValue) {
                throw new afb("ZIP Central Directory offset out of range: " + jA + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (b(byteBuffer) + jA != jLongValue) {
                throw new afb("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jA < 32) {
                throw new afb("APK too small for APK Signing Block. ZIP Central Directory offset: " + jA);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jA - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new afb("No APK Signing Block before ZIP Central Directory");
            }
            int i9 = 0;
            long j10 = byteBufferAllocate.getLong(0);
            if (j10 < byteBufferAllocate.capacity() || j10 > 2147483639) {
                throw new afb("APK Signing Block size out of range: " + j10);
            }
            int i10 = (int) (8 + j10);
            long j11 = jA - ((long) i10);
            if (j11 < 0) {
                throw new afb("APK Signing Block offset out of range: " + j11);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j11);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j12 = byteBufferAllocate2.getLong(0);
            if (j12 != j10) {
                throw new afb("APK Signing Block sizes in header and footer do not match: " + j12 + " vs " + j10);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j11));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i9++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new afb("Insufficient data to read size of APK Signing Block entry #" + i9);
                    }
                    long j13 = byteBufferSlice.getLong();
                    if (j13 < 4 || j13 > 2147483647L) {
                        throw new afb("APK Signing Block entry #" + i9 + " size out of range: " + j13);
                    }
                    int i11 = (int) j13;
                    int iPosition2 = byteBufferSlice.position() + i11;
                    if (i11 > byteBufferSlice.remaining()) {
                        throw new afb("APK Signing Block entry #" + i9 + " size out of range: " + i11 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrT = t(randomAccessFile.getChannel(), new afa(n(byteBufferSlice, i11 - 4), jLongValue2, jA, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrT;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new afb("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int f(byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] != 71) {
            i9++;
        }
        return i9;
    }

    public static long g(cj cjVar, int i9, int i10) {
        cjVar.F(i9);
        if (cjVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iE = cjVar.e();
        if ((8388608 & iE) != 0 || ((iE >> 8) & 8191) != i10 || (iE & 32) == 0 || cjVar.i() < 7 || cjVar.a() < 7 || (cjVar.i() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        cjVar.A(bArr, 0, 6);
        byte b9 = bArr[0];
        byte b10 = bArr[1];
        byte b11 = bArr[2];
        long j9 = ((long) bArr[3]) & 255;
        return ((((long) b10) & 255) << 17) | ((((long) b9) & 255) << 25) | ((((long) b11) & 255) << 9) | (j9 + j9) | ((((long) bArr[4]) & 255) >> 7);
    }

    private static long h(ByteBuffer byteBuffer, int i9) {
        return ((long) byteBuffer.getInt(i9)) & 4294967295L;
    }

    private static Pair i(RandomAccessFile randomAccessFile, int i9) throws IOException {
        int i10;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i9, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        j(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i10 = -1;
        } else {
            int i11 = iCapacity - 22;
            int iMin = Math.min(i11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            for (int i12 = 0; i12 < iMin; i12++) {
                i10 = i11 - i12;
                if (byteBufferAllocate.getInt(i10) == 101010256 && ((char) byteBufferAllocate.getShort(i10 + 20)) == i12) {
                    break;
                }
            }
            i10 = -1;
        }
        if (i10 == -1) {
            return null;
        }
        byteBufferAllocate.position(i10);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i10)));
    }

    private static void j(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int k(int i9) {
        if (i9 == 1) {
            return 32;
        }
        if (i9 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i9);
    }

    private static int l(int i9) {
        if (i9 == 513) {
            return 1;
        }
        if (i9 == 514) {
            return 2;
        }
        if (i9 == 769) {
            return 1;
        }
        switch (i9) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i9))));
        }
    }

    private static String m(int i9) {
        if (i9 == 1) {
            return MessageDigestAlgorithms.SHA_256;
        }
        if (i9 == 2) {
            return MessageDigestAlgorithms.SHA_512;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i9);
    }

    private static ByteBuffer n(ByteBuffer byteBuffer, int i9) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i10 = i9 + iPosition;
        if (i10 < iPosition || i10 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i10);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i10);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer o(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i9 = byteBuffer.getInt();
        if (i9 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i9 <= byteBuffer.remaining()) {
            return n(byteBuffer, i9);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i9 + ", remaining: " + byteBuffer.remaining());
    }

    private static void p(Map map, FileChannel fileChannel, long j9, long j10, long j11, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        aez aezVar = new aez(fileChannel, 0L, j9);
        aez aezVar2 = new aez(fileChannel, j10, j11 - j10);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        d(byteBufferDuplicate, j9);
        aex aexVar = new aex(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Integer) it.next()).intValue();
            i9++;
        }
        try {
            byte[][] bArrS = s(iArr, new aey[]{aezVar, aezVar2, aexVar});
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = iArr[i10];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i11)), bArrS[i10])) {
                    throw new SecurityException(m(i11).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e9) {
            throw new SecurityException("Failed to compute digest(s) of contents", e9);
        }
    }

    private static byte[] q(ByteBuffer byteBuffer) throws IOException {
        int i9 = byteBuffer.getInt();
        if (i9 < 0) {
            throw new IOException("Negative length");
        }
        if (i9 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i9];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i9 + ", available: " + byteBuffer.remaining());
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130 A[Catch: SignatureException -> 0x0134, InvalidAlgorithmParameterException -> 0x0137, InvalidKeyException -> 0x013a, InvalidKeySpecException -> 0x013d, NoSuchAlgorithmException -> 0x0140, TryCatch #5 {InvalidAlgorithmParameterException -> 0x0137, InvalidKeyException -> 0x013a, NoSuchAlgorithmException -> 0x0140, SignatureException -> 0x0134, InvalidKeySpecException -> 0x013d, blocks: (B:61:0x011a, B:63:0x0130, B:74:0x0143), top: B:133:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] r(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) throws java.io.IOException, java.lang.SecurityException {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.afe.r(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] s(int[] iArr, aey[] aeyVarArr) throws DigestException {
        long j9;
        int i9;
        int length;
        long j10 = 0;
        long jA = 0;
        int i10 = 0;
        while (true) {
            j9 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i10 >= 3) {
                break;
            }
            jA += (aeyVarArr[i10].a() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i10++;
        }
        if (jA >= 2097151) {
            throw new DigestException("Too many chunks: " + jA);
        }
        int i11 = (int) jA;
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            if (i12 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(k(iArr[i12]) * i11) + 5];
            bArr2[0] = 90;
            u(i11, bArr2);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            String strM = m(iArr[i13]);
            try {
                messageDigestArr[i13] = MessageDigest.getInstance(strM);
            } catch (NoSuchAlgorithmException e9) {
                throw new RuntimeException(strM.concat(" digest not supported"), e9);
            }
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (i9 = 3; i14 < i9; i9 = 3) {
            aey aeyVar = aeyVarArr[i14];
            long j11 = j10;
            int i17 = i14;
            long jA2 = aeyVar.a();
            while (jA2 > j10) {
                int iMin = (int) Math.min(jA2, j9);
                u(iMin, bArr3);
                for (int i18 = 0; i18 < length; i18++) {
                    messageDigestArr[i18].update(bArr3);
                }
                long j12 = j11;
                try {
                    aeyVar.b(messageDigestArr, j12, iMin);
                    int i19 = 0;
                    while (i19 < iArr.length) {
                        int i20 = iArr[i19];
                        aey aeyVar2 = aeyVar;
                        byte[] bArr4 = bArr[i19];
                        int iK = k(i20);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i19];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr4, (i15 * iK) + 5, iK);
                        if (iDigest != iK) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i19++;
                        aeyVar = aeyVar2;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    aey aeyVar3 = aeyVar;
                    long j13 = iMin;
                    long j14 = j12 + j13;
                    jA2 -= j13;
                    i15++;
                    j10 = 0;
                    j9 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    aeyVar = aeyVar3;
                    j11 = j14;
                    bArr3 = bArr3;
                } catch (IOException e10) {
                    throw new DigestException("Failed to digest chunk #" + i15 + " of section #" + i16, e10);
                }
            }
            i16++;
            i14 = i17 + 1;
            j10 = 0;
            j9 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i21 = 0; i21 < iArr.length; i21++) {
            int i22 = iArr[i21];
            byte[] bArr7 = bArr[i21];
            String strM2 = m(i22);
            try {
                bArr6[i21] = MessageDigest.getInstance(strM2).digest(bArr7);
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(strM2.concat(" digest not supported"), e11);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] t(FileChannel fileChannel, afa afaVar) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferO = o(afaVar.f19416a);
                int i9 = 0;
                while (byteBufferO.hasRemaining()) {
                    i9++;
                    try {
                        arrayList.add(r(o(byteBufferO), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e9) {
                        throw new SecurityException("Failed to parse/verify signer #" + i9 + " block", e9);
                    }
                }
                if (i9 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                p(map, fileChannel, afaVar.f19417b, afaVar.f19418c, afaVar.f19419d, afaVar.f19420e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e11);
        }
    }

    private static void u(int i9, byte[] bArr) {
        bArr[1] = (byte) (i9 & 255);
        bArr[2] = (byte) ((i9 >>> 8) & 255);
        bArr[3] = (byte) ((i9 >>> 16) & 255);
        bArr[4] = (byte) (i9 >> 24);
    }
}
