package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
final class u implements bc {
    private String detailedReason;
    private FriendlyObstructionPurpose purpose;
    private View view;

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public bd build() {
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        View view = this.view;
        if (view != null && (friendlyObstructionPurpose = this.purpose) != null) {
            return new w(view, friendlyObstructionPurpose, this.detailedReason, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.view == null) {
            sb.append(" view");
        }
        if (this.purpose == null) {
            sb.append(" purpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public bc detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public bc purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (friendlyObstructionPurpose == null) {
            throw new NullPointerException("Null purpose");
        }
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public bc view(View view) {
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.view = view;
        return this;
    }
}
