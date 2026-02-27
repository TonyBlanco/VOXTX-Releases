package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class is implements hw, it {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f23293A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iu f23295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PlaybackSession f23296c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f23302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f23303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23304k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private at f23307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ir f23308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ir f23309p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ir f23310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1333s f23311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C1333s f23312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C1333s f23313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f23315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f23316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f23317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f23318y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23319z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bd f23298e = new bd();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bc f23299f = new bc();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f23301h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f23300g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23297d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23305l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23306m = 0;

    private is(Context context, PlaybackSession playbackSession) {
        this.f23294a = context.getApplicationContext();
        this.f23296c = playbackSession;
        ip ipVar = new ip();
        this.f23295b = ipVar;
        ipVar.g(this);
    }

    public static is k(Context context) {
        MediaMetricsManager mediaMetricsManagerA = M0.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new is(context, mediaMetricsManagerA.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int n(int i9) {
        switch (cq.i(i9)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void o() {
        PlaybackMetrics.Builder builder = this.f23303j;
        if (builder != null && this.f23293A) {
            builder.setAudioUnderrunCount(this.f23319z);
            this.f23303j.setVideoFramesDropped(this.f23317x);
            this.f23303j.setVideoFramesPlayed(this.f23318y);
            Long l9 = (Long) this.f23300g.get(this.f23302i);
            this.f23303j.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f23301h.get(this.f23302i);
            this.f23303j.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f23303j.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f23296c.reportPlaybackMetrics(this.f23303j.build());
        }
        this.f23303j = null;
        this.f23302i = null;
        this.f23319z = 0;
        this.f23317x = 0;
        this.f23318y = 0;
        this.f23311r = null;
        this.f23312s = null;
        this.f23313t = null;
        this.f23293A = false;
    }

    private final void p(long j9, C1333s c1333s, int i9) {
        if (cq.V(this.f23312s, c1333s)) {
            return;
        }
        int i10 = (this.f23312s == null && i9 == 0) ? 1 : i9;
        this.f23312s = c1333s;
        t(0, j9, c1333s, i10);
    }

    private final void q(long j9, C1333s c1333s, int i9) {
        if (cq.V(this.f23313t, c1333s)) {
            return;
        }
        int i10 = (this.f23313t == null && i9 == 0) ? 1 : i9;
        this.f23313t = c1333s;
        t(2, j9, c1333s, i10);
    }

    private final void r(be beVar, te teVar) {
        int iA;
        int i9;
        PlaybackMetrics.Builder builder = this.f23303j;
        if (teVar == null || (iA = beVar.a(teVar.f20173a)) == -1) {
            return;
        }
        beVar.m(iA, this.f23299f);
        beVar.o(this.f23299f.f21037c, this.f23298e);
        ad adVar = this.f23298e.f21064c.f19815b;
        if (adVar == null) {
            i9 = 0;
        } else {
            int iM = cq.m(adVar.f19027a);
            i9 = iM != 0 ? iM != 1 ? iM != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i9);
        bd bdVar = this.f23298e;
        if (bdVar.f21075n != -9223372036854775807L && !bdVar.f21073l && !bdVar.f21070i && !bdVar.c()) {
            builder.setMediaDurationMillis(this.f23298e.b());
        }
        builder.setPlaybackType(true != this.f23298e.c() ? 1 : 2);
        this.f23293A = true;
    }

    private final void s(long j9, C1333s c1333s, int i9) {
        if (cq.V(this.f23311r, c1333s)) {
            return;
        }
        int i10 = (this.f23311r == null && i9 == 0) ? 1 : i9;
        this.f23311r = c1333s;
        t(1, j9, c1333s, i10);
    }

    private final void t(int i9, long j9, C1333s c1333s, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = U0.a(i9).setTimeSinceCreatedMillis(j9 - this.f23297d);
        if (c1333s != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? 1 : 4;
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str = c1333s.f24466k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c1333s.f24467l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c1333s.f24464i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = c1333s.f24463h;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = c1333s.f24472q;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = c1333s.f24473r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = c1333s.f24480y;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = c1333s.f24481z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = c1333s.f24458c;
            if (str4 != null) {
                String[] strArrAk = cq.ak(str4, "-");
                Pair pairCreate = Pair.create(strArrAk[0], strArrAk.length >= 2 ? strArrAk[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f9 = c1333s.f24474s;
            if (f9 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f9);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f23293A = true;
        this.f23296c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean u(ir irVar) {
        return irVar != null && irVar.f23292c.equals(this.f23295b.d());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void a(hv hvVar, tb tbVar) {
        if (hvVar.f23196d == null) {
            return;
        }
        C1333s c1333s = tbVar.f24575c;
        af.s(c1333s);
        int i9 = tbVar.f24576d;
        iu iuVar = this.f23295b;
        be beVar = hvVar.f23194b;
        te teVar = hvVar.f23196d;
        af.s(teVar);
        ir irVar = new ir(c1333s, i9, iuVar.e(beVar, teVar));
        int i10 = tbVar.f24574b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f23309p = irVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f23310q = irVar;
                return;
            }
        }
        this.f23308o = irVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void b(hv hvVar, at atVar) {
        this.f23307n = atVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void c(hv hvVar, int i9, long j9) {
        te teVar = hvVar.f23196d;
        if (teVar != null) {
            iu iuVar = this.f23295b;
            be beVar = hvVar.f23194b;
            af.s(teVar);
            String strE = iuVar.e(beVar, teVar);
            Long l9 = (Long) this.f23301h.get(strE);
            Long l10 = (Long) this.f23300g.get(strE);
            this.f23301h.put(strE, Long.valueOf((l9 == null ? 0L : l9.longValue()) + j9));
            this.f23300g.put(strE, Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) i9)));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void d(tb tbVar) {
        this.f23315v = tbVar.f24573a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final /* synthetic */ void e(int i9) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void f(int i9) {
        if (i9 == 1) {
            this.f23314u = true;
            i9 = 1;
        }
        this.f23304k = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void g(ep epVar) {
        this.f23317x += epVar.f22816g;
        this.f23318y += epVar.f22814e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hw
    public final void h(bl blVar) {
        ir irVar = this.f23308o;
        if (irVar != null) {
            C1333s c1333s = irVar.f23290a;
            if (c1333s.f24473r == -1) {
                r rVarB = c1333s.b();
                rVarB.aj(blVar.f21637b);
                rVarB.Q(blVar.f21638c);
                this.f23308o = new ir(rVarB.v(), irVar.f23291b, irVar.f23292c);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0367  */
    @Override // com.google.ads.interactivemedia.v3.internal.hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.google.ads.interactivemedia.v3.internal.az r18, com.google.ads.interactivemedia.v3.internal.aeq r19) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.is.i(com.google.ads.interactivemedia.v3.internal.az, com.google.ads.interactivemedia.v3.internal.aeq):void");
    }

    public final LogSessionId j() {
        return this.f23296c.getSessionId();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.it
    public final void l(hv hvVar, String str) {
        te teVar = hvVar.f23196d;
        if (teVar == null || !teVar.b()) {
            o();
            this.f23302i = str;
            this.f23303j = V0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            r(hvVar.f23194b, hvVar.f23196d);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.it
    public final void m(hv hvVar, String str) {
        te teVar = hvVar.f23196d;
        if ((teVar == null || !teVar.b()) && str.equals(this.f23302i)) {
            o();
        }
        this.f23300g.remove(str);
        this.f23301h.remove(str);
    }
}
