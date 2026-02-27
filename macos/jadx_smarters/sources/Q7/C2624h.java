package q7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import java.util.List;

/* JADX INFO: renamed from: q7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2624h extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f48370a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f48371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f48372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f48373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DatabaseHandler f48374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f48375g;

    /* JADX INFO: renamed from: q7.h$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f48376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f48377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f48378c;
    }

    public C2624h(Context context, List list) {
        this.f48371c = list;
        this.f48370a = list;
        this.f48373e = context;
        this.f48372d = LayoutInflater.from(context);
        this.f48374f = new DatabaseHandler(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f48371c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        return this.f48371c.get(i9);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public View getView(int i9, View view, ViewGroup viewGroup) {
        ImageView imageView;
        int i10;
        if (view == null) {
            try {
                view = ((LayoutInflater) this.f48373e.getSystemService("layout_inflater")).inflate(a7.g.f12887u4, (ViewGroup) null);
                a aVar = new a();
                this.f48375g = aVar;
                aVar.f48376a = (TextView) view.findViewById(a7.f.f12173I6);
                this.f48375g.f48377b = (ImageView) view.findViewById(a7.f.Xj);
                this.f48375g.f48378c = (LinearLayout) view.findViewById(a7.f.f12165H8);
                view.setTag(this.f48375g);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else {
            this.f48375g = (a) view.getTag();
        }
        try {
            if (((String) this.f48371c.get(i9)).endsWith(".m3u") || ((String) this.f48371c.get(i9)).endsWith(".m3u8")) {
                imageView = this.f48375g.f48377b;
                i10 = a7.e.f11962T0;
            } else {
                imageView = this.f48375g.f48377b;
                i10 = a7.e.f11983a0;
            }
            imageView.setBackgroundResource(i10);
            this.f48375g.f48376a.setText((CharSequence) this.f48371c.get(i9));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return view;
    }
}
