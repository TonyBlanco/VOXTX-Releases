package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import w4.AbstractC2927o;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1421u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f26892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26893b;

    public C1421u(Context context) {
        r.m(context);
        Resources resources = context.getResources();
        this.f26892a = resources;
        this.f26893b = resources.getResourcePackageName(AbstractC2927o.f51674a);
    }

    public String a(String str) {
        int identifier = this.f26892a.getIdentifier(str, "string", this.f26893b);
        if (identifier == 0) {
            return null;
        }
        return this.f26892a.getString(identifier);
    }
}
