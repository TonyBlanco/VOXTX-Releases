package N0;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSetObservable f5287a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSetObserver f5288b;

    public abstract void a(ViewGroup viewGroup, int i9, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public abstract int c();

    public int d(Object obj) {
        return -1;
    }

    public CharSequence e(int i9) {
        return null;
    }

    public float f(int i9) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i9);

    public abstract boolean h(View view, Object obj);

    public void i(DataSetObserver dataSetObserver) {
        this.f5287a.registerObserver(dataSetObserver);
    }

    public abstract void j(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable k();

    public abstract void l(ViewGroup viewGroup, int i9, Object obj);

    public void m(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f5288b = dataSetObserver;
        }
    }

    public abstract void n(ViewGroup viewGroup);

    public void o(DataSetObserver dataSetObserver) {
        this.f5287a.unregisterObserver(dataSetObserver);
    }
}
