package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
final class ak extends bu {
    private final boolean attached;
    private final ay bounds;
    private final String detailedReason;
    private final boolean hidden;
    private final FriendlyObstructionPurpose purpose;
    private final String type;

    private ak(boolean z9, ay ayVar, String str, boolean z10, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.attached = z9;
        this.bounds = ayVar;
        this.detailedReason = str;
        this.hidden = z10;
        this.purpose = friendlyObstructionPurpose;
        this.type = str2;
    }

    public /* synthetic */ ak(boolean z9, ay ayVar, String str, boolean z10, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2, aj ajVar) {
        this(z9, ayVar, str, z10, friendlyObstructionPurpose, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public boolean attached() {
        return this.attached;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public ay bounds() {
        return this.bounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bu) {
            bu buVar = (bu) obj;
            if (this.attached == buVar.attached() && this.bounds.equals(buVar.bounds()) && ((str = this.detailedReason) != null ? str.equals(buVar.detailedReason()) : buVar.detailedReason() == null) && this.hidden == buVar.hidden() && this.purpose.equals(buVar.purpose()) && this.type.equals(buVar.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((true != this.attached ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.bounds.hashCode()) * 1000003;
        String str = this.detailedReason;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.hidden ? 1237 : 1231)) * 1000003) ^ this.purpose.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public boolean hidden() {
        return this.hidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        return "ObstructionData{attached=" + this.attached + ", bounds=" + String.valueOf(this.bounds) + ", detailedReason=" + this.detailedReason + ", hidden=" + this.hidden + ", purpose=" + String.valueOf(this.purpose) + ", type=" + this.type + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public String type() {
        return this.type;
    }
}
