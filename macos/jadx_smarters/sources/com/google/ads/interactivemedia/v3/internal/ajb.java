package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ajb implements BaseDisplayContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f19905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f19906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection f19907c = avo.o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f19908d = awb.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f19909e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private aja f19910f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19911g = false;

    public ajb(ViewGroup viewGroup) {
        this.f19906b = viewGroup;
    }

    public final Map a() {
        return this.f19908d;
    }

    public final Set b() {
        return new HashSet(this.f19909e);
    }

    public final void c(aja ajaVar) {
        this.f19910f = ajaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void claim() {
        atp.f(!this.f19911g, "A given DisplayContainer may only be used once");
        this.f19911g = true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void destroy() {
        ViewGroup viewGroup = this.f19906b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final ViewGroup getAdContainer() {
        return this.f19906b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final Collection<CompanionAdSlot> getCompanionSlots() {
        return this.f19907c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction) {
        if (friendlyObstruction == null || this.f19909e.contains(friendlyObstruction)) {
            return;
        }
        this.f19909e.add(friendlyObstruction);
        aja ajaVar = this.f19910f;
        if (ajaVar != null) {
            ((akn) ajaVar).c(friendlyObstruction);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void registerVideoControlsOverlay(View view) {
        if (view == null) {
            return;
        }
        com.google.ads.interactivemedia.v3.impl.data.bc bcVarBuilder = com.google.ads.interactivemedia.v3.impl.data.bd.builder();
        bcVarBuilder.view(view);
        bcVarBuilder.purpose(FriendlyObstructionPurpose.VIDEO_CONTROLS);
        com.google.ads.interactivemedia.v3.impl.data.bd bdVarBuild = bcVarBuilder.build();
        if (this.f19909e.contains(bdVarBuild)) {
            return;
        }
        this.f19909e.add(bdVarBuild);
        aja ajaVar = this.f19910f;
        if (ajaVar != null) {
            ((akn) ajaVar).c(bdVarBuild);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void setAdContainer(ViewGroup viewGroup) {
        atp.k(viewGroup);
        this.f19906b = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void setCompanionSlots(Collection<CompanionAdSlot> collection) {
        if (collection == null) {
            collection = avo.o();
        }
        avq avqVar = new avq();
        for (CompanionAdSlot companionAdSlot : collection) {
            if (companionAdSlot != null) {
                int i9 = f19905a;
                f19905a = i9 + 1;
                avqVar.a("compSlot_" + i9, companionAdSlot);
            }
        }
        this.f19908d = avqVar.b();
        this.f19907c = collection;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void unregisterAllFriendlyObstructions() {
        this.f19909e.clear();
        aja ajaVar = this.f19910f;
        if (ajaVar != null) {
            ((akn) ajaVar).g();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void unregisterAllVideoControlsOverlays() {
        this.f19909e.clear();
        aja ajaVar = this.f19910f;
        if (ajaVar != null) {
            ((akn) ajaVar).g();
        }
    }
}
