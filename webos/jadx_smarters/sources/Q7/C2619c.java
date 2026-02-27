package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.pojo.AnnouncementsResponsePojo;
import com.nst.iptvsmarterstvbox.view.activity.AnnouncementAlertActivity;
import com.nst.iptvsmarterstvbox.view.activity.AnnouncementsActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.achartengine.chart.TimeChart;

/* JADX INFO: renamed from: q7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2619c extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f48177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f48178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AnnouncementsActivity f48179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48180g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f48181h;

    /* JADX INFO: renamed from: q7.c$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48182a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48183c;

        public a(String str, String str2) {
            this.f48182a = str;
            this.f48183c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(C2619c.this.f48177d, (Class<?>) AnnouncementAlertActivity.class);
            intent.putExtra("Title", this.f48182a);
            intent.putExtra("Description", this.f48183c);
            C2619c.this.f48177d.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: q7.c$b */
    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48185a;

        public b(View view) {
            this.f48185a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48185a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48185a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            int i9;
            float f9 = z9 ? 1.02f : 1.0f;
            a(f9);
            b(f9);
            if (z9) {
                view2 = this.f48185a;
                i9 = a7.e.f11925J;
            } else {
                if (z9) {
                    return;
                }
                view2 = this.f48185a;
                i9 = a7.e.f11921I;
            }
            view2.setBackgroundResource(i9);
        }
    }

    /* JADX INFO: renamed from: q7.c$c, reason: collision with other inner class name */
    public class C0421c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48187t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48188u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f48189v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public View f48190w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public CardView f48191x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public RelativeLayout f48192y;

        public C0421c(View view) {
            super(view);
            this.f48190w = view;
            this.f48187t = (TextView) view.findViewById(a7.f.dk);
            this.f48188u = (TextView) view.findViewById(a7.f.ck);
            this.f48189v = (TextView) view.findViewById(a7.f.ri);
            this.f48191x = (CardView) view.findViewById(a7.f.f12148G1);
            this.f48192y = (RelativeLayout) view.findViewById(a7.f.Pe);
            C2619c.this.f48181h = (ImageView) view.findViewById(a7.f.f12326Y4);
        }
    }

    public C2619c(List list, AnnouncementsActivity announcementsActivity, Context context) {
        this.f48179f = announcementsActivity;
        this.f48178e = list;
        this.f48177d = context;
    }

    public String l0(String str) {
        String string = "";
        try {
            String str2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            string = Long.toString(Math.abs(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime()) / TimeChart.DAY);
            Log.e("HERE", "HERE: " + string);
            return string;
        } catch (Exception e9) {
            Log.e("DIDN'T WORK", "exception " + e9);
            return string;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void E(C0421c c0421c, int i9) {
        TextView textView;
        String str;
        AnnouncementsResponsePojo announcementsResponsePojo = (AnnouncementsResponsePojo) this.f48178e.get(i9);
        c0421c.f48187t.setText(announcementsResponsePojo.getTitle());
        String title = announcementsResponsePojo.getTitle();
        String description = announcementsResponsePojo.getDescription();
        c0421c.f48188u.setText(announcementsResponsePojo.getDescription());
        String strL0 = l0(announcementsResponsePojo.getCreateDate());
        if (strL0.equalsIgnoreCase("0")) {
            textView = c0421c.f48189v;
            str = "Today";
        } else {
            if (!strL0.equalsIgnoreCase("1")) {
                c0421c.f48189v.setText(strL0 + " days ago");
                c0421c.f48191x.setOnClickListener(new a(title, description));
                c0421c.f48191x.setOnFocusChangeListener(new b(c0421c.f48192y));
            }
            textView = c0421c.f48189v;
            str = "Yesterday";
        }
        textView.setText(str);
        c0421c.f48191x.setOnClickListener(new a(title, description));
        c0421c.f48191x.setOnFocusChangeListener(new b(c0421c.f48192y));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48178e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C0421c L(ViewGroup viewGroup, int i9) {
        return new C0421c(LayoutInflater.from(this.f48177d).inflate(a7.g.f12776c3, viewGroup, false));
    }
}
