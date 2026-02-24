package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.util.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;
import w4.AbstractC2925m;

/* JADX INFO: loaded from: classes3.dex */
public final class aqn implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f20522g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20517b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConditionVariable f20518c = new ConditionVariable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f20519d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    volatile boolean f20516a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SharedPreferences f20520e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f20521f = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f20523h = new JSONObject();

    private final void f() {
        if (this.f20520e == null) {
            return;
        }
        try {
            this.f20523h = new JSONObject((String) aqp.a(new atq() { // from class: com.google.ads.interactivemedia.v3.internal.aql
                @Override // com.google.ads.interactivemedia.v3.internal.atq
                public final Object a() {
                    return this.f20514a.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object b(final aqj aqjVar) {
        if (!this.f20518c.block(5000L)) {
            synchronized (this.f20517b) {
                try {
                    if (!this.f20516a) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f20519d || this.f20520e == null) {
            synchronized (this.f20517b) {
                if (this.f20519d && this.f20520e != null) {
                }
                return aqjVar.g();
            }
        }
        if (aqjVar.d() != 2) {
            return (aqjVar.d() == 1 && this.f20523h.has(aqjVar.h())) ? aqjVar.a(this.f20523h) : aqp.a(new atq() { // from class: com.google.ads.interactivemedia.v3.internal.aqk
                @Override // com.google.ads.interactivemedia.v3.internal.atq
                public final Object a() {
                    return this.f20512a.c(aqjVar);
                }
            });
        }
        Bundle bundle = this.f20521f;
        return bundle == null ? aqjVar.g() : aqjVar.b(bundle);
    }

    public final /* synthetic */ Object c(aqj aqjVar) {
        return aqjVar.c(this.f20520e);
    }

    public final /* synthetic */ String d() {
        return this.f20520e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.f20519d) {
            return;
        }
        synchronized (this.f20517b) {
            try {
                if (this.f20519d) {
                    return;
                }
                if (!this.f20516a) {
                    this.f20516a = true;
                }
                Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                this.f20522g = applicationContext;
                try {
                    this.f20521f = E4.e.a(applicationContext).c(this.f20522g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context contextE = AbstractC2925m.e(context);
                    if (contextE != null || (contextE = context.getApplicationContext()) != null) {
                        context = contextE;
                    }
                    if (context == null) {
                        return;
                    }
                    aqd.b();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                    this.f20520e = sharedPreferences;
                    if (sharedPreferences != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    aqv.c(new aqm(this));
                    f();
                    this.f20519d = true;
                } finally {
                    this.f20516a = false;
                    this.f20518c.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
