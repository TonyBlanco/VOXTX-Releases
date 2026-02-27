package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes3.dex */
public final class ath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f20680a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f20681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f20682c;

    static {
        Charset.forName("ISO-8859-1");
        f20681b = Charset.forName("UTF-8");
        Charset.forName(CharEncoding.UTF_16BE);
        f20682c = Charset.forName(CharEncoding.UTF_16LE);
        Charset.forName("UTF-16");
    }
}
