package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class blj extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f21658e = new blc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    bli f21659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f21660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f21661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final bli f21662d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Comparator f21663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ble f21665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private blg f21666i;

    public blj() {
        this(f21658e, true);
    }

    public blj(Comparator comparator, boolean z9) {
        this.f21660b = 0;
        this.f21661c = 0;
        this.f21663f = comparator;
        this.f21664g = z9;
        this.f21662d = new bli(z9);
    }

    public blj(byte[] bArr) {
        this(f21658e, false);
    }

    private final void f(bli bliVar, boolean z9) {
        while (bliVar != null) {
            bli bliVar2 = bliVar.f21650b;
            bli bliVar3 = bliVar.f21651c;
            int i9 = bliVar2 != null ? bliVar2.f21657i : 0;
            int i10 = bliVar3 != null ? bliVar3.f21657i : 0;
            int i11 = i9 - i10;
            if (i11 == -2) {
                bli bliVar4 = bliVar3.f21650b;
                bli bliVar5 = bliVar3.f21651c;
                int i12 = (bliVar4 != null ? bliVar4.f21657i : 0) - (bliVar5 != null ? bliVar5.f21657i : 0);
                if (i12 != -1 && (i12 != 0 || z9)) {
                    i(bliVar3);
                }
                h(bliVar);
                if (z9) {
                    return;
                }
            } else if (i11 == 2) {
                bli bliVar6 = bliVar2.f21650b;
                bli bliVar7 = bliVar2.f21651c;
                int i13 = (bliVar6 != null ? bliVar6.f21657i : 0) - (bliVar7 != null ? bliVar7.f21657i : 0);
                if (i13 != 1 && (i13 != 0 || z9)) {
                    h(bliVar2);
                }
                i(bliVar);
                if (z9) {
                    return;
                }
            } else if (i11 == 0) {
                bliVar.f21657i = i9 + 1;
                if (z9) {
                    return;
                }
            } else {
                bliVar.f21657i = Math.max(i9, i10) + 1;
                if (!z9) {
                    return;
                }
            }
            bliVar = bliVar.f21649a;
        }
    }

    private final void g(bli bliVar, bli bliVar2) {
        bli bliVar3 = bliVar.f21649a;
        bliVar.f21649a = null;
        if (bliVar2 != null) {
            bliVar2.f21649a = bliVar3;
        }
        if (bliVar3 == null) {
            this.f21659a = bliVar2;
        } else if (bliVar3.f21650b == bliVar) {
            bliVar3.f21650b = bliVar2;
        } else {
            bliVar3.f21651c = bliVar2;
        }
    }

    private final void h(bli bliVar) {
        bli bliVar2 = bliVar.f21650b;
        bli bliVar3 = bliVar.f21651c;
        bli bliVar4 = bliVar3.f21650b;
        bli bliVar5 = bliVar3.f21651c;
        bliVar.f21651c = bliVar4;
        if (bliVar4 != null) {
            bliVar4.f21649a = bliVar;
        }
        g(bliVar, bliVar3);
        bliVar3.f21650b = bliVar;
        bliVar.f21649a = bliVar3;
        int iMax = Math.max(bliVar2 != null ? bliVar2.f21657i : 0, bliVar4 != null ? bliVar4.f21657i : 0) + 1;
        bliVar.f21657i = iMax;
        bliVar3.f21657i = Math.max(iMax, bliVar5 != null ? bliVar5.f21657i : 0) + 1;
    }

    private final void i(bli bliVar) {
        bli bliVar2 = bliVar.f21650b;
        bli bliVar3 = bliVar.f21651c;
        bli bliVar4 = bliVar2.f21650b;
        bli bliVar5 = bliVar2.f21651c;
        bliVar.f21650b = bliVar5;
        if (bliVar5 != null) {
            bliVar5.f21649a = bliVar;
        }
        g(bliVar, bliVar2);
        bliVar2.f21651c = bliVar;
        bliVar.f21649a = bliVar2;
        int iMax = Math.max(bliVar3 != null ? bliVar3.f21657i : 0, bliVar5 != null ? bliVar5.f21657i : 0) + 1;
        bliVar.f21657i = iMax;
        bliVar2.f21657i = Math.max(iMax, bliVar4 != null ? bliVar4.f21657i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final bli a(Object obj, boolean z9) {
        int iCompareTo;
        bli bliVar;
        Comparator comparator = this.f21663f;
        bli bliVar2 = this.f21659a;
        if (bliVar2 != null) {
            Comparable comparable = comparator == f21658e ? (Comparable) obj : null;
            while (true) {
                Object obj2 = bliVar2.f21654f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return bliVar2;
                }
                bli bliVar3 = iCompareTo < 0 ? bliVar2.f21650b : bliVar2.f21651c;
                if (bliVar3 == null) {
                    break;
                }
                bliVar2 = bliVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z9) {
            return null;
        }
        bli bliVar4 = this.f21662d;
        if (bliVar2 != null) {
            bliVar = new bli(this.f21664g, bliVar2, obj, bliVar4, bliVar4.f21653e);
            if (iCompareTo < 0) {
                bliVar2.f21650b = bliVar;
            } else {
                bliVar2.f21651c = bliVar;
            }
            f(bliVar2, true);
        } else {
            if (comparator == f21658e && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            bliVar = new bli(this.f21664g, null, obj, bliVar4, bliVar4.f21653e);
            this.f21659a = bliVar;
        }
        this.f21660b++;
        this.f21661c++;
        return bliVar;
    }

    public final bli b(Map.Entry entry) {
        bli bliVarC = c(entry.getKey());
        if (bliVarC == null) {
            return null;
        }
        Object obj = bliVarC.f21656h;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return bliVarC;
        }
        return null;
    }

    public final bli c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f21659a = null;
        this.f21660b = 0;
        this.f21661c++;
        bli bliVar = this.f21662d;
        bliVar.f21653e = bliVar;
        bliVar.f21652d = bliVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final bli d(Object obj) {
        bli bliVarC = c(obj);
        if (bliVarC != null) {
            e(bliVarC, true);
        }
        return bliVarC;
    }

    public final void e(bli bliVar, boolean z9) {
        bli bliVar2;
        bli bliVar3;
        int i9;
        if (z9) {
            bli bliVar4 = bliVar.f21653e;
            bliVar4.f21652d = bliVar.f21652d;
            bliVar.f21652d.f21653e = bliVar4;
        }
        bli bliVar5 = bliVar.f21650b;
        bli bliVar6 = bliVar.f21651c;
        bli bliVar7 = bliVar.f21649a;
        int i10 = 0;
        if (bliVar5 == null || bliVar6 == null) {
            if (bliVar5 != null) {
                g(bliVar, bliVar5);
                bliVar.f21650b = null;
            } else if (bliVar6 != null) {
                g(bliVar, bliVar6);
                bliVar.f21651c = null;
            } else {
                g(bliVar, null);
            }
            f(bliVar7, false);
            this.f21660b--;
            this.f21661c++;
            return;
        }
        if (bliVar5.f21657i > bliVar6.f21657i) {
            do {
                bliVar3 = bliVar5;
                bliVar5 = bliVar5.f21651c;
            } while (bliVar5 != null);
        } else {
            do {
                bliVar2 = bliVar6;
                bliVar6 = bliVar6.f21650b;
            } while (bliVar6 != null);
            bliVar3 = bliVar2;
        }
        e(bliVar3, false);
        bli bliVar8 = bliVar.f21650b;
        if (bliVar8 != null) {
            i9 = bliVar8.f21657i;
            bliVar3.f21650b = bliVar8;
            bliVar8.f21649a = bliVar3;
            bliVar.f21650b = null;
        } else {
            i9 = 0;
        }
        bli bliVar9 = bliVar.f21651c;
        if (bliVar9 != null) {
            i10 = bliVar9.f21657i;
            bliVar3.f21651c = bliVar9;
            bliVar9.f21649a = bliVar3;
            bliVar.f21651c = null;
        }
        bliVar3.f21657i = Math.max(i9, i10) + 1;
        g(bliVar, bliVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ble bleVar = this.f21665h;
        if (bleVar != null) {
            return bleVar;
        }
        ble bleVar2 = new ble(this);
        this.f21665h = bleVar2;
        return bleVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        bli bliVarC = c(obj);
        if (bliVarC != null) {
            return bliVarC.f21656h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        blg blgVar = this.f21666i;
        if (blgVar != null) {
            return blgVar;
        }
        blg blgVar2 = new blg(this);
        this.f21666i = blgVar2;
        return blgVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f21664g) {
            throw new NullPointerException("value == null");
        }
        bli bliVarA = a(obj, true);
        Object obj3 = bliVarA.f21656h;
        bliVarA.f21656h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        bli bliVarD = d(obj);
        if (bliVarD != null) {
            return bliVarD.f21656h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21660b;
    }
}
