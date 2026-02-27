package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13711a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f13712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f13713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f13714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f13715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i.a f13716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f13719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13720k;

    public a(Context context, int i9, int i10) {
        this.f13711a = context;
        this.f13714e = LayoutInflater.from(context);
        this.f13717h = i9;
        this.f13718i = i10;
    }

    public void a(View view, int i9) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f13719j).addView(view, i9);
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z9) {
        i.a aVar = this.f13716g;
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
        this.f13716g = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        i.a aVar = this.f13716g;
        e eVar = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            eVar = this.f13713d;
        }
        return aVar.c(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z9) {
        ViewGroup viewGroup = (ViewGroup) this.f13719j;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f13713d;
        int i9 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList arrayListE = this.f13713d.E();
            int size = arrayListE.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) arrayListE.get(i11);
                if (q(i10, gVar)) {
                    View childAt = viewGroup.getChildAt(i10);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i10);
                    }
                    i10++;
                }
            }
            i9 = i10;
        }
        while (i9 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i9)) {
                i9++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        this.f13712c = context;
        this.f13715f = LayoutInflater.from(context);
        this.f13713d = eVar;
    }

    public abstract void j(g gVar, j.a aVar);

    public j.a k(ViewGroup viewGroup) {
        return (j.a) this.f13714e.inflate(this.f13718i, viewGroup, false);
    }

    public boolean l(ViewGroup viewGroup, int i9) {
        viewGroup.removeViewAt(i9);
        return true;
    }

    public i.a m() {
        return this.f13716g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        j.a aVarK = view instanceof j.a ? (j.a) view : k(viewGroup);
        j(gVar, aVarK);
        return (View) aVarK;
    }

    public j o(ViewGroup viewGroup) {
        if (this.f13719j == null) {
            j jVar = (j) this.f13714e.inflate(this.f13717h, viewGroup, false);
            this.f13719j = jVar;
            jVar.a(this.f13713d);
            f(true);
        }
        return this.f13719j;
    }

    public void p(int i9) {
        this.f13720k = i9;
    }

    public abstract boolean q(int i9, g gVar);
}
