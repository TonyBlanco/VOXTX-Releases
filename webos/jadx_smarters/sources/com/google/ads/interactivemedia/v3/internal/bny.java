package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
final class bny extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bkm f21806a = new bnz(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DateFormat f21807b = new SimpleDateFormat("MMM d, yyyy");

    private bny() {
    }

    public /* synthetic */ bny(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Date read(boh bohVar) throws IOException {
        java.util.Date date;
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        String strH = bohVar.h();
        try {
            synchronized (this) {
                date = this.f21807b.parse(strH);
            }
            return new Date(date.getTime());
        } catch (ParseException e9) {
            throw new bkf("Failed parsing '" + strH + "' as SQL Date; at path " + bohVar.f(), e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bojVar.g();
            return;
        }
        synchronized (this) {
            str = this.f21807b.format((java.util.Date) date);
        }
        bojVar.l(str);
    }
}
