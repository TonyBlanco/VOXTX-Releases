package O2;

import Q2.C1019e;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: O2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0886i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f5992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f5994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1019e f5995d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5997f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f5999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6000i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5998g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5996e = 0;

    /* JADX INFO: renamed from: O2.i$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f6001a;

        public a(Handler handler) {
            this.f6001a = handler;
        }

        public final /* synthetic */ void b(int i9) {
            C0886i.this.h(i9);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i9) {
            this.f6001a.post(new Runnable() { // from class: O2.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5983a.b(i9);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O2.i$b */
    public interface b {
        void F(float f9);

        void G(int i9);
    }

    public C0886i(Context context, Handler handler, b bVar) {
        this.f5992a = (AudioManager) AbstractC1684a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f5994c = bVar;
        this.f5993b = new a(handler);
    }

    public static int e(C1019e c1019e) {
        if (c1019e == null) {
            return 0;
        }
        switch (c1019e.f7793d) {
            case 0:
                AbstractC1681B.j("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c1019e.f7791a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            default:
                AbstractC1681B.j("AudioFocusManager", "Unidentified audio usage: " + c1019e.f7793d);
                return 0;
            case 16:
                return d4.k0.f39777a >= 19 ? 4 : 2;
        }
    }

    public final void a() {
        this.f5992a.abandonAudioFocus(this.f5993b);
    }

    public final void b() {
        if (this.f5996e == 0) {
            return;
        }
        if (d4.k0.f39777a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f5999h;
        if (audioFocusRequest != null) {
            this.f5992a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void f(int i9) {
        b bVar = this.f5994c;
        if (bVar != null) {
            bVar.G(i9);
        }
    }

    public float g() {
        return this.f5998g;
    }

    public final void h(int i9) {
        int i10;
        if (i9 == -3 || i9 == -2) {
            if (i9 == -2 || q()) {
                f(0);
                i10 = 2;
            } else {
                i10 = 3;
            }
            n(i10);
            return;
        }
        if (i9 == -1) {
            f(-1);
            b();
        } else if (i9 == 1) {
            n(1);
            f(1);
        } else {
            AbstractC1681B.j("AudioFocusManager", "Unknown focus change type: " + i9);
        }
    }

    public void i() {
        this.f5994c = null;
        b();
    }

    public final int j() {
        if (this.f5996e == 1) {
            return 1;
        }
        if ((d4.k0.f39777a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    public final int k() {
        return this.f5992a.requestAudioFocus(this.f5993b, d4.k0.l0(((C1019e) AbstractC1684a.e(this.f5995d)).f7793d), this.f5997f);
    }

    public final int l() {
        AudioFocusRequest audioFocusRequest = this.f5999h;
        if (audioFocusRequest == null || this.f6000i) {
            com.google.ads.interactivemedia.v3.internal.W.a();
            this.f5999h = (audioFocusRequest == null ? com.google.ads.interactivemedia.v3.internal.V.a(this.f5997f) : AbstractC0868c.a(this.f5999h)).setAudioAttributes(((C1019e) AbstractC1684a.e(this.f5995d)).b().f7797a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f5993b).build();
            this.f6000i = false;
        }
        return this.f5992a.requestAudioFocus(this.f5999h);
    }

    public void m(C1019e c1019e) {
        if (d4.k0.c(this.f5995d, c1019e)) {
            return;
        }
        this.f5995d = c1019e;
        int iE = e(c1019e);
        this.f5997f = iE;
        boolean z9 = true;
        if (iE != 1 && iE != 0) {
            z9 = false;
        }
        AbstractC1684a.b(z9, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void n(int i9) {
        if (this.f5996e == i9) {
            return;
        }
        this.f5996e = i9;
        float f9 = i9 == 3 ? 0.2f : 1.0f;
        if (this.f5998g == f9) {
            return;
        }
        this.f5998g = f9;
        b bVar = this.f5994c;
        if (bVar != null) {
            bVar.F(f9);
        }
    }

    public final boolean o(int i9) {
        return i9 == 1 || this.f5997f != 1;
    }

    public int p(boolean z9, int i9) {
        if (o(i9)) {
            b();
            return z9 ? 1 : -1;
        }
        if (z9) {
            return j();
        }
        return -1;
    }

    public final boolean q() {
        C1019e c1019e = this.f5995d;
        return c1019e != null && c1019e.f7791a == 1;
    }
}
