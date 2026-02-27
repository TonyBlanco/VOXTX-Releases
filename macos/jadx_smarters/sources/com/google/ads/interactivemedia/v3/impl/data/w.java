package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
final class w extends bd {
    private final String detailedReason;
    private final FriendlyObstructionPurpose purpose;
    private final View view;

    private w(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.view = view;
        this.purpose = friendlyObstructionPurpose;
        this.detailedReason = str;
    }

    public /* synthetic */ w(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str, v vVar) {
        this(view, friendlyObstructionPurpose, str);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bd) {
            bd bdVar = (bd) obj;
            if (this.view.equals(bdVar.view()) && this.purpose.equals(bdVar.purpose())) {
                String str = this.detailedReason;
                String strDetailedReason = bdVar.detailedReason();
                if (str != null ? str.equals(strDetailedReason) : strDetailedReason == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.view.hashCode() ^ 1000003) * 1000003) ^ this.purpose.hashCode()) * 1000003;
        String str = this.detailedReason;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        return "FriendlyObstructionImpl{view=" + String.valueOf(this.view) + ", purpose=" + String.valueOf(this.purpose) + ", detailedReason=" + this.detailedReason + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public View view() {
        return this.view;
    }
}
