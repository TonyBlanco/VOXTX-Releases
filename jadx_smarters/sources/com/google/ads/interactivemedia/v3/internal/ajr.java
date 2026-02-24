package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.UiElement;
import java.net.MalformedURLException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ajr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bjt f19956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ajp f19957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ajq f19960e;

    static {
        bju bjuVar = new bju();
        bjuVar.b(UiElement.class, com.google.ads.interactivemedia.v3.impl.data.cb.GSON_TYPE_ADAPTER);
        bjuVar.b(CompanionAdSlot.class, new ajo());
        bjuVar.c(new atg());
        f19956a = bjuVar.a();
    }

    public ajr(ajp ajpVar, ajq ajqVar, String str) {
        this(ajpVar, ajqVar, str, null);
    }

    public ajr(ajp ajpVar, ajq ajqVar, String str, Object obj) {
        this.f19957b = ajpVar;
        this.f19960e = ajqVar;
        this.f19959d = str;
        this.f19958c = obj;
    }

    public static ajr c(String str) throws MalformedURLException {
        Uri uri = Uri.parse(str);
        String path = uri.getPath();
        if (path == null) {
            throw new MalformedURLException("URL must have message.");
        }
        String strSubstring = path.substring(1);
        if (uri.getQueryParameter("sid") != null) {
            return new ajr(ajp.a(strSubstring), ajq.a(uri.getQueryParameter("type")), uri.getQueryParameter("sid"), f19956a.f(uri.getQueryParameter("data"), com.google.ads.interactivemedia.v3.impl.data.bm.class));
        }
        throw new MalformedURLException("Session id must be provided in message.");
    }

    public static ajr d(String str) {
        bjt bjtVar = f19956a;
        com.google.ads.interactivemedia.v3.impl.data.bn bnVar = (com.google.ads.interactivemedia.v3.impl.data.bn) bjtVar.f(str, com.google.ads.interactivemedia.v3.impl.data.bn.class);
        if (bnVar.sid != null) {
            return new ajr(ajp.a(bnVar.name), ajq.a(bnVar.type), bnVar.sid, bjtVar.f(bnVar.data, com.google.ads.interactivemedia.v3.impl.data.bm.class));
        }
        throw new NullPointerException("Session id must be provided in message.");
    }

    public final ajp a() {
        return this.f19957b;
    }

    public final ajq b() {
        return this.f19960e;
    }

    public final Object e() {
        return this.f19958c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ajr)) {
            return false;
        }
        ajr ajrVar = (ajr) obj;
        return this.f19957b == ajrVar.f19957b && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f19958c, ajrVar.f19958c) && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f19959d, ajrVar.f19959d) && this.f19960e == ajrVar.f19960e;
    }

    public final String f() {
        return this.f19959d;
    }

    public final String g() {
        avq avqVar = new avq();
        avqVar.a("type", this.f19960e);
        avq avqVarA = avqVar.a("sid", this.f19959d);
        Object obj = this.f19958c;
        if (obj != null) {
            avqVarA.a("data", obj);
        }
        return String.format("%s('%s', %s);", "javascript:adsense.mobileads.afmanotify.receiveMessage", this.f19957b, f19956a.g(avqVarA.b()));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19957b, this.f19958c, this.f19959d, this.f19960e});
    }

    public final String toString() {
        return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s]", this.f19957b, this.f19960e, this.f19959d, this.f19958c);
    }
}
