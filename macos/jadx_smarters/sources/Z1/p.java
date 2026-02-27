package Z1;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10898a;

    public p(l lVar) {
        this.f10898a = lVar;
    }

    public static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    @Override // Z1.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T1.c a(java.lang.String r3, int r4, int r5) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.String r0 = "/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L15
        L10:
            android.net.Uri r3 = c(r3)
            goto L21
        L15:
            android.net.Uri r0 = android.net.Uri.parse(r3)
            java.lang.String r1 = r0.getScheme()
            if (r1 != 0) goto L20
            goto L10
        L20:
            r3 = r0
        L21:
            Z1.l r0 = r2.f10898a
            T1.c r3 = r0.a(r3, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.p.a(java.lang.String, int, int):T1.c");
    }
}
