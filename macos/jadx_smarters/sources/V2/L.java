package V2;

import O2.AbstractC0904o;
import P2.v0;
import V2.C1056m;
import V2.G;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l3.AbstractC2187l;
import r5.AbstractC2675d;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G.c f9887d = new G.c() { // from class: V2.I
        @Override // V2.G.c
        public final G a(UUID uuid) {
            return L.B(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f9888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f9889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9890c;

    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, v0 v0Var) {
            LogSessionId logSessionIdA = v0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            K.a(AbstractC1684a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    public L(UUID uuid) {
        AbstractC1684a.e(uuid);
        AbstractC1684a.b(!AbstractC0904o.f6138b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f9888a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f9889b = mediaDrm;
        this.f9890c = 1;
        if (AbstractC0904o.f6140d.equals(uuid) && C()) {
            w(mediaDrm);
        }
    }

    public static /* synthetic */ G B(UUID uuid) {
        try {
            return D(uuid);
        } catch (W unused) {
            AbstractC1681B.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + InstructionFileId.DOT);
            return new D();
        }
    }

    public static boolean C() {
        return "ASUS_Z00AD".equals(k0.f39780d);
    }

    public static L D(UUID uuid) throws W {
        try {
            return new L(uuid);
        } catch (UnsupportedSchemeException e9) {
            throw new W(1, e9);
        } catch (Exception e10) {
            throw new W(2, e10);
        }
    }

    public static byte[] p(byte[] bArr) {
        d4.M m9 = new d4.M(bArr);
        int iU = m9.u();
        short sW = m9.w();
        short sW2 = m9.w();
        if (sW != 1 || sW2 != 1) {
            AbstractC1681B.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sW3 = m9.w();
        Charset charset = AbstractC2675d.f49726e;
        String strF = m9.F(sW3, charset);
        if (strF.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strF.indexOf("</DATA>");
        if (iIndexOf == -1) {
            AbstractC1681B.j("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strF.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strF.substring(iIndexOf);
        int i9 = iU + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i9);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i9);
        byteBufferAllocate.putShort(sW);
        byteBufferAllocate.putShort(sW2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    public static String q(String str) {
        return "<LA_URL>https://x</LA_URL>".equals(str) ? "" : (k0.f39777a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    public static byte[] r(UUID uuid, byte[] bArr) {
        return AbstractC0904o.f6139c.equals(uuid) ? AbstractC1044a.a(bArr) : bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = O2.AbstractC0904o.f6141e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = l3.AbstractC2187l.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = p(r4)
            byte[] r4 = l3.AbstractC2187l.a(r0, r4)
        L18:
            int r1 = d4.k0.f39777a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = O2.AbstractC0904o.f6140d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = d4.k0.f39779c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = d4.k0.f39780d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = l3.AbstractC2187l.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.L.s(java.util.UUID, byte[]):byte[]");
    }

    public static String t(UUID uuid, String str) {
        return (k0.f39777a < 26 && AbstractC0904o.f6139c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    public static UUID u(UUID uuid) {
        return (k0.f39777a >= 27 || !AbstractC0904o.f6139c.equals(uuid)) ? uuid : AbstractC0904o.f6138b;
    }

    public static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static C1056m.b y(UUID uuid, List list) {
        if (AbstractC0904o.f6140d.equals(uuid)) {
            if (k0.f39777a >= 28 && list.size() > 1) {
                C1056m.b bVar = (C1056m.b) list.get(0);
                int length = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    C1056m.b bVar2 = (C1056m.b) list.get(i9);
                    byte[] bArr = (byte[]) AbstractC1684a.e(bVar2.f10014f);
                    if (k0.c(bVar2.f10013e, bVar.f10013e) && k0.c(bVar2.f10012d, bVar.f10012d) && AbstractC2187l.c(bArr)) {
                        length += bArr.length;
                    }
                }
                byte[] bArr2 = new byte[length];
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    byte[] bArr3 = (byte[]) AbstractC1684a.e(((C1056m.b) list.get(i11)).f10014f);
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i10, length2);
                    i10 += length2;
                }
                return bVar.c(bArr2);
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                C1056m.b bVar3 = (C1056m.b) list.get(i12);
                int iG = AbstractC2187l.g((byte[]) AbstractC1684a.e(bVar3.f10014f));
                int i13 = k0.f39777a;
                if (i13 < 23 && iG == 0) {
                    return bVar3;
                }
                if (i13 >= 23 && iG == 1) {
                    return bVar3;
                }
            }
        }
        return (C1056m.b) list.get(0);
    }

    public static boolean z(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(u(uuid));
    }

    public final /* synthetic */ void A(G.b bVar, MediaDrm mediaDrm, byte[] bArr, int i9, int i10, byte[] bArr2) {
        bVar.a(this, bArr, i9, i10, bArr2);
    }

    @Override // V2.G
    public Map a(byte[] bArr) {
        return this.f9889b.queryKeyStatus(bArr);
    }

    @Override // V2.G
    public G.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f9889b.getProvisionRequest();
        return new G.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // V2.G
    public byte[] c() {
        return this.f9889b.openSession();
    }

    @Override // V2.G
    public void d(final G.b bVar) {
        this.f9889b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: V2.J
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i9, int i10, byte[] bArr2) {
                this.f9885a.A(bVar, mediaDrm, bArr, i9, i10, bArr2);
            }
        });
    }

    @Override // V2.G
    public void e(byte[] bArr, v0 v0Var) {
        if (k0.f39777a >= 31) {
            try {
                a.b(this.f9889b, bArr, v0Var);
            } catch (UnsupportedOperationException unused) {
                AbstractC1681B.j("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // V2.G
    public void f(byte[] bArr, byte[] bArr2) {
        this.f9889b.restoreKeys(bArr, bArr2);
    }

    @Override // V2.G
    public void g(byte[] bArr) throws DeniedByServerException {
        this.f9889b.provideProvisionResponse(bArr);
    }

    @Override // V2.G
    public int h() {
        return 2;
    }

    @Override // V2.G
    public boolean j(byte[] bArr, String str) {
        if (k0.f39777a >= 31) {
            return a.a(this.f9889b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f9888a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // V2.G
    public void k(byte[] bArr) {
        this.f9889b.closeSession(bArr);
    }

    @Override // V2.G
    public byte[] l(byte[] bArr, byte[] bArr2) {
        if (AbstractC0904o.f6139c.equals(this.f9888a)) {
            bArr2 = AbstractC1044a.b(bArr2);
        }
        return this.f9889b.provideKeyResponse(bArr, bArr2);
    }

    @Override // V2.G
    public G.a m(byte[] bArr, List list, int i9, HashMap map) throws NotProvisionedException {
        C1056m.b bVarY;
        byte[] bArrS;
        String strT;
        if (list != null) {
            bVarY = y(this.f9888a, list);
            bArrS = s(this.f9888a, (byte[]) AbstractC1684a.e(bVarY.f10014f));
            strT = t(this.f9888a, bVarY.f10013e);
        } else {
            bVarY = null;
            bArrS = null;
            strT = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f9889b.getKeyRequest(bArr, bArrS, strT, i9, map);
        byte[] bArrR = r(this.f9888a, keyRequest.getData());
        String strQ = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strQ) && bVarY != null && !TextUtils.isEmpty(bVarY.f10012d)) {
            strQ = bVarY.f10012d;
        }
        return new G.a(bArrR, strQ, k0.f39777a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // V2.G
    public synchronized void release() {
        int i9 = this.f9890c - 1;
        this.f9890c = i9;
        if (i9 == 0) {
            this.f9889b.release();
        }
    }

    @Override // V2.G
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public H i(byte[] bArr) {
        return new H(u(this.f9888a), bArr, k0.f39777a < 21 && AbstractC0904o.f6140d.equals(this.f9888a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f9889b.getPropertyString(str);
    }
}
