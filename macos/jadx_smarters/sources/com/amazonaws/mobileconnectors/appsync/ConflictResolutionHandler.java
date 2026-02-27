package com.amazonaws.mobileconnectors.appsync;

import android.util.Log;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v1.C2863a;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.i;
import x1.d;

/* JADX INFO: loaded from: classes.dex */
public class ConflictResolutionHandler {
    private static final String TAG = "ConflictResolutionHandler";
    final AppSyncOfflineMutationInterceptor mutationInterceptor;

    public ConflictResolutionHandler(AppSyncOfflineMutationInterceptor appSyncOfflineMutationInterceptor) {
        this.mutationInterceptor = appSyncOfflineMutationInterceptor;
    }

    public static boolean conflictPresent(String str) {
        String strOptString;
        if (str == null) {
            return false;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("errors");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() < 1 || (strOptString = jSONArrayOptJSONArray.getJSONObject(0).optString("errorType")) == null) {
                return false;
            }
            if (strOptString.equals("DynamoDB:ConditionalCheckFailedException")) {
                return true;
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public static boolean conflictPresent(d dVar) {
        Map mapA;
        if (dVar != null && dVar.e() != null && ((i) dVar.e()).e()) {
            Log.d(TAG, "Thread:[" + Thread.currentThread().getId() + "]: onResponse -- found error");
            if (((i) dVar.e()).d().get(0).toString().contains("The conditional request failed") && (mapA = ((C2863a) ((i) dVar.e()).d().get(0)).a()) != null && mapA.get("data") != null) {
                return true;
            }
        }
        return false;
    }

    public void fail(String str) {
        this.mutationInterceptor.failConflictMutation(str);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> void retryMutation(InterfaceC2867e interfaceC2867e, String str) {
        Log.d(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Calling retry conflict mutation.");
        this.mutationInterceptor.retryConflictMutation(interfaceC2867e, str);
    }
}
