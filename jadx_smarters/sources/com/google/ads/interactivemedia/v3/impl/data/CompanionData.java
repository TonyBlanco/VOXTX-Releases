package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = r.class)
public abstract class CompanionData {
    private String companionId;

    private static CompanionData create(String str, String str2, String str3, az azVar) {
        return new r(str, str2, str3, azVar);
    }

    public static CompanionData create(String str, String str2, String str3, String str4, az azVar) {
        CompanionData companionDataCreate = create(str2, str3, str4, azVar);
        companionDataCreate.companionId = str;
        return companionDataCreate;
    }

    public abstract String clickThroughUrl();

    public String companionId() {
        return this.companionId;
    }

    public abstract String size();

    public abstract String src();

    public final String toString() {
        return "CompanionData [companionId=" + companionId() + ", size=" + size() + ", src=" + src() + ", clickThroughUrl=" + clickThroughUrl() + ", type=" + String.valueOf(type()) + "]";
    }

    public abstract az type();
}
