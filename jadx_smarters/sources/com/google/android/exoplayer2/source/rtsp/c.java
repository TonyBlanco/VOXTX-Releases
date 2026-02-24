package com.google.android.exoplayer2.source.rtsp;

import O2.C0897l1;
import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.source.rtsp.h;
import d4.k0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25636d;

    public c(int i9, String str, String str2, String str3) {
        this.f25633a = i9;
        this.f25634b = str;
        this.f25635c = str2;
        this.f25636d = str3;
    }

    public String a(h.a aVar, Uri uri, int i9) throws C0897l1 {
        int i10 = this.f25633a;
        if (i10 == 1) {
            return b(aVar);
        }
        if (i10 == 2) {
            return c(aVar, uri, i9);
        }
        throw C0897l1.d(null, new UnsupportedOperationException());
    }

    public final String b(h.a aVar) {
        return k0.D("Basic %s", Base64.encodeToString(h.d(aVar.f25730a + ":" + aVar.f25731b), 0));
    }

    public final String c(h.a aVar, Uri uri, int i9) throws C0897l1 {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            String strT = h.t(i9);
            String strR1 = k0.r1(messageDigest.digest(h.d(aVar.f25730a + ":" + this.f25634b + ":" + aVar.f25731b)));
            StringBuilder sb = new StringBuilder();
            sb.append(strT);
            sb.append(":");
            sb.append(uri);
            String strR12 = k0.r1(messageDigest.digest(h.d(strR1 + ":" + this.f25635c + ":" + k0.r1(messageDigest.digest(h.d(sb.toString()))))));
            return this.f25636d.isEmpty() ? k0.D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f25730a, this.f25634b, this.f25635c, uri, strR12) : k0.D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f25730a, this.f25634b, this.f25635c, uri, strR12, this.f25636d);
        } catch (NoSuchAlgorithmException e9) {
            throw C0897l1.d(null, e9);
        }
    }
}
