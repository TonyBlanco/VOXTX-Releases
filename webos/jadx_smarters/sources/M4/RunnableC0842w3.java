package M4;

import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: M4.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0842w3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f5112a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0848x3 f5114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0764j2 f5115e;

    public RunnableC0842w3(C0848x3 c0848x3, String str, URL url, byte[] bArr, Map map, C0764j2 c0764j2) {
        this.f5114d = c0848x3;
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.m(url);
        com.google.android.gms.common.internal.r.m(c0764j2);
        this.f5112a = url;
        this.f5115e = c0764j2;
        this.f5113c = str;
    }

    public final /* synthetic */ void a(int i9, Exception exc, byte[] bArr, Map map) {
        C0764j2 c0764j2 = this.f5115e;
        c0764j2.f4756a.h(this.f5113c, i9, exc, bArr, map);
    }

    public final void b(final int i9, final Exception exc, final byte[] bArr, final Map map) {
        this.f5114d.f4245a.f().z(new Runnable() { // from class: M4.v3
            @Override // java.lang.Runnable
            public final void run() {
                this.f5095a.a(i9, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [M4.w3] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r9 = this;
            M4.x3 r0 = r9.f5114d
            r0.g()
            r0 = 0
            r1 = 0
            M4.x3 r2 = r9.f5114d     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.net.URL r3 = r9.f5112a     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            if (r4 == 0) goto L84
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            M4.l2 r4 = r2.f4245a     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r4.z()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            M4.l2 r2 = r2.f4245a     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2.z()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7b
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L54
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L54
            if (r8 <= 0) goto L56
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L54
            goto L4a
        L54:
            r0 = move-exception
            goto L6a
        L56:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L54
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
            r3.disconnect()
            r9.b(r2, r1, r0, r4)
            return
        L64:
            r0 = move-exception
            goto L8f
        L66:
            r0 = move-exception
            goto L9b
        L68:
            r0 = move-exception
            r6 = r1
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66
        L70:
            r0 = move-exception
            r4 = r1
            goto L8f
        L73:
            r0 = move-exception
            r4 = r1
            goto L9b
        L76:
            r2 = move-exception
            r4 = r1
        L78:
            r0 = r2
            r2 = 0
            goto L8f
        L7b:
            r2 = move-exception
            r4 = r1
        L7d:
            r0 = r2
            r2 = 0
            goto L9b
        L80:
            r2 = move-exception
            goto L8c
        L82:
            r2 = move-exception
            goto L98
        L84:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            throw r2     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
        L8c:
            r3 = r1
            r4 = r3
            goto L78
        L8f:
            if (r3 == 0) goto L94
            r3.disconnect()
        L94:
            r9.b(r2, r1, r1, r4)
            throw r0
        L98:
            r3 = r1
            r4 = r3
            goto L7d
        L9b:
            if (r3 == 0) goto La0
            r3.disconnect()
        La0:
            r9.b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.RunnableC0842w3.run():void");
    }
}
