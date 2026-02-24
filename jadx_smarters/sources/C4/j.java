package C4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f1143a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f1144b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i9 = 0;
        for (byte b9 : bArr) {
            char[] cArr2 = f1144b;
            cArr[i9] = cArr2[(b9 & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b9 & 15];
            i9 += 2;
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr) {
        return c(bArr, false);
    }

    public static String c(byte[] bArr, boolean z9) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i9 = 0; i9 < length && (!z9 || i9 != length - 1 || (bArr[i9] & 255) != 0); i9++) {
            char[] cArr = f1143a;
            sb.append(cArr[(bArr[i9] & 240) >>> 4]);
            sb.append(cArr[bArr[i9] & 15]);
        }
        return sb.toString();
    }

    public static byte[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 2;
            bArr[i9 / 2] = (byte) Integer.parseInt(str.substring(i9, i10), 16);
            i9 = i10;
        }
        return bArr;
    }
}
