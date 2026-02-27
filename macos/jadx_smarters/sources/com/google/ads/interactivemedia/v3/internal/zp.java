package com.google.ads.interactivemedia.v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f25266c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25267a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25268b = -1;

    private final boolean c(String str) {
        Matcher matcher = f25266c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i9 = cq.f22640a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f25267a = i10;
            this.f25268b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f25267a == -1 || this.f25268b == -1) ? false : true;
    }

    public final void b(ao aoVar) {
        for (int i9 = 0; i9 < aoVar.a(); i9++) {
            an anVarB = aoVar.b(i9);
            if (anVarB instanceof aau) {
                aau aauVar = (aau) anVarB;
                if ("iTunSMPB".equals(aauVar.f18694b) && c(aauVar.f18695c)) {
                    return;
                }
            } else if (anVarB instanceof abb) {
                abb abbVar = (abb) anVarB;
                if ("com.apple.iTunes".equals(abbVar.f18712a) && "iTunSMPB".equals(abbVar.f18713b) && c(abbVar.f18714c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
