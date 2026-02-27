package O0;

import P0.o;
import P0.p;
import P0.q;
import P0.r;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f5409a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f5410b = Uri.parse("");

    public interface a {
        void onPostMessage(WebView webView, c cVar, Uri uri, boolean z9, O0.a aVar);
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (!o.f6876S.c()) {
            throw o.a();
        }
        d(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
    }

    public static WebViewProviderBoundaryInterface b(WebView webView) {
        return c().createWebView(webView);
    }

    public static r c() {
        return p.c();
    }

    public static q d(WebView webView) {
        return new q(b(webView));
    }
}
