package q7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.DownloadedDataModel;
import com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler;
import com.nst.iptvsmarterstvbox.view.demo.ExoDownloadedPlayerTwo;
import com.nst.iptvsmarterstvbox.view.services.VideoDownloadService;
import com.squareup.picasso.InterfaceC1611e;
import java.util.ArrayList;
import p0.C2386a;
import z3.AbstractServiceC3053x;

/* JADX INFO: renamed from: q7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2617a extends RecyclerView.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.appcompat.app.a f48047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f48048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f48049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f48050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DownloadedDBHandler f48051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f48052j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48046d = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BroadcastReceiver f48053k = new e();

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    public class DialogInterfaceOnClickListenerC0418a implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0418a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            C2617a.this.f48047e.dismiss();
        }
    }

    /* JADX INFO: renamed from: q7.a$b */
    public class b implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48055a;

        public b(int i9) {
            this.f48055a = i9;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!menuItem.getTitle().toString().equalsIgnoreCase(C2617a.this.f48048f.getResources().getString(a7.j.f13155V3))) {
                C2617a.this.z0(this.f48055a);
                return true;
            }
            String movieName = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48055a)).getMovieName();
            String movieExtension = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48055a)).getMovieExtension();
            String movieStreamID = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48055a)).getMovieStreamID();
            String movieDuration = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48055a)).getMovieDuration();
            String movieNum = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48055a)).getMovieNum();
            Intent intent = new Intent(C2617a.this.f48048f, (Class<?>) ExoDownloadedPlayerTwo.class);
            intent.putExtra("type", "movies");
            intent.putExtra("OPENED_STREAM_ID", Integer.parseInt(movieStreamID));
            intent.putExtra("STREAM_TYPE", "movie");
            intent.putExtra("STREAM_TOTAL_DURATION", Integer.parseInt(movieDuration));
            intent.putExtra("VIDEO_NUM", movieNum);
            intent.putExtra("VIDEO_TITLE", movieName);
            intent.putExtra("CONTAINER_EXTENSION", movieExtension);
            intent.putExtra("VIDEO_URL", "");
            C2617a.this.f48048f.startActivity(intent);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.a$c */
    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48057a;

        public c(int i9) {
            this.f48057a = i9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0085, code lost:
        
            r3.f48058c.f48051i.deleteDownloadedData(r5.get(r0).getIdAuto());
         */
        @Override // android.content.DialogInterface.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.content.DialogInterface r4, int r5) {
            /*
                r3 = this;
                q7.a r4 = q7.C2617a.this
                android.content.Context r4 = q7.C2617a.k0(r4)
                java.lang.String r5 = "Deleted Successfully"
                r0 = 1
                android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r0)
                r4.show()
                q7.a r4 = q7.C2617a.this
                java.util.ArrayList r4 = r4.f48050h
                int r5 = r3.f48057a
                java.lang.Object r4 = r4.get(r5)
                com.nst.iptvsmarterstvbox.model.DownloadedDataModel r4 = (com.nst.iptvsmarterstvbox.model.DownloadedDataModel) r4
                java.lang.String r4 = r4.getMovieStreamID()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r1 = "id:"
                r5.append(r1)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r1 = "streamID"
                android.util.Log.i(r1, r5)
                q7.a r5 = q7.C2617a.this
                android.content.Context r5 = q7.C2617a.k0(r5)
                java.lang.String r1 = java.lang.String.valueOf(r4)
                java.lang.Class<com.nst.iptvsmarterstvbox.view.services.VideoDownloadService> r2 = com.nst.iptvsmarterstvbox.view.services.VideoDownloadService.class
                z3.AbstractServiceC3053x.y(r5, r2, r1, r0)
                q7.a r5 = q7.C2617a.this
                java.util.ArrayList r5 = r5.f48050h
                int r0 = r3.f48057a
                r5.remove(r0)
                q7.a r5 = q7.C2617a.this     // Catch: java.lang.Exception -> L9c
                com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler r0 = new com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler     // Catch: java.lang.Exception -> L9c
                q7.a r1 = q7.C2617a.this     // Catch: java.lang.Exception -> L9c
                android.content.Context r1 = q7.C2617a.k0(r1)     // Catch: java.lang.Exception -> L9c
                r0.<init>(r1)     // Catch: java.lang.Exception -> L9c
                q7.C2617a.p0(r5, r0)     // Catch: java.lang.Exception -> L9c
                q7.a r5 = q7.C2617a.this     // Catch: java.lang.Exception -> L9c
                com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler r5 = q7.C2617a.n0(r5)     // Catch: java.lang.Exception -> L9c
                java.util.ArrayList r5 = r5.getDownloadedData()     // Catch: java.lang.Exception -> L9c
                int r0 = r5.size()     // Catch: java.lang.Exception -> L9c
                if (r0 <= 0) goto L9c
                r0 = 0
            L6f:
                int r1 = r5.size()     // Catch: java.lang.Exception -> L9c
                if (r0 >= r1) goto L9c
                java.lang.Object r1 = r5.get(r0)     // Catch: java.lang.Exception -> L9c
                com.nst.iptvsmarterstvbox.model.DownloadedDataModel r1 = (com.nst.iptvsmarterstvbox.model.DownloadedDataModel) r1     // Catch: java.lang.Exception -> L9c
                java.lang.String r1 = r1.getMovieStreamID()     // Catch: java.lang.Exception -> L9c
                boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L9c
                if (r1 == 0) goto L99
                java.lang.Object r4 = r5.get(r0)     // Catch: java.lang.Exception -> L9c
                com.nst.iptvsmarterstvbox.model.DownloadedDataModel r4 = (com.nst.iptvsmarterstvbox.model.DownloadedDataModel) r4     // Catch: java.lang.Exception -> L9c
                int r4 = r4.getIdAuto()     // Catch: java.lang.Exception -> L9c
                q7.a r5 = q7.C2617a.this     // Catch: java.lang.Exception -> L9c
                com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler r5 = q7.C2617a.n0(r5)     // Catch: java.lang.Exception -> L9c
                r5.deleteDownloadedData(r4)     // Catch: java.lang.Exception -> L9c
                goto L9c
            L99:
                int r0 = r0 + 1
                goto L6f
            L9c:
                q7.a r4 = q7.C2617a.this
                androidx.appcompat.app.a r4 = r4.f48047e
                r4.dismiss()
                q7.a r4 = q7.C2617a.this
                q7.C2617a.q0(r4)
                q7.a r4 = q7.C2617a.this
                r4.w()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.C2617a.c.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* JADX INFO: renamed from: q7.a$d */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            C2617a.this.f48047e.dismiss();
        }
    }

    /* JADX INFO: renamed from: q7.a$e */
    public class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StringBuilder sb;
            try {
                String stringExtra = intent.getStringExtra("status");
                int i9 = 0;
                if (stringExtra.equals("completed")) {
                    int intExtra = intent.getIntExtra("percent", 0);
                    String stringExtra2 = intent.getStringExtra("url");
                    Log.i("getPercent", "percent:" + intExtra);
                    for (int i10 = 0; i10 < C2617a.this.f48050h.size(); i10++) {
                        if (((DownloadedDataModel) C2617a.this.f48050h.get(i10)).getMovieURL().equals(stringExtra2)) {
                            ((DownloadedDataModel) C2617a.this.f48050h.get(i10)).setMovieState("Completed");
                            ((DownloadedDataModel) C2617a.this.f48050h.get(i10)).setMoviePercentage(intExtra);
                            int childCount = C2617a.this.f48049g.getChildCount();
                            while (i9 < childCount) {
                                C2617a c2617a = C2617a.this;
                                n nVar = c2617a.new n(c2617a.f48049g.getChildAt(i9));
                                if (((DownloadedDataModel) C2617a.this.f48050h.get(i10)).getMovieName().equals(nVar.f48078t.getText().toString().trim())) {
                                    nVar.f48082x.setVisibility(8);
                                    sb = new StringBuilder();
                                    sb.append("pos:");
                                    sb.append(i9);
                                } else {
                                    i9++;
                                }
                            }
                            return;
                        }
                    }
                    return;
                }
                if (!stringExtra.equals("downloading")) {
                    if (stringExtra.equals("failed")) {
                        int intExtra2 = intent.getIntExtra("percent", 0);
                        String stringExtra3 = intent.getStringExtra("url");
                        Log.i("getPercent", "percent:" + intExtra2);
                        for (int i11 = 0; i11 < C2617a.this.f48050h.size(); i11++) {
                            if (((DownloadedDataModel) C2617a.this.f48050h.get(i11)).getMovieURL().equals(stringExtra3)) {
                                ((DownloadedDataModel) C2617a.this.f48050h.get(i11)).setMovieState("Failed");
                                ((DownloadedDataModel) C2617a.this.f48050h.get(i11)).setMoviePercentage(intExtra2);
                                int childCount2 = C2617a.this.f48049g.getChildCount();
                                for (int i12 = 0; i12 < childCount2; i12++) {
                                    C2617a c2617a2 = C2617a.this;
                                    n nVar2 = c2617a2.new n(c2617a2.f48049g.getChildAt(i12));
                                    if (((DownloadedDataModel) C2617a.this.f48050h.get(i11)).getMovieName().equals(nVar2.f48078t.getText().toString().trim())) {
                                        nVar2.f48082x.setProgress(intExtra2);
                                        nVar2.f48083y.setVisibility(0);
                                        nVar2.f48084z.setText("Failed");
                                        sb = new StringBuilder();
                                        sb.append("pos:");
                                        sb.append(i12);
                                    }
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                int intExtra3 = intent.getIntExtra("percent", 0);
                String stringExtra4 = intent.getStringExtra("url");
                Log.i("getPercent", "percent:" + intExtra3);
                for (int i13 = 0; i13 < C2617a.this.f48050h.size(); i13++) {
                    if (((DownloadedDataModel) C2617a.this.f48050h.get(i13)).getMovieURL().equals(stringExtra4)) {
                        ((DownloadedDataModel) C2617a.this.f48050h.get(i13)).setMovieState("Downloading");
                        ((DownloadedDataModel) C2617a.this.f48050h.get(i13)).setMoviePercentage(intExtra3);
                        Log.i("downloadPercent", "percent:" + ((DownloadedDataModel) C2617a.this.f48050h.get(i13)).getMoviePercentage());
                        int childCount3 = C2617a.this.f48049g.getChildCount();
                        while (i9 < childCount3) {
                            C2617a c2617a3 = C2617a.this;
                            n nVar3 = c2617a3.new n(c2617a3.f48049g.getChildAt(i9));
                            Log.i("posIS", "name:" + nVar3.f48078t.getText().toString().trim());
                            if (((DownloadedDataModel) C2617a.this.f48050h.get(i13)).getMovieName().equals(nVar3.f48078t.getText().toString().trim())) {
                                Log.i("posIS", "HereISPOS:" + i9);
                                nVar3.f48082x.setProgress(intExtra3);
                                nVar3.f48083y.setVisibility(8);
                                sb = new StringBuilder();
                                sb.append("pos:");
                                sb.append(i9);
                            } else {
                                i9++;
                            }
                        }
                        return;
                    }
                }
                return;
                Log.i("posIS", sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q7.a$f */
    public class f implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f48061a;

        /* JADX INFO: renamed from: q7.a$f$a, reason: collision with other inner class name */
        public class C0419a implements InterfaceC1611e {
            public C0419a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void a() {
            }

            @Override // com.squareup.picasso.InterfaceC1611e
            public void onSuccess() {
            }
        }

        public f(n nVar) {
            this.f48061a = nVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            com.squareup.picasso.t.q(C2617a.this.f48048f).l(String.valueOf(C2617a.this.f48048f.getResources().getDrawable(a7.e.f11895B1))).e().a().h(this.f48061a.f48081w, new C0419a());
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.a$g */
    public class g implements InterfaceC1611e {
        public g() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.a$h */
    public class h implements InterfaceC1611e {
        public h() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.a$i */
    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48066a;

        public i(int i9) {
            this.f48066a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieState().equals("Completed")) {
                C2617a.this.B0(view, this.f48066a);
                return;
            }
            String movieName = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieName();
            String movieExtension = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieExtension();
            String movieStreamID = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieStreamID();
            String movieDuration = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieDuration();
            String movieNum = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieNum();
            int idAuto = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getIdAuto();
            long movieCurrentPosition = ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieCurrentPosition();
            Log.i("urlISHere", ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieURL());
            Log.i("curPos", "pos:" + ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieCurrentPosition());
            Intent intent = new Intent(C2617a.this.f48048f, (Class<?>) ExoDownloadedPlayerTwo.class);
            intent.putExtra("autoID", idAuto);
            intent.putExtra("movieCurrentPosition", movieCurrentPosition);
            intent.putExtra("type", "movies");
            intent.putExtra("OPENED_STREAM_ID", movieStreamID);
            intent.putExtra("STREAM_TYPE", "movie");
            intent.putExtra("STREAM_TOTAL_DURATION", Integer.parseInt(movieDuration));
            intent.putExtra("VIDEO_NUM", movieNum);
            intent.putExtra("VIDEO_TITLE", movieName);
            intent.putExtra("CONTAINER_EXTENSION", movieExtension);
            intent.putExtra("VIDEO_URL", ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48066a)).getMovieURL());
            C2617a.this.f48048f.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: q7.a$j */
    public class j implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48068a;

        public j(int i9) {
            this.f48068a = i9;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C2617a.this.z0(this.f48068a);
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.a$k */
    public class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48070a;

        public k(int i9) {
            this.f48070a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2617a.this.A0(view, this.f48070a);
        }
    }

    /* JADX INFO: renamed from: q7.a$l */
    public class l implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48072a;

        public l(int i9) {
            this.f48072a = i9;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00f6  */
        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onMenuItemClick(android.view.MenuItem r13) {
            /*
                Method dump skipped, instruction units count: 728
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.C2617a.l.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* JADX INFO: renamed from: q7.a$m */
    public class m implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f48074a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48075c;

        public m(Context context, int i9) {
            this.f48074a = context;
            this.f48075c = i9;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            Toast.makeText(this.f48074a, "Downloading Cancelled", 1).show();
            AbstractServiceC3053x.y(this.f48074a, VideoDownloadService.class, ((DownloadedDataModel) C2617a.this.f48050h.get(this.f48075c)).getMovieStreamID(), true);
            try {
                C2617a.this.f48051i.deleteDownloadedData(((DownloadedDataModel) C2617a.this.f48050h.get(this.f48075c)).getIdAuto());
                C2617a.this.f48050h.remove(this.f48075c);
            } catch (Exception unused) {
            }
            C2617a.this.f48047e.dismiss();
            C2617a.this.r0();
            C2617a.this.w();
        }
    }

    /* JADX INFO: renamed from: q7.a$n */
    public class n extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48078t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f48079u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public LinearLayout f48080v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f48081w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ProgressBar f48082x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public LinearLayout f48083y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public TextView f48084z;

        public n(View view) {
            super(view);
            this.f48081w = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f48078t = (TextView) view.findViewById(a7.f.Fl);
            this.f48079u = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f48080v = (LinearLayout) view.findViewById(a7.f.f12235O8);
            this.f48082x = (ProgressBar) view.findViewById(a7.f.Pc);
            this.f48083y = (LinearLayout) view.findViewById(a7.f.f12488o6);
            this.f48084z = (TextView) view.findViewById(a7.f.ph);
        }
    }

    /* JADX INFO: renamed from: q7.a$o */
    public class o implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48085a;

        public o(int i9) {
            this.f48085a = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            C2617a.this.f48046d = z9 ? this.f48085a : -1;
        }
    }

    public C2617a(Context context, ArrayList arrayList, RecyclerView recyclerView, TextView textView) {
        this.f48048f = context;
        this.f48050h = arrayList;
        this.f48049g = recyclerView;
        this.f48052j = textView;
        try {
            C2386a.b(context).c(this.f48053k, new IntentFilter("DownloadChecker"));
        } catch (Exception unused) {
        }
    }

    public final void A0(View view, int i9) {
        PopupMenu popupMenu = new PopupMenu(this.f48048f, view, 5);
        Log.i("calledShow", "if");
        popupMenu.getMenuInflater().inflate(a7.h.f12928k, popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new b(i9));
    }

    public final void B0(View view, int i9) {
        PopupMenu popupMenu = new PopupMenu(this.f48048f, view);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        Log.i("movieStateIs", "state:" + ((DownloadedDataModel) this.f48050h.get(i9)).getMovieState());
        menuInflater.inflate(((DownloadedDataModel) this.f48050h.get(i9)).getMovieState().equals("Paused") ? a7.h.f12938u : a7.h.f12919b, popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new l(i9));
    }

    public void F0(ArrayList arrayList) {
        this.f48050h = arrayList;
        w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48050h.size();
    }

    public final void r0() {
        try {
            if (this.f48050h.size() == 0) {
                this.f48052j.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(q7.C2617a.n r6, int r7) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2617a.E(q7.a$n, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public n L(ViewGroup viewGroup, int i9) {
        return new n(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12666K3, viewGroup, false));
    }

    public void x0(Context context, int i9) {
        if (context != null) {
            a.C0158a c0158a = new a.C0158a(context);
            c0158a.setTitle("Are you sure want to cancel the downloading?");
            c0158a.j("Yes", new m(context, i9));
            c0158a.g("No", new DialogInterfaceOnClickListenerC0418a());
            try {
                androidx.appcompat.app.a aVarCreate = c0158a.create();
                this.f48047e = aVarCreate;
                aVarCreate.show();
            } catch (Exception unused) {
            }
        }
    }

    public void z0(int i9) {
        a.C0158a c0158a = new a.C0158a(this.f48048f);
        c0158a.setTitle("Are you sure want to delete?");
        c0158a.j("Yes", new c(i9));
        c0158a.g("No", new d());
        try {
            androidx.appcompat.app.a aVarCreate = c0158a.create();
            this.f48047e = aVarCreate;
            aVarCreate.setCancelable(false);
            this.f48047e.show();
        } catch (Exception unused) {
        }
    }
}
