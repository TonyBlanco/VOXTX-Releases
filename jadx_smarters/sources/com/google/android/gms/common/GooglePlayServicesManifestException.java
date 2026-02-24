package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26413a;

    public GooglePlayServicesManifestException(int i9, String str) {
        super(str);
        this.f26413a = i9;
    }
}
