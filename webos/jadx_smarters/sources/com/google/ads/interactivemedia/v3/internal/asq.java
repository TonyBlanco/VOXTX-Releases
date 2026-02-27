package com.google.ads.interactivemedia.v3.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class asq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final apo f20638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f20639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f20640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f20641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f20642e;

    public asq(apo apoVar, File file, File file2, File file3) {
        this.f20638a = apoVar;
        this.f20639b = file;
        this.f20640c = file3;
        this.f20641d = file2;
    }

    public final apo a() {
        return this.f20638a;
    }

    public final File b() {
        return this.f20640c;
    }

    public final File c() {
        return this.f20639b;
    }

    public final boolean d() {
        return this.f20638a.b() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] e() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrB;
        FileInputStream fileInputStream2 = null;
        if (this.f20642e == null) {
            try {
                fileInputStream = new FileInputStream(this.f20641d);
                try {
                    bArrB = bpb.w(fileInputStream).B();
                    C4.k.a(fileInputStream);
                } catch (IOException unused) {
                    C4.k.a(fileInputStream);
                    bArrB = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C4.k.a(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f20642e = bArrB;
        }
        byte[] bArr = this.f20642e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
