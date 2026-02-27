package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1604z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1604z f38964a = new C1604z();

    public final C1601y a(Context context, JSONObject fcmPayload) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(fcmPayload, "fcmPayload");
        Y0 y02 = new Y0(context, fcmPayload);
        return new C1601y(context, b(y02.b()), c(y02.a(), fcmPayload));
    }

    public final Intent b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return OSUtils.O(uri);
    }

    public final boolean c(boolean z9, JSONObject jSONObject) {
        return z9 | (H0.a(jSONObject) != null);
    }
}
