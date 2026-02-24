package androidx.mediarouter.app;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.OverlayListView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2;
import u0.C2811K;
import u0.C2812L;
import y0.C2981b;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f16047t0 = Log.isLoggable("MediaRouteCtrlDialog", 3);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f16048u0 = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RelativeLayout f16049A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f16050B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f16051C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public OverlayListView f16052D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public r f16053E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public List f16054F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Set f16055G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Set f16056H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Set f16057I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SeekBar f16058J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public q f16059K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C2812L.h f16060L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f16061M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f16062N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f16063O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f16064P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Map f16065Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public MediaControllerCompat f16066R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public o f16067S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public PlaybackStateCompat f16068T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public MediaDescriptionCompat f16069U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public n f16070V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Bitmap f16071W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Uri f16072X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f16073Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Bitmap f16074Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2812L f16075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f16076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2812L.h f16077e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f16078e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f16079f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f16080f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16081g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f16082g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16083h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f16084h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16085i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f16086i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f16087j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f16088j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f16089k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f16090k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f16091l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f16092l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageButton f16093m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f16094m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageButton f16095n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Interpolator f16096n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MediaRouteExpandCollapseButton f16097o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Interpolator f16098o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FrameLayout f16099p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Interpolator f16100p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f16101q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Interpolator f16102q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FrameLayout f16103r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AccessibilityManager f16104r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FrameLayout f16105s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Runnable f16106s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f16107t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f16108u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f16109v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f16110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16111x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f16112y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f16113z;

    public class a implements OverlayListView.a.InterfaceC0183a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2812L.h f16114a;

        public a(C2812L.h hVar) {
            this.f16114a = hVar;
        }

        @Override // androidx.mediarouter.app.OverlayListView.a.InterfaceC0183a
        public void a() {
            c.this.f16057I.remove(this.f16114a);
            c.this.f16053E.notifyDataSetChanged();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            c.this.f16052D.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            c.this.F();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.c$c, reason: collision with other inner class name */
    public class AnimationAnimationListenerC0185c implements Animation.AnimationListener {
        public AnimationAnimationListenerC0185c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c.this.o(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PendingIntent sessionActivity;
            MediaControllerCompat mediaControllerCompat = c.this.f16066R;
            if (mediaControllerCompat == null || (sessionActivity = mediaControllerCompat.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                c.this.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = c.this;
            boolean z9 = !cVar.f16084h0;
            cVar.f16084h0 = z9;
            if (z9) {
                cVar.f16052D.setVisibility(0);
            }
            c.this.z();
            c.this.I(true);
        }
    }

    public class i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f16123a;

        public i(boolean z9) {
            this.f16123a = z9;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            c.this.f16103r.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            c cVar = c.this;
            if (cVar.f16086i0) {
                cVar.f16088j0 = true;
            } else {
                cVar.J(this.f16123a);
            }
        }
    }

    public class j extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f16125a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f16126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f16127d;

        public j(int i9, int i10, View view) {
            this.f16125a = i9;
            this.f16126c = i10;
            this.f16127d = view;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f9, Transformation transformation) {
            c.C(this.f16127d, this.f16125a - ((int) ((r3 - this.f16126c) * f9)));
        }
    }

    public class k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f16129a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f16130c;

        public k(Map map, Map map2) {
            this.f16129a = map;
            this.f16130c = map2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            c.this.f16052D.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            c.this.i(this.f16129a, this.f16130c);
        }
    }

    public class l implements Animation.AnimationListener {
        public l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            c.this.f16052D.b();
            c cVar = c.this;
            cVar.f16052D.postDelayed(cVar.f16106s0, cVar.f16090k0);
        }
    }

    public final class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                if (c.this.f16077e.C()) {
                    c.this.f16075c.z(id == 16908313 ? 2 : 1);
                }
            } else {
                if (id == t0.f.f50510C) {
                    c cVar = c.this;
                    if (cVar.f16066R == null || (playbackStateCompat = cVar.f16068T) == null) {
                        return;
                    }
                    int i9 = 0;
                    int i10 = playbackStateCompat.getState() != 3 ? 0 : 1;
                    if (i10 != 0 && c.this.v()) {
                        c.this.f16066R.getTransportControls().pause();
                        i9 = t0.j.f50590l;
                    } else if (i10 != 0 && c.this.x()) {
                        c.this.f16066R.getTransportControls().stop();
                        i9 = t0.j.f50592n;
                    } else if (i10 == 0 && c.this.w()) {
                        c.this.f16066R.getTransportControls().play();
                        i9 = t0.j.f50591m;
                    }
                    AccessibilityManager accessibilityManager = c.this.f16104r0;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled() || i9 == 0) {
                        return;
                    }
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(Http2.INITIAL_MAX_FRAME_SIZE);
                    accessibilityEventObtain.setPackageName(c.this.f16079f.getPackageName());
                    accessibilityEventObtain.setClassName(m.class.getName());
                    accessibilityEventObtain.getText().add(c.this.f16079f.getString(i9));
                    c.this.f16104r0.sendAccessibilityEvent(accessibilityEventObtain);
                    return;
                }
                if (id != t0.f.f50508A) {
                    return;
                }
            }
            c.this.dismiss();
        }
    }

    public class n extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f16134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f16135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f16137d;

        public n() {
            MediaDescriptionCompat mediaDescriptionCompat = c.this.f16069U;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (c.s(iconBitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                iconBitmap = null;
            }
            this.f16134a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = c.this.f16069U;
            this.f16135b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStreamE;
            Bitmap bitmap = this.f16134a;
            ?? r42 = 0;
            if (bitmap == null) {
                Uri uri = this.f16135b;
                try {
                    if (uri != null) {
                        try {
                            inputStreamE = e(uri);
                            try {
                                if (inputStreamE == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f16135b);
                                    if (inputStreamE != null) {
                                        try {
                                            inputStreamE.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    return null;
                                }
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(inputStreamE, null, options);
                                if (options.outWidth == 0 || options.outHeight == 0) {
                                    try {
                                        inputStreamE.close();
                                    } catch (IOException unused2) {
                                    }
                                    return null;
                                }
                                try {
                                    inputStreamE.reset();
                                } catch (IOException unused3) {
                                    inputStreamE.close();
                                    inputStreamE = e(this.f16135b);
                                    if (inputStreamE == null) {
                                        Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f16135b);
                                        if (inputStreamE != null) {
                                            try {
                                                inputStreamE.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        return null;
                                    }
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / c.this.p(options.outWidth, options.outHeight)));
                                if (isCancelled()) {
                                    try {
                                        inputStreamE.close();
                                    } catch (IOException unused5) {
                                    }
                                    return null;
                                }
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamE, null, options);
                                try {
                                    inputStreamE.close();
                                } catch (IOException unused6) {
                                }
                                bitmap = bitmapDecodeStream;
                            } catch (IOException e9) {
                                e = e9;
                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f16135b, e);
                                if (inputStreamE != null) {
                                    try {
                                        inputStreamE.close();
                                    } catch (IOException unused7) {
                                    }
                                }
                                bitmap = null;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            inputStreamE = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r42 != 0) {
                                try {
                                    r42.close();
                                } catch (IOException unused8) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        bitmap = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r42 = uri;
                }
            }
            if (c.s(bitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                C2981b c2981bB = new C2981b.C0483b(bitmap).d(1).b();
                this.f16136c = c2981bB.h().isEmpty() ? 0 : ((C2981b.e) c2981bB.h().get(0)).e();
            }
            return bitmap;
        }

        public Bitmap b() {
            return this.f16134a;
        }

        public Uri c() {
            return this.f16135b;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            c cVar = c.this;
            cVar.f16070V = null;
            if (O.c.a(cVar.f16071W, this.f16134a) && O.c.a(c.this.f16072X, this.f16135b)) {
                return;
            }
            c cVar2 = c.this;
            cVar2.f16071W = this.f16134a;
            cVar2.f16074Z = bitmap;
            cVar2.f16072X = this.f16135b;
            cVar2.f16078e0 = this.f16136c;
            cVar2.f16073Y = true;
            c.this.G(SystemClock.uptimeMillis() - this.f16137d > 120);
        }

        public final InputStream e(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                inputStreamOpenInputStream = c.this.f16079f.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                int i9 = c.f16048u0;
                uRLConnectionOpenConnection.setConnectTimeout(i9);
                uRLConnectionOpenConnection.setReadTimeout(i9);
                inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f16137d = SystemClock.uptimeMillis();
            c.this.m();
        }
    }

    public final class o extends MediaControllerCompat.Callback {
        public o() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            c.this.f16069U = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            c.this.H();
            c.this.G(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            c cVar = c.this;
            cVar.f16068T = playbackStateCompat;
            cVar.G(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            c cVar = c.this;
            MediaControllerCompat mediaControllerCompat = cVar.f16066R;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(cVar.f16067S);
                c.this.f16066R = null;
            }
        }
    }

    public final class p extends C2812L.a {
        public p() {
        }

        @Override // u0.C2812L.a
        public void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
            c.this.G(true);
        }

        @Override // u0.C2812L.a
        public void onRouteUnselected(C2812L c2812l, C2812L.h hVar) {
            c.this.G(false);
        }

        @Override // u0.C2812L.a
        public void onRouteVolumeChanged(C2812L c2812l, C2812L.h hVar) {
            SeekBar seekBar = (SeekBar) c.this.f16065Q.get(hVar);
            int iS = hVar.s();
            if (c.f16047t0) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + iS);
            }
            if (seekBar == null || c.this.f16060L == hVar) {
                return;
            }
            seekBar.setProgress(iS);
        }
    }

    public class q implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f16141a = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                if (cVar.f16060L != null) {
                    cVar.f16060L = null;
                    if (cVar.f16080f0) {
                        cVar.G(cVar.f16082g0);
                    }
                }
            }
        }

        public q() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            if (z9) {
                C2812L.h hVar = (C2812L.h) seekBar.getTag();
                if (c.f16047t0) {
                    Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i9 + ")");
                }
                hVar.G(i9);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            c cVar = c.this;
            if (cVar.f16060L != null) {
                cVar.f16058J.removeCallbacks(this.f16141a);
            }
            c.this.f16060L = (C2812L.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            c.this.f16058J.postDelayed(this.f16141a, 500L);
        }
    }

    public class r extends ArrayAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f16144a;

        public r(Context context, List list) {
            super(context, 0, list);
            this.f16144a = androidx.mediarouter.app.i.h(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i9, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(t0.i.f50575i, viewGroup, false);
            } else {
                c.this.N(view);
            }
            C2812L.h hVar = (C2812L.h) getItem(i9);
            if (hVar != null) {
                boolean zX = hVar.x();
                TextView textView = (TextView) view.findViewById(t0.f.f50521N);
                textView.setEnabled(zX);
                textView.setText(hVar.m());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(t0.f.f50532Y);
                androidx.mediarouter.app.i.w(viewGroup.getContext(), mediaRouteVolumeSlider, c.this.f16052D);
                mediaRouteVolumeSlider.setTag(hVar);
                c.this.f16065Q.put(hVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.c(!zX);
                mediaRouteVolumeSlider.setEnabled(zX);
                if (zX) {
                    if (c.this.y(hVar)) {
                        mediaRouteVolumeSlider.setMax(hVar.u());
                        mediaRouteVolumeSlider.setProgress(hVar.s());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(c.this.f16059K);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(t0.f.f50531X)).setAlpha(zX ? 255 : (int) (this.f16144a * 255.0f));
                ((LinearLayout) view.findViewById(t0.f.f50533Z)).setVisibility(c.this.f16057I.contains(hVar) ? 4 : 0);
                Set set = c.this.f16055G;
                if (set != null && set.contains(hVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i9) {
            return false;
        }
    }

    public c(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, int i9) {
        Context contextB = androidx.mediarouter.app.i.b(context, i9, true);
        super(contextB, androidx.mediarouter.app.i.c(contextB));
        this.f16111x = true;
        this.f16106s0 = new d();
        this.f16079f = getContext();
        this.f16067S = new o();
        C2812L c2812lJ = C2812L.j(this.f16079f);
        this.f16075c = c2812lJ;
        this.f16112y = C2812L.o();
        this.f16076d = new p();
        this.f16077e = c2812lJ.n();
        D(c2812lJ.k());
        this.f16064P = this.f16079f.getResources().getDimensionPixelSize(t0.d.f50499e);
        this.f16104r0 = (AccessibilityManager) this.f16079f.getSystemService("accessibility");
        this.f16098o0 = AnimationUtils.loadInterpolator(contextB, t0.h.f50566b);
        this.f16100p0 = AnimationUtils.loadInterpolator(contextB, t0.h.f50565a);
        this.f16102q0 = new AccelerateDecelerateInterpolator();
    }

    public static void C(View view, int i9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i9;
        view.setLayoutParams(layoutParams);
    }

    public static boolean O(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    private void j(View view, int i9) {
        j jVar = new j(q(view), i9, view);
        jVar.setDuration(this.f16090k0);
        jVar.setInterpolator(this.f16096n0);
        view.startAnimation(jVar);
    }

    public static int q(View view) {
        return view.getLayoutParams().height;
    }

    public static boolean s(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public View A(Bundle bundle) {
        return null;
    }

    public final void B(boolean z9) {
        List listL = this.f16077e.l();
        if (listL.isEmpty()) {
            this.f16054F.clear();
        } else if (!androidx.mediarouter.app.f.i(this.f16054F, listL)) {
            HashMap mapE = z9 ? androidx.mediarouter.app.f.e(this.f16052D, this.f16053E) : null;
            HashMap mapD = z9 ? androidx.mediarouter.app.f.d(this.f16079f, this.f16052D, this.f16053E) : null;
            this.f16055G = androidx.mediarouter.app.f.f(this.f16054F, listL);
            this.f16056H = androidx.mediarouter.app.f.g(this.f16054F, listL);
            this.f16054F.addAll(0, this.f16055G);
            this.f16054F.removeAll(this.f16056H);
            this.f16053E.notifyDataSetChanged();
            if (z9 && this.f16084h0 && this.f16055G.size() + this.f16056H.size() > 0) {
                h(mapE, mapD);
                return;
            } else {
                this.f16055G = null;
                this.f16056H = null;
                return;
            }
        }
        this.f16053E.notifyDataSetChanged();
    }

    public final void D(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.f16066R;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.f16067S);
            this.f16066R = null;
        }
        if (token != null && this.f16083h) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f16079f, token);
            this.f16066R = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(this.f16067S);
            MediaMetadataCompat metadata = this.f16066R.getMetadata();
            this.f16069U = metadata != null ? metadata.getDescription() : null;
            this.f16068T = this.f16066R.getPlaybackState();
            H();
            G(false);
        }
    }

    public void E() {
        l(true);
        this.f16052D.requestLayout();
        this.f16052D.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    public void F() {
        Set set = this.f16055G;
        if (set == null || set.size() == 0) {
            o(true);
        } else {
            n();
        }
    }

    public void G(boolean z9) {
        if (this.f16060L != null) {
            this.f16080f0 = true;
            this.f16082g0 = z9 | this.f16082g0;
            return;
        }
        this.f16080f0 = false;
        this.f16082g0 = false;
        if (!this.f16077e.C() || this.f16077e.w()) {
            dismiss();
            return;
        }
        if (this.f16081g) {
            this.f16110w.setText(this.f16077e.m());
            this.f16089k.setVisibility(this.f16077e.a() ? 0 : 8);
            if (this.f16087j == null && this.f16073Y) {
                if (s(this.f16074Z)) {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f16074Z);
                } else {
                    this.f16107t.setImageBitmap(this.f16074Z);
                    this.f16107t.setBackgroundColor(this.f16078e0);
                }
                m();
            }
            M();
            L();
            I(z9);
        }
    }

    public void H() {
        if (this.f16087j == null && u()) {
            if (!t() || this.f16112y) {
                n nVar = this.f16070V;
                if (nVar != null) {
                    nVar.cancel(true);
                }
                n nVar2 = new n();
                this.f16070V = nVar2;
                nVar2.execute(new Void[0]);
            }
        }
    }

    public void I(boolean z9) {
        this.f16103r.requestLayout();
        this.f16103r.getViewTreeObserver().addOnGlobalLayoutListener(new i(z9));
    }

    public void J(boolean z9) {
        int iP;
        Bitmap bitmap;
        int iQ = q(this.f16113z);
        C(this.f16113z, -1);
        K(k());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        C(this.f16113z, iQ);
        if (this.f16087j == null && (this.f16107t.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.f16107t.getDrawable()).getBitmap()) != null) {
            iP = p(bitmap.getWidth(), bitmap.getHeight());
            this.f16107t.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        } else {
            iP = 0;
        }
        int iR = r(k());
        int size = this.f16054F.size();
        int size2 = t() ? this.f16062N * this.f16077e.l().size() : 0;
        if (size > 0) {
            size2 += this.f16064P;
        }
        int iMin = Math.min(size2, this.f16063O);
        if (!this.f16084h0) {
            iMin = 0;
        }
        int iMax = Math.max(iP, iMin) + iR;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (this.f16101q.getMeasuredHeight() - this.f16103r.getMeasuredHeight());
        if (this.f16087j != null || iP <= 0 || iMax > iHeight) {
            if (q(this.f16052D) + this.f16113z.getMeasuredHeight() >= this.f16103r.getMeasuredHeight()) {
                this.f16107t.setVisibility(8);
            }
            iMax = iMin + iR;
            iP = 0;
        } else {
            this.f16107t.setVisibility(0);
            C(this.f16107t, iP);
        }
        if (!k() || iMax > iHeight) {
            this.f16049A.setVisibility(8);
        } else {
            this.f16049A.setVisibility(0);
        }
        K(this.f16049A.getVisibility() == 0);
        int iR2 = r(this.f16049A.getVisibility() == 0);
        int iMax2 = Math.max(iP, iMin) + iR2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        this.f16113z.clearAnimation();
        this.f16052D.clearAnimation();
        this.f16103r.clearAnimation();
        LinearLayout linearLayout = this.f16113z;
        if (z9) {
            j(linearLayout, iR2);
            j(this.f16052D, iMin);
            j(this.f16103r, iHeight);
        } else {
            C(linearLayout, iR2);
            C(this.f16052D, iMin);
            C(this.f16103r, iHeight);
        }
        C(this.f16099p, rect.height());
        B(z9);
    }

    public final void K(boolean z9) {
        int i9 = 0;
        this.f16051C.setVisibility((this.f16050B.getVisibility() == 0 && z9) ? 0 : 8);
        LinearLayout linearLayout = this.f16113z;
        if (this.f16050B.getVisibility() == 8 && !z9) {
            i9 = 8;
        }
        linearLayout.setVisibility(i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.c.L():void");
    }

    public final void M() {
        if (!this.f16112y && t()) {
            this.f16050B.setVisibility(8);
            this.f16084h0 = true;
            this.f16052D.setVisibility(0);
            z();
            I(false);
            return;
        }
        if ((this.f16084h0 && !this.f16112y) || !y(this.f16077e)) {
            this.f16050B.setVisibility(8);
        } else if (this.f16050B.getVisibility() == 8) {
            this.f16050B.setVisibility(0);
            this.f16058J.setMax(this.f16077e.u());
            this.f16058J.setProgress(this.f16077e.s());
            this.f16097o.setVisibility(t() ? 0 : 8);
        }
    }

    public void N(View view) {
        C((LinearLayout) view.findViewById(t0.f.f50533Z), this.f16062N);
        View viewFindViewById = view.findViewById(t0.f.f50531X);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        int i9 = this.f16061M;
        layoutParams.width = i9;
        layoutParams.height = i9;
        viewFindViewById.setLayoutParams(layoutParams);
    }

    public final void h(Map map, Map map2) {
        this.f16052D.setEnabled(false);
        this.f16052D.requestLayout();
        this.f16086i0 = true;
        this.f16052D.getViewTreeObserver().addOnGlobalLayoutListener(new k(map, map2));
    }

    public void i(Map map, Map map2) {
        OverlayListView.a aVarD;
        Set set = this.f16055G;
        if (set == null || this.f16056H == null) {
            return;
        }
        int size = set.size() - this.f16056H.size();
        l lVar = new l();
        int firstVisiblePosition = this.f16052D.getFirstVisiblePosition();
        boolean z9 = false;
        for (int i9 = 0; i9 < this.f16052D.getChildCount(); i9++) {
            View childAt = this.f16052D.getChildAt(i9);
            Object obj = (C2812L.h) this.f16053E.getItem(firstVisiblePosition + i9);
            Rect rect = (Rect) map.get(obj);
            int top = childAt.getTop();
            int i10 = rect != null ? rect.top : (this.f16062N * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set set2 = this.f16055G;
            if (set2 != null && set2.contains(obj)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(this.f16092l0);
                animationSet.addAnimation(alphaAnimation);
                i10 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i10 - top, 0.0f);
            translateAnimation.setDuration(this.f16090k0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.f16096n0);
            if (!z9) {
                animationSet.setAnimationListener(lVar);
                z9 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(obj);
            map2.remove(obj);
        }
        for (Map.Entry entry : map2.entrySet()) {
            C2812L.h hVar = (C2812L.h) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(hVar);
            if (this.f16056H.contains(hVar)) {
                aVarD = new OverlayListView.a(bitmapDrawable, rect2).c(1.0f, 0.0f).e(this.f16094m0).f(this.f16096n0);
            } else {
                aVarD = new OverlayListView.a(bitmapDrawable, rect2).g(this.f16062N * size).e(this.f16090k0).f(this.f16096n0).d(new a(hVar));
                this.f16057I.add(hVar);
            }
            this.f16052D.a(aVarD);
        }
    }

    public final boolean k() {
        return this.f16087j == null && !(this.f16069U == null && this.f16068T == null);
    }

    public void l(boolean z9) {
        Set set;
        int firstVisiblePosition = this.f16052D.getFirstVisiblePosition();
        for (int i9 = 0; i9 < this.f16052D.getChildCount(); i9++) {
            View childAt = this.f16052D.getChildAt(i9);
            C2812L.h hVar = (C2812L.h) this.f16053E.getItem(firstVisiblePosition + i9);
            if (!z9 || (set = this.f16055G) == null || !set.contains(hVar)) {
                ((LinearLayout) childAt.findViewById(t0.f.f50533Z)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.f16052D.c();
        if (z9) {
            return;
        }
        o(false);
    }

    public void m() {
        this.f16073Y = false;
        this.f16074Z = null;
        this.f16078e0 = 0;
    }

    public final void n() {
        AnimationAnimationListenerC0185c animationAnimationListenerC0185c = new AnimationAnimationListenerC0185c();
        int firstVisiblePosition = this.f16052D.getFirstVisiblePosition();
        boolean z9 = false;
        for (int i9 = 0; i9 < this.f16052D.getChildCount(); i9++) {
            View childAt = this.f16052D.getChildAt(i9);
            if (this.f16055G.contains((C2812L.h) this.f16053E.getItem(firstVisiblePosition + i9))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.f16092l0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z9) {
                    alphaAnimation.setAnimationListener(animationAnimationListenerC0185c);
                    z9 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    public void o(boolean z9) {
        this.f16055G = null;
        this.f16056H = null;
        this.f16086i0 = false;
        if (this.f16088j0) {
            this.f16088j0 = false;
            I(z9);
        }
        this.f16052D.setEnabled(true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16083h = true;
        this.f16075c.b(C2811K.f50924c, this.f16076d, 2);
        D(this.f16075c.k());
    }

    @Override // androidx.appcompat.app.a, d.DialogC1642u, androidx.activity.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(t0.i.f50574h);
        findViewById(R.id.button3).setVisibility(8);
        m mVar = new m();
        FrameLayout frameLayout = (FrameLayout) findViewById(t0.f.f50517J);
        this.f16099p = frameLayout;
        frameLayout.setOnClickListener(new e());
        LinearLayout linearLayout = (LinearLayout) findViewById(t0.f.f50516I);
        this.f16101q = linearLayout;
        linearLayout.setOnClickListener(new f());
        int iD = androidx.mediarouter.app.i.d(this.f16079f);
        Button button = (Button) findViewById(R.id.button2);
        this.f16089k = button;
        button.setText(t0.j.f50586h);
        this.f16089k.setTextColor(iD);
        this.f16089k.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(R.id.button1);
        this.f16091l = button2;
        button2.setText(t0.j.f50593o);
        this.f16091l.setTextColor(iD);
        this.f16091l.setOnClickListener(mVar);
        this.f16110w = (TextView) findViewById(t0.f.f50521N);
        ImageButton imageButton = (ImageButton) findViewById(t0.f.f50508A);
        this.f16095n = imageButton;
        imageButton.setOnClickListener(mVar);
        this.f16105s = (FrameLayout) findViewById(t0.f.f50514G);
        this.f16103r = (FrameLayout) findViewById(t0.f.f50515H);
        g gVar = new g();
        ImageView imageView = (ImageView) findViewById(t0.f.f50534a);
        this.f16107t = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(t0.f.f50513F).setOnClickListener(gVar);
        this.f16113z = (LinearLayout) findViewById(t0.f.f50520M);
        this.f16051C = findViewById(t0.f.f50509B);
        this.f16049A = (RelativeLayout) findViewById(t0.f.f50528U);
        this.f16108u = (TextView) findViewById(t0.f.f50512E);
        this.f16109v = (TextView) findViewById(t0.f.f50511D);
        ImageButton imageButton2 = (ImageButton) findViewById(t0.f.f50510C);
        this.f16093m = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(t0.f.f50529V);
        this.f16050B = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(t0.f.f50532Y);
        this.f16058J = seekBar;
        seekBar.setTag(this.f16077e);
        q qVar = new q();
        this.f16059K = qVar;
        this.f16058J.setOnSeekBarChangeListener(qVar);
        this.f16052D = (OverlayListView) findViewById(t0.f.f50530W);
        this.f16054F = new ArrayList();
        r rVar = new r(this.f16052D.getContext(), this.f16054F);
        this.f16053E = rVar;
        this.f16052D.setAdapter((ListAdapter) rVar);
        this.f16057I = new HashSet();
        androidx.mediarouter.app.i.u(this.f16079f, this.f16113z, this.f16052D, t());
        androidx.mediarouter.app.i.w(this.f16079f, (MediaRouteVolumeSlider) this.f16058J, this.f16113z);
        HashMap map = new HashMap();
        this.f16065Q = map;
        map.put(this.f16077e, this.f16058J);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(t0.f.f50518K);
        this.f16097o = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new h());
        z();
        this.f16090k0 = this.f16079f.getResources().getInteger(t0.g.f50561b);
        this.f16092l0 = this.f16079f.getResources().getInteger(t0.g.f50562c);
        this.f16094m0 = this.f16079f.getResources().getInteger(t0.g.f50563d);
        View viewA = A(bundle);
        this.f16087j = viewA;
        if (viewA != null) {
            this.f16105s.addView(viewA);
            this.f16105s.setVisibility(0);
        }
        this.f16081g = true;
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f16075c.s(this.f16076d);
        D(null);
        this.f16083h = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.a, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 != 25 && i9 != 24) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (this.f16112y || !this.f16084h0) {
            this.f16077e.H(i9 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // androidx.appcompat.app.a, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 == 25 || i9 == 24) {
            return true;
        }
        return super.onKeyUp(i9, keyEvent);
    }

    public int p(int i9, int i10) {
        return i9 >= i10 ? (int) (((this.f16085i * i10) / i9) + 0.5f) : (int) (((this.f16085i * 9.0f) / 16.0f) + 0.5f);
    }

    public final int r(boolean z9) {
        if (!z9 && this.f16050B.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = this.f16113z.getPaddingTop() + this.f16113z.getPaddingBottom();
        if (z9) {
            paddingTop += this.f16049A.getMeasuredHeight();
        }
        if (this.f16050B.getVisibility() == 0) {
            paddingTop += this.f16050B.getMeasuredHeight();
        }
        return (z9 && this.f16050B.getVisibility() == 0) ? this.f16051C.getMeasuredHeight() + paddingTop : paddingTop;
    }

    public final boolean t() {
        return this.f16077e.y() && this.f16077e.l().size() > 1;
    }

    public final boolean u() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f16069U;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f16069U;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        n nVar = this.f16070V;
        Bitmap bitmapB = nVar == null ? this.f16071W : nVar.b();
        n nVar2 = this.f16070V;
        Uri uriC = nVar2 == null ? this.f16072X : nVar2.c();
        if (bitmapB != iconBitmap) {
            return true;
        }
        return bitmapB == null && !O(uriC, iconUri);
    }

    public void updateLayout() {
        int iB = androidx.mediarouter.app.f.b(this.f16079f);
        getWindow().setLayout(iB, -2);
        View decorView = getWindow().getDecorView();
        this.f16085i = (iB - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.f16079f.getResources();
        this.f16061M = resources.getDimensionPixelSize(t0.d.f50497c);
        this.f16062N = resources.getDimensionPixelSize(t0.d.f50496b);
        this.f16063O = resources.getDimensionPixelSize(t0.d.f50498d);
        this.f16071W = null;
        this.f16072X = null;
        H();
        G(false);
    }

    public boolean v() {
        return (this.f16068T.getActions() & 514) != 0;
    }

    public boolean w() {
        return (this.f16068T.getActions() & 516) != 0;
    }

    public boolean x() {
        return (this.f16068T.getActions() & 1) != 0;
    }

    public boolean y(C2812L.h hVar) {
        return this.f16111x && hVar.t() == 1;
    }

    public void z() {
        this.f16096n0 = this.f16084h0 ? this.f16098o0 : this.f16100p0;
    }
}
