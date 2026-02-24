package W7;

import W7.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.amazonaws.services.s3.util.Mimetypes;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class b extends WebView implements W7.c, d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f10336a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f10337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W7.f f10338d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10339a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f10340c;

        public a(String str, float f9) {
            this.f10339a = str;
            this.f10340c = f9;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:loadVideo('" + this.f10339a + "', " + this.f10340c + ")");
        }
    }

    /* JADX INFO: renamed from: W7.b$b, reason: collision with other inner class name */
    public class RunnableC0135b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10342a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f10343c;

        public RunnableC0135b(String str, float f9) {
            this.f10342a = str;
            this.f10343c = f9;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:cueVideo('" + this.f10342a + "', " + this.f10343c + ")");
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:playVideo()");
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:pauseVideo()");
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f10347a;

        public e(float f9) {
            this.f10347a = f9;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.loadUrl("javascript:seekTo(" + this.f10347a + ")");
        }
    }

    public class f extends WebChromeClient {
        public f() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
        }
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f10337c = new Handler(Looper.getMainLooper());
        this.f10336a = new HashSet();
    }

    @Override // W7.c
    public void a(String str, float f9) {
        this.f10337c.post(new RunnableC0135b(str, f9));
    }

    @Override // W7.c
    public boolean b(g gVar) {
        if (gVar != null) {
            return this.f10336a.add(gVar);
        }
        Log.e("YouTubePlayer", "null YouTubePlayerListener not allowed.");
        return false;
    }

    @Override // W7.d.k
    public void c() {
        this.f10338d.a(this);
    }

    @Override // W7.c
    public void d(String str, float f9) {
        this.f10337c.post(new a(str, f9));
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f10336a.clear();
        this.f10337c.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @Override // W7.c
    public void e(float f9) {
        this.f10337c.post(new e(f9));
    }

    @Override // W7.d.k
    public Collection f() {
        return Collections.unmodifiableCollection(new HashSet(this.f10336a));
    }

    public final void g() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(2);
        settings.setMediaPlaybackRequiresUserGesture(false);
        addJavascriptInterface(new W7.d(this), "YouTubePlayerBridge");
        loadDataWithBaseURL("https://www.youtube.com", i(), Mimetypes.MIMETYPE_HTML, "utf-8", null);
        setWebChromeClient(new f());
    }

    public void h(W7.f fVar) {
        this.f10338d = fVar;
        g();
    }

    public final String i() {
        try {
            InputStream inputStreamOpenRawResource = getResources().openRawResource(V7.e.f10154a);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "utf-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    inputStreamOpenRawResource.close();
                    return sb.toString();
                }
                sb.append(line);
                sb.append("\n");
            }
        } catch (Exception unused) {
            throw new RuntimeException("Can't parse HTML file containing the player.");
        }
    }

    @Override // W7.c
    public void pause() {
        this.f10337c.post(new d());
    }

    @Override // W7.c
    public void play() {
        this.f10337c.post(new c());
    }
}
