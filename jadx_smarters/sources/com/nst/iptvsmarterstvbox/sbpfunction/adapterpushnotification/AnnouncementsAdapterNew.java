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
import com.nst.iptvsmarterstvbox.model.pojo.AnnouncementsResponsePojo;
import com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.AnnouncementsNewActivity;
import com.nst.iptvsmarterstvbox.view.activity.AnnouncementAlertActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes.dex */
public class AnnouncementsAdapterNew extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f28738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f28739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AnnouncementsNewActivity f28740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28741g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f28742h;

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28746a;

        public OnFocusChangeAccountListener(View view) {
            this.f28746a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28746a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28746a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28746a, "scaleY", f9);
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
                view2 = this.f28746a;
                i9 = e.f12041o2;
            } else {
                if (z9) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(z9);
                view2 = this.f28746a;
                i9 = c.f11875z;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public class ViewHolder extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f28748t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f28749u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f28750v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public View f28751w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public CardView f28752x;

        public ViewHolder(View view) {
            super(view);
            this.f28751w = view;
            this.f28748t = (TextView) view.findViewById(f.dk);
            this.f28749u = (TextView) view.findViewById(f.ck);
            this.f28750v = (TextView) view.findViewById(f.ri);
            this.f28752x = (CardView) view.findViewById(f.f12148G1);
            AnnouncementsAdapterNew.this.f28738d = (RelativeLayout) view.findViewById(f.Pe);
            AnnouncementsAdapterNew.this.f28742h = (ImageView) view.findViewById(f.f12326Y4);
        }
    }

    public AnnouncementsAdapterNew(List list, AnnouncementsNewActivity announcementsNewActivity) {
        this.f28740f = announcementsNewActivity;
        this.f28739e = list;
    }

    public String k0(String str) {
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
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void E(ViewHolder viewHolder, int i9) {
        TextView textView;
        String str;
        AnnouncementsResponsePojo announcementsResponsePojo = (AnnouncementsResponsePojo) this.f28739e.get(i9);
        viewHolder.f28748t.setText(announcementsResponsePojo.getTitle());
        final String title = announcementsResponsePojo.getTitle();
        final String description = announcementsResponsePojo.getDescription();
        viewHolder.f28749u.setText(announcementsResponsePojo.getDescription());
        String strK0 = k0(announcementsResponsePojo.getCreateDate());
        if (strK0.equalsIgnoreCase("0")) {
            textView = viewHolder.f28750v;
            str = "Today";
        } else {
            if (!strK0.equalsIgnoreCase("1")) {
                viewHolder.f28750v.setText(strK0 + " days ago");
                viewHolder.f28752x.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.AnnouncementsAdapterNew.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Intent intent = new Intent(AnnouncementsAdapterNew.this.f28740f, (Class<?>) AnnouncementAlertActivity.class);
                        intent.putExtra("Title", title);
                        intent.putExtra("Description", description);
                        AnnouncementsAdapterNew.this.f28740f.startActivity(intent);
                    }
                });
                viewHolder.f28752x.setOnFocusChangeListener(new OnFocusChangeAccountListener(viewHolder.f28752x));
                if (i9 == 0 || !this.f28741g) {
                }
                viewHolder.f28752x.requestFocus();
                this.f28741g = false;
                return;
            }
            textView = viewHolder.f28750v;
            str = "Yesterday";
        }
        textView.setText(str);
        viewHolder.f28752x.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.AnnouncementsAdapterNew.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(AnnouncementsAdapterNew.this.f28740f, (Class<?>) AnnouncementAlertActivity.class);
                intent.putExtra("Title", title);
                intent.putExtra("Description", description);
                AnnouncementsAdapterNew.this.f28740f.startActivity(intent);
            }
        });
        viewHolder.f28752x.setOnFocusChangeListener(new OnFocusChangeAccountListener(viewHolder.f28752x));
        if (i9 == 0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public ViewHolder L(ViewGroup viewGroup, int i9) {
        return new ViewHolder(LayoutInflater.from(this.f28740f).inflate(g.f12776c3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f28739e.size();
    }
}
