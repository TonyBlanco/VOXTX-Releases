package com.google.ads.interactivemedia.v3.api;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public interface CompanionAdSlot {
    public static final int FLUID_SIZE = -2;

    public interface ClickListener {
        void onCompanionAdClick();
    }

    void addClickListener(ClickListener clickListener);

    ViewGroup getContainer();

    int getHeight();

    int getWidth();

    boolean isFilled();

    void removeClickListener(ClickListener clickListener);

    void setContainer(ViewGroup viewGroup);

    void setSize(int i9, int i10);
}
