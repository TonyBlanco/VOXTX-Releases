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
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MyAllServiceAdapter extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f28463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f28464e;

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28467a;

        public OnFocusChangeAccountListener(View view) {
            this.f28467a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28467a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28467a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28467a, "scaleY", f9);
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
                Log.e("id is", "" + this.f28467a.getTag());
                view2 = this.f28467a;
                i9 = e.f12057s2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.04f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f28467a;
                i9 = e.f12053r2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public class ViewHolder extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f28469t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f28470u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f28471v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public LinearLayout f28472w;

        public ViewHolder(View view) {
            super(view);
            this.f28469t = (TextView) view.findViewById(f.fm);
            this.f28470u = (TextView) view.findViewById(f.Wk);
            this.f28471v = (TextView) view.findViewById(f.pk);
            this.f28472w = (LinearLayout) view.findViewById(f.g9);
        }
    }

    public MyAllServiceAdapter(Context context, ArrayList arrayList) {
        this.f28463d = context;
        this.f28464e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(final com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.MyAllServiceAdapter.ViewHolder r6, int r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.MyAllServiceAdapter.E(com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.MyAllServiceAdapter$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public ViewHolder L(ViewGroup viewGroup, int i9) {
        return new ViewHolder(LayoutInflater.from(this.f28463d).inflate(g.f12688O1, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f28464e.size();
    }
}
