package q4;

import D.AbstractC0529l;
import D.P;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.zzdx;
import com.google.android.gms.internal.cast.zzln;
import com.google.android.gms.internal.cast.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.AbstractC2342t;
import o4.C2325b;
import o4.C2326c;
import p4.AbstractC2432g;
import p4.C2426a;
import p4.C2427b;
import p4.C2431f;
import p4.C2433h;
import p4.X;
import r0.C2654b;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C2775b f46856x = new C2775b("MediaNotificationProxy");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f46858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2325b f46859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2433h f46860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComponentName f46861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComponentName f46862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f46863g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f46864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f46865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2547b f46866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2427b f46867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Resources f46868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f46869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f46870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Notification f46871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0529l.a f46872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC0529l.a f46873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC0529l.a f46874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0529l.a f46875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC0529l.a f46876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractC0529l.a f46877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC0529l.a f46878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC0529l.a f46879w;

    public p(Context context) {
        this.f46857a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        this.f46858b = notificationManager;
        C2325b c2325b = (C2325b) com.google.android.gms.common.internal.r.m(C2325b.d());
        this.f46859c = c2325b;
        C2426a c2426a = (C2426a) com.google.android.gms.common.internal.r.m(((C2326c) com.google.android.gms.common.internal.r.m(c2325b.a())).H());
        C2433h c2433h = (C2433h) com.google.android.gms.common.internal.r.m(c2426a.L());
        this.f46860d = c2433h;
        c2426a.I();
        Resources resources = context.getResources();
        this.f46868l = resources;
        this.f46861e = new ComponentName(context.getApplicationContext(), c2426a.J());
        this.f46862f = !TextUtils.isEmpty(c2433h.Z()) ? new ComponentName(context.getApplicationContext(), c2433h.Z()) : null;
        this.f46865i = c2433h.V();
        int dimensionPixelSize = resources.getDimensionPixelSize(c2433h.e0());
        C2427b c2427b = new C2427b(1, dimensionPixelSize, dimensionPixelSize);
        this.f46867k = c2427b;
        this.f46866j = new C2547b(context.getApplicationContext(), c2427b);
        if (C4.m.i() && notificationManager != null) {
            NotificationChannel notificationChannelA = com.amplifyframework.storage.s3.service.b.a("cast_media_notification", ((Context) com.google.android.gms.common.internal.r.m(context)).getResources().getString(AbstractC2342t.f45998F), 2);
            notificationChannelA.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannelA);
        }
        zzr.zzd(zzln.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public static boolean e(C2326c c2326c) {
        C2433h c2433hL;
        C2426a c2426aH = c2326c.H();
        if (c2426aH == null || (c2433hL = c2426aH.L()) == null) {
            return false;
        }
        X xM0 = c2433hL.m0();
        if (xM0 == null) {
            return true;
        }
        List listF = x.f(xM0);
        int[] iArrG = x.g(xM0);
        int size = listF == null ? 0 : listF.size();
        if (listF == null || listF.isEmpty()) {
            f46856x.c(AbstractC2432g.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
        } else if (listF.size() > 5) {
            f46856x.c(AbstractC2432g.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
        } else {
            if (iArrG != null && (iArrG.length) != 0) {
                for (int i9 : iArrG) {
                    if (i9 < 0 || i9 >= size) {
                        f46856x.c(AbstractC2432g.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                    }
                }
                return true;
            }
            f46856x.c(AbstractC2432g.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
        }
        return false;
    }

    public final void c() {
        this.f46866j.a();
        NotificationManager notificationManager = this.f46858b;
        if (notificationManager != null) {
            notificationManager.cancel("castMediaNotification", 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.android.gms.cast.CastDevice r18, p4.C2434i r19, android.support.v4.media.session.MediaSessionCompat r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.p.d(com.google.android.gms.cast.CastDevice, p4.i, android.support.v4.media.session.MediaSessionCompat, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D.AbstractC0529l.a f(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.p.f(java.lang.String):D.l$a");
    }

    public final void g() {
        PendingIntent pendingIntentJ;
        AbstractC0529l.a aVarF;
        if (this.f46858b == null || this.f46869m == null) {
            return;
        }
        n nVar = this.f46870n;
        AbstractC0529l.e eVarI = new AbstractC0529l.e(this.f46857a, "cast_media_notification").u(nVar == null ? null : nVar.f46855b).D(this.f46860d.W()).n(this.f46869m.f46850d).m(this.f46868l.getString(this.f46860d.I(), this.f46869m.f46851e)).y(true).C(false).I(1);
        ComponentName componentName = this.f46862f;
        if (componentName == null) {
            pendingIntentJ = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            P pE = P.e(this.f46857a);
            pE.b(intent);
            pendingIntentJ = pE.j(1, zzdx.zza | 134217728);
        }
        if (pendingIntentJ != null) {
            eVarI.l(pendingIntentJ);
        }
        X xM0 = this.f46860d.m0();
        if (xM0 != null) {
            f46856x.a("actionsProvider != null", new Object[0]);
            int[] iArrG = x.g(xM0);
            this.f46864h = iArrG != null ? (int[]) iArrG.clone() : null;
            List<C2431f> listF = x.f(xM0);
            this.f46863g = new ArrayList();
            if (listF != null) {
                for (C2431f c2431f : listF) {
                    String strH = c2431f.H();
                    if (strH.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || strH.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || strH.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || strH.equals(MediaIntentReceiver.ACTION_FORWARD) || strH.equals(MediaIntentReceiver.ACTION_REWIND) || strH.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || strH.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        aVarF = f(c2431f.H());
                    } else {
                        Intent intent2 = new Intent(c2431f.H());
                        intent2.setComponent(this.f46861e);
                        aVarF = new AbstractC0529l.a.C0013a(c2431f.J(), c2431f.I(), PendingIntent.getBroadcast(this.f46857a, 0, intent2, zzdx.zza)).a();
                    }
                    if (aVarF != null) {
                        this.f46863g.add(aVarF);
                    }
                }
            }
        } else {
            f46856x.a("actionsProvider == null", new Object[0]);
            this.f46863g = new ArrayList();
            Iterator it = this.f46860d.H().iterator();
            while (it.hasNext()) {
                AbstractC0529l.a aVarF2 = f((String) it.next());
                if (aVarF2 != null) {
                    this.f46863g.add(aVarF2);
                }
            }
            this.f46864h = (int[]) this.f46860d.J().clone();
        }
        Iterator it2 = this.f46863g.iterator();
        while (it2.hasNext()) {
            eVarI.b((AbstractC0529l.a) it2.next());
        }
        C2654b c2654b = new C2654b();
        int[] iArr = this.f46864h;
        if (iArr != null) {
            c2654b.i(iArr);
        }
        MediaSessionCompat.Token token = this.f46869m.f46847a;
        if (token != null) {
            c2654b.h(token);
        }
        eVarI.F(c2654b);
        Notification notificationC = eVarI.c();
        this.f46871o = notificationC;
        this.f46858b.notify("castMediaNotification", 1, notificationC);
    }
}
