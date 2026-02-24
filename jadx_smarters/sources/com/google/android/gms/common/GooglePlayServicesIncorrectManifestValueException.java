package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i9) {
        super(i9, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + C2921i.f51661a + " but found " + i9 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
