package d3;

import O2.C0897l1;
import java.io.EOFException;

/* JADX INFO: renamed from: d3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1675l {
    public static void a(boolean z9, String str) throws C0897l1 {
        if (!z9) {
            throw C0897l1.a(str, null);
        }
    }

    public static boolean b(InterfaceC1673j interfaceC1673j, byte[] bArr, int i9, int i10, boolean z9) throws EOFException {
        try {
            return interfaceC1673j.d(bArr, i9, i10, z9);
        } catch (EOFException e9) {
            if (z9) {
                return false;
            }
            throw e9;
        }
    }

    public static int c(InterfaceC1673j interfaceC1673j, byte[] bArr, int i9, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int iP = interfaceC1673j.p(bArr, i9 + i11, i10 - i11);
            if (iP == -1) {
                break;
            }
            i11 += iP;
        }
        return i11;
    }

    public static boolean d(InterfaceC1673j interfaceC1673j, byte[] bArr, int i9, int i10) {
        try {
            interfaceC1673j.m(bArr, i9, i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC1673j interfaceC1673j, int i9) {
        try {
            interfaceC1673j.q(i9);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
