package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.internal.ReleasableInputStream;
import com.amazonaws.internal.ResettableInputStream;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.kms.AWSKMSClient;
import com.amazonaws.services.kms.model.GenerateDataKeyRequest;
import com.amazonaws.services.kms.model.GenerateDataKeyResult;
import com.amazonaws.services.s3.AmazonS3EncryptionClient;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.internal.crypto.MultipartUploadCryptoContext;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AbstractPutObjectRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.CryptoStorageMode;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.EncryptionMaterialsFactory;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.amazonaws.services.s3.model.MaterialsDescriptionProvider;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3DataSource;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectId;
import com.amazonaws.services.s3.model.UploadObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.util.Mimetypes;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.LengthCheckInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class S3CryptoModuleBase<T extends MultipartUploadCryptoContext> extends S3CryptoModule<T> {
    protected static final int DEFAULT_BUFFER_SIZE = 2048;
    private static final boolean IS_MULTI_PART = true;
    private static final int MAX_RETRY_COUNT = 9;
    protected final ContentCryptoScheme contentCryptoScheme;
    protected final CryptoConfiguration cryptoConfig;
    protected final S3CryptoScheme cryptoScheme;
    protected final EncryptionMaterialsProvider kekMaterialsProvider;
    protected final AWSKMSClient kms;
    protected final Log log = LogFactory.getLog(getClass());
    protected final Map<String, T> multipartUploadContexts = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    protected final S3Direct f18385s3;

    public S3CryptoModuleBase(AWSKMSClient aWSKMSClient, S3Direct s3Direct, AWSCredentialsProvider aWSCredentialsProvider, EncryptionMaterialsProvider encryptionMaterialsProvider, CryptoConfiguration cryptoConfiguration) {
        if (!cryptoConfiguration.isReadOnly()) {
            throw new IllegalArgumentException("The crypto configuration parameter is required to be read-only");
        }
        this.kekMaterialsProvider = encryptionMaterialsProvider;
        this.f18385s3 = s3Direct;
        this.cryptoConfig = cryptoConfiguration;
        S3CryptoScheme s3CryptoSchemeFrom = S3CryptoScheme.from(cryptoConfiguration.getCryptoMode());
        this.cryptoScheme = s3CryptoSchemeFrom;
        this.contentCryptoScheme = s3CryptoSchemeFrom.getContentCryptoScheme();
        this.kms = aWSKMSClient;
    }

    public S3CryptoModuleBase(S3Direct s3Direct, AWSCredentialsProvider aWSCredentialsProvider, EncryptionMaterialsProvider encryptionMaterialsProvider, CryptoConfiguration cryptoConfiguration) {
        this.kekMaterialsProvider = encryptionMaterialsProvider;
        this.f18385s3 = s3Direct;
        this.cryptoConfig = cryptoConfiguration;
        S3CryptoScheme s3CryptoSchemeFrom = S3CryptoScheme.from(cryptoConfiguration.getCryptoMode());
        this.cryptoScheme = s3CryptoSchemeFrom;
        this.contentCryptoScheme = s3CryptoSchemeFrom.getContentCryptoScheme();
        this.kms = null;
    }

    private ContentCryptoMaterial buildContentCryptoMaterial(EncryptionMaterials encryptionMaterials, Provider provider, AmazonWebServiceRequest amazonWebServiceRequest) throws Throwable {
        byte[] bArr = new byte[this.contentCryptoScheme.getIVLengthInBytes()];
        this.cryptoScheme.getSecureRandom().nextBytes(bArr);
        if (!encryptionMaterials.isKMSEnabled()) {
            return ContentCryptoMaterial.create(generateCEK(encryptionMaterials, provider), bArr, encryptionMaterials, this.cryptoScheme, provider, this.kms, amazonWebServiceRequest);
        }
        Map<String, String> mapMergeMaterialDescriptions = ContentCryptoMaterial.mergeMaterialDescriptions(encryptionMaterials, amazonWebServiceRequest);
        GenerateDataKeyRequest generateDataKeyRequestWithKeySpec = new GenerateDataKeyRequest().withEncryptionContext(mapMergeMaterialDescriptions).withKeyId(encryptionMaterials.getCustomerMasterKeyId()).withKeySpec(this.contentCryptoScheme.getKeySpec());
        generateDataKeyRequestWithKeySpec.withGeneralProgressListener(amazonWebServiceRequest.getGeneralProgressListener()).withRequestMetricCollector(amazonWebServiceRequest.getRequestMetricCollector());
        GenerateDataKeyResult generateDataKeyResultGenerateDataKey = this.kms.generateDataKey(generateDataKeyRequestWithKeySpec);
        return ContentCryptoMaterial.wrap(new SecretKeySpec(BinaryUtils.copyAllBytesFrom(generateDataKeyResultGenerateDataKey.getPlaintext()), this.contentCryptoScheme.getKeyGeneratorAlgorithm()), bArr, this.contentCryptoScheme, provider, new KMSSecuredCEK(BinaryUtils.copyAllBytesFrom(generateDataKeyResultGenerateDataKey.getCiphertextBlob()), mapMergeMaterialDescriptions));
    }

    private ContentCryptoMaterial ccmFromJson(String str) {
        return ContentCryptoMaterial.fromInstructionFile(Collections.unmodifiableMap(JsonUtils.jsonToMap(str)), this.kekMaterialsProvider, this.cryptoConfig.getCryptoProvider(), false, this.kms);
    }

    private ContentCryptoMaterial contentCryptoMaterialOf(S3ObjectWrapper s3ObjectWrapper) {
        if (s3ObjectWrapper.hasEncryptionInfo()) {
            return ContentCryptoMaterial.fromObjectMetadata(s3ObjectWrapper.getObjectMetadata(), this.kekMaterialsProvider, this.cryptoConfig.getCryptoProvider(), false, this.kms);
        }
        S3ObjectWrapper s3ObjectWrapperFetchInstructionFile = fetchInstructionFile(s3ObjectWrapper.getS3ObjectId(), null);
        if (s3ObjectWrapperFetchInstructionFile == null) {
            throw new IllegalArgumentException("S3 object is not encrypted: " + s3ObjectWrapper);
        }
        if (s3ObjectWrapperFetchInstructionFile.isInstructionFile()) {
            return ccmFromJson(s3ObjectWrapperFetchInstructionFile.toJsonString());
        }
        throw new AmazonClientException("Invalid instruction file for S3 object: " + s3ObjectWrapper);
    }

    public static long[] getAdjustedCryptoRange(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long j9 = jArr[0];
        if (j9 > jArr[1]) {
            return null;
        }
        return new long[]{getCipherBlockLowerBound(j9), getCipherBlockUpperBound(jArr[1])};
    }

    private static long getCipherBlockLowerBound(long j9) {
        long j10 = (j9 - (j9 % 16)) - 16;
        if (j10 < 0) {
            return 0L;
        }
        return j10;
    }

    private static long getCipherBlockUpperBound(long j9) {
        long j10 = j9 + (16 - (j9 % 16)) + 16;
        if (j10 < 0) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    private ContentCryptoMaterial newContentCryptoMaterial(EncryptionMaterialsProvider encryptionMaterialsProvider, Provider provider, AmazonWebServiceRequest amazonWebServiceRequest) {
        EncryptionMaterials encryptionMaterials = encryptionMaterialsProvider.getEncryptionMaterials();
        if (encryptionMaterials != null) {
            return buildContentCryptoMaterial(encryptionMaterials, provider, amazonWebServiceRequest);
        }
        throw new AmazonClientException("No material available from the encryption material provider");
    }

    private ContentCryptoMaterial newContentCryptoMaterial(EncryptionMaterialsProvider encryptionMaterialsProvider, Map<String, String> map, Provider provider, AmazonWebServiceRequest amazonWebServiceRequest) {
        EncryptionMaterials encryptionMaterials = encryptionMaterialsProvider.getEncryptionMaterials(map);
        if (encryptionMaterials == null) {
            return null;
        }
        return buildContentCryptoMaterial(encryptionMaterials, provider, amazonWebServiceRequest);
    }

    private CipherLiteInputStream newS3CipherLiteInputStream(AbstractPutObjectRequest abstractPutObjectRequest, ContentCryptoMaterial contentCryptoMaterial, long j9) {
        File file = abstractPutObjectRequest.getFile();
        InputStream inputStream = abstractPutObjectRequest.getInputStream();
        InputStream resettableInputStream = null;
        try {
            if (file != null) {
                resettableInputStream = new ResettableInputStream(file);
            } else if (inputStream != null) {
                resettableInputStream = ReleasableInputStream.wrap(inputStream);
            }
            if (j9 > -1) {
                resettableInputStream = new LengthCheckInputStream(resettableInputStream, j9, false);
            }
            CipherLite cipherLite = contentCryptoMaterial.getCipherLite();
            return cipherLite.markSupported() ? new CipherLiteInputStream(resettableInputStream, cipherLite, 2048) : new RenewableCipherLiteInputStream(resettableInputStream, cipherLite, 2048);
        } catch (Exception e9) {
            S3DataSource.Utils.cleanupDataSource(abstractPutObjectRequest, file, inputStream, null, this.log);
            throw new AmazonClientException("Unable to create cipher input stream", e9);
        }
    }

    private PutObjectResult putObjectUsingInstructionFile(PutObjectRequest putObjectRequest) {
        File file = putObjectRequest.getFile();
        InputStream inputStream = putObjectRequest.getInputStream();
        PutObjectRequest putObjectRequestWithInputStream = putObjectRequest.mo5clone().withFile((File) null).withInputStream((InputStream) null);
        putObjectRequestWithInputStream.setKey(putObjectRequestWithInputStream.getKey() + InstructionFileId.DOT + "instruction");
        ContentCryptoMaterial contentCryptoMaterialCreateContentCryptoMaterial = createContentCryptoMaterial(putObjectRequest);
        PutObjectRequest putObjectRequest2 = (PutObjectRequest) wrapWithCipher(putObjectRequest, contentCryptoMaterialCreateContentCryptoMaterial);
        try {
            PutObjectResult putObjectResultPutObject = this.f18385s3.putObject(putObjectRequest2);
            S3DataSource.Utils.cleanupDataSource(putObjectRequest, file, inputStream, putObjectRequest2.getInputStream(), this.log);
            this.f18385s3.putObject(updateInstructionPutRequest(putObjectRequestWithInputStream, contentCryptoMaterialCreateContentCryptoMaterial));
            return putObjectResultPutObject;
        } catch (Throwable th) {
            S3DataSource.Utils.cleanupDataSource(putObjectRequest, file, inputStream, putObjectRequest2.getInputStream(), this.log);
            throw th;
        }
    }

    private PutObjectResult putObjectUsingMetadata(PutObjectRequest putObjectRequest) {
        ContentCryptoMaterial contentCryptoMaterialCreateContentCryptoMaterial = createContentCryptoMaterial(putObjectRequest);
        File file = putObjectRequest.getFile();
        InputStream inputStream = putObjectRequest.getInputStream();
        PutObjectRequest putObjectRequest2 = (PutObjectRequest) wrapWithCipher(putObjectRequest, contentCryptoMaterialCreateContentCryptoMaterial);
        putObjectRequest.setMetadata(updateMetadataWithContentCryptoMaterial(putObjectRequest.getMetadata(), putObjectRequest.getFile(), contentCryptoMaterialCreateContentCryptoMaterial));
        try {
            return this.f18385s3.putObject(putObjectRequest2);
        } finally {
            S3DataSource.Utils.cleanupDataSource(putObjectRequest, file, inputStream, putObjectRequest2.getInputStream(), this.log);
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public final void abortMultipartUploadSecurely(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        this.f18385s3.abortMultipartUpload(abortMultipartUploadRequest);
        this.multipartUploadContexts.remove(abortMultipartUploadRequest.getUploadId());
    }

    public final <X extends AmazonWebServiceRequest> X appendUserAgent(X x9, String str) {
        x9.getRequestClientOptions().appendUserAgent(str);
        return x9;
    }

    public abstract CipherLite cipherLiteForNextPart(T t9);

    public abstract long ciphertextLength(long j9);

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public CompleteMultipartUploadResult completeMultipartUploadSecurely(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        appendUserAgent(completeMultipartUploadRequest, AmazonS3EncryptionClient.USER_AGENT);
        String uploadId = completeMultipartUploadRequest.getUploadId();
        T t9 = this.multipartUploadContexts.get(uploadId);
        if (t9 != null && !t9.hasFinalPartBeenSeen()) {
            throw new AmazonClientException("Unable to complete an encrypted multipart upload without being told which part was the last.  Without knowing which part was the last, the encrypted data in Amazon S3 is incomplete and corrupt.");
        }
        CompleteMultipartUploadResult completeMultipartUploadResultCompleteMultipartUpload = this.f18385s3.completeMultipartUpload(completeMultipartUploadRequest);
        if (t9 != null && this.cryptoConfig.getStorageMode() == CryptoStorageMode.InstructionFile) {
            this.f18385s3.putObject(createInstructionPutRequest(t9.getBucketName(), t9.getKey(), t9.getContentCryptoMaterial()));
        }
        this.multipartUploadContexts.remove(uploadId);
        return completeMultipartUploadResultCompleteMultipartUpload;
    }

    public abstract long computeLastPartSize(UploadPartRequest uploadPartRequest);

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public final CopyPartResult copyPartSecurely(CopyPartRequest copyPartRequest) {
        T t9 = this.multipartUploadContexts.get(copyPartRequest.getUploadId());
        CopyPartResult copyPartResultCopyPart = this.f18385s3.copyPart(copyPartRequest);
        if (t9 != null && !t9.hasFinalPartBeenSeen()) {
            t9.setHasFinalPartBeenSeen(true);
        }
        return copyPartResultCopyPart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ContentCryptoMaterial createContentCryptoMaterial(AmazonWebServiceRequest amazonWebServiceRequest) {
        EncryptionMaterials encryptionMaterials;
        if ((amazonWebServiceRequest instanceof EncryptionMaterialsFactory) && (encryptionMaterials = ((EncryptionMaterialsFactory) amazonWebServiceRequest).getEncryptionMaterials()) != null) {
            return buildContentCryptoMaterial(encryptionMaterials, this.cryptoConfig.getCryptoProvider(), amazonWebServiceRequest);
        }
        if (amazonWebServiceRequest instanceof MaterialsDescriptionProvider) {
            Map<String, String> materialsDescription = ((MaterialsDescriptionProvider) amazonWebServiceRequest).getMaterialsDescription();
            ContentCryptoMaterial contentCryptoMaterialNewContentCryptoMaterial = newContentCryptoMaterial(this.kekMaterialsProvider, materialsDescription, this.cryptoConfig.getCryptoProvider(), amazonWebServiceRequest);
            if (contentCryptoMaterialNewContentCryptoMaterial != null) {
                return contentCryptoMaterialNewContentCryptoMaterial;
            }
            if (materialsDescription != null && !this.kekMaterialsProvider.getEncryptionMaterials().isKMSEnabled()) {
                throw new AmazonClientException("No material available from the encryption material provider for description " + materialsDescription);
            }
        }
        return newContentCryptoMaterial(this.kekMaterialsProvider, this.cryptoConfig.getCryptoProvider(), amazonWebServiceRequest);
    }

    public final GetObjectRequest createInstructionGetRequest(S3ObjectId s3ObjectId) {
        return createInstructionGetRequest(s3ObjectId, null);
    }

    public final GetObjectRequest createInstructionGetRequest(S3ObjectId s3ObjectId, String str) {
        return new GetObjectRequest(s3ObjectId.instructionFileId(str));
    }

    public final PutObjectRequest createInstructionPutRequest(String str, String str2, ContentCryptoMaterial contentCryptoMaterial) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(contentCryptoMaterial.toJsonString(this.cryptoConfig.getCryptoMode()).getBytes(StringUtils.UTF8));
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(r7.length);
        objectMetadata.addUserMetadata(Headers.CRYPTO_INSTRUCTION_FILE, "");
        InstructionFileId instructionFileId = new S3ObjectId(str, str2).instructionFileId();
        return new PutObjectRequest(instructionFileId.getBucket(), instructionFileId.getKey(), byteArrayInputStream, objectMetadata);
    }

    public final S3ObjectWrapper fetchInstructionFile(S3ObjectId s3ObjectId, String str) {
        try {
            S3Object object = this.f18385s3.getObject(createInstructionGetRequest(s3ObjectId, str));
            if (object == null) {
                return null;
            }
            return new S3ObjectWrapper(object, s3ObjectId);
        } catch (AmazonServiceException e9) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("Unable to retrieve instruction file : " + e9.getMessage());
            }
            return null;
        }
    }

    public final SecretKey generateCEK(EncryptionMaterials encryptionMaterials, Provider provider) {
        boolean zEquals;
        String keyGeneratorAlgorithm = this.contentCryptoScheme.getKeyGeneratorAlgorithm();
        try {
            KeyGenerator keyGenerator = provider == null ? KeyGenerator.getInstance(keyGeneratorAlgorithm) : KeyGenerator.getInstance(keyGeneratorAlgorithm, provider);
            keyGenerator.init(this.contentCryptoScheme.getKeyLengthInBits(), this.cryptoScheme.getSecureRandom());
            KeyPair keyPair = encryptionMaterials.getKeyPair();
            if (keyPair == null || this.cryptoScheme.getKeyWrapScheme().getKeyWrapAlgorithm(keyPair.getPublic(), provider) != null) {
                zEquals = false;
            } else {
                Provider provider2 = keyGenerator.getProvider();
                zEquals = "BC".equals(provider2 == null ? null : provider2.getName());
            }
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            if (zEquals && secretKeyGenerateKey.getEncoded()[0] == 0) {
                for (int i9 = 0; i9 < 9; i9++) {
                    SecretKey secretKeyGenerateKey2 = keyGenerator.generateKey();
                    if (secretKeyGenerateKey2.getEncoded()[0] != 0) {
                        return secretKeyGenerateKey2;
                    }
                }
                throw new AmazonClientException("Failed to generate secret key");
            }
            return secretKeyGenerateKey;
        } catch (NoSuchAlgorithmException e9) {
            throw new AmazonClientException("Unable to generate envelope symmetric key:" + e9.getMessage(), e9);
        }
    }

    public final S3CryptoScheme getS3CryptoScheme() {
        return this.cryptoScheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public InitiateMultipartUploadResult initiateMultipartUploadSecurely(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
        appendUserAgent(initiateMultipartUploadRequest, AmazonS3EncryptionClient.USER_AGENT);
        ContentCryptoMaterial contentCryptoMaterialCreateContentCryptoMaterial = createContentCryptoMaterial(initiateMultipartUploadRequest);
        if (this.cryptoConfig.getStorageMode() == CryptoStorageMode.ObjectMetadata) {
            ObjectMetadata objectMetadata = initiateMultipartUploadRequest.getObjectMetadata();
            if (objectMetadata == null) {
                objectMetadata = new ObjectMetadata();
            }
            initiateMultipartUploadRequest.setObjectMetadata(updateMetadataWithContentCryptoMaterial(objectMetadata, null, contentCryptoMaterialCreateContentCryptoMaterial));
        }
        InitiateMultipartUploadResult initiateMultipartUploadResultInitiateMultipartUpload = this.f18385s3.initiateMultipartUpload(initiateMultipartUploadRequest);
        MultipartUploadCryptoContext multipartUploadCryptoContextNewUploadContext = newUploadContext(initiateMultipartUploadRequest, contentCryptoMaterialCreateContentCryptoMaterial);
        if (initiateMultipartUploadRequest instanceof MaterialsDescriptionProvider) {
            multipartUploadCryptoContextNewUploadContext.setMaterialsDescription(((MaterialsDescriptionProvider) initiateMultipartUploadRequest).getMaterialsDescription());
        }
        this.multipartUploadContexts.put(initiateMultipartUploadResultInitiateMultipartUpload.getUploadId(), multipartUploadCryptoContextNewUploadContext);
        return initiateMultipartUploadResultInitiateMultipartUpload;
    }

    public final CipherLiteInputStream newMultipartS3CipherInputStream(UploadPartRequest uploadPartRequest, CipherLite cipherLite) {
        InputStream resettableInputStream;
        File file = uploadPartRequest.getFile();
        InputStream inputStream = uploadPartRequest.getInputStream();
        InputSubstream inputSubstream = null;
        try {
            if (file != null) {
                resettableInputStream = new ResettableInputStream(file);
            } else {
                if (inputStream == null) {
                    throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
                }
                resettableInputStream = inputStream;
            }
            InputSubstream inputSubstream2 = new InputSubstream(resettableInputStream, uploadPartRequest.getFileOffset(), uploadPartRequest.getPartSize(), uploadPartRequest.isLastPart());
            try {
                return cipherLite.markSupported() ? new CipherLiteInputStream(inputSubstream2, cipherLite, 2048, true, uploadPartRequest.isLastPart()) : new RenewableCipherLiteInputStream(inputSubstream2, cipherLite, 2048, true, uploadPartRequest.isLastPart());
            } catch (Exception e9) {
                e = e9;
                inputSubstream = inputSubstream2;
                S3DataSource.Utils.cleanupDataSource(uploadPartRequest, file, inputStream, inputSubstream, this.log);
                throw new AmazonClientException("Unable to create cipher input stream", e);
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public abstract T newUploadContext(InitiateMultipartUploadRequest initiateMultipartUploadRequest, ContentCryptoMaterial contentCryptoMaterial);

    public final long plaintextLength(AbstractPutObjectRequest abstractPutObjectRequest, ObjectMetadata objectMetadata) {
        if (abstractPutObjectRequest.getFile() != null) {
            return abstractPutObjectRequest.getFile().length();
        }
        if (abstractPutObjectRequest.getInputStream() == null || objectMetadata.getRawMetadataValue("Content-Length") == null) {
            return -1L;
        }
        return objectMetadata.getContentLength();
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public final PutObjectResult putInstructionFileSecurely(PutInstructionFileRequest putInstructionFileRequest) {
        S3ObjectId s3ObjectId = putInstructionFileRequest.getS3ObjectId();
        GetObjectRequest getObjectRequest = new GetObjectRequest(s3ObjectId);
        appendUserAgent(getObjectRequest, AmazonS3EncryptionClient.USER_AGENT);
        S3Object object = this.f18385s3.getObject(getObjectRequest);
        IOUtils.closeQuietly(object, this.log);
        if (object == null) {
            throw new IllegalArgumentException("The specified S3 object (" + s3ObjectId + ") doesn't exist.");
        }
        S3ObjectWrapper s3ObjectWrapper = new S3ObjectWrapper(object, s3ObjectId);
        try {
            ContentCryptoMaterial contentCryptoMaterialContentCryptoMaterialOf = contentCryptoMaterialOf(s3ObjectWrapper);
            if (ContentCryptoScheme.AES_GCM.equals(contentCryptoMaterialContentCryptoMaterialOf.getContentCryptoScheme()) && this.cryptoConfig.getCryptoMode() == CryptoMode.EncryptionOnly) {
                throw new SecurityException("Lowering the protection of encryption material is not allowed");
            }
            securityCheck(contentCryptoMaterialContentCryptoMaterialOf, s3ObjectWrapper);
            EncryptionMaterials encryptionMaterials = putInstructionFileRequest.getEncryptionMaterials();
            return this.f18385s3.putObject(updateInstructionPutRequest(putInstructionFileRequest.createPutObjectRequest(object), encryptionMaterials == null ? contentCryptoMaterialContentCryptoMaterialOf.recreate(putInstructionFileRequest.getMaterialsDescription(), this.kekMaterialsProvider, this.cryptoScheme, this.cryptoConfig.getCryptoProvider(), this.kms, putInstructionFileRequest) : contentCryptoMaterialContentCryptoMaterialOf.recreate(encryptionMaterials, this.kekMaterialsProvider, this.cryptoScheme, this.cryptoConfig.getCryptoProvider(), this.kms, putInstructionFileRequest)));
        } catch (Error e9) {
            IOUtils.closeQuietly(object, this.log);
            throw e9;
        } catch (RuntimeException e10) {
            IOUtils.closeQuietly(object, this.log);
            throw e10;
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public final void putLocalObjectSecurely(UploadObjectRequest uploadObjectRequest, String str, OutputStream outputStream) throws IOException {
        UploadObjectRequest uploadObjectRequestMo5clone = uploadObjectRequest.mo5clone();
        File file = uploadObjectRequestMo5clone.getFile();
        InputStream inputStream = uploadObjectRequestMo5clone.getInputStream();
        T t9 = this.multipartUploadContexts.get(str);
        UploadObjectRequest uploadObjectRequest2 = (UploadObjectRequest) wrapWithCipher(uploadObjectRequestMo5clone, t9.getContentCryptoMaterial());
        try {
            IOUtils.copy(uploadObjectRequest2.getInputStream(), outputStream);
            t9.setHasFinalPartBeenSeen(true);
        } finally {
            S3DataSource.Utils.cleanupDataSource(uploadObjectRequest2, file, inputStream, uploadObjectRequest2.getInputStream(), this.log);
            IOUtils.closeQuietly(outputStream, this.log);
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest) {
        appendUserAgent(putObjectRequest, AmazonS3EncryptionClient.USER_AGENT);
        return this.cryptoConfig.getStorageMode() == CryptoStorageMode.InstructionFile ? putObjectUsingInstructionFile(putObjectRequest) : putObjectUsingMetadata(putObjectRequest);
    }

    public void securityCheck(ContentCryptoMaterial contentCryptoMaterial, S3ObjectWrapper s3ObjectWrapper) {
    }

    public final PutObjectRequest updateInstructionPutRequest(PutObjectRequest putObjectRequest, ContentCryptoMaterial contentCryptoMaterial) {
        byte[] bytes = contentCryptoMaterial.toJsonString(this.cryptoConfig.getCryptoMode()).getBytes(StringUtils.UTF8);
        ObjectMetadata metadata = putObjectRequest.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
            putObjectRequest.setMetadata(metadata);
        }
        metadata.setContentLength(bytes.length);
        metadata.addUserMetadata(Headers.CRYPTO_INSTRUCTION_FILE, "");
        putObjectRequest.setMetadata(metadata);
        putObjectRequest.setInputStream(new ByteArrayInputStream(bytes));
        return putObjectRequest;
    }

    public final ObjectMetadata updateMetadataWithContentCryptoMaterial(ObjectMetadata objectMetadata, File file, ContentCryptoMaterial contentCryptoMaterial) {
        if (objectMetadata == null) {
            objectMetadata = new ObjectMetadata();
        }
        if (file != null) {
            objectMetadata.setContentType(Mimetypes.getInstance().getMimetype(file));
        }
        return contentCryptoMaterial.toObjectMetadata(objectMetadata, this.cryptoConfig.getCryptoMode());
    }

    public abstract void updateUploadContext(T t9, SdkFilterInputStream sdkFilterInputStream);

    @Override // com.amazonaws.services.s3.internal.crypto.S3CryptoModule
    public UploadPartResult uploadPartSecurely(UploadPartRequest uploadPartRequest) throws Throwable {
        appendUserAgent(uploadPartRequest, AmazonS3EncryptionClient.USER_AGENT);
        int blockSizeInBytes = this.contentCryptoScheme.getBlockSizeInBytes();
        boolean zIsLastPart = uploadPartRequest.isLastPart();
        String uploadId = uploadPartRequest.getUploadId();
        long partSize = uploadPartRequest.getPartSize();
        boolean z9 = 0 == partSize % ((long) blockSizeInBytes);
        if (!zIsLastPart && !z9) {
            throw new AmazonClientException("Invalid part size: part sizes for encrypted multipart uploads must be multiples of the cipher block size (" + blockSizeInBytes + ") with the exception of the last part.");
        }
        T t9 = this.multipartUploadContexts.get(uploadId);
        if (t9 == null) {
            throw new AmazonClientException("No client-side information available on upload ID " + uploadId);
        }
        t9.beginPartUpload(uploadPartRequest.getPartNumber());
        CipherLite cipherLiteCipherLiteForNextPart = cipherLiteForNextPart(t9);
        File file = uploadPartRequest.getFile();
        InputStream inputStream = uploadPartRequest.getInputStream();
        CipherLiteInputStream cipherLiteInputStream = null;
        try {
            CipherLiteInputStream cipherLiteInputStreamNewMultipartS3CipherInputStream = newMultipartS3CipherInputStream(uploadPartRequest, cipherLiteCipherLiteForNextPart);
            try {
                SdkFilterInputStream sdkFilterInputStreamWrapForMultipart = wrapForMultipart(cipherLiteInputStreamNewMultipartS3CipherInputStream, partSize);
                uploadPartRequest.setInputStream(sdkFilterInputStreamWrapForMultipart);
                uploadPartRequest.setFile(null);
                uploadPartRequest.setFileOffset(0L);
                if (zIsLastPart) {
                    long jComputeLastPartSize = computeLastPartSize(uploadPartRequest);
                    if (jComputeLastPartSize > -1) {
                        uploadPartRequest.setPartSize(jComputeLastPartSize);
                    }
                    if (t9.hasFinalPartBeenSeen()) {
                        throw new AmazonClientException("This part was specified as the last part in a multipart upload, but a previous part was already marked as the last part.  Only the last part of the upload should be marked as the last part.");
                    }
                }
                UploadPartResult uploadPartResultUploadPart = this.f18385s3.uploadPart(uploadPartRequest);
                S3DataSource.Utils.cleanupDataSource(uploadPartRequest, file, inputStream, sdkFilterInputStreamWrapForMultipart, this.log);
                t9.endPartUpload();
                if (zIsLastPart) {
                    t9.setHasFinalPartBeenSeen(true);
                }
                updateUploadContext(t9, sdkFilterInputStreamWrapForMultipart);
                return uploadPartResultUploadPart;
            } catch (Throwable th) {
                th = th;
                cipherLiteInputStream = cipherLiteInputStreamNewMultipartS3CipherInputStream;
                S3DataSource.Utils.cleanupDataSource(uploadPartRequest, file, inputStream, cipherLiteInputStream, this.log);
                t9.endPartUpload();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public abstract <I extends CipherLiteInputStream> SdkFilterInputStream wrapForMultipart(I i9, long j9);

    public final <R extends AbstractPutObjectRequest> R wrapWithCipher(R r9, ContentCryptoMaterial contentCryptoMaterial) {
        ObjectMetadata metadata = r9.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
        }
        if (metadata.getContentMD5() != null) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_MD5, metadata.getContentMD5());
        }
        metadata.setContentMD5(null);
        long jPlaintextLength = plaintextLength(r9, metadata);
        if (jPlaintextLength >= 0) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_LENGTH, Long.toString(jPlaintextLength));
            metadata.setContentLength(ciphertextLength(jPlaintextLength));
        }
        r9.setMetadata(metadata);
        r9.setInputStream(newS3CipherLiteInputStream(r9, contentCryptoMaterial, jPlaintextLength));
        r9.setFile(null);
        return r9;
    }
}
