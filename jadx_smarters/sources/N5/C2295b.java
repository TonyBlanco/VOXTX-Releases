package n5;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: n5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2295b extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public void d(TabLayout tabLayout, View view, View view2, float f9, Drawable drawable) {
        if (f9 >= 0.5f) {
            view = view2;
        }
        RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, view);
        float fB = f9 < 0.5f ? S4.a.b(1.0f, 0.0f, 0.0f, 0.5f, f9) : S4.a.b(0.0f, 1.0f, 0.5f, 1.0f, f9);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fB * 255.0f));
    }
}
