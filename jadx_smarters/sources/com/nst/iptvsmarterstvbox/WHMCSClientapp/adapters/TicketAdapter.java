package com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters;

import a7.e;
import a7.f;
import a7.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TicketAdapter extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f28474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f28475e;

    public class MyViewHolder extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f28479t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f28480u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f28481v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public TextView f28482w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f28483x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public LinearLayout f28484y;

        public MyViewHolder(View view) {
            super(view);
            this.f28479t = (TextView) view.findViewById(f.Ci);
            this.f28480u = (TextView) view.findViewById(f.Rl);
            this.f28481v = (TextView) view.findViewById(f.Sl);
            this.f28482w = (TextView) view.findViewById(f.Lj);
            this.f28483x = (TextView) view.findViewById(f.Pj);
            this.f28484y = (LinearLayout) view.findViewById(f.g9);
        }
    }

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28486a;

        public OnFocusChangeAccountListener(View view) {
            this.f28486a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28486a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28486a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28486a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.04f : 1.0f;
                b(f9);
                c(f9);
                Log.e("id is", "" + this.f28486a.getTag());
                view2 = this.f28486a;
                i9 = e.f12057s2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.04f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f28486a;
                i9 = e.f12053r2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public TicketAdapter(List list, Context context) {
        this.f28474d = list;
        this.f28475e = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(final com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.TicketAdapter.MyViewHolder r6, final int r7) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.TicketAdapter.E(com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.TicketAdapter$MyViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder L(ViewGroup viewGroup, int i9) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(g.f12667K4, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f28474d.size();
    }
}
