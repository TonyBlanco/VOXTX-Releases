package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Arrays;
import java.util.HashMap;
import org.simpleframework.xml.strategy.Name;
import x.e;
import x.h;
import z.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f14359a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f14361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f14362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View[] f14365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f14366i;

    public b(Context context) {
        super(context);
        this.f14359a = new int[32];
        this.f14363f = false;
        this.f14365h = null;
        this.f14366i = new HashMap();
        this.f14361d = context;
        e(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14359a = new int[32];
        this.f14363f = false;
        this.f14365h = null;
        this.f14366i = new HashMap();
        this.f14361d = context;
        e(attributeSet);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f14361d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iD = d(strTrim);
        if (iD != 0) {
            this.f14366i.put(Integer.valueOf(iD), strTrim);
            b(iD);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    public final void b(int i9) {
        if (i9 == getId()) {
            return;
        }
        int i10 = this.f14360c + 1;
        int[] iArr = this.f14359a;
        if (i10 > iArr.length) {
            this.f14359a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f14359a;
        int i11 = this.f14360c;
        iArr2[i11] = i9;
        this.f14360c = i11 + 1;
    }

    public final int c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f14361d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = constraintLayout.getChildAt(i9);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int d(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iC = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iC = ((Integer) objF).intValue();
            }
        }
        if (iC == 0 && constraintLayout != null) {
            iC = c(constraintLayout, str);
        }
        if (iC == 0) {
            try {
                iC = z.c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iC == 0 ? this.f14361d.getResources().getIdentifier(str, Name.MARK, this.f14361d.getPackageName()) : iC;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f52345a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == d.f52405k1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f14364g = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(e eVar, boolean z9);

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f14359a, this.f14360c);
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
        String str;
        int iC;
        if (isInEditMode()) {
            setIds(this.f14364g);
        }
        h hVar = this.f14362e;
        if (hVar == null) {
            return;
        }
        hVar.c();
        for (int i9 = 0; i9 < this.f14360c; i9++) {
            int i10 = this.f14359a[i9];
            View viewH = constraintLayout.h(i10);
            if (viewH == null && (iC = c(constraintLayout, (str = (String) this.f14366i.get(Integer.valueOf(i10))))) != 0) {
                this.f14359a[i9] = iC;
                this.f14366i.put(Integer.valueOf(iC), str);
                viewH = constraintLayout.h(iC);
            }
            if (viewH != null) {
                this.f14362e.b(constraintLayout.i(viewH));
            }
        }
        this.f14362e.a(constraintLayout.f14253d);
    }

    public void k() {
        if (this.f14362e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f14328n0 = (e) this.f14362e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f14364g;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        if (this.f14363f) {
            super.onMeasure(i9, i10);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f14364g = str;
        if (str == null) {
            return;
        }
        int i9 = 0;
        this.f14360c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i9);
            if (iIndexOf == -1) {
                a(str.substring(i9));
                return;
            } else {
                a(str.substring(i9, iIndexOf));
                i9 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f14364g = null;
        this.f14360c = 0;
        for (int i9 : iArr) {
            b(i9);
        }
    }
}
