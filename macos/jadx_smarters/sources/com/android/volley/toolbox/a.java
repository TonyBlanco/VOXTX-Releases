package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import h1.n;
import h1.o;
import h1.p;
import h1.u;
import i1.i;
import i1.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f18492a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f18494c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f18498g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18493b = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18495d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f18496e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f18497f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.android.volley.toolbox.a$a, reason: collision with other inner class name */
    public class C0237a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f18499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f18500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18501c;

        public C0237a(int i9, ImageView imageView, int i10) {
            this.f18499a = i9;
            this.f18500b = imageView;
            this.f18501c = i10;
        }

        @Override // h1.p.a
        public void a(u uVar) {
            int i9 = this.f18499a;
            if (i9 != 0) {
                this.f18500b.setImageResource(i9);
            }
        }

        @Override // com.android.volley.toolbox.a.h
        public void b(g gVar, boolean z9) {
            if (gVar.d() != null) {
                this.f18500b.setImageBitmap(gVar.d());
                return;
            }
            int i9 = this.f18501c;
            if (i9 != 0) {
                this.f18500b.setImageResource(i9);
            }
        }
    }

    public class b implements p.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18502a;

        public b(String str) {
            this.f18502a = str;
        }

        @Override // h1.p.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            a.this.l(this.f18502a, bitmap);
        }
    }

    public class c implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18504a;

        public c(String str) {
            this.f18504a = str;
        }

        @Override // h1.p.a
        public void a(u uVar) {
            a.this.k(this.f18504a, uVar);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : a.this.f18496e.values()) {
                for (g gVar : eVar.f18510d) {
                    if (gVar.f18512b != null) {
                        if (eVar.e() == null) {
                            gVar.f18511a = eVar.f18508b;
                            gVar.f18512b.b(gVar, false);
                        } else {
                            gVar.f18512b.a(eVar.e());
                        }
                    }
                }
            }
            a.this.f18496e.clear();
            a.this.f18498g = null;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f18507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f18508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f18509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f18510d;

        public e(n nVar, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f18510d = arrayList;
            this.f18507a = nVar;
            arrayList.add(gVar);
        }

        public void d(g gVar) {
            this.f18510d.add(gVar);
        }

        public u e() {
            return this.f18509c;
        }

        public boolean f(g gVar) {
            this.f18510d.remove(gVar);
            if (this.f18510d.size() != 0) {
                return false;
            }
            this.f18507a.h();
            return true;
        }

        public void g(u uVar) {
            this.f18509c = uVar;
        }
    }

    public interface f {
        void a(String str, Bitmap bitmap);

        Bitmap b(String str);
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f18511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f18512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f18514d;

        public g(Bitmap bitmap, String str, String str2, h hVar) {
            this.f18511a = bitmap;
            this.f18514d = str;
            this.f18513c = str2;
            this.f18512b = hVar;
        }

        public void c() {
            HashMap map;
            l.a();
            if (this.f18512b == null) {
                return;
            }
            e eVar = (e) a.this.f18495d.get(this.f18513c);
            if (eVar == null) {
                e eVar2 = (e) a.this.f18496e.get(this.f18513c);
                if (eVar2 == null) {
                    return;
                }
                eVar2.f(this);
                if (eVar2.f18510d.size() != 0) {
                    return;
                } else {
                    map = a.this.f18496e;
                }
            } else if (!eVar.f(this)) {
                return;
            } else {
                map = a.this.f18495d;
            }
            map.remove(this.f18513c);
        }

        public Bitmap d() {
            return this.f18511a;
        }

        public String e() {
            return this.f18514d;
        }
    }

    public interface h extends p.a {
        void b(g gVar, boolean z9);
    }

    public a(o oVar, f fVar) {
        this.f18492a = oVar;
        this.f18494c = fVar;
    }

    public static String h(String str, int i9, int i10, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i9);
        sb.append("#H");
        sb.append(i10);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    public static h i(ImageView imageView, int i9, int i10) {
        return new C0237a(i10, imageView, i9);
    }

    public final void d(String str, e eVar) {
        this.f18496e.put(str, eVar);
        if (this.f18498g == null) {
            d dVar = new d();
            this.f18498g = dVar;
            this.f18497f.postDelayed(dVar, this.f18493b);
        }
    }

    public g e(String str, h hVar) {
        return f(str, hVar, 0, 0);
    }

    public g f(String str, h hVar, int i9, int i10) {
        return g(str, hVar, i9, i10, ImageView.ScaleType.CENTER_INSIDE);
    }

    public g g(String str, h hVar, int i9, int i10, ImageView.ScaleType scaleType) {
        l.a();
        String strH = h(str, i9, i10, scaleType);
        Bitmap bitmapB = this.f18494c.b(strH);
        if (bitmapB != null) {
            g gVar = new g(bitmapB, str, null, null);
            hVar.b(gVar, true);
            return gVar;
        }
        g gVar2 = new g(null, str, strH, hVar);
        hVar.b(gVar2, true);
        e eVar = (e) this.f18495d.get(strH);
        if (eVar == null) {
            eVar = (e) this.f18496e.get(strH);
        }
        if (eVar != null) {
            eVar.d(gVar2);
            return gVar2;
        }
        n nVarJ = j(str, i9, i10, scaleType, strH);
        this.f18492a.a(nVarJ);
        this.f18495d.put(strH, new e(nVarJ, gVar2));
        return gVar2;
    }

    public n j(String str, int i9, int i10, ImageView.ScaleType scaleType, String str2) {
        return new i(str, new b(str2), i9, i10, scaleType, Bitmap.Config.RGB_565, new c(str2));
    }

    public void k(String str, u uVar) {
        e eVar = (e) this.f18495d.remove(str);
        if (eVar != null) {
            eVar.g(uVar);
            d(str, eVar);
        }
    }

    public void l(String str, Bitmap bitmap) {
        this.f18494c.a(str, bitmap);
        e eVar = (e) this.f18495d.remove(str);
        if (eVar != null) {
            eVar.f18508b = bitmap;
            d(str, eVar);
        }
    }
}
