package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahu extends ahv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HashSet f19805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f19806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f19807c;

    public ahu(aly alyVar, HashSet hashSet, JSONObject jSONObject, long j9, byte[] bArr) {
        super(alyVar, null);
        this.f19805a = new HashSet(hashSet);
        this.f19806b = jSONObject;
        this.f19807c = j9;
    }
}
