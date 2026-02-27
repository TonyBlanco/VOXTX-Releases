package com.amplifyframework.core.model;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface ModelProvider {
    Set<String> customTypeNames();

    Map<String, CustomTypeSchema> customTypeSchemas();

    Set<String> modelNames();

    Map<String, ModelSchema> modelSchemas();

    Set<Class<? extends Model>> models();

    String version();
}
