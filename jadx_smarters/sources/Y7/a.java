package Y7;

import W7.e;
import W7.g;
import a8.C1115a;
import android.R;
import android.animation.Animator;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import b8.AbstractC1237c;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Y7.b, g, e, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YouTubePlayerView f10749a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W7.c f10750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z7.a f10751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f10752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f10753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f10754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f10755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f10756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f10757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f10758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProgressBar f10759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f10760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f10761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f10762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f10763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f10764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f10765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SeekBar f10766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View.OnClickListener f10767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnClickListener f10768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10769v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10770w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10771x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10772y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10773z = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f10744A = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Handler f10745B = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Runnable f10746C = new RunnableC0146a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10747D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f10748E = -1;

    /* JADX INFO: renamed from: Y7.a$a, reason: collision with other inner class name */
    public class RunnableC0146a implements Runnable {
        public RunnableC0146a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.t(0.0f);
        }
    }

    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f10775a;

        public b(float f9) {
            this.f10775a = f9;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10775a == 0.0f) {
                a.this.f10753f.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10775a == 1.0f) {
                a.this.f10753f.setVisibility(0);
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10777a;

        public c(String str) {
            this.f10777a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f10753f.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.youtube.com/watch?v=" + this.f10777a + "#t=" + a.this.f10766s.getProgress())));
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f10757j.setText("");
        }
    }

    public a(YouTubePlayerView youTubePlayerView, W7.c cVar) {
        this.f10749a = youTubePlayerView;
        this.f10750c = cVar;
        u(View.inflate(youTubePlayerView.getContext(), V7.d.f10151a, youTubePlayerView));
        this.f10751d = new C1115a(youTubePlayerView.getContext());
    }

    public final void A() {
        t(this.f10770w ? 0.0f : 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r4) {
        /*
            r3 = this;
            r0 = -1
            r1 = 1
            if (r4 == r0) goto L13
            r0 = 0
            if (r4 == 0) goto Ld
            if (r4 == r1) goto L10
            r2 = 2
            if (r4 == r2) goto Ld
            goto L16
        Ld:
            r3.f10769v = r0
            goto L16
        L10:
            r3.f10769v = r1
            goto L16
        L13:
            r3.y()
        L16:
            boolean r4 = r3.f10769v
            r4 = r4 ^ r1
            r3.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.a.B(int):void");
    }

    public final void C(boolean z9) {
        this.f10761n.setImageResource(z9 ? V7.b.f10132c : V7.b.f10133d);
    }

    @Override // Y7.b
    public void a(boolean z9) {
        this.f10763p.setVisibility(z9 ? 0 : 8);
    }

    @Override // Y7.b
    public void b(boolean z9) {
        this.f10762o.setVisibility(z9 ? 0 : 8);
    }

    @Override // W7.g
    public void c(String str) {
        this.f10762o.setOnClickListener(new c(str));
    }

    @Override // W7.e
    public void d() {
        this.f10763p.setImageResource(V7.b.f10130a);
    }

    @Override // W7.g
    public void e(float f9) {
        this.f10757j.setText(AbstractC1237c.a(f9));
        this.f10766s.setMax((int) f9);
    }

    @Override // W7.g
    public void f() {
    }

    @Override // W7.e
    public void g() {
        this.f10763p.setImageResource(V7.b.f10131b);
    }

    @Override // W7.g
    public void h(int i9) {
        this.f10748E = -1;
        B(i9);
        if (i9 == 1 || i9 == 2 || i9 == 5) {
            this.f10752e.setBackgroundColor(E.b.getColor(this.f10749a.getContext(), R.color.transparent));
            this.f10759l.setVisibility(8);
            if (this.f10773z) {
                this.f10761n.setVisibility(0);
            }
            this.f10771x = true;
            boolean z9 = i9 == 1;
            C(z9);
            if (z9) {
                z();
                return;
            } else {
                this.f10745B.removeCallbacks(this.f10746C);
                return;
            }
        }
        C(false);
        t(1.0f);
        if (i9 == 3) {
            this.f10752e.setBackgroundColor(E.b.getColor(this.f10749a.getContext(), R.color.transparent));
            if (this.f10773z) {
                this.f10761n.setVisibility(4);
            }
            this.f10764q.setVisibility(8);
            this.f10765r.setVisibility(8);
            this.f10771x = false;
        }
        if (i9 == -1) {
            this.f10771x = false;
            this.f10759l.setVisibility(8);
            if (this.f10773z) {
                this.f10761n.setVisibility(0);
            }
        }
    }

    @Override // W7.g
    public void i(String str) {
    }

    @Override // W7.g
    public void j(String str) {
    }

    @Override // W7.g
    public void k(float f9) {
        if (!this.f10744A) {
            this.f10766s.setSecondaryProgress(0);
        } else {
            this.f10766s.setSecondaryProgress((int) (f9 * r0.getMax()));
        }
    }

    @Override // W7.g
    public void l() {
    }

    @Override // Y7.b
    public void m(boolean z9) {
        this.f10755h.setVisibility(z9 ? 0 : 8);
    }

    @Override // W7.g
    public void n(float f9) {
        if (this.f10747D) {
            return;
        }
        if (this.f10748E <= 0 || AbstractC1237c.a(f9).equals(AbstractC1237c.a(this.f10748E))) {
            this.f10748E = -1;
            this.f10766s.setProgress((int) f9);
        }
    }

    @Override // Y7.b
    public void o(boolean z9) {
        this.f10761n.setVisibility(z9 ? 0 : 8);
        this.f10773z = z9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f10752e) {
            A();
            return;
        }
        if (view == this.f10761n) {
            x();
        } else if (view == this.f10763p) {
            v();
        } else if (view == this.f10760m) {
            w();
        }
    }

    @Override // W7.g
    public void onError(int i9) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
        this.f10756i.setText(AbstractC1237c.a(i9));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f10747D = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.f10769v) {
            this.f10748E = seekBar.getProgress();
        }
        this.f10750c.e(seekBar.getProgress());
        this.f10747D = false;
    }

    public final void t(float f9) {
        if (this.f10771x && this.f10772y) {
            this.f10770w = f9 != 0.0f;
            if (f9 == 1.0f && this.f10769v) {
                z();
            } else {
                this.f10745B.removeCallbacks(this.f10746C);
            }
            this.f10753f.animate().alpha(f9).setDuration(300L).setListener(new b(f9)).start();
        }
    }

    public final void u(View view) {
        this.f10752e = view.findViewById(V7.c.f10141h);
        this.f10753f = view.findViewById(V7.c.f10134a);
        this.f10754g = (LinearLayout) view.findViewById(V7.c.f10137d);
        this.f10755h = (TextView) view.findViewById(V7.c.f10149p);
        this.f10756i = (TextView) view.findViewById(V7.c.f10147n);
        this.f10757j = (TextView) view.findViewById(V7.c.f10148o);
        this.f10758k = (TextView) view.findViewById(V7.c.f10139f);
        this.f10759l = (ProgressBar) view.findViewById(V7.c.f10143j);
        this.f10760m = (ImageView) view.findViewById(V7.c.f10140g);
        this.f10761n = (ImageView) view.findViewById(V7.c.f10142i);
        this.f10762o = (ImageView) view.findViewById(V7.c.f10150q);
        this.f10763p = (ImageView) view.findViewById(V7.c.f10138e);
        this.f10764q = (ImageView) view.findViewById(V7.c.f10135b);
        this.f10765r = (ImageView) view.findViewById(V7.c.f10136c);
        SeekBar seekBar = (SeekBar) view.findViewById(V7.c.f10145l);
        this.f10766s = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f10752e.setOnClickListener(this);
        this.f10761n.setOnClickListener(this);
        this.f10760m.setOnClickListener(this);
        this.f10763p.setOnClickListener(this);
    }

    public final void v() {
        View.OnClickListener onClickListener = this.f10767t;
        if (onClickListener == null) {
            this.f10749a.n();
        } else {
            onClickListener.onClick(this.f10763p);
        }
    }

    public final void w() {
        View.OnClickListener onClickListener = this.f10768u;
        if (onClickListener == null) {
            this.f10751d.a(this.f10760m);
        } else {
            onClickListener.onClick(this.f10760m);
        }
    }

    public final void x() {
        if (this.f10769v) {
            this.f10750c.pause();
        } else {
            this.f10750c.play();
        }
    }

    public final void y() {
        this.f10766s.setProgress(0);
        this.f10766s.setMax(0);
        this.f10757j.post(new d());
    }

    public final void z() {
        this.f10745B.postDelayed(this.f10746C, 3000L);
    }
}
