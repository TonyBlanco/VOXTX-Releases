package f5;

import android.view.View;
import android.view.ViewGroup;
import f5.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: f5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1776a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40697a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f40698b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f40699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40701e;

    /* JADX INFO: renamed from: f5.a$a, reason: collision with other inner class name */
    public class C0327a implements h.a {
        public C0327a() {
        }

        @Override // f5.h.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h hVar, boolean z9) {
            if (!z9) {
                C1776a c1776a = C1776a.this;
                if (!c1776a.r(hVar, c1776a.f40701e)) {
                    return;
                }
            } else if (!C1776a.this.g(hVar)) {
                return;
            }
            C1776a.this.m();
        }
    }

    /* JADX INFO: renamed from: f5.a$b */
    public interface b {
        void a(Set set);
    }

    public void e(h hVar) {
        this.f40697a.put(Integer.valueOf(hVar.getId()), hVar);
        if (hVar.isChecked()) {
            g(hVar);
        }
        hVar.setInternalOnCheckedChangeListener(new C0327a());
    }

    public void f(int i9) {
        h hVar = (h) this.f40697a.get(Integer.valueOf(i9));
        if (hVar != null && g(hVar)) {
            m();
        }
    }

    public final boolean g(h hVar) {
        int id = hVar.getId();
        if (this.f40698b.contains(Integer.valueOf(id))) {
            return false;
        }
        h hVar2 = (h) this.f40697a.get(Integer.valueOf(k()));
        if (hVar2 != null) {
            r(hVar2, false);
        }
        boolean zAdd = this.f40698b.add(Integer.valueOf(id));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return zAdd;
    }

    public void h() {
        boolean z9 = !this.f40698b.isEmpty();
        Iterator it = this.f40697a.values().iterator();
        while (it.hasNext()) {
            r((h) it.next(), false);
        }
        if (z9) {
            m();
        }
    }

    public Set i() {
        return new HashSet(this.f40698b);
    }

    public List j(ViewGroup viewGroup) {
        Set setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if ((childAt instanceof h) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f40700d || this.f40698b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f40698b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f40700d;
    }

    public final void m() {
        b bVar = this.f40699c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    public void n(h hVar) {
        hVar.setInternalOnCheckedChangeListener(null);
        this.f40697a.remove(Integer.valueOf(hVar.getId()));
        this.f40698b.remove(Integer.valueOf(hVar.getId()));
    }

    public void o(b bVar) {
        this.f40699c = bVar;
    }

    public void p(boolean z9) {
        this.f40701e = z9;
    }

    public void q(boolean z9) {
        if (this.f40700d != z9) {
            this.f40700d = z9;
            h();
        }
    }

    public final boolean r(h hVar, boolean z9) {
        int id = hVar.getId();
        if (!this.f40698b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z9 && this.f40698b.size() == 1 && this.f40698b.contains(Integer.valueOf(id))) {
            hVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f40698b.remove(Integer.valueOf(id));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return zRemove;
    }
}
