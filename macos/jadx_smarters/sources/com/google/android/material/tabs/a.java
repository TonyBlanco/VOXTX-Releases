package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import f5.w;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.y() || !(view instanceof TabLayout.i)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.i) view, 24);
    }

    public static RectF b(TabLayout.i iVar, int i9) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int iB = (int) w.b(iVar.getContext(), i9);
        if (contentWidth < iB) {
            contentWidth = iB;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i10 = contentWidth / 2;
        return new RectF(left - i10, top - (contentHeight / 2), i10 + left, top + (left / 2));
    }

    public void c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }

    public void d(TabLayout tabLayout, View view, View view2, float f9, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(S4.a.c((int) rectFA.left, (int) rectFA2.left, f9), drawable.getBounds().top, S4.a.c((int) rectFA.right, (int) rectFA2.right, f9), drawable.getBounds().bottom);
    }
}
