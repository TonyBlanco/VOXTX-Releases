package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class alu implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20158b;

    public /* synthetic */ alu(alx alxVar, int i9) {
        this.f20158b = i9;
        this.f20157a = alxVar;
    }

    public /* synthetic */ alu(List list, int i9) {
        this.f20158b = i9;
        this.f20157a = list;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i9 = this.f20158b;
        if (i9 == 0) {
            Object obj = this.f20157a;
            List<alt> list = (List) task.getResult();
            ArrayList arrayList = new ArrayList(list.size());
            for (final alt altVar : list) {
                final alx alxVar = (alx) obj;
                arrayList.add(altVar.b().addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.alv
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        alxVar.d(altVar, exc);
                    }
                }));
            }
            return arrayList;
        }
        if (i9 == 1) {
            return this.f20157a;
        }
        if (i9 == 2) {
            return alx.a((alx) this.f20157a, task);
        }
        if (i9 == 3) {
            List<Task> list2 = (List) task.getResult();
            ArrayList arrayList2 = new ArrayList(list2.size());
            for (Task task2 : list2) {
                if (task2.isSuccessful()) {
                    arrayList2.add(task2.getResult());
                }
            }
            return arrayList2;
        }
        if (i9 != 4) {
            alx alxVar2 = (alx) this.f20157a;
            alxVar2.f20165c.trySetResult(alxVar2.f20163a);
            return null;
        }
        Object obj2 = this.f20157a;
        List<alt> list3 = (List) task.getResult();
        ArrayList arrayList3 = new ArrayList(list3.size());
        for (final alt altVar2 : list3) {
            Task taskC = altVar2.c();
            final alx alxVar3 = (alx) obj2;
            taskC.addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.alw
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    alxVar3.e(altVar2, exc);
                }
            });
            arrayList3.add(taskC);
        }
        return arrayList3;
    }
}
