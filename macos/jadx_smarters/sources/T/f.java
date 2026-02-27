package T;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ListView f9486t;

    public f(ListView listView) {
        super(listView);
        this.f9486t = listView;
    }

    @Override // T.a
    public boolean a(int i9) {
        return false;
    }

    @Override // T.a
    public boolean b(int i9) {
        ListView listView = this.f9486t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (i9 > 0) {
            if (i10 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i9 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // T.a
    public void j(int i9, int i10) {
        g.a(this.f9486t, i10);
    }
}
