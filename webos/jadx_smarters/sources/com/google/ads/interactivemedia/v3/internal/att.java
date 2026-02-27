package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class att extends auj implements awj {
    private static final long serialVersionUID = 6588350623831699109L;

    public att(Map map) {
        super(map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auj
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.auj
    public final Collection b(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auj
    public final Collection c(Object obj, Collection collection) {
        return g(obj, (List) collection, null);
    }
}
