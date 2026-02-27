package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.avo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class af extends bs {
    private avo<bu> obstructions;

    @Override // com.google.ads.interactivemedia.v3.impl.data.bs
    public bv build() {
        avo<bu> avoVar = this.obstructions;
        if (avoVar != null) {
            return new ah(avoVar, null);
        }
        throw new IllegalStateException("Missing required properties: obstructions");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bs
    public bs obstructions(List<bu> list) {
        this.obstructions = avo.m(list);
        return this;
    }
}
