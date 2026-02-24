package q7;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: q7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2625i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f48397a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f48399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f48400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f48401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DatabaseHandler f48402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f48403h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public File f48406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public File f48407l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f48414s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48408m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f48409n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48410o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f48411p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f48412q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f48413r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f48415t = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f48404i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f48405j = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f48398c = new ArrayList();

    /* JADX INFO: renamed from: q7.i$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f48416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f48417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f48418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f48419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f48420e;
    }

    public C2625i(Context context, List list) {
        this.f48399d = list;
        this.f48397a = list;
        this.f48401f = context;
        this.f48400e = LayoutInflater.from(context);
        this.f48402g = new DatabaseHandler(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f48399d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        return this.f48399d.get(i9);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0487 A[Catch: all -> 0x0238, Exception -> 0x023c, TryCatch #5 {Exception -> 0x023c, all -> 0x0238, blocks: (B:60:0x0211, B:63:0x0221, B:64:0x0227, B:148:0x046a, B:150:0x0487, B:151:0x04d2, B:153:0x04e2, B:154:0x04f3, B:155:0x04f8, B:157:0x0506, B:159:0x0516, B:161:0x0524, B:163:0x052c, B:164:0x053e, B:166:0x0546, B:167:0x0557, B:169:0x0563, B:171:0x056b, B:173:0x057b, B:174:0x0598, B:175:0x05ab, B:69:0x0240, B:71:0x024e, B:72:0x0255, B:74:0x0263, B:75:0x026a, B:78:0x0294, B:80:0x02a2, B:82:0x02b0, B:84:0x02be, B:86:0x02cc, B:88:0x02da, B:90:0x02e8, B:92:0x02f6, B:94:0x0304, B:96:0x0312, B:97:0x0318, B:98:0x031f, B:100:0x032d, B:101:0x0334, B:103:0x0346, B:106:0x0358, B:108:0x0366, B:111:0x0376, B:113:0x0384, B:115:0x0392, B:117:0x03a0, B:119:0x03ae, B:121:0x03bc, B:123:0x03ca, B:126:0x03da, B:128:0x03e2, B:130:0x03f0, B:132:0x03fe, B:134:0x040c, B:136:0x041a, B:138:0x0428, B:140:0x0436, B:142:0x0444, B:143:0x044a, B:144:0x044e, B:145:0x0455, B:146:0x045c, B:147:0x0463), top: B:185:0x0211 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d2 A[Catch: all -> 0x0238, Exception -> 0x023c, TryCatch #5 {Exception -> 0x023c, all -> 0x0238, blocks: (B:60:0x0211, B:63:0x0221, B:64:0x0227, B:148:0x046a, B:150:0x0487, B:151:0x04d2, B:153:0x04e2, B:154:0x04f3, B:155:0x04f8, B:157:0x0506, B:159:0x0516, B:161:0x0524, B:163:0x052c, B:164:0x053e, B:166:0x0546, B:167:0x0557, B:169:0x0563, B:171:0x056b, B:173:0x057b, B:174:0x0598, B:175:0x05ab, B:69:0x0240, B:71:0x024e, B:72:0x0255, B:74:0x0263, B:75:0x026a, B:78:0x0294, B:80:0x02a2, B:82:0x02b0, B:84:0x02be, B:86:0x02cc, B:88:0x02da, B:90:0x02e8, B:92:0x02f6, B:94:0x0304, B:96:0x0312, B:97:0x0318, B:98:0x031f, B:100:0x032d, B:101:0x0334, B:103:0x0346, B:106:0x0358, B:108:0x0366, B:111:0x0376, B:113:0x0384, B:115:0x0392, B:117:0x03a0, B:119:0x03ae, B:121:0x03bc, B:123:0x03ca, B:126:0x03da, B:128:0x03e2, B:130:0x03f0, B:132:0x03fe, B:134:0x040c, B:136:0x041a, B:138:0x0428, B:140:0x0436, B:142:0x0444, B:143:0x044a, B:144:0x044e, B:145:0x0455, B:146:0x045c, B:147:0x0463), top: B:185:0x0211 }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instruction units count: 1475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2625i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
