package V6;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f10115c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f10116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f10117b;

    public g(int i9) {
        this.f10116a = f.forBits((i9 >> 3) & 3);
        this.f10117b = (byte) (i9 & 7);
    }

    public static g a(int i9, int i10) {
        g gVarB = b(i9, i10);
        return gVarB != null ? gVarB : b(i9 ^ 21522, i10 ^ 21522);
    }

    public static g b(int i9, int i10) {
        int iE;
        int[][] iArr = f10115c;
        int i11 = a.e.API_PRIORITY_OTHER;
        int i12 = 0;
        for (int[] iArr2 : iArr) {
            int i13 = iArr2[0];
            if (i13 == i9 || i13 == i10) {
                return new g(iArr2[1]);
            }
            int iE2 = e(i9, i13);
            if (iE2 < i11) {
                i12 = iArr2[1];
                i11 = iE2;
            }
            if (i9 != i10 && (iE = e(i10, i13)) < i11) {
                i12 = iArr2[1];
                i11 = iE;
            }
        }
        if (i11 <= 3) {
            return new g(i12);
        }
        return null;
    }

    public static int e(int i9, int i10) {
        return Integer.bitCount(i9 ^ i10);
    }

    public byte c() {
        return this.f10117b;
    }

    public f d() {
        return this.f10116a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f10116a == gVar.f10116a && this.f10117b == gVar.f10117b;
    }

    public int hashCode() {
        return (this.f10116a.ordinal() << 3) | this.f10117b;
    }
}
