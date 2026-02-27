package w7;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.TableLayout;
import java.util.Locale;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: renamed from: w7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2939c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f51691a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IMediaPlayer f51693c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f51692b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f51694d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f51695e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f51696f = new a();

    /* JADX INFO: renamed from: w7.c$a */
    public class a extends Handler {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r20) {
            /*
                Method dump skipped, instruction units count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.C2939c.a.handleMessage(android.os.Message):void");
        }
    }

    public C2939c(Context context, TableLayout tableLayout) {
        this.f51691a = new k(context, tableLayout);
    }

    public static String i(long j9) {
        Locale locale = Locale.US;
        return j9 >= 1000 ? String.format(locale, "%.2f sec", Float.valueOf(j9 / 1000.0f)) : String.format(locale, "%d msec", Long.valueOf(j9));
    }

    public static String j(long j9) {
        if (j9 >= 100000) {
            return String.format(Locale.US, "%.2f MB", Float.valueOf((j9 / 1000.0f) / 1000.0f));
        }
        Locale locale = Locale.US;
        return j9 >= 100 ? String.format(locale, "%.1f KB", Float.valueOf(j9 / 1000.0f)) : String.format(locale, "%d B", Long.valueOf(j9));
    }

    public static String k(long j9, long j10) {
        if (j10 <= 0 || j9 <= 0) {
            return "0 B/s";
        }
        float f9 = (j9 * 1000.0f) / j10;
        return f9 >= 1000000.0f ? String.format(Locale.US, "%.2f MB/s", Float.valueOf((f9 / 1000.0f) / 1000.0f)) : f9 >= 1000.0f ? String.format(Locale.US, "%.1f KB/s", Float.valueOf(f9 / 1000.0f)) : String.format(Locale.US, "%d B/s", Long.valueOf((long) f9));
    }

    public static int p() {
        return 0;
    }

    public void l(IMediaPlayer iMediaPlayer) {
        this.f51693c = iMediaPlayer;
        if (iMediaPlayer != null) {
            this.f51696f.sendEmptyMessageDelayed(1, 500L);
        } else {
            this.f51696f.removeMessages(1);
        }
    }

    public final void m(int i9, String str) {
        View view = (View) this.f51692b.get(i9);
        if (view != null) {
            this.f51691a.l(view, str);
        } else {
            this.f51692b.put(i9, this.f51691a.c(i9, str));
        }
    }

    public void n(long j9) {
        this.f51694d = j9;
    }

    public void o(long j9) {
        this.f51695e = j9;
    }
}
