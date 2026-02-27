package com.nst.iptvsmarterstvbox.view.services;

import A3.c;
import A3.g;
import a4.C1095i;
import a7.i;
import a7.j;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.nst.iptvsmarterstvbox.model.DownloadedDataModel;
import com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler;
import d4.AbstractC1681B;
import d4.k0;
import java.util.ArrayList;
import java.util.List;
import p0.C2386a;
import z3.AbstractC3050u;
import z3.AbstractServiceC3053x;
import z3.C3032c;
import z3.C3048s;

/* JADX INFO: loaded from: classes4.dex */
public class VideoDownloadService extends AbstractServiceC3053x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Runnable f37681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Handler f37682n = new Handler();

    public static final class a implements C3048s.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f37683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1095i f37684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37685c;

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.services.VideoDownloadService$a$a, reason: collision with other inner class name */
        public class RunnableC0293a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C3032c f37686a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C3048s f37687c;

            public RunnableC0293a(C3032c c3032c, C3048s c3048s) {
                this.f37686a = c3032c;
                this.f37687c = c3048s;
            }

            @Override // java.lang.Runnable
            public void run() {
                VideoDownloadService.f37682n.postDelayed(this, 3000L);
                if (this.f37686a.f52715b == 2) {
                    AbstractC1681B.g("sizeISHere", "size:" + this.f37687c.e().size());
                    for (int i9 = 0; i9 < this.f37687c.e().size(); i9++) {
                        AbstractC1681B.g("stateSS:", "state:" + ((C3032c) this.f37687c.e().get(i9)).f52715b);
                        if (((C3032c) this.f37687c.e().get(i9)).f52715b == 2) {
                            String string = ((C3032c) this.f37687c.e().get(i9)).f52714a.f52802c.toString();
                            int iB = (int) ((C3032c) this.f37687c.e().get(i9)).b();
                            AbstractC1681B.g("uriIShere", "uri" + string + "\npercent" + iB);
                            if (iB != -1) {
                                try {
                                    DownloadedDBHandler downloadedDBHandler = new DownloadedDBHandler(a.this.f37683a);
                                    ArrayList<DownloadedDataModel> downloadedData = downloadedDBHandler.getDownloadedData();
                                    if (downloadedData.size() > 0) {
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= downloadedData.size()) {
                                                break;
                                            }
                                            if (downloadedData.get(i10).getMovieURL().equals(string)) {
                                                int idAuto = downloadedData.get(i10).getIdAuto();
                                                ArrayList<DownloadedDataModel> arrayList = new ArrayList<>();
                                                DownloadedDataModel downloadedDataModel = new DownloadedDataModel();
                                                downloadedDataModel.setMovieState("Downloading");
                                                downloadedDataModel.setMoviePercentage(iB);
                                                arrayList.add(downloadedDataModel);
                                                downloadedDBHandler.updateDownloadedData(arrayList, idAuto);
                                                Intent intent = new Intent("DownloadChecker");
                                                intent.putExtra("status", "downloading");
                                                intent.putExtra("percent", iB);
                                                intent.putExtra("url", string);
                                                C2386a.b(a.this.f37683a).d(intent);
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
        }

        public a(Context context, C1095i c1095i, int i9) {
            this.f37683a = context.getApplicationContext();
            this.f37684b = c1095i;
            this.f37685c = i9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
        
            r7 = new java.util.ArrayList<>();
            r8 = new com.nst.iptvsmarterstvbox.model.DownloadedDataModel();
            r8.setMovieState("Completed");
            r8.setMoviePercentage(100);
            r7.add(r8);
            r14.updateDownloadedData(r7, r6.get(r5).getIdAuto());
            r14 = new android.content.Intent("DownloadChecker");
            r14.putExtra("status", "completed");
            r14.putExtra("percent", 100);
            r14.putExtra("url", r12);
            p0.C2386a.b(r11.f37683a).d(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00f9, code lost:
        
            r7 = r6.get(r5).getMoviePercentage();
            r8 = new java.util.ArrayList<>();
            r9 = new com.nst.iptvsmarterstvbox.model.DownloadedDataModel();
            r9.setMovieState("Failed");
            r9.setMoviePercentage(r7);
            r8.add(r9);
            r14.updateDownloadedData(r8, r6.get(r5).getIdAuto());
            r14 = new android.content.Intent("DownloadChecker");
            r14.putExtra("status", "failed");
            r14.putExtra("percent", r7);
            r14.putExtra("url", r12);
            p0.C2386a.b(r11.f37683a).d(r14);
         */
        @Override // z3.C3048s.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(z3.C3048s r12, z3.C3032c r13, java.lang.Exception r14) {
            /*
                Method dump skipped, instruction units count: 352
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.services.VideoDownloadService.a.a(z3.s, z3.c, java.lang.Exception):void");
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void b(C3048s c3048s, c cVar, int i9) {
            AbstractC3050u.e(this, c3048s, cVar, i9);
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void c(C3048s c3048s) {
            AbstractC3050u.c(this, c3048s);
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void d(C3048s c3048s, C3032c c3032c) {
            AbstractC3050u.a(this, c3048s, c3032c);
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void e(C3048s c3048s, boolean z9) {
            AbstractC3050u.b(this, c3048s, z9);
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void f(C3048s c3048s, boolean z9) {
            AbstractC3050u.f(this, c3048s, z9);
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void g(C3048s c3048s) {
            AbstractC3050u.d(this, c3048s);
        }
    }

    public VideoDownloadService() {
        super(1, 1000L, "downChannel", j.f13003G, 0);
    }

    @Override // z3.AbstractServiceC3053x
    public C3048s m() {
        C3048s c3048sF = B7.a.f(this);
        c3048sF.d(new a(this, B7.a.g(this), 2));
        return c3048sF;
    }

    @Override // z3.AbstractServiceC3053x
    public Notification n(List list, int i9) {
        return B7.a.g(this).e(this, i.f12942a, null, null, list);
    }

    @Override // z3.AbstractServiceC3053x
    public g q() {
        if (k0.f39777a >= 21) {
            return new A3.a(this, 1);
        }
        return null;
    }
}
