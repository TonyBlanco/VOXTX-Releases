package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class all {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aze f20135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f20136b;

    public all(ExecutorService executorService, float f9) {
        this.f20136b = f9;
        this.f20135a = azh.a(executorService);
    }

    public final /* synthetic */ Bitmap a(String str, com.google.ads.interactivemedia.v3.impl.data.bh bhVar) throws Exception {
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        if (bitmapDecodeStream == null) {
            return null;
        }
        return (bhVar.width == bitmapDecodeStream.getWidth() && bhVar.height == bitmapDecodeStream.getHeight() && !axu.a((double) this.f20136b)) ? Bitmap.createScaledBitmap(bitmapDecodeStream, (int) (this.f20136b * bitmapDecodeStream.getWidth()), (int) (this.f20136b * bitmapDecodeStream.getHeight()), true) : bitmapDecodeStream;
    }

    public final Task b(final String str, final com.google.ads.interactivemedia.v3.impl.data.bh bhVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        azh.d(this.f20135a.submit(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.alj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20130a.a(str, bhVar);
            }
        }), new alk(taskCompletionSource, str), this.f20135a);
        return taskCompletionSource.getTask();
    }
}
