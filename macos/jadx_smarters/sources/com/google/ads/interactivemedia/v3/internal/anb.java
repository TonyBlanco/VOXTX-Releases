package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class anb extends amw {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static anx f20309A = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final Object f20310r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static boolean f20311s = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f20312w = "anb";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static long f20313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static anh f20314y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static aof f20315z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Map f20316B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f20317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final String f20318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    aod f20319v;

    public anb(Context context) {
        super(context);
        this.f20317t = false;
        this.f20316B = new HashMap();
        this.f20318u = "";
        this.f20317t = false;
    }

    public anb(Context context, String str, boolean z9) {
        super(context);
        this.f20317t = false;
        this.f20316B = new HashMap();
        this.f20318u = str;
        this.f20317t = z9;
    }

    private static final void j() {
        aof aofVar = f20315z;
        if (aofVar != null) {
            aofVar.h();
        }
    }

    private final synchronized void m(anw anwVar, agl aglVar) {
        MotionEvent motionEvent;
        try {
            try {
                anz anzVarU = u(anwVar, this.f20278b, this.f20293q);
                Long l9 = anzVarU.f20387a;
                if (l9 != null) {
                    aglVar.ax(l9.longValue());
                }
                Long l10 = anzVarU.f20388b;
                if (l10 != null) {
                    aglVar.ay(l10.longValue());
                }
                Long l11 = anzVarU.f20389c;
                if (l11 != null) {
                    aglVar.av(l11.longValue());
                }
                if (this.f20292p) {
                    Long l12 = anzVarU.f20390d;
                    if (l12 != null) {
                        aglVar.au(l12.longValue());
                    }
                    Long l13 = anzVarU.f20391e;
                    if (l13 != null) {
                        aglVar.ar(l13.longValue());
                    }
                }
            } catch (anp unused) {
            }
            agl aglVarW = aga.w();
            if (this.f20280d > 0 && aoa.h(this.f20293q)) {
                aglVarW.s(aoa.a(this.f20287k, this.f20293q));
                aglVarW.F(aoa.a(this.f20290n - this.f20288l, this.f20293q));
                aglVarW.G(aoa.a(this.f20291o - this.f20289m, this.f20293q));
                aglVarW.y(aoa.a(this.f20288l, this.f20293q));
                aglVarW.A(aoa.a(this.f20289m, this.f20293q));
                if (this.f20292p && (motionEvent = this.f20278b) != null) {
                    long jA = aoa.a(((this.f20288l - this.f20290n) + motionEvent.getRawX()) - this.f20278b.getX(), this.f20293q);
                    if (jA != 0) {
                        aglVarW.D(jA);
                    }
                    long jA2 = aoa.a(((this.f20289m - this.f20291o) + this.f20278b.getRawY()) - this.f20278b.getY(), this.f20293q);
                    if (jA2 != 0) {
                        aglVarW.E(jA2);
                    }
                }
            }
            try {
                anz anzVarB = b(this.f20278b);
                Long l14 = anzVarB.f20387a;
                if (l14 != null) {
                    aglVarW.z(l14.longValue());
                }
                Long l15 = anzVarB.f20388b;
                if (l15 != null) {
                    aglVarW.B(l15.longValue());
                }
                aglVarW.x(anzVarB.f20389c.longValue());
                if (this.f20292p) {
                    Long l16 = anzVarB.f20391e;
                    if (l16 != null) {
                        aglVarW.v(l16.longValue());
                    }
                    Long l17 = anzVarB.f20390d;
                    if (l17 != null) {
                        aglVarW.w(l17.longValue());
                    }
                    Long l18 = anzVarB.f20392f;
                    if (l18 != null) {
                        aglVarW.I(l18.longValue() != 0 ? agh.f19670b : agh.f19669a);
                    }
                    if (this.f20281e > 0) {
                        Long lValueOf = aoa.h(this.f20293q) ? Long.valueOf(Math.round(this.f20286j / this.f20281e)) : null;
                        if (lValueOf != null) {
                            aglVarW.q(lValueOf.longValue());
                        } else {
                            aglVarW.p();
                        }
                        aglVarW.r(Math.round(this.f20285i / this.f20281e));
                    }
                    Long l19 = anzVarB.f20395i;
                    if (l19 != null) {
                        aglVarW.t(l19.longValue());
                    }
                    Long l20 = anzVarB.f20396j;
                    if (l20 != null) {
                        aglVarW.C(l20.longValue());
                    }
                    Long l21 = anzVarB.f20397k;
                    if (l21 != null) {
                        aglVarW.H(l21.longValue() != 0 ? agh.f19670b : agh.f19669a);
                    }
                }
            } catch (anp unused2) {
            }
            long j9 = this.f20284h;
            if (j9 > 0) {
                aglVarW.u(j9);
            }
            aglVar.aB((aga) aglVarW.aY());
            long j10 = this.f20280d;
            if (j10 > 0) {
                aglVar.as(j10);
            }
            long j11 = this.f20281e;
            if (j11 > 0) {
                aglVar.at(j11);
            }
            long j12 = this.f20282f;
            if (j12 > 0) {
                aglVar.aw(j12);
            }
            long j13 = this.f20283g;
            if (j13 > 0) {
                aglVar.aq(j13);
            }
            try {
                int size = this.f20279c.size() - 1;
                if (size > 0) {
                    aglVar.K();
                    for (int i9 = 0; i9 < size; i9++) {
                        anz anzVarU2 = u(amw.f20277a, (MotionEvent) this.f20279c.get(i9), this.f20293q);
                        agl aglVarW2 = aga.w();
                        aglVarW2.z(anzVarU2.f20387a.longValue());
                        aglVarW2.B(anzVarU2.f20388b.longValue());
                        aglVar.J((aga) aglVarW2.aY());
                    }
                }
            } catch (anp unused3) {
                aglVar.K();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static anw t(Context context, boolean z9) {
        if (amw.f20277a == null) {
            synchronized (f20310r) {
                try {
                    if (amw.f20277a == null) {
                        anw anwVarT = anw.t(context, z9);
                        if (anwVarT.p()) {
                            try {
                                if (((Boolean) aqo.f20544s.f()).booleanValue()) {
                                    anwVarT.u("JUzcgAa7QiZMDmYjeHwtF22qOBbojTFP/5L28xsdeCx9uYvsAo6FDNhapuA6bStH", "U55JZyt+fru+djXeCzNGPL143KELIHwp5RNEO07WiP4=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            anwVarT.u("dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", Context.class);
                            anwVarT.u("ATj3hbklxV/XiswqkLJ9VlaAJFBsAV/1VJ4eSTnw1AP/96KhgekAXYnIpmljK7wO", "rfBYaobM06JIPnbukgoyOwsb7bCc9rvkUNfR4KOQWHU=", Context.class);
                            anwVarT.u("S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", Context.class);
                            anwVarT.u("YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", Context.class);
                            anwVarT.u("qfI1DhKUvYvonhmDhl2HtQbINO0xIIYvKgMRQgz52nQi898Sh8QDGcMkGv/U7x7x", "dGQnAya6a12xEk9RZqxizYv1KQcB0awlyegaC3HNbmw=", Context.class);
                            Class cls = Boolean.TYPE;
                            anwVarT.u("Gdhi15k7cHPLVK8ak2AW2U8wWjJccRmTSeAAE7zSYYmR363nmijtloZo3WMMU3lH", "BmCZi3wg7cX26+HP9p5KWWgFeCy6CBwpe84PbqLu08A=", Context.class, cls);
                            anwVarT.u("n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", Context.class);
                            anwVarT.u("9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", Context.class);
                            anwVarT.u("Kjj/NWt5Xw530zWkhsqzO18XZPoLer8GCJYwlVW4Z2TDaLFXmLCWh2yD69kBis5q", "fBdzdgD1bofuaKTW6LUcH7mpQ3p8BVkg+3EYXR2IWu4=", MotionEvent.class, DisplayMetrics.class);
                            anwVarT.u("2VR7L/2srPLBbh3OPlGeS8Ru8uYXtYmourWjxCdZl0ZvDKChHNCuDLRy98nk4nFB", "ZDqFJ0I5g5uVDR0fSRJqwb59d8cP3p3/RbyvkYRlQc0=", MotionEvent.class, DisplayMetrics.class);
                            anwVarT.u("THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", new Class[0]);
                            anwVarT.u("EggzVxU0lX/1UlHAeEGUyUm45SOmio09y9T4hm0PM9xyGW0Fa8XV6zB35QkAF1yq", "13swnHoz78V4UQSpBM2KHvpNNnXpuWx8GAjTYu5TVQw=", new Class[0]);
                            anwVarT.u("azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", new Class[0]);
                            anwVarT.u("9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", new Class[0]);
                            anwVarT.u("BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", new Class[0]);
                            anwVarT.u("/nq0lRxQcGC1ASnfdnp1tRqKCtSvrxgzieToDPBUonPm4tHJx/5+TsZqcFW/70Mo", "myj1nOfIy7SmCD8TPLBSkg5Eqhpr16G4wLW5wXHtMTM=", new Class[0]);
                            anwVarT.u("JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", Context.class, cls, String.class);
                            anwVarT.u("5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", StackTraceElement[].class);
                            anwVarT.u("JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", View.class, DisplayMetrics.class, cls, cls);
                            anwVarT.u("UdRLZDfL4bVVU0VX3qg8hi1McU3FMuLhNf0tRNLophcguwloVZffIAQP6VRf+/uk", "yXOhM6UEm+Qz/JUey2l1+qI404D+W2SeSSnUBSRl6qI=", Context.class, cls);
                            anwVarT.u("rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", View.class, Activity.class, cls);
                            anwVarT.u("yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B", "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY=", Long.TYPE);
                            anwVarT.u("wPLuRKbAvZPAiJqPYNBqgvUCesMc3+VTtpgM018gMz5F9Lz38uNUBeCfwu8TSv2X", "+DZ4rAqlxoGmt/vl5o0tqi0yaHBF48hUHJNY3yJnYpc=", new Class[0]);
                            try {
                                if (((Boolean) aqo.f20548w.f()).booleanValue()) {
                                    anwVarT.u("q25n2/TPNEnWjiB7Eq/br1pf7I1+Pbd8JO4E5S/WFXDtJZ2FMIzDcDIeNK1YwkMp", "JTvnHx65Egq/4novhqSS3bMw+oihCNz02Yz4pG4S+kE=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            anwVarT.u("DZ4YQMGjiiG80De3h2RdExLJLCk1HXfUitSGB3xdLKjSzFe5jaVRnSWLaDfXmTZ6", "rN4de9ttzTEp3+iQIPyTFLSG8iLr2YuUXdQWnliGMSg=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) aqo.f20549x.f()).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        anwVarT.u("uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            if (((Boolean) aqo.f20541p.f()).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                anwVarT.u("DEi5JrQn0pxSuKS2Ij/fpEA7I+0FPLXDsBWBfvVwt/zwZUJJ4fnydbsyET2LCYMF", "Jj1vyuWfy0iUak+iXdGffQYzyyVnoa3nOmSynhrPgns=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) aqo.f20540o.f()).booleanValue()) {
                                        anwVarT.u("FdWssDbNTznwvaSwEiy9othUceULqhXS0NiSaXeIdQIZaN4heVunXmsWFB1bgBsj", "TzSf4nrBofZD4sG4/0KqSG9VhwNKl95AgxoEIclkVIM=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused4) {
                                }
                            }
                        }
                        amw.f20277a = anwVarT;
                    }
                } finally {
                }
            }
        }
        return amw.f20277a;
    }

    public static anz u(anw anwVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws anp {
        Method methodI = anwVar.i("Kjj/NWt5Xw530zWkhsqzO18XZPoLer8GCJYwlVW4Z2TDaLFXmLCWh2yD69kBis5q", "fBdzdgD1bofuaKTW6LUcH7mpQ3p8BVkg+3EYXR2IWu4=");
        if (methodI == null || motionEvent == null) {
            throw new anp();
        }
        try {
            return new anz((String) methodI.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new anp(e9);
        }
    }

    public static synchronized void v(Context context, boolean z9) {
        try {
            if (f20311s) {
                return;
            }
            f20313x = System.currentTimeMillis() / 1000;
            amw.f20277a = t(context, z9);
            if (((Boolean) aqo.f20549x.f()).booleanValue()) {
                f20314y = anh.c(context);
            }
            ExecutorService executorServiceJ = amw.f20277a.j();
            if (((Boolean) aqo.f20550y.f()).booleanValue() && executorServiceJ != null) {
                f20315z = aof.d(context, executorServiceJ);
            }
            if (((Boolean) aqo.f20541p.f()).booleanValue()) {
                f20309A = new anx();
            }
            f20311s = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final void w(List list) {
        ExecutorService executorServiceJ;
        if (amw.f20277a == null || (executorServiceJ = amw.f20277a.j()) == null || list.isEmpty()) {
            return;
        }
        try {
            executorServiceJ.invokeAll(list, ((Long) aqo.f20536k.f()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            Log.d(f20312w, String.format("class methods got exception: %s", aoa.e(e9)));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amw
    public final long a(StackTraceElement[] stackTraceElementArr) throws anp {
        Method methodI = amw.f20277a.i("5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=");
        if (methodI == null || stackTraceElementArr == null) {
            throw new anp();
        }
        try {
            return new anq((String) methodI.invoke(null, stackTraceElementArr)).f20343a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new anp(e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amw
    public final anz b(MotionEvent motionEvent) throws anp {
        Method methodI = amw.f20277a.i("2VR7L/2srPLBbh3OPlGeS8Ru8uYXtYmourWjxCdZl0ZvDKChHNCuDLRy98nk4nFB", "ZDqFJ0I5g5uVDR0fSRJqwb59d8cP3p3/RbyvkYRlQc0=");
        if (methodI == null || motionEvent == null) {
            throw new anp();
        }
        try {
            return new anz((String) methodI.invoke(null, motionEvent, this.f20293q));
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new anp(e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amw
    public agl c(Context context, View view, Activity activity) {
        j();
        if (((Boolean) aqo.f20541p.f()).booleanValue()) {
            f20309A.i();
        }
        agl aglVarAs = agc.as();
        if (!TextUtils.isEmpty(this.f20318u)) {
            aglVarAs.Q(this.f20318u);
        }
        x(t(context, this.f20317t), aglVarAs, view, activity, true, context);
        return aglVarAs;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amw
    public final agl d(Context context, afm afmVar) {
        j();
        if (((Boolean) aqo.f20541p.f()).booleanValue()) {
            f20309A.j();
        }
        agl aglVarAs = agc.as();
        if (!TextUtils.isEmpty(this.f20318u)) {
            aglVarAs.Q(this.f20318u);
        }
        r(t(context, this.f20317t), context, aglVarAs, afmVar);
        if (afmVar != null && afmVar.f() && ((Boolean) aqo.f20542q.f()).booleanValue() && !aoa.g(afmVar.d().d())) {
            agl aglVarC = agk.c();
            aglVarC.d(afmVar.d().d());
            aglVarAs.an((agk) aglVarC.aY());
        }
        return aglVarAs;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amw
    public agl i(Context context, View view, Activity activity) {
        j();
        if (((Boolean) aqo.f20541p.f()).booleanValue()) {
            f20309A.k(context, view);
        }
        agl aglVarAs = agc.as();
        aglVarAs.Q(this.f20318u);
        x(t(context, this.f20317t), aglVarAs, view, activity, false, context);
        return aglVarAs;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amw, com.google.ads.interactivemedia.v3.internal.amv
    public final void n(View view) {
        if (((Boolean) aqo.f20539n.f()).booleanValue()) {
            if (this.f20319v == null) {
                anw anwVar = amw.f20277a;
                this.f20319v = new aod(anwVar.f20361a, anwVar.f());
            }
            this.f20319v.d(view);
        }
    }

    public List p(anw anwVar, Context context, agl aglVar, afm afmVar) {
        long jC;
        long jB;
        int iA = anwVar.a();
        ArrayList arrayList = new ArrayList();
        if (!anwVar.p()) {
            aglVar.am(afx.a(afx.f19547w));
            return arrayList;
        }
        arrayList.add(new aok(anwVar, aglVar, iA, context, afmVar, null, null, null));
        arrayList.add(new aon(anwVar, aglVar, f20313x, iA, null, null, null));
        arrayList.add(new aow(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new aoz(anwVar, aglVar, iA, context, null, null, null));
        arrayList.add(new ape(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new aoj(anwVar, aglVar, iA, context, null, null, null));
        arrayList.add(new aol(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new aov(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new aox(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new aom(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new aos(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new apf(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new aoi(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new apc(anwVar, aglVar, iA, null, null, null));
        arrayList.add(new apa(anwVar, aglVar, iA, null, null, null));
        if (Build.VERSION.SDK_INT >= 24 && ((Boolean) aqo.f20549x.f()).booleanValue()) {
            aof aofVar = f20315z;
            if (aofVar != null) {
                jC = aofVar.c();
                jB = f20315z.b();
            } else {
                jC = -1;
                jB = -1;
            }
            arrayList.add(new aou(anwVar, aglVar, iA, f20314y, jC, jB, null, null, null));
        }
        if (((Boolean) aqo.f20548w.f()).booleanValue()) {
            arrayList.add(new aoy(anwVar, aglVar, iA, null, null, null));
        }
        arrayList.add(new aot(anwVar, aglVar, iA, null, null, null));
        if (((Boolean) aqo.f20524A.f()).booleanValue()) {
            arrayList.add(new aoh(anwVar, aglVar, iA, null, null, null));
        }
        return arrayList;
    }

    public void r(anw anwVar, Context context, agl aglVar, afm afmVar) {
        if (anwVar.j() == null) {
            return;
        }
        w(p(anwVar, context, aglVar, afmVar));
    }

    public final void x(anw anwVar, agl aglVar, View view, Activity activity, boolean z9, Context context) {
        List arrayList;
        Callable aoqVar;
        if (anwVar.p()) {
            m(anwVar, aglVar);
            arrayList = new ArrayList();
            if (anwVar.j() != null) {
                int iA = anwVar.a();
                arrayList.add(new aop(anwVar, aglVar, null, null, null));
                arrayList.add(new aow(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new aon(anwVar, aglVar, f20313x, iA, null, null, null));
                arrayList.add(new aom(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new aov(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new aox(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new aos(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new aol(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new apf(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new aoi(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new apc(anwVar, aglVar, iA, null, null, null));
                arrayList.add(new apb(anwVar, aglVar, iA, new Throwable().getStackTrace(), null, null, null));
                arrayList.add(new apg(anwVar, aglVar, iA, view, null, null, null));
                arrayList.add(new apa(anwVar, aglVar, iA, null, null, null));
                if (((Boolean) aqo.f20537l.f()).booleanValue()) {
                    arrayList.add(new aog(anwVar, aglVar, iA, view, activity, null, null, null));
                }
                if (((Boolean) aqo.f20524A.f()).booleanValue()) {
                    arrayList.add(new aoh(anwVar, aglVar, iA, null, null, null));
                }
                if (!z9) {
                    try {
                        if (((Boolean) aqo.f20540o.f()).booleanValue()) {
                            arrayList.add(new aor(anwVar, aglVar, iA, this.f20316B, view, context, null, null, null));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) aqo.f20541p.f()).booleanValue()) {
                            aoqVar = new aoq(anwVar, aglVar, iA, f20309A, null, null, null);
                            arrayList.add(aoqVar);
                        }
                    } catch (IllegalStateException unused2) {
                    }
                } else if (((Boolean) aqo.f20539n.f()).booleanValue()) {
                    aoqVar = new apd(anwVar, aglVar, iA, this.f20319v, null, null, null);
                    arrayList.add(aoqVar);
                }
            }
        } else {
            aglVar.am(afx.a(afx.f19547w));
            arrayList = Arrays.asList(new aop(anwVar, aglVar, null, null, null));
        }
        w(arrayList);
    }
}
