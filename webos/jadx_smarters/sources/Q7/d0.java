package q7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.SubTVArchiveActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC2237a;

/* JADX INFO: loaded from: classes4.dex */
public class d0 extends RecyclerView.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static SharedPreferences f48226n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f48227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f48228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f48229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f48230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f48231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatabaseHandler f48232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LiveStreamDBHandler f48233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f48234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f48235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SimpleDateFormat f48236m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48237a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48243h;

        public a(String str, int i9, String str2, String str3, String str4, String str5, String str6) {
            this.f48237a = str;
            this.f48238c = i9;
            this.f48239d = str2;
            this.f48240e = str3;
            this.f48241f = str4;
            this.f48242g = str5;
            this.f48243h = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(d0.this.f48227d, (Class<?>) SubTVArchiveActivity.class);
            if (SharepreferenceDBHandler.getCurrentAPPType(d0.this.f48227d).equals("onestream_api")) {
                intent.putExtra("OPENED_STREAM_ID", this.f48237a);
            } else {
                intent.putExtra("OPENED_STREAM_ID", this.f48238c);
            }
            intent.putExtra("OPENED_CHANNEL_ID", this.f48239d);
            intent.putExtra("OPENED_STREAM_ID", this.f48238c);
            intent.putExtra("OPENED_NUM", this.f48240e);
            intent.putExtra("OPENED_NAME", this.f48241f);
            intent.putExtra("OPENED_STREAM_ICON", this.f48242g);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f48243h);
            d0.this.f48227d.startActivity(intent);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48245a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48250g;

        public b(String str, int i9, String str2, String str3, String str4, String str5) {
            this.f48245a = str;
            this.f48246c = i9;
            this.f48247d = str2;
            this.f48248e = str3;
            this.f48249f = str4;
            this.f48250g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(d0.this.f48227d, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f48245a);
            intent.putExtra("OPENED_STREAM_ID", this.f48246c);
            intent.putExtra("OPENED_NUM", this.f48247d);
            intent.putExtra("OPENED_NAME", this.f48248e);
            intent.putExtra("OPENED_STREAM_ICON", this.f48249f);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f48250g);
            d0.this.f48227d.startActivity(intent);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48252a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48257g;

        public c(String str, int i9, String str2, String str3, String str4, String str5) {
            this.f48252a = str;
            this.f48253c = i9;
            this.f48254d = str2;
            this.f48255e = str3;
            this.f48256f = str4;
            this.f48257g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(d0.this.f48227d, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f48252a);
            intent.putExtra("OPENED_STREAM_ID", this.f48253c);
            intent.putExtra("OPENED_NUM", this.f48254d);
            intent.putExtra("OPENED_NAME", this.f48255e);
            intent.putExtra("OPENED_STREAM_ICON", this.f48256f);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f48257g);
            d0.this.f48227d.startActivity(intent);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48259a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f48260c;

        public class a implements Runnable {
            public a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r2 = this;
                    q7.d0$d r0 = q7.d0.d.this
                    java.lang.String r0 = r0.f48259a
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L16
                    q7.d0$d r0 = q7.d0.d.this
                    q7.d0 r0 = q7.d0.this
                    java.util.List r1 = q7.d0.m0(r0)
                L12:
                    q7.d0.p0(r0, r1)
                    goto L3b
                L16:
                    q7.d0$d r0 = q7.d0.d.this
                    q7.d0 r0 = q7.d0.this
                    java.util.List r0 = q7.d0.k0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L32
                    q7.d0$d r0 = q7.d0.d.this
                    q7.d0 r0 = q7.d0.this
                    java.util.List r0 = q7.d0.k0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L3b
                L32:
                    q7.d0$d r0 = q7.d0.d.this
                    q7.d0 r0 = q7.d0.this
                    java.util.List r1 = q7.d0.k0(r0)
                    goto L12
                L3b:
                    q7.d0$d r0 = q7.d0.d.this
                    q7.d0 r0 = q7.d0.this
                    java.util.List r0 = q7.d0.n0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L51
                    q7.d0$d r0 = q7.d0.d.this
                    android.widget.TextView r0 = r0.f48260c
                    r1 = 0
                    r0.setVisibility(r1)
                L51:
                    q7.d0$d r0 = q7.d0.d.this
                    q7.d0 r0 = q7.d0.this
                    r0.w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.d0.d.a.run():void");
            }
        }

        public d(String str, TextView textView) {
            this.f48259a = str;
            this.f48260c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f48230g = new ArrayList();
            if (d0.this.f48230g != null) {
                d0.this.f48230g.clear();
            }
            if (TextUtils.isEmpty(this.f48259a)) {
                d0.this.f48230g.addAll(d0.this.f48231h);
            } else {
                for (LiveStreamsDBModel liveStreamsDBModel : d0.this.f48228e) {
                    if (liveStreamsDBModel.getName().toLowerCase().contains(this.f48259a.toLowerCase())) {
                        d0.this.f48230g.add(liveStreamsDBModel);
                    }
                }
            }
            ((Activity) d0.this.f48227d).runOnUiThread(new a());
        }
    }

    public static class e extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public LinearLayout f48263A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public ProgressBar f48264B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public TextView f48265C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public TextView f48266D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public RelativeLayout f48267E;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ImageView f48268t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48269u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CardView f48270v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public TextView f48271w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ImageView f48272x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public RelativeLayout f48273y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public RelativeLayout f48274z;

        public e(View view) {
            super(view);
            this.f48268t = (ImageView) view.findViewById(a7.f.f12241P4);
            this.f48269u = (TextView) view.findViewById(a7.f.lk);
            this.f48270v = (CardView) view.findViewById(a7.f.f12178J1);
            this.f48271w = (TextView) view.findViewById(a7.f.Ul);
            this.f48272x = (ImageView) view.findViewById(a7.f.f12406g5);
            this.f48273y = (RelativeLayout) view.findViewById(a7.f.qf);
            this.f48274z = (RelativeLayout) view.findViewById(a7.f.f12379de);
            this.f48263A = (LinearLayout) view.findViewById(a7.f.f12235O8);
            this.f48264B = (ProgressBar) view.findViewById(a7.f.Nc);
            this.f48265C = (TextView) view.findViewById(a7.f.si);
            this.f48266D = (TextView) view.findViewById(a7.f.em);
            this.f48267E = (RelativeLayout) view.findViewById(a7.f.He);
            J(false);
        }
    }

    public d0(List list, Context context) {
        this.f48228e = list;
        this.f48227d = context;
        ArrayList arrayList = new ArrayList();
        this.f48230g = arrayList;
        arrayList.addAll(list);
        this.f48231h = list;
        this.f48232i = new DatabaseHandler(context);
        this.f48233j = new LiveStreamDBHandler(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48228e.size();
    }

    public void q0(String str, TextView textView) {
        new Thread(new d(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void E(e eVar, int i9) {
        int i10;
        ImageView imageView;
        int i11;
        LiveStreamDBHandler liveStreamDBHandler;
        ArrayList<XMLTVProgrammePojo> epg;
        int iM;
        Context context = this.f48227d;
        if (context != null) {
            this.f48229f = context.getSharedPreferences("selectedPlayer", 0);
            try {
                i10 = Integer.parseInt(((LiveStreamsDBModel) this.f48228e.get(i9)).getStreamId().trim());
            } catch (NumberFormatException unused) {
                i10 = -1;
            }
            String categoryId = ((LiveStreamsDBModel) this.f48228e.get(i9)).getCategoryId();
            String epgChannelId = ((LiveStreamsDBModel) this.f48228e.get(i9)).getEpgChannelId();
            eVar.f48266D.setText("");
            eVar.f48264B.setVisibility(8);
            eVar.f48265C.setText("");
            if (epgChannelId != null && !epgChannelId.equals("") && (liveStreamDBHandler = this.f48233j) != null && (epg = liveStreamDBHandler.getEPG(epgChannelId)) != null) {
                int i12 = 0;
                while (true) {
                    if (i12 >= epg.size()) {
                        break;
                    }
                    String start = epg.get(i12).getStart();
                    String stop = epg.get(i12).getStop();
                    String title = epg.get(i12).getTitle();
                    epg.get(i12).getDesc();
                    long jX = m7.w.x(start, this.f48227d);
                    Long lValueOf = Long.valueOf(jX);
                    long jX2 = m7.w.x(stop, this.f48227d);
                    Long lValueOf2 = Long.valueOf(jX2);
                    if (!m7.w.b0(jX, jX2, this.f48227d) || (iM = m7.w.M(jX, jX2, this.f48227d)) == 0) {
                        i12++;
                    } else {
                        int i13 = 100 - iM;
                        if (i13 == 0 || title.equals("")) {
                            eVar.f48266D.setVisibility(8);
                            eVar.f48264B.setVisibility(8);
                            eVar.f48265C.setVisibility(8);
                        } else {
                            if (AbstractC2237a.f44456M == 0) {
                                eVar.f48266D.setVisibility(0);
                                SharedPreferences sharedPreferences = this.f48227d.getSharedPreferences("timeFormat", 0);
                                f48226n = sharedPreferences;
                                this.f48236m = new SimpleDateFormat(sharedPreferences.getString("timeFormat", AbstractC2237a.f44441E0));
                                eVar.f48266D.setText(this.f48236m.format(lValueOf) + " - " + this.f48236m.format(lValueOf2));
                            }
                            eVar.f48264B.setVisibility(0);
                            eVar.f48264B.setProgress(i13);
                            eVar.f48265C.setVisibility(0);
                            eVar.f48265C.setText(title);
                        }
                    }
                }
            }
            String num = ((LiveStreamsDBModel) this.f48228e.get(i9)).getNum();
            String name = ((LiveStreamsDBModel) this.f48228e.get(i9)).getName();
            eVar.f48269u.setText(((LiveStreamsDBModel) this.f48228e.get(i9)).getName());
            String streamIcon = ((LiveStreamsDBModel) this.f48228e.get(i9)).getStreamIcon();
            String epgChannelId2 = ((LiveStreamsDBModel) this.f48228e.get(i9)).getEpgChannelId();
            String tvArchiveDuration = ((LiveStreamsDBModel) this.f48228e.get(i9)).getTvArchiveDuration();
            eVar.f48268t.setImageDrawable(null);
            if (streamIcon == null || streamIcon.equals("")) {
                eVar.f48268t.setImageDrawable(this.f48227d.getResources().getDrawable(a7.e.f12016i1, null));
            } else {
                com.squareup.picasso.t.q(this.f48227d).l(streamIcon).j(a7.e.f12016i1).g(eVar.f48268t);
            }
            int i14 = i10;
            eVar.f48270v.setOnClickListener(new a("", i14, epgChannelId2, num, name, streamIcon, tvArchiveDuration));
            eVar.f48267E.setOnClickListener(new b(epgChannelId2, i14, num, name, streamIcon, tvArchiveDuration));
            eVar.f48273y.setOnClickListener(new c(epgChannelId2, i14, num, name, streamIcon, tvArchiveDuration));
            ArrayList<FavouriteDBModel> arrayListCheckFavourite = this.f48232i.checkFavourite(i14, categoryId, "live", SharepreferenceDBHandler.getUserID(this.f48227d), "");
            if (arrayListCheckFavourite == null || arrayListCheckFavourite.size() <= 0) {
                imageView = eVar.f48272x;
                i11 = 4;
            } else {
                imageView = eVar.f48272x;
                i11 = 0;
            }
            imageView.setVisibility(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public e L(ViewGroup viewGroup, int i9) {
        SharedPreferences sharedPreferences = this.f48227d.getSharedPreferences("listgridview", 0);
        this.f48235l = sharedPreferences;
        int i10 = sharedPreferences.getInt("livestream", 0);
        AbstractC2237a.f44456M = i10;
        e eVar = i10 == 1 ? new e(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12618C3, viewGroup, false)) : new e(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12624D3, viewGroup, false));
        this.f48234k = eVar;
        return eVar;
    }
}
