package com.amplifyframework.predictions.models;

/* JADX INFO: loaded from: classes.dex */
public enum LabelType implements IdentifyAction {
    LABELS,
    MODERATION_LABELS,
    ALL;

    @Override // com.amplifyframework.predictions.models.IdentifyAction
    public final IdentifyActionType getType() {
        return IdentifyActionType.DETECT_LABELS;
    }
}
