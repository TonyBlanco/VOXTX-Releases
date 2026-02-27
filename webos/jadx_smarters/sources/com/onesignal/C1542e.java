package com.onesignal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.onesignal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1542e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1542e f38711a = new C1542e();

    /* JADX INFO: renamed from: com.onesignal.e$a */
    public interface a {
        void a();

        void b();
    }

    public static final void d(a callback, DialogInterface dialogInterface, int i9) {
        kotlin.jvm.internal.l.e(callback, "$callback");
        callback.a();
    }

    public static final void e(a callback, DialogInterface dialogInterface, int i9) {
        kotlin.jvm.internal.l.e(callback, "$callback");
        callback.b();
    }

    public final void c(Activity activity, String titlePrefix, String previouslyDeniedPostfix, final a callback) {
        kotlin.jvm.internal.l.e(activity, "activity");
        kotlin.jvm.internal.l.e(titlePrefix, "titlePrefix");
        kotlin.jvm.internal.l.e(previouslyDeniedPostfix, "previouslyDeniedPostfix");
        kotlin.jvm.internal.l.e(callback, "callback");
        String string = activity.getString(g2.f38730i);
        kotlin.jvm.internal.l.d(string, "activity.getString(R.str…sion_not_available_title)");
        String str = String.format(string, Arrays.copyOf(new Object[]{titlePrefix}, 1));
        kotlin.jvm.internal.l.d(str, "java.lang.String.format(this, *args)");
        String string2 = activity.getString(g2.f38728g);
        kotlin.jvm.internal.l.d(string2, "activity.getString(R.str…on_not_available_message)");
        String str2 = String.format(string2, Arrays.copyOf(new Object[]{previouslyDeniedPostfix}, 1));
        kotlin.jvm.internal.l.d(str2, "java.lang.String.format(this, *args)");
        new AlertDialog.Builder(activity).setTitle(str).setMessage(str2).setPositiveButton(g2.f38729h, new DialogInterface.OnClickListener() { // from class: com.onesignal.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                C1542e.d(callback, dialogInterface, i9);
            }
        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: com.onesignal.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                C1542e.e(callback, dialogInterface, i9);
            }
        }).show();
    }
}
