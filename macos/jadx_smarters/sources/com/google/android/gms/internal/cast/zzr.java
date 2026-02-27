package com.google.android.gms.internal.cast;

import C4.e;
import C4.h;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;
import org.achartengine.chart.TimeChart;
import org.apache.http.util.LangUtils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import t4.C2775b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class zzr {
    private static final C2775b zza = new C2775b("FeatureUsageAnalytics");
    private static final String zzb = "21.3.0";
    private static zzr zzc;
    private final zzf zzd;
    private final SharedPreferences zze;
    private final String zzf;
    private long zzl;
    private final e zzk = h.c();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Handler zzh = new zzdy(Looper.getMainLooper());
    private final Runnable zzg = new Runnable() { // from class: com.google.android.gms.internal.cast.zzq
        @Override // java.lang.Runnable
        public final void run() {
            zzr.zzc(this.zza);
        }
    };

    private zzr(SharedPreferences sharedPreferences, zzf zzfVar, String str) {
        this.zze = sharedPreferences;
        this.zzd = zzfVar;
        this.zzf = str;
    }

    public static synchronized zzr zza(SharedPreferences sharedPreferences, zzf zzfVar, String str) {
        try {
            if (zzc == null) {
                zzc = new zzr(sharedPreferences, zzfVar, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzc;
    }

    @VisibleForTesting
    public static String zzb(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static /* synthetic */ void zzc(zzr zzrVar) {
        if (zzrVar.zzi.isEmpty()) {
            return;
        }
        long j9 = true != zzrVar.zzj.equals(zzrVar.zzi) ? TimeChart.DAY : 172800000L;
        long jZzf = zzrVar.zzf();
        long j10 = zzrVar.zzl;
        if (j10 == 0 || jZzf - j10 >= j9) {
            zza.a("Upload the feature usage report.", new Object[0]);
            zzmf zzmfVarZza = zzmg.zza();
            zzmfVarZza.zzb(zzb);
            zzmfVarZza.zza(zzrVar.zzf);
            zzmg zzmgVar = (zzmg) zzmfVarZza.zzp();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(zzrVar.zzi);
            zzlz zzlzVarZza = zzma.zza();
            zzlzVarZza.zza(arrayList);
            zzlzVarZza.zzb(zzmgVar);
            zzma zzmaVar = (zzma) zzlzVarZza.zzp();
            zzmp zzmpVarZzc = zzmq.zzc();
            zzmpVarZzc.zzc(zzmaVar);
            zzrVar.zzd.zzd((zzmq) zzmpVarZzc.zzp(), 243);
            SharedPreferences.Editor editorEdit = zzrVar.zze.edit();
            if (!zzrVar.zzj.equals(zzrVar.zzi)) {
                zzrVar.zzj.clear();
                zzrVar.zzj.addAll(zzrVar.zzi);
                Iterator it = zzrVar.zzj.iterator();
                while (it.hasNext()) {
                    String string = Integer.toString(((zzln) it.next()).zza());
                    String strZzh = zzrVar.zzh(string);
                    String strZzb = zzb("feature_usage_timestamp_reported_feature_", string);
                    if (!TextUtils.equals(strZzh, strZzb)) {
                        long j11 = zzrVar.zze.getLong(strZzh, 0L);
                        editorEdit.remove(strZzh);
                        if (j11 != 0) {
                            editorEdit.putLong(strZzb, j11);
                        }
                    }
                }
            }
            zzrVar.zzl = jZzf;
            editorEdit.putLong("feature_usage_last_report_time", jZzf).apply();
        }
    }

    public static void zzd(zzln zzlnVar) {
        zzr zzrVar = zzc;
        if (zzrVar == null) {
            return;
        }
        zzrVar.zze.edit().putLong(zzrVar.zzh(Integer.toString(zzlnVar.zza())), zzrVar.zzf()).apply();
        zzrVar.zzi.add(zzlnVar);
        zzrVar.zzj();
    }

    private final long zzf() {
        return ((e) r.m(this.zzk)).a();
    }

    private static zzln zzg(String str) {
        zzln zzlnVar;
        try {
            int i9 = Integer.parseInt(str);
            zzln zzlnVar2 = zzln.DEVELOPER_FEATURE_FLAG_UNKNOWN;
            switch (i9) {
                case 0:
                    zzlnVar = zzln.DEVELOPER_FEATURE_FLAG_UNKNOWN;
                    break;
                case 1:
                    zzlnVar = zzln.CAF_CAST_BUTTON;
                    break;
                case 2:
                    zzlnVar = zzln.CAF_EXPANDED_CONTROLLER;
                    break;
                case 3:
                    zzlnVar = zzln.CAF_MINI_CONTROLLER;
                    break;
                case 4:
                    zzlnVar = zzln.CAF_CONTAINER_CONTROLLER;
                    break;
                case 5:
                    zzlnVar = zzln.CAST_CONTEXT;
                    break;
                case 6:
                    zzlnVar = zzln.IMAGE_CACHE;
                    break;
                case 7:
                    zzlnVar = zzln.IMAGE_PICKER;
                    break;
                case 8:
                    zzlnVar = zzln.AD_BREAK_PARSER;
                    break;
                case 9:
                    zzlnVar = zzln.UI_STYLE;
                    break;
                case 10:
                    zzlnVar = zzln.HARDWARE_VOLUME_BUTTON;
                    break;
                case 11:
                    zzlnVar = zzln.NON_CAST_DEVICE_PROVIDER;
                    break;
                case 12:
                    zzlnVar = zzln.PAUSE_CONTROLLER;
                    break;
                case 13:
                    zzlnVar = zzln.SEEK_CONTROLLER;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    zzlnVar = zzln.STREAM_VOLUME;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    zzlnVar = zzln.UI_MEDIA_CONTROLLER;
                    break;
                case 16:
                    zzlnVar = zzln.PLAYBACK_RATE_CONTROLLER;
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    zzlnVar = zzln.PRECACHE;
                    break;
                case 18:
                    zzlnVar = zzln.INSTRUCTIONS_VIEW;
                    break;
                case 19:
                    zzlnVar = zzln.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                    break;
                case 20:
                    zzlnVar = zzln.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                    break;
                case 21:
                    zzlnVar = zzln.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                    break;
                case 22:
                    zzlnVar = zzln.OPTION_DISABLE_ANALYTICS_LOGGING;
                    break;
                case 23:
                    zzlnVar = zzln.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    zzlnVar = zzln.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                    break;
                case 25:
                    zzlnVar = zzln.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                    break;
                case 26:
                    zzlnVar = zzln.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                    break;
                case 27:
                    zzlnVar = zzln.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                    break;
                case 28:
                    zzlnVar = zzln.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                    break;
                case 29:
                    zzlnVar = zzln.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                    break;
                case 30:
                    zzlnVar = zzln.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                    break;
                case 31:
                    zzlnVar = zzln.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                    break;
                case 32:
                    zzlnVar = zzln.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                    break;
                case 33:
                    zzlnVar = zzln.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                    break;
                case 34:
                    zzlnVar = zzln.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                    break;
                case 35:
                    zzlnVar = zzln.CAST_OUTPUT_SWITCHER_ENABLED;
                    break;
                case 36:
                    zzlnVar = zzln.CAST_TRANSFER_TO_LOCAL_ENABLED;
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    zzlnVar = zzln.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                    break;
                case 38:
                    zzlnVar = zzln.CAST_BUTTON_DELEGATE;
                    break;
                case 39:
                    zzlnVar = zzln.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                    break;
                case 40:
                    zzlnVar = zzln.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                    break;
                case 41:
                    zzlnVar = zzln.CAST_TRANSFER_TO_LOCAL_USED;
                    break;
                case 42:
                    zzlnVar = zzln.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                    break;
                case 43:
                    zzlnVar = zzln.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    zzlnVar = zzln.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                    break;
                case 45:
                    zzlnVar = zzln.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                    break;
                case 46:
                    zzlnVar = zzln.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                    break;
                case 47:
                    zzlnVar = zzln.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                    break;
                case 48:
                    zzlnVar = zzln.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                    break;
                case 49:
                    zzlnVar = zzln.CAF_NOTIFICATION_SERVICE;
                    break;
                case 50:
                    zzlnVar = zzln.HARDWARE_VOLUME_BUTTON_PRESS;
                    break;
                case 51:
                    zzlnVar = zzln.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                    break;
                case 52:
                    zzlnVar = zzln.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                    break;
                case 53:
                    zzlnVar = zzln.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                    break;
                case 54:
                    zzlnVar = zzln.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                    break;
                case 55:
                    zzlnVar = zzln.CAF_MEDIA_NOTIFICATION_PROXY;
                    break;
                default:
                    zzlnVar = null;
                    break;
            }
            return zzlnVar;
        } catch (NumberFormatException unused) {
            return zzln.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    @RequiresNonNull({"sharedPreferences"})
    private final String zzh(String str) {
        String strZzb = zzb("feature_usage_timestamp_reported_feature_", str);
        return this.zze.contains(strZzb) ? strZzb : zzb("feature_usage_timestamp_detected_feature_", str);
    }

    private final void zzi(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.zze.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    @RequiresNonNull({"handler", "reportFeatureUsageRunnable"})
    private final void zzj() {
        this.zzh.post(this.zzg);
    }

    public final void zze() {
        zzln zzlnVarZzg;
        String string = this.zze.getString("feature_usage_sdk_version", null);
        String string2 = this.zze.getString("feature_usage_package_name", null);
        this.zzi.clear();
        this.zzj.clear();
        this.zzl = 0L;
        if (!zzb.equals(string) || !this.zzf.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String str : this.zze.getAll().keySet()) {
                if (str.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(str);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            zzi(hashSet);
            this.zze.edit().putString("feature_usage_sdk_version", zzb).putString("feature_usage_package_name", this.zzf).apply();
            return;
        }
        this.zzl = this.zze.getLong("feature_usage_last_report_time", 0L);
        long jZzf = zzf();
        HashSet hashSet2 = new HashSet();
        for (String str2 : this.zze.getAll().keySet()) {
            if (str2.startsWith("feature_usage_timestamp_")) {
                long j9 = this.zze.getLong(str2, 0L);
                if (j9 == 0 || jZzf - j9 <= 1209600000) {
                    if (str2.startsWith("feature_usage_timestamp_reported_feature_")) {
                        zzlnVarZzg = zzg(str2.substring(41));
                        this.zzj.add(zzlnVarZzg);
                    } else if (str2.startsWith("feature_usage_timestamp_detected_feature_")) {
                        zzlnVarZzg = zzg(str2.substring(41));
                    }
                    this.zzi.add(zzlnVarZzg);
                } else {
                    hashSet2.add(str2);
                }
            }
        }
        zzi(hashSet2);
        r.m(this.zzh);
        r.m(this.zzg);
        zzj();
    }
}
