package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import d.DialogC1642u;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u0.AbstractC2808H;
import u0.C2811K;
import u0.C2812L;
import y0.C2981b;

/* JADX INFO: loaded from: classes.dex */
public class h extends DialogC1642u {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final boolean f16185Q = Log.isLoggable("MediaRouteCtrlDialog", 3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ImageView f16186A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f16187B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ImageView f16188C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f16189D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f16190E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f16191F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public MediaControllerCompat f16192G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public e f16193H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public MediaDescriptionCompat f16194I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public d f16195J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Bitmap f16196K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Uri f16197L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f16198M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Bitmap f16199N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f16200O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f16201P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2812L f16202a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f16203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2811K f16204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2812L.h f16205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f16206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f16207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f16208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f16209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f16210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f16214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f16215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0186h f16216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f16217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map f16218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2812L.h f16219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f16220t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16221u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16222v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16224x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageButton f16225y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Button f16226z;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 1) {
                h.this.o();
                return;
            }
            if (i9 != 2) {
                return;
            }
            h hVar = h.this;
            if (hVar.f16219s != null) {
                hVar.f16219s = null;
                hVar.p();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (h.this.f16205e.C()) {
                h.this.f16202a.z(2);
            }
            h.this.dismiss();
        }
    }

    public class d extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f16230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f16231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16232c;

        public d() {
            MediaDescriptionCompat mediaDescriptionCompat = h.this.f16194I;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (h.h(iconBitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                iconBitmap = null;
            }
            this.f16230a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = h.this.f16194I;
            this.f16231b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStreamE;
            Bitmap bitmap = this.f16230a;
            ?? r42 = 0;
            if (bitmap == null) {
                Uri uri = this.f16231b;
                try {
                    if (uri != null) {
                        try {
                            inputStreamE = e(uri);
                            try {
                                if (inputStreamE == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f16231b);
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
                                    inputStreamE = e(this.f16231b);
                                    if (inputStreamE == null) {
                                        Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f16231b);
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
                                options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / h.this.f16210j.getResources().getDimensionPixelSize(t0.d.f50495a)));
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
                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + this.f16231b, e);
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
            if (h.h(bitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                C2981b c2981bB = new C2981b.C0483b(bitmap).d(1).b();
                this.f16232c = c2981bB.h().isEmpty() ? 0 : ((C2981b.e) c2981bB.h().get(0)).e();
            }
            return bitmap;
        }

        public Bitmap b() {
            return this.f16230a;
        }

        public Uri c() {
            return this.f16231b;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            h hVar = h.this;
            hVar.f16195J = null;
            if (O.c.a(hVar.f16196K, this.f16230a) && O.c.a(h.this.f16197L, this.f16231b)) {
                return;
            }
            h hVar2 = h.this;
            hVar2.f16196K = this.f16230a;
            hVar2.f16199N = bitmap;
            hVar2.f16197L = this.f16231b;
            hVar2.f16200O = this.f16232c;
            hVar2.f16198M = true;
            hVar2.m();
        }

        public final InputStream e(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                inputStreamOpenInputStream = h.this.f16210j.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(30000);
                uRLConnectionOpenConnection.setReadTimeout(30000);
                inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            h.this.f();
        }
    }

    public final class e extends MediaControllerCompat.Callback {
        public e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            h.this.f16194I = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            h.this.i();
            h.this.m();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            h hVar = h.this;
            MediaControllerCompat mediaControllerCompat = hVar.f16192G;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(hVar.f16193H);
                h.this.f16192G = null;
            }
        }
    }

    public abstract class f extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public C2812L.h f16235t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final ImageButton f16236u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MediaRouteVolumeSlider f16237v;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                h hVar = h.this;
                if (hVar.f16219s != null) {
                    hVar.f16214n.removeMessages(2);
                }
                f fVar = f.this;
                h.this.f16219s = fVar.f16235t;
                boolean z9 = !view.isActivated();
                int iQ = z9 ? 0 : f.this.Q();
                f.this.R(z9);
                f.this.f16237v.setProgress(iQ);
                f.this.f16235t.G(iQ);
                h.this.f16214n.sendEmptyMessageDelayed(2, 500L);
            }
        }

        public f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.f16236u = imageButton;
            this.f16237v = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(androidx.mediarouter.app.i.k(h.this.f16210j));
            androidx.mediarouter.app.i.v(h.this.f16210j, mediaRouteVolumeSlider);
        }

        public void P(C2812L.h hVar) {
            this.f16235t = hVar;
            int iS = hVar.s();
            this.f16236u.setActivated(iS == 0);
            this.f16236u.setOnClickListener(new a());
            this.f16237v.setTag(this.f16235t);
            this.f16237v.setMax(hVar.u());
            this.f16237v.setProgress(iS);
            this.f16237v.setOnSeekBarChangeListener(h.this.f16217q);
        }

        public int Q() {
            Integer num = (Integer) h.this.f16220t.get(this.f16235t.k());
            if (num == null) {
                return 1;
            }
            return Math.max(1, num.intValue());
        }

        public void R(boolean z9) {
            if (this.f16236u.isActivated() == z9) {
                return;
            }
            this.f16236u.setActivated(z9);
            if (z9) {
                h.this.f16220t.put(this.f16235t.k(), Integer.valueOf(this.f16237v.getProgress()));
            } else {
                h.this.f16220t.remove(this.f16235t.k());
            }
        }

        public void S() {
            int iS = this.f16235t.s();
            R(iS == 0);
            this.f16237v.setProgress(iS);
        }
    }

    public final class g extends C2812L.a {
        public g() {
        }

        @Override // u0.C2812L.a
        public void onRouteAdded(C2812L c2812l, C2812L.h hVar) {
            h.this.o();
        }

        @Override // u0.C2812L.a
        public void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
            C2812L.h.a aVarH;
            if (hVar == h.this.f16205e && hVar.g() != null) {
                for (C2812L.h hVar2 : hVar.q().f()) {
                    if (!h.this.f16205e.l().contains(hVar2) && (aVarH = h.this.f16205e.h(hVar2)) != null && aVarH.b() && !h.this.f16207g.contains(hVar2)) {
                        h.this.p();
                        h.this.n();
                        return;
                    }
                }
            }
            h.this.o();
        }

        @Override // u0.C2812L.a
        public void onRouteRemoved(C2812L c2812l, C2812L.h hVar) {
            h.this.o();
        }

        @Override // u0.C2812L.a
        public void onRouteSelected(C2812L c2812l, C2812L.h hVar) {
            h hVar2 = h.this;
            hVar2.f16205e = hVar;
            hVar2.f16221u = false;
            hVar2.p();
            h.this.n();
        }

        @Override // u0.C2812L.a
        public void onRouteUnselected(C2812L c2812l, C2812L.h hVar) {
            h.this.o();
        }

        @Override // u0.C2812L.a
        public void onRouteVolumeChanged(C2812L c2812l, C2812L.h hVar) {
            f fVar;
            int iS = hVar.s();
            if (h.f16185Q) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + iS);
            }
            h hVar2 = h.this;
            if (hVar2.f16219s == hVar || (fVar = (f) hVar2.f16218r.get(hVar.k())) == null) {
                return;
            }
            fVar.S();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.h$h, reason: collision with other inner class name */
    public final class C0186h extends RecyclerView.g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LayoutInflater f16242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Drawable f16243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Drawable f16244g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Drawable f16245h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Drawable f16246i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public f f16247j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f16248k;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f16241d = new ArrayList();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Interpolator f16249l = new AccelerateDecelerateInterpolator();

        /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$a */
        public class a extends Animation {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f16251a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f16252c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ View f16253d;

            public a(int i9, int i10, View view) {
                this.f16251a = i9;
                this.f16252c = i10;
                this.f16253d = view;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f9, Transformation transformation) {
                int i9 = this.f16251a;
                h.j(this.f16253d, this.f16252c + ((int) ((i9 - r0) * f9)));
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$b */
        public class b implements Animation.AnimationListener {
            public b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                h hVar = h.this;
                hVar.f16222v = false;
                hVar.p();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                h.this.f16222v = true;
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$c */
        public class c extends RecyclerView.D {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final View f16256t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final ImageView f16257u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final ProgressBar f16258v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final TextView f16259w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final float f16260x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public C2812L.h f16261y;

            /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$c$a */
            public class a implements View.OnClickListener {
                public a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    c cVar = c.this;
                    h.this.f16202a.y(cVar.f16261y);
                    c.this.f16257u.setVisibility(4);
                    c.this.f16258v.setVisibility(0);
                }
            }

            public c(View view) {
                super(view);
                this.f16256t = view;
                this.f16257u = (ImageView) view.findViewById(t0.f.f50537d);
                ProgressBar progressBar = (ProgressBar) view.findViewById(t0.f.f50539f);
                this.f16258v = progressBar;
                this.f16259w = (TextView) view.findViewById(t0.f.f50538e);
                this.f16260x = androidx.mediarouter.app.i.h(h.this.f16210j);
                androidx.mediarouter.app.i.t(h.this.f16210j, progressBar);
            }

            private boolean Q(C2812L.h hVar) {
                List listL = h.this.f16205e.l();
                return (listL.size() == 1 && listL.get(0) == hVar) ? false : true;
            }

            public void P(f fVar) {
                C2812L.h hVar = (C2812L.h) fVar.a();
                this.f16261y = hVar;
                this.f16257u.setVisibility(0);
                this.f16258v.setVisibility(4);
                this.f16256t.setAlpha(Q(hVar) ? 1.0f : this.f16260x);
                this.f16256t.setOnClickListener(new a());
                this.f16257u.setImageDrawable(C0186h.this.l0(hVar));
                this.f16259w.setText(hVar.m());
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$d */
        public class d extends f {

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final TextView f16264x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final int f16265y;

            public d(View view) {
                super(view, (ImageButton) view.findViewById(t0.f.f50547n), (MediaRouteVolumeSlider) view.findViewById(t0.f.f50553t));
                this.f16264x = (TextView) view.findViewById(t0.f.f50519L);
                Resources resources = h.this.f16210j.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(t0.d.f50503i, typedValue, true);
                this.f16265y = (int) typedValue.getDimension(displayMetrics);
            }

            public void T(f fVar) {
                h.j(this.f16733a, C0186h.this.n0() ? this.f16265y : 0);
                C2812L.h hVar = (C2812L.h) fVar.a();
                super.P(hVar);
                this.f16264x.setText(hVar.m());
            }

            public int U() {
                return this.f16265y;
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$e */
        public class e extends RecyclerView.D {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final TextView f16267t;

            public e(View view) {
                super(view);
                this.f16267t = (TextView) view.findViewById(t0.f.f50540g);
            }

            public void P(f fVar) {
                this.f16267t.setText(fVar.a().toString());
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$f */
        public class f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f16269a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f16270b;

            public f(Object obj, int i9) {
                this.f16269a = obj;
                this.f16270b = i9;
            }

            public Object a() {
                return this.f16269a;
            }

            public int b() {
                return this.f16270b;
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$g */
        public class g extends f {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            public final TextView f16272A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            public final RelativeLayout f16273B;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public final CheckBox f16274C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public final float f16275D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            public final int f16276E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            public final int f16277F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            public final View.OnClickListener f16278G;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final View f16280x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final ImageView f16281y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final ProgressBar f16282z;

            /* JADX INFO: renamed from: androidx.mediarouter.app.h$h$g$a */
            public class a implements View.OnClickListener {
                public a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    g gVar = g.this;
                    boolean z9 = !gVar.V(gVar.f16235t);
                    boolean zY = g.this.f16235t.y();
                    g gVar2 = g.this;
                    C2812L c2812l = h.this.f16202a;
                    C2812L.h hVar = gVar2.f16235t;
                    if (z9) {
                        c2812l.c(hVar);
                    } else {
                        c2812l.t(hVar);
                    }
                    g.this.W(z9, !zY);
                    if (zY) {
                        List listL = h.this.f16205e.l();
                        for (C2812L.h hVar2 : g.this.f16235t.l()) {
                            if (listL.contains(hVar2) != z9) {
                                f fVar = (f) h.this.f16218r.get(hVar2.k());
                                if (fVar instanceof g) {
                                    ((g) fVar).W(z9, true);
                                }
                            }
                        }
                    }
                    g gVar3 = g.this;
                    C0186h.this.p0(gVar3.f16235t, z9);
                }
            }

            public g(View view) {
                super(view, (ImageButton) view.findViewById(t0.f.f50547n), (MediaRouteVolumeSlider) view.findViewById(t0.f.f50553t));
                this.f16278G = new a();
                this.f16280x = view;
                this.f16281y = (ImageView) view.findViewById(t0.f.f50548o);
                ProgressBar progressBar = (ProgressBar) view.findViewById(t0.f.f50550q);
                this.f16282z = progressBar;
                this.f16272A = (TextView) view.findViewById(t0.f.f50549p);
                this.f16273B = (RelativeLayout) view.findViewById(t0.f.f50552s);
                CheckBox checkBox = (CheckBox) view.findViewById(t0.f.f50535b);
                this.f16274C = checkBox;
                checkBox.setButtonDrawable(androidx.mediarouter.app.i.e(h.this.f16210j));
                androidx.mediarouter.app.i.t(h.this.f16210j, progressBar);
                this.f16275D = androidx.mediarouter.app.i.h(h.this.f16210j);
                Resources resources = h.this.f16210j.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(t0.d.f50502h, typedValue, true);
                this.f16276E = (int) typedValue.getDimension(displayMetrics);
                this.f16277F = 0;
            }

            public void T(f fVar) {
                C2812L.h hVar = (C2812L.h) fVar.a();
                if (hVar == h.this.f16205e && hVar.l().size() > 0) {
                    Iterator it = hVar.l().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C2812L.h hVar2 = (C2812L.h) it.next();
                        if (!h.this.f16207g.contains(hVar2)) {
                            hVar = hVar2;
                            break;
                        }
                    }
                }
                P(hVar);
                this.f16281y.setImageDrawable(C0186h.this.l0(hVar));
                this.f16272A.setText(hVar.m());
                this.f16274C.setVisibility(0);
                boolean zV = V(hVar);
                boolean zU = U(hVar);
                this.f16274C.setChecked(zV);
                this.f16282z.setVisibility(4);
                this.f16281y.setVisibility(0);
                this.f16280x.setEnabled(zU);
                this.f16274C.setEnabled(zU);
                this.f16236u.setEnabled(zU || zV);
                this.f16237v.setEnabled(zU || zV);
                this.f16280x.setOnClickListener(this.f16278G);
                this.f16274C.setOnClickListener(this.f16278G);
                h.j(this.f16273B, (!zV || this.f16235t.y()) ? this.f16277F : this.f16276E);
                float f9 = 1.0f;
                this.f16280x.setAlpha((zU || zV) ? 1.0f : this.f16275D);
                CheckBox checkBox = this.f16274C;
                if (!zU && zV) {
                    f9 = this.f16275D;
                }
                checkBox.setAlpha(f9);
            }

            public final boolean U(C2812L.h hVar) {
                if (h.this.f16209i.contains(hVar)) {
                    return false;
                }
                if (V(hVar) && h.this.f16205e.l().size() < 2) {
                    return false;
                }
                if (!V(hVar)) {
                    return true;
                }
                C2812L.h.a aVarH = h.this.f16205e.h(hVar);
                return aVarH != null && aVarH.d();
            }

            public boolean V(C2812L.h hVar) {
                if (hVar.C()) {
                    return true;
                }
                C2812L.h.a aVarH = h.this.f16205e.h(hVar);
                return aVarH != null && aVarH.a() == 3;
            }

            public void W(boolean z9, boolean z10) {
                this.f16274C.setEnabled(false);
                this.f16280x.setEnabled(false);
                this.f16274C.setChecked(z9);
                if (z9) {
                    this.f16281y.setVisibility(4);
                    this.f16282z.setVisibility(0);
                }
                if (z10) {
                    C0186h.this.j0(this.f16273B, z9 ? this.f16276E : this.f16277F);
                }
            }
        }

        public C0186h() {
            this.f16242e = LayoutInflater.from(h.this.f16210j);
            this.f16243f = androidx.mediarouter.app.i.g(h.this.f16210j);
            this.f16244g = androidx.mediarouter.app.i.q(h.this.f16210j);
            this.f16245h = androidx.mediarouter.app.i.m(h.this.f16210j);
            this.f16246i = androidx.mediarouter.app.i.n(h.this.f16210j);
            this.f16248k = h.this.f16210j.getResources().getInteger(t0.g.f50560a);
            r0();
        }

        private Drawable k0(C2812L.h hVar) {
            int iF = hVar.f();
            return iF != 1 ? iF != 2 ? hVar.y() ? this.f16246i : this.f16243f : this.f16245h : this.f16244g;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void E(RecyclerView.D d9, int i9) {
            int iP = p(i9);
            f fVarM0 = m0(i9);
            if (iP == 1) {
                h.this.f16218r.put(((C2812L.h) fVarM0.a()).k(), (f) d9);
                ((d) d9).T(fVarM0);
            } else {
                if (iP == 2) {
                    ((e) d9).P(fVarM0);
                    return;
                }
                if (iP == 3) {
                    h.this.f16218r.put(((C2812L.h) fVarM0.a()).k(), (f) d9);
                    ((g) d9).T(fVarM0);
                } else if (iP != 4) {
                    Log.w("MediaRouteCtrlDialog", "Cannot bind item to ViewHolder because of wrong view type");
                } else {
                    ((c) d9).P(fVarM0);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public RecyclerView.D L(ViewGroup viewGroup, int i9) {
            if (i9 == 1) {
                return new d(this.f16242e.inflate(t0.i.f50569c, viewGroup, false));
            }
            if (i9 == 2) {
                return new e(this.f16242e.inflate(t0.i.f50570d, viewGroup, false));
            }
            if (i9 == 3) {
                return new g(this.f16242e.inflate(t0.i.f50571e, viewGroup, false));
            }
            if (i9 == 4) {
                return new c(this.f16242e.inflate(t0.i.f50568b, viewGroup, false));
            }
            Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void Z(RecyclerView.D d9) {
            super.Z(d9);
            h.this.f16218r.values().remove(d9);
        }

        public void j0(View view, int i9) {
            a aVar = new a(i9, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b());
            aVar.setDuration(this.f16248k);
            aVar.setInterpolator(this.f16249l);
            view.startAnimation(aVar);
        }

        public Drawable l0(C2812L.h hVar) {
            Uri uriJ = hVar.j();
            if (uriJ != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(h.this.f16210j.getContentResolver().openInputStream(uriJ), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e9) {
                    Log.w("MediaRouteCtrlDialog", "Failed to load " + uriJ, e9);
                }
            }
            return k0(hVar);
        }

        public f m0(int i9) {
            return i9 == 0 ? this.f16247j : (f) this.f16241d.get(i9 - 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int n() {
            return this.f16241d.size() + 1;
        }

        public boolean n0() {
            h hVar = h.this;
            return hVar.f16201P && hVar.f16205e.l().size() > 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int p(int i9) {
            return m0(i9).b();
        }

        public void p0(C2812L.h hVar, boolean z9) {
            List listL = h.this.f16205e.l();
            int iMax = Math.max(1, listL.size());
            if (hVar.y()) {
                Iterator it = hVar.l().iterator();
                while (it.hasNext()) {
                    if (listL.contains((C2812L.h) it.next()) != z9) {
                        iMax += z9 ? 1 : -1;
                    }
                }
            } else {
                iMax += z9 ? 1 : -1;
            }
            boolean zN0 = n0();
            h hVar2 = h.this;
            boolean z10 = hVar2.f16201P && iMax >= 2;
            if (zN0 != z10) {
                RecyclerView.D dZ = hVar2.f16215o.Z(0);
                if (dZ instanceof d) {
                    d dVar = (d) dZ;
                    j0(dVar.f16733a, z10 ? dVar.U() : 0);
                }
            }
        }

        public void q0() {
            h.this.f16209i.clear();
            h hVar = h.this;
            hVar.f16209i.addAll(androidx.mediarouter.app.f.g(hVar.f16207g, hVar.g()));
            w();
        }

        public void r0() {
            this.f16241d.clear();
            this.f16247j = new f(h.this.f16205e, 1);
            if (h.this.f16206f.isEmpty()) {
                this.f16241d.add(new f(h.this.f16205e, 3));
            } else {
                Iterator it = h.this.f16206f.iterator();
                while (it.hasNext()) {
                    this.f16241d.add(new f((C2812L.h) it.next(), 3));
                }
            }
            boolean z9 = false;
            if (!h.this.f16207g.isEmpty()) {
                boolean z10 = false;
                for (C2812L.h hVar : h.this.f16207g) {
                    if (!h.this.f16206f.contains(hVar)) {
                        if (!z10) {
                            AbstractC2808H.b bVarG = h.this.f16205e.g();
                            String strJ = bVarG != null ? bVarG.j() : null;
                            if (TextUtils.isEmpty(strJ)) {
                                strJ = h.this.f16210j.getString(t0.j.f50595q);
                            }
                            this.f16241d.add(new f(strJ, 2));
                            z10 = true;
                        }
                        this.f16241d.add(new f(hVar, 3));
                    }
                }
            }
            if (!h.this.f16208h.isEmpty()) {
                for (C2812L.h hVar2 : h.this.f16208h) {
                    C2812L.h hVar3 = h.this.f16205e;
                    if (hVar3 != hVar2) {
                        if (!z9) {
                            AbstractC2808H.b bVarG2 = hVar3.g();
                            String strK = bVarG2 != null ? bVarG2.k() : null;
                            if (TextUtils.isEmpty(strK)) {
                                strK = h.this.f16210j.getString(t0.j.f50596r);
                            }
                            this.f16241d.add(new f(strK, 2));
                            z9 = true;
                        }
                        this.f16241d.add(new f(hVar2, 4));
                    }
                }
            }
            q0();
        }
    }

    public static final class i implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f16284a = new i();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2812L.h hVar, C2812L.h hVar2) {
            return hVar.m().compareToIgnoreCase(hVar2.m());
        }
    }

    public class j implements SeekBar.OnSeekBarChangeListener {
        public j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            if (z9) {
                C2812L.h hVar = (C2812L.h) seekBar.getTag();
                f fVar = (f) h.this.f16218r.get(hVar.k());
                if (fVar != null) {
                    fVar.R(i9 == 0);
                }
                hVar.G(i9);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            h hVar = h.this;
            if (hVar.f16219s != null) {
                hVar.f16214n.removeMessages(2);
            }
            h.this.f16219s = (C2812L.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            h.this.f16214n.sendEmptyMessageDelayed(2, 500L);
        }
    }

    public h(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, int i9) {
        Context contextB = androidx.mediarouter.app.i.b(context, i9, false);
        super(contextB, androidx.mediarouter.app.i.c(contextB));
        this.f16204d = C2811K.f50924c;
        this.f16206f = new ArrayList();
        this.f16207g = new ArrayList();
        this.f16208h = new ArrayList();
        this.f16209i = new ArrayList();
        this.f16214n = new a();
        Context context2 = getContext();
        this.f16210j = context2;
        C2812L c2812lJ = C2812L.j(context2);
        this.f16202a = c2812lJ;
        this.f16201P = C2812L.o();
        this.f16203c = new g();
        this.f16205e = c2812lJ.n();
        this.f16193H = new e();
        k(c2812lJ.k());
    }

    public static Bitmap e(Bitmap bitmap, float f9, Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        scriptIntrinsicBlurCreate.setRadius(f9);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        allocationCreateTyped.copyTo(bitmapCopy);
        allocationCreateFromBitmap.destroy();
        allocationCreateTyped.destroy();
        scriptIntrinsicBlurCreate.destroy();
        renderScriptCreate.destroy();
        return bitmapCopy;
    }

    public static boolean h(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public static void j(View view, int i9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i9;
        view.setLayoutParams(layoutParams);
    }

    private void k(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.f16192G;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.f16193H);
            this.f16192G = null;
        }
        if (token != null && this.f16212l) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f16210j, token);
            this.f16192G = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(this.f16193H);
            MediaMetadataCompat metadata = this.f16192G.getMetadata();
            this.f16194I = metadata != null ? metadata.getDescription() : null;
            i();
            m();
        }
    }

    public void f() {
        this.f16198M = false;
        this.f16199N = null;
        this.f16200O = 0;
    }

    public List g() {
        ArrayList arrayList = new ArrayList();
        for (C2812L.h hVar : this.f16205e.q().f()) {
            C2812L.h.a aVarH = this.f16205e.h(hVar);
            if (aVarH != null && aVarH.b()) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public void i() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f16194I;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f16194I;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        d dVar = this.f16195J;
        Bitmap bitmapB = dVar == null ? this.f16196K : dVar.b();
        d dVar2 = this.f16195J;
        Uri uriC = dVar2 == null ? this.f16197L : dVar2.c();
        if (bitmapB != iconBitmap || (bitmapB == null && !O.c.a(uriC, iconUri))) {
            d dVar3 = this.f16195J;
            if (dVar3 != null) {
                dVar3.cancel(true);
            }
            d dVar4 = new d();
            this.f16195J = dVar4;
            dVar4.execute(new Void[0]);
        }
    }

    public final boolean l() {
        if (this.f16219s != null || this.f16221u || this.f16222v) {
            return true;
        }
        return !this.f16211k;
    }

    public void m() {
        if (l()) {
            this.f16224x = true;
            return;
        }
        this.f16224x = false;
        if (!this.f16205e.C() || this.f16205e.w()) {
            dismiss();
        }
        if (!this.f16198M || h(this.f16199N) || this.f16199N == null) {
            if (h(this.f16199N)) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f16199N);
            }
            this.f16188C.setVisibility(8);
            this.f16187B.setVisibility(8);
            this.f16186A.setImageBitmap(null);
        } else {
            this.f16188C.setVisibility(0);
            this.f16188C.setImageBitmap(this.f16199N);
            this.f16188C.setBackgroundColor(this.f16200O);
            this.f16187B.setVisibility(0);
            this.f16186A.setImageBitmap(e(this.f16199N, 10.0f, this.f16210j));
        }
        f();
        MediaDescriptionCompat mediaDescriptionCompat = this.f16194I;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean z9 = !TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f16194I;
        CharSequence subtitle = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getSubtitle() : null;
        boolean zIsEmpty = true ^ TextUtils.isEmpty(subtitle);
        if (z9) {
            this.f16189D.setText(title);
        } else {
            this.f16189D.setText(this.f16191F);
        }
        if (!zIsEmpty) {
            this.f16190E.setVisibility(8);
        } else {
            this.f16190E.setText(subtitle);
            this.f16190E.setVisibility(0);
        }
    }

    public void n() {
        this.f16206f.clear();
        this.f16207g.clear();
        this.f16208h.clear();
        this.f16206f.addAll(this.f16205e.l());
        for (C2812L.h hVar : this.f16205e.q().f()) {
            C2812L.h.a aVarH = this.f16205e.h(hVar);
            if (aVarH != null) {
                if (aVarH.b()) {
                    this.f16207g.add(hVar);
                }
                if (aVarH.c()) {
                    this.f16208h.add(hVar);
                }
            }
        }
        onFilterRoutes(this.f16207g);
        onFilterRoutes(this.f16208h);
        List list = this.f16206f;
        i iVar = i.f16284a;
        Collections.sort(list, iVar);
        Collections.sort(this.f16207g, iVar);
        Collections.sort(this.f16208h, iVar);
        this.f16216p.r0();
    }

    public void o() {
        if (this.f16212l) {
            if (SystemClock.uptimeMillis() - this.f16213m < 300) {
                this.f16214n.removeMessages(1);
                this.f16214n.sendEmptyMessageAtTime(1, this.f16213m + 300);
            } else {
                if (l()) {
                    this.f16223w = true;
                    return;
                }
                this.f16223w = false;
                if (!this.f16205e.C() || this.f16205e.w()) {
                    dismiss();
                }
                this.f16213m = SystemClock.uptimeMillis();
                this.f16216p.q0();
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16212l = true;
        this.f16202a.b(this.f16204d, this.f16203c, 1);
        n();
        k(this.f16202a.k());
    }

    @Override // d.DialogC1642u, androidx.activity.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t0.i.f50567a);
        androidx.mediarouter.app.i.s(this.f16210j, this);
        ImageButton imageButton = (ImageButton) findViewById(t0.f.f50536c);
        this.f16225y = imageButton;
        imageButton.setColorFilter(-1);
        this.f16225y.setOnClickListener(new b());
        Button button = (Button) findViewById(t0.f.f50551r);
        this.f16226z = button;
        button.setTextColor(-1);
        this.f16226z.setOnClickListener(new c());
        this.f16216p = new C0186h();
        RecyclerView recyclerView = (RecyclerView) findViewById(t0.f.f50541h);
        this.f16215o = recyclerView;
        recyclerView.setAdapter(this.f16216p);
        this.f16215o.setLayoutManager(new LinearLayoutManager(this.f16210j));
        this.f16217q = new j();
        this.f16218r = new HashMap();
        this.f16220t = new HashMap();
        this.f16186A = (ImageView) findViewById(t0.f.f50543j);
        this.f16187B = findViewById(t0.f.f50544k);
        this.f16188C = (ImageView) findViewById(t0.f.f50542i);
        TextView textView = (TextView) findViewById(t0.f.f50546m);
        this.f16189D = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(t0.f.f50545l);
        this.f16190E = textView2;
        textView2.setTextColor(-1);
        this.f16191F = this.f16210j.getResources().getString(t0.j.f50582d);
        this.f16211k = true;
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16212l = false;
        this.f16202a.s(this.f16203c);
        this.f16214n.removeCallbacksAndMessages(null);
        k(null);
    }

    public boolean onFilterRoute(C2812L.h hVar) {
        return !hVar.w() && hVar.x() && hVar.E(this.f16204d) && this.f16205e != hVar;
    }

    public void onFilterRoutes(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!onFilterRoute((C2812L.h) list.get(size))) {
                list.remove(size);
            }
        }
    }

    public void p() {
        if (this.f16223w) {
            o();
        }
        if (this.f16224x) {
            m();
        }
    }

    public void setRouteSelector(C2811K c2811k) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f16204d.equals(c2811k)) {
            return;
        }
        this.f16204d = c2811k;
        if (this.f16212l) {
            this.f16202a.s(this.f16203c);
            this.f16202a.b(c2811k, this.f16203c, 1);
            n();
        }
    }

    public void updateLayout() {
        getWindow().setLayout(androidx.mediarouter.app.f.c(this.f16210j), androidx.mediarouter.app.f.a(this.f16210j));
        this.f16196K = null;
        this.f16197L = null;
        i();
        m();
        o();
    }
}
