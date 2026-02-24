package p7;

import Q8.b;
import Q8.c;
import a7.C1114a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: p7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractActivityC2479k extends androidx.appcompat.app.b implements c.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46655f = "p7.k";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1114a f46656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46657e;

    @Q8.a(123)
    private void readExternalStorage() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (E.b.checkSelfPermission(this, "android.permission.READ_MEDIA_VIDEO") != 0) {
                Q8.c.f(this, getString(a7.j.f13042J8), 123, "android.permission.READ_MEDIA_VIDEO");
                return;
            } else if (E.b.checkSelfPermission(this, "android.permission.READ_MEDIA_AUDIO") != 0) {
                Q8.c.f(this, getString(a7.j.f13042J8), 123, "android.permission.READ_MEDIA_AUDIO");
                return;
            }
        } else if (!Q8.c.a(this, "android.permission.READ_EXTERNAL_STORAGE")) {
            Q8.c.f(this, getString(a7.j.f13042J8), 123, "android.permission.READ_EXTERNAL_STORAGE");
            return;
        }
        u1();
    }

    @Override // Q8.c.a
    public void F0(int i9, List list) {
        Log.d(f46655f, "onPermissionsGranted:" + i9 + ":" + list.size());
        u1();
    }

    @Override // Q8.c.a
    public void k(int i9, List list) {
        Log.d(f46655f, "onPermissionsDenied:" + i9 + ":" + list.size());
        if (Q8.c.h(this, list)) {
            new b.C0111b(this).a().e();
        } else {
            finish();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 16061) {
            if (Q8.c.a(this, "android.permission.READ_EXTERNAL_STORAGE")) {
                u1();
            } else {
                finish();
            }
        }
    }

    public void onBackClick(View view) {
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("isNeedFolderList", false);
        this.f46657e = booleanExtra;
        if (booleanExtra) {
            C1114a c1114a = new C1114a();
            this.f46656d = c1114a;
            c1114a.b(this);
        }
    }

    @Override // androidx.appcompat.app.b, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        readExternalStorage();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        Q8.c.d(i9, strArr, iArr, this);
    }

    public abstract void u1();
}
