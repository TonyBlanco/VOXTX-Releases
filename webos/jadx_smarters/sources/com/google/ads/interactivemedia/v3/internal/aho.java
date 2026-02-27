package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class aho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f19781a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f19782b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f19783c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f19784d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet f19785e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet f19786f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f19787g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f19788h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19789i;

    public final View a(String str) {
        return (View) this.f19783c.get(str);
    }

    public final String b(String str) {
        return (String) this.f19787g.get(str);
    }

    public final String c(View view) {
        if (this.f19781a.size() == 0) {
            return null;
        }
        String str = (String) this.f19781a.get(view);
        if (str != null) {
            this.f19781a.remove(view);
        }
        return str;
    }

    public final HashSet d() {
        return this.f19786f;
    }

    public final HashSet e() {
        return this.f19785e;
    }

    public final void f() {
        this.f19781a.clear();
        this.f19782b.clear();
        this.f19783c.clear();
        this.f19784d.clear();
        this.f19785e.clear();
        this.f19786f.clear();
        this.f19787g.clear();
        this.f19789i = false;
    }

    public final void g() {
        this.f19789i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        Boolean bool;
        String str;
        agz agzVarA = agz.a();
        if (agzVarA != null) {
            for (agt agtVar : agzVarA.b()) {
                View viewG = agtVar.g();
                if (agtVar.k()) {
                    String strI = agtVar.i();
                    if (viewG != null) {
                        if (viewG.isAttachedToWindow()) {
                            if (viewG.hasWindowFocus()) {
                                this.f19788h.remove(viewG);
                                bool = Boolean.FALSE;
                            } else if (this.f19788h.containsKey(viewG)) {
                                bool = (Boolean) this.f19788h.get(viewG);
                            } else {
                                Map map = this.f19788h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(viewG, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = viewG;
                                while (true) {
                                    if (view == null) {
                                        this.f19784d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strC = com.google.ads.interactivemedia.v3.impl.data.i.c(view);
                                    if (strC != null) {
                                        str = strC;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f19785e.add(strI);
                            this.f19781a.put(viewG, strI);
                            for (ly lyVar : agtVar.j()) {
                                View view2 = (View) lyVar.j().get();
                                if (view2 != null) {
                                    aeq aeqVar = (aeq) this.f19782b.get(view2);
                                    if (aeqVar != null) {
                                        aeqVar.f(agtVar.i());
                                    } else {
                                        this.f19782b.put(view2, new aeq(lyVar, agtVar.i(), null));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f19786f.add(strI);
                            this.f19783c.put(strI, viewG);
                            this.f19787g.put(strI, str);
                        }
                    } else {
                        this.f19786f.add(strI);
                        this.f19787g.put(strI, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean i(View view) {
        if (!this.f19788h.containsKey(view)) {
            return true;
        }
        this.f19788h.put(view, Boolean.TRUE);
        return false;
    }

    public final int j(View view) {
        if (this.f19784d.contains(view)) {
            return 1;
        }
        return this.f19789i ? 2 : 3;
    }

    public final aeq k(View view) {
        aeq aeqVar = (aeq) this.f19782b.get(view);
        if (aeqVar != null) {
            this.f19782b.remove(view);
        }
        return aeqVar;
    }
}
