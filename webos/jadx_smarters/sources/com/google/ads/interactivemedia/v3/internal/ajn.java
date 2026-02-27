package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class ajn extends ImageView implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompanionData f19949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ajx f19950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f19952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aly f19953e;

    public ajn(Context context, ajx ajxVar, CompanionData companionData, Task task, String str, List list, aly alyVar) {
        super(context);
        this.f19950b = ajxVar;
        this.f19949a = companionData;
        this.f19951c = str;
        this.f19952d = list;
        this.f19953e = alyVar;
        setOnClickListener(this);
        task.addOnCompleteListener(new ajm(this, 0));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        for (CompanionAdSlot.ClickListener clickListener : this.f19952d) {
        }
        this.f19953e.a(this.f19949a.clickThroughUrl());
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ajx ajxVar = this.f19950b;
        String strCompanionId = this.f19949a.companionId();
        String str = this.f19951c;
        if (atp.c(strCompanionId) || atp.c(str)) {
            return;
        }
        HashMap mapP = axo.p(1);
        mapP.put("companionId", strCompanionId);
        ajxVar.o(new ajr(ajp.displayContainer, ajq.companionView, str, mapP));
    }
}
