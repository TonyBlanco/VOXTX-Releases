package D;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: D.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0529l {

    /* JADX INFO: renamed from: D.l$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f1231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f1232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final N[] f1233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final N[] f1234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f1237g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f1238h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1239i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f1240j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f1241k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f1242l;

        /* JADX INFO: renamed from: D.l$a$a, reason: collision with other inner class name */
        public static final class C0013a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IconCompat f1243a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CharSequence f1244b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PendingIntent f1245c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f1246d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Bundle f1247e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public ArrayList f1248f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f1249g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f1250h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f1251i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f1252j;

            public C0013a(int i9, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i9 != 0 ? IconCompat.d(null, "", i9) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0013a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, N[] nArr, boolean z9, int i9, boolean z10, boolean z11, boolean z12) {
                this.f1246d = true;
                this.f1250h = true;
                this.f1243a = iconCompat;
                this.f1244b = e.f(charSequence);
                this.f1245c = pendingIntent;
                this.f1247e = bundle;
                this.f1248f = nArr == null ? null : new ArrayList(Arrays.asList(nArr));
                this.f1246d = z9;
                this.f1249g = i9;
                this.f1250h = z10;
                this.f1251i = z11;
                this.f1252j = z12;
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f1248f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    if (it.hasNext()) {
                        AbstractC1617D.a(it.next());
                        throw null;
                    }
                }
                return new a(this.f1243a, this.f1244b, this.f1245c, this.f1247e, arrayList2.isEmpty() ? null : (N[]) arrayList2.toArray(new N[arrayList2.size()]), arrayList.isEmpty() ? null : (N[]) arrayList.toArray(new N[arrayList.size()]), this.f1246d, this.f1249g, this.f1250h, this.f1251i, this.f1252j);
            }

            public final void b() {
                if (this.f1251i && this.f1245c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }
        }

        public a(int i9, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i9 != 0 ? IconCompat.d(null, "", i9) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, N[] nArr, N[] nArr2, boolean z9, int i9, boolean z10, boolean z11, boolean z12) {
            this.f1236f = true;
            this.f1232b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.f1239i = iconCompat.f();
            }
            this.f1240j = e.f(charSequence);
            this.f1241k = pendingIntent;
            this.f1231a = bundle == null ? new Bundle() : bundle;
            this.f1233c = nArr;
            this.f1234d = nArr2;
            this.f1235e = z9;
            this.f1237g = i9;
            this.f1236f = z10;
            this.f1238h = z11;
            this.f1242l = z12;
        }

        public PendingIntent a() {
            return this.f1241k;
        }

        public boolean b() {
            return this.f1235e;
        }

        public Bundle c() {
            return this.f1231a;
        }

        public IconCompat d() {
            int i9;
            if (this.f1232b == null && (i9 = this.f1239i) != 0) {
                this.f1232b = IconCompat.d(null, "", i9);
            }
            return this.f1232b;
        }

        public N[] e() {
            return this.f1233c;
        }

        public int f() {
            return this.f1237g;
        }

        public boolean g() {
            return this.f1236f;
        }

        public CharSequence h() {
            return this.f1240j;
        }

        public boolean i() {
            return this.f1242l;
        }

        public boolean j() {
            return this.f1238h;
        }
    }

    /* JADX INFO: renamed from: D.l$b */
    public static class b extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bitmap f1253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IconCompat f1254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f1256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f1257i;

        /* JADX INFO: renamed from: D.l$b$a */
        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* JADX INFO: renamed from: D.l$b$b, reason: collision with other inner class name */
        public static class C0014b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: D.l$b$c */
        public static class c {
            public static void a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, boolean z9) {
                bigPictureStyle.showBigPictureWhenCollapsed(z9);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        @Override // D.AbstractC0529l.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(D.InterfaceC0528k r6) {
            /*
                r5 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                android.app.Notification$BigPictureStyle r1 = new android.app.Notification$BigPictureStyle
                android.app.Notification$Builder r2 = r6.a()
                r1.<init>(r2)
                java.lang.CharSequence r2 = r5.f1308b
                android.app.Notification$BigPictureStyle r1 = r1.setBigContentTitle(r2)
                android.graphics.Bitmap r2 = r5.f1253e
                android.app.Notification$BigPictureStyle r1 = r1.bigPicture(r2)
                boolean r2 = r5.f1255g
                if (r2 == 0) goto L4c
                androidx.core.graphics.drawable.IconCompat r2 = r5.f1254f
                r3 = 0
                if (r2 != 0) goto L24
            L20:
                D.AbstractC0529l.b.a.a(r1, r3)
                goto L4c
            L24:
                r4 = 23
                if (r0 < r4) goto L3c
                boolean r2 = r6 instanceof D.I
                if (r2 == 0) goto L32
                D.I r6 = (D.I) r6
                android.content.Context r3 = r6.f()
            L32:
                androidx.core.graphics.drawable.IconCompat r6 = r5.f1254f
                android.graphics.drawable.Icon r6 = r6.n(r3)
                D.AbstractC0529l.b.C0014b.a(r1, r6)
                goto L4c
            L3c:
                int r6 = r2.h()
                r2 = 1
                if (r6 != r2) goto L20
                androidx.core.graphics.drawable.IconCompat r6 = r5.f1254f
                android.graphics.Bitmap r6 = r6.e()
                D.AbstractC0529l.b.a.a(r1, r6)
            L4c:
                boolean r6 = r5.f1310d
                if (r6 == 0) goto L55
                java.lang.CharSequence r6 = r5.f1309c
                D.AbstractC0529l.b.a.b(r1, r6)
            L55:
                r6 = 31
                if (r0 < r6) goto L63
                boolean r6 = r5.f1257i
                D.AbstractC0529l.b.c.b(r1, r6)
                java.lang.CharSequence r6 = r5.f1256h
                D.AbstractC0529l.b.c.a(r1, r6)
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0529l.b.b(D.k):void");
        }

        @Override // D.AbstractC0529l.h
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f1254f = bitmap == null ? null : IconCompat.c(bitmap);
            this.f1255g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f1253e = bitmap;
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f1309c = e.f(charSequence);
            this.f1310d = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: D.l$c */
    public static class c extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f1258e;

        @Override // D.AbstractC0529l.h
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // D.AbstractC0529l.h
        public void b(InterfaceC0528k interfaceC0528k) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC0528k.a()).setBigContentTitle(this.f1308b).bigText(this.f1258e);
            if (this.f1310d) {
                bigTextStyleBigText.setSummaryText(this.f1309c);
            }
        }

        @Override // D.AbstractC0529l.h
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f1258e = e.f(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: D.l$d */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D.l$e */
    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public boolean f1259A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f1260B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public String f1261C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public Bundle f1262D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f1263E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f1264F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public Notification f1265G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public RemoteViews f1266H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public RemoteViews f1267I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public RemoteViews f1268J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public String f1269K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f1270L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f1271M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public long f1272N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f1273O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f1274P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public boolean f1275Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public Notification f1276R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public boolean f1277S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public Icon f1278T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public ArrayList f1279U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f1280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f1281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f1282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f1283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f1284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f1285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PendingIntent f1286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f1287h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public RemoteViews f1288i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Bitmap f1289j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f1290k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1291l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1292m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f1293n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f1294o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public h f1295p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public CharSequence f1296q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public CharSequence f1297r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence[] f1298s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1299t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1300u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f1301v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f1302w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f1303x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f1304y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f1305z;

        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f1281b = new ArrayList();
            this.f1282c = new ArrayList();
            this.f1283d = new ArrayList();
            this.f1293n = true;
            this.f1305z = false;
            this.f1263E = 0;
            this.f1264F = 0;
            this.f1270L = 0;
            this.f1273O = 0;
            this.f1274P = 0;
            Notification notification = new Notification();
            this.f1276R = notification;
            this.f1280a = context;
            this.f1269K = str;
            notification.when = System.currentTimeMillis();
            this.f1276R.audioStreamType = -1;
            this.f1292m = 0;
            this.f1279U = new ArrayList();
            this.f1275Q = true;
        }

        public static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i9) {
            this.f1292m = i9;
            return this;
        }

        public e B(int i9, int i10, boolean z9) {
            this.f1299t = i9;
            this.f1300u = i10;
            this.f1301v = z9;
            return this;
        }

        public e C(boolean z9) {
            this.f1293n = z9;
            return this;
        }

        public e D(int i9) {
            this.f1276R.icon = i9;
            return this;
        }

        public e E(Uri uri) {
            Notification notification = this.f1276R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        public e F(h hVar) {
            if (this.f1295p != hVar) {
                this.f1295p = hVar;
                if (hVar != null) {
                    hVar.g(this);
                }
            }
            return this;
        }

        public e G(CharSequence charSequence) {
            this.f1276R.tickerText = f(charSequence);
            return this;
        }

        public e H(long[] jArr) {
            this.f1276R.vibrate = jArr;
            return this;
        }

        public e I(int i9) {
            this.f1264F = i9;
            return this;
        }

        public e J(long j9) {
            this.f1276R.when = j9;
            return this;
        }

        public e a(int i9, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1281b.add(new a(i9, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f1281b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new I(this).c();
        }

        public e d(f fVar) {
            fVar.a(this);
            return this;
        }

        public Bundle e() {
            if (this.f1262D == null) {
                this.f1262D = new Bundle();
            }
            return this.f1262D;
        }

        public final Bitmap g(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1280a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C.b.f780b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C.b.f779a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
        }

        public e h(boolean z9) {
            q(16, z9);
            return this;
        }

        public e i(String str) {
            this.f1269K = str;
            return this;
        }

        public e j(int i9) {
            this.f1263E = i9;
            return this;
        }

        public e k(RemoteViews remoteViews) {
            this.f1276R.contentView = remoteViews;
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.f1286g = pendingIntent;
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f1285f = f(charSequence);
            return this;
        }

        public e n(CharSequence charSequence) {
            this.f1284e = f(charSequence);
            return this;
        }

        public e o(int i9) {
            Notification notification = this.f1276R;
            notification.defaults = i9;
            if ((i9 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e p(PendingIntent pendingIntent) {
            this.f1276R.deleteIntent = pendingIntent;
            return this;
        }

        public final void q(int i9, boolean z9) {
            Notification notification;
            int i10;
            if (z9) {
                notification = this.f1276R;
                i10 = i9 | notification.flags;
            } else {
                notification = this.f1276R;
                i10 = (~i9) & notification.flags;
            }
            notification.flags = i10;
        }

        public e r(String str) {
            this.f1302w = str;
            return this;
        }

        public e s(int i9) {
            this.f1273O = i9;
            return this;
        }

        public e t(boolean z9) {
            this.f1303x = z9;
            return this;
        }

        public e u(Bitmap bitmap) {
            this.f1289j = g(bitmap);
            return this;
        }

        public e v(int i9, int i10, int i11) {
            Notification notification = this.f1276R;
            notification.ledARGB = i9;
            notification.ledOnMS = i10;
            notification.ledOffMS = i11;
            notification.flags = ((i10 == 0 || i11 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e w(boolean z9) {
            this.f1305z = z9;
            return this;
        }

        public e x(int i9) {
            this.f1291l = i9;
            return this;
        }

        public e y(boolean z9) {
            q(2, z9);
            return this;
        }

        public e z(boolean z9) {
            q(8, z9);
            return this;
        }
    }

    /* JADX INFO: renamed from: D.l$f */
    public interface f {
        e a(e eVar);
    }

    /* JADX INFO: renamed from: D.l$g */
    public static class g extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList f1306e = new ArrayList();

        @Override // D.AbstractC0529l.h
        public void b(InterfaceC0528k interfaceC0528k) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC0528k.a()).setBigContentTitle(this.f1308b);
            if (this.f1310d) {
                bigContentTitle.setSummaryText(this.f1309c);
            }
            Iterator it = this.f1306e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // D.AbstractC0529l.h
        public String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public g h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f1306e.add(e.f(charSequence));
            }
            return this;
        }

        public g i(CharSequence charSequence) {
            this.f1308b = e.f(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: D.l$h */
    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f1307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f1308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f1309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1310d = false;

        public void a(Bundle bundle) {
            if (this.f1310d) {
                bundle.putCharSequence("android.summaryText", this.f1309c);
            }
            CharSequence charSequence = this.f1308b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(InterfaceC0528k interfaceC0528k);

        public String c() {
            return null;
        }

        public RemoteViews d(InterfaceC0528k interfaceC0528k) {
            return null;
        }

        public RemoteViews e(InterfaceC0528k interfaceC0528k) {
            return null;
        }

        public RemoteViews f(InterfaceC0528k interfaceC0528k) {
            return null;
        }

        public void g(e eVar) {
            if (this.f1307a != eVar) {
                this.f1307a = eVar;
                if (eVar != null) {
                    eVar.F(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static boolean b(Notification notification) {
        return (notification.flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0;
    }
}
