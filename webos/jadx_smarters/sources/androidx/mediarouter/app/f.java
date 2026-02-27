package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import t0.AbstractC2759b;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static int a(Context context) {
        return !context.getResources().getBoolean(AbstractC2759b.f50487a) ? -1 : -2;
    }

    public static int b(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z9 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z9 ? t0.d.f50501g : t0.d.f50500f, typedValue, true);
        int i9 = typedValue.type;
        if (i9 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i9 != 6) {
                return -2;
            }
            int i10 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i10, i10);
        }
        return (int) fraction;
    }

    public static int c(Context context) {
        if (context.getResources().getBoolean(AbstractC2759b.f50487a)) {
            return b(context);
        }
        return -1;
    }

    public static HashMap d(Context context, ListView listView, ArrayAdapter arrayAdapter) {
        HashMap map = new HashMap();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i9 = 0; i9 < listView.getChildCount(); i9++) {
            map.put(arrayAdapter.getItem(firstVisiblePosition + i9), h(context, listView.getChildAt(i9)));
        }
        return map;
    }

    public static HashMap e(ListView listView, ArrayAdapter arrayAdapter) {
        HashMap map = new HashMap();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i9 = 0; i9 < listView.getChildCount(); i9++) {
            Object item = arrayAdapter.getItem(firstVisiblePosition + i9);
            View childAt = listView.getChildAt(i9);
            map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
        }
        return map;
    }

    public static Set f(List list, List list2) {
        HashSet hashSet = new HashSet(list2);
        hashSet.removeAll(list);
        return hashSet;
    }

    public static Set g(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(list2);
        return hashSet;
    }

    public static BitmapDrawable h(Context context, View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static boolean i(List list, List list2) {
        return new HashSet(list).equals(new HashSet(list2));
    }
}
