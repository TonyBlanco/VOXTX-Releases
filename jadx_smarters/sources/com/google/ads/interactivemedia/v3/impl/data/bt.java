package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bt {
    public abstract bt attached(boolean z9);

    public abstract bt bounds(ay ayVar);

    public abstract bu build();

    public abstract bt detailedReason(String str);

    public abstract bt hidden(boolean z9);

    public abstract bt purpose(FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract bt type(String str);

    public bt view(View view) {
        return attached(view.isAttachedToWindow()).bounds(ay.builder().locationOnScreenOfView(view).build()).hidden(!view.isShown()).type(view.getClass().getCanonicalName());
    }
}
