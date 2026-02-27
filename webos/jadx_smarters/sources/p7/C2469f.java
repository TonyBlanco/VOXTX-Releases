package p7;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.nst.iptvsmarterstvbox.view.activity.BackupAndRestoreActivity;

/* JADX INFO: renamed from: p7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2469f implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BackupAndRestoreActivity f46646a;

    public /* synthetic */ C2469f(BackupAndRestoreActivity backupAndRestoreActivity) {
        this.f46646a = backupAndRestoreActivity;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        this.f46646a.f2((StorageUploadFileResult) obj);
    }
}
