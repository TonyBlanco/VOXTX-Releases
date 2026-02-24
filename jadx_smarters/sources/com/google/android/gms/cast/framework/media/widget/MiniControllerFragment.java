package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.cast.zzln;
import com.google.android.gms.internal.cast.zzr;
import o4.AbstractC2336m;
import o4.AbstractC2338o;
import o4.AbstractC2339p;
import o4.AbstractC2340q;
import o4.AbstractC2341s;
import o4.AbstractC2342t;
import o4.AbstractC2343u;
import o4.AbstractC2344v;
import p4.C2427b;
import r4.C2661b;
import s4.t;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public class MiniControllerFragment extends Fragment {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C2775b f26388z = new C2775b("MiniControllerFragment");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26389a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f26392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f26397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView[] f26398k = new ImageView[3];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f26404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f26406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f26408u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26409v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f26411x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C2661b f26412y;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2661b c2661b = new C2661b(getActivity());
        this.f26412y = c2661b;
        View viewInflate = layoutInflater.inflate(AbstractC2341s.f45990d, viewGroup);
        viewInflate.setVisibility(8);
        c2661b.x(viewInflate, 8);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(AbstractC2340q.f45937K);
        int i9 = this.f26393f;
        if (i9 != 0) {
            relativeLayout.setBackgroundResource(i9);
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(AbstractC2340q.f45942P);
        TextView textView = (TextView) viewInflate.findViewById(AbstractC2340q.f45960d0);
        if (this.f26390c != 0) {
            textView.setTextAppearance(getActivity(), this.f26390c);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(AbstractC2340q.f45952Z);
        this.f26392e = textView2;
        if (this.f26391d != 0) {
            textView2.setTextAppearance(getActivity(), this.f26391d);
        }
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(AbstractC2340q.f45947U);
        if (this.f26394g != 0) {
            ((LayerDrawable) progressBar.getProgressDrawable()).setColorFilter(this.f26394g, PorterDuff.Mode.SRC_IN);
        }
        c2661b.m(textView, "com.google.android.gms.cast.metadata.TITLE");
        c2661b.o(this.f26392e);
        c2661b.j(progressBar);
        c2661b.r(relativeLayout);
        if (this.f26389a) {
            c2661b.g(imageView, new C2427b(2, getResources().getDimensionPixelSize(AbstractC2338o.f45902i), getResources().getDimensionPixelSize(AbstractC2338o.f45901h)), AbstractC2339p.f45910a);
        } else {
            imageView.setVisibility(8);
        }
        this.f26398k[0] = (ImageView) relativeLayout.findViewById(AbstractC2340q.f45971l);
        this.f26398k[1] = (ImageView) relativeLayout.findViewById(AbstractC2340q.f45972m);
        this.f26398k[2] = (ImageView) relativeLayout.findViewById(AbstractC2340q.f45973n);
        x(c2661b, relativeLayout, AbstractC2340q.f45971l, 0);
        x(c2661b, relativeLayout, AbstractC2340q.f45972m, 1);
        x(c2661b, relativeLayout, AbstractC2340q.f45973n, 2);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C2661b c2661b = this.f26412y;
        if (c2661b != null) {
            c2661b.y();
            this.f26412y = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        if (this.f26397j == null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2344v.f46029C, AbstractC2336m.f45891b, AbstractC2343u.f46026b);
            this.f26389a = typedArrayObtainStyledAttributes.getBoolean(AbstractC2344v.f46041O, true);
            this.f26390c = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46046T, 0);
            this.f26391d = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46045S, 0);
            this.f26393f = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46030D, 0);
            int color = typedArrayObtainStyledAttributes.getColor(AbstractC2344v.f46039M, 0);
            this.f26394g = color;
            this.f26395h = typedArrayObtainStyledAttributes.getColor(AbstractC2344v.f46035I, color);
            this.f26396i = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46031E, 0);
            this.f26400m = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46038L, 0);
            this.f26401n = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46037K, 0);
            this.f26402o = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46044R, 0);
            this.f26403p = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46038L, 0);
            this.f26404q = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46037K, 0);
            this.f26405r = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46044R, 0);
            this.f26406s = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46043Q, 0);
            this.f26407t = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46042P, 0);
            this.f26408u = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46040N, 0);
            this.f26409v = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46034H, 0);
            this.f26410w = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46036J, 0);
            this.f26411x = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46032F, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46033G, 0);
            if (resourceId != 0) {
                TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                r.a(typedArrayObtainTypedArray.length() == 3);
                this.f26397j = new int[typedArrayObtainTypedArray.length()];
                for (int i9 = 0; i9 < typedArrayObtainTypedArray.length(); i9++) {
                    this.f26397j[i9] = typedArrayObtainTypedArray.getResourceId(i9, 0);
                }
                typedArrayObtainTypedArray.recycle();
                if (this.f26389a) {
                    this.f26397j[0] = AbstractC2340q.f45978s;
                }
                this.f26399l = 0;
                for (int i10 : this.f26397j) {
                    if (i10 != AbstractC2340q.f45978s) {
                        this.f26399l++;
                    }
                }
            } else {
                f26388z.f("Unable to read attribute castControlButtons.", new Object[0]);
                int i11 = AbstractC2340q.f45978s;
                this.f26397j = new int[]{i11, i11, i11};
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        zzr.zzd(zzln.CAF_MINI_CONTROLLER);
    }

    public final void x(C2661b c2661b, RelativeLayout relativeLayout, int i9, int i10) {
        ImageView imageView = (ImageView) relativeLayout.findViewById(i9);
        int i11 = this.f26397j[i10];
        if (i11 == AbstractC2340q.f45978s) {
            imageView.setVisibility(4);
            return;
        }
        if (i11 == AbstractC2340q.f45977r) {
            return;
        }
        if (i11 == AbstractC2340q.f45981v) {
            int i12 = this.f26400m;
            int i13 = this.f26401n;
            int i14 = this.f26402o;
            if (this.f26399l == 1) {
                i12 = this.f26403p;
                i13 = this.f26404q;
                i14 = this.f26405r;
            }
            Drawable drawableC = t.c(getContext(), this.f26396i, i12);
            Drawable drawableC2 = t.c(getContext(), this.f26396i, i13);
            Drawable drawableC3 = t.c(getContext(), this.f26396i, i14);
            imageView.setImageDrawable(drawableC2);
            ProgressBar progressBar = new ProgressBar(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(8, i9);
            layoutParams.addRule(6, i9);
            layoutParams.addRule(5, i9);
            layoutParams.addRule(7, i9);
            layoutParams.addRule(15);
            progressBar.setLayoutParams(layoutParams);
            progressBar.setVisibility(8);
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            int i15 = this.f26395h;
            if (i15 != 0 && indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(i15, PorterDuff.Mode.SRC_IN);
            }
            relativeLayout.addView(progressBar);
            c2661b.i(imageView, drawableC, drawableC2, drawableC3, progressBar, true);
            return;
        }
        if (i11 == AbstractC2340q.f45984y) {
            imageView.setImageDrawable(t.c(getContext(), this.f26396i, this.f26406s));
            imageView.setContentDescription(getResources().getString(AbstractC2342t.f46018t));
            c2661b.v(imageView, 0);
            return;
        }
        if (i11 == AbstractC2340q.f45983x) {
            imageView.setImageDrawable(t.c(getContext(), this.f26396i, this.f26407t));
            imageView.setContentDescription(getResources().getString(AbstractC2342t.f46017s));
            c2661b.u(imageView, 0);
            return;
        }
        if (i11 == AbstractC2340q.f45982w) {
            imageView.setImageDrawable(t.c(getContext(), this.f26396i, this.f26408u));
            imageView.setContentDescription(getResources().getString(AbstractC2342t.f46016r));
            c2661b.t(imageView, 30000L);
        } else if (i11 == AbstractC2340q.f45979t) {
            imageView.setImageDrawable(t.c(getContext(), this.f26396i, this.f26409v));
            imageView.setContentDescription(getResources().getString(AbstractC2342t.f46009k));
            c2661b.q(imageView, 30000L);
        } else if (i11 == AbstractC2340q.f45980u) {
            imageView.setImageDrawable(t.c(getContext(), this.f26396i, this.f26410w));
            c2661b.h(imageView);
        } else if (i11 == AbstractC2340q.f45976q) {
            imageView.setImageDrawable(t.c(getContext(), this.f26396i, this.f26411x));
            c2661b.p(imageView);
        }
    }
}
