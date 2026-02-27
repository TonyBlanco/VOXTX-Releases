package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.AudioTrack;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23341c;

    public /* synthetic */ jc(Context context, TaskCompletionSource taskCompletionSource, int i9) {
        this.f23341c = i9;
        this.f23339a = context;
        this.f23340b = taskCompletionSource;
    }

    public /* synthetic */ jc(AudioTrack audioTrack, agp agpVar, int i9, byte[] bArr) {
        this.f23341c = i9;
        this.f23339a = audioTrack;
        this.f23340b = agpVar;
    }

    public /* synthetic */ jc(ch chVar, xv xvVar, int i9, byte[] bArr) {
        this.f23341c = i9;
        this.f23339a = chVar;
        this.f23340b = xvVar;
    }

    public /* synthetic */ jc(ji jiVar, ep epVar, int i9) {
        this.f23341c = i9;
        this.f23340b = jiVar;
        this.f23339a = epVar;
    }

    public /* synthetic */ jc(ji jiVar, Exception exc, int i9) {
        this.f23341c = i9;
        this.f23339a = jiVar;
        this.f23340b = exc;
    }

    public /* synthetic */ jc(ji jiVar, String str, int i9) {
        this.f23341c = i9;
        this.f23339a = jiVar;
        this.f23340b = str;
    }

    public /* synthetic */ jc(nn nnVar, no noVar, int i9) {
        this.f23341c = i9;
        this.f23339a = nnVar;
        this.f23340b = noVar;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23341c) {
            case 0:
                ((ji) this.f23339a).h((Exception) this.f23340b);
                break;
            case 1:
                Object obj = this.f23339a;
                ((xv) this.f23340b).b(((ch) obj).a());
                break;
            case 2:
                ((ji) this.f23340b).l((ep) this.f23339a);
                break;
            case 3:
                ((ji) this.f23340b).m((ep) this.f23339a);
                break;
            case 4:
                ((ji) this.f23339a).i((Exception) this.f23340b);
                break;
            case 5:
                ((ji) this.f23339a).k((String) this.f23340b);
                break;
            case 6:
                kh.G((AudioTrack) this.f23339a, (agp) this.f23340b);
                break;
            case 7:
                nn nnVar = (nn) this.f23339a;
                this.f23340b.al(nnVar.f23895a, nnVar.f23896b);
                break;
            case 8:
                nn nnVar2 = (nn) this.f23339a;
                this.f23340b.ao(nnVar2.f23895a, nnVar2.f23896b);
                break;
            case 9:
                nn nnVar3 = (nn) this.f23339a;
                this.f23340b.ak(nnVar3.f23895a, nnVar3.f23896b);
                break;
            default:
                Object obj2 = this.f23339a;
                ((TaskCompletionSource) this.f23340b).setResult(ata.c((Context) obj2, "GLAS"));
                break;
        }
    }
}
