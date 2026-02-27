package com.google.android.gms.internal.p001firebaseauthapi;

import A5.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaed {
    private static final Map<String, zzaec> zza = new C2695a();
    private static final Map<String, List<WeakReference<zzaef>>> zzb = new C2695a();

    public static String zza(String str) {
        zzaec zzaecVar;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaecVar = map.get(str);
        }
        if (zzaecVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        return zza(zzaecVar.zzb(), zzaecVar.zza(), zzaecVar.zzb().contains(":")) + "emulator/auth/handler";
    }

    private static String zza(String str, int i9, boolean z9) {
        StringBuilder sb;
        String str2;
        if (z9) {
            sb = new StringBuilder("http://[");
            sb.append(str);
            str2 = "]:";
        } else {
            sb = new StringBuilder("http://");
            sb.append(str);
            str2 = ":";
        }
        sb.append(str2);
        sb.append(i9);
        sb.append("/");
        return sb.toString();
    }

    public static void zza(f fVar, String str, int i9) {
        String strB = fVar.p().b();
        Map<String, zzaec> map = zza;
        synchronized (map) {
            map.put(strB, new zzaec(str, i9));
        }
        Map<String, List<WeakReference<zzaef>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(strB)) {
                    Iterator<WeakReference<zzaef>> it = map2.get(strB).iterator();
                    boolean z9 = false;
                    while (it.hasNext()) {
                        zzaef zzaefVar = it.next().get();
                        if (zzaefVar != null) {
                            zzaefVar.zza();
                            z9 = true;
                        }
                    }
                    if (!z9) {
                        zza.remove(strB);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(String str, zzaef zzaefVar) {
        Map<String, List<WeakReference<zzaef>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzaefVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference<>(zzaefVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(f fVar) {
        return zza.containsKey(fVar.p().b());
    }

    public static String zzb(String str) {
        zzaec zzaecVar;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaecVar = map.get(str);
        }
        if (zzaecVar != null) {
            str2 = "" + zza(zzaecVar.zzb(), zzaecVar.zza(), zzaecVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzaec zzaecVar;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaecVar = map.get(str);
        }
        if (zzaecVar != null) {
            str2 = "" + zza(zzaecVar.zzb(), zzaecVar.zza(), zzaecVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzaec zzaecVar;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaecVar = map.get(str);
        }
        if (zzaecVar != null) {
            str2 = "" + zza(zzaecVar.zzb(), zzaecVar.zza(), zzaecVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }
}
