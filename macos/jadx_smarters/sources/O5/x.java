package O5;

import Q5.B;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class x implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f6681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6683c;

    public x(String str, String str2, File file) {
        this.f6682b = str;
        this.f6683c = str2;
        this.f6681a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] c() {
        /*
            r7 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.InputStream r2 = r7.f()     // Catch: java.io.IOException -> L60
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L21
            r3.<init>()     // Catch: java.lang.Throwable -> L21
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L23
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L25
            r4.close()     // Catch: java.lang.Throwable -> L23
            r3.close()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L20
            r2.close()     // Catch: java.io.IOException -> L60
        L20:
            return r1
        L21:
            r0 = move-exception
            goto L55
        L23:
            r0 = move-exception
            goto L4c
        L25:
            int r5 = r2.read(r0)     // Catch: java.lang.Throwable -> L30
            if (r5 <= 0) goto L32
            r6 = 0
            r4.write(r0, r6, r5)     // Catch: java.lang.Throwable -> L30
            goto L25
        L30:
            r0 = move-exception
            goto L43
        L32:
            r4.finish()     // Catch: java.lang.Throwable -> L30
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L30
            r4.close()     // Catch: java.lang.Throwable -> L23
            r3.close()     // Catch: java.lang.Throwable -> L21
            r2.close()     // Catch: java.io.IOException -> L60
            return r0
        L43:
            r4.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L23
        L4b:
            throw r0     // Catch: java.lang.Throwable -> L23
        L4c:
            r3.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L21
        L54:
            throw r0     // Catch: java.lang.Throwable -> L21
        L55:
            if (r2 == 0) goto L5f
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.io.IOException -> L60
        L5f:
            throw r0     // Catch: java.io.IOException -> L60
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.x.c():byte[]");
    }

    @Override // O5.B
    public B.d.b a() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return B.d.b.a().b(bArrC).c(this.f6682b).a();
        }
        return null;
    }

    @Override // O5.B
    public String b() {
        return this.f6683c;
    }

    @Override // O5.B
    public InputStream f() {
        if (this.f6681a.exists() && this.f6681a.isFile()) {
            try {
                return new FileInputStream(this.f6681a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
