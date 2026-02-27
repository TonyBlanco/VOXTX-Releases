package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import k.P;
import k.g0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements j.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f13679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f13680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f13681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e.b f13682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public P f13683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f13684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13689s;

    public class a extends P {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // k.P
        public j.f b() {
            b bVar = ActionMenuItemView.this.f13684n;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // k.P
        public boolean c() {
            j.f fVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f13682l;
            return bVar != null && bVar.d(actionMenuItemView.f13679i) && (fVarB = b()) != null && fVarB.a();
        }
    }

    public static abstract class b {
        public abstract j.f a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Resources resources = context.getResources();
        this.f13685o = s();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.f18153v, i9, 0);
        this.f13687q = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.j.f18158w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f13689s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f13688r = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return r();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return r() && this.f13679i.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i9) {
        this.f13679i = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f13683m == null) {
            this.f13683m = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean e() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f13679i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f13682l;
        if (bVar != null) {
            bVar.d(this.f13679i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f13685o = s();
        t();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        int i11;
        boolean zR = r();
        if (zR && (i11 = this.f13688r) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i9, i10);
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f13687q) : this.f13687q;
        if (mode != 1073741824 && this.f13687q > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (zR || this.f13681k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f13681k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        P p9;
        if (this.f13679i.hasSubMenu() && (p9 = this.f13683m) != null && p9.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        return i9 >= 480 || (i9 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }

    public void setExpandedFormat(boolean z9) {
        if (this.f13686p != z9) {
            this.f13686p = z9;
            g gVar = this.f13679i;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f13681k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i9 = this.f13689s;
            if (intrinsicWidth > i9) {
                intrinsicHeight = (int) (intrinsicHeight * (i9 / intrinsicWidth));
                intrinsicWidth = i9;
            }
            if (intrinsicHeight > i9) {
                intrinsicWidth = (int) (intrinsicWidth * (i9 / intrinsicHeight));
            } else {
                i9 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i9);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(e.b bVar) {
        this.f13682l = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i9, int i10, int i11, int i12) {
        this.f13688r = i9;
        super.setPadding(i9, i10, i11, i12);
    }

    public void setPopupCallback(b bVar) {
        this.f13684n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f13680j = charSequence;
        t();
    }

    public final void t() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.f13680j);
        if (this.f13681k != null && (!this.f13679i.B() || (!this.f13685o && !this.f13686p))) {
            z9 = false;
        }
        boolean z11 = z10 & z9;
        setText(z11 ? this.f13680j : null);
        CharSequence contentDescription = this.f13679i.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z11 ? null : this.f13679i.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f13679i.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            g0.a(this, z11 ? null : this.f13679i.getTitle());
        } else {
            g0.a(this, tooltipText);
        }
    }
}
