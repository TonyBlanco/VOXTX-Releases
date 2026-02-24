package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.EntityDetails;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IdentifyEntitiesResult implements IdentifyResult {
    private final List<EntityDetails> entities;

    private IdentifyEntitiesResult(List<EntityDetails> list) {
        this.entities = list;
    }

    public static IdentifyEntitiesResult fromEntityDetails(List<EntityDetails> list) {
        Objects.requireNonNull(list);
        return new IdentifyEntitiesResult(list);
    }

    public List<EntityDetails> getEntities() {
        return Immutable.of(this.entities);
    }
}
