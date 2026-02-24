package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bsl extends bst {
    public bsl(int i9) {
        super(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bst
    public final void a() {
        if (!j()) {
            for (int i9 = 0; i9 < b(); i9++) {
                Map.Entry entryG = g(i9);
                if (((bqd) entryG.getKey()).e()) {
                    entryG.setValue(Collections.unmodifiableList((List) entryG.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((bqd) entry.getKey()).e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
