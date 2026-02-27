package f7;

import android.content.Context;
import android.provider.MediaStore;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import o0.AbstractC2302b;
import org.achartengine.ChartFactory;

/* JADX INFO: renamed from: f7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1783b extends AbstractC2302b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f40858w = {"_id", ChartFactory.TITLE, "_data", "_size", "date_added", AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE};

    public C1783b(Context context) {
        super(context);
        L(f40858w);
        P(MediaStore.Files.getContentUri("external"));
        O("date_added DESC");
    }
}
