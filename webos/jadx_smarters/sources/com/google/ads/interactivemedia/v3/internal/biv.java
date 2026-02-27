package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class biv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final biv f21524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final biv f21525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final biv f21526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final biv f21527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final biv f21528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f21529f = Logger.getLogger(biv.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f21530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f21531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bix f21532i;

    static {
        if (bci.b()) {
            f21530g = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f21531h = false;
        } else {
            f21530g = bjh.f() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList();
            f21531h = true;
        }
        f21524a = new biv(new biw(1));
        f21525b = new biv(new biw(4));
        f21526c = new biv(new biw(0));
        f21527d = new biv(new biw(3));
        f21528e = new biv(new biw(2));
    }

    public biv(bix bixVar) {
        this.f21532i = bixVar;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f21529f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) throws GeneralSecurityException {
        Iterator it = f21530g.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f21532i.a(str, (Provider) it.next());
            } catch (Exception e9) {
                if (exc == null) {
                    exc = e9;
                }
            }
        }
        if (f21531h) {
            return this.f21532i.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
