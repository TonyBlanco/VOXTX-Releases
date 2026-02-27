package q7;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: q7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2627k extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f48618a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f48620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f48621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f48622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DatabaseHandler f48623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f48624h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48627k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f48628l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48629m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f48630n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48631o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f48632p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f48633q = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f48625i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f48626j = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f48619c = new ArrayList();

    /* JADX INFO: renamed from: q7.k$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f48634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f48635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f48636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f48637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f48638e;
    }

    public C2627k(Context context, List list) {
        this.f48620d = list;
        this.f48618a = list;
        this.f48622f = context;
        this.f48621e = LayoutInflater.from(context);
        this.f48623g = new DatabaseHandler(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f48620d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        return this.f48620d.get(i9);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[Catch: Exception -> 0x00b6, TryCatch #1 {Exception -> 0x00b6, blocks: (B:15:0x0081, B:17:0x00ac, B:18:0x00b2, B:27:0x00d2, B:29:0x00d8, B:31:0x00e2, B:32:0x00e8, B:33:0x00ec, B:34:0x00f5, B:21:0x00b8, B:23:0x00be, B:24:0x00c5, B:26:0x00cb), top: B:40:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: Exception -> 0x00b6, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b6, blocks: (B:15:0x0081, B:17:0x00ac, B:18:0x00b2, B:27:0x00d2, B:29:0x00d8, B:31:0x00e2, B:32:0x00e8, B:33:0x00ec, B:34:0x00f5, B:21:0x00b8, B:23:0x00be, B:24:0x00c5, B:26:0x00cb), top: B:40:0x0081 }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2627k.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
