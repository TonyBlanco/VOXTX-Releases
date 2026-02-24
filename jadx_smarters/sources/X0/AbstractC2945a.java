package x0;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.k;
import d.AbstractC1617D;
import f.C1753d;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: x0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2945a implements NavController.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f51863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f51864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1753d f51865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f51866e;

    public AbstractC2945a(Context context, C2946b c2946b) {
        this.f51862a = context;
        this.f51863b = c2946b.c();
        c2946b.b();
        this.f51864c = null;
    }

    @Override // androidx.navigation.NavController.b
    public void a(NavController navController, k kVar, Bundle bundle) {
        if (kVar instanceof androidx.navigation.b) {
            return;
        }
        WeakReference weakReference = this.f51864c;
        if (weakReference != null) {
            AbstractC1617D.a(weakReference.get());
        }
        if (this.f51864c != null) {
            navController.x(this);
            return;
        }
        CharSequence charSequenceJ = kVar.j();
        if (charSequenceJ != null) {
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequenceJ);
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (bundle == null || !bundle.containsKey(strGroup)) {
                    throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill label " + ((Object) charSequenceJ));
                }
                matcher.appendReplacement(stringBuffer, "");
                stringBuffer.append(bundle.get(strGroup).toString());
            }
            matcher.appendTail(stringBuffer);
            d(stringBuffer);
        }
        if (AbstractC2947c.b(kVar, this.f51863b)) {
            c(null, 0);
        } else {
            b(false);
        }
    }

    public final void b(boolean z9) {
        boolean z10;
        if (this.f51865d == null) {
            this.f51865d = new C1753d(this.f51862a);
            z10 = false;
        } else {
            z10 = true;
        }
        c(this.f51865d, z9 ? AbstractC2948d.f51872b : AbstractC2948d.f51871a);
        float f9 = z9 ? 0.0f : 1.0f;
        if (!z10) {
            this.f51865d.setProgress(f9);
            return;
        }
        float fA = this.f51865d.a();
        ValueAnimator valueAnimator = this.f51866e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51865d, "progress", fA, f9);
        this.f51866e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.start();
    }

    public abstract void c(Drawable drawable, int i9);

    public abstract void d(CharSequence charSequence);
}
