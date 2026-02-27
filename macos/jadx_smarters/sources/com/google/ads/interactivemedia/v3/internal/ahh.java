package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ahh implements ahg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19767b;

    public ahh(int i9) {
        this.f19766a = i9;
        this.f19767b = new int[2];
    }

    public ahh(ahg ahgVar, int i9) {
        this.f19766a = i9;
        this.f19767b = ahgVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahg
    public final JSONObject a(View view) {
        if (this.f19766a == 0 && view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            view.getLocationOnScreen((int[]) this.f19767b);
            int[] iArr = (int[]) this.f19767b;
            return ahn.b(iArr[0], iArr[1], width, height);
        }
        return ahn.b(0, 0, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.ads.interactivemedia.v3.internal.ahg, java.lang.Object] */
    @Override // com.google.ads.interactivemedia.v3.internal.ahg
    public final void b(View view, JSONObject jSONObject, ahf ahfVar, boolean z9, boolean z10) {
        int i9;
        int i10 = 0;
        if (this.f19766a == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z9) {
                    while (i10 < viewGroup.getChildCount()) {
                        ahfVar.a(viewGroup.getChildAt(i10), this, jSONObject, z10);
                        i10++;
                    }
                    return;
                }
                HashMap map = new HashMap();
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(map.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i12));
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (true) {
                        i9 = i12 + 1;
                        if (i13 < size2) {
                            ahfVar.a((View) arrayList3.get(i13), this, jSONObject, z10);
                            i13++;
                        }
                    }
                    i12 = i9;
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        agz agzVarA = agz.a();
        if (agzVarA != null) {
            Collection collectionB = agzVarA.b();
            int size3 = collectionB.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size3 + size3 + 3);
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                View viewG = ((agt) it.next()).g();
                if (viewG != null && viewG.isAttachedToWindow() && viewG.isShown()) {
                    View view2 = viewG;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewG.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float fB = com.google.ads.interactivemedia.v3.impl.data.i.b(rootView);
                                int size4 = arrayList4.size();
                                while (size4 > 0) {
                                    int i14 = size4 - 1;
                                    if (com.google.ads.interactivemedia.v3.impl.data.i.b((View) arrayList4.get(i14)) <= fB) {
                                        break;
                                    } else {
                                        size4 = i14;
                                    }
                                }
                                arrayList4.add(size4, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size5 = arrayList4.size();
        while (i10 < size5) {
            ahfVar.a((View) arrayList4.get(i10), this.f19767b, jSONObject, z10);
            i10++;
        }
    }
}
