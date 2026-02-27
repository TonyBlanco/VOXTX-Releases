package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ajm implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19948b;

    public /* synthetic */ ajm(aiq aiqVar, int i9) {
        this.f19948b = i9;
        this.f19947a = aiqVar;
    }

    public /* synthetic */ ajm(ajn ajnVar, int i9) {
        this.f19948b = i9;
        this.f19947a = ajnVar;
    }

    public /* synthetic */ ajm(ajx ajxVar, int i9) {
        this.f19948b = i9;
        this.f19947a = ajxVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i9 = this.f19948b;
        if (i9 != 0) {
            if (i9 != 1) {
                ((ajx) this.f19947a).p();
                return;
            } else {
                ((aiq) this.f19947a).k(task);
                return;
            }
        }
        Object obj = this.f19947a;
        if (!task.isSuccessful()) {
            com.google.ads.interactivemedia.v3.impl.data.m.b("Image companion error", task.getException());
        } else {
            ((ajn) obj).setImageBitmap((Bitmap) task.getResult());
        }
    }
}
