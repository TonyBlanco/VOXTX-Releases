package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return l.a(context).a();
    }
}
