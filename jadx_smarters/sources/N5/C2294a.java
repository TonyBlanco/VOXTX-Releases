package n5;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: n5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2294a extends com.google.android.material.tabs.a {
    public static float e(float f9) {
        return (float) (1.0d - Math.cos((((double) f9) * 3.141592653589793d) / 2.0d));
    }

    public static float f(float f9) {
        return (float) Math.sin((((double) f9) * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.a
    public void d(TabLayout tabLayout, View view, View view2, float f9, Drawable drawable) {
        float f10;
        float fE;
        RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF rectFA2 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            f10 = e(f9);
            fE = f(f9);
        } else {
            f10 = f(f9);
            fE = e(f9);
        }
        drawable.setBounds(S4.a.c((int) rectFA.left, (int) rectFA2.left, f10), drawable.getBounds().top, S4.a.c((int) rectFA.right, (int) rectFA2.right, fE), drawable.getBounds().bottom);
    }
}
