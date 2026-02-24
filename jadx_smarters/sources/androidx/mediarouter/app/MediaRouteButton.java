package androidx.mediarouter.app;

import P.L;
import android.R;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractActivityC1145e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.w;
import e.AbstractC1726a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC2758a;
import t0.j;
import t0.l;
import u0.C2811K;
import u0.C2812L;
import u0.g0;

/* JADX INFO: loaded from: classes.dex */
public class MediaRouteButton extends View {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static a f15985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseArray f15986t = new SparseArray(2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f15987u = {R.attr.state_checked};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f15988v = {R.attr.state_checkable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2812L f15989a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2811K f15991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f15992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f15996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f15997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f16001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16005r;

    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f16006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16007b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f16008c = new ArrayList();

        public a(Context context) {
            this.f16006a = context;
        }

        public boolean a() {
            return this.f16007b;
        }

        public void b(MediaRouteButton mediaRouteButton) {
            if (this.f16008c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.f16006a.registerReceiver(this, intentFilter);
            }
            this.f16008c.add(mediaRouteButton);
        }

        public void c(MediaRouteButton mediaRouteButton) {
            this.f16008c.remove(mediaRouteButton);
            if (this.f16008c.size() == 0) {
                this.f16006a.unregisterReceiver(this);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z9;
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || this.f16007b == (!intent.getBooleanExtra("noConnectivity", false))) {
                return;
            }
            this.f16007b = z9;
            Iterator it = this.f16008c.iterator();
            while (it.hasNext()) {
                ((MediaRouteButton) it.next()).c();
            }
        }
    }

    public final class b extends C2812L.a {
        public b() {
        }

        @Override // u0.C2812L.a
        public void onProviderAdded(C2812L c2812l, C2812L.g gVar) {
            MediaRouteButton.this.b();
        }

        @Override // u0.C2812L.a
        public void onProviderChanged(C2812L c2812l, C2812L.g gVar) {
            MediaRouteButton.this.b();
        }

        @Override // u0.C2812L.a
        public void onProviderRemoved(C2812L c2812l, C2812L.g gVar) {
            MediaRouteButton.this.b();
        }

        @Override // u0.C2812L.a
        public void onRouteAdded(C2812L c2812l, C2812L.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // u0.C2812L.a
        public void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // u0.C2812L.a
        public void onRouteRemoved(C2812L c2812l, C2812L.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // u0.C2812L.a
        public void onRouteSelected(C2812L c2812l, C2812L.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // u0.C2812L.a
        public void onRouteUnselected(C2812L c2812l, C2812L.h hVar) {
            MediaRouteButton.this.b();
        }

        @Override // u0.C2812L.a
        public void onRouterParamsChanged(C2812L c2812l, g0 g0Var) {
            boolean z9 = g0Var != null ? g0Var.b().getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
            MediaRouteButton mediaRouteButton = MediaRouteButton.this;
            if (mediaRouteButton.f15995h != z9) {
                mediaRouteButton.f15995h = z9;
                mediaRouteButton.refreshDrawableState();
            }
        }
    }

    public final class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f16011b;

        public c(int i9, Context context) {
            this.f16010a = i9;
            this.f16011b = context;
        }

        public final void a(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.f15986t.put(this.f16010a, drawable.getConstantState());
            }
            MediaRouteButton.this.f15996i = null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            if (((Drawable.ConstantState) MediaRouteButton.f15986t.get(this.f16010a)) == null) {
                return AbstractC1726a.b(this.f16011b, this.f16010a);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Drawable drawable) {
            a(drawable);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                a(drawable);
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.f15986t.get(this.f16010a);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                MediaRouteButton.this.f15996i = null;
            }
            MediaRouteButton.this.setRemoteIndicatorDrawableInternal(drawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2758a.f50478a);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i9) {
        Drawable.ConstantState constantState;
        super(i.a(context), attributeSet, i9);
        this.f15991d = C2811K.f50924c;
        this.f15992e = e.getDefault();
        this.f15994g = 0;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.f50602a, i9, 0);
        L.q0(this, context2, l.f50602a, attributeSet, typedArrayObtainStyledAttributes, i9, 0);
        if (isInEditMode()) {
            this.f15989a = null;
            this.f15990c = null;
            this.f15997j = AbstractC1726a.b(context2, typedArrayObtainStyledAttributes.getResourceId(l.f50606e, 0));
            return;
        }
        C2812L c2812lJ = C2812L.j(context2);
        this.f15989a = c2812lJ;
        this.f15990c = new b();
        C2812L.h hVarN = c2812lJ.n();
        int iC = hVarN.w() ^ true ? hVarN.c() : 0;
        this.f16000m = iC;
        this.f15999l = iC;
        if (f15985s == null) {
            f15985s = new a(context2.getApplicationContext());
        }
        this.f16001n = typedArrayObtainStyledAttributes.getColorStateList(l.f50607f);
        this.f16002o = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f50603b, 0);
        this.f16003p = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f50604c, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f50606e, 0);
        this.f15998k = typedArrayObtainStyledAttributes.getResourceId(l.f50605d, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i10 = this.f15998k;
        if (i10 != 0 && (constantState = (Drawable.ConstantState) f15986t.get(i10)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.f15997j == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) f15986t.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    c cVar = new c(resourceId, getContext());
                    this.f15996i = cVar;
                    cVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        i();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private m getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof AbstractActivityC1145e) {
            return ((AbstractActivityC1145e) activity).getSupportFragmentManager();
        }
        return null;
    }

    public final void a() {
        if (this.f15998k > 0) {
            c cVar = this.f15996i;
            if (cVar != null) {
                cVar.cancel(false);
            }
            c cVar2 = new c(this.f15998k, getContext());
            this.f15996i = cVar2;
            this.f15998k = 0;
            cVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public void b() {
        C2812L.h hVarN = this.f15989a.n();
        boolean z9 = true;
        boolean z10 = !hVarN.w();
        int iC = z10 ? hVarN.c() : 0;
        if (this.f16000m != iC) {
            this.f16000m = iC;
            i();
            refreshDrawableState();
        }
        if (iC == 1) {
            a();
        }
        if (this.f15993f) {
            if (!this.f16004q && !z10 && !this.f15989a.q(this.f15991d, 1)) {
                z9 = false;
            }
            setEnabled(z9);
        }
    }

    public void c() {
        super.setVisibility((this.f15994g != 0 || this.f16004q || f15985s.a()) ? this.f15994g : 4);
        Drawable drawable = this.f15997j;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public boolean d() {
        if (!this.f15993f) {
            return false;
        }
        g0 g0VarL = this.f15989a.l();
        if (g0VarL == null) {
            return e(1);
        }
        if (g0VarL.d() && C2812L.p() && f()) {
            return true;
        }
        return e(g0VarL.a());
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f15997j != null) {
            this.f15997j.setState(getDrawableState());
            if (this.f15997j.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f15997j.getCurrent();
                int i9 = this.f16000m;
                if (i9 == 1 || this.f15999l != i9) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i9 == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.f15999l = this.f16000m;
    }

    public final boolean e(int i9) {
        String str;
        String str2;
        Fragment fragment;
        m fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        if (this.f15989a.n().w()) {
            str = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
            if (fragmentManager.h0("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                str2 = "showDialog(): Route chooser dialog already showing!";
                Log.w("MediaRouteButton", str2);
                return false;
            }
            androidx.mediarouter.app.b bVarOnCreateChooserDialogFragment = this.f15992e.onCreateChooserDialogFragment();
            bVarOnCreateChooserDialogFragment.setRouteSelector(this.f15991d);
            fragment = bVarOnCreateChooserDialogFragment;
            if (i9 == 2) {
                bVarOnCreateChooserDialogFragment.setUseDynamicGroup(true);
                fragment = bVarOnCreateChooserDialogFragment;
            }
            w wVarM = fragmentManager.m();
            wVarM.e(fragment, str);
            wVarM.j();
            return true;
        }
        str = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
        if (fragmentManager.h0("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            str2 = "showDialog(): Route controller dialog already showing!";
            Log.w("MediaRouteButton", str2);
            return false;
        }
        d dVarOnCreateControllerDialogFragment = this.f15992e.onCreateControllerDialogFragment();
        dVarOnCreateControllerDialogFragment.setRouteSelector(this.f15991d);
        fragment = dVarOnCreateControllerDialogFragment;
        if (i9 == 2) {
            dVarOnCreateControllerDialogFragment.setUseDynamicGroup(true);
            fragment = dVarOnCreateControllerDialogFragment;
        }
        w wVarM2 = fragmentManager.m();
        wVarM2.e(fragment, str);
        wVarM2.j();
        return true;
    }

    public final boolean f() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            boolean zH = h();
            if (zH) {
                return zH;
            }
        } else if (i9 != 30) {
            return false;
        }
        return g();
    }

    public final boolean g() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent intentPutExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", this.f15989a.k());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.startActivity(intentPutExtra);
                return true;
            }
        }
        return false;
    }

    public e getDialogFactory() {
        return this.f15992e;
    }

    public C2811K getRouteSelector() {
        return this.f15991d;
    }

    public final boolean h() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent intentPutExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName()).putExtra("key_media_session_token", this.f15989a.k());
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.sendBroadcast(intentPutExtra);
                return true;
            }
        }
        return false;
    }

    public final void i() {
        int i9 = this.f16000m;
        String string = getContext().getString(i9 != 1 ? i9 != 2 ? j.f50581c : j.f50579a : j.f50580b);
        setContentDescription(string);
        if (!this.f16005r || TextUtils.isEmpty(string)) {
            string = null;
        }
        k.g0.a(this, string);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15997j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f15993f = true;
        if (!this.f15991d.f()) {
            this.f15989a.a(this.f15991d, this.f15990c);
        }
        b();
        f15985s.b(this);
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i9) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        if (this.f15989a == null || this.f15995h) {
            return iArrOnCreateDrawableState;
        }
        int i10 = this.f16000m;
        if (i10 == 1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15988v);
        } else if (i10 == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15987u);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f15993f = false;
            if (!this.f15991d.f()) {
                this.f15989a.s(this.f15990c);
            }
            f15985s.c(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15997j != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.f15997j.getIntrinsicWidth();
            int intrinsicHeight = this.f15997j.getIntrinsicHeight();
            int i9 = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i10 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.f15997j.setBounds(i9, i10, intrinsicWidth + i9, intrinsicHeight + i10);
            this.f15997j.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i11 = this.f16002o;
        Drawable drawable = this.f15997j;
        int iMax = Math.max(i11, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i12 = this.f16003p;
        Drawable drawable2 = this.f15997j;
        int iMax2 = Math.max(i12, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        a();
        return d() || zPerformClick;
    }

    public void setAlwaysVisible(boolean z9) {
        if (z9 != this.f16004q) {
            this.f16004q = z9;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z9) {
        if (z9 != this.f16005r) {
            this.f16005r = z9;
            i();
        }
    }

    public void setDialogFactory(e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.f15992e = eVar;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.f15998k = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        c cVar = this.f15996i;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable2 = this.f15997j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f15997j);
        }
        if (drawable != null) {
            if (this.f16001n != null) {
                drawable = H.a.r(drawable.mutate());
                H.a.o(drawable, this.f16001n);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.f15997j = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(C2811K c2811k) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f15991d.equals(c2811k)) {
            return;
        }
        if (this.f15993f) {
            if (!this.f15991d.f()) {
                this.f15989a.s(this.f15990c);
            }
            if (!c2811k.f()) {
                this.f15989a.a(c2811k, this.f15990c);
            }
        }
        this.f15991d = c2811k;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        this.f15994g = i9;
        c();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15997j;
    }
}
