package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import w0.AbstractC2900a;

/* JADX INFO: loaded from: classes.dex */
public class l extends k implements Iterable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s.j f16413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f16415m;

    public class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16416a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16417c = false;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f16417c = true;
            s.j jVar = l.this.f16413k;
            int i9 = this.f16416a + 1;
            this.f16416a = i9;
            return (k) jVar.n(i9);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16416a + 1 < l.this.f16413k.m();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f16417c) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            ((k) l.this.f16413k.n(this.f16416a)).u(null);
            l.this.f16413k.l(this.f16416a);
            this.f16416a--;
            this.f16417c = false;
        }
    }

    public l(s sVar) {
        super(sVar);
        this.f16413k = new s.j();
    }

    public final k A(int i9) {
        return B(i9, true);
    }

    public final k B(int i9, boolean z9) {
        k kVar = (k) this.f16413k.g(i9);
        if (kVar != null) {
            return kVar;
        }
        if (!z9 || n() == null) {
            return null;
        }
        return n().A(i9);
    }

    public String D() {
        if (this.f16415m == null) {
            this.f16415m = Integer.toString(this.f16414l);
        }
        return this.f16415m;
    }

    public final int E() {
        return this.f16414l;
    }

    public final void F(int i9) {
        if (i9 != i()) {
            this.f16414l = i9;
            this.f16415m = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i9 + " cannot use the same id as the graph " + this);
    }

    @Override // androidx.navigation.k
    public String g() {
        return i() != 0 ? super.g() : "the root navigation";
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a();
    }

    @Override // androidx.navigation.k
    public k.a o(j jVar) {
        k.a aVarO = super.o(jVar);
        Iterator it = iterator();
        while (it.hasNext()) {
            k.a aVarO2 = ((k) it.next()).o(jVar);
            if (aVarO2 != null && (aVarO == null || aVarO2.compareTo(aVarO) > 0)) {
                aVarO = aVarO2;
            }
        }
        return aVarO;
    }

    @Override // androidx.navigation.k
    public void p(Context context, AttributeSet attributeSet) {
        super.p(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2900a.f51584y);
        F(typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51585z, 0));
        this.f16415m = k.h(context, this.f16414l);
        typedArrayObtainAttributes.recycle();
    }

    @Override // androidx.navigation.k
    public String toString() {
        String hexString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        k kVarA = A(E());
        if (kVarA == null) {
            hexString = this.f16415m;
            if (hexString == null) {
                sb.append("0x");
                hexString = Integer.toHexString(this.f16414l);
            }
        } else {
            sb.append("{");
            sb.append(kVarA.toString());
            hexString = "}";
        }
        sb.append(hexString);
        return sb.toString();
    }

    public final void z(k kVar) {
        int i9 = kVar.i();
        if (i9 == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (i9 == i()) {
            throw new IllegalArgumentException("Destination " + kVar + " cannot have the same id as graph " + this);
        }
        k kVar2 = (k) this.f16413k.g(i9);
        if (kVar2 == kVar) {
            return;
        }
        if (kVar.n() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (kVar2 != null) {
            kVar2.u(null);
        }
        kVar.u(this);
        this.f16413k.k(kVar.i(), kVar);
    }
}
