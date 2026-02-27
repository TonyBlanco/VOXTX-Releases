package com.amazonaws.mobileconnectors.appsync;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface ConflictResolverInterface {
    void resolveConflict(ConflictResolutionHandler conflictResolutionHandler, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2);
}
