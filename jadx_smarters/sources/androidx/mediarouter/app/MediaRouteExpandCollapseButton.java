package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import k.C2119n;
import t0.j;

/* JADX INFO: loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends C2119n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimationDrawable f16013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AnimationDrawable f16014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View.OnClickListener f16018j;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton;
            String str;
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
            boolean z9 = !mediaRouteExpandCollapseButton2.f16017i;
            mediaRouteExpandCollapseButton2.f16017i = z9;
            if (z9) {
                mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.f16013e);
                MediaRouteExpandCollapseButton.this.f16013e.start();
                mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                str = mediaRouteExpandCollapseButton.f16016h;
            } else {
                mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.f16014f);
                MediaRouteExpandCollapseButton.this.f16014f.start();
                mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                str = mediaRouteExpandCollapseButton.f16015g;
            }
            mediaRouteExpandCollapseButton.setContentDescription(str);
            View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.f16018j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        AnimationDrawable animationDrawable = (AnimationDrawable) E.b.getDrawable(context, t0.e.f50507d);
        this.f16013e = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) E.b.getDrawable(context, t0.e.f50506c);
        this.f16014f = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i.f(context, i9), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(j.f50587i);
        this.f16015g = string;
        this.f16016h = context.getString(j.f50585g);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new a());
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f16018j = onClickListener;
    }
}
