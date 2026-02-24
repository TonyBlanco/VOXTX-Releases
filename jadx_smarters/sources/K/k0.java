package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import c.AbstractC1241d;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f43370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f43372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f43373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f43374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f43375g;

    public k0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f43372d = layoutParams;
        this.f43373e = new Rect();
        this.f43374f = new int[2];
        this.f43375g = new int[2];
        this.f43369a = context;
        View viewInflate = LayoutInflater.from(context).inflate(c.g.f17895s, (ViewGroup) null);
        this.f43370b = viewInflate;
        this.f43371c = (TextView) viewInflate.findViewById(c.f.f17869s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = c.i.f17911a;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public final void a(View view, int i9, int i10, boolean z9, WindowManager.LayoutParams layoutParams) {
        int height;
        int i11;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f43369a.getResources().getDimensionPixelOffset(AbstractC1241d.f17787k);
        if (view.getWidth() < dimensionPixelOffset) {
            i9 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f43369a.getResources().getDimensionPixelOffset(AbstractC1241d.f17786j);
            height = i10 + dimensionPixelOffset2;
            i11 = i10 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i11 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f43369a.getResources().getDimensionPixelOffset(z9 ? AbstractC1241d.f17789m : AbstractC1241d.f17788l);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f43373e);
        Rect rect = this.f43373e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f43369a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f43373e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f43375g);
        view.getLocationOnScreen(this.f43374f);
        int[] iArr = this.f43374f;
        int i12 = iArr[0];
        int[] iArr2 = this.f43375g;
        int i13 = i12 - iArr2[0];
        iArr[0] = i13;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i13 + i9) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f43370b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f43370b.getMeasuredHeight();
        int i14 = this.f43374f[1];
        int i15 = ((i11 + i14) - dimensionPixelOffset3) - measuredHeight;
        int i16 = i14 + height + dimensionPixelOffset3;
        if (!z9 ? measuredHeight + i16 <= this.f43373e.height() : i15 < 0) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i16;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f43369a.getSystemService("window")).removeView(this.f43370b);
        }
    }

    public boolean d() {
        return this.f43370b.getParent() != null;
    }

    public void e(View view, int i9, int i10, boolean z9, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f43371c.setText(charSequence);
        a(view, i9, i10, z9, this.f43372d);
        ((WindowManager) this.f43369a.getSystemService("window")).addView(this.f43370b, this.f43372d);
    }
}
