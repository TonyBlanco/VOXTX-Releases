package T;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class a {
        public static boolean a(ListView listView, int i9) {
            return listView.canScrollList(i9);
        }

        public static void b(ListView listView, int i9) {
            listView.scrollListBy(i9);
        }
    }

    public static void a(ListView listView, int i9) {
        a.b(listView, i9);
    }
}
