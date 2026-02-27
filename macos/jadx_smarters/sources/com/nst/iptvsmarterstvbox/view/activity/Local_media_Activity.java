package com.nst.iptvsmarterstvbox.view.activity;

import a7.g;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.b;
import e7.C1747a;
import e7.e;
import e7.f;
import g7.C1840b;
import java.util.Iterator;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class Local_media_Activity extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C2858a f30521e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f30522d = this;

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        if (i9 == 512) {
            if (i10 == -1) {
                Iterator it = intent.getParcelableArrayListExtra("ResultPickVideo").iterator();
                while (it.hasNext()) {
                    String strX = ((f) it.next()).x();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strX);
                    sb.append("\n");
                }
                return;
            }
            return;
        }
        if (i9 == 768) {
            if (i10 == -1) {
                Iterator it2 = intent.getParcelableArrayListExtra("ResultPickAudio").iterator();
                while (it2.hasNext()) {
                    String strX2 = ((C1747a) it2.next()).x();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strX2);
                    sb2.append("\n");
                }
                return;
            }
            return;
        }
        if (i9 == 1024 && i10 == -1) {
            Iterator it3 = intent.getParcelableArrayListExtra("ResultPickFILE").iterator();
            while (it3.hasNext()) {
                String strX3 = ((e) it3.next()).x();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strX3);
                sb3.append("\n");
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this.f30522d, (Class<?>) RoutingActivity.class));
        finishAffinity();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == a7.f.f12452l1) {
            Intent intent = new Intent(this, (Class<?>) VideoPickActivity.class);
            intent.putExtra("IsNeedCamera", false);
            intent.putExtra("MaxNumber", 9);
            intent.putExtra("isNeedFolderList", true);
            startActivity(intent);
            return;
        }
        if (id == a7.f.f12432j1) {
            Intent intent2 = new Intent(this, (Class<?>) AudioPickActivity.class);
            intent2.putExtra("IsNeedRecorder", false);
            intent2.putExtra("MaxNumber", 9);
            intent2.putExtra("isNeedFolderList", true);
            startActivityForResult(intent2, 768);
            return;
        }
        if (id == a7.f.f12442k1) {
            final String[] strArr = {""};
            C1840b c1840b = new C1840b(this.f30522d, new C1840b.g() { // from class: p7.J
            });
            if (Build.VERSION.SDK_INT >= 30) {
                c1840b.x("");
            } else {
                c1840b.w("");
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f30522d = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f30522d);
        f30521e = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12716T : g.f12710S);
    }
}
