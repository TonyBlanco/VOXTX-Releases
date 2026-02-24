package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bd implements FriendlyObstruction {
    public static bc builder() {
        return new u();
    }

    public abstract String detailedReason();

    @Override // com.google.ads.interactivemedia.v3.api.FriendlyObstruction
    public String getDetailedReason() {
        return detailedReason();
    }

    @Override // com.google.ads.interactivemedia.v3.api.FriendlyObstruction
    public FriendlyObstructionPurpose getPurpose() {
        return purpose();
    }

    @Override // com.google.ads.interactivemedia.v3.api.FriendlyObstruction
    public View getView() {
        return view();
    }

    public abstract FriendlyObstructionPurpose purpose();

    public abstract View view();
}
