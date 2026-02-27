package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.F1;
import com.onesignal.T;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    public class a implements T.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f38115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f38116b;

        public a(Bundle bundle, Context context) {
            this.f38115a = bundle;
            this.f38116b = context;
        }

        @Override // com.onesignal.T.e
        public void a(T.f fVar) {
            if (fVar.c()) {
                return;
            }
            JSONObject jSONObjectA = T.a(this.f38115a);
            Q0 q02 = new Q0(jSONObjectA);
            V0 v02 = new V0(this.f38116b);
            v02.q(jSONObjectA);
            v02.o(this.f38116b);
            v02.r(q02);
            T.m(v02, true);
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        T.h(applicationContext, extras, new a(extras, applicationContext));
    }

    public void onRegistered(String str) {
        F1.a(F1.v.INFO, "ADM registration ID: " + str);
        Z1.c(str);
    }

    public void onRegistrationError(String str) {
        F1.v vVar = F1.v.ERROR;
        F1.a(vVar, "ADM:onRegistrationError: " + str);
        if ("INVALID_SENDER".equals(str)) {
            F1.a(vVar, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        Z1.c(null);
    }

    public void onUnregistered(String str) {
        F1.a(F1.v.INFO, "ADM:onUnregistered: " + str);
    }
}
