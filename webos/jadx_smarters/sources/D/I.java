package D;

import D.AbstractC0529l;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.C2696b;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public class I implements InterfaceC0528k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f1169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0529l.e f1170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RemoteViews f1171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RemoteViews f1172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f1173f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1174g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RemoteViews f1176i;

    public I(AbstractC0529l.e eVar) {
        Notification.Builder builder;
        int i9;
        Icon icon;
        this.f1170c = eVar;
        this.f1168a = eVar.f1280a;
        if (Build.VERSION.SDK_INT >= 26) {
            u.a();
            builder = t.a(eVar.f1280a, eVar.f1269K);
        } else {
            builder = new Notification.Builder(eVar.f1280a);
        }
        this.f1169b = builder;
        Notification notification = eVar.f1276R;
        this.f1169b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1288i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1284e).setContentText(eVar.f1285f).setContentInfo(eVar.f1290k).setContentIntent(eVar.f1286g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1287h, (notification.flags & 128) != 0).setLargeIcon(eVar.f1289j).setNumber(eVar.f1291l).setProgress(eVar.f1299t, eVar.f1300u, eVar.f1301v);
        this.f1169b.setSubText(eVar.f1296q).setUsesChronometer(eVar.f1294o).setPriority(eVar.f1292m);
        Iterator it = eVar.f1281b.iterator();
        while (it.hasNext()) {
            b((AbstractC0529l.a) it.next());
        }
        Bundle bundle = eVar.f1262D;
        if (bundle != null) {
            this.f1174g.putAll(bundle);
        }
        int i10 = Build.VERSION.SDK_INT;
        this.f1171d = eVar.f1266H;
        this.f1172e = eVar.f1267I;
        this.f1169b.setShowWhen(eVar.f1293n);
        this.f1169b.setLocalOnly(eVar.f1305z).setGroup(eVar.f1302w).setGroupSummary(eVar.f1303x).setSortKey(eVar.f1304y);
        this.f1175h = eVar.f1273O;
        this.f1169b.setCategory(eVar.f1261C).setColor(eVar.f1263E).setVisibility(eVar.f1264F).setPublicVersion(eVar.f1265G).setSound(notification.sound, notification.audioAttributes);
        List listE = i10 < 28 ? e(g(eVar.f1282c), eVar.f1279U) : eVar.f1279U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                this.f1169b.addPerson((String) it2.next());
            }
        }
        this.f1176i = eVar.f1268J;
        if (eVar.f1283d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i11 = 0; i11 < eVar.f1283d.size(); i11++) {
                bundle4.putBundle(Integer.toString(i11), J.a((AbstractC0529l.a) eVar.f1283d.get(i11)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1174g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23 && (icon = eVar.f1278T) != null) {
            this.f1169b.setSmallIcon(icon);
        }
        if (i12 >= 24) {
            this.f1169b.setExtras(eVar.f1262D).setRemoteInputHistory(eVar.f1298s);
            RemoteViews remoteViews = eVar.f1266H;
            if (remoteViews != null) {
                this.f1169b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f1267I;
            if (remoteViews2 != null) {
                this.f1169b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f1268J;
            if (remoteViews3 != null) {
                this.f1169b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i12 >= 26) {
            this.f1169b.setBadgeIconType(eVar.f1270L).setSettingsText(eVar.f1297r).setShortcutId(eVar.f1271M).setTimeoutAfter(eVar.f1272N).setGroupAlertBehavior(eVar.f1273O);
            if (eVar.f1260B) {
                this.f1169b.setColorized(eVar.f1259A);
            }
            if (!TextUtils.isEmpty(eVar.f1269K)) {
                this.f1169b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            Iterator it3 = eVar.f1282c.iterator();
            if (it3.hasNext()) {
                AbstractC1617D.a(it3.next());
                throw null;
            }
        }
        if (i12 >= 29) {
            this.f1169b.setAllowSystemGeneratedContextualActions(eVar.f1275Q);
            this.f1169b.setBubbleMetadata(AbstractC0529l.d.a(null));
        }
        if (i12 >= 31 && (i9 = eVar.f1274P) != 0) {
            this.f1169b.setForegroundServiceBehavior(i9);
        }
        if (eVar.f1277S) {
            if (this.f1170c.f1303x) {
                this.f1175h = 2;
            } else {
                this.f1175h = 1;
            }
            this.f1169b.setVibrate(null);
            this.f1169b.setSound(null);
            int i13 = notification.defaults & (-4);
            notification.defaults = i13;
            this.f1169b.setDefaults(i13);
            if (i12 >= 26) {
                if (TextUtils.isEmpty(this.f1170c.f1302w)) {
                    this.f1169b.setGroup("silent");
                }
                this.f1169b.setGroupAlertBehavior(this.f1175h);
            }
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C2696b c2696b = new C2696b(list.size() + list2.size());
        c2696b.addAll(list);
        c2696b.addAll(list2);
        return new ArrayList(c2696b);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC1617D.a(it.next());
        throw null;
    }

    @Override // D.InterfaceC0528k
    public Notification.Builder a() {
        return this.f1169b;
    }

    public final void b(AbstractC0529l.a aVar) {
        Notification.Action.Builder builder;
        int i9 = Build.VERSION.SDK_INT;
        IconCompat iconCompatD = aVar.d();
        if (i9 >= 23) {
            s.a();
            builder = r.a(iconCompatD != null ? iconCompatD.m() : null, aVar.h(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(iconCompatD != null ? iconCompatD.f() : 0, aVar.h(), aVar.a());
        }
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : N.b(aVar.e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            builder.setSemanticAction(aVar.f());
        }
        if (i10 >= 29) {
            builder.setContextual(aVar.j());
        }
        if (i10 >= 31) {
            builder.setAuthenticationRequired(aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        builder.addExtras(bundle);
        this.f1169b.addAction(builder.build());
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        AbstractC0529l.h hVar = this.f1170c.f1295p;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews remoteViewsE = hVar != null ? hVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null || (remoteViewsE = this.f1170c.f1266H) != null) {
            notificationD.contentView = remoteViewsE;
        }
        if (hVar != null && (remoteViewsD = hVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (hVar != null && (remoteViewsF = this.f1170c.f1295p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (hVar != null && (bundleA = AbstractC0529l.a(notificationD)) != null) {
            hVar.a(bundleA);
        }
        return notificationD;
    }

    public Notification d() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            return this.f1169b.build();
        }
        if (i9 >= 24) {
            Notification notificationBuild = this.f1169b.build();
            if (this.f1175h != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 && this.f1175h == 2) {
                    h(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f1175h == 1) {
                    h(notificationBuild);
                }
            }
            return notificationBuild;
        }
        this.f1169b.setExtras(this.f1174g);
        Notification notificationBuild2 = this.f1169b.build();
        RemoteViews remoteViews = this.f1171d;
        if (remoteViews != null) {
            notificationBuild2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f1172e;
        if (remoteViews2 != null) {
            notificationBuild2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f1176i;
        if (remoteViews3 != null) {
            notificationBuild2.headsUpContentView = remoteViews3;
        }
        if (this.f1175h != 0) {
            if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 && this.f1175h == 2) {
                h(notificationBuild2);
            }
            if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 && this.f1175h == 1) {
                h(notificationBuild2);
            }
        }
        return notificationBuild2;
    }

    public Context f() {
        return this.f1168a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
