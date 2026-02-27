package q7;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import java.util.List;

/* JADX INFO: renamed from: q7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2626j extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48572a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f48573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f48574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f48575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f48576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DatabaseHandler f48577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f48578h;

    /* JADX INFO: renamed from: q7.j$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f48579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f48580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f48581c;
    }

    public C2626j(Context context, List list, String str) {
        this.f48574d = list;
        this.f48573c = list;
        this.f48576f = context;
        this.f48575e = LayoutInflater.from(context);
        this.f48577g = new DatabaseHandler(context);
        this.f48572a = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f48574d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        return this.f48574d.get(i9);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:9:0x0051, B:11:0x006c, B:12:0x0072, B:36:0x00f6, B:38:0x00fc, B:40:0x0106, B:41:0x010c, B:42:0x0110, B:43:0x0119, B:15:0x007a, B:17:0x0080, B:19:0x008a, B:21:0x009a, B:24:0x00ab, B:25:0x00b2, B:26:0x00b9, B:28:0x00c9, B:31:0x00da, B:32:0x00e1, B:33:0x00e8, B:35:0x00ee), top: B:47:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119 A[Catch: Exception -> 0x0077, TRY_LEAVE, TryCatch #0 {Exception -> 0x0077, blocks: (B:9:0x0051, B:11:0x006c, B:12:0x0072, B:36:0x00f6, B:38:0x00fc, B:40:0x0106, B:41:0x010c, B:42:0x0110, B:43:0x0119, B:15:0x007a, B:17:0x0080, B:19:0x008a, B:21:0x009a, B:24:0x00ab, B:25:0x00b2, B:26:0x00b9, B:28:0x00c9, B:31:0x00da, B:32:0x00e1, B:33:0x00e8, B:35:0x00ee), top: B:47:0x0051 }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2626j.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
