package Z2;

import C3.b;
import C3.e;
import C3.h;
import O2.AbstractC0926v1;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import Z2.m;
import Z3.z;
import a4.C1087a;
import a4.InterfaceC1088b;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import b4.C1227s;
import com.amazonaws.services.s3.internal.Constants;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import e4.C1737C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import q3.C2540a;
import s5.C2739u;
import s5.InterfaceC2729j;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC0920t1.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C3.b f10904A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10905B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f10906C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10907D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AdMediaInfo f10908E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public b f10909F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f10910G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f10911H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10912I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f10913J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public b f10914K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10915L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f10916M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f10917N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f10918O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f10919P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.a f10920a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.b f10921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1227s f10923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q1.b f10925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f10926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0147c f10927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f10928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f10929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f10930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC2729j f10931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdDisplayContainer f10932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AdsLoader f10933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f10934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f10935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0920t1 f10936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VideoProgressUpdate f10937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VideoProgressUpdate f10938t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10939u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdsManager f10940v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h.a f10942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Q1 f10943y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10944z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10945a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            f10945a = iArr;
            try {
                iArr[AdEvent.AdEventType.AD_BREAK_FETCH_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10945a[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10945a[AdEvent.AdEventType.TAPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10945a[AdEvent.AdEventType.CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10945a[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10945a[AdEvent.AdEventType.LOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10947b;

        public b(int i9, int i10) {
            this.f10946a = i9;
            this.f10947b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10946a == bVar.f10946a && this.f10947b == bVar.f10947b;
        }

        public int hashCode() {
            return (this.f10946a * 31) + this.f10947b;
        }

        public String toString() {
            return "(" + this.f10946a + ", " + this.f10947b + ')';
        }
    }

    /* JADX INFO: renamed from: Z2.c$c, reason: collision with other inner class name */
    public final class C0147c implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {
        public C0147c() {
        }

        public /* synthetic */ C0147c(c cVar, a aVar) {
            this();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            c.this.f10929k.add(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
        public VideoProgressUpdate getAdProgress() {
            throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
        public VideoProgressUpdate getContentProgress() {
            VideoProgressUpdate videoProgressUpdateM0 = c.this.M0();
            if (c.this.f10920a.f11071o) {
                AbstractC1681B.b("AdTagLoader", "Content progress: " + m.k(videoProgressUpdateM0));
            }
            if (c.this.f10919P != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() - c.this.f10919P >= 4000) {
                    c.this.f10919P = -9223372036854775807L;
                    c.this.Q0(new IOException("Ad preloading timed out"));
                    c.this.e1();
                }
            } else if (c.this.f10917N != -9223372036854775807L && c.this.f10936r != null && c.this.f10936r.getPlaybackState() == 2 && c.this.Z0()) {
                c.this.f10919P = SystemClock.elapsedRealtime();
            }
            return videoProgressUpdateM0;
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
        public int getVolume() {
            return c.this.O0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            try {
                c.this.a1(adMediaInfo, adPodInfo);
            } catch (RuntimeException e9) {
                c.this.d1("loadAd", e9);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
        public void onAdError(AdErrorEvent adErrorEvent) {
            AdError error = adErrorEvent.getError();
            if (c.this.f10920a.f11071o) {
                AbstractC1681B.c("AdTagLoader", "onAdError", error);
            }
            if (c.this.f10940v == null) {
                c.this.f10935q = null;
                c.this.f10904A = new C3.b(c.this.f10924f, new long[0]);
                c.this.q1();
            } else if (m.n(error)) {
                try {
                    c.this.Q0(error);
                } catch (RuntimeException e9) {
                    c.this.d1("onAdError", e9);
                }
            }
            if (c.this.f10942x == null) {
                c.this.f10942x = h.a.c(error);
            }
            c.this.e1();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            AdEvent.AdEventType type = adEvent.getType();
            if (c.this.f10920a.f11071o && type != AdEvent.AdEventType.AD_PROGRESS) {
                AbstractC1681B.b("AdTagLoader", "onAdEvent: " + type);
            }
            try {
                c.this.P0(adEvent);
            } catch (RuntimeException e9) {
                c.this.d1("onAdEvent", e9);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
            if (!k0.c(c.this.f10935q, adsManagerLoadedEvent.getUserRequestContext())) {
                adsManager.destroy();
                return;
            }
            c.this.f10935q = null;
            c.this.f10940v = adsManager;
            adsManager.addAdErrorListener(this);
            if (c.this.f10920a.f11067k != null) {
                adsManager.addAdErrorListener(c.this.f10920a.f11067k);
            }
            if (c.this.f10920a.f11068l != null) {
                AdEvent.AdEventListener adEventListener = c.this.f10920a.f11068l;
            }
            try {
                c.this.f10904A = new C3.b(c.this.f10924f, m.f(adsManager.getAdCuePoints()));
                c.this.q1();
            } catch (RuntimeException e9) {
                c.this.d1("onAdsManagerLoaded", e9);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void pauseAd(AdMediaInfo adMediaInfo) {
            try {
                c.this.g1(adMediaInfo);
            } catch (RuntimeException e9) {
                c.this.d1("pauseAd", e9);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void playAd(AdMediaInfo adMediaInfo) {
            try {
                c.this.i1(adMediaInfo);
            } catch (RuntimeException e9) {
                c.this.d1("playAd", e9);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void release() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            c.this.f10929k.remove(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public void stopAd(AdMediaInfo adMediaInfo) {
            try {
                c.this.o1(adMediaInfo);
            } catch (RuntimeException e9) {
                c.this.d1("stopAd", e9);
            }
        }
    }

    public c(Context context, m.a aVar, m.b bVar, List list, C1227s c1227s, Object obj, ViewGroup viewGroup) {
        this.f10920a = aVar;
        this.f10921c = bVar;
        ImaSdkSettings imaSdkSettingsC = aVar.f11070n;
        if (imaSdkSettingsC == null) {
            imaSdkSettingsC = bVar.c();
            if (aVar.f11071o) {
                imaSdkSettingsC.setDebugMode(true);
            }
        }
        imaSdkSettingsC.setPlayerType("google/exo.ext.ima");
        imaSdkSettingsC.setPlayerVersion("2.19.0");
        this.f10922d = list;
        this.f10923e = c1227s;
        this.f10924f = obj;
        this.f10925g = new Q1.b();
        this.f10926h = k0.w(m.i(), null);
        C0147c c0147c = new C0147c(this, null);
        this.f10927i = c0147c;
        this.f10928j = new ArrayList();
        ArrayList arrayList = new ArrayList(1);
        this.f10929k = arrayList;
        VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback = aVar.f11069m;
        if (videoAdPlayerCallback != null) {
            arrayList.add(videoAdPlayerCallback);
        }
        this.f10930l = new Runnable() { // from class: Z2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f10902a.r1();
            }
        };
        this.f10931m = C2739u.g();
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f10937s = videoProgressUpdate;
        this.f10938t = videoProgressUpdate;
        this.f10915L = -9223372036854775807L;
        this.f10916M = -9223372036854775807L;
        this.f10917N = -9223372036854775807L;
        this.f10919P = -9223372036854775807L;
        this.f10944z = -9223372036854775807L;
        this.f10943y = Q1.f5705a;
        this.f10904A = C3.b.f1036h;
        this.f10934p = new Runnable() { // from class: Z2.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f10903a.R0();
            }
        };
        this.f10932n = viewGroup != null ? bVar.b(viewGroup, c0147c) : bVar.g(context, c0147c);
        Collection<CompanionAdSlot> collection = aVar.f11066j;
        if (collection != null) {
            this.f10932n.setCompanionSlots(collection);
        }
        this.f10933o = k1(context, imaSdkSettingsC, this.f10932n);
    }

    public static long L0(InterfaceC0920t1 interfaceC0920t1, Q1 q12, Q1.b bVar) {
        long jR = interfaceC0920t1.R();
        return q12.v() ? jR : jR - q12.k(interfaceC0920t1.J(), bVar).s();
    }

    public static boolean X0(C3.b bVar) {
        int i9 = bVar.f1044c;
        if (i9 != 1) {
            return (i9 == 2 && bVar.e(0).f1058a == 0 && bVar.e(1).f1058a == Long.MIN_VALUE) ? false : true;
        }
        long j9 = bVar.e(0).f1058a;
        return (j9 == 0 || j9 == Long.MIN_VALUE) ? false : true;
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void A(C1019e c1019e) {
        AbstractC0926v1.a(this, c1019e);
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void B(boolean z9) {
        AbstractC0926v1.j(this, z9);
    }

    public void C0(InterfaceC0920t1 interfaceC0920t1) {
        b bVar;
        this.f10936r = interfaceC0920t1;
        interfaceC0920t1.B(this);
        boolean zE = interfaceC0920t1.E();
        V(interfaceC0920t1.w(), 1);
        AdsManager adsManager = this.f10940v;
        if (C3.b.f1036h.equals(this.f10904A) || adsManager == null || !this.f10906C) {
            return;
        }
        int iG = this.f10904A.g(k0.P0(L0(interfaceC0920t1, this.f10943y, this.f10925g)), k0.P0(this.f10944z));
        if (iG != -1 && (bVar = this.f10909F) != null && bVar.f10946a != iG) {
            if (this.f10920a.f11071o) {
                AbstractC1681B.b("AdTagLoader", "Discarding preloaded ad " + this.f10909F);
            }
            adsManager.discardAdBreak();
        }
        if (zE) {
            adsManager.resume();
        }
    }

    public void D0(e.a aVar, InterfaceC1088b interfaceC1088b) {
        boolean z9 = !this.f10928j.isEmpty();
        this.f10928j.add(aVar);
        if (z9) {
            if (C3.b.f1036h.equals(this.f10904A)) {
                return;
            }
            aVar.a(this.f10904A);
            return;
        }
        this.f10939u = 0;
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.f10938t = videoProgressUpdate;
        this.f10937s = videoProgressUpdate;
        e1();
        if (!C3.b.f1036h.equals(this.f10904A)) {
            aVar.a(this.f10904A);
        } else if (this.f10940v != null) {
            this.f10904A = new C3.b(this.f10924f, m.f(this.f10940v.getAdCuePoints()));
            q1();
        }
        for (C1087a c1087a : interfaceC1088b.getAdOverlayInfos()) {
            this.f10932n.registerFriendlyObstruction(this.f10921c.d(c1087a.f11608a, m.h(c1087a.f11609b), c1087a.f11610c));
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public void E(int i9) {
        long jElapsedRealtime;
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        if (this.f10940v == null || interfaceC0920t1 == null) {
            return;
        }
        if (i9 != 2 || interfaceC0920t1.d() || !Z0()) {
            if (i9 == 3) {
                jElapsedRealtime = -9223372036854775807L;
            }
            T0(interfaceC0920t1.E(), i9);
        }
        jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f10919P = jElapsedRealtime;
        T0(interfaceC0920t1.E(), i9);
    }

    public void E0() {
        InterfaceC0920t1 interfaceC0920t1 = (InterfaceC0920t1) AbstractC1684a.e(this.f10936r);
        if (!C3.b.f1036h.equals(this.f10904A) && this.f10906C) {
            AdsManager adsManager = this.f10940v;
            if (adsManager != null) {
                adsManager.pause();
            }
            this.f10904A = this.f10904A.q(this.f10911H ? k0.P0(interfaceC0920t1.getCurrentPosition()) : 0L);
        }
        this.f10939u = O0();
        this.f10938t = K0();
        this.f10937s = M0();
        interfaceC0920t1.l(this);
        this.f10936r = null;
    }

    public final void F0() {
        AdsManager adsManager = this.f10940v;
        if (adsManager != null) {
            adsManager.removeAdErrorListener(this.f10927i);
            AdErrorEvent.AdErrorListener adErrorListener = this.f10920a.f11067k;
            if (adErrorListener != null) {
                this.f10940v.removeAdErrorListener(adErrorListener);
            }
            this.f10940v.removeAdEventListener(this.f10927i);
            AdEvent.AdEventListener adEventListener = this.f10920a.f11068l;
            if (adEventListener != null) {
                this.f10940v.removeAdEventListener(adEventListener);
            }
            this.f10940v.destroy();
            this.f10940v = null;
        }
    }

    public final void G0() {
        if (this.f10910G || this.f10944z == -9223372036854775807L || this.f10917N != -9223372036854775807L) {
            return;
        }
        long jL0 = L0((InterfaceC0920t1) AbstractC1684a.e(this.f10936r), this.f10943y, this.f10925g);
        if (5000 + jL0 < this.f10944z) {
            return;
        }
        int iG = this.f10904A.g(k0.P0(jL0), k0.P0(this.f10944z));
        if (iG == -1 || this.f10904A.e(iG).f1058a == Long.MIN_VALUE || !this.f10904A.e(iG).k()) {
            m1();
        }
    }

    public final int H0(AdPodInfo adPodInfo) {
        return adPodInfo.getPodIndex() == -1 ? this.f10904A.f1044c - 1 : I0(adPodInfo.getTimeOffset());
    }

    public final int I0(double d9) {
        long jRound = Math.round(((double) ((float) d9)) * 1000000.0d);
        int i9 = 0;
        while (true) {
            C3.b bVar = this.f10904A;
            if (i9 >= bVar.f1044c) {
                throw new IllegalStateException("Failed to find cue point");
            }
            long j9 = bVar.e(i9).f1058a;
            if (j9 != Long.MIN_VALUE && Math.abs(j9 - jRound) < 1000) {
                return i9;
            }
            i9++;
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void J(boolean z9) {
        AbstractC0926v1.y(this, z9);
    }

    public final String J0(AdMediaInfo adMediaInfo) {
        b bVar = (b) this.f10931m.get(adMediaInfo);
        StringBuilder sb = new StringBuilder();
        sb.append("AdMediaInfo[");
        sb.append(adMediaInfo == null ? Constants.NULL_VERSION_ID : adMediaInfo.getUrl());
        sb.append(", ");
        sb.append(bVar);
        sb.append("]");
        return sb.toString();
    }

    public final VideoProgressUpdate K0() {
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        if (interfaceC0920t1 == null) {
            return this.f10938t;
        }
        if (this.f10907D == 0 || !this.f10911H) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        long duration = interfaceC0920t1.getDuration();
        return duration == -9223372036854775807L ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : new VideoProgressUpdate(this.f10936r.getCurrentPosition(), duration);
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void M(int i9, boolean z9) {
        AbstractC0926v1.f(this, i9, z9);
    }

    public final VideoProgressUpdate M0() {
        boolean z9 = this.f10944z != -9223372036854775807L;
        long jL0 = this.f10917N;
        if (jL0 != -9223372036854775807L) {
            this.f10918O = true;
        } else {
            InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
            if (interfaceC0920t1 == null) {
                return this.f10937s;
            }
            if (this.f10915L != -9223372036854775807L) {
                jL0 = this.f10916M + (SystemClock.elapsedRealtime() - this.f10915L);
            } else {
                if (this.f10907D != 0 || this.f10911H || !z9) {
                    return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
                }
                jL0 = L0(interfaceC0920t1, this.f10943y, this.f10925g);
            }
        }
        return new VideoProgressUpdate(jL0, z9 ? this.f10944z : -1L);
    }

    public final int N0() {
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        if (interfaceC0920t1 == null) {
            return -1;
        }
        long jP0 = k0.P0(L0(interfaceC0920t1, this.f10943y, this.f10925g));
        int iG = this.f10904A.g(jP0, k0.P0(this.f10944z));
        return iG == -1 ? this.f10904A.f(jP0, k0.P0(this.f10944z)) : iG;
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void O(InterfaceC0920t1.b bVar) {
        AbstractC0926v1.b(this, bVar);
    }

    public final int O0() {
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        return interfaceC0920t1 == null ? this.f10939u : interfaceC0920t1.t(22) ? (int) (interfaceC0920t1.getVolume() * 100.0f) : interfaceC0920t1.p().e(1) ? 100 : 0;
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void P() {
        AbstractC0926v1.w(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void P0(AdEvent adEvent) {
        if (this.f10940v == null) {
        }
        int i9 = 0;
        switch (a.f10945a[adEvent.getType().ordinal()]) {
            case 1:
                String str = (String) AbstractC1684a.e(adEvent.getAdData().get("adBreakTime"));
                if (this.f10920a.f11071o) {
                    AbstractC1681B.b("AdTagLoader", "Fetch error for ad at " + str + " seconds");
                }
                double d9 = Double.parseDouble(str);
                b1(d9 == -1.0d ? this.f10904A.f1044c - 1 : I0(d9));
                break;
            case 2:
                this.f10906C = true;
                h1();
                break;
            case 3:
                while (i9 < this.f10928j.size()) {
                    ((e.a) this.f10928j.get(i9)).d();
                    i9++;
                }
                break;
            case 4:
                while (i9 < this.f10928j.size()) {
                    ((e.a) this.f10928j.get(i9)).c();
                    i9++;
                }
                break;
            case 5:
                this.f10906C = false;
                l1();
                break;
            case 6:
                AbstractC1681B.g("AdTagLoader", "AdEvent: " + adEvent.getAdData());
                break;
        }
    }

    public final void Q0(Exception exc) {
        int iN0 = N0();
        if (iN0 == -1) {
            AbstractC1681B.k("AdTagLoader", "Unable to determine ad group index for ad group load error", exc);
            return;
        }
        b1(iN0);
        if (this.f10942x == null) {
            this.f10942x = h.a.b(exc, iN0);
        }
    }

    public final void R0() {
        Q0(new IOException("Ad loading timed out"));
        e1();
    }

    @Override // O2.InterfaceC0920t1.d
    public void S(InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
        W0();
    }

    public final void S0(int i9, int i10, Exception exc) {
        if (this.f10920a.f11071o) {
            AbstractC1681B.c("AdTagLoader", "Prepare error for ad " + i10 + " in group " + i9, exc);
        }
        if (this.f10940v == null) {
            AbstractC1681B.j("AdTagLoader", "Ignoring ad prepare error after release");
            return;
        }
        if (this.f10907D == 0) {
            this.f10915L = SystemClock.elapsedRealtime();
            long jX1 = k0.x1(this.f10904A.e(i9).f1058a);
            this.f10916M = jX1;
            if (jX1 == Long.MIN_VALUE) {
                this.f10916M = this.f10944z;
            }
            this.f10914K = new b(i9, i10);
        } else {
            AdMediaInfo adMediaInfo = (AdMediaInfo) AbstractC1684a.e(this.f10908E);
            if (i10 > this.f10913J) {
                for (int i11 = 0; i11 < this.f10929k.size(); i11++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i11)).onEnded(adMediaInfo);
                }
            }
            this.f10913J = this.f10904A.e(i9).f();
            for (int i12 = 0; i12 < this.f10929k.size(); i12++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i12)).onError((AdMediaInfo) AbstractC1684a.e(adMediaInfo));
            }
        }
        this.f10904A = this.f10904A.p(i9, i10);
        q1();
    }

    public final void T0(boolean z9, int i9) {
        if (this.f10911H && this.f10907D == 1) {
            boolean z10 = this.f10912I;
            if (!z10 && i9 == 2) {
                this.f10912I = true;
                AdMediaInfo adMediaInfo = (AdMediaInfo) AbstractC1684a.e(this.f10908E);
                for (int i10 = 0; i10 < this.f10929k.size(); i10++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i10)).onBuffering(adMediaInfo);
                }
                p1();
            } else if (z10 && i9 == 3) {
                this.f10912I = false;
                r1();
            }
        }
        int i11 = this.f10907D;
        if (i11 == 0 && i9 == 2 && z9) {
            G0();
            return;
        }
        if (i11 == 0 || i9 != 4) {
            return;
        }
        AdMediaInfo adMediaInfo2 = this.f10908E;
        if (adMediaInfo2 == null) {
            AbstractC1681B.j("AdTagLoader", "onEnded without ad media info");
        } else {
            for (int i12 = 0; i12 < this.f10929k.size(); i12++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i12)).onEnded(adMediaInfo2);
            }
        }
        if (this.f10920a.f11071o) {
            AbstractC1681B.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onPlaybackStateChanged");
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void U(int i9, int i10) {
        AbstractC0926v1.A(this, i9, i10);
    }

    public void U0(int i9, int i10) {
        b bVar = new b(i9, i10);
        if (this.f10920a.f11071o) {
            AbstractC1681B.b("AdTagLoader", "Prepared ad " + bVar);
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) this.f10931m.l().get(bVar);
        if (adMediaInfo != null) {
            for (int i11 = 0; i11 < this.f10929k.size(); i11++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i11)).onLoaded(adMediaInfo);
            }
            return;
        }
        AbstractC1681B.j("AdTagLoader", "Unexpected prepared ad " + bVar);
    }

    @Override // O2.InterfaceC0920t1.d
    public void V(Q1 q12, int i9) {
        if (q12.v()) {
            return;
        }
        this.f10943y = q12;
        InterfaceC0920t1 interfaceC0920t1 = (InterfaceC0920t1) AbstractC1684a.e(this.f10936r);
        long j9 = q12.k(interfaceC0920t1.J(), this.f10925g).f5719e;
        this.f10944z = k0.x1(j9);
        C3.b bVar = this.f10904A;
        if (j9 != bVar.f1046e) {
            this.f10904A = bVar.t(j9);
            q1();
        }
        c1(L0(interfaceC0920t1, q12, this.f10925g), this.f10944z);
        W0();
    }

    public void V0(int i9, int i10, IOException iOException) {
        if (this.f10936r == null) {
            return;
        }
        try {
            S0(i9, i10, iOException);
        } catch (RuntimeException e9) {
            d1("handlePrepareError", e9);
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void W(C0909p1 c0909p1) {
        AbstractC0926v1.s(this, c0909p1);
    }

    public final void W0() {
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        if (this.f10940v == null || interfaceC0920t1 == null) {
            return;
        }
        if (!this.f10911H && !interfaceC0920t1.d()) {
            G0();
            if (!this.f10910G && !this.f10943y.v()) {
                long jL0 = L0(interfaceC0920t1, this.f10943y, this.f10925g);
                this.f10943y.k(interfaceC0920t1.J(), this.f10925g);
                if (this.f10925g.i(k0.P0(jL0)) != -1) {
                    this.f10918O = false;
                    this.f10917N = jL0;
                }
            }
        }
        boolean z9 = this.f10911H;
        int i9 = this.f10913J;
        boolean zD = interfaceC0920t1.d();
        this.f10911H = zD;
        int iN = zD ? interfaceC0920t1.N() : -1;
        this.f10913J = iN;
        if (z9 && iN != i9) {
            AdMediaInfo adMediaInfo = this.f10908E;
            if (adMediaInfo == null) {
                AbstractC1681B.j("AdTagLoader", "onEnded without ad media info");
            } else {
                b bVar = (b) this.f10931m.get(adMediaInfo);
                int i10 = this.f10913J;
                if (i10 == -1 || (bVar != null && bVar.f10947b < i10)) {
                    for (int i11 = 0; i11 < this.f10929k.size(); i11++) {
                        ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i11)).onEnded(adMediaInfo);
                    }
                    if (this.f10920a.f11071o) {
                        AbstractC1681B.b("AdTagLoader", "VideoAdPlayerCallback.onEnded in onTimelineChanged/onPositionDiscontinuity");
                    }
                }
            }
        }
        if (!this.f10910G && !z9 && this.f10911H && this.f10907D == 0) {
            b.C0010b c0010bE = this.f10904A.e(interfaceC0920t1.s());
            if (c0010bE.f1058a == Long.MIN_VALUE) {
                m1();
            } else {
                this.f10915L = SystemClock.elapsedRealtime();
                long jX1 = k0.x1(c0010bE.f1058a);
                this.f10916M = jX1;
                if (jX1 == Long.MIN_VALUE) {
                    this.f10916M = this.f10944z;
                }
            }
        }
        if (Y0()) {
            this.f10926h.removeCallbacks(this.f10934p);
            this.f10926h.postDelayed(this.f10934p, this.f10920a.f11057a);
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void Y(z zVar) {
        AbstractC0926v1.C(this, zVar);
    }

    public final boolean Y0() {
        int iS;
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        if (interfaceC0920t1 == null || (iS = interfaceC0920t1.s()) == -1) {
            return false;
        }
        b.C0010b c0010bE = this.f10904A.e(iS);
        int iN = interfaceC0920t1.N();
        int i9 = c0010bE.f1059c;
        return i9 == -1 || i9 <= iN || c0010bE.f1062f[iN] == 0;
    }

    public final boolean Z0() {
        int iN0;
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        if (interfaceC0920t1 == null || (iN0 = N0()) == -1) {
            return false;
        }
        b.C0010b c0010bE = this.f10904A.e(iN0);
        int i9 = c0010bE.f1059c;
        return (i9 == -1 || i9 == 0 || c0010bE.f1062f[0] == 0) && k0.x1(c0010bE.f1058a) - L0(interfaceC0920t1, this.f10943y, this.f10925g) < this.f10920a.f11057a;
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void a(boolean z9) {
        AbstractC0926v1.z(this, z9);
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void a0(C0921u c0921u) {
        AbstractC0926v1.e(this, c0921u);
    }

    public final void a1(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.f10940v == null) {
            if (this.f10920a.f11071o) {
                AbstractC1681B.b("AdTagLoader", "loadAd after release " + J0(adMediaInfo) + ", ad pod " + adPodInfo);
                return;
            }
            return;
        }
        int iH0 = H0(adPodInfo);
        int adPosition = adPodInfo.getAdPosition() - 1;
        b bVar = new b(iH0, adPosition);
        this.f10931m.b(adMediaInfo, bVar);
        if (this.f10920a.f11071o) {
            AbstractC1681B.b("AdTagLoader", "loadAd " + J0(adMediaInfo));
        }
        if (this.f10904A.i(iH0, adPosition)) {
            return;
        }
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        if (interfaceC0920t1 != null && interfaceC0920t1.s() == iH0 && this.f10936r.N() == adPosition) {
            this.f10926h.removeCallbacks(this.f10934p);
        }
        C3.b bVarL = this.f10904A.l(bVar.f10946a, Math.max(adPodInfo.getTotalAds(), this.f10904A.e(bVar.f10946a).f1062f.length));
        this.f10904A = bVarL;
        b.C0010b c0010bE = bVarL.e(bVar.f10946a);
        for (int i9 = 0; i9 < adPosition; i9++) {
            if (c0010bE.f1062f[i9] == 0) {
                this.f10904A = this.f10904A.p(iH0, i9);
            }
        }
        this.f10904A = this.f10904A.s(bVar.f10946a, bVar.f10947b, Uri.parse(adMediaInfo.getUrl()));
        q1();
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void b0(int i9) {
        AbstractC0926v1.u(this, i9);
    }

    public final void b1(int i9) {
        b.C0010b c0010bE = this.f10904A.e(i9);
        if (c0010bE.f1059c == -1) {
            C3.b bVarL = this.f10904A.l(i9, Math.max(1, c0010bE.f1062f.length));
            this.f10904A = bVarL;
            c0010bE = bVarL.e(i9);
        }
        for (int i10 = 0; i10 < c0010bE.f1059c; i10++) {
            if (c0010bE.f1062f[i10] == 0) {
                if (this.f10920a.f11071o) {
                    AbstractC1681B.b("AdTagLoader", "Removing ad " + i10 + " in ad group " + i9);
                }
                this.f10904A = this.f10904A.p(i9, i10);
            }
        }
        q1();
        this.f10917N = -9223372036854775807L;
        this.f10915L = -9223372036854775807L;
    }

    public final void c1(long j9, long j10) {
        AdsManager adsManager = this.f10940v;
        if (this.f10941w || adsManager == null) {
            return;
        }
        this.f10941w = true;
        AdsRenderingSettings adsRenderingSettingsN1 = n1(j9, j10);
        if (adsRenderingSettingsN1 == null) {
            F0();
        } else {
            adsManager.init(adsRenderingSettingsN1);
            adsManager.start();
            if (this.f10920a.f11071o) {
                AbstractC1681B.b("AdTagLoader", "Initialized with ads rendering settings: " + adsRenderingSettingsN1);
            }
        }
        q1();
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void d0(boolean z9) {
        AbstractC0926v1.h(this, z9);
    }

    public final void d1(String str, Exception exc) {
        String str2 = "Internal error in " + str;
        AbstractC1681B.e("AdTagLoader", str2, exc);
        int i9 = 0;
        while (true) {
            C3.b bVar = this.f10904A;
            if (i9 >= bVar.f1044c) {
                break;
            }
            this.f10904A = bVar.C(i9);
            i9++;
        }
        q1();
        for (int i10 = 0; i10 < this.f10928j.size(); i10++) {
            ((e.a) this.f10928j.get(i10)).b(h.a.d(new RuntimeException(str2, exc)), this.f10923e);
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void e(C2540a c2540a) {
        AbstractC0926v1.m(this, c2540a);
    }

    public final void e1() {
        if (this.f10942x != null) {
            for (int i9 = 0; i9 < this.f10928j.size(); i9++) {
                ((e.a) this.f10928j.get(i9)).b(this.f10942x, this.f10923e);
            }
            this.f10942x = null;
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void f0(V1 v12) {
        AbstractC0926v1.D(this, v12);
    }

    public void f1(long j9, long j10) {
        c1(j9, j10);
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void g0(boolean z9, int i9) {
        AbstractC0926v1.t(this, z9, i9);
    }

    public final void g1(AdMediaInfo adMediaInfo) {
        if (this.f10920a.f11071o) {
            AbstractC1681B.b("AdTagLoader", "pauseAd " + J0(adMediaInfo));
        }
        if (this.f10940v == null || this.f10907D == 0) {
            return;
        }
        if (this.f10920a.f11071o && !adMediaInfo.equals(this.f10908E)) {
            AbstractC1681B.j("AdTagLoader", "Unexpected pauseAd for " + J0(adMediaInfo) + ", expected " + J0(this.f10908E));
        }
        this.f10907D = 2;
        for (int i9 = 0; i9 < this.f10929k.size(); i9++) {
            ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i9)).onPause(adMediaInfo);
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void h0(H0 h02, int i9) {
        AbstractC0926v1.k(this, h02, i9);
    }

    public final void h1() {
        this.f10907D = 0;
        if (this.f10918O) {
            this.f10917N = -9223372036854775807L;
            this.f10918O = false;
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void i0(R0 r02) {
        AbstractC0926v1.l(this, r02);
    }

    public final void i1(AdMediaInfo adMediaInfo) {
        if (this.f10920a.f11071o) {
            AbstractC1681B.b("AdTagLoader", "playAd " + J0(adMediaInfo));
        }
        if (this.f10940v == null) {
            return;
        }
        if (this.f10907D == 1) {
            AbstractC1681B.j("AdTagLoader", "Unexpected playAd without stopAd");
        }
        int i9 = 0;
        if (this.f10907D == 0) {
            this.f10915L = -9223372036854775807L;
            this.f10916M = -9223372036854775807L;
            this.f10907D = 1;
            this.f10908E = adMediaInfo;
            this.f10909F = (b) AbstractC1684a.e((b) this.f10931m.get(adMediaInfo));
            for (int i10 = 0; i10 < this.f10929k.size(); i10++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i10)).onPlay(adMediaInfo);
            }
            b bVar = this.f10914K;
            if (bVar != null && bVar.equals(this.f10909F)) {
                this.f10914K = null;
                while (i9 < this.f10929k.size()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i9)).onError(adMediaInfo);
                    i9++;
                }
            }
            r1();
        } else {
            this.f10907D = 1;
            AbstractC1684a.g(adMediaInfo.equals(this.f10908E));
            while (i9 < this.f10929k.size()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i9)).onResume(adMediaInfo);
                i9++;
            }
        }
        InterfaceC0920t1 interfaceC0920t1 = this.f10936r;
        if (interfaceC0920t1 == null || !interfaceC0920t1.E()) {
            ((AdsManager) AbstractC1684a.e(this.f10940v)).pause();
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void j(C1737C c1737c) {
        AbstractC0926v1.E(this, c1737c);
    }

    @Override // O2.InterfaceC0920t1.d
    public void j0(boolean z9, int i9) {
        InterfaceC0920t1 interfaceC0920t1;
        AdsManager adsManager = this.f10940v;
        if (adsManager == null || (interfaceC0920t1 = this.f10936r) == null) {
            return;
        }
        int i10 = this.f10907D;
        if (i10 == 1 && !z9) {
            adsManager.pause();
        } else if (i10 == 2 && z9) {
            adsManager.resume();
        } else {
            T0(z9, interfaceC0920t1.getPlaybackState());
        }
    }

    public void j1(e.a aVar) {
        this.f10928j.remove(aVar);
        if (this.f10928j.isEmpty()) {
            this.f10932n.unregisterAllFriendlyObstructions();
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void k(List list) {
        AbstractC0926v1.d(this, list);
    }

    public final AdsLoader k1(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        AdsLoader adsLoaderA = this.f10921c.a(context, imaSdkSettings, adDisplayContainer);
        adsLoaderA.addAdErrorListener(this.f10927i);
        AdErrorEvent.AdErrorListener adErrorListener = this.f10920a.f11067k;
        if (adErrorListener != null) {
            adsLoaderA.addAdErrorListener(adErrorListener);
        }
        C0147c c0147c = this.f10927i;
        try {
            AdsRequest adsRequestG = m.g(this.f10921c, this.f10923e);
            Object obj = new Object();
            this.f10935q = obj;
            adsRequestG.setUserRequestContext(obj);
            Boolean bool = this.f10920a.f11063g;
            if (bool != null) {
                adsRequestG.setContinuousPlayback(bool.booleanValue());
            }
            int i9 = this.f10920a.f11058b;
            if (i9 != -1) {
                float f9 = i9;
            }
            adsRequestG.setContentProgressProvider(this.f10927i);
            return adsLoaderA;
        } catch (IOException e9) {
            this.f10904A = new C3.b(this.f10924f, new long[0]);
            q1();
            this.f10942x = h.a.c(e9);
            e1();
            return adsLoaderA;
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public void l0(C0909p1 c0909p1) {
        if (this.f10907D != 0) {
            AdMediaInfo adMediaInfo = (AdMediaInfo) AbstractC1684a.e(this.f10908E);
            for (int i9 = 0; i9 < this.f10929k.size(); i9++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i9)).onError(adMediaInfo);
            }
        }
    }

    public final void l1() {
        b bVar = this.f10909F;
        if (bVar != null) {
            this.f10904A = this.f10904A.C(bVar.f10946a);
            q1();
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
        AbstractC0926v1.g(this, interfaceC0920t1, cVar);
    }

    public final void m1() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.f10929k.size(); i10++) {
            ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i10)).onContentComplete();
        }
        this.f10910G = true;
        if (this.f10920a.f11071o) {
            AbstractC1681B.b("AdTagLoader", "adsLoader.contentComplete");
        }
        while (true) {
            C3.b bVar = this.f10904A;
            if (i9 >= bVar.f1044c) {
                q1();
                return;
            } else {
                if (bVar.e(i9).f1058a != Long.MIN_VALUE) {
                    this.f10904A = this.f10904A.C(i9);
                }
                i9++;
            }
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void n0(boolean z9) {
        AbstractC0926v1.i(this, z9);
    }

    public final AdsRenderingSettings n1(long j9, long j10) {
        AdsRenderingSettings adsRenderingSettingsE = this.f10921c.e();
        List<String> list = this.f10920a.f11064h;
        if (list == null) {
            list = this.f10922d;
        }
        adsRenderingSettingsE.setMimeTypes(list);
        if (this.f10920a.f11059c != -1) {
        }
        int i9 = this.f10920a.f11062f;
        if (i9 != -1) {
            adsRenderingSettingsE.setBitrateKbps(i9 / 1000);
        }
        adsRenderingSettingsE.setFocusSkipButtonWhenAvailable(this.f10920a.f11060d);
        Set<UiElement> set = this.f10920a.f11065i;
        if (set != null) {
            adsRenderingSettingsE.setUiElements(set);
        }
        int iG = this.f10904A.g(k0.P0(j9), k0.P0(j10));
        if (iG != -1) {
            if (this.f10904A.e(iG).f1058a != k0.P0(j9) && !this.f10920a.f11061e) {
                iG++;
            } else if (X0(this.f10904A)) {
                this.f10917N = j9;
            }
            if (iG > 0) {
                for (int i10 = 0; i10 < iG; i10++) {
                    this.f10904A = this.f10904A.C(i10);
                }
                C3.b bVar = this.f10904A;
                if (iG == bVar.f1044c) {
                    return null;
                }
                adsRenderingSettingsE.setPlayAdsAfterTime(bVar.e(iG).f1058a == Long.MIN_VALUE ? (this.f10904A.e(iG - 1).f1058a / 1000000.0d) + 1.0d : ((r7 + r9) / 2.0d) / 1000000.0d);
            }
        }
        return adsRenderingSettingsE;
    }

    public final void o1(AdMediaInfo adMediaInfo) {
        if (this.f10920a.f11071o) {
            AbstractC1681B.b("AdTagLoader", "stopAd " + J0(adMediaInfo));
        }
        if (this.f10940v == null) {
            return;
        }
        if (this.f10907D == 0) {
            b bVar = (b) this.f10931m.get(adMediaInfo);
            if (bVar != null) {
                this.f10904A = this.f10904A.B(bVar.f10946a, bVar.f10947b);
                q1();
                return;
            }
            return;
        }
        this.f10907D = 0;
        p1();
        AbstractC1684a.e(this.f10909F);
        b bVar2 = this.f10909F;
        int i9 = bVar2.f10946a;
        int i10 = bVar2.f10947b;
        if (this.f10904A.i(i9, i10)) {
            return;
        }
        this.f10904A = this.f10904A.A(i9, i10).q(0L);
        q1();
        if (this.f10911H) {
            return;
        }
        this.f10908E = null;
        this.f10909F = null;
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void onRepeatModeChanged(int i9) {
        AbstractC0926v1.x(this, i9);
    }

    public final void p1() {
        this.f10926h.removeCallbacks(this.f10930l);
    }

    public final void q1() {
        for (int i9 = 0; i9 < this.f10928j.size(); i9++) {
            ((e.a) this.f10928j.get(i9)).a(this.f10904A);
        }
    }

    public final void r1() {
        VideoProgressUpdate videoProgressUpdateK0 = K0();
        if (this.f10920a.f11071o) {
            AbstractC1681B.b("AdTagLoader", "Ad progress: " + m.k(videoProgressUpdateK0));
        }
        AdMediaInfo adMediaInfo = (AdMediaInfo) AbstractC1684a.e(this.f10908E);
        for (int i9 = 0; i9 < this.f10929k.size(); i9++) {
            ((VideoAdPlayer.VideoAdPlayerCallback) this.f10929k.get(i9)).onAdProgress(adMediaInfo, videoProgressUpdateK0);
        }
        this.f10926h.removeCallbacks(this.f10930l);
        this.f10926h.postDelayed(this.f10930l, 200L);
    }

    public void release() {
        if (this.f10905B) {
            return;
        }
        this.f10905B = true;
        this.f10935q = null;
        F0();
        this.f10933o.removeAdsLoadedListener(this.f10927i);
        this.f10933o.removeAdErrorListener(this.f10927i);
        AdErrorEvent.AdErrorListener adErrorListener = this.f10920a.f11067k;
        if (adErrorListener != null) {
            this.f10933o.removeAdErrorListener(adErrorListener);
        }
        this.f10933o.release();
        int i9 = 0;
        this.f10906C = false;
        this.f10907D = 0;
        this.f10908E = null;
        p1();
        this.f10909F = null;
        this.f10942x = null;
        while (true) {
            C3.b bVar = this.f10904A;
            if (i9 >= bVar.f1044c) {
                q1();
                return;
            } else {
                this.f10904A = bVar.C(i9);
                i9++;
            }
        }
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void t(C0917s1 c0917s1) {
        AbstractC0926v1.o(this, c0917s1);
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void u(P3.f fVar) {
        AbstractC0926v1.c(this, fVar);
    }

    @Override // O2.InterfaceC0920t1.d
    public /* synthetic */ void z(int i9) {
        AbstractC0926v1.q(this, i9);
    }
}
