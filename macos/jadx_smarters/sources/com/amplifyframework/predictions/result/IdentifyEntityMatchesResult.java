package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.EntityMatch;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IdentifyEntityMatchesResult implements IdentifyResult {
    private final List<EntityMatch> entityMatches;

    private IdentifyEntityMatchesResult(List<EntityMatch> list) {
        this.entityMatches = list;
    }

    public static IdentifyEntityMatchesResult fromEntityMatches(List<EntityMatch> list) {
        Objects.requireNonNull(list);
        return new IdentifyEntityMatchesResult(list);
    }

    public List<EntityMatch> getEntityMatches() {
        return Immutable.of(this.entityMatches);
    }
}
