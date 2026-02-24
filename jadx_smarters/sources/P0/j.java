package P0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f6853a = new String[0];

    @Override // P0.r
    public String[] a() {
        return f6853a;
    }

    @Override // P0.r
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
