package a7;

import android.content.Context;
import android.content.Intent;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static boolean a(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static String b(String str) {
        return str.substring(str.lastIndexOf("/") + 1);
    }

    public static String c(String str) {
        return str.substring(0, str.lastIndexOf("/"));
    }

    public static String d(long j9) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        long j10 = (j9 % TimeChart.DAY) / 3600000;
        long j11 = (j9 % 3600000) / 60000;
        long j12 = (j9 % 60000) / 1000;
        if (j10 < 10) {
            sb = new StringBuilder();
            sb.append("0");
            sb.append(j10);
        } else {
            sb = new StringBuilder();
            sb.append(j10);
            sb.append("");
        }
        String string = sb.toString();
        if (j11 < 10) {
            sb2 = new StringBuilder();
            sb2.append("0");
            sb2.append(j11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j11);
            sb2.append("");
        }
        String string2 = sb2.toString();
        if (j12 < 10) {
            sb3 = new StringBuilder();
            sb3.append("0");
            sb3.append(j12);
        } else {
            sb3 = new StringBuilder();
            sb3.append(j12);
            sb3.append("");
        }
        String string3 = sb3.toString();
        if (j10 != 0) {
            sb4 = new StringBuilder();
            sb4.append(string);
            sb4.append(":");
        } else {
            sb4 = new StringBuilder();
        }
        sb4.append(string2);
        sb4.append(":");
        sb4.append(string3);
        return sb4.toString();
    }
}
