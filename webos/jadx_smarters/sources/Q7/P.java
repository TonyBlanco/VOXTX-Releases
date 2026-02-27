package q7;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.StalkerLiveFavIdsSingleton;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class P extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47350a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f47351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f47352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f47353e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f47355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DatabaseHandler f47356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LiveStreamDBHandler f47357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f47358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47359k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2858a f47361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f47363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f47364p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f47354f = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f47360l = false;

    public class b extends Filter {
        public b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = P.this.f47351c;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) arrayList.get(i9);
                if (liveStreamsDBModel.getName().toLowerCase().contains(lowerCase) || liveStreamsDBModel.getNum().contains(lowerCase)) {
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                P.this.f47352d = (ArrayList) filterResults.values;
                P.this.notifyDataSetChanged();
                if (P.this.f47352d == null || P.this.f47352d.size() != 0) {
                    if (!P.this.f47359k.equals("mobile")) {
                        ((NSTIJKPlayerSkyTvActivity) P.this.f47355g).Q3();
                    }
                } else if (!P.this.f47359k.equals("mobile")) {
                    ((NSTIJKPlayerSkyTvActivity) P.this.f47355g).a4();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f47366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f47367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f47368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f47369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f47370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f47371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ProgressBar f47372g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f47373h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f47374i;
    }

    public P(Context context, ArrayList arrayList) {
        this.f47352d = null;
        this.f47359k = "mobile";
        ArrayList arrayList2 = new ArrayList();
        this.f47352d = arrayList2;
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        this.f47351c = arrayList3;
        arrayList3.addAll(arrayList);
        this.f47364p = VodAllCategoriesSingleton.getInstance().getLiveFavList();
        this.f47355g = context;
        this.f47353e = LayoutInflater.from(context);
        this.f47356h = new DatabaseHandler(context);
        this.f47357i = new LiveStreamDBHandler(context);
        C2858a c2858a = new C2858a(context);
        this.f47361m = c2858a;
        this.f47362n = c2858a.B();
        this.f47363o = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f47359k = "tv";
        } else {
            this.f47359k = "mobile";
        }
    }

    public final void e() {
        this.f47350a = this.f47355g.getSharedPreferences("currentlyPlayingVideo", 0).getString("currentlyPlayingVideo", "");
    }

    public final void f() {
        this.f47350a = this.f47355g.getSharedPreferences("currentlyPlayingVideo", 0).getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
    }

    public ArrayList g() {
        return this.f47352d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f47352d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f47354f;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        try {
            return this.f47352d.get(i9);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0528 A[Catch: Exception -> 0x00b5, TryCatch #7 {Exception -> 0x00b5, blocks: (B:9:0x0099, B:12:0x00a1, B:14:0x00ad, B:15:0x00b1, B:20:0x00c5, B:21:0x00e4, B:22:0x00f0, B:26:0x0107, B:28:0x0116, B:30:0x0124, B:32:0x014c, B:34:0x015e, B:35:0x016e, B:60:0x0203, B:62:0x020e, B:64:0x0226, B:66:0x022e, B:140:0x051a, B:142:0x0528, B:144:0x053a, B:145:0x0566, B:67:0x0243, B:68:0x025a, B:59:0x0200, B:36:0x0172, B:37:0x0183, B:39:0x019f, B:41:0x01b1, B:42:0x01c2, B:69:0x025f, B:71:0x026c, B:73:0x027a, B:75:0x02a2, B:77:0x02b4, B:78:0x02c4, B:86:0x0329, B:88:0x032d, B:90:0x0333, B:92:0x033f, B:96:0x0354, B:98:0x035f, B:100:0x0377, B:102:0x037f, B:103:0x039b, B:93:0x0347, B:94:0x034b, B:95:0x034f, B:79:0x02c8, B:80:0x02d9, B:82:0x02f5, B:84:0x0307, B:85:0x0318, B:104:0x03b4, B:106:0x03c2, B:108:0x03ea, B:110:0x03fc, B:111:0x040c, B:119:0x0471, B:121:0x047c, B:123:0x0494, B:125:0x049c, B:127:0x04d7, B:129:0x04fd, B:134:0x050c, B:126:0x04b7, B:112:0x0410, B:113:0x0421, B:115:0x043d, B:117:0x044f, B:118:0x0460, B:18:0x00b8, B:19:0x00c0, B:44:0x01d3, B:46:0x01e1, B:51:0x01f0), top: B:164:0x0099, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0566 A[Catch: Exception -> 0x00b5, TRY_LEAVE, TryCatch #7 {Exception -> 0x00b5, blocks: (B:9:0x0099, B:12:0x00a1, B:14:0x00ad, B:15:0x00b1, B:20:0x00c5, B:21:0x00e4, B:22:0x00f0, B:26:0x0107, B:28:0x0116, B:30:0x0124, B:32:0x014c, B:34:0x015e, B:35:0x016e, B:60:0x0203, B:62:0x020e, B:64:0x0226, B:66:0x022e, B:140:0x051a, B:142:0x0528, B:144:0x053a, B:145:0x0566, B:67:0x0243, B:68:0x025a, B:59:0x0200, B:36:0x0172, B:37:0x0183, B:39:0x019f, B:41:0x01b1, B:42:0x01c2, B:69:0x025f, B:71:0x026c, B:73:0x027a, B:75:0x02a2, B:77:0x02b4, B:78:0x02c4, B:86:0x0329, B:88:0x032d, B:90:0x0333, B:92:0x033f, B:96:0x0354, B:98:0x035f, B:100:0x0377, B:102:0x037f, B:103:0x039b, B:93:0x0347, B:94:0x034b, B:95:0x034f, B:79:0x02c8, B:80:0x02d9, B:82:0x02f5, B:84:0x0307, B:85:0x0318, B:104:0x03b4, B:106:0x03c2, B:108:0x03ea, B:110:0x03fc, B:111:0x040c, B:119:0x0471, B:121:0x047c, B:123:0x0494, B:125:0x049c, B:127:0x04d7, B:129:0x04fd, B:134:0x050c, B:126:0x04b7, B:112:0x0410, B:113:0x0421, B:115:0x043d, B:117:0x044f, B:118:0x0460, B:18:0x00b8, B:19:0x00c0, B:44:0x01d3, B:46:0x01e1, B:51:0x01f0), top: B:164:0x0099, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116 A[Catch: Exception -> 0x00b5, TryCatch #7 {Exception -> 0x00b5, blocks: (B:9:0x0099, B:12:0x00a1, B:14:0x00ad, B:15:0x00b1, B:20:0x00c5, B:21:0x00e4, B:22:0x00f0, B:26:0x0107, B:28:0x0116, B:30:0x0124, B:32:0x014c, B:34:0x015e, B:35:0x016e, B:60:0x0203, B:62:0x020e, B:64:0x0226, B:66:0x022e, B:140:0x051a, B:142:0x0528, B:144:0x053a, B:145:0x0566, B:67:0x0243, B:68:0x025a, B:59:0x0200, B:36:0x0172, B:37:0x0183, B:39:0x019f, B:41:0x01b1, B:42:0x01c2, B:69:0x025f, B:71:0x026c, B:73:0x027a, B:75:0x02a2, B:77:0x02b4, B:78:0x02c4, B:86:0x0329, B:88:0x032d, B:90:0x0333, B:92:0x033f, B:96:0x0354, B:98:0x035f, B:100:0x0377, B:102:0x037f, B:103:0x039b, B:93:0x0347, B:94:0x034b, B:95:0x034f, B:79:0x02c8, B:80:0x02d9, B:82:0x02f5, B:84:0x0307, B:85:0x0318, B:104:0x03b4, B:106:0x03c2, B:108:0x03ea, B:110:0x03fc, B:111:0x040c, B:119:0x0471, B:121:0x047c, B:123:0x0494, B:125:0x049c, B:127:0x04d7, B:129:0x04fd, B:134:0x050c, B:126:0x04b7, B:112:0x0410, B:113:0x0421, B:115:0x043d, B:117:0x044f, B:118:0x0460, B:18:0x00b8, B:19:0x00c0, B:44:0x01d3, B:46:0x01e1, B:51:0x01f0), top: B:164:0x0099, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025f A[Catch: Exception -> 0x00b5, TryCatch #7 {Exception -> 0x00b5, blocks: (B:9:0x0099, B:12:0x00a1, B:14:0x00ad, B:15:0x00b1, B:20:0x00c5, B:21:0x00e4, B:22:0x00f0, B:26:0x0107, B:28:0x0116, B:30:0x0124, B:32:0x014c, B:34:0x015e, B:35:0x016e, B:60:0x0203, B:62:0x020e, B:64:0x0226, B:66:0x022e, B:140:0x051a, B:142:0x0528, B:144:0x053a, B:145:0x0566, B:67:0x0243, B:68:0x025a, B:59:0x0200, B:36:0x0172, B:37:0x0183, B:39:0x019f, B:41:0x01b1, B:42:0x01c2, B:69:0x025f, B:71:0x026c, B:73:0x027a, B:75:0x02a2, B:77:0x02b4, B:78:0x02c4, B:86:0x0329, B:88:0x032d, B:90:0x0333, B:92:0x033f, B:96:0x0354, B:98:0x035f, B:100:0x0377, B:102:0x037f, B:103:0x039b, B:93:0x0347, B:94:0x034b, B:95:0x034f, B:79:0x02c8, B:80:0x02d9, B:82:0x02f5, B:84:0x0307, B:85:0x0318, B:104:0x03b4, B:106:0x03c2, B:108:0x03ea, B:110:0x03fc, B:111:0x040c, B:119:0x0471, B:121:0x047c, B:123:0x0494, B:125:0x049c, B:127:0x04d7, B:129:0x04fd, B:134:0x050c, B:126:0x04b7, B:112:0x0410, B:113:0x0421, B:115:0x043d, B:117:0x044f, B:118:0x0460, B:18:0x00b8, B:19:0x00c0, B:44:0x01d3, B:46:0x01e1, B:51:0x01f0), top: B:164:0x0099, inners: #8 }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            Method dump skipped, instruction units count: 1407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.P.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
