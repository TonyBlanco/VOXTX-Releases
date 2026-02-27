package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
final class bnf extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        bohVar.j();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (bohVar.r() != 4) {
            String strG = bohVar.g();
            int iB = bohVar.b();
            if ("year".equals(strG)) {
                i9 = iB;
            } else if ("month".equals(strG)) {
                i10 = iB;
            } else if ("dayOfMonth".equals(strG)) {
                i11 = iB;
            } else if ("hourOfDay".equals(strG)) {
                i12 = iB;
            } else if ("minute".equals(strG)) {
                i13 = iB;
            } else if ("second".equals(strG)) {
                i14 = iB;
            }
        }
        bohVar.l();
        return new GregorianCalendar(i9, i10, i11, i12, i13, i14);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            bojVar.g();
            return;
        }
        bojVar.c();
        bojVar.f("year");
        bojVar.i(r4.get(1));
        bojVar.f("month");
        bojVar.i(r4.get(2));
        bojVar.f("dayOfMonth");
        bojVar.i(r4.get(5));
        bojVar.f("hourOfDay");
        bojVar.i(r4.get(11));
        bojVar.f("minute");
        bojVar.i(r4.get(12));
        bojVar.f("second");
        bojVar.i(r4.get(13));
        bojVar.e();
    }
}
