package com.google.android.recaptcha.internal;

import E8.o;
import android.content.Context;
import android.net.TrafficStats;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import k8.q;
import kotlin.jvm.internal.l;
import l8.s;
import o8.InterfaceC2372d;
import org.apache.http.client.methods.HttpGet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q8.AbstractC2643b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbj {

    @NotNull
    public static final zzbj zza = new zzbj();

    @Nullable
    private static Set zzb;

    @Nullable
    private static Set zzc;

    @Nullable
    private static Long zzd;
    private static int zze;

    private zzbj() {
    }

    public static final void zza(@NotNull zzlr zzlrVar) {
        zzb = s.O(zzlrVar.zzf().zzi());
        zzc = s.O(zzlrVar.zzg().zzi());
    }

    @Nullable
    public static final Object zzb(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Context context, @NotNull zzr zzrVar, @NotNull InterfaceC2372d interfaceC2372d) {
        zzh zzhVar;
        String str6;
        zzkw zzkwVar;
        HttpsURLConnection httpsURLConnection;
        if (zzb != null && zzc != null) {
            return q.f43674a;
        }
        try {
            zzai zzaiVar = zzai.zza;
            zzkwVar = zzkw.FETCH_ALLOWLIST;
            zzai.zzb(new zzaf(zzkwVar, str4, str5, str5, null), str2, new zzs());
            zzhVar = null;
            zzd = null;
            zze = 0;
            URL url = new URL(str + "?k=" + URLEncoder.encode(str2, "UTF-8") + "&msv=" + URLEncoder.encode("18.1.2", "UTF-8") + "&mst=" + URLEncoder.encode(str3, "UTF-8") + "&mov=" + URLEncoder.encode(zzu.zzb(), "UTF-8"));
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            httpsURLConnection.setRequestMethod(HttpGet.METHOD_NAME);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
            httpsURLConnection.connect();
        } catch (Exception e9) {
            e = e9;
        }
        try {
            if (httpsURLConnection.getResponseCode() == 200) {
                zza(zzlr.zzj(httpsURLConnection.getInputStream()));
                zzai.zza(new zzaf(zzkwVar, str4, str5, str5, null), zzd, zze);
                zzai.zzc(new zzaf(zzkwVar, str4, str5, str5, null), context, zzrVar);
                str6 = null;
            } else {
                zzh zzhVar2 = new zzh(zzf.zzk, new zzd(httpsURLConnection.getResponseCode()));
                AbstractC2643b.b(httpsURLConnection.getResponseCode());
                str6 = null;
                zzhVar = zzhVar2;
            }
        } catch (Exception e10) {
            e = e10;
            zzhVar = e instanceof MalformedURLException ? new zzh(zzf.zze, zzd.zzc) : e instanceof zzgy ? new zzh(zzf.zze, zzd.zzS) : e instanceof IOException ? new zzh(zzf.zze, zzd.zzR) : new zzh(zzf.zzb, zzd.zzb);
            String message = e.getMessage();
            e.toString();
            str6 = message;
        }
        if (zzhVar != null) {
            zzai zzaiVar2 = zzai.zza;
            zzai.zzd(new zzaf(zzkw.FETCH_ALLOWLIST, str4, str5, str5, null), String.valueOf(zzhVar.zzb().zza()), zzhVar.zza().zza(), context, zzrVar, str6);
        }
        return q.f43674a;
    }

    public static final boolean zzc(@NotNull String str) {
        Set set = zzb;
        if (set == null || zzc == null) {
            if (zzd == null) {
                zzd = Long.valueOf(System.currentTimeMillis());
            }
            zze++;
            return true;
        }
        l.c(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = zzc;
        l.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzd(str, set2)) {
            return false;
        }
        return zzd(str, set);
    }

    private static final boolean zzd(String str, Set set) {
        Iterator it = o.r0(str, new char[]{'.'}, false, 0, 6, null).iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(InstructionFileId.DOT);
        }
        return false;
    }
}
