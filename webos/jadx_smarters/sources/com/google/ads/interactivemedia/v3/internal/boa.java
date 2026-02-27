package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
final class boa extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bkm f21812a = new bnz(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DateFormat f21813b = new SimpleDateFormat("hh:mm:ss a");

    private boa() {
    }

    public /* synthetic */ boa(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Time read(boh bohVar) throws IOException {
        Time time;
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        String strH = bohVar.h();
        try {
            synchronized (this) {
                time = new Time(this.f21813b.parse(strH).getTime());
            }
            return time;
        } catch (ParseException e9) {
            throw new bkf("Failed parsing '" + strH + "' as SQL Time; at path " + bohVar.f(), e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bojVar.g();
            return;
        }
        synchronized (this) {
            str = this.f21813b.format((Date) time);
        }
        bojVar.l(str);
    }
}
