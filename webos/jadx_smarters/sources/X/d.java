package x;

import java.util.HashSet;
import java.util.Iterator;
import w.C2898c;
import w.i;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f51745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f51746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f51747d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w.i f51750g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f51744a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51748e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51749f = -1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51751a;

        static {
            int[] iArr = new int[b.values().length];
            f51751a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51751a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51751a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51751a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51751a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51751a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51751a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f51751a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f51751a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f51745b = eVar;
        this.f51746c = bVar;
    }

    public boolean a(d dVar, int i9, int i10, boolean z9) {
        if (dVar == null) {
            k();
            return true;
        }
        if (!z9 && !j(dVar)) {
            return false;
        }
        this.f51747d = dVar;
        if (dVar.f51744a == null) {
            dVar.f51744a = new HashSet();
        }
        this.f51747d.f51744a.add(this);
        if (i9 > 0) {
            this.f51748e = i9;
        } else {
            this.f51748e = 0;
        }
        this.f51749f = i10;
        return true;
    }

    public int b() {
        d dVar;
        if (this.f51745b.M() == 8) {
            return 0;
        }
        return (this.f51749f <= -1 || (dVar = this.f51747d) == null || dVar.f51745b.M() != 8) ? this.f51748e : this.f51749f;
    }

    public final d c() {
        switch (a.f51751a[this.f51746c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f51745b.f51756D;
            case 3:
                return this.f51745b.f51754B;
            case 4:
                return this.f51745b.f51757E;
            case 5:
                return this.f51745b.f51755C;
            default:
                throw new AssertionError(this.f51746c.name());
        }
    }

    public e d() {
        return this.f51745b;
    }

    public w.i e() {
        return this.f51750g;
    }

    public d f() {
        return this.f51747d;
    }

    public b g() {
        return this.f51746c;
    }

    public boolean h() {
        HashSet hashSet = this.f51744a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).c().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.f51747d != null;
    }

    public boolean j(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarG = dVar.g();
        b bVar = this.f51746c;
        if (bVarG == bVar) {
            return bVar != b.BASELINE || (dVar.d().Q() && d().Q());
        }
        switch (a.f51751a[bVar.ordinal()]) {
            case 1:
                return (bVarG == b.BASELINE || bVarG == b.CENTER_X || bVarG == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z9 = bVarG == b.LEFT || bVarG == b.RIGHT;
                if (dVar.d() instanceof g) {
                    return z9 || bVarG == b.CENTER_X;
                }
                return z9;
            case 4:
            case 5:
                boolean z10 = bVarG == b.TOP || bVarG == b.BOTTOM;
                if (dVar.d() instanceof g) {
                    return z10 || bVarG == b.CENTER_Y;
                }
                return z10;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f51746c.name());
        }
    }

    public void k() {
        HashSet hashSet;
        d dVar = this.f51747d;
        if (dVar != null && (hashSet = dVar.f51744a) != null) {
            hashSet.remove(this);
        }
        this.f51747d = null;
        this.f51748e = 0;
        this.f51749f = -1;
    }

    public void l(C2898c c2898c) {
        w.i iVar = this.f51750g;
        if (iVar == null) {
            this.f51750g = new w.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f51745b.p() + ":" + this.f51746c.toString();
    }
}
