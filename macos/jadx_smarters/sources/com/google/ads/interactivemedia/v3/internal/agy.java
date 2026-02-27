package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class agy extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f19744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f19745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ahe f19746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final afe f19747e;

    public agy(Handler handler, Context context, afe afeVar, ahe aheVar, byte[] bArr, byte[] bArr2) {
        super(handler);
        this.f19743a = context;
        this.f19744b = (AudioManager) context.getSystemService("audio");
        this.f19747e = afeVar;
        this.f19746d = aheVar;
    }

    private final float c() {
        int streamVolume = this.f19744b.getStreamVolume(3);
        int streamMaxVolume = this.f19744b.getStreamMaxVolume(3);
        float f9 = 0.0f;
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f10 = streamVolume / streamMaxVolume;
            f9 = 1.0f;
            if (f10 <= 1.0f) {
                return f10;
            }
        }
        return f9;
    }

    private final void d() {
        this.f19746d.d(this.f19745c);
    }

    public final void a() {
        this.f19745c = c();
        d();
        this.f19743a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f19743a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        super.onChange(z9);
        float fC = c();
        if (fC != this.f19745c) {
            this.f19745c = fC;
            d();
        }
    }
}
