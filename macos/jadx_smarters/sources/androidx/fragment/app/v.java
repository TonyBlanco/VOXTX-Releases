package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.amazonaws.services.s3.internal.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15157a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15158b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f15159c;

    public void a(Fragment fragment) {
        if (this.f15157a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f15157a) {
            this.f15157a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f15158b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f15158b.get(str) != null;
    }

    public void d(int i9) {
        for (t tVar : this.f15158b.values()) {
            if (tVar != null) {
                tVar.u(i9);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f15158b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t tVar : this.f15158b.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment fragmentK = tVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(Constants.NULL_VERSION_ID);
                }
            }
        }
        int size = this.f15157a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i9 = 0; i9 < size; i9++) {
                Fragment fragment = (Fragment) this.f15157a.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    public Fragment f(String str) {
        t tVar = (t) this.f15158b.get(str);
        if (tVar != null) {
            return tVar.k();
        }
        return null;
    }

    public Fragment g(int i9) {
        for (int size = this.f15157a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f15157a.get(size);
            if (fragment != null && fragment.mFragmentId == i9) {
                return fragment;
            }
        }
        for (t tVar : this.f15158b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (fragmentK.mFragmentId == i9) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f15157a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f15157a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (t tVar : this.f15158b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (t tVar : this.f15158b.values()) {
            if (tVar != null && (fragmentFindFragmentByWho = tVar.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f15157a.indexOf(fragment);
        for (int i9 = iIndexOf - 1; i9 >= 0; i9--) {
            Fragment fragment2 = (Fragment) this.f15157a.get(i9);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f15157a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f15157a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f15158b.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f15158b.values()) {
            arrayList.add(tVar != null ? tVar.k() : null);
        }
        return arrayList;
    }

    public t m(String str) {
        return (t) this.f15158b.get(str);
    }

    public List n() {
        ArrayList arrayList;
        if (this.f15157a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f15157a) {
            arrayList = new ArrayList(this.f15157a);
        }
        return arrayList;
    }

    public p o() {
        return this.f15159c;
    }

    public void p(t tVar) {
        Fragment fragmentK = tVar.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f15158b.put(fragmentK.mWho, tVar);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f15159c.b(fragmentK);
            } else {
                this.f15159c.j(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (m.F0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    public void q(t tVar) {
        Fragment fragmentK = tVar.k();
        if (fragmentK.mRetainInstance) {
            this.f15159c.j(fragmentK);
        }
        if (((t) this.f15158b.put(fragmentK.mWho, null)) != null && m.F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    public void r() {
        Iterator it = this.f15157a.iterator();
        while (it.hasNext()) {
            t tVar = (t) this.f15158b.get(((Fragment) it.next()).mWho);
            if (tVar != null) {
                tVar.m();
            }
        }
        for (t tVar2 : this.f15158b.values()) {
            if (tVar2 != null) {
                tVar2.m();
                Fragment fragmentK = tVar2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    q(tVar2);
                }
            }
        }
    }

    public void s(Fragment fragment) {
        synchronized (this.f15157a) {
            this.f15157a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void t() {
        this.f15158b.clear();
    }

    public void u(List list) {
        this.f15157a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (m.F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    public ArrayList v() {
        ArrayList arrayList = new ArrayList(this.f15158b.size());
        for (t tVar : this.f15158b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                s sVarS = tVar.s();
                arrayList.add(sVarS);
                if (m.F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + sVarS.f15141n);
                }
            }
        }
        return arrayList;
    }

    public ArrayList w() {
        synchronized (this.f15157a) {
            try {
                if (this.f15157a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f15157a.size());
                for (Fragment fragment : this.f15157a) {
                    arrayList.add(fragment.mWho);
                    if (m.F0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(p pVar) {
        this.f15159c = pVar;
    }
}
