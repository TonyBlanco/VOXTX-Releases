package p7;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.nst.iptvsmarterstvbox.view.activity.BackupAndRestoreActivity;

/* JADX INFO: renamed from: p7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2471g implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BackupAndRestoreActivity f46648a;

    public /* synthetic */ C2471g(BackupAndRestoreActivity backupAndRestoreActivity) {
        this.f46648a = backupAndRestoreActivity;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        this.f46648a.c2((StorageException) obj);
    }
}
