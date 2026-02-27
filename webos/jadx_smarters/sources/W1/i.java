package W1;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10222c;

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f10223a;

        public a(DisplayMetrics displayMetrics) {
            this.f10223a = displayMetrics;
        }

        @Override // W1.i.b
        public int a() {
            return this.f10223a.heightPixels;
        }

        @Override // W1.i.b
        public int b() {
            return this.f10223a.widthPixels;
        }
    }

    public interface b {
        int a();

        int b();
    }

    public i(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new a(context.getResources().getDisplayMetrics()));
    }

    public i(Context context, ActivityManager activityManager, b bVar) {
        this.f10222c = context;
        int iB = b(activityManager);
        int iB2 = bVar.b() * bVar.a();
        int i9 = iB2 * 16;
        int i10 = iB2 * 8;
        int i11 = i10 + i9;
        if (i11 <= iB) {
            this.f10221b = i10;
        } else {
            int iRound = Math.round(iB / 6.0f);
            this.f10221b = iRound * 2;
            i9 = iRound * 4;
        }
        this.f10220a = i9;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated memory cache size: ");
            sb.append(e(this.f10221b));
            sb.append(" pool size: ");
            sb.append(e(this.f10220a));
            sb.append(" memory class limited? ");
            sb.append(i11 > iB);
            sb.append(" max size: ");
            sb.append(e(iB));
            sb.append(" memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(" isLowMemoryDevice: ");
            sb.append(d(activityManager));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    public static int b(ActivityManager activityManager) {
        return Math.round(activityManager.getMemoryClass() * Constants.MB * (d(activityManager) ? 0.33f : 0.4f));
    }

    public static boolean d(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.f10220a;
    }

    public int c() {
        return this.f10221b;
    }

    public final String e(int i9) {
        return Formatter.formatFileSize(this.f10222c, i9);
    }
}
