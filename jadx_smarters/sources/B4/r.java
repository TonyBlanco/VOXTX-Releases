package b4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static void a(InterfaceC1224o interfaceC1224o) {
        if (interfaceC1224o != null) {
            try {
                interfaceC1224o.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(InterfaceC1224o interfaceC1224o) {
        byte[] bArrCopyOf = new byte[1024];
        int i9 = 0;
        int i10 = 0;
        while (i9 != -1) {
            if (i10 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i9 = interfaceC1224o.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
            if (i9 != -1) {
                i10 += i9;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i10);
    }
}
