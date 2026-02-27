package com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification;

import a7.c;
import a7.e;
import a7.f;
import a7.g;
import android.animation.ObjectAnimator;
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
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.AnnouncementsData;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AnnouncementsSBPSingleton;
import com.nst.iptvsmarterstvbox.view.activity.AnnouncementAlertActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes.dex */
public class DashboardSBPAnnouncementAdapter extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f28754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f28755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NewDashboardActivity f28756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28757g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f28758h;

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28764a;

        public OnFocusChangeAccountListener(View view) {
            this.f28764a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28764a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28764a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28764a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            int i9;
            if (z9) {
                b(1.0f);
                c(1.0f);
                view2 = this.f28764a;
                i9 = e.f12041o2;
            } else {
                if (z9) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(z9);
                view2 = this.f28764a;
                i9 = c.f11875z;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public class ViewHolder extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f28766t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f28767u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f28768v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f28769w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public View f28770x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public CardView f28771y;

        public ViewHolder(View view) {
            super(view);
            this.f28770x = view;
            this.f28766t = (TextView) view.findViewById(f.dk);
            this.f28767u = (TextView) view.findViewById(f.ck);
            this.f28768v = (TextView) view.findViewById(f.ri);
            this.f28771y = (CardView) view.findViewById(f.f12148G1);
            DashboardSBPAnnouncementAdapter.this.f28754d = (RelativeLayout) view.findViewById(f.Pe);
            DashboardSBPAnnouncementAdapter.this.f28758h = (ImageView) view.findViewById(f.f12326Y4);
            this.f28769w = (ImageView) view.findViewById(f.Tb);
        }
    }

    public DashboardSBPAnnouncementAdapter(List list, NewDashboardActivity newDashboardActivity) {
        this.f28756f = newDashboardActivity;
        this.f28755e = list;
    }

    public String m0(String str) {
        String string = "";
        try {
            String str2 = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            string = Long.toString(Math.abs(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime()) / TimeChart.DAY);
            Log.e("HERE", "HERE: " + string);
            return string;
        } catch (Exception e9) {
            Log.e("DIDN'T WORK", "exception " + e9);
            return string;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f28755e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void E(ViewHolder viewHolder, int i9) {
        TextView textView;
        String str;
        AnnouncementsData announcementsData = (AnnouncementsData) this.f28755e.get(i9);
        if (announcementsData.getSeen().intValue() == 0) {
            viewHolder.f28771y.setBackgroundColor(this.f28756f.getResources().getColor(c.f11852c));
            viewHolder.f28767u.setTypeface(null, 1);
            viewHolder.f28768v.setTypeface(null, 1);
            viewHolder.f28766t.setSelected(true);
            viewHolder.f28767u.setTextColor(this.f28756f.getResources().getColor(c.f11849G));
            viewHolder.f28766t.setTextColor(this.f28756f.getResources().getColor(c.f11849G));
            viewHolder.f28768v.setTextColor(this.f28756f.getResources().getColor(c.f11849G));
            viewHolder.f28769w.setVisibility(0);
        } else {
            viewHolder.f28771y.setBackgroundColor(this.f28756f.getResources().getColor(c.f11871v));
            viewHolder.f28768v.setTypeface(null, 0);
            viewHolder.f28767u.setTypeface(null, 0);
            viewHolder.f28766t.setSelected(true);
            viewHolder.f28767u.setTextColor(this.f28756f.getResources().getColor(c.f11872w));
            viewHolder.f28766t.setTextColor(this.f28756f.getResources().getColor(c.f11872w));
            viewHolder.f28768v.setTextColor(this.f28756f.getResources().getColor(c.f11872w));
            viewHolder.f28769w.setVisibility(8);
        }
        viewHolder.f28766t.setText(announcementsData.getTitle());
        final String title = announcementsData.getTitle();
        final String message = announcementsData.getMessage();
        final String id = announcementsData.getId();
        final String strValueOf = String.valueOf(announcementsData.getSeen());
        viewHolder.f28767u.setText(MyApplication.p().o(message));
        String strM0 = m0(announcementsData.getCreatedOn());
        if (strM0.equalsIgnoreCase("0")) {
            textView = viewHolder.f28768v;
            str = "Today";
        } else {
            if (!strM0.equalsIgnoreCase("1")) {
                viewHolder.f28768v.setText(strM0 + " days ago");
                viewHolder.f28771y.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.DashboardSBPAnnouncementAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Intent intent = new Intent(DashboardSBPAnnouncementAdapter.this.f28756f, (Class<?>) AnnouncementAlertActivity.class);
                        intent.putExtra("Title", title);
                        intent.putExtra("Description", message);
                        intent.putExtra(JsonDocumentFields.POLICY_ID, id);
                        intent.putExtra("CheckSeen", strValueOf);
                        DashboardSBPAnnouncementAdapter.this.f28756f.startActivity(intent);
                    }
                });
                viewHolder.f28771y.setOnFocusChangeListener(new OnFocusChangeAccountListener(viewHolder.f28771y));
                if (i9 == 0 || !this.f28757g) {
                }
                this.f28757g = false;
                return;
            }
            textView = viewHolder.f28768v;
            str = "Yesterday";
        }
        textView.setText(str);
        viewHolder.f28771y.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.DashboardSBPAnnouncementAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(DashboardSBPAnnouncementAdapter.this.f28756f, (Class<?>) AnnouncementAlertActivity.class);
                intent.putExtra("Title", title);
                intent.putExtra("Description", message);
                intent.putExtra(JsonDocumentFields.POLICY_ID, id);
                intent.putExtra("CheckSeen", strValueOf);
                DashboardSBPAnnouncementAdapter.this.f28756f.startActivity(intent);
            }
        });
        viewHolder.f28771y.setOnFocusChangeListener(new OnFocusChangeAccountListener(viewHolder.f28771y));
        if (i9 == 0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public ViewHolder L(ViewGroup viewGroup, int i9) {
        return new ViewHolder(LayoutInflater.from(this.f28756f).inflate(g.f12790e3, viewGroup, false));
    }

    public void q0() {
        List listA = AnnouncementsSBPSingleton.b().a();
        if (listA == null || listA.size() <= 0) {
            return;
        }
        this.f28755e = listA;
        w();
    }
}
