package K0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s.C2695a;

/* JADX INFO: renamed from: K0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0683n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AbstractC0681l f3550a = new C0671b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal f3551b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList f3552c = new ArrayList();

    /* JADX INFO: renamed from: K0.n$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC0681l f3553a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewGroup f3554c;

        /* JADX INFO: renamed from: K0.n$a$a, reason: collision with other inner class name */
        public class C0056a extends AbstractC0682m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2695a f3555a;

            public C0056a(C2695a c2695a) {
                this.f3555a = c2695a;
            }

            @Override // K0.AbstractC0681l.f
            public void c(AbstractC0681l abstractC0681l) {
                ((ArrayList) this.f3555a.get(a.this.f3554c)).remove(abstractC0681l);
                abstractC0681l.Q(this);
            }
        }

        public a(AbstractC0681l abstractC0681l, ViewGroup viewGroup) {
            this.f3553a = abstractC0681l;
            this.f3554c = viewGroup;
        }

        public final void a() {
            this.f3554c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3554c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!AbstractC0683n.f3552c.remove(this.f3554c)) {
                return true;
            }
            C2695a c2695aC = AbstractC0683n.c();
            ArrayList arrayList = (ArrayList) c2695aC.get(this.f3554c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c2695aC.put(this.f3554c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3553a);
            this.f3553a.b(new C0056a(c2695aC));
            this.f3553a.k(this.f3554c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0681l) it.next()).S(this.f3554c);
                }
            }
            this.f3553a.P(this.f3554c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            AbstractC0683n.f3552c.remove(this.f3554c);
            ArrayList arrayList = (ArrayList) AbstractC0683n.c().get(this.f3554c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0681l) it.next()).S(this.f3554c);
                }
            }
            this.f3553a.l(true);
        }
    }

    public static void a(ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(ViewGroup viewGroup, AbstractC0681l abstractC0681l) {
        if (f3552c.contains(viewGroup) || !P.L.W(viewGroup)) {
            return;
        }
        f3552c.add(viewGroup);
        if (abstractC0681l == null) {
            abstractC0681l = f3550a;
        }
        AbstractC0681l abstractC0681lClone = abstractC0681l.clone();
        e(viewGroup, abstractC0681lClone);
        AbstractC0680k.b(viewGroup, null);
        d(viewGroup, abstractC0681lClone);
    }

    public static C2695a c() {
        C2695a c2695a;
        WeakReference weakReference = (WeakReference) f3551b.get();
        if (weakReference != null && (c2695a = (C2695a) weakReference.get()) != null) {
            return c2695a;
        }
        C2695a c2695a2 = new C2695a();
        f3551b.set(new WeakReference(c2695a2));
        return c2695a2;
    }

    public static void d(ViewGroup viewGroup, AbstractC0681l abstractC0681l) {
        if (abstractC0681l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0681l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void e(ViewGroup viewGroup, AbstractC0681l abstractC0681l) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0681l) it.next()).O(viewGroup);
            }
        }
        if (abstractC0681l != null) {
            abstractC0681l.k(viewGroup, true);
        }
        AbstractC0680k.a(viewGroup);
    }
}
