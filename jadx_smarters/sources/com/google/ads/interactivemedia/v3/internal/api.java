package com.google.ads.interactivemedia.v3.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class api {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final anw f20462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20464c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class[] f20466e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Method f20465d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f20467f = new CountDownLatch(1);

    public api(anw anwVar, String str, String str2, Class... clsArr) {
        this.f20462a = anwVar;
        this.f20463b = str;
        this.f20464c = str2;
        this.f20466e = clsArr;
        anwVar.j().submit(new aph(this));
    }

    public static /* bridge */ /* synthetic */ void b(api apiVar) {
        try {
            try {
                anw anwVar = apiVar.f20462a;
                Class<?> clsLoadClass = anwVar.h().loadClass(apiVar.c(anwVar.r(), apiVar.f20463b));
                if (clsLoadClass != null) {
                    apiVar.f20465d = clsLoadClass.getMethod(apiVar.c(apiVar.f20462a.r(), apiVar.f20464c), apiVar.f20466e);
                    Method method = apiVar.f20465d;
                }
            } finally {
                apiVar.f20467f.countDown();
            }
        } catch (ani | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        }
    }

    private final String c(byte[] bArr, String str) throws ani, UnsupportedEncodingException {
        return new String(this.f20462a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f20465d != null) {
            return this.f20465d;
        }
        try {
            if (this.f20467f.await(2L, TimeUnit.SECONDS)) {
                return this.f20465d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
