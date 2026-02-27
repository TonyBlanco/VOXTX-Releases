package androidx.appcompat.view.menu;

import P.L;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import c.AbstractC1238a;
import k.d0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f13694a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f13695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f13696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f13697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f13698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f13699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f13700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f13701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f13702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f13703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f13705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f13707o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LayoutInflater f13709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13710r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17728E);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet);
        d0 d0VarV = d0.v(getContext(), attributeSet, c.j.f18055b2, i9, 0);
        this.f13703k = d0VarV.g(c.j.f18066d2);
        this.f13704l = d0VarV.n(c.j.f18061c2, -1);
        this.f13706n = d0VarV.a(c.j.f18071e2, false);
        this.f13705m = context;
        this.f13707o = d0VarV.g(c.j.f18076f2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC1238a.f17724A, 0);
        this.f13708p = typedArrayObtainStyledAttributes.hasValue(0);
        d0VarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f13709q == null) {
            this.f13709q = LayoutInflater.from(getContext());
        }
        return this.f13709q;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        ImageView imageView = this.f13700h;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f13701i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13701i.getLayoutParams();
        rect.top += this.f13701i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i9) {
        LinearLayout linearLayout = this.f13702j;
        if (linearLayout != null) {
            linearLayout.addView(view, i9);
        } else {
            addView(view, i9);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i9) {
        this.f13694a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public final void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(c.g.f17884h, (ViewGroup) this, false);
        this.f13698f = checkBox;
        a(checkBox);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean e() {
        return false;
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(c.g.f17885i, (ViewGroup) this, false);
        this.f13695c = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(c.g.f17887k, (ViewGroup) this, false);
        this.f13696d = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f13694a;
    }

    public void h(boolean z9, char c9) {
        int i9 = (z9 && this.f13694a.A()) ? 0 : 8;
        if (i9 == 0) {
            this.f13699g.setText(this.f13694a.h());
        }
        if (this.f13699g.getVisibility() != i9) {
            this.f13699g.setVisibility(i9);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        L.w0(this, this.f13703k);
        TextView textView = (TextView) findViewById(c.f.f17847M);
        this.f13697e = textView;
        int i9 = this.f13704l;
        if (i9 != -1) {
            textView.setTextAppearance(this.f13705m, i9);
        }
        this.f13699g = (TextView) findViewById(c.f.f17840F);
        ImageView imageView = (ImageView) findViewById(c.f.f17843I);
        this.f13700h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f13707o);
        }
        this.f13701i = (ImageView) findViewById(c.f.f17868r);
        this.f13702j = (LinearLayout) findViewById(c.f.f17862l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        if (this.f13695c != null && this.f13706n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13695c.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i9, i10);
    }

    public void setCheckable(boolean z9) {
        CompoundButton compoundButton;
        View view;
        if (!z9 && this.f13696d == null && this.f13698f == null) {
            return;
        }
        if (this.f13694a.m()) {
            if (this.f13696d == null) {
                g();
            }
            compoundButton = this.f13696d;
            view = this.f13698f;
        } else {
            if (this.f13698f == null) {
                d();
            }
            compoundButton = this.f13698f;
            view = this.f13696d;
        }
        if (z9) {
            compoundButton.setChecked(this.f13694a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f13698f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f13696d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z9) {
        CompoundButton compoundButton;
        if (this.f13694a.m()) {
            if (this.f13696d == null) {
                g();
            }
            compoundButton = this.f13696d;
        } else {
            if (this.f13698f == null) {
                d();
            }
            compoundButton = this.f13698f;
        }
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.f13710r = z9;
        this.f13706n = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        ImageView imageView = this.f13701i;
        if (imageView != null) {
            imageView.setVisibility((this.f13708p || !z9) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z9 = this.f13694a.z() || this.f13710r;
        if (z9 || this.f13706n) {
            ImageView imageView = this.f13695c;
            if (imageView == null && drawable == null && !this.f13706n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f13706n) {
                this.f13695c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f13695c;
            if (!z9) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f13695c.getVisibility() != 0) {
                this.f13695c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i9;
        TextView textView;
        if (charSequence != null) {
            this.f13697e.setText(charSequence);
            if (this.f13697e.getVisibility() == 0) {
                return;
            }
            textView = this.f13697e;
            i9 = 0;
        } else {
            i9 = 8;
            if (this.f13697e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f13697e;
            }
        }
        textView.setVisibility(i9);
    }
}
