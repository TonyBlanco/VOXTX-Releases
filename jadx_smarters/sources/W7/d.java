package W7;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.Collection;
import java.util.Iterator;
import org.apache.http.client.config.CookieSpecs;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f10350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f10351b = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10352a;

        public a(String str) {
            this.f10352a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).c(this.f10352a);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).l();
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10355a;

        public c(int i9) {
            this.f10355a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).h(this.f10355a);
            }
        }
    }

    /* JADX INFO: renamed from: W7.d$d, reason: collision with other inner class name */
    public class RunnableC0136d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10357a;

        public RunnableC0136d(String str) {
            this.f10357a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).j(this.f10357a);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10359a;

        public e(String str) {
            this.f10359a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).i(this.f10359a);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10361a;

        public f(int i9) {
            this.f10361a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).onError(this.f10361a);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).f();
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f10364a;

        public h(float f9) {
            this.f10364a = f9;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).n(this.f10364a);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f10366a;

        public i(float f9) {
            this.f10366a = f9;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).e(this.f10366a);
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f10368a;

        public j(float f9) {
            this.f10368a = f9;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = d.this.f10350a.f().iterator();
            while (it.hasNext()) {
                ((W7.g) it.next()).k(this.f10368a);
            }
        }
    }

    public interface k {
        void c();

        Collection f();
    }

    public d(k kVar) {
        this.f10350a = kVar;
    }

    public final String b(String str) {
        return str.equalsIgnoreCase("small") ? "small" : str.equalsIgnoreCase("medium") ? "medium" : str.equalsIgnoreCase("large") ? "large" : str.equalsIgnoreCase("hd720") ? "hd720" : str.equalsIgnoreCase("hd1080") ? "hd1080" : str.equalsIgnoreCase("highres") ? "highres" : str.equalsIgnoreCase(CookieSpecs.DEFAULT) ? CookieSpecs.DEFAULT : "unknown";
    }

    public final String c(String str) {
        return str.equalsIgnoreCase("0.25") ? "0.25" : str.equalsIgnoreCase("0.5") ? "0.5" : str.equalsIgnoreCase("1") ? "1" : str.equalsIgnoreCase("1.5") ? "1.5" : str.equalsIgnoreCase("2") ? "2" : "-10";
    }

    public final int d(String str) {
        if (str.equalsIgnoreCase("2")) {
            return 0;
        }
        if (str.equalsIgnoreCase("5")) {
            return 1;
        }
        if (str.equalsIgnoreCase("100")) {
            return 2;
        }
        return (str.equalsIgnoreCase("101") || str.equalsIgnoreCase("150")) ? 3 : -10;
    }

    public final int e(String str) {
        if (str.equalsIgnoreCase("UNSTARTED")) {
            return -1;
        }
        if (str.equalsIgnoreCase("ENDED")) {
            return 0;
        }
        if (str.equalsIgnoreCase("PLAYING")) {
            return 1;
        }
        if (str.equalsIgnoreCase("PAUSED")) {
            return 2;
        }
        if (str.equalsIgnoreCase("BUFFERING")) {
            return 3;
        }
        return str.equalsIgnoreCase("CUED") ? 5 : -10;
    }

    @JavascriptInterface
    public void sendApiChange() {
        this.f10351b.post(new g());
    }

    @JavascriptInterface
    public void sendError(String str) {
        this.f10351b.post(new f(d(str)));
    }

    @JavascriptInterface
    public void sendPlaybackQualityChange(String str) {
        this.f10351b.post(new RunnableC0136d(b(str)));
    }

    @JavascriptInterface
    public void sendPlaybackRateChange(String str) {
        this.f10351b.post(new e(c(str)));
    }

    @JavascriptInterface
    public void sendReady() {
        this.f10351b.post(new b());
    }

    @JavascriptInterface
    public void sendStateChange(String str) {
        this.f10351b.post(new c(e(str)));
    }

    @JavascriptInterface
    public void sendVideoCurrentTime(String str) {
        try {
            this.f10351b.post(new h(Float.parseFloat(str)));
        } catch (NumberFormatException e9) {
            e9.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendVideoDuration(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.f10351b.post(new i(Float.parseFloat(str)));
        } catch (NumberFormatException e9) {
            e9.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendVideoId(String str) {
        this.f10351b.post(new a(str));
    }

    @JavascriptInterface
    public void sendVideoLoadedFraction(String str) {
        try {
            this.f10351b.post(new j(Float.parseFloat(str)));
        } catch (NumberFormatException e9) {
            e9.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendYouTubeIframeAPIReady() {
        this.f10350a.c();
    }
}
