package com.nst.iptvsmarterstvbox.view.activity;

import a7.e;
import a7.f;
import a7.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import h7.C1867a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.d;
import m7.w;
import org.achartengine.ChartFactory;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SpeedTestActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f32457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f32458s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f32459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f32460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f32461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f32462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f32463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f32464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f32465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f32466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f32467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f32468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashSet f32469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RotateAnimation f32470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f32471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2858a f32472q;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SpeedTestActivity.this.f32459d.setEnabled(false);
            SpeedTestActivity.this.y1();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DecimalFormat f32474a;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1867a f32476a;

            public a(C1867a c1867a) {
                this.f32476a = c1867a;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32470o = new RotateAnimation(SpeedTestActivity.f32458s, SpeedTestActivity.f32457r, 1, 0.5f, 1, 0.5f);
                SpeedTestActivity.this.f32470o.setInterpolator(new LinearInterpolator());
                SpeedTestActivity.this.f32470o.setDuration(100L);
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.f32466k.startAnimation(speedTestActivity.f32470o);
                SpeedTestActivity.this.f32462g.setText(b.this.f32474a.format(this.f32476a.b()) + " Mbps");
                SpeedTestActivity.this.f32463h.setText(b.this.f32474a.format(this.f32476a.b()) + " Mbps");
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.SpeedTestActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0278b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f32478a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ XYMultipleSeriesRenderer f32479c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f32480d;

            public RunnableC0278b(List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f32478a = list;
                this.f32479c = xYMultipleSeriesRenderer;
                this.f32480d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries("");
                xYSeries.setTitle("");
                Iterator it = new ArrayList(this.f32478a).iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    xYSeries.add(i9, ((Double) it.next()).doubleValue());
                    i9++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f32480d.addView(ChartFactory.getLineChartView(SpeedTestActivity.this.getBaseContext(), xYMultipleSeriesDataset, this.f32479c), 0);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h7.c f32482a;

            public c(h7.c cVar) {
                this.f32482a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32464i.setText(b.this.f32474a.format(this.f32482a.a()) + " Mbps");
                SpeedTestActivity.this.f32465j.setText(b.this.f32474a.format(this.f32482a.a()) + " Mbps");
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h7.c f32484a;

            public d(h7.c cVar) {
                this.f32484a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32470o = new RotateAnimation(SpeedTestActivity.f32458s, SpeedTestActivity.f32457r, 1, 0.5f, 1, 0.5f);
                SpeedTestActivity.this.f32470o.setInterpolator(new LinearInterpolator());
                SpeedTestActivity.this.f32470o.setDuration(100L);
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.f32466k.startAnimation(speedTestActivity.f32470o);
                SpeedTestActivity.this.f32464i.setText(b.this.f32474a.format(this.f32484a.b()) + " Mbps");
                SpeedTestActivity.this.f32465j.setText(b.this.f32474a.format(this.f32484a.b()) + " Mbps");
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f32486a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ XYMultipleSeriesRenderer f32487c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f32488d;

            public e(List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f32486a = list;
                this.f32487c = xYMultipleSeriesRenderer;
                this.f32488d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries("");
                xYSeries.setTitle("");
                int i9 = 0;
                for (Double dValueOf : new ArrayList(this.f32486a)) {
                    if (i9 == 0) {
                        dValueOf = Double.valueOf(0.0d);
                    }
                    xYSeries.add(i9, dValueOf.doubleValue());
                    i9++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f32488d.addView(ChartFactory.getLineChartView(SpeedTestActivity.this.getBaseContext(), xYMultipleSeriesDataset, this.f32487c), 0);
            }
        }

        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32459d.setEnabled(true);
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.f32459d.setText(speedTestActivity.getResources().getString(a7.j.f13293j6));
            }
        }

        public class g implements Runnable {
            public g() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.f32459d.setText(speedTestActivity.getResources().getString(a7.j.f13242e5));
            }
        }

        public class h implements Runnable {
            public h() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(SpeedTestActivity.this.getApplicationContext(), "No Connection...", 1).show();
                SpeedTestActivity.this.f32459d.setEnabled(true);
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.f32459d.setText(speedTestActivity.getResources().getString(a7.j.f13293j6));
            }
        }

        public class i implements Runnable {
            public i() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.f32459d.setText(speedTestActivity.getResources().getString(a7.j.f13019H5));
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f32494a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ double f32495c;

            public j(List list, double d9) {
                this.f32494a = list;
                this.f32495c = d9;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32459d.setText(String.format("Host Location: %s \n[Distance: %s km]", this.f32494a.get(2), new DecimalFormat("#.##").format(this.f32495c / 1000.0d)));
            }
        }

        public class k implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f32497a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f32498c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f32499d;

            public k(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
                this.f32497a = linearLayout;
                this.f32498c = linearLayout2;
                this.f32499d = linearLayout3;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32460e.setText("0 ms");
                SpeedTestActivity.this.f32461f.setText("0 ms");
                this.f32497a.removeAllViews();
                SpeedTestActivity.this.f32462g.setText("0 Mbps");
                SpeedTestActivity.this.f32463h.setText("0 Mbps");
                this.f32498c.removeAllViews();
                SpeedTestActivity.this.f32464i.setText("0 Mbps");
                SpeedTestActivity.this.f32465j.setText("0 Mbps");
                this.f32499d.removeAllViews();
            }
        }

        public class l implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h7.d f32501a;

            public l(h7.d dVar) {
                this.f32501a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32460e.setText(b.this.f32474a.format(this.f32501a.a()) + " ms");
                SpeedTestActivity.this.f32461f.setText(b.this.f32474a.format(this.f32501a.a()) + " ms");
            }
        }

        public class m implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h7.d f32503a;

            public m(h7.d dVar) {
                this.f32503a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32460e.setText(b.this.f32474a.format(this.f32503a.b()) + " ms");
                SpeedTestActivity.this.f32461f.setText(b.this.f32474a.format(this.f32503a.b()) + " ms");
            }
        }

        public class n implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f32505a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ XYMultipleSeriesRenderer f32506c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f32507d;

            public n(List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f32505a = list;
                this.f32506c = xYMultipleSeriesRenderer;
                this.f32507d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries("");
                xYSeries.setTitle("");
                Iterator it = new ArrayList(this.f32505a).iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    xYSeries.add(i9, ((Double) it.next()).doubleValue());
                    i9++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f32507d.addView(ChartFactory.getLineChartView(SpeedTestActivity.this.getBaseContext(), xYMultipleSeriesDataset, this.f32506c), 0);
            }
        }

        public class o implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1867a f32509a;

            public o(C1867a c1867a) {
                this.f32509a = c1867a;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f32462g.setText(b.this.f32474a.format(this.f32509a.a()) + " Mbps");
                SpeedTestActivity.this.f32463h.setText(b.this.f32474a.format(this.f32509a.a()) + " Mbps");
            }
        }

        public b(DecimalFormat decimalFormat) {
            this.f32474a = decimalFormat;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x02fc  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0356  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x03ab  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x03d2  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x03da  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x03e3  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x03fd  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 1036
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SpeedTestActivity.b.run():void");
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f32511a;

        public c(View view) {
            this.f32511a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32511a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32511a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32511a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            Button button;
            int i9;
            if (z9) {
                f9 = z9 ? 1.12f : 1.0f;
                b(f9);
                c(f9);
                View view2 = this.f32511a;
                if (view2 == null || view2.getTag() == null || !this.f32511a.getTag().equals("1")) {
                    return;
                }
                button = SpeedTestActivity.this.f32459d;
                i9 = e.f12042p;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                View view3 = this.f32511a;
                if (view3 == null || view3.getTag() == null || !this.f32511a.getTag().equals("1")) {
                    return;
                }
                button = SpeedTestActivity.this.f32459d;
                i9 = e.f12038o;
            }
            button.setBackgroundResource(i9);
        }
    }

    private void x1() {
        this.f32459d.setOnClickListener(new a());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f32471p = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f32471p);
        this.f32472q = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12747Y0 : g.f12741X0);
        w.Y(this);
        w1();
        this.f32469n = new HashSet();
        try {
            d dVar = new d();
            this.f32468m = dVar;
            dVar.start();
        } catch (Exception unused) {
        }
        Button button = this.f32459d;
        if (button != null) {
            button.setOnFocusChangeListener(new c(button));
        }
        x1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            d dVar = new d();
            this.f32468m = dVar;
            dVar.start();
        } catch (Exception unused) {
        }
    }

    public int v1(double d9) {
        if (d9 <= 1.0d) {
            return (int) (d9 * 30.0d);
        }
        if (d9 <= 10.0d) {
            return ((int) (d9 * 6.0d)) + 30;
        }
        if (d9 <= 30.0d) {
            return ((int) ((d9 - 10.0d) * 3.0d)) + 90;
        }
        if (d9 <= 50.0d) {
            return ((int) ((d9 - 30.0d) * 1.5d)) + 150;
        }
        if (d9 <= 100.0d) {
            return ((int) ((d9 - 50.0d) * 1.2d)) + 180;
        }
        return 0;
    }

    public final void w1() {
        this.f32459d = (Button) findViewById(f.Vg);
        this.f32460e = (TextView) findViewById(f.vc);
        this.f32461f = (TextView) findViewById(f.wc);
        this.f32462g = (TextView) findViewById(f.f12179J2);
        this.f32463h = (TextView) findViewById(f.f12189K2);
        this.f32464i = (TextView) findViewById(f.Bm);
        this.f32465j = (TextView) findViewById(f.Cm);
        this.f32466k = (ImageView) findViewById(f.f12411h0);
        this.f32467l = (LinearLayout) findViewById(f.f12425i4);
    }

    public final void y1() {
        try {
            if (this.f32468m == null) {
                d dVar = new d();
                this.f32468m = dVar;
                dVar.start();
            }
            if (this.f32468m != null) {
                this.f32467l.setVisibility(0);
                try {
                    new Thread(new b(new DecimalFormat("#.##"))).start();
                } catch (Exception e9) {
                    Toast.makeText(this.f32471p, e9.getMessage(), 0).show();
                }
            }
        } catch (Exception unused) {
        }
    }
}
