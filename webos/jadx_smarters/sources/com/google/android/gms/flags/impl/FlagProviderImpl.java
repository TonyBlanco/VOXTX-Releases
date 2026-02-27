package com.google.android.gms.flags.impl;

import H4.b;
import I4.a;
import I4.c;
import I4.d;
import I4.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.flags.zzd;

/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class FlagProviderImpl extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26924a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f26925c;

    @Override // H4.c
    public boolean getBooleanFlagValue(String str, boolean z9, int i9) {
        if (!this.f26924a) {
            return z9;
        }
        SharedPreferences sharedPreferences = this.f26925c;
        Boolean boolValueOf = Boolean.valueOf(z9);
        try {
            boolValueOf = (Boolean) zzd.zza(new a(sharedPreferences, str, boolValueOf));
        } catch (Exception e9) {
            String strValueOf = String.valueOf(e9.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return boolValueOf.booleanValue();
    }

    @Override // H4.c
    public int getIntFlagValue(String str, int i9, int i10) {
        if (!this.f26924a) {
            return i9;
        }
        SharedPreferences sharedPreferences = this.f26925c;
        Integer numValueOf = Integer.valueOf(i9);
        try {
            numValueOf = (Integer) zzd.zza(new I4.b(sharedPreferences, str, numValueOf));
        } catch (Exception e9) {
            String strValueOf = String.valueOf(e9.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return numValueOf.intValue();
    }

    @Override // H4.c
    public long getLongFlagValue(String str, long j9, int i9) {
        if (!this.f26924a) {
            return j9;
        }
        SharedPreferences sharedPreferences = this.f26925c;
        Long lValueOf = Long.valueOf(j9);
        try {
            lValueOf = (Long) zzd.zza(new c(sharedPreferences, str, lValueOf));
        } catch (Exception e9) {
            String strValueOf = String.valueOf(e9.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return lValueOf.longValue();
    }

    @Override // H4.c
    public String getStringFlagValue(String str, String str2, int i9) {
        if (!this.f26924a) {
            return str2;
        }
        try {
            return (String) zzd.zza(new d(this.f26925c, str, str2));
        } catch (Exception e9) {
            String strValueOf = String.valueOf(e9.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // H4.c
    public void init(F4.a aVar) {
        Context context = (Context) F4.b.E(aVar);
        if (this.f26924a) {
            return;
        }
        try {
            this.f26925c = f.a(context.createPackageContext("com.google.android.gms", 0));
            this.f26924a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e9) {
            String strValueOf = String.valueOf(e9.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
