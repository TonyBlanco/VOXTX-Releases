package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dj extends ct implements cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dr f22720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dr f22721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private dc f22722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HttpURLConnection f22723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f22724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f22727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22728l;

    @Deprecated
    public dj() {
        this(null, 8000, 8000, null);
    }

    private dj(String str, int i9, int i10, dr drVar) {
        super(true);
        this.f22719c = str;
        this.f22717a = 8000;
        this.f22718b = 8000;
        this.f22720d = drVar;
        this.f22721e = new dr();
    }

    public /* synthetic */ dj(String str, int i9, int i10, dr drVar, byte[] bArr) {
        this(str, 8000, 8000, drVar);
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.f22723g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e9) {
                cd.c("DefaultHttpDataSource", "Unexpected error while disconnecting", e9);
            }
            this.f22723g = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: IOException -> 0x001f, TRY_LEAVE, TryCatch #0 {IOException -> 0x001f, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:12:0x0021, B:15:0x002c), top: B:19:0x0004 }] */
    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(byte[] r7, int r8, int r9) throws com.google.ads.interactivemedia.v3.internal.Cdo {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L35
        L4:
            long r0 = r6.f22727k     // Catch: java.io.IOException -> L1f
            r2 = -1
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L21
            long r2 = r6.f22728l     // Catch: java.io.IOException -> L1f
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
        L16:
            r7 = -1
            goto L35
        L18:
            long r2 = (long) r9     // Catch: java.io.IOException -> L1f
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.io.IOException -> L1f
            int r9 = (int) r0     // Catch: java.io.IOException -> L1f
            goto L21
        L1f:
            r7 = move-exception
            goto L36
        L21:
            java.io.InputStream r0 = r6.f22724h     // Catch: java.io.IOException -> L1f
            int r1 = com.google.ads.interactivemedia.v3.internal.cq.f22640a     // Catch: java.io.IOException -> L1f
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1f
            if (r7 != r4) goto L2c
            goto L16
        L2c:
            long r8 = r6.f22728l     // Catch: java.io.IOException -> L1f
            long r0 = (long) r7     // Catch: java.io.IOException -> L1f
            long r8 = r8 + r0
            r6.f22728l = r8     // Catch: java.io.IOException -> L1f
            r6.g(r7)     // Catch: java.io.IOException -> L1f
        L35:
            return r7
        L36:
            com.google.ads.interactivemedia.v3.internal.dc r8 = r6.f22722f
            int r9 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            r9 = 2
            com.google.ads.interactivemedia.v3.internal.do r7 = com.google.ads.interactivemedia.v3.internal.Cdo.a(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.dj.a(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    @Override // com.google.ads.interactivemedia.v3.internal.cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.google.ads.interactivemedia.v3.internal.dc r15) throws com.google.ads.interactivemedia.v3.internal.Cdo {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.dj.b(com.google.ads.interactivemedia.v3.internal.dc):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.f22723g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053 A[Catch: all -> 0x0032, Exception -> 0x006b, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0013, B:11:0x0017, B:17:0x0022, B:19:0x002a, B:27:0x003b, B:29:0x004b, B:31:0x0053, B:32:0x006b, B:35:0x0070, B:36:0x007a, B:8:0x0010), top: B:46:0x0002, inners: #2 }] */
    @Override // com.google.ads.interactivemedia.v3.internal.cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() throws com.google.ads.interactivemedia.v3.internal.Cdo {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f22724h     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L7b
            long r3 = r10.f22727k     // Catch: java.lang.Throwable -> L32
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L10
            r3 = r5
            goto L13
        L10:
            long r7 = r10.f22728l     // Catch: java.lang.Throwable -> L32
            long r3 = r3 - r7
        L13:
            java.net.HttpURLConnection r7 = r10.f22723g     // Catch: java.lang.Throwable -> L32
            if (r7 == 0) goto L6b
            int r8 = com.google.ads.interactivemedia.v3.internal.cq.f22640a     // Catch: java.lang.Throwable -> L32
            r9 = 19
            if (r8 < r9) goto L6b
            r9 = 20
            if (r8 <= r9) goto L22
            goto L6b
        L22:
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L34
            int r3 = r7.read()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            r4 = -1
            if (r3 == r4) goto L6b
            goto L3b
        L32:
            r2 = move-exception
            goto L8a
        L34:
            r5 = 2048(0x800, double:1.012E-320)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L6b
        L3b:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            if (r4 != 0) goto L53
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            if (r3 == 0) goto L6b
        L53:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            com.google.ads.interactivemedia.v3.internal.af.s(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            r3.invoke(r7, r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
        L6b:
            r2.close()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L6f
            goto L7b
        L6f:
            r2 = move-exception
            com.google.ads.interactivemedia.v3.internal.do r3 = new com.google.ads.interactivemedia.v3.internal.do     // Catch: java.lang.Throwable -> L32
            int r4 = com.google.ads.interactivemedia.v3.internal.cq.f22640a     // Catch: java.lang.Throwable -> L32
            r4 = 2000(0x7d0, float:2.803E-42)
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L32
            throw r3     // Catch: java.lang.Throwable -> L32
        L7b:
            r10.f22724h = r1
            r10.k()
            boolean r1 = r10.f22725i
            if (r1 == 0) goto L89
            r10.f22725i = r0
            r10.h()
        L89:
            return
        L8a:
            r10.f22724h = r1
            r10.k()
            boolean r1 = r10.f22725i
            if (r1 == 0) goto L98
            r10.f22725i = r0
            r10.h()
        L98:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.dj.d():void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ct, com.google.ads.interactivemedia.v3.internal.cy
    public final Map e() {
        HttpURLConnection httpURLConnection = this.f22723g;
        return httpURLConnection == null ? avs.d() : new di(httpURLConnection.getHeaderFields());
    }
}
