package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.F1;
import com.onesignal.T;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    public static final class a implements T.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f38118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f38119b;

        public a(Bundle bundle, Context context) {
            this.f38118a = bundle;
            this.f38119b = context;
        }

        @Override // com.onesignal.T.e
        public void a(T.f fVar) {
            if (fVar != null && fVar.c()) {
                return;
            }
            JSONObject jSONObjectA = T.a(this.f38118a);
            kotlin.jvm.internal.l.d(jSONObjectA, "bundleAsJSONObject(bundle)");
            Q0 q02 = new Q0(jSONObjectA);
            V0 v02 = new V0(this.f38119b);
            Context context = this.f38119b;
            v02.q(jSONObjectA);
            v02.o(context);
            v02.r(q02);
            T.m(v02, true);
        }
    }

    public void onMessage(@Nullable Context context, @Nullable Intent intent) {
        Bundle extras = intent == null ? null : intent.getExtras();
        T.h(context, extras, new a(extras, context));
    }

    public void onRegistered(@Nullable Context context, @Nullable String str) {
        F1.a(F1.v.INFO, kotlin.jvm.internal.l.l("ADM registration ID: ", str));
        Z1.c(str);
    }

    public void onRegistrationError(@Nullable Context context, @Nullable String str) {
        F1.v vVar = F1.v.ERROR;
        F1.a(vVar, kotlin.jvm.internal.l.l("ADM:onRegistrationError: ", str));
        if (kotlin.jvm.internal.l.a("INVALID_SENDER", str)) {
            F1.a(vVar, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        Z1.c(null);
    }

    public void onUnregistered(@Nullable Context context, @Nullable String str) {
        F1.a(F1.v.INFO, kotlin.jvm.internal.l.l("ADM:onUnregistered: ", str));
    }
}
