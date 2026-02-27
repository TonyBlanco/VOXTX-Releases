package com.amplifyframework.storage.s3.service;

import android.content.Context;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.mobileconnectors.s3.transferutility.UploadOptions;
import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.ListObjectsV2Request;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StorageItem;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.utils.S3Keys;
import com.amplifyframework.util.UserAgent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageService implements StorageService {
    private final String bucket;
    private final AmazonS3Client client;
    private final CognitoAuthProvider cognitoAuthProvider;
    private final Context context;
    private final TransferUtility transferUtility;

    public AWSS3StorageService(Context context, Region region, String str, CognitoAuthProvider cognitoAuthProvider, boolean z9) {
        try {
            this.context = context;
            this.bucket = str;
            this.cognitoAuthProvider = cognitoAuthProvider;
            AmazonS3Client amazonS3ClientCreateS3Client = createS3Client(region);
            this.client = amazonS3ClientCreateS3Client;
            if (z9) {
                amazonS3ClientCreateS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());
            }
            this.transferUtility = TransferUtility.builder().context(context).s3Client(amazonS3ClientCreateS3Client).build();
        } catch (StorageException unused) {
            throw new IllegalStateException("AWSS3StoragePlugin depends on AWSCognitoAuthPlugin but it is currently missing.");
        }
    }

    private AmazonS3Client createS3Client(Region region) throws StorageException {
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setUserAgent(UserAgent.string());
        return new AmazonS3Client(this.cognitoAuthProvider.getCredentialsProvider(), region, clientConfiguration);
    }

    private void startTransferService() {
        AmplifyTransferService.Companion.bind(this.context);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void cancelTransfer(TransferObserver transferObserver) {
        this.transferUtility.cancel(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void deleteObject(String str) {
        this.client.deleteObject(this.bucket, str);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver downloadToFile(String str, File file) {
        startTransferService();
        return this.transferUtility.download(this.bucket, str, file);
    }

    public AmazonS3Client getClient() {
        return this.client;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public URL getPresignedUrl(String str, int i9) {
        return this.client.generatePresignedUrl(this.bucket, str, new Date(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(i9)));
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public List<StorageItem> listFiles(String str, String str2) {
        ListObjectsV2Result listObjectsV2ResultListObjectsV2;
        ArrayList arrayList = new ArrayList();
        ListObjectsV2Request listObjectsV2RequestWithPrefix = new ListObjectsV2Request().withBucketName(this.bucket).withPrefix(str);
        do {
            listObjectsV2ResultListObjectsV2 = this.client.listObjectsV2(listObjectsV2RequestWithPrefix);
            for (S3ObjectSummary s3ObjectSummary : listObjectsV2ResultListObjectsV2.getObjectSummaries()) {
                arrayList.add(new StorageItem(S3Keys.extractAmplifyKey(s3ObjectSummary.getKey(), str2), s3ObjectSummary.getSize(), s3ObjectSummary.getLastModified(), s3ObjectSummary.getETag(), null));
            }
            listObjectsV2RequestWithPrefix.setContinuationToken(listObjectsV2ResultListObjectsV2.getNextContinuationToken());
        } while (listObjectsV2ResultListObjectsV2.isTruncated());
        return arrayList;
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void pauseTransfer(TransferObserver transferObserver) {
        this.transferUtility.pause(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public void resumeTransfer(TransferObserver transferObserver) {
        startTransferService();
        this.transferUtility.resume(transferObserver.getId());
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver uploadFile(String str, File file, ObjectMetadata objectMetadata) {
        startTransferService();
        return this.transferUtility.upload(this.bucket, str, file, objectMetadata);
    }

    @Override // com.amplifyframework.storage.s3.service.StorageService
    public TransferObserver uploadInputStream(String str, InputStream inputStream, ObjectMetadata objectMetadata) throws IOException {
        startTransferService();
        return this.transferUtility.upload(str, inputStream, UploadOptions.builder().bucket(this.bucket).objectMetadata(objectMetadata).build());
    }
}
