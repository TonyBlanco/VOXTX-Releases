package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.util.VisibleForTesting;
import d.AbstractC1617D;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n4.AbstractC2270f;
import t4.C2775b;
import u0.C2811K;
import u0.C2812L;

/* JADX INFO: loaded from: classes3.dex */
public final class zzay extends C2812L.a {
    private static final C2775b zzb = new C2775b("MRDiscoveryCallback");
    private final zzax zzf;
    private final Map zzd = DesugarCollections.synchronizedMap(new HashMap());
    private final LinkedHashSet zze = new LinkedHashSet();
    private final Set zzc = Collections.synchronizedSet(new LinkedHashSet());
    public final zzaw zza = new zzaw(this);

    public zzay(Context context) {
        this.zzf = new zzax(context);
    }

    @Override // u0.C2812L.a
    public final void onRouteAdded(C2812L c2812l, C2812L.h hVar) {
        zzb.a("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        zzf(hVar, true);
    }

    @Override // u0.C2812L.a
    public final void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
        zzb.a("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        zzf(hVar, true);
    }

    @Override // u0.C2812L.a
    public final void onRouteRemoved(C2812L c2812l, C2812L.h hVar) {
        zzb.a("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        zzf(hVar, false);
    }

    public final void zza(List list) {
        zzb.a("SetRouteDiscovery for " + list.size() + " IDs", new Object[0]);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(zzen.zza((String) it.next()));
        }
        zzb.a("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        HashMap map = new HashMap();
        synchronized (this.zzd) {
            try {
                for (String str : linkedHashSet) {
                    zzav zzavVar = (zzav) this.zzd.get(zzen.zza(str));
                    if (zzavVar != null) {
                        map.put(str, zzavVar);
                    }
                }
                this.zzd.clear();
                this.zzd.putAll(map);
            } catch (Throwable th) {
                throw th;
            }
        }
        zzb.a("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        synchronized (this.zze) {
            this.zze.clear();
            this.zze.addAll(linkedHashSet);
        }
        zzb();
    }

    public final void zzb() {
        C2775b c2775b = zzb;
        c2775b.a("Starting RouteDiscovery with " + this.zze.size() + " IDs", new Object[0]);
        c2775b.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzc();
        } else {
            new zzdy(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzau
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final void zzc() {
        this.zzf.zzb(this);
        synchronized (this.zze) {
            try {
                for (String str : this.zze) {
                    C2811K c2811kD = new C2811K.a().b(AbstractC2270f.a(str)).d();
                    if (((zzav) this.zzd.get(str)) == null) {
                        this.zzd.put(str, new zzav(c2811kD));
                    }
                    zzb.a("Adding mediaRouter callback for control category " + AbstractC2270f.a(str), new Object[0]);
                    this.zzf.zza().b(c2811kD, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzb.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
    }

    public final void zzd() {
        zzb.a("Stopping RouteDiscovery.", new Object[0]);
        this.zzd.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zzf.zzb(this);
        } else {
            new zzdy(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzat
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze();
                }
            });
        }
    }

    public final void zze() {
        this.zzf.zzb(this);
    }

    @VisibleForTesting
    public final void zzf(C2812L.h hVar, boolean z9) {
        boolean z10;
        boolean zRemove;
        C2775b c2775b = zzb;
        c2775b.a("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z9), hVar);
        synchronized (this.zzd) {
            try {
                c2775b.a("appIdToRouteInfo has these appId route keys: " + String.valueOf(this.zzd.keySet()), new Object[0]);
                z10 = false;
                for (Map.Entry entry : this.zzd.entrySet()) {
                    String str = (String) entry.getKey();
                    zzav zzavVar = (zzav) entry.getValue();
                    if (hVar.E(zzavVar.zzb)) {
                        if (z9) {
                            C2775b c2775b2 = zzb;
                            c2775b2.a("Adding/updating route for appId " + str, new Object[0]);
                            zRemove = zzavVar.zza.add(hVar);
                            if (!zRemove) {
                                c2775b2.f("Route " + String.valueOf(hVar) + " already exists for appId " + str, new Object[0]);
                            }
                        } else {
                            C2775b c2775b3 = zzb;
                            c2775b3.a("Removing route for appId " + str, new Object[0]);
                            zRemove = zzavVar.zza.remove(hVar);
                            if (!zRemove) {
                                c2775b3.f("Route " + String.valueOf(hVar) + " already removed from appId " + str, new Object[0]);
                            }
                        }
                        z10 = zRemove;
                    }
                }
            } finally {
            }
        }
        if (z10) {
            zzb.a("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.zzc) {
                try {
                    HashMap map = new HashMap();
                    synchronized (this.zzd) {
                        for (String str2 : this.zzd.keySet()) {
                            zzav zzavVar2 = (zzav) this.zzd.get(zzen.zza(str2));
                            zzfl zzflVarZzk = zzavVar2 == null ? zzfl.zzk() : zzfl.zzj(zzavVar2.zza);
                            if (!zzflVarZzk.isEmpty()) {
                                map.put(str2, zzflVarZzk);
                            }
                        }
                    }
                    zzfk.zzc(map.entrySet());
                    Iterator it = this.zzc.iterator();
                    if (it.hasNext()) {
                        AbstractC1617D.a(it.next());
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
    }
}
