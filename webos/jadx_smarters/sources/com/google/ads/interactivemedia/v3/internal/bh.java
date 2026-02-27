package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21303a = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21304b = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21305c = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21306d = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21307e = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21308f = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21309g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private avo f21310h = avo.o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private avo f21311i = avo.o();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21312j = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21313k = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private avo f21314l = avo.o();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private avo f21315m = avo.o();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21316n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HashMap f21317o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private HashSet f21318p = new HashSet();

    @Deprecated
    public bh() {
    }

    public void q(Context context) {
        CaptioningManager captioningManager;
        int i9 = cq.f22640a;
        if (i9 >= 19) {
            if ((i9 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f21316n = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f21315m = avo.p(cq.O(locale));
                }
            }
        }
    }

    public bh r(int i9, int i10) {
        this.f21307e = i9;
        this.f21308f = i10;
        this.f21309g = true;
        return this;
    }

    public void s(Context context) {
        Point pointY = cq.y(context);
        r(pointY.x, pointY.y);
    }
}
