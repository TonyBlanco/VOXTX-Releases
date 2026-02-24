package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import q6.AbstractC2597o;
import q6.AbstractServiceC2590h;
import q6.C2586d;
import q6.H;
import q6.J;
import q6.S;
import q6.W;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends AbstractServiceC2590h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Queue f27948g = new ArrayDeque(10);

    @Override // q6.AbstractServiceC2590h
    public Intent c(Intent intent) {
        return W.b().c();
    }

    @Override // q6.AbstractServiceC2590h
    public void d(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            q(intent.getStringExtra(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT));
        } else {
            String strValueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Unknown intent action: ".concat(strValueOf) : new String("Unknown intent action: "));
        }
    }

    public final boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f27948g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        String strValueOf = String.valueOf(str);
        Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Received duplicate message: ".concat(strValueOf) : new String("Received duplicate message: "));
        return true;
    }

    public final void k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (J.t(extras)) {
            J j9 = new J(extras);
            ExecutorService executorServiceC = AbstractC2597o.c();
            try {
                if (new C2586d(this, j9, executorServiceC).a()) {
                    return;
                }
                if (H.A(intent)) {
                    H.t(intent);
                }
            } finally {
                executorServiceC.shutdown();
            }
        }
        o(new S(extras));
    }

    public final String l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public final void m(Intent intent) {
        if (j(intent.getStringExtra("google.message_id"))) {
            return;
        }
        s(intent);
    }

    public void n() {
    }

    public void o(S s9) {
    }

    public void p(String str) {
    }

    public void q(String str) {
    }

    public void r(String str, Exception exc) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "gcm"
            if (r0 != 0) goto Lb
            r0 = r1
        Lb:
            int r2 = r0.hashCode()
            r3 = 1
            r4 = 3
            r5 = 2
            switch(r2) {
                case -2062414158: goto L32;
                case 102161: goto L2a;
                case 814694033: goto L20;
                case 814800675: goto L16;
                default: goto L15;
            }
        L15:
            goto L3c
        L16:
            java.lang.String r1 = "send_event"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 2
            goto L3d
        L20:
            java.lang.String r1 = "send_error"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 3
            goto L3d
        L2a:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 0
            goto L3d
        L32:
            java.lang.String r1 = "deleted_messages"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 1
            goto L3d
        L3c:
            r1 = -1
        L3d:
            if (r1 == 0) goto L7e
            if (r1 == r3) goto L7a
            if (r1 == r5) goto L70
            if (r1 == r4) goto L5d
            int r7 = r0.length()
            java.lang.String r1 = "Received message with unknown type: "
            if (r7 == 0) goto L52
            java.lang.String r7 = r1.concat(r0)
            goto L57
        L52:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
        L57:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r7)
            return
        L5d:
            java.lang.String r0 = r6.l(r7)
            q6.V r1 = new q6.V
            java.lang.String r2 = "error"
            java.lang.String r7 = r7.getStringExtra(r2)
            r1.<init>(r7)
            r6.r(r0, r1)
            return
        L70:
            java.lang.String r0 = "google.message_id"
            java.lang.String r7 = r7.getStringExtra(r0)
            r6.p(r7)
            return
        L7a:
            r6.n()
            return
        L7e:
            q6.H.v(r7)
            r6.k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.s(android.content.Intent):void");
    }
}
