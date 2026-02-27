package com.google.ads.interactivemedia.v3.internal;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class bdy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f21123b;

    public bdy() {
        this.f21123b = new ArrayList();
        this.f21122a = new ArrayList();
        new ArrayList();
    }

    public bdy(azo azoVar) {
        this.f21122a = azoVar;
        this.f21123b = null;
    }

    public bdy(azr azrVar) {
        this.f21122a = null;
        this.f21123b = azrVar;
    }

    public bdy(Class cls, Class cls2) {
        this(cls, cls2, null);
    }

    public /* synthetic */ bdy(Class cls, Class cls2, byte[] bArr) {
        this.f21122a = cls;
        this.f21123b = cls2;
    }

    public bdy(List list) {
        this.f21122a = list;
        this.f21123b = new aae[list.size()];
    }

    public bdy(byte[] bArr) {
        ahh ahhVar = new ahh(0);
        this.f21123b = ahhVar;
        this.f21122a = new ahh(ahhVar, 1);
    }

    private bdy(byte[] bArr, byte[] bArr2) {
        this.f21122a = "Google1";
        this.f21123b = "3.29.0";
    }

    public bdy(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        this.f21122a = byteArrayOutputStream;
        this.f21123b = new DataOutputStream(byteArrayOutputStream);
    }

    public static bdy a(bdx bdxVar, Class cls, Class cls2) {
        return new bdy(cls, cls2);
    }

    public static bdy n() {
        com.google.ads.interactivemedia.v3.impl.data.i.d("Google1", "Name is null or empty");
        com.google.ads.interactivemedia.v3.impl.data.i.d("3.29.0", "Version is null or empty");
        return new bdy((byte[]) null, (byte[]) null);
    }

    private static void o(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final Class b() {
        return (Class) this.f21122a;
    }

    public final Class c() {
        return (Class) this.f21123b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.ads.interactivemedia.v3.internal.azo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.ads.interactivemedia.v3.internal.azr, java.lang.Object] */
    public final byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ?? r02 = this.f21122a;
        return r02 != 0 ? r02.a(bArr, bArr2) : this.f21123b.a(bArr, bArr2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final void e(aqj aqjVar) {
        this.f21122a.add(aqjVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final void f(aqj aqjVar) {
        this.f21123b.add(aqjVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.ads.interactivemedia.v3.internal.ahg, java.lang.Object] */
    public final ahg g() {
        return this.f21122a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.ads.interactivemedia.v3.internal.ahg, java.lang.Object] */
    public final ahg h() {
        return this.f21123b;
    }

    public final String i() {
        return (String) this.f21122a;
    }

    public final String j() {
        return (String) this.f21123b;
    }

    public final void k(long j9, cj cjVar) {
        fz.l(j9, cjVar, (aae[]) this.f21123b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void l(zk zkVar, aet aetVar) {
        for (int i9 = 0; i9 < ((aae[]) this.f21123b).length; i9++) {
            aetVar.c();
            aae aaeVarI = zkVar.i(aetVar.a(), 3);
            C1333s c1333s = (C1333s) this.f21122a.get(i9);
            String str = c1333s.f24467l;
            boolean z9 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z9 = false;
            }
            af.v(z9, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String strB = c1333s.f24456a;
            if (strB == null) {
                strB = aetVar.b();
            }
            r rVar = new r();
            rVar.S(strB);
            rVar.ae(str);
            rVar.ag(c1333s.f24459d);
            rVar.V(c1333s.f24458c);
            rVar.F(c1333s.f24453D);
            rVar.T(c1333s.f24469n);
            aaeVarI.b(rVar.v());
            ((aae[]) this.f21123b)[i9] = aaeVarI;
        }
    }

    public final byte[] m(aal aalVar) {
        ((ByteArrayOutputStream) this.f21122a).reset();
        try {
            o((DataOutputStream) this.f21123b, aalVar.f18664a);
            String str = aalVar.f18665b;
            if (str == null) {
                str = "";
            }
            o((DataOutputStream) this.f21123b, str);
            ((DataOutputStream) this.f21123b).writeLong(aalVar.f18666c);
            ((DataOutputStream) this.f21123b).writeLong(aalVar.f18667d);
            ((DataOutputStream) this.f21123b).write(aalVar.f18668e);
            ((DataOutputStream) this.f21123b).flush();
            return ((ByteArrayOutputStream) this.f21122a).toByteArray();
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }
}
