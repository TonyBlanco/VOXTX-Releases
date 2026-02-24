package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class blx extends bkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bkm f21681a = new blw(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f21682b;

    public blx() {
        ArrayList arrayList = new ArrayList();
        this.f21682b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (bkz.a()) {
            arrayList.add(bjh.e(2, 2));
        }
    }

    private final Date a(boh bohVar) throws IOException {
        String strH = bohVar.h();
        synchronized (this.f21682b) {
            try {
                Iterator it = this.f21682b.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strH);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return bnx.a(strH, new ParsePosition(0));
                } catch (ParseException e9) {
                    throw new bkf("Failed parsing '" + strH + "' as Date; at path " + bohVar.f(), e9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() != 9) {
            return a(bohVar);
        }
        bohVar.m();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bojVar.g();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f21682b.get(0);
        synchronized (this.f21682b) {
            str = dateFormat.format(date);
        }
        bojVar.l(str);
    }
}
