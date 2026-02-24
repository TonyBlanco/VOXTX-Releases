package com.onesignal;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f38628b;

    public Y0(Context context, JSONObject fcmPayload) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(fcmPayload, "fcmPayload");
        this.f38627a = context;
        this.f38628b = fcmPayload;
    }

    public final boolean a() {
        return X0.f38625a.a(this.f38627a) && b() == null;
    }

    public final Uri b() {
        X0 x02 = X0.f38625a;
        if (!x02.a(this.f38627a) || x02.b(this.f38627a)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.f38628b.optString("custom"));
        if (jSONObject.has("u")) {
            String url = jSONObject.optString("u");
            if (!kotlin.jvm.internal.l.a(url, "")) {
                kotlin.jvm.internal.l.d(url, "url");
                int length = url.length() - 1;
                int i9 = 0;
                boolean z9 = false;
                while (i9 <= length) {
                    boolean z10 = kotlin.jvm.internal.l.f(url.charAt(!z9 ? i9 : length), 32) <= 0;
                    if (z9) {
                        if (!z10) {
                            break;
                        }
                        length--;
                    } else if (z10) {
                        i9++;
                    } else {
                        z9 = true;
                    }
                }
                return Uri.parse(url.subSequence(i9, length + 1).toString());
            }
        }
        return null;
    }
}
