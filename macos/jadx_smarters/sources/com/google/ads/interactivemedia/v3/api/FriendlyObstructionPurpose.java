package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.internal.agv;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
public enum FriendlyObstructionPurpose {
    VIDEO_CONTROLS,
    CLOSE_AD,
    NOT_VISIBLE,
    OTHER;

    @Hide
    public agv getOmidPurpose() {
        return (agv) Enum.valueOf(agv.class, name());
    }
}
