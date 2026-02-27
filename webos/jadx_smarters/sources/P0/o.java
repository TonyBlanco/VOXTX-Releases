package P0;

import P0.a;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.b f6882a = new a.b(Features.VISUAL_STATE_CALLBACK, Features.VISUAL_STATE_CALLBACK);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.b f6883b = new a.b(Features.OFF_SCREEN_PRERASTER, Features.OFF_SCREEN_PRERASTER);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.e f6884c = new a.e(Features.SAFE_BROWSING_ENABLE, Features.SAFE_BROWSING_ENABLE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.c f6885d = new a.c(Features.DISABLED_ACTION_MODE_MENU_ITEMS, Features.DISABLED_ACTION_MODE_MENU_ITEMS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.f f6886e = new a.f(Features.START_SAFE_BROWSING, Features.START_SAFE_BROWSING);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a.f f6887f = new a.f(Features.SAFE_BROWSING_WHITELIST, Features.SAFE_BROWSING_WHITELIST);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a.f f6888g = new a.f(Features.SAFE_BROWSING_WHITELIST, Features.SAFE_BROWSING_ALLOWLIST);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a.f f6889h = new a.f(Features.SAFE_BROWSING_ALLOWLIST, Features.SAFE_BROWSING_WHITELIST);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a.f f6890i = new a.f(Features.SAFE_BROWSING_ALLOWLIST, Features.SAFE_BROWSING_ALLOWLIST);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a.f f6891j = new a.f(Features.SAFE_BROWSING_PRIVACY_POLICY_URL, Features.SAFE_BROWSING_PRIVACY_POLICY_URL);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a.c f6892k = new a.c(Features.SERVICE_WORKER_BASIC_USAGE, Features.SERVICE_WORKER_BASIC_USAGE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a.c f6893l = new a.c(Features.SERVICE_WORKER_CACHE_MODE, Features.SERVICE_WORKER_CACHE_MODE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a.c f6894m = new a.c(Features.SERVICE_WORKER_CONTENT_ACCESS, Features.SERVICE_WORKER_CONTENT_ACCESS);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a.c f6895n = new a.c(Features.SERVICE_WORKER_FILE_ACCESS, Features.SERVICE_WORKER_FILE_ACCESS);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a.c f6896o = new a.c(Features.SERVICE_WORKER_BLOCK_NETWORK_LOADS, Features.SERVICE_WORKER_BLOCK_NETWORK_LOADS);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a.c f6897p = new a.c(Features.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, Features.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a.b f6898q = new a.b(Features.RECEIVE_WEB_RESOURCE_ERROR, Features.RECEIVE_WEB_RESOURCE_ERROR);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a.b f6899r = new a.b(Features.RECEIVE_HTTP_ERROR, Features.RECEIVE_HTTP_ERROR);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a.c f6900s = new a.c(Features.SHOULD_OVERRIDE_WITH_REDIRECTS, Features.SHOULD_OVERRIDE_WITH_REDIRECTS);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a.f f6901t = new a.f(Features.SAFE_BROWSING_HIT, Features.SAFE_BROWSING_HIT);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a.c f6902u = new a.c(Features.WEB_RESOURCE_REQUEST_IS_REDIRECT, Features.WEB_RESOURCE_REQUEST_IS_REDIRECT);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a.b f6903v = new a.b(Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION, Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a.b f6904w = new a.b(Features.WEB_RESOURCE_ERROR_GET_CODE, Features.WEB_RESOURCE_ERROR_GET_CODE);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a.f f6905x = new a.f(Features.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, Features.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a.f f6906y = new a.f(Features.SAFE_BROWSING_RESPONSE_PROCEED, Features.SAFE_BROWSING_RESPONSE_PROCEED);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a.f f6907z = new a.f(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a.b f6858A = new a.b(Features.WEB_MESSAGE_PORT_POST_MESSAGE, Features.WEB_MESSAGE_PORT_POST_MESSAGE);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a.b f6859B = new a.b(Features.WEB_MESSAGE_PORT_CLOSE, Features.WEB_MESSAGE_PORT_CLOSE);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a.b f6860C = new a.b(Features.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, Features.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a.b f6861D = new a.b(Features.CREATE_WEB_MESSAGE_CHANNEL, Features.CREATE_WEB_MESSAGE_CHANNEL);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final a.b f6862E = new a.b(Features.POST_WEB_MESSAGE, Features.POST_WEB_MESSAGE);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final a.b f6863F = new a.b(Features.WEB_MESSAGE_CALLBACK_ON_MESSAGE, Features.WEB_MESSAGE_CALLBACK_ON_MESSAGE);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final a.e f6864G = new a.e(Features.GET_WEB_VIEW_CLIENT, Features.GET_WEB_VIEW_CLIENT);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a.e f6865H = new a.e(Features.GET_WEB_CHROME_CLIENT, Features.GET_WEB_CHROME_CLIENT);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final a.h f6866I = new a.h(Features.GET_WEB_VIEW_RENDERER, Features.GET_WEB_VIEW_RENDERER);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final a.h f6867J = new a.h(Features.WEB_VIEW_RENDERER_TERMINATE, Features.WEB_VIEW_RENDERER_TERMINATE);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final a.g f6868K = new a.g(Features.TRACING_CONTROLLER_BASIC_USAGE, Features.TRACING_CONTROLLER_BASIC_USAGE);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a.h f6869L = new a.h(Features.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, Features.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final a.d f6870M = new a.d("PROXY_OVERRIDE", Features.PROXY_OVERRIDE);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final a.d f6871N = new a.d(Features.SUPPRESS_ERROR_PAGE, Features.SUPPRESS_ERROR_PAGE);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final a.d f6872O = new a.d("MULTI_PROCESS", Features.MULTI_PROCESS_QUERY);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final a.d f6873P = new a.d(Features.FORCE_DARK, Features.FORCE_DARK);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final a.d f6874Q = new a.d("FORCE_DARK_STRATEGY", Features.FORCE_DARK_BEHAVIOR);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final a.d f6875R = new a.d(Features.ALGORITHMIC_DARKENING, Features.ALGORITHMIC_DARKENING);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final a.d f6876S = new a.d(Features.WEB_MESSAGE_LISTENER, Features.WEB_MESSAGE_LISTENER);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final a.d f6877T = new a.d("DOCUMENT_START_SCRIPT", Features.DOCUMENT_START_SCRIPT);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final a.d f6878U = new a.d(Features.PROXY_OVERRIDE_REVERSE_BYPASS, Features.PROXY_OVERRIDE_REVERSE_BYPASS);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final a.d f6879V = new a.d(Features.GET_VARIATIONS_HEADER, Features.GET_VARIATIONS_HEADER);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final a.d f6880W = new a.d(Features.REQUESTED_WITH_HEADER_CONTROL, Features.REQUESTED_WITH_HEADER_CONTROL);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a.d f6881X = new a.d(Features.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY, Features.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY);

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, a.d());
    }

    public static boolean c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.a().equals(str)) {
                hashSet.add(iVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((i) it2.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
