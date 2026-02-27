package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: com.onesignal.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1582r1 extends C1580q1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f38822f = new HashSet(Arrays.asList("getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1553h1 f38823e;

    public C1582r1(C1553h1 c1553h1, P0 p02) {
        super(p02);
        this.f38823e = c1553h1;
    }

    public boolean g(String str) {
        return !this.f38823e.k() && f38822f.contains(str);
    }
}
