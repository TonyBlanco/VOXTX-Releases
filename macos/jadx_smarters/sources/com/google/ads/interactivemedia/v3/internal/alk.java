package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class alk implements ayr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f20133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f20134b;

    public alk(TaskCompletionSource taskCompletionSource, String str) {
        this.f20133a = taskCompletionSource;
        this.f20134b = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayr
    public final void a(Throwable th) {
        this.f20133a.setException(new Exception("Failed to load image from: ".concat(String.valueOf(this.f20134b)), th));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f20133a.trySetResult((Bitmap) obj);
    }
}
