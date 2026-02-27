package com.google.ads.interactivemedia.v3.internal;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class og implements ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final od f23914a = od.f23911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f23915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaDrm f23916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23917d;

    private og(UUID uuid) throws UnsupportedSchemeException {
        af.s(uuid);
        af.v(!C1304i.f23213b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f23915b = uuid;
        MediaDrm mediaDrm = new MediaDrm(p(uuid));
        this.f23916c = mediaDrm;
        this.f23917d = 1;
        if (C1304i.f23215d.equals(uuid) && "ASUS_Z00AD".equals(cq.f22643d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static og o(UUID uuid) throws ol {
        try {
            return new og(uuid);
        } catch (UnsupportedSchemeException e9) {
            throw new ol(e9);
        } catch (Exception e10) {
            throw new ol(e10);
        }
    }

    private static UUID p(UUID uuid) {
        return (cq.f22640a >= 27 || !C1304i.f23214c.equals(uuid)) ? uuid : C1304i.f23213b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final int a() {
        return 2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final /* bridge */ /* synthetic */ ea b(byte[] bArr) throws MediaCryptoException {
        boolean z9 = false;
        if (cq.f22640a < 21 && C1304i.f23215d.equals(this.f23915b) && "L3".equals(this.f23916c.getPropertyString("securityLevel"))) {
            z9 = true;
        }
        return new oc(p(this.f23915b), bArr, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final Map c(byte[] bArr) {
        return this.f23916c.queryKeyStatus(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final void d(byte[] bArr) {
        this.f23916c.closeSession(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final void e(byte[] bArr) throws DeniedByServerException {
        this.f23916c.provideProvisionResponse(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final synchronized void f() {
        int i9 = this.f23917d - 1;
        this.f23917d = i9;
        if (i9 == 0) {
            this.f23916c.release();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final void g(byte[] bArr, byte[] bArr2) {
        this.f23916c.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final void h(final oa oaVar) {
        this.f23916c.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.google.ads.interactivemedia.v3.internal.oe
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i9, int i10, byte[] bArr2) {
                nb nbVar = ((na) oaVar).f23857a.f23870a;
                af.s(nbVar);
                nbVar.obtainMessage(i9, bArr).sendToTarget();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final void i(byte[] bArr, iw iwVar) {
        if (cq.f22640a >= 31) {
            try {
                of.a(this.f23916c, bArr, iwVar);
            } catch (UnsupportedOperationException unused) {
                cd.e("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final boolean j(byte[] bArr, String str) {
        if (cq.f22640a >= 31) {
            return of.b(this.f23916c, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f23915b, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final byte[] k() throws MediaDrmException {
        return this.f23916c.openSession();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final byte[] l(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (C1304i.f23214c.equals(this.f23915b)) {
            bArr2 = pi.d(bArr2);
        }
        return this.f23916c.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ob
    public final zo m() {
        MediaDrm.ProvisionRequest provisionRequest = this.f23916c.getProvisionRequest();
        return new zo(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0195  */
    @Override // com.google.ads.interactivemedia.v3.internal.ob
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.aeq n(byte[] r16, java.util.List r17, int r18, java.util.HashMap r19) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.og.n(byte[], java.util.List, int, java.util.HashMap):com.google.ads.interactivemedia.v3.internal.aeq");
    }
}
