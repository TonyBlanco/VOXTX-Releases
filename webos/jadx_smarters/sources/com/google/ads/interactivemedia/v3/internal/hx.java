package com.google.ads.interactivemedia.v3.internal;

import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hx implements bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23205c;

    public /* synthetic */ hx(hv hvVar, al alVar, int i9) {
        this.f23205c = i9;
        this.f23204b = hvVar;
        this.f23203a = alVar;
    }

    public /* synthetic */ hx(hv hvVar, at atVar, int i9) {
        this.f23205c = i9;
        this.f23204b = hvVar;
        this.f23203a = atVar;
    }

    public /* synthetic */ hx(hv hvVar, au auVar, int i9) {
        this.f23205c = i9;
        this.f23204b = hvVar;
        this.f23203a = auVar;
    }

    public /* synthetic */ hx(hv hvVar, aw awVar, int i9) {
        this.f23205c = i9;
        this.f23204b = hvVar;
        this.f23203a = awVar;
    }

    public /* synthetic */ hx(hv hvVar, bk bkVar, int i9) {
        this.f23205c = i9;
        this.f23204b = hvVar;
        this.f23203a = bkVar;
    }

    public /* synthetic */ hx(hv hvVar, bl blVar, int i9) {
        this.f23205c = i9;
        this.f23204b = hvVar;
        this.f23203a = blVar;
    }

    public /* synthetic */ hx(hv hvVar, ep epVar, int i9) {
        this.f23205c = i9;
        this.f23204b = hvVar;
        this.f23203a = epVar;
    }

    public /* synthetic */ hx(hv hvVar, C1313l c1313l, int i9) {
        this.f23205c = i9;
        this.f23204b = hvVar;
        this.f23203a = c1313l;
    }

    public /* synthetic */ hx(hv hvVar, tb tbVar, int i9) {
        this.f23205c = i9;
        this.f23203a = hvVar;
        this.f23204b = tbVar;
    }

    public /* synthetic */ hx(hv hvVar, Exception exc, int i9) {
        this.f23205c = i9;
        this.f23203a = hvVar;
        this.f23204b = exc;
    }

    public /* synthetic */ hx(hv hvVar, String str, int i9) {
        this.f23205c = i9;
        this.f23203a = hvVar;
        this.f23204b = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bx
    public final void a(Object obj) {
        switch (this.f23205c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((hw) obj).a((hv) this.f23203a, (tb) this.f23204b);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                ((hw) obj).b((hv) this.f23204b, (at) this.f23203a);
                break;
            case 12:
                break;
            case 13:
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                break;
            case 16:
                bl blVar = (bl) this.f23203a;
                ((hw) obj).h(blVar);
                int i9 = blVar.f21637b;
                int i10 = blVar.f21638c;
                int i11 = blVar.f21639d;
                float f9 = blVar.f21640e;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((hw) obj).g((ep) this.f23203a);
                break;
            case 18:
                break;
            default:
                break;
        }
    }
}
