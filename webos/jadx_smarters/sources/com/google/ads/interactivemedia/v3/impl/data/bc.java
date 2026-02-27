package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public interface bc {
    bd build();

    bc detailedReason(String str);

    bc purpose(FriendlyObstructionPurpose friendlyObstructionPurpose);

    bc view(View view);
}
