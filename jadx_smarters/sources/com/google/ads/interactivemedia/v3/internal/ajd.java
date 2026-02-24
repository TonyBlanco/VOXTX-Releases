package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ajd implements CompanionAdSlot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f19928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f19929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f19930e = new ArrayList(1);

    public final List a() {
        return this.f19930e;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void addClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.f19930e.add(clickListener);
    }

    public final void b(String str) {
        this.f19929d = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final ViewGroup getContainer() {
        return this.f19928c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final int getHeight() {
        return this.f19927b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final int getWidth() {
        return this.f19926a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final boolean isFilled() {
        return this.f19928c.findViewWithTag(this.f19929d) != null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void removeClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.f19930e.remove(clickListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void setContainer(ViewGroup viewGroup) {
        this.f19928c = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void setSize(int i9, int i10) {
        this.f19926a = i9;
        this.f19927b = i10;
    }
}
