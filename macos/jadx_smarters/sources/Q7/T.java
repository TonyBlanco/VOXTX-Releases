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
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class T extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47448a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47449c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f47452f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f47454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatabaseHandler f47455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LiveStreamDBHandler f47456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f47457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f47458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f47459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2858a f47460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f47461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f47462p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f47450d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f47451e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f47453g = new b();

    public class b extends Filter {
        public b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = T.this.f47450d;
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
            TextView textView;
            int i9;
            try {
                T.this.f47451e = (ArrayList) filterResults.values;
                T.this.notifyDataSetChanged();
                if (T.this.f47451e.size() == 0) {
                    textView = T.this.f47458l;
                    i9 = 0;
                } else {
                    textView = T.this.f47458l;
                    i9 = 8;
                }
                textView.setVisibility(i9);
            } catch (Exception unused) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f47464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f47465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f47466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f47467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f47468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f47469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f47470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ProgressBar f47471h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public TextView f47472i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LinearLayout f47473j;
    }

    public T(Context context, ArrayList arrayList, String str) {
        this.f47448a = "";
        this.f47459m = "mobile";
        this.f47448a = str;
        this.f47454h = context;
        this.f47450d.clear();
        this.f47451e.clear();
        this.f47450d.addAll(arrayList);
        this.f47451e.addAll(arrayList);
        this.f47454h = context;
        this.f47452f = LayoutInflater.from(context);
        this.f47455i = new DatabaseHandler(context);
        this.f47456j = new LiveStreamDBHandler(context);
        C2858a c2858a = new C2858a(context);
        this.f47460n = c2858a;
        this.f47461o = c2858a.B();
        this.f47462p = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f47459m = "tv";
        } else {
            this.f47459m = "mobile";
        }
    }

    public final void c() {
        this.f47449c = this.f47454h.getSharedPreferences("currentlyPlayingVideo", 0).getString("currentlyPlayingVideo", "");
    }

    public final void d() {
        this.f47449c = this.f47454h.getSharedPreferences("currentlyPlayingVideo", 0).getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
    }

    public ArrayList e() {
        return this.f47451e;
    }

    public void f(ArrayList arrayList) {
        ArrayList arrayList2 = this.f47450d;
        if (arrayList2 == null || this.f47451e == null) {
            return;
        }
        arrayList2.clear();
        this.f47451e.clear();
        this.f47450d.addAll(arrayList);
        this.f47451e.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void g(TextView textView) {
        this.f47458l = textView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        try {
            return this.f47451e.size();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f47453g;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        return this.f47451e.get(i9);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0582 A[Catch: Exception -> 0x00ce, TryCatch #1 {Exception -> 0x00ce, blocks: (B:13:0x00b1, B:16:0x00ba, B:18:0x00c6, B:19:0x00ca, B:24:0x00df, B:25:0x00fe, B:26:0x010a, B:30:0x0123, B:32:0x0133, B:34:0x0141, B:36:0x0169, B:38:0x017b, B:39:0x018b, B:47:0x01f0, B:49:0x01fe, B:61:0x021d, B:63:0x023b, B:65:0x0253, B:67:0x025b, B:170:0x0607, B:172:0x0615, B:174:0x0627, B:175:0x0653, B:68:0x0277, B:69:0x028e, B:55:0x020e, B:40:0x018f, B:41:0x01a0, B:43:0x01bc, B:45:0x01ce, B:46:0x01df, B:70:0x0293, B:72:0x029f, B:74:0x02ad, B:76:0x02d5, B:78:0x02e7, B:79:0x02f7, B:87:0x035c, B:89:0x0360, B:91:0x0366, B:93:0x0372, B:97:0x0387, B:99:0x03a5, B:101:0x03bd, B:103:0x03c5, B:105:0x03cb, B:109:0x03f2, B:110:0x0409, B:106:0x03dd, B:108:0x03e1, B:111:0x040e, B:94:0x037a, B:95:0x037e, B:96:0x0382, B:80:0x02fb, B:81:0x030c, B:83:0x0328, B:85:0x033a, B:86:0x034b, B:112:0x0427, B:114:0x0435, B:116:0x045d, B:118:0x046f, B:119:0x047f, B:127:0x04e4, B:129:0x04ee, B:131:0x050c, B:156:0x0564, B:158:0x0582, B:160:0x059a, B:162:0x05a2, B:164:0x05a8, B:168:0x05cf, B:165:0x05ba, B:167:0x05be, B:169:0x05e8, B:137:0x051c, B:144:0x052c, B:146:0x0548, B:120:0x0483, B:121:0x0494, B:123:0x04b0, B:125:0x04c2, B:126:0x04d3, B:22:0x00d2, B:23:0x00da), top: B:182:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0615 A[Catch: Exception -> 0x00ce, TryCatch #1 {Exception -> 0x00ce, blocks: (B:13:0x00b1, B:16:0x00ba, B:18:0x00c6, B:19:0x00ca, B:24:0x00df, B:25:0x00fe, B:26:0x010a, B:30:0x0123, B:32:0x0133, B:34:0x0141, B:36:0x0169, B:38:0x017b, B:39:0x018b, B:47:0x01f0, B:49:0x01fe, B:61:0x021d, B:63:0x023b, B:65:0x0253, B:67:0x025b, B:170:0x0607, B:172:0x0615, B:174:0x0627, B:175:0x0653, B:68:0x0277, B:69:0x028e, B:55:0x020e, B:40:0x018f, B:41:0x01a0, B:43:0x01bc, B:45:0x01ce, B:46:0x01df, B:70:0x0293, B:72:0x029f, B:74:0x02ad, B:76:0x02d5, B:78:0x02e7, B:79:0x02f7, B:87:0x035c, B:89:0x0360, B:91:0x0366, B:93:0x0372, B:97:0x0387, B:99:0x03a5, B:101:0x03bd, B:103:0x03c5, B:105:0x03cb, B:109:0x03f2, B:110:0x0409, B:106:0x03dd, B:108:0x03e1, B:111:0x040e, B:94:0x037a, B:95:0x037e, B:96:0x0382, B:80:0x02fb, B:81:0x030c, B:83:0x0328, B:85:0x033a, B:86:0x034b, B:112:0x0427, B:114:0x0435, B:116:0x045d, B:118:0x046f, B:119:0x047f, B:127:0x04e4, B:129:0x04ee, B:131:0x050c, B:156:0x0564, B:158:0x0582, B:160:0x059a, B:162:0x05a2, B:164:0x05a8, B:168:0x05cf, B:165:0x05ba, B:167:0x05be, B:169:0x05e8, B:137:0x051c, B:144:0x052c, B:146:0x0548, B:120:0x0483, B:121:0x0494, B:123:0x04b0, B:125:0x04c2, B:126:0x04d3, B:22:0x00d2, B:23:0x00da), top: B:182:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0653 A[Catch: Exception -> 0x00ce, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ce, blocks: (B:13:0x00b1, B:16:0x00ba, B:18:0x00c6, B:19:0x00ca, B:24:0x00df, B:25:0x00fe, B:26:0x010a, B:30:0x0123, B:32:0x0133, B:34:0x0141, B:36:0x0169, B:38:0x017b, B:39:0x018b, B:47:0x01f0, B:49:0x01fe, B:61:0x021d, B:63:0x023b, B:65:0x0253, B:67:0x025b, B:170:0x0607, B:172:0x0615, B:174:0x0627, B:175:0x0653, B:68:0x0277, B:69:0x028e, B:55:0x020e, B:40:0x018f, B:41:0x01a0, B:43:0x01bc, B:45:0x01ce, B:46:0x01df, B:70:0x0293, B:72:0x029f, B:74:0x02ad, B:76:0x02d5, B:78:0x02e7, B:79:0x02f7, B:87:0x035c, B:89:0x0360, B:91:0x0366, B:93:0x0372, B:97:0x0387, B:99:0x03a5, B:101:0x03bd, B:103:0x03c5, B:105:0x03cb, B:109:0x03f2, B:110:0x0409, B:106:0x03dd, B:108:0x03e1, B:111:0x040e, B:94:0x037a, B:95:0x037e, B:96:0x0382, B:80:0x02fb, B:81:0x030c, B:83:0x0328, B:85:0x033a, B:86:0x034b, B:112:0x0427, B:114:0x0435, B:116:0x045d, B:118:0x046f, B:119:0x047f, B:127:0x04e4, B:129:0x04ee, B:131:0x050c, B:156:0x0564, B:158:0x0582, B:160:0x059a, B:162:0x05a2, B:164:0x05a8, B:168:0x05cf, B:165:0x05ba, B:167:0x05be, B:169:0x05e8, B:137:0x051c, B:144:0x052c, B:146:0x0548, B:120:0x0483, B:121:0x0494, B:123:0x04b0, B:125:0x04c2, B:126:0x04d3, B:22:0x00d2, B:23:0x00da), top: B:182:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133 A[Catch: Exception -> 0x00ce, TryCatch #1 {Exception -> 0x00ce, blocks: (B:13:0x00b1, B:16:0x00ba, B:18:0x00c6, B:19:0x00ca, B:24:0x00df, B:25:0x00fe, B:26:0x010a, B:30:0x0123, B:32:0x0133, B:34:0x0141, B:36:0x0169, B:38:0x017b, B:39:0x018b, B:47:0x01f0, B:49:0x01fe, B:61:0x021d, B:63:0x023b, B:65:0x0253, B:67:0x025b, B:170:0x0607, B:172:0x0615, B:174:0x0627, B:175:0x0653, B:68:0x0277, B:69:0x028e, B:55:0x020e, B:40:0x018f, B:41:0x01a0, B:43:0x01bc, B:45:0x01ce, B:46:0x01df, B:70:0x0293, B:72:0x029f, B:74:0x02ad, B:76:0x02d5, B:78:0x02e7, B:79:0x02f7, B:87:0x035c, B:89:0x0360, B:91:0x0366, B:93:0x0372, B:97:0x0387, B:99:0x03a5, B:101:0x03bd, B:103:0x03c5, B:105:0x03cb, B:109:0x03f2, B:110:0x0409, B:106:0x03dd, B:108:0x03e1, B:111:0x040e, B:94:0x037a, B:95:0x037e, B:96:0x0382, B:80:0x02fb, B:81:0x030c, B:83:0x0328, B:85:0x033a, B:86:0x034b, B:112:0x0427, B:114:0x0435, B:116:0x045d, B:118:0x046f, B:119:0x047f, B:127:0x04e4, B:129:0x04ee, B:131:0x050c, B:156:0x0564, B:158:0x0582, B:160:0x059a, B:162:0x05a2, B:164:0x05a8, B:168:0x05cf, B:165:0x05ba, B:167:0x05be, B:169:0x05e8, B:137:0x051c, B:144:0x052c, B:146:0x0548, B:120:0x0483, B:121:0x0494, B:123:0x04b0, B:125:0x04c2, B:126:0x04d3, B:22:0x00d2, B:23:0x00da), top: B:182:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0293 A[Catch: Exception -> 0x00ce, TryCatch #1 {Exception -> 0x00ce, blocks: (B:13:0x00b1, B:16:0x00ba, B:18:0x00c6, B:19:0x00ca, B:24:0x00df, B:25:0x00fe, B:26:0x010a, B:30:0x0123, B:32:0x0133, B:34:0x0141, B:36:0x0169, B:38:0x017b, B:39:0x018b, B:47:0x01f0, B:49:0x01fe, B:61:0x021d, B:63:0x023b, B:65:0x0253, B:67:0x025b, B:170:0x0607, B:172:0x0615, B:174:0x0627, B:175:0x0653, B:68:0x0277, B:69:0x028e, B:55:0x020e, B:40:0x018f, B:41:0x01a0, B:43:0x01bc, B:45:0x01ce, B:46:0x01df, B:70:0x0293, B:72:0x029f, B:74:0x02ad, B:76:0x02d5, B:78:0x02e7, B:79:0x02f7, B:87:0x035c, B:89:0x0360, B:91:0x0366, B:93:0x0372, B:97:0x0387, B:99:0x03a5, B:101:0x03bd, B:103:0x03c5, B:105:0x03cb, B:109:0x03f2, B:110:0x0409, B:106:0x03dd, B:108:0x03e1, B:111:0x040e, B:94:0x037a, B:95:0x037e, B:96:0x0382, B:80:0x02fb, B:81:0x030c, B:83:0x0328, B:85:0x033a, B:86:0x034b, B:112:0x0427, B:114:0x0435, B:116:0x045d, B:118:0x046f, B:119:0x047f, B:127:0x04e4, B:129:0x04ee, B:131:0x050c, B:156:0x0564, B:158:0x0582, B:160:0x059a, B:162:0x05a2, B:164:0x05a8, B:168:0x05cf, B:165:0x05ba, B:167:0x05be, B:169:0x05e8, B:137:0x051c, B:144:0x052c, B:146:0x0548, B:120:0x0483, B:121:0x0494, B:123:0x04b0, B:125:0x04c2, B:126:0x04d3, B:22:0x00d2, B:23:0x00da), top: B:182:0x00b1 }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            Method dump skipped, instruction units count: 1643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.T.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
