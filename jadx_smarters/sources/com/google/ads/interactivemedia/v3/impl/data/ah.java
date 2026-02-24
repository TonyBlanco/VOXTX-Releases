package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.avo;

/* JADX INFO: loaded from: classes3.dex */
final class ah extends bv {
    private final avo<bu> obstructions;

    private ah(avo<bu> avoVar) {
        this.obstructions = avoVar;
    }

    public /* synthetic */ ah(avo avoVar, ag agVar) {
        this(avoVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bv) {
            return this.obstructions.equals(((bv) obj).obstructions());
        }
        return false;
    }

    public int hashCode() {
        return this.obstructions.hashCode() ^ 1000003;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bv
    public avo<bu> obstructions() {
        return this.obstructions;
    }

    public String toString() {
        return "ObstructionListData{obstructions=" + String.valueOf(this.obstructions) + "}";
    }
}
