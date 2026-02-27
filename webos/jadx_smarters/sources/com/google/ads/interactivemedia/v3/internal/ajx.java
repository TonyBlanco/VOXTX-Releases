package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: loaded from: classes3.dex */
public final class ajx implements akb, akc {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f19973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f19974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ake f19975i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f19977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f19978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TestingConfiguration f19979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TaskCompletionSource f19980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TaskCompletionSource f19981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private akl f19982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ajw f19983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f19984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19985s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19967a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f19968b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19969c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f19970d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f19971e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f19972f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Queue f19976j = new ConcurrentLinkedQueue();

    public ajx(ake akeVar, Context context, Uri uri, ImaSdkSettings imaSdkSettings, ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f19980n = taskCompletionSource;
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        this.f19981o = taskCompletionSource2;
        this.f19985s = false;
        this.f19973g = context;
        this.f19977k = context.getResources().getDisplayMetrics().density;
        boolean zA = O0.f.a(Features.WEB_MESSAGE_LISTENER);
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("sdk_version", "a.3.29.0").appendQueryParameter("hl", imaSdkSettings.getLanguage()).appendQueryParameter("omv", ago.a()).appendQueryParameter("app", context.getApplicationContext().getPackageName());
        builderAppendQueryParameter.appendQueryParameter("mt", true != zA ? "0" : "4");
        if (imaSdkSettings.getTestingConfig() != null) {
            bju bjuVar = new bju();
            bjuVar.c(new atg());
            bjuVar.d(new com.google.ads.interactivemedia.v3.impl.data.k());
            builderAppendQueryParameter.appendQueryParameter(TestingConfiguration.PARAMETER_KEY, bjuVar.a().g(imaSdkSettings.getTestingConfig()));
        }
        this.f19974h = builderAppendQueryParameter.build().toString();
        this.f19979m = imaSdkSettings.getTestingConfig();
        this.f19975i = akeVar;
        akeVar.g(this);
        this.f19978l = executorService;
        Tasks.whenAllComplete((Task<?>[]) new Task[]{taskCompletionSource2.getTask(), taskCompletionSource.getTask()}).addOnCompleteListener(new ajm(this, 2));
    }

    private static String q(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str + " Caused by: " + str2;
    }

    private final void r(ajp ajpVar, ajq ajqVar, String str, com.google.ads.interactivemedia.v3.impl.data.bm bmVar) {
        akw akwVar = (akw) this.f19972f.get(str);
        if (akwVar != null) {
            akwVar.f(ajpVar, ajqVar, bmVar);
            return;
        }
        com.google.ads.interactivemedia.v3.impl.data.m.d("Received " + String.valueOf(ajpVar) + " message: " + String.valueOf(ajqVar) + " for invalid session id: " + str);
    }

    private static final void s(String str, ajq ajqVar) {
        com.google.ads.interactivemedia.v3.impl.data.m.c("Illegal message type " + String.valueOf(ajqVar) + " received for " + str + " channel");
    }

    public final WebView a() {
        return this.f19975i.a();
    }

    public final TestingConfiguration b() {
        return this.f19979m;
    }

    public final Task c() {
        this.f19984r = SystemClock.elapsedRealtime();
        this.f19975i.e(this.f19974h);
        return this.f19981o.getTask();
    }

    public final void d(ajs ajsVar, String str) {
        this.f19967a.put(str, ajsVar);
    }

    public final void e(BaseDisplayContainer baseDisplayContainer, String str) {
        this.f19969c.put(str, baseDisplayContainer);
    }

    public final void f(ajt ajtVar, String str) {
        this.f19970d.put(str, ajtVar);
    }

    public final void g(ajv ajvVar, String str) {
        this.f19971e.put(str, ajvVar);
    }

    public final void h(ajw ajwVar) {
        this.f19983q = ajwVar;
    }

    public final void i(akw akwVar, String str) {
        this.f19972f.put(str, akwVar);
    }

    public final void j(com.google.ads.interactivemedia.v3.impl.data.bg bgVar) {
        this.f19980n.trySetResult(bgVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akb
    public final void k(ajr ajrVar) {
        com.google.ads.interactivemedia.v3.impl.data.c cVar;
        Map<String, CompanionData> map;
        String str;
        String str2;
        com.google.ads.interactivemedia.v3.impl.data.bm bmVar = (com.google.ads.interactivemedia.v3.impl.data.bm) ajrVar.e();
        String strF = ajrVar.f();
        ajq ajqVarB = ajrVar.b();
        com.google.ads.interactivemedia.v3.impl.data.m.c("Received js message: " + ajrVar.a().name() + " [" + ajqVarB.name() + "]");
        switch (ajrVar.a()) {
            case activityMonitor:
                if (!this.f19968b.contains(strF)) {
                    ajs ajsVar = (ajs) this.f19967a.get(strF);
                    if (ajsVar == null) {
                        com.google.ads.interactivemedia.v3.impl.data.m.d("Received monitor message: " + String.valueOf(ajqVarB) + " for invalid session id: " + strF);
                    } else if (bmVar == null) {
                        com.google.ads.interactivemedia.v3.impl.data.m.d("Received monitor message: " + String.valueOf(ajqVarB) + " for session id: " + strF + " with no data");
                    } else if (ajqVarB.ordinal() != 37) {
                        s(ajp.activityMonitor.toString(), ajqVarB);
                    } else {
                        ajsVar.h(bmVar.queryId, bmVar.eventId);
                    }
                }
                break;
            case adsLoader:
                ajt ajtVar = (ajt) this.f19970d.get(strF);
                if (ajtVar == null) {
                    com.google.ads.interactivemedia.v3.impl.data.m.a("Received request message: " + String.valueOf(ajqVarB) + " for invalid session id: " + strF);
                } else {
                    int iOrdinal = ajqVarB.ordinal();
                    if (iOrdinal != 11) {
                        if (iOrdinal == 31) {
                            ajtVar.a(strF, AdError.AdErrorType.LOAD, bmVar.errorCode, q(bmVar.errorMessage, bmVar.innerError));
                        } else if (iOrdinal != 68) {
                            s(ajp.adsLoader.toString(), ajqVarB);
                        } else {
                            ajtVar.c(strF, bmVar.streamId, bmVar.monitorAppLifecycle);
                            com.google.ads.interactivemedia.v3.impl.data.m.c("Stream initialized with streamId: ".concat(String.valueOf(bmVar.streamId)));
                        }
                    } else if (bmVar == null) {
                        ajtVar.d(strF, AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR);
                    } else {
                        ajtVar.b(strF, bmVar.adCuePoints, bmVar.internalCuePoints, bmVar.monitorAppLifecycle);
                    }
                }
                break;
            case adsManager:
                ajv ajvVar = (ajv) this.f19971e.get(strF);
                if (ajvVar != null) {
                    if (bmVar == null || (cVar = bmVar.adData) == null) {
                        cVar = null;
                    }
                    int iOrdinal2 = ajqVarB.ordinal();
                    if (iOrdinal2 == 12) {
                        ajvVar.b(new aju(AdEvent.AdEventType.ALL_ADS_COMPLETED, null));
                        break;
                    } else if (iOrdinal2 == 16) {
                        ajvVar.b(new aju(AdEvent.AdEventType.CLICKED, cVar));
                        break;
                    } else if (iOrdinal2 == 18) {
                        ajvVar.b(new aju(AdEvent.AdEventType.COMPLETED, cVar));
                        break;
                    } else if (iOrdinal2 == 25) {
                        aju ajuVar = new aju(AdEvent.AdEventType.CUEPOINTS_CHANGED, null);
                        ajuVar.f19964d = new ArrayList();
                        for (com.google.ads.interactivemedia.v3.impl.data.bb bbVar : bmVar.cuepoints) {
                            ajuVar.f19964d.add(new aji(bbVar.start(), bbVar.end(), bbVar.played()));
                        }
                        ajvVar.b(ajuVar);
                        break;
                    } else if (iOrdinal2 == 44) {
                        if (cVar != null) {
                            ajvVar.b(new aju(AdEvent.AdEventType.LOADED, cVar));
                        } else {
                            com.google.ads.interactivemedia.v3.impl.data.m.a("Ad loaded message requires adData");
                            ajvVar.g(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Ad loaded message did not contain adData.");
                        }
                        break;
                    } else if (iOrdinal2 == 52) {
                        ajvVar.b(new aju(AdEvent.AdEventType.PAUSED, cVar));
                        break;
                    } else if (iOrdinal2 == 61) {
                        ajvVar.b(new aju(AdEvent.AdEventType.RESUMED, cVar));
                        break;
                    } else if (iOrdinal2 == 69) {
                        ajvVar.b(new aju(AdEvent.AdEventType.THIRD_QUARTILE, cVar));
                        break;
                    } else if (iOrdinal2 != 77) {
                        if (iOrdinal2 == 20) {
                            ajvVar.b(new aju(AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED, null));
                            break;
                        } else if (iOrdinal2 == 21) {
                            ajvVar.b(new aju(AdEvent.AdEventType.CONTENT_RESUME_REQUESTED, null));
                            break;
                        } else if (iOrdinal2 == 31) {
                            ajvVar.f(AdError.AdErrorType.PLAY, bmVar.errorCode, q(bmVar.errorMessage, bmVar.innerError));
                            break;
                        } else if (iOrdinal2 == 32) {
                            ajvVar.b(new aju(AdEvent.AdEventType.FIRST_QUARTILE, cVar));
                            break;
                        } else if (iOrdinal2 == 39) {
                            ajvVar.b(new aju(AdEvent.AdEventType.ICON_FALLBACK_IMAGE_CLOSED, null));
                            break;
                        } else if (iOrdinal2 != 40) {
                            switch (iOrdinal2) {
                                case 1:
                                    ajvVar.b(new aju(AdEvent.AdEventType.AD_BREAK_ENDED, cVar));
                                    break;
                                case 2:
                                    aju ajuVar2 = new aju(AdEvent.AdEventType.AD_BREAK_FETCH_ERROR, null);
                                    ajuVar2.f19963c = avs.j(bmVar.adBreakTime);
                                    ajvVar.b(ajuVar2);
                                    break;
                                case 3:
                                    aju ajuVar3 = new aju(AdEvent.AdEventType.AD_BREAK_READY, null);
                                    ajuVar3.f19963c = avs.j(bmVar.adBreakTime);
                                    ajvVar.b(ajuVar3);
                                    break;
                                case 4:
                                    ajvVar.b(new aju(AdEvent.AdEventType.AD_BREAK_STARTED, cVar));
                                    break;
                                case 5:
                                    ajvVar.b(new aju(AdEvent.AdEventType.AD_BUFFERING, null));
                                    break;
                                case 6:
                                case 7:
                                    break;
                                case 8:
                                    ajvVar.b(new aju(AdEvent.AdEventType.AD_PERIOD_ENDED, null));
                                    break;
                                case 9:
                                    ajvVar.b(new aju(AdEvent.AdEventType.AD_PERIOD_STARTED, null));
                                    break;
                                case 10:
                                    aju ajuVar4 = new aju(AdEvent.AdEventType.AD_PROGRESS, cVar);
                                    ajuVar4.f19965e = new aij(bmVar.currentTime, bmVar.duration, bmVar.adPosition, bmVar.totalAds, bmVar.adBreakDuration, bmVar.adPeriodDuration);
                                    ajvVar.b(ajuVar4);
                                    break;
                                default:
                                    switch (iOrdinal2) {
                                        case 46:
                                            aju ajuVar5 = new aju(AdEvent.AdEventType.LOG, cVar);
                                            ajuVar5.f19963c = bmVar.logData.constructMap();
                                            ajvVar.b(ajuVar5);
                                            break;
                                        case 47:
                                            ajvVar.b(new aju(AdEvent.AdEventType.MIDPOINT, cVar));
                                            break;
                                        case 48:
                                            break;
                                        case 49:
                                            ajvVar.h(bmVar.url);
                                            break;
                                        default:
                                            switch (iOrdinal2) {
                                                case 63:
                                                    aju ajuVar6 = new aju(AdEvent.AdEventType.SKIPPED, null);
                                                    ajuVar6.f19966f = bmVar.seekTime;
                                                    ajvVar.b(ajuVar6);
                                                    break;
                                                case 64:
                                                    ajvVar.b(new aju(AdEvent.AdEventType.SKIPPABLE_STATE_CHANGED, cVar));
                                                    break;
                                                case 65:
                                                    ajvVar.b(new aju(AdEvent.AdEventType.STARTED, cVar));
                                                    break;
                                                default:
                                                    switch (iOrdinal2) {
                                                        case 73:
                                                            break;
                                                        case 74:
                                                            ajvVar.b(new aju(AdEvent.AdEventType.TAPPED, cVar));
                                                            break;
                                                        case 75:
                                                            ajvVar.b(new aju(AdEvent.AdEventType.ICON_TAPPED, null));
                                                            break;
                                                        default:
                                                            s(ajp.adsManager.toString(), ajqVarB);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                    }
                } else {
                    com.google.ads.interactivemedia.v3.impl.data.m.d("Received manager message: " + String.valueOf(ajqVarB) + " for invalid session id: " + strF);
                    break;
                }
                break;
            case contentTimeUpdate:
            case userInteraction:
            default:
                com.google.ads.interactivemedia.v3.impl.data.m.a("Unknown message channel: ".concat(String.valueOf(ajrVar.a())));
                break;
            case displayContainer:
                ajb ajbVar = (ajb) this.f19969c.get(strF);
                ajv ajvVar2 = (ajv) this.f19971e.get(strF);
                akw akwVar = (akw) this.f19972f.get(strF);
                if (ajbVar == null || ajvVar2 == null || akwVar == null) {
                    com.google.ads.interactivemedia.v3.impl.data.m.a("Received displayContainer message: " + String.valueOf(ajqVarB) + " for invalid session id: " + strF);
                    break;
                } else {
                    int iOrdinal3 = ajqVarB.ordinal();
                    if (iOrdinal3 == 28) {
                        if (bmVar == null || (map = bmVar.companions) == null) {
                            ajvVar2.g(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display companions message requires companions in data.");
                        } else {
                            Set<String> setKeySet = map.keySet();
                            HashMap mapP = axo.p(setKeySet.size());
                            for (String str3 : setKeySet) {
                                CompanionAdSlot companionAdSlot = (CompanionAdSlot) ajbVar.a().get(str3);
                                ViewGroup container = companionAdSlot != null ? companionAdSlot.getContainer() : null;
                                if (container != null) {
                                    mapP.put(str3, container);
                                } else {
                                    ajvVar2.g(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display requested for invalid companion slot.");
                                }
                            }
                            for (String str4 : mapP.keySet()) {
                                ajvVar2.i((ViewGroup) mapP.get(str4), bmVar.companions.get(str4), strF, (CompanionAdSlot) ajbVar.a().get(str4), this, new all(this.f19978l, this.f19977k));
                            }
                        }
                        break;
                    } else if (iOrdinal3 != 38 && iOrdinal3 != 62) {
                        if (iOrdinal3 == 59) {
                            ajvVar2.j(bmVar.resizeAndPositionVideo);
                        } else if (iOrdinal3 != 60) {
                            s(ajp.displayContainer.toString(), ajqVarB);
                        } else {
                            ajvVar2.k();
                        }
                        break;
                    }
                }
                break;
            case log:
            case webViewLoaded:
                int iOrdinal4 = ajqVarB.ordinal();
                if (iOrdinal4 == 42) {
                    this.f19981o.trySetResult(bmVar);
                    this.f19985s = true;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j9 = this.f19984r;
                    HashMap mapP2 = axo.p(1);
                    mapP2.put("webViewLoadingTime", Long.valueOf(jElapsedRealtime - j9));
                    o(new ajr(ajp.webViewLoaded, ajq.csi, strF, mapP2));
                } else if (iOrdinal4 != 46) {
                    s("other", ajqVarB);
                } else if (bmVar.ln == null || (str = bmVar.f18613n) == null || (str2 = bmVar.f18612m) == null) {
                    com.google.ads.interactivemedia.v3.impl.data.m.a("Invalid logging message data: ".concat(String.valueOf(bmVar)));
                } else {
                    String str5 = "JsMessage (" + str + "): " + str2;
                    char cCharAt = bmVar.ln.charAt(0);
                    if (cCharAt != 'D') {
                        if (cCharAt != 'E') {
                            if (cCharAt != 'I') {
                                if (cCharAt != 'S') {
                                    if (cCharAt != 'V') {
                                        if (cCharAt != 'W') {
                                            com.google.ads.interactivemedia.v3.impl.data.m.d("Unrecognized log level: ".concat(String.valueOf(bmVar.ln)));
                                            com.google.ads.interactivemedia.v3.impl.data.m.d(str5);
                                        } else {
                                            com.google.ads.interactivemedia.v3.impl.data.m.d(str5);
                                        }
                                    }
                                }
                            }
                        }
                        com.google.ads.interactivemedia.v3.impl.data.m.a(str5);
                    }
                    com.google.ads.interactivemedia.v3.impl.data.m.c(str5);
                }
                break;
            case nativeXhr:
                akl aklVar = this.f19982p;
                if (aklVar != null) {
                    aklVar.c(ajqVarB, strF, bmVar.networkRequest);
                } else {
                    com.google.ads.interactivemedia.v3.impl.data.m.a("Native network handler not initialized.");
                }
                break;
            case omid:
                if (this.f19983q == null) {
                    com.google.ads.interactivemedia.v3.impl.data.m.a("Null 'omidManagerListener': cannot send 'onOmidMessage'.");
                    break;
                } else {
                    int iOrdinal5 = ajqVarB.ordinal();
                    if (iOrdinal5 == 50) {
                        this.f19983q.b();
                        break;
                    } else if (iOrdinal5 == 51) {
                        this.f19983q.a();
                        break;
                    }
                }
                break;
            case videoDisplay1:
                r(ajp.videoDisplay1, ajqVarB, strF, bmVar);
                break;
            case videoDisplay2:
                r(ajp.videoDisplay2, ajqVarB, strF, bmVar);
                break;
        }
    }

    public final void l() {
        this.f19975i.b();
    }

    public final void m(String str) {
        this.f19967a.remove(str);
        this.f19968b.add(str);
    }

    public final void n(String str) {
        this.f19970d.remove(str);
        this.f19971e.remove(str);
        this.f19969c.remove(str);
        this.f19972f.remove(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final void o(ajr ajrVar) {
        com.google.ads.interactivemedia.v3.impl.data.m.c("Sending js message: " + ajrVar.a().name() + " [" + ajrVar.b().name() + "]");
        this.f19976j.add(ajrVar);
        if (!this.f19985s) {
            return;
        }
        while (true) {
            ajr ajrVar2 = (ajr) this.f19976j.poll();
            if (ajrVar2 == null) {
                return;
            } else {
                this.f19975i.h(ajrVar2);
            }
        }
    }

    public final /* synthetic */ void p() {
        com.google.ads.interactivemedia.v3.impl.data.bm bmVar = (com.google.ads.interactivemedia.v3.impl.data.bm) this.f19981o.getTask().getResult();
        com.google.ads.interactivemedia.v3.impl.data.bg bgVar = (com.google.ads.interactivemedia.v3.impl.data.bg) this.f19980n.getTask().getResult();
        Context context = this.f19973g;
        this.f19982p = new akl(this, this.f19978l, bmVar.enableGks ? new akk(context, bgVar) : new aki(null));
    }
}
