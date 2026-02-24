package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vu extends bi {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final vu f24908B = new vt().v();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f24909C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f24910D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f24911E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f24912F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f24913G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f24914H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f24915I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f24916J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f24917K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f24918L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f24919M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f24920N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f24921O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final SparseArray f24922P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final SparseBooleanArray f24923Q;

    public /* synthetic */ vu(vt vtVar) {
        super(vtVar);
        this.f24909C = vtVar.f24900a;
        this.f24910D = false;
        this.f24911E = vtVar.f24901b;
        this.f24912F = false;
        this.f24913G = vtVar.f24902c;
        this.f24914H = false;
        this.f24915I = false;
        this.f24916J = false;
        this.f24917K = false;
        this.f24918L = vtVar.f24903d;
        this.f24919M = vtVar.f24904e;
        this.f24920N = false;
        this.f24921O = vtVar.f24905f;
        this.f24922P = vtVar.f24906g;
        this.f24923Q = vtVar.f24907h;
    }

    public static vu a(Context context) {
        return new vt(context).v();
    }

    @Deprecated
    public final vv b(int i9, um umVar) {
        Map map = (Map) this.f24922P.get(i9);
        if (map != null) {
            return (vv) map.get(umVar);
        }
        return null;
    }

    public final boolean c(int i9) {
        return this.f24923Q.get(i9);
    }

    @Deprecated
    public final boolean d(int i9, um umVar) {
        Map map = (Map) this.f24922P.get(i9);
        return map != null && map.containsKey(umVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bi
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vu.class == obj.getClass()) {
            vu vuVar = (vu) obj;
            if (super.equals(vuVar) && this.f24909C == vuVar.f24909C && this.f24911E == vuVar.f24911E && this.f24913G == vuVar.f24913G && this.f24918L == vuVar.f24918L && this.f24919M == vuVar.f24919M && this.f24921O == vuVar.f24921O) {
                SparseBooleanArray sparseBooleanArray = this.f24923Q;
                SparseBooleanArray sparseBooleanArray2 = vuVar.f24923Q;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size) {
                            SparseArray sparseArray = this.f24922P;
                            SparseArray sparseArray2 = vuVar.f24922P;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i10);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                um umVar = (um) entry.getKey();
                                                if (!map2.containsKey(umVar) || !cq.V(entry.getValue(), map2.get(umVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i9)) < 0) {
                                break;
                            }
                            i9++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bi
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.f24909C ? 1 : 0)) * 961) + (this.f24911E ? 1 : 0)) * 961) + (this.f24913G ? 1 : 0)) * 28629151) + (this.f24918L ? 1 : 0)) * 31) + (this.f24919M ? 1 : 0)) * 961) + (this.f24921O ? 1 : 0);
    }
}
