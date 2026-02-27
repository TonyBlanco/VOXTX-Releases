package com.amazonaws.mobileconnectors.appsync;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PersistentMutationsResponse {
    private JSONObject data;
    private JSONArray errors;
    private String mutationClassName;
    private String recordIdentifier;

    public PersistentMutationsResponse(JSONObject jSONObject, JSONArray jSONArray, String str, String str2) {
        this.data = jSONObject;
        this.errors = jSONArray;
        this.mutationClassName = str;
        this.recordIdentifier = str2;
    }

    public JSONObject getDataJSONObject() {
        return this.data;
    }

    public JSONArray getErrorsJSONObject() {
        return this.errors;
    }

    public String getMutationClassName() {
        return this.mutationClassName;
    }

    public String getRecordIdentifier() {
        return this.recordIdentifier;
    }
}
