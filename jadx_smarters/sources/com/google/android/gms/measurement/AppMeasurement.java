package com.google.android.gms.measurement;

import K4.a;
import K4.b;
import K4.d;
import M4.C0776l2;
import M4.H2;
import M4.InterfaceC0830u3;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f26942b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f26943a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            r.m(bundle);
            this.mAppId = (String) H2.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) H2.a(bundle, "origin", String.class, null);
            this.mName = (String) H2.a(bundle, "name", String.class, null);
            this.mValue = H2.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) H2.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) H2.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) H2.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) H2.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) H2.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) H2.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) H2.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) H2.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) H2.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) H2.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) H2.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) H2.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C0776l2 c0776l2) {
        this.f26943a = new a(c0776l2);
    }

    public AppMeasurement(InterfaceC0830u3 interfaceC0830u3) {
        this.f26943a = new b(interfaceC0830u3);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f26942b == null) {
            synchronized (AppMeasurement.class) {
                if (f26942b == null) {
                    InterfaceC0830u3 interfaceC0830u3 = (InterfaceC0830u3) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC0830u3 != null) {
                        f26942b = new AppMeasurement(interfaceC0830u3);
                    } else {
                        f26942b = new AppMeasurement(C0776l2.H(context, new zzcl(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f26942b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f26943a.b(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f26943a.g(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f26943a.c(str);
    }

    @Keep
    public long generateEventId() {
        return this.f26943a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f26943a.zzh();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listD = this.f26943a.d(str, str2);
        ArrayList arrayList = new ArrayList(listD == null ? 0 : listD.size());
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f26943a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f26943a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.f26943a.zzk();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f26943a.zza(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z9) {
        return this.f26943a.e(str, str2, z9);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f26943a.a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        r.m(conditionalUserProperty);
        d dVar = this.f26943a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            H2.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.f(bundle);
    }
}
