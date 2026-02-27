package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.SearchOrbView;
import g0.AbstractC1796a;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
public class TitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f15594a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f15595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SearchOrbView f15596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z f15599g;

    public class a extends Z {
        public a() {
        }
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1796a.f40956a);
    }

    public TitleView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15597e = 6;
        this.f15598f = false;
        this.f15599g = new a();
        View viewInflate = LayoutInflater.from(context).inflate(g0.h.f41061n, this);
        this.f15594a = (ImageView) viewInflate.findViewById(AbstractC1801f.f41013B);
        this.f15595c = (TextView) viewInflate.findViewById(AbstractC1801f.f41015D);
        this.f15596d = (SearchOrbView) viewInflate.findViewById(AbstractC1801f.f41014C);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void a() {
        if (this.f15594a.getDrawable() != null) {
            this.f15594a.setVisibility(0);
            this.f15595c.setVisibility(8);
        } else {
            this.f15594a.setVisibility(8);
            this.f15595c.setVisibility(0);
        }
    }

    public final void b() {
        int i9 = 4;
        if (this.f15598f && (this.f15597e & 4) == 4) {
            i9 = 0;
        }
        this.f15596d.setVisibility(i9);
    }

    public Drawable getBadgeDrawable() {
        return this.f15594a.getDrawable();
    }

    public SearchOrbView.c getSearchAffordanceColors() {
        return this.f15596d.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f15596d;
    }

    public CharSequence getTitle() {
        return this.f15595c.getText();
    }

    public Z getTitleViewAdapter() {
        return this.f15599g;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f15594a.setImageDrawable(drawable);
        a();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.f15598f = onClickListener != null;
        this.f15596d.setOnOrbClickedListener(onClickListener);
        b();
    }

    public void setSearchAffordanceColors(SearchOrbView.c cVar) {
        this.f15596d.setOrbColors(cVar);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15595c.setText(charSequence);
        a();
    }
}
