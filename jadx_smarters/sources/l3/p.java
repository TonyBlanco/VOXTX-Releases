package l3;

import d3.w;
import d4.AbstractC1681B;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w.a f44044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f44046e;

    public p(boolean z9, String str, int i9, byte[] bArr, int i10, int i11, byte[] bArr2) {
        AbstractC1684a.a((bArr2 == null) ^ (i9 == 0));
        this.f44042a = z9;
        this.f44043b = str;
        this.f44045d = i9;
        this.f44046e = bArr2;
        this.f44044c = new w.a(a(str), bArr, i10, i11);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b9 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b9 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b9 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b9 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b9 = 3;
                }
                break;
        }
        switch (b9) {
            case 0:
            case 1:
                return 2;
            default:
                AbstractC1681B.j("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
