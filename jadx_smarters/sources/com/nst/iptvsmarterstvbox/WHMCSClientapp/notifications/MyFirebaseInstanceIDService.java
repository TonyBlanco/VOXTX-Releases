package com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.firebase.messaging.FirebaseMessagingService;
import p0.C2386a;

/* JADX INFO: loaded from: classes.dex */
public class MyFirebaseInstanceIDService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f28601h = "MyFirebaseInstanceIDService";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(String str) {
        super.q(str);
        u(str);
        t(str);
        Intent intent = new Intent("registrationComplete");
        intent.putExtra(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT, str);
        C2386a.b(this).d(intent);
    }

    public final void t(String str) {
        Log.e(f28601h, "sendRegistrationToServer: " + str);
    }

    public final void u(String str) {
        SharedPreferences.Editor editorEdit = getApplicationContext().getSharedPreferences("ah_firebase", 0).edit();
        editorEdit.putString("regId", str);
        editorEdit.commit();
    }
}
