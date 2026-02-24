package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.SubTVArchiveActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m7.AbstractC2237a;
import s5.AbstractC2736q;

/* JADX INFO: loaded from: classes4.dex */
public class g0 extends RecyclerView.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static SharedPreferences f48344l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f48345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f48346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f48347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f48348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LiveStreamDBHandler f48349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SimpleDateFormat f48350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f48351j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48352k;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamsDBModel liveStreamsDBModel, LiveStreamsDBModel liveStreamsDBModel2) {
            return AbstractC2736q.j().d(liveStreamsDBModel.getIdAuto(), liveStreamsDBModel2.getIdAuto()).i();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LiveStreamsDBModel f48354a;

        public b(LiveStreamsDBModel liveStreamsDBModel) {
            this.f48354a = liveStreamsDBModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(g0.this.f48346e, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f48354a.getEpgChannelId());
            intent.putExtra("OPENED_STREAM_ID", this.f48354a.getStreamId());
            intent.putExtra("OPENED_NUM", this.f48354a.getNum());
            intent.putExtra("OPENED_NAME", this.f48354a.getName());
            intent.putExtra("OPENED_STREAM_ICON", this.f48354a.getStreamIcon());
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f48354a.getTvArchiveDuration());
            g0.this.f48346e.startActivity(intent);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LiveStreamsDBModel f48356a;

        public c(LiveStreamsDBModel liveStreamsDBModel) {
            this.f48356a = liveStreamsDBModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.e("data Value Categories", ">>>>>>>>>>>>>>" + this.f48356a);
            Intent intent = new Intent(g0.this.f48346e, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f48356a.getEpgChannelId());
            intent.putExtra("OPENED_STREAM_ID", this.f48356a.getStreamId());
            intent.putExtra("OPENED_NUM", this.f48356a.getNum());
            intent.putExtra("OPENED_NAME", this.f48356a.getName());
            intent.putExtra("OPENED_STREAM_ICON", this.f48356a.getStreamIcon());
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f48356a.getTvArchiveDuration());
            g0.this.f48346e.startActivity(intent);
        }
    }

    public static class d extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public ProgressBar f48358A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public TextView f48359B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public ImageView f48360C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48361t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ProgressBar f48362u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f48363v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public RelativeLayout f48364w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public RelativeLayout f48365x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public TextView f48366y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public TextView f48367z;

        public d(View view) {
            super(view);
            this.f48361t = (TextView) view.findViewById(a7.f.fk);
            this.f48362u = (ProgressBar) view.findViewById(a7.f.oc);
            this.f48363v = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f48364w = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f48365x = (RelativeLayout) view.findViewById(a7.f.Wg);
            this.f48366y = (TextView) view.findViewById(a7.f.di);
            this.f48367z = (TextView) view.findViewById(a7.f.em);
            this.f48358A = (ProgressBar) view.findViewById(a7.f.Nc);
            this.f48359B = (TextView) view.findViewById(a7.f.si);
            this.f48360C = (ImageView) view.findViewById(a7.f.f12417h6);
            J(false);
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48368a;

        public e(View view) {
            this.f48368a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48368a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48368a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48368a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                Log.e("id is", "" + this.f48368a.getTag());
                view2 = this.f48368a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f48368a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public g0(List list, Context context) {
        this.f48352k = "";
        ArrayList arrayList = new ArrayList();
        this.f48347f = arrayList;
        arrayList.addAll(list);
        this.f48348g = list;
        this.f48345d = list;
        this.f48346e = context;
        this.f48349h = new LiveStreamDBHandler(context);
        this.f48352k = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
        Collections.sort(this.f48345d, new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void E(d dVar, int i9) {
        LiveStreamDBHandler liveStreamDBHandler;
        int iM;
        LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) this.f48345d.get(i9);
        String name = liveStreamsDBModel.getName();
        liveStreamsDBModel.getStreamId();
        String num = liveStreamsDBModel.getNum();
        String epgChannelId = liveStreamsDBModel.getEpgChannelId();
        String streamIcon = liveStreamsDBModel.getStreamIcon();
        if (name != null && !name.equals("") && !name.isEmpty()) {
            dVar.f48361t.setText(name);
        }
        TextView textView = dVar.f48366y;
        if (textView != null) {
            textView.setText(num);
        }
        dVar.f48367z.setText("");
        dVar.f48358A.setVisibility(8);
        dVar.f48359B.setText("");
        if (epgChannelId != null && !epgChannelId.equals("") && (liveStreamDBHandler = this.f48349h) != null) {
            ArrayList<XMLTVProgrammePojo> epg = liveStreamDBHandler.getEPG(epgChannelId);
            if (epg != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= epg.size()) {
                        break;
                    }
                    String start = epg.get(i10).getStart();
                    String stop = epg.get(i10).getStop();
                    String title = epg.get(i10).getTitle();
                    epg.get(i10).getDesc();
                    long jX = m7.w.x(start, this.f48346e);
                    Long lValueOf = Long.valueOf(jX);
                    ArrayList<XMLTVProgrammePojo> arrayList = epg;
                    long jX2 = m7.w.x(stop, this.f48346e);
                    Long lValueOf2 = Long.valueOf(jX2);
                    if (!m7.w.b0(jX, jX2, this.f48346e) || (iM = m7.w.M(jX, jX2, this.f48346e)) == 0) {
                        i10++;
                        epg = arrayList;
                    } else {
                        int i11 = 100 - iM;
                        if (i11 == 0 || title == null || title.equals("")) {
                            dVar.f48367z.setVisibility(8);
                            dVar.f48358A.setVisibility(8);
                            dVar.f48359B.setVisibility(8);
                        } else {
                            if (AbstractC2237a.f44456M == 0) {
                                dVar.f48367z.setVisibility(0);
                                SharedPreferences sharedPreferences = this.f48346e.getSharedPreferences("timeFormat", 0);
                                f48344l = sharedPreferences;
                                this.f48350i = new SimpleDateFormat(sharedPreferences.getString("timeFormat", AbstractC2237a.f44441E0));
                                dVar.f48367z.setText(this.f48350i.format(lValueOf) + " - " + this.f48350i.format(lValueOf2));
                            }
                            dVar.f48358A.setVisibility(0);
                            dVar.f48358A.setProgress(i11);
                            dVar.f48359B.setVisibility(0);
                            dVar.f48359B.setText(title);
                        }
                    }
                }
            }
            dVar.f48360C.setImageDrawable(null);
            if (streamIcon == null || streamIcon.equals("")) {
                dVar.f48360C.setImageDrawable(this.f48346e.getResources().getDrawable(a7.e.f11932K2, null));
            } else {
                com.squareup.picasso.t.q(this.f48346e).l(streamIcon).j(a7.e.f11932K2).g(dVar.f48360C);
            }
        }
        dVar.f48363v.setOnClickListener(new b(liveStreamsDBModel));
        dVar.f48364w.setOnClickListener(new c(liveStreamsDBModel));
        RelativeLayout relativeLayout = dVar.f48363v;
        relativeLayout.setOnFocusChangeListener(new e(relativeLayout));
        if (i9 == 0 && this.f48351j) {
            dVar.f48363v.requestFocus();
            this.f48351j = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public d L(ViewGroup viewGroup, int i9) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12808h3, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12426i5);
        if (this.f48352k.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(a7.e.f11971W0);
        }
        return new d(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48345d.size();
    }
}
