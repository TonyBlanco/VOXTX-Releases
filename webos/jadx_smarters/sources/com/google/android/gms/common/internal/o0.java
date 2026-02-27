package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Uri f26851f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f26854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26856e;

    public o0(String str, String str2, int i9, boolean z9) {
        r.g(str);
        this.f26852a = str;
        r.g(str2);
        this.f26853b = str2;
        this.f26854c = null;
        this.f26855d = 4225;
        this.f26856e = z9;
    }

    public final ComponentName a() {
        return this.f26854c;
    }

    public final Intent b(Context context) {
        Bundle bundleCall;
        if (this.f26852a == null) {
            return new Intent().setComponent(this.f26854c);
        }
        if (this.f26856e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f26852a);
            try {
                bundleCall = context.getContentResolver().call(f26851f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e9) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e9.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f26852a)));
            }
        }
        return intent == null ? new Intent(this.f26852a).setPackage(this.f26853b) : intent;
    }

    public final String c() {
        return this.f26853b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return AbstractC1418q.b(this.f26852a, o0Var.f26852a) && AbstractC1418q.b(this.f26853b, o0Var.f26853b) && AbstractC1418q.b(this.f26854c, o0Var.f26854c) && this.f26856e == o0Var.f26856e;
    }

    public final int hashCode() {
        return AbstractC1418q.c(this.f26852a, this.f26853b, this.f26854c, 4225, Boolean.valueOf(this.f26856e));
    }

    public final String toString() {
        String str = this.f26852a;
        if (str != null) {
            return str;
        }
        r.m(this.f26854c);
        return this.f26854c.flattenToString();
    }
}
