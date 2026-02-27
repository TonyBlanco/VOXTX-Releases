package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class asp implements arx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final asq f20635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final asy f20636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aru f20637d;

    public asp(Object obj, asq asqVar, asy asyVar, aru aruVar) {
        this.f20634a = obj;
        this.f20635b = asqVar;
        this.f20636c = asyVar;
        this.f20637d = aruVar;
    }

    private static long i(long j9) {
        return System.currentTimeMillis() - j9;
    }

    private static String j(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        agl aglVarA = agm.a();
        aglVarA.c(agg.f19666e);
        aglVarA.a(bpb.t(bArr));
        return Base64.encodeToString(((agm) aglVarA.aY()).av(), 11);
    }

    private final synchronized byte[] k(Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e9) {
            this.f20637d.c(2007, i(jCurrentTimeMillis), e9);
            return null;
        }
        return (byte[]) this.f20634a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f20634a, null, map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.arx
    public final synchronized String a(Context context, String str, View view, Activity activity) {
        Map mapA;
        mapA = this.f20636c.a();
        mapA.put("f", "c");
        mapA.put("ctx", context);
        mapA.put("cs", str);
        mapA.put("aid", null);
        mapA.put("view", view);
        mapA.put("act", activity);
        return j(k(mapA));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.arx
    public final synchronized String b(Context context, View view, Activity activity) {
        Map mapC;
        mapC = this.f20636c.c();
        mapC.put("f", "v");
        mapC.put("ctx", context);
        mapC.put("aid", null);
        mapC.put("view", view);
        mapC.put("act", activity);
        return j(k(mapC));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.arx
    public final synchronized String c(Context context) {
        Map mapB;
        mapB = this.f20636c.b();
        mapB.put("f", "q");
        mapB.put("ctx", context);
        mapB.put("aid", null);
        return j(k(mapB));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.arx
    public final synchronized void d(MotionEvent motionEvent) throws asw {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f20634a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f20634a, map);
            this.f20637d.d(3003, i(jCurrentTimeMillis));
        } catch (Exception e9) {
            throw new asw(2005, e9);
        }
    }

    public final synchronized int e() throws asw {
        try {
        } catch (Exception e9) {
            throw new asw(AdError.INTERNAL_ERROR_2006, e9);
        }
        return ((Integer) this.f20634a.getClass().getDeclaredMethod("lcs", null).invoke(this.f20634a, null)).intValue();
    }

    public final asq f() {
        return this.f20635b;
    }

    public final synchronized void g() throws asw {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f20634a.getClass().getDeclaredMethod("close", null).invoke(this.f20634a, null);
            this.f20637d.d(AdError.MEDIATION_ERROR_CODE, i(jCurrentTimeMillis));
        } catch (Exception e9) {
            throw new asw(AdError.INTERNAL_ERROR_2003, e9);
        }
    }

    public final synchronized boolean h() throws asw {
        try {
        } catch (Exception e9) {
            throw new asw(AdError.INTERNAL_ERROR_CODE, e9);
        }
        return ((Boolean) this.f20634a.getClass().getDeclaredMethod("init", null).invoke(this.f20634a, null)).booleanValue();
    }
}
