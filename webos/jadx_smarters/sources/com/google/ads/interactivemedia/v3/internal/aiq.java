package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.StrictMode;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import z0.AbstractC2996b;

/* JADX INFO: loaded from: classes3.dex */
public final class aiq implements AdsLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    aps f19863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f19864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ajx f19865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ajt f19866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ajj f19867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f19868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f19869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f19870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final akn f19871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImaSdkSettings f19872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final BaseDisplayContainer f19873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final alq f19874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final alx f19875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f19876n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final aze f19877o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final alm f19878p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final TestingConfiguration f19879q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ali f19880r;

    public aiq(Context context, Uri uri, ImaSdkSettings imaSdkSettings, BaseDisplayContainer baseDisplayContainer, ExecutorService executorService) {
        ajx ajxVar = new ajx(new ake(new Handler(Looper.getMainLooper()), new WebView(context), uri), context, uri, imaSdkSettings, executorService);
        this.f19866d = new aio(this);
        this.f19867e = new ajj();
        this.f19868f = new ArrayList(1);
        this.f19869g = new HashMap();
        this.f19870h = new HashMap();
        this.f19876n = new Object();
        this.f19865c = ajxVar;
        this.f19864b = context;
        this.f19872j = imaSdkSettings == null ? ImaSdkFactory.getInstance().createImaSdkSettings() : imaSdkSettings;
        this.f19873k = baseDisplayContainer;
        aze azeVarA = azh.a(executorService);
        this.f19877o = azeVarA;
        this.f19879q = imaSdkSettings.getTestingConfig();
        akn aknVar = new akn(ajxVar, context);
        this.f19871i = aknVar;
        alm almVar = new alm(ajxVar);
        this.f19878p = almVar;
        ajxVar.h(aknVar);
        baseDisplayContainer.claim();
        this.f19874l = new alq(context, azeVarA, almVar);
        this.f19875m = new alx(context, azeVarA, almVar);
        this.f19880r = new ali(context, false, 150L);
    }

    public static /* bridge */ /* synthetic */ void j(aiq aiqVar, AdsManagerLoadedEvent adsManagerLoadedEvent) {
        for (AdsLoader.AdsLoadedListener adsLoadedListener : aiqVar.f19868f) {
        }
    }

    public static final Object p(Future future) {
        if (future == null) {
            return null;
        }
        try {
            return azh.c(future);
        } catch (Exception e9) {
            com.google.ads.interactivemedia.v3.impl.data.m.b("Error during initialization", e9);
            return null;
        } catch (Throwable th) {
            com.google.ads.interactivemedia.v3.impl.data.m.b("Error during initialization", new Exception(th));
            return null;
        }
    }

    private final aip q() {
        ActivityInfo activityInfo;
        PackageManager packageManager = this.f19864b.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads.interactivemedia.v3")), 65536);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo == null) {
                return null;
            }
            return aip.create(packageInfo.versionCode, activityInfo.packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final com.google.ads.interactivemedia.v3.impl.data.ba r() {
        SharedPreferences sharedPreferencesA = AbstractC2996b.a(this.f19864b);
        if (sharedPreferencesA == null) {
            return null;
        }
        try {
            return com.google.ads.interactivemedia.v3.impl.data.ba.create(sharedPreferencesA.contains("IABTCF_gdprApplies") ? String.valueOf(sharedPreferencesA.getInt("IABTCF_gdprApplies", 0)) : "", sharedPreferencesA.getString("IABTCF_TCString", ""), sharedPreferencesA.getString("IABTCF_AddtlConsent", ""), sharedPreferencesA.getString("IABUSPrivacy_String", ""));
        } catch (ClassCastException e9) {
            com.google.ads.interactivemedia.v3.impl.data.m.b("Failed to read TCF Consent settings from SharedPreferences.", e9);
            return null;
        }
    }

    private final com.google.ads.interactivemedia.v3.impl.data.cd s() {
        NetworkCapabilities networkCapabilities;
        Integer numValueOf;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f19864b.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                com.google.ads.interactivemedia.v3.impl.data.m.d("Host application doesn't have ACCESS_NETWORK_STATE permission");
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f19864b.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                    numValueOf = Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps());
                }
            }
            numValueOf = null;
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return com.google.ads.interactivemedia.v3.impl.data.cd.create(numValueOf);
    }

    private final String t() {
        TestingConfiguration testingConfiguration = this.f19879q;
        if (testingConfiguration == null || !testingConfiguration.ignoreStrictModeFalsePositives()) {
            return UUID.randomUUID().toString();
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
        String string = UUID.randomUUID().toString();
        StrictMode.setThreadPolicy(threadPolicy);
        return string;
    }

    private final String u() {
        return String.format("android%s:%s:%s", Build.VERSION.RELEASE, "3.29.0", this.f19864b.getPackageName());
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f19867e.a(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void addAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.f19868f.add(adsLoadedListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void contentComplete() {
        this.f19865c.o(new ajr(ajp.adsLoader, ajq.contentComplete, "*"));
    }

    public final /* synthetic */ String f(AdsRequest adsRequest) throws Exception {
        String adTagUrl = adsRequest.getAdTagUrl();
        m();
        if (adTagUrl == null) {
            return adTagUrl;
        }
        try {
            Uri uri = Uri.parse(adTagUrl);
            aps apsVar = this.f19863a;
            return (apsVar == null || !apsVar.c(uri)) ? adTagUrl : this.f19863a.a(uri, this.f19864b).toString();
        } catch (RemoteException | aqb | IllegalStateException unused) {
            return adTagUrl;
        }
    }

    public final /* synthetic */ String g() throws Exception {
        Context context = this.f19864b;
        m();
        try {
            aps apsVar = this.f19863a;
            if (apsVar != null) {
                return apsVar.b(context);
            }
        } catch (RemoteException unused) {
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final ImaSdkSettings getSettings() {
        return this.f19872j;
    }

    public final /* synthetic */ void k(Task task) {
        List<String> list;
        com.google.ads.interactivemedia.v3.impl.data.bm bmVar = (com.google.ads.interactivemedia.v3.impl.data.bm) task.getResult();
        this.f19878p.d(bmVar.enableInstrumentation);
        Integer num = bmVar.espAdapterTimeoutMs;
        if (num != null && (list = bmVar.espAdapters) != null) {
            this.f19875m.h(list, num);
            this.f19875m.g();
        }
        Integer num2 = bmVar.platformSignalCollectorTimeoutMs;
        if (num2 != null) {
            this.f19874l.c(num2);
        }
        this.f19880r = new ali(this.f19864b, !bmVar.disableAppSetId, bmVar.appSetIdTimeoutMs);
    }

    public final void l() {
        this.f19865c.c().addOnCompleteListener(this.f19877o, new ajm(this, 1));
    }

    public final void m() {
        synchronized (this.f19876n) {
            if (this.f19863a == null) {
                try {
                    afl aflVarL = aff.l();
                    aflVarL.k(afg.f19431b);
                    aflVarL.j();
                    aflVarL.h();
                    aflVarL.i();
                    this.f19863a = new aps(this.f19864b, this.f19877o, (aff) aflVarL.aY());
                } catch (RuntimeException unused) {
                    this.f19863a = null;
                }
            }
        }
    }

    public final /* synthetic */ void n(AdsRequest adsRequest, azd azdVar, AdDisplayContainer adDisplayContainer, azd azdVar2, azd azdVar3, azd azdVar4, String str) throws Exception {
        SecureSignals secureSignals = adsRequest.getSecureSignals();
        List list = (List) p(azdVar);
        com.google.ads.interactivemedia.v3.impl.data.y.a(secureSignals, list);
        com.google.ads.interactivemedia.v3.impl.data.bg bgVar = (com.google.ads.interactivemedia.v3.impl.data.bg) azh.c(azdVar2);
        Map map = (Map) p(azdVar4);
        ajr ajrVar = new ajr(ajp.adsLoader, ajq.requestAds, str, com.google.ads.interactivemedia.v3.impl.data.bf.create(adsRequest, u(), r(), list, map, "android:0", s(), this.f19872j, q(), com.google.ads.interactivemedia.v3.impl.data.k.b(this.f19864b, this.f19879q), bgVar, adDisplayContainer));
        this.f19865c.j(bgVar);
        this.f19865c.o(ajrVar);
    }

    public final /* synthetic */ void o(StreamRequest streamRequest, azd azdVar, azd azdVar2, azd azdVar3, azd azdVar4, String str) throws Exception {
        SecureSignals secureSignals = streamRequest.getSecureSignals();
        List list = (List) p(azdVar);
        com.google.ads.interactivemedia.v3.impl.data.y.a(secureSignals, list);
        StreamDisplayContainer streamDisplayContainer = (StreamDisplayContainer) this.f19873k;
        com.google.ads.interactivemedia.v3.impl.data.bg bgVar = (com.google.ads.interactivemedia.v3.impl.data.bg) azh.c(azdVar2);
        String str2 = (String) azh.c(azdVar3);
        Map map = (Map) p(azdVar4);
        ajr ajrVar = new ajr(ajp.adsLoader, ajq.requestStream, str, com.google.ads.interactivemedia.v3.impl.data.bf.createFromStreamRequest(streamRequest, u(), r(), list, map, "android:0", s(), this.f19872j, q(), com.google.ads.interactivemedia.v3.impl.data.k.b(this.f19864b, this.f19879q), str2, bgVar, streamDisplayContainer));
        this.f19865c.j(bgVar);
        this.f19865c.o(ajrVar);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void release() {
        this.f19873k.destroy();
        ajx ajxVar = this.f19865c;
        if (ajxVar != null) {
            ajxVar.l();
        }
        this.f19869g.clear();
        this.f19868f.clear();
        this.f19867e.b();
        this.f19870h.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f19867e.d(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void removeAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.f19868f.remove(adsLoadedListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void requestAds(final AdsRequest adsRequest) {
        int i9 = 3;
        int i10 = 0;
        int i11 = 1;
        final String strT = t();
        if (adsRequest == null) {
            this.f19867e.c(new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsRequest cannot be null.")));
            return;
        }
        BaseDisplayContainer baseDisplayContainer = this.f19873k;
        if (!(baseDisplayContainer instanceof AdDisplayContainer)) {
            this.f19867e.c(new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsLoader must be constructed with AdDisplayContainer.")));
            return;
        }
        if (baseDisplayContainer.getAdContainer() == null) {
            this.f19867e.c(new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must have a UI container.")));
            return;
        }
        if (atp.c(adsRequest.getAdTagUrl()) && atp.c(adsRequest.getAdsResponse())) {
            this.f19867e.c(new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad tag url must non-null and non empty.")));
            return;
        }
        final AdDisplayContainer adDisplayContainer = (AdDisplayContainer) this.f19873k;
        if (adDisplayContainer.getPlayer() == null) {
            this.f19878p.a(com.google.ads.interactivemedia.v3.impl.data.bi.ADS_LOADER, com.google.ads.interactivemedia.v3.impl.data.bj.CREATE_SDK_OWNED_PLAYER);
            adDisplayContainer.setPlayer(ImaSdkFactory.createSdkOwnedPlayer(this.f19864b, adDisplayContainer.getAdContainer()));
        }
        this.f19869g.put(strT, adsRequest);
        this.f19865c.f(this.f19866d, strT);
        this.f19865c.e(adDisplayContainer, strT);
        aze azeVar = this.f19877o;
        ali aliVar = this.f19880r;
        aliVar.getClass();
        final azd azdVarSubmit = azeVar.submit(new aik(aliVar, i11));
        final azd azdVarSubmit2 = this.f19877o.submit(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.aim
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19852a.f(adsRequest);
            }
        });
        aze azeVar2 = this.f19877o;
        alx alxVar = this.f19875m;
        alxVar.getClass();
        final azd azdVarSubmit3 = azeVar2.submit(new aik(alxVar, i10));
        aze azeVar3 = this.f19877o;
        alq alqVar = this.f19874l;
        alqVar.getClass();
        final azd azdVarSubmit4 = azeVar3.submit(new aik(alqVar, i9));
        this.f19878p.c(azh.b(azdVarSubmit, azdVarSubmit2, azdVarSubmit3, azdVarSubmit4).a(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.ain
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f19854a.n(adsRequest, azdVarSubmit3, adDisplayContainer, azdVarSubmit, azdVarSubmit2, azdVarSubmit4, strT);
                return null;
            }
        }, this.f19877o), this.f19877o, com.google.ads.interactivemedia.v3.impl.data.bi.ADS_LOADER, com.google.ads.interactivemedia.v3.impl.data.bj.REQUEST_ADS);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final String requestStream(final StreamRequest streamRequest) {
        ajj ajjVar;
        aif aifVar;
        int i9 = 3;
        int i10 = 2;
        int i11 = 0;
        int i12 = 1;
        final String strT = t();
        if (streamRequest == null) {
            ajjVar = this.f19867e;
            aifVar = new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "StreamRequest cannot be null."));
        } else {
            BaseDisplayContainer baseDisplayContainer = this.f19873k;
            if (!(baseDisplayContainer instanceof StreamDisplayContainer)) {
                ajjVar = this.f19867e;
                aifVar = new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsLoader must be constructed with StreamDisplayContainer."));
            } else {
                if (((StreamDisplayContainer) baseDisplayContainer).getVideoStreamPlayer() != null) {
                    this.f19870h.put(strT, streamRequest);
                    this.f19865c.f(this.f19866d, strT);
                    this.f19865c.e(this.f19873k, strT);
                    aze azeVar = this.f19877o;
                    ali aliVar = this.f19880r;
                    aliVar.getClass();
                    final azd azdVarSubmit = azeVar.submit(new aik(aliVar, i12));
                    aze azeVar2 = this.f19877o;
                    alx alxVar = this.f19875m;
                    alxVar.getClass();
                    final azd azdVarSubmit2 = azeVar2.submit(new aik(alxVar, i11));
                    final azd azdVarSubmit3 = this.f19877o.submit(new aik(this, i10));
                    aze azeVar3 = this.f19877o;
                    alq alqVar = this.f19874l;
                    alqVar.getClass();
                    final azd azdVarSubmit4 = azeVar3.submit(new aik(alqVar, i9));
                    this.f19878p.c(azh.b(azdVarSubmit, azdVarSubmit2, azdVarSubmit3, azdVarSubmit4).a(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.ail
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws Exception {
                            this.f19845a.o(streamRequest, azdVarSubmit2, azdVarSubmit, azdVarSubmit3, azdVarSubmit4, strT);
                            return null;
                        }
                    }, this.f19877o), this.f19877o, com.google.ads.interactivemedia.v3.impl.data.bi.ADS_LOADER, com.google.ads.interactivemedia.v3.impl.data.bj.REQUEST_STREAM);
                    return strT;
                }
                ajjVar = this.f19867e;
                aifVar = new aif(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream requests must specify a player."));
            }
        }
        ajjVar.c(aifVar);
        return strT;
    }
}
