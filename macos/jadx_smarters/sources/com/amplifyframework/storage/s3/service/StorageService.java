package com.amplifyframework.storage.s3.service;

import android.content.Context;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amplifyframework.storage.StorageItem;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface StorageService {

    public interface Factory {
        StorageService create(Context context, Region region, String str);
    }

    void cancelTransfer(TransferObserver transferObserver);

    void deleteObject(String str);

    TransferObserver downloadToFile(String str, File file);

    URL getPresignedUrl(String str, int i9);

    List<StorageItem> listFiles(String str, String str2);

    void pauseTransfer(TransferObserver transferObserver);

    void resumeTransfer(TransferObserver transferObserver);

    TransferObserver uploadFile(String str, File file, ObjectMetadata objectMetadata);

    TransferObserver uploadInputStream(String str, InputStream inputStream, ObjectMetadata objectMetadata) throws IOException;
}
