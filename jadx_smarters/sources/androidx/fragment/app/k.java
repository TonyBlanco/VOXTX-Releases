package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e0.AbstractC1729c;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class k implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f15036a;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f15037a;

        public a(t tVar) {
            this.f15037a = tVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f15037a.k();
            this.f15037a.m();
            C.n((ViewGroup) fragmentK.mView.getParent(), k.this.f15036a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public k(m mVar) {
        this.f15036a = mVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        t tVarV;
        StringBuilder sb;
        String str2;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f15036a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1729c.f40139d);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(AbstractC1729c.f40140e);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC1729c.f40141f, -1);
        String string = typedArrayObtainStyledAttributes.getString(AbstractC1729c.f40142g);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !i.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentG0 = resourceId != -1 ? this.f15036a.g0(resourceId) : null;
        if (fragmentG0 == null && string != null) {
            fragmentG0 = this.f15036a.h0(string);
        }
        if (fragmentG0 == null && id != -1) {
            fragmentG0 = this.f15036a.g0(id);
        }
        if (fragmentG0 == null) {
            fragmentG0 = this.f15036a.q0().a(context.getClassLoader(), attributeValue);
            fragmentG0.mFromLayout = true;
            fragmentG0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentG0.mContainerId = id;
            fragmentG0.mTag = string;
            fragmentG0.mInLayout = true;
            m mVar = this.f15036a;
            fragmentG0.mFragmentManager = mVar;
            fragmentG0.mHost = mVar.t0();
            fragmentG0.onInflate(this.f15036a.t0().f(), attributeSet, fragmentG0.mSavedFragmentState);
            tVarV = this.f15036a.g(fragmentG0);
            if (m.F0(2)) {
                sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragmentG0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        } else {
            if (fragmentG0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentG0.mInLayout = true;
            m mVar2 = this.f15036a;
            fragmentG0.mFragmentManager = mVar2;
            fragmentG0.mHost = mVar2.t0();
            fragmentG0.onInflate(this.f15036a.t0().f(), attributeSet, fragmentG0.mSavedFragmentState);
            tVarV = this.f15036a.v(fragmentG0);
            if (m.F0(2)) {
                sb = new StringBuilder();
                sb.append("Retained Fragment ");
                sb.append(fragmentG0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        }
        fragmentG0.mContainer = (ViewGroup) view;
        tVarV.m();
        tVarV.j();
        View view2 = fragmentG0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentG0.mView.getTag() == null) {
            fragmentG0.mView.setTag(string);
        }
        fragmentG0.mView.addOnAttachStateChangeListener(new a(tVarV));
        return fragmentG0.mView;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
