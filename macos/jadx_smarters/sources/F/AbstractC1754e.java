package f;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import f.AbstractC1751b;

/* JADX INFO: renamed from: f.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1754e extends AbstractC1751b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f40546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f40547o;

    /* JADX INFO: renamed from: f.e$a */
    public static class a extends AbstractC1751b.d {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int[][] f40548J;

        public a(a aVar, AbstractC1754e abstractC1754e, Resources resources) {
            super(aVar, abstractC1754e, resources);
            if (aVar != null) {
                this.f40548J = aVar.f40548J;
            } else {
                this.f40548J = new int[f()][];
            }
        }

        public int A(int[] iArr) {
            int[][] iArr2 = this.f40548J;
            int iH = h();
            for (int i9 = 0; i9 < iH; i9++) {
                if (StateSet.stateSetMatches(iArr2[i9], iArr)) {
                    return i9;
                }
            }
            return -1;
        }

        @Override // f.AbstractC1751b.d
        public void o(int i9, int i10) {
            super.o(i9, i10);
            int[][] iArr = new int[i10][];
            System.arraycopy(this.f40548J, 0, iArr, 0, i9);
            this.f40548J = iArr;
        }

        @Override // f.AbstractC1751b.d
        public abstract void r();

        public int z(int[] iArr, Drawable drawable) {
            int iA = a(drawable);
            this.f40548J[iA] = iArr;
            return iA;
        }
    }

    public AbstractC1754e(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // f.AbstractC1751b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // f.AbstractC1751b
    public void h(AbstractC1751b.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.f40546n = (a) dVar;
        }
    }

    public int[] j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i9 = 0;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i10);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i11 = i9 + 1;
                if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i9] = attributeNameResource;
                i9 = i11;
            }
        }
        return StateSet.trimStateSet(iArr, i9);
    }

    @Override // f.AbstractC1751b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f40547o && super.mutate() == this) {
            this.f40546n.r();
            this.f40547o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
