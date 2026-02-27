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
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class O extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47325a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f47326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f47327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f47328e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f47330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DatabaseHandler f47331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LiveStreamDBHandler f47332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f47333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47334k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2858a f47336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f47338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f47339p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f47329f = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f47335l = false;

    public class b extends Filter {
        public b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = O.this.f47326c;
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
                O.this.f47327d = (ArrayList) filterResults.values;
                O.this.notifyDataSetChanged();
                if (O.this.f47327d == null || O.this.f47327d.size() != 0) {
                    if (!O.this.f47334k.equals("mobile")) {
                        ((NSTIJKPlayerSkyTvActivity) O.this.f47330g).Q3();
                    }
                } else if (!O.this.f47334k.equals("mobile")) {
                    ((NSTIJKPlayerSkyTvActivity) O.this.f47330g).a4();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f47341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f47342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f47343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f47344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f47345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f47346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ProgressBar f47347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f47348h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f47349i;
    }

    public O(Context context, ArrayList arrayList) {
        this.f47327d = null;
        this.f47334k = "mobile";
        ArrayList arrayList2 = new ArrayList();
        this.f47327d = arrayList2;
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        this.f47326c = arrayList3;
        arrayList3.addAll(arrayList);
        this.f47339p = new ArrayList();
        this.f47330g = context;
        this.f47328e = LayoutInflater.from(context);
        this.f47331h = new DatabaseHandler(context);
        this.f47332i = new LiveStreamDBHandler(context);
        C2858a c2858a = new C2858a(context);
        this.f47336m = c2858a;
        this.f47337n = c2858a.B();
        this.f47338o = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f47334k = "tv";
        } else {
            this.f47334k = "mobile";
        }
    }

    public final void e() {
        this.f47325a = this.f47330g.getSharedPreferences("currentlyPlayingVideo", 0).getString("currentlyPlayingVideo", "");
    }

    public final void f() {
        this.f47325a = this.f47330g.getSharedPreferences("currentlyPlayingVideo", 0).getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "");
    }

    public ArrayList g() {
        return this.f47327d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f47327d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f47329f;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        try {
            return this.f47327d.get(i9);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03ed A[Catch: Exception -> 0x05ad, TryCatch #1 {Exception -> 0x05ad, blocks: (B:9:0x0097, B:12:0x009f, B:14:0x00ab, B:15:0x00ad, B:18:0x00be, B:19:0x00e9, B:22:0x00fd, B:25:0x010e, B:27:0x011c, B:29:0x0144, B:31:0x0156, B:32:0x0162, B:33:0x0166, B:42:0x01c3, B:44:0x01ce, B:46:0x01e6, B:48:0x01ee, B:50:0x021c, B:52:0x022a, B:152:0x054d, B:154:0x055b, B:156:0x056d, B:157:0x0599, B:57:0x023a, B:49:0x0202, B:34:0x016a, B:35:0x0176, B:36:0x017b, B:38:0x0197, B:40:0x01a9, B:41:0x01b6, B:61:0x0248, B:63:0x0255, B:65:0x0263, B:67:0x028b, B:69:0x029d, B:70:0x02a9, B:71:0x02ad, B:80:0x030a, B:82:0x030e, B:84:0x0314, B:86:0x0320, B:90:0x0333, B:92:0x033e, B:94:0x0356, B:96:0x035e, B:97:0x0373, B:98:0x037a, B:99:0x038f, B:87:0x0328, B:88:0x032a, B:89:0x0330, B:72:0x02b1, B:73:0x02bd, B:74:0x02c2, B:76:0x02de, B:78:0x02f0, B:79:0x02fd, B:117:0x03df, B:119:0x03ed, B:121:0x0415, B:123:0x0427, B:124:0x0433, B:125:0x0437, B:134:0x0494, B:136:0x04a5, B:138:0x04ad, B:140:0x04b5, B:142:0x04bd, B:143:0x04d4, B:144:0x04f1, B:146:0x04f9, B:148:0x0511, B:150:0x0519, B:151:0x0530, B:126:0x043b, B:127:0x0447, B:128:0x044c, B:130:0x0468, B:132:0x047a, B:133:0x0487, B:116:0x03dc, B:16:0x00b3, B:17:0x00bb, B:101:0x0396, B:103:0x03bd, B:108:0x03cc, B:54:0x0230, B:59:0x023f), top: B:163:0x0097, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x044c A[Catch: Exception -> 0x05ad, TryCatch #1 {Exception -> 0x05ad, blocks: (B:9:0x0097, B:12:0x009f, B:14:0x00ab, B:15:0x00ad, B:18:0x00be, B:19:0x00e9, B:22:0x00fd, B:25:0x010e, B:27:0x011c, B:29:0x0144, B:31:0x0156, B:32:0x0162, B:33:0x0166, B:42:0x01c3, B:44:0x01ce, B:46:0x01e6, B:48:0x01ee, B:50:0x021c, B:52:0x022a, B:152:0x054d, B:154:0x055b, B:156:0x056d, B:157:0x0599, B:57:0x023a, B:49:0x0202, B:34:0x016a, B:35:0x0176, B:36:0x017b, B:38:0x0197, B:40:0x01a9, B:41:0x01b6, B:61:0x0248, B:63:0x0255, B:65:0x0263, B:67:0x028b, B:69:0x029d, B:70:0x02a9, B:71:0x02ad, B:80:0x030a, B:82:0x030e, B:84:0x0314, B:86:0x0320, B:90:0x0333, B:92:0x033e, B:94:0x0356, B:96:0x035e, B:97:0x0373, B:98:0x037a, B:99:0x038f, B:87:0x0328, B:88:0x032a, B:89:0x0330, B:72:0x02b1, B:73:0x02bd, B:74:0x02c2, B:76:0x02de, B:78:0x02f0, B:79:0x02fd, B:117:0x03df, B:119:0x03ed, B:121:0x0415, B:123:0x0427, B:124:0x0433, B:125:0x0437, B:134:0x0494, B:136:0x04a5, B:138:0x04ad, B:140:0x04b5, B:142:0x04bd, B:143:0x04d4, B:144:0x04f1, B:146:0x04f9, B:148:0x0511, B:150:0x0519, B:151:0x0530, B:126:0x043b, B:127:0x0447, B:128:0x044c, B:130:0x0468, B:132:0x047a, B:133:0x0487, B:116:0x03dc, B:16:0x00b3, B:17:0x00bb, B:101:0x0396, B:103:0x03bd, B:108:0x03cc, B:54:0x0230, B:59:0x023f), top: B:163:0x0097, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04a5 A[Catch: Exception -> 0x05ad, TryCatch #1 {Exception -> 0x05ad, blocks: (B:9:0x0097, B:12:0x009f, B:14:0x00ab, B:15:0x00ad, B:18:0x00be, B:19:0x00e9, B:22:0x00fd, B:25:0x010e, B:27:0x011c, B:29:0x0144, B:31:0x0156, B:32:0x0162, B:33:0x0166, B:42:0x01c3, B:44:0x01ce, B:46:0x01e6, B:48:0x01ee, B:50:0x021c, B:52:0x022a, B:152:0x054d, B:154:0x055b, B:156:0x056d, B:157:0x0599, B:57:0x023a, B:49:0x0202, B:34:0x016a, B:35:0x0176, B:36:0x017b, B:38:0x0197, B:40:0x01a9, B:41:0x01b6, B:61:0x0248, B:63:0x0255, B:65:0x0263, B:67:0x028b, B:69:0x029d, B:70:0x02a9, B:71:0x02ad, B:80:0x030a, B:82:0x030e, B:84:0x0314, B:86:0x0320, B:90:0x0333, B:92:0x033e, B:94:0x0356, B:96:0x035e, B:97:0x0373, B:98:0x037a, B:99:0x038f, B:87:0x0328, B:88:0x032a, B:89:0x0330, B:72:0x02b1, B:73:0x02bd, B:74:0x02c2, B:76:0x02de, B:78:0x02f0, B:79:0x02fd, B:117:0x03df, B:119:0x03ed, B:121:0x0415, B:123:0x0427, B:124:0x0433, B:125:0x0437, B:134:0x0494, B:136:0x04a5, B:138:0x04ad, B:140:0x04b5, B:142:0x04bd, B:143:0x04d4, B:144:0x04f1, B:146:0x04f9, B:148:0x0511, B:150:0x0519, B:151:0x0530, B:126:0x043b, B:127:0x0447, B:128:0x044c, B:130:0x0468, B:132:0x047a, B:133:0x0487, B:116:0x03dc, B:16:0x00b3, B:17:0x00bb, B:101:0x0396, B:103:0x03bd, B:108:0x03cc, B:54:0x0230, B:59:0x023f), top: B:163:0x0097, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04f1 A[Catch: Exception -> 0x05ad, TryCatch #1 {Exception -> 0x05ad, blocks: (B:9:0x0097, B:12:0x009f, B:14:0x00ab, B:15:0x00ad, B:18:0x00be, B:19:0x00e9, B:22:0x00fd, B:25:0x010e, B:27:0x011c, B:29:0x0144, B:31:0x0156, B:32:0x0162, B:33:0x0166, B:42:0x01c3, B:44:0x01ce, B:46:0x01e6, B:48:0x01ee, B:50:0x021c, B:52:0x022a, B:152:0x054d, B:154:0x055b, B:156:0x056d, B:157:0x0599, B:57:0x023a, B:49:0x0202, B:34:0x016a, B:35:0x0176, B:36:0x017b, B:38:0x0197, B:40:0x01a9, B:41:0x01b6, B:61:0x0248, B:63:0x0255, B:65:0x0263, B:67:0x028b, B:69:0x029d, B:70:0x02a9, B:71:0x02ad, B:80:0x030a, B:82:0x030e, B:84:0x0314, B:86:0x0320, B:90:0x0333, B:92:0x033e, B:94:0x0356, B:96:0x035e, B:97:0x0373, B:98:0x037a, B:99:0x038f, B:87:0x0328, B:88:0x032a, B:89:0x0330, B:72:0x02b1, B:73:0x02bd, B:74:0x02c2, B:76:0x02de, B:78:0x02f0, B:79:0x02fd, B:117:0x03df, B:119:0x03ed, B:121:0x0415, B:123:0x0427, B:124:0x0433, B:125:0x0437, B:134:0x0494, B:136:0x04a5, B:138:0x04ad, B:140:0x04b5, B:142:0x04bd, B:143:0x04d4, B:144:0x04f1, B:146:0x04f9, B:148:0x0511, B:150:0x0519, B:151:0x0530, B:126:0x043b, B:127:0x0447, B:128:0x044c, B:130:0x0468, B:132:0x047a, B:133:0x0487, B:116:0x03dc, B:16:0x00b3, B:17:0x00bb, B:101:0x0396, B:103:0x03bd, B:108:0x03cc, B:54:0x0230, B:59:0x023f), top: B:163:0x0097, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0599 A[Catch: Exception -> 0x05ad, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ad, blocks: (B:9:0x0097, B:12:0x009f, B:14:0x00ab, B:15:0x00ad, B:18:0x00be, B:19:0x00e9, B:22:0x00fd, B:25:0x010e, B:27:0x011c, B:29:0x0144, B:31:0x0156, B:32:0x0162, B:33:0x0166, B:42:0x01c3, B:44:0x01ce, B:46:0x01e6, B:48:0x01ee, B:50:0x021c, B:52:0x022a, B:152:0x054d, B:154:0x055b, B:156:0x056d, B:157:0x0599, B:57:0x023a, B:49:0x0202, B:34:0x016a, B:35:0x0176, B:36:0x017b, B:38:0x0197, B:40:0x01a9, B:41:0x01b6, B:61:0x0248, B:63:0x0255, B:65:0x0263, B:67:0x028b, B:69:0x029d, B:70:0x02a9, B:71:0x02ad, B:80:0x030a, B:82:0x030e, B:84:0x0314, B:86:0x0320, B:90:0x0333, B:92:0x033e, B:94:0x0356, B:96:0x035e, B:97:0x0373, B:98:0x037a, B:99:0x038f, B:87:0x0328, B:88:0x032a, B:89:0x0330, B:72:0x02b1, B:73:0x02bd, B:74:0x02c2, B:76:0x02de, B:78:0x02f0, B:79:0x02fd, B:117:0x03df, B:119:0x03ed, B:121:0x0415, B:123:0x0427, B:124:0x0433, B:125:0x0437, B:134:0x0494, B:136:0x04a5, B:138:0x04ad, B:140:0x04b5, B:142:0x04bd, B:143:0x04d4, B:144:0x04f1, B:146:0x04f9, B:148:0x0511, B:150:0x0519, B:151:0x0530, B:126:0x043b, B:127:0x0447, B:128:0x044c, B:130:0x0468, B:132:0x047a, B:133:0x0487, B:116:0x03dc, B:16:0x00b3, B:17:0x00bb, B:101:0x0396, B:103:0x03bd, B:108:0x03cc, B:54:0x0230, B:59:0x023f), top: B:163:0x0097, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e A[Catch: Exception -> 0x05ad, TRY_ENTER, TryCatch #1 {Exception -> 0x05ad, blocks: (B:9:0x0097, B:12:0x009f, B:14:0x00ab, B:15:0x00ad, B:18:0x00be, B:19:0x00e9, B:22:0x00fd, B:25:0x010e, B:27:0x011c, B:29:0x0144, B:31:0x0156, B:32:0x0162, B:33:0x0166, B:42:0x01c3, B:44:0x01ce, B:46:0x01e6, B:48:0x01ee, B:50:0x021c, B:52:0x022a, B:152:0x054d, B:154:0x055b, B:156:0x056d, B:157:0x0599, B:57:0x023a, B:49:0x0202, B:34:0x016a, B:35:0x0176, B:36:0x017b, B:38:0x0197, B:40:0x01a9, B:41:0x01b6, B:61:0x0248, B:63:0x0255, B:65:0x0263, B:67:0x028b, B:69:0x029d, B:70:0x02a9, B:71:0x02ad, B:80:0x030a, B:82:0x030e, B:84:0x0314, B:86:0x0320, B:90:0x0333, B:92:0x033e, B:94:0x0356, B:96:0x035e, B:97:0x0373, B:98:0x037a, B:99:0x038f, B:87:0x0328, B:88:0x032a, B:89:0x0330, B:72:0x02b1, B:73:0x02bd, B:74:0x02c2, B:76:0x02de, B:78:0x02f0, B:79:0x02fd, B:117:0x03df, B:119:0x03ed, B:121:0x0415, B:123:0x0427, B:124:0x0433, B:125:0x0437, B:134:0x0494, B:136:0x04a5, B:138:0x04ad, B:140:0x04b5, B:142:0x04bd, B:143:0x04d4, B:144:0x04f1, B:146:0x04f9, B:148:0x0511, B:150:0x0519, B:151:0x0530, B:126:0x043b, B:127:0x0447, B:128:0x044c, B:130:0x0468, B:132:0x047a, B:133:0x0487, B:116:0x03dc, B:16:0x00b3, B:17:0x00bb, B:101:0x0396, B:103:0x03bd, B:108:0x03cc, B:54:0x0230, B:59:0x023f), top: B:163:0x0097, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0248 A[Catch: Exception -> 0x05ad, TRY_ENTER, TryCatch #1 {Exception -> 0x05ad, blocks: (B:9:0x0097, B:12:0x009f, B:14:0x00ab, B:15:0x00ad, B:18:0x00be, B:19:0x00e9, B:22:0x00fd, B:25:0x010e, B:27:0x011c, B:29:0x0144, B:31:0x0156, B:32:0x0162, B:33:0x0166, B:42:0x01c3, B:44:0x01ce, B:46:0x01e6, B:48:0x01ee, B:50:0x021c, B:52:0x022a, B:152:0x054d, B:154:0x055b, B:156:0x056d, B:157:0x0599, B:57:0x023a, B:49:0x0202, B:34:0x016a, B:35:0x0176, B:36:0x017b, B:38:0x0197, B:40:0x01a9, B:41:0x01b6, B:61:0x0248, B:63:0x0255, B:65:0x0263, B:67:0x028b, B:69:0x029d, B:70:0x02a9, B:71:0x02ad, B:80:0x030a, B:82:0x030e, B:84:0x0314, B:86:0x0320, B:90:0x0333, B:92:0x033e, B:94:0x0356, B:96:0x035e, B:97:0x0373, B:98:0x037a, B:99:0x038f, B:87:0x0328, B:88:0x032a, B:89:0x0330, B:72:0x02b1, B:73:0x02bd, B:74:0x02c2, B:76:0x02de, B:78:0x02f0, B:79:0x02fd, B:117:0x03df, B:119:0x03ed, B:121:0x0415, B:123:0x0427, B:124:0x0433, B:125:0x0437, B:134:0x0494, B:136:0x04a5, B:138:0x04ad, B:140:0x04b5, B:142:0x04bd, B:143:0x04d4, B:144:0x04f1, B:146:0x04f9, B:148:0x0511, B:150:0x0519, B:151:0x0530, B:126:0x043b, B:127:0x0447, B:128:0x044c, B:130:0x0468, B:132:0x047a, B:133:0x0487, B:116:0x03dc, B:16:0x00b3, B:17:0x00bb, B:101:0x0396, B:103:0x03bd, B:108:0x03cc, B:54:0x0230, B:59:0x023f), top: B:163:0x0097, inners: #0, #5 }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.O.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void h(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.f47339p = arrayList;
    }

    public void i(m7.c cVar) {
    }
}
