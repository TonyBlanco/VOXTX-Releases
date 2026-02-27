package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21809a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f21810b = {0, 0, 0, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f21811c = {"", "A", "B", "C"};

    public static String a(int i9, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String b(int i9, boolean z9, int i10, int i11, int[] iArr, int i12) {
        StringBuilder sb = new StringBuilder(cq.H("hvc1.%s%d.%X.%c%d", f21811c[i9], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(true != z9 ? 'L' : 'H'), Integer.valueOf(i12)));
        int i13 = 6;
        while (i13 > 0) {
            int i14 = i13 - 1;
            if (iArr[i14] != 0) {
                break;
            }
            i13 = i14;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb.toString();
    }

    public static byte[] c(byte[] bArr, int i9, int i10) {
        byte[] bArr2 = new byte[i10 + 4];
        System.arraycopy(f21810b, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i9, bArr2, 4, i10);
        return bArr2;
    }
}
