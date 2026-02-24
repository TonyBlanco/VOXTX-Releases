package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wt implements wq, dw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final avo f24994a = avo.r(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final avo f24995b = avo.r(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final avo f24996c = avo.r(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final avo f24997d = avo.r(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final avo f24998e = avo.r(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final avo f24999f = avo.r(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static wt f25000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final avs f25001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final wo f25002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final xi f25003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bn f25004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f25005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f25007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f25008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f25009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f25010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f25011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f25012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f25013t;

    @Deprecated
    public wt() {
        avs.d();
        bn bnVar = bn.f21741a;
        throw null;
    }

    public /* synthetic */ wt(Context context, Map map, int i9, bn bnVar, boolean z9) {
        this.f25001h = avs.c(map);
        this.f25002i = new wo();
        this.f25003j = new xi(AdError.SERVER_ERROR_CODE);
        this.f25004k = bnVar;
        this.f25005l = true;
        if (context == null) {
            this.f25009p = 0;
            this.f25012s = l(0);
            return;
        }
        ch chVarB = ch.b(context);
        int iA = chVarB.a();
        this.f25009p = iA;
        this.f25012s = l(iA);
        chVarB.d(new xv(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized wt i(Context context) {
        try {
            if (f25000g == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int[] iArrP = p(cq.M(context));
                HashMap map = new HashMap(8);
                map.put(0, 1000000L);
                avo avoVar = f24994a;
                map.put(2, (Long) avoVar.get(iArrP[0]));
                map.put(3, (Long) f24995b.get(iArrP[1]));
                map.put(4, (Long) f24996c.get(iArrP[2]));
                map.put(5, (Long) f24997d.get(iArrP[3]));
                map.put(10, (Long) f24998e.get(iArrP[4]));
                map.put(9, (Long) f24999f.get(iArrP[5]));
                map.put(7, (Long) avoVar.get(iArrP[0]));
                f25000g = ws.a(applicationContext, map, AdError.SERVER_ERROR_CODE, bn.f21741a, true);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25000g;
    }

    private final long l(int i9) {
        Long l9 = (Long) this.f25001h.get(Integer.valueOf(i9));
        if (l9 == null) {
            l9 = (Long) this.f25001h.get(0);
        }
        if (l9 == null) {
            l9 = 1000000L;
        }
        return l9.longValue();
    }

    private final void m(int i9, long j9, long j10) {
        int i10;
        long j11;
        if (i9 == 0) {
            if (j9 != 0) {
                j11 = j9;
            } else if (j10 == this.f25013t) {
                return;
            } else {
                j11 = 0;
            }
            i10 = 0;
        } else {
            i10 = i9;
            j11 = j9;
        }
        this.f25013t = j10;
        this.f25002i.b(i10, j11, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void n(int i9) {
        int i10 = this.f25009p;
        if (i10 == 0 || this.f25005l) {
            if (i10 == i9) {
                return;
            }
            this.f25009p = i9;
            if (i9 != 1 && i9 != 0 && i9 != 8) {
                this.f25012s = l(i9);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                m(this.f25006m > 0 ? (int) (jElapsedRealtime - this.f25007n) : 0, this.f25008o, this.f25012s);
                this.f25007n = jElapsedRealtime;
                this.f25008o = 0L;
                this.f25011r = 0L;
                this.f25010q = 0L;
                this.f25003j.b();
            }
        }
    }

    private static boolean o(dc dcVar, boolean z9) {
        return z9 && !dcVar.d(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0136, code lost:
    
        if (r3.equals("VU") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x014e, code lost:
    
        if (r3.equals("VI") != false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0166, code lost:
    
        if (r3.equals("VE") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0170, code lost:
    
        if (r3.equals("VC") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x017a, code lost:
    
        if (r3.equals("VA") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0192, code lost:
    
        if (r3.equals("UY") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01aa, code lost:
    
        if (r3.equals("UG") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01b4, code lost:
    
        if (r3.equals("UA") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01cc, code lost:
    
        if (r3.equals("TW") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d6, code lost:
    
        if (r3.equals("TV") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01fc, code lost:
    
        if (r3.equals("TO") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0206, code lost:
    
        if (r3.equals("TN") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0210, code lost:
    
        if (r3.equals("TM") != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x021a, code lost:
    
        if (r3.equals("TL") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0232, code lost:
    
        if (r3.equals("TJ") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x024a, code lost:
    
        if (r3.equals("TG") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0254, code lost:
    
        if (r3.equals("TD") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x025e, code lost:
    
        if (r3.equals("TC") != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0275, code lost:
    
        if (r3.equals("SY") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x027f, code lost:
    
        if (r3.equals("SX") != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0286, code lost:
    
        return new int[]{1, 2, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x028d, code lost:
    
        if (r3.equals("SV") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02c1, code lost:
    
        if (r3.equals("SO") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02d9, code lost:
    
        if (r3.equals("SM") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02e3, code lost:
    
        if (r3.equals("SL") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02ea, code lost:
    
        return new int[]{3, 3, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02f1, code lost:
    
        if (r3.equals("SK") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02fb, code lost:
    
        if (r3.equals("SI") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0305, code lost:
    
        if (r3.equals("SH") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x031d, code lost:
    
        if (r3.equals("SE") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0327, code lost:
    
        if (r3.equals("SD") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0331, code lost:
    
        if (r3.equals("SC") != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0338, code lost:
    
        return new int[]{4, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0377, code lost:
    
        if (r3.equals("RS") != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x038f, code lost:
    
        if (r3.equals("RE") != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x03b5, code lost:
    
        if (r3.equals("PT") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03db, code lost:
    
        if (r3.equals("PM") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        if (r3.equals("CI") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03e5, code lost:
    
        if (r3.equals("PL") != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x03ee, code lost:
    
        if (r3.equals("PK") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0406, code lost:
    
        if (r3.equals("PG") != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0410, code lost:
    
        if (r3.equals("PF") != false) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x041a, code lost:
    
        if (r3.equals("PE") != false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0424, code lost:
    
        if (r3.equals("PA") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x043b, code lost:
    
        if (r3.equals("NZ") != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0442, code lost:
    
        return new int[]{1, 1, 2, 2, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0449, code lost:
    
        if (r3.equals("NU") != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0452, code lost:
    
        if (r3.equals("NR") != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0459, code lost:
    
        return new int[]{4, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x046e, code lost:
    
        if (r3.equals("NO") != false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0486, code lost:
    
        if (r3.equals("NI") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x048d, code lost:
    
        return new int[]{2, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x04a2, code lost:
    
        if (r3.equals("NE") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04ba, code lost:
    
        if (r3.equals("NA") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r3.equals("CG") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0518, code lost:
    
        if (r3.equals("MT") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0522, code lost:
    
        if (r3.equals("MS") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x052c, code lost:
    
        if (r3.equals("MR") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0533, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        if (r3.equals("CF") != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x053a, code lost:
    
        if (r3.equals("MQ") != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0544, code lost:
    
        if (r3.equals("MP") != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x054d, code lost:
    
        if (r3.equals("MO") != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0554, code lost:
    
        return new int[]{0, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0577, code lost:
    
        if (r3.equals("ML") != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x057e, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0593, code lost:
    
        if (r3.equals("MH") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x059d, code lost:
    
        if (r3.equals("MG") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x05a7, code lost:
    
        if (r3.equals("MF") != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x05ae, code lost:
    
        return new int[]{1, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x05c3, code lost:
    
        if (r3.equals("MD") != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x05ca, code lost:
    
        return new int[]{1, 0, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x05ed, code lost:
    
        if (r3.equals("LY") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x05f7, code lost:
    
        if (r3.equals("LV") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007e, code lost:
    
        if (r3.equals("BN") != false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x062b, code lost:
    
        if (r3.equals("LR") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0643, code lost:
    
        if (r3.equals("LI") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x064d, code lost:
    
        if (r3.equals("LC") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0681, code lost:
    
        if (r3.equals("KY") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x068b, code lost:
    
        if (r3.equals("KW") != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (r3.equals("BM") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x06a3, code lost:
    
        if (r3.equals("KP") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x06ad, code lost:
    
        if (r3.equals("KN") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06b7, code lost:
    
        if (r3.equals("KM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x06c1, code lost:
    
        if (r3.equals("KI") != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x06c8, code lost:
    
        return new int[]{4, 2, 4, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x06dd, code lost:
    
        if (r3.equals("KG") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x06e4, code lost:
    
        return new int[]{2, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x06eb, code lost:
    
        if (r3.equals("KE") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0092, code lost:
    
        if (r3.equals("BL") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x071f, code lost:
    
        if (r3.equals("JE") != false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0726, code lost:
    
        return new int[]{4, 2, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x073b, code lost:
    
        if (r3.equals("IS") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0761, code lost:
    
        if (r3.equals("IO") != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0768, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x077d, code lost:
    
        if (r3.equals("IM") != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0784, code lost:
    
        return new int[]{0, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x078b, code lost:
    
        if (r3.equals("IL") != false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0795, code lost:
    
        if (r3.equals("IE") != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x07bb, code lost:
    
        if (r3.equals("HT") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x07c5, code lost:
    
        if (r3.equals("HR") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x07ea, code lost:
    
        if (r3.equals("GW") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x07f4, code lost:
    
        if (r3.equals("GU") != false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x07fb, code lost:
    
        return new int[]{1, 2, 4, 4, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0810, code lost:
    
        if (r3.equals("GR") != false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0817, code lost:
    
        return new int[]{1, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x082c, code lost:
    
        if (r3.equals("GP") != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0833, code lost:
    
        return new int[]{2, 1, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0848, code lost:
    
        if (r3.equals("GM") != false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0852, code lost:
    
        if (r3.equals("GL") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x085c, code lost:
    
        if (r3.equals("GI") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0866, code lost:
    
        if (r3.equals("GH") != false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x086d, code lost:
    
        return new int[]{3, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0874, code lost:
    
        if (r3.equals("GG") != false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x087b, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0882, code lost:
    
        if (r3.equals("GF") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x089a, code lost:
    
        if (r3.equals("GD") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08b2, code lost:
    
        if (r3.equals("GA") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08b9, code lost:
    
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x08ce, code lost:
    
        if (r3.equals("FO") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x08e6, code lost:
    
        if (r3.equals("FK") != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x08ed, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
    
        if (r3.equals("AR") != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x091e, code lost:
    
        if (r3.equals("ES") != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0925, code lost:
    
        return new int[]{0, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x092c, code lost:
    
        if (r3.equals("ER") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0933, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x093a, code lost:
    
        if (r3.equals("EG") != false) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0941, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0948, code lost:
    
        if (r3.equals("EE") != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x094f, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d0, code lost:
    
        if (r3.equals("AQ") != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0964, code lost:
    
        if (r3.equals("DZ") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x096b, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0980, code lost:
    
        if (r3.equals("DM") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0998, code lost:
    
        if (r3.equals("DJ") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x09af, code lost:
    
        if (r3.equals("CZ") != false) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x09b6, code lost:
    
        return new int[]{0, 0, 2, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x09bd, code lost:
    
        if (r3.equals("CY") != false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x09c4, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
    
        if (r3.equals("ZW") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x09cb, code lost:
    
        if (r3.equals("CX") != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x09d2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x09d9, code lost:
    
        if (r3.equals("CW") != false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x09e0, code lost:
    
        return new int[]{2, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x09f5, code lost:
    
        if (r3.equals("CU") != false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x09fc, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x0a3b, code lost:
    
        if (r3.equals("CL") != false) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x0a42, code lost:
    
        return new int[]{1, 2, 2, 2, 3, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a49, code lost:
    
        if (r3.equals("CK") != false) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0a50, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x0a81, code lost:
    
        if (r3.equals("BQ") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0a99, code lost:
    
        if (r3.equals("BI") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0aa0, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0ab5, code lost:
    
        if (r3.equals("BG") != false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0abc, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0aed, code lost:
    
        if (r3.equals("AZ") != false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0af4, code lost:
    
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0b25, code lost:
    
        if (r3.equals("AF") != false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0b2c, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0b41, code lost:
    
        if (r3.equals("AD") != false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0b48, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
    
        if (r3.equals("YT") != false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b87, code lost:
    
        if (r3.equals("BB") != false) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0b8e, code lost:
    
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0ba3, code lost:
    
        if (r3.equals("AX") != false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0baa, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010a, code lost:
    
        if (r3.equals("YE") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x0bcd, code lost:
    
        if (r3.equals("AL") != false) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x0bd4, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0114, code lost:
    
        if (r3.equals("XK") != false) goto L888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012c, code lost:
    
        if (r3.equals("WF") != false) goto L562;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] p(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 6360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.wt.p(java.lang.String):int[]");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dw
    public final synchronized void a(dc dcVar, boolean z9, int i9) {
        if (o(dcVar, z9)) {
            this.f25008o += (long) i9;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dw
    public final synchronized void b(dc dcVar, boolean z9) {
        try {
            if (o(dcVar, z9)) {
                af.w(this.f25006m > 0);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int i9 = (int) (jElapsedRealtime - this.f25007n);
                this.f25010q += (long) i9;
                long j9 = this.f25011r;
                long j10 = this.f25008o;
                this.f25011r = j9 + j10;
                if (i9 > 0) {
                    this.f25003j.a((int) Math.sqrt(j10), (j10 * 8000.0f) / i9);
                    if (this.f25010q >= 2000 || this.f25011r >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        this.f25012s = (long) this.f25003j.c();
                    }
                    m(i9, this.f25008o, this.f25012s);
                    this.f25007n = jElapsedRealtime;
                    this.f25008o = 0L;
                }
                this.f25006m--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dw
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dw
    public final synchronized void d(dc dcVar, boolean z9) {
        try {
            if (o(dcVar, z9)) {
                if (this.f25006m == 0) {
                    this.f25007n = SystemClock.elapsedRealtime();
                }
                this.f25006m++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wq
    public final synchronized long e() {
        return this.f25012s;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wq
    public final dw f() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wq
    public final void g(Handler handler, wp wpVar) {
        af.s(wpVar);
        this.f25002i.a(handler, wpVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wq
    public final void h(wp wpVar) {
        this.f25002i.c(wpVar);
    }
}
