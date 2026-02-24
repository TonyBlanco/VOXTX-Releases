package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38331b;

    public G0(JSONObject jsonObject) {
        kotlin.jvm.internal.l.e(jsonObject, "jsonObject");
        this.f38330a = jsonObject.optString("pageId", null);
        this.f38331b = jsonObject.optString("pageIndex", null);
    }

    public final String a() {
        return this.f38330a;
    }
}
