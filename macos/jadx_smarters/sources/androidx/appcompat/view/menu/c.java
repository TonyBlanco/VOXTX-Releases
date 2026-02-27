package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13758a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f13759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f13760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f13761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f13765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f13766j;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13767a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVarV = c.this.f13760d.v();
            if (gVarV != null) {
                ArrayList arrayListZ = c.this.f13760d.z();
                int size = arrayListZ.size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (((g) arrayListZ.get(i9)) == gVarV) {
                        this.f13767a = i9;
                        return;
                    }
                }
            }
            this.f13767a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i9) {
            ArrayList arrayListZ = c.this.f13760d.z();
            int i10 = i9 + c.this.f13762f;
            int i11 = this.f13767a;
            if (i11 >= 0 && i10 >= i11) {
                i10++;
            }
            return (g) arrayListZ.get(i10);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f13760d.z().size() - c.this.f13762f;
            return this.f13767a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i9) {
            return i9;
        }

        @Override // android.widget.Adapter
        public View getView(int i9, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f13759c.inflate(cVar.f13764h, viewGroup, false);
            }
            ((j.a) view).c(getItem(i9), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i9, int i10) {
        this.f13764h = i9;
        this.f13763g = i10;
    }

    public c(Context context, int i9) {
        this(i9, 0);
        this.f13758a = context;
        this.f13759c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f13766j == null) {
            this.f13766j = new a();
        }
        return this.f13766j;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z9) {
        i.a aVar = this.f13765i;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f13765i = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).d(null);
        i.a aVar = this.f13765i;
        if (aVar == null) {
            return true;
        }
        aVar.c(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z9) {
        a aVar = this.f13766j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.f13763g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f13763g
            r0.<init>(r3, r1)
            r2.f13758a = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f13759c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f13758a
            if (r0 == 0) goto L23
            r2.f13758a = r3
            android.view.LayoutInflater r0 = r2.f13759c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f13760d = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f13766j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.i(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    public j j(ViewGroup viewGroup) {
        if (this.f13761e == null) {
            this.f13761e = (ExpandedMenuView) this.f13759c.inflate(c.g.f17883g, viewGroup, false);
            if (this.f13766j == null) {
                this.f13766j = new a();
            }
            this.f13761e.setAdapter((ListAdapter) this.f13766j);
            this.f13761e.setOnItemClickListener(this);
        }
        return this.f13761e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
        this.f13760d.M(this.f13766j.getItem(i9), this, 0);
    }
}
