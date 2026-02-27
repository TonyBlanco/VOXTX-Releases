package com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters;

import a7.e;
import a7.f;
import a7.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.TickedMessageModelClass;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TicketMessageAdapter extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f28488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f28489e;

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28490a;

        public OnFocusChangeAccountListener(View view) {
            this.f28490a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28490a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28490a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28490a, "scaleY", f9);
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
                Log.e("id is", "" + this.f28490a.getTag());
                view2 = this.f28490a;
                i9 = e.f12041o2;
            } else {
                if (z9) {
                    return;
                }
                float f9 = z9 ? 1.01f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f28490a;
                i9 = e.f12081y2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public class ViewHolder extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f28493t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f28494u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f28495v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f28496w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ImageView f28497x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public CardView f28498y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f28499z;

        public ViewHolder(View view) {
            super(view);
            this.f28493t = (TextView) view.findViewById(f.zi);
            this.f28494u = (TextView) view.findViewById(f.ck);
            this.f28495v = (TextView) view.findViewById(f.fm);
            this.f28496w = (ImageView) view.findViewById(f.f12587y4);
            this.f28497x = (ImageView) view.findViewById(f.f12261R4);
            this.f28499z = (LinearLayout) view.findViewById(f.g9);
            this.f28498y = (CardView) view.findViewById(f.f12158H1);
        }
    }

    public TicketMessageAdapter(Context context, List list) {
        this.f28488d = context;
        this.f28489e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void E(ViewHolder viewHolder, int i9) {
        LinearLayout linearLayout;
        String str;
        String strD = ((TickedMessageModelClass.Replies.Reply) this.f28489e.get(i9)).d();
        if (strD == null || strD.equalsIgnoreCase("")) {
            viewHolder.f28497x.setVisibility(8);
            viewHolder.f28496w.setVisibility(0);
            viewHolder.f28495v.setText(((TickedMessageModelClass.Replies.Reply) this.f28489e.get(i9)).a());
            viewHolder.f28494u.setText(((TickedMessageModelClass.Replies.Reply) this.f28489e.get(i9)).c());
            viewHolder.f28493t.setText(((TickedMessageModelClass.Replies.Reply) this.f28489e.get(i9)).b());
            linearLayout = viewHolder.f28499z;
            str = "#a5b0c2";
        } else {
            viewHolder.f28497x.setVisibility(0);
            viewHolder.f28496w.setVisibility(8);
            viewHolder.f28495v.setText(strD);
            viewHolder.f28494u.setText(((TickedMessageModelClass.Replies.Reply) this.f28489e.get(i9)).c());
            viewHolder.f28493t.setText(((TickedMessageModelClass.Replies.Reply) this.f28489e.get(i9)).b());
            linearLayout = viewHolder.f28499z;
            str = "#eceef2";
        }
        linearLayout.setBackgroundColor(Color.parseColor(str));
        viewHolder.f28498y.setCardBackgroundColor(Color.parseColor(str));
        LinearLayout linearLayout2 = viewHolder.f28499z;
        linearLayout2.setOnFocusChangeListener(new OnFocusChangeAccountListener(linearLayout2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public ViewHolder L(ViewGroup viewGroup, int i9) {
        return new ViewHolder(LayoutInflater.from(this.f28488d).inflate(g.f12673L4, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f28489e.size();
    }
}
