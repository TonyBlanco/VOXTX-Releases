package O2;

import Q2.InterfaceC1039z;
import Q2.X;
import a3.C1083a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c3.C1252a;
import d4.AbstractC1681B;
import e4.InterfaceC1735A;
import f4.C1774b;
import java.util.ArrayList;
import p3.C2405k;
import p3.InterfaceC2407m;
import q3.InterfaceC2545f;

/* JADX INFO: renamed from: O2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0915s implements G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6217a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6221e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6225i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2405k f6218b = new C2405k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6219c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6220d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p3.w f6222f = p3.w.f46389a;

    public C0915s(Context context) {
        this.f6217a = context;
    }

    @Override // O2.G1
    public C1[] a(Handler handler, InterfaceC1735A interfaceC1735A, InterfaceC1039z interfaceC1039z, P3.q qVar, InterfaceC2545f interfaceC2545f) {
        ArrayList arrayList = new ArrayList();
        h(this.f6217a, this.f6219c, this.f6222f, this.f6221e, handler, interfaceC1735A, this.f6220d, arrayList);
        Q2.B bC = c(this.f6217a, this.f6223g, this.f6224h, this.f6225i);
        if (bC != null) {
            b(this.f6217a, this.f6219c, this.f6222f, this.f6221e, bC, handler, interfaceC1039z, arrayList);
        }
        g(this.f6217a, qVar, handler.getLooper(), this.f6219c, arrayList);
        e(this.f6217a, interfaceC2545f, handler.getLooper(), this.f6219c, arrayList);
        d(this.f6217a, this.f6219c, arrayList);
        f(this.f6217a, handler, this.f6219c, arrayList);
        return (C1[]) arrayList.toArray(new C1[0]);
    }

    public void b(Context context, int i9, p3.w wVar, boolean z9, Q2.B b9, Handler handler, InterfaceC1039z interfaceC1039z, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        arrayList.add(new Q2.a0(context, i(), wVar, z9, handler, interfaceC1039z, b9));
        if (i9 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i9 == 2) {
            size--;
        }
        try {
            try {
                i10 = size + 1;
                try {
                    arrayList.add(size, (C1) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                    AbstractC1681B.g("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i10;
                    i10 = size;
                }
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating MIDI extension", e9);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i11 = i10 + 1;
                try {
                    arrayList.add(i10, (C1) C1083a.class.getConstructor(Handler.class, InterfaceC1039z.class, Q2.B.class).newInstance(handler, interfaceC1039z, b9));
                    AbstractC1681B.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i10 = i11;
                    i11 = i10;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                try {
                    i12 = i11 + 1;
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    arrayList.add(i11, (C1) com.google.android.exoplayer2.ext.flac.i.class.getConstructor(Handler.class, InterfaceC1039z.class, Q2.B.class).newInstance(handler, interfaceC1039z, b9));
                    AbstractC1681B.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused6) {
                    i11 = i12;
                    i12 = i11;
                }
                try {
                    arrayList.add(i12, (C1) com.google.android.exoplayer2.ext.ffmpeg.b.class.getConstructor(Handler.class, InterfaceC1039z.class, Q2.B.class).newInstance(handler, interfaceC1039z, b9));
                    AbstractC1681B.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FLAC extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating Opus extension", e12);
        }
    }

    public Q2.B c(Context context, boolean z9, boolean z10, boolean z11) {
        return new X.f(context).l(z9).k(z10).m(z11 ? 1 : 0).g();
    }

    public void d(Context context, int i9, ArrayList arrayList) {
        arrayList.add(new C1774b());
    }

    public void e(Context context, InterfaceC2545f interfaceC2545f, Looper looper, int i9, ArrayList arrayList) {
        arrayList.add(new q3.g(interfaceC2545f, looper));
    }

    public void f(Context context, Handler handler, int i9, ArrayList arrayList) {
    }

    public void g(Context context, P3.q qVar, Looper looper, int i9, ArrayList arrayList) {
        arrayList.add(new P3.r(qVar, looper));
    }

    public void h(Context context, int i9, p3.w wVar, boolean z9, Handler handler, InterfaceC1735A interfaceC1735A, long j9, ArrayList arrayList) {
        String str;
        int i10;
        arrayList.add(new e4.i(context, i(), wVar, j9, z9, handler, interfaceC1735A, 50));
        if (i9 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i9 == 2) {
            size--;
        }
        try {
            try {
                i10 = size + 1;
                try {
                    arrayList.add(size, (C1) C1252a.class.getConstructor(Long.TYPE, Handler.class, InterfaceC1735A.class, Integer.TYPE).newInstance(Long.valueOf(j9), handler, interfaceC1735A, 50));
                    str = "DefaultRenderersFactory";
                    try {
                        AbstractC1681B.g(str, "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i10;
                        i10 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                    str = "DefaultRenderersFactory";
                }
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating VP9 extension", e9);
            }
        } catch (ClassNotFoundException unused3) {
            str = "DefaultRenderersFactory";
        }
        try {
            int i11 = W2.d.f10227h0;
            arrayList.add(i10, (C1) W2.d.class.getConstructor(Long.TYPE, Handler.class, InterfaceC1735A.class, Integer.TYPE).newInstance(Long.valueOf(j9), handler, interfaceC1735A, 50));
            AbstractC1681B.g(str, "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating AV1 extension", e10);
        }
    }

    public InterfaceC2407m.b i() {
        return this.f6218b;
    }

    public C0915s j(int i9) {
        this.f6219c = i9;
        return this;
    }
}
