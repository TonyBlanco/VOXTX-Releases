package com.google.ads.interactivemedia.v3.internal;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes3.dex */
public final class boe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f21816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final blz f21817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final blz f21818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bkm f21819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bkm f21820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bkm f21821f;

    static {
        boolean z9;
        bkm bkmVar;
        try {
            Class.forName("java.sql.Date");
            z9 = true;
        } catch (ClassNotFoundException unused) {
            z9 = false;
        }
        f21816a = z9;
        if (z9) {
            f21817b = new boc(Date.class);
            f21818c = new bod(Timestamp.class);
            f21819d = bny.f21806a;
            f21820e = boa.f21812a;
            bkmVar = bob.f21814a;
        } else {
            bkmVar = null;
            f21817b = null;
            f21818c = null;
            f21819d = null;
            f21820e = null;
        }
        f21821f = bkmVar;
    }
}
