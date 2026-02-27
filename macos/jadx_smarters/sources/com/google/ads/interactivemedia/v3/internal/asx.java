package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import org.apache.http.protocol.HttpRequestExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final class asx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap f20662a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final asy f20664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aru f20665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final arl f20666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private asp f20667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f20668g = new Object();

    public asx(Context context, asy asyVar, aru aruVar, arl arlVar) {
        this.f20663b = context;
        this.f20664c = asyVar;
        this.f20665d = aruVar;
        this.f20666e = arlVar;
    }

    private static long d(long j9) {
        return System.currentTimeMillis() - j9;
    }

    private final synchronized Class e(asq asqVar) throws asw {
        try {
            String strK = asqVar.a().k();
            HashMap map = f20662a;
            Class cls = (Class) map.get(strK);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f20666e.a(asqVar.c())) {
                    throw new asw(2026, "VM did not pass signature verification");
                }
                try {
                    File fileB = asqVar.b();
                    if (!fileB.exists()) {
                        fileB.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(asqVar.c().getAbsolutePath(), fileB.getAbsolutePath(), null, this.f20663b.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strK, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e9) {
                    e = e9;
                    throw new asw(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    throw new asw(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (SecurityException e11) {
                    e = e11;
                    throw new asw(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            } catch (GeneralSecurityException e12) {
                throw new asw(2026, e12);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final arx a() {
        asp aspVar;
        synchronized (this.f20668g) {
            aspVar = this.f20667f;
        }
        return aspVar;
    }

    public final asq b() {
        synchronized (this.f20668g) {
            try {
                asp aspVar = this.f20667f;
                if (aspVar == null) {
                    return null;
                }
                return aspVar.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(asq asqVar) {
        int iA;
        Exception exc;
        aru aruVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                asp aspVar = new asp(e(asqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f20663b, "msa-r", asqVar.e(), null, new Bundle(), 2), asqVar, this.f20664c, this.f20665d);
                if (!aspVar.h()) {
                    throw new asw(4000, "init failed");
                }
                int iE = aspVar.e();
                if (iE != 0) {
                    throw new asw(4001, "ci: " + iE);
                }
                synchronized (this.f20668g) {
                    asp aspVar2 = this.f20667f;
                    if (aspVar2 != null) {
                        try {
                            aspVar2.g();
                        } catch (asw e9) {
                            this.f20665d.c(e9.a(), -1L, e9);
                        }
                        this.f20667f = aspVar;
                    } else {
                        this.f20667f = aspVar;
                    }
                }
                this.f20665d.d(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE, d(jCurrentTimeMillis));
                return true;
            } catch (Exception e10) {
                throw new asw(AdError.INTERNAL_ERROR_2004, e10);
            }
        } catch (asw e11) {
            aru aruVar2 = this.f20665d;
            iA = e11.a();
            aruVar = aruVar2;
            exc = e11;
            aruVar.c(iA, d(jCurrentTimeMillis), exc);
            return false;
        } catch (Exception e12) {
            iA = 4010;
            aruVar = this.f20665d;
            exc = e12;
            aruVar.c(iA, d(jCurrentTimeMillis), exc);
            return false;
        }
    }
}
