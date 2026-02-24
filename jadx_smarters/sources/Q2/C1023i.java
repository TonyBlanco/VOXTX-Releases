package Q2;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import d4.AbstractC1684a;

/* JADX INFO: renamed from: Q2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1023i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f7861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f7862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f7863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f7864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1022h f7865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7866h;

    /* JADX INFO: renamed from: Q2.i$b */
    public static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) AbstractC1684a.e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) AbstractC1684a.e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: Q2.i$c */
    public final class c extends AudioDeviceCallback {
        public c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C1023i c1023i = C1023i.this;
            c1023i.c(C1022h.c(c1023i.f7859a));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            C1023i c1023i = C1023i.this;
            c1023i.c(C1022h.c(c1023i.f7859a));
        }
    }

    /* JADX INFO: renamed from: Q2.i$d */
    public final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f7868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f7869b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f7868a = contentResolver;
            this.f7869b = uri;
        }

        public void a() {
            this.f7868a.registerContentObserver(this.f7869b, false, this);
        }

        public void b() {
            this.f7868a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9) {
            C1023i c1023i = C1023i.this;
            c1023i.c(C1022h.c(c1023i.f7859a));
        }
    }

    /* JADX INFO: renamed from: Q2.i$e */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C1023i.this.c(C1022h.d(context, intent));
        }
    }

    /* JADX INFO: renamed from: Q2.i$f */
    public interface f {
        void a(C1022h c1022h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1023i(Context context, f fVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7859a = applicationContext;
        this.f7860b = (f) AbstractC1684a.e(fVar);
        Handler handlerZ = d4.k0.z();
        this.f7861c = handlerZ;
        int i9 = d4.k0.f39777a;
        Object[] objArr = 0;
        this.f7862d = i9 >= 23 ? new c() : null;
        this.f7863e = i9 >= 21 ? new e() : null;
        Uri uriG = C1022h.g();
        this.f7864f = uriG != null ? new d(handlerZ, applicationContext.getContentResolver(), uriG) : null;
    }

    public final void c(C1022h c1022h) {
        if (!this.f7866h || c1022h.equals(this.f7865g)) {
            return;
        }
        this.f7865g = c1022h;
        this.f7860b.a(c1022h);
    }

    public C1022h d() {
        c cVar;
        if (this.f7866h) {
            return (C1022h) AbstractC1684a.e(this.f7865g);
        }
        this.f7866h = true;
        d dVar = this.f7864f;
        if (dVar != null) {
            dVar.a();
        }
        if (d4.k0.f39777a >= 23 && (cVar = this.f7862d) != null) {
            b.a(this.f7859a, cVar, this.f7861c);
        }
        C1022h c1022hD = C1022h.d(this.f7859a, this.f7863e != null ? this.f7859a.registerReceiver(this.f7863e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f7861c) : null);
        this.f7865g = c1022hD;
        return c1022hD;
    }

    public void e() {
        c cVar;
        if (this.f7866h) {
            this.f7865g = null;
            if (d4.k0.f39777a >= 23 && (cVar = this.f7862d) != null) {
                b.b(this.f7859a, cVar);
            }
            BroadcastReceiver broadcastReceiver = this.f7863e;
            if (broadcastReceiver != null) {
                this.f7859a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f7864f;
            if (dVar != null) {
                dVar.b();
            }
            this.f7866h = false;
        }
    }
}
