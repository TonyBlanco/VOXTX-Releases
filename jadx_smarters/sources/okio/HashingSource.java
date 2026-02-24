package okio;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k8.q;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HashingSource extends ForwardingSource {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        @NotNull
        public final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString key) {
            l.e(source, "source");
            l.e(key, "key");
            return new HashingSource(source, key, Constants.HMAC_SHA1_ALGORITHM);
        }

        @NotNull
        public final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString key) {
            l.e(source, "source");
            l.e(key, "key");
            return new HashingSource(source, key, "HmacSHA256");
        }

        @NotNull
        public final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString key) {
            l.e(source, "source");
            l.e(key, "key");
            return new HashingSource(source, key, "HmacSHA512");
        }

        @NotNull
        public final HashingSource md5(@NotNull Source source) {
            l.e(source, "source");
            return new HashingSource(source, MessageDigestAlgorithms.MD5);
        }

        @NotNull
        public final HashingSource sha1(@NotNull Source source) {
            l.e(source, "source");
            return new HashingSource(source, MessageDigestAlgorithms.SHA_1);
        }

        @NotNull
        public final HashingSource sha256(@NotNull Source source) {
            l.e(source, "source");
            return new HashingSource(source, MessageDigestAlgorithms.SHA_256);
        }

        @NotNull
        public final HashingSource sha512(@NotNull Source source) {
            l.e(source, "source");
            return new HashingSource(source, MessageDigestAlgorithms.SHA_512);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull String algorithm) {
        super(source);
        l.e(source, "source");
        l.e(algorithm, "algorithm");
        this.messageDigest = MessageDigest.getInstance(algorithm);
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull ByteString key, @NotNull String algorithm) throws NoSuchAlgorithmException {
        super(source);
        l.e(source, "source");
        l.e(key, "key");
        l.e(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            q qVar = q.f43674a;
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    @NotNull
    public static final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    @NotNull
    public static final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    @NotNull
    public static final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    @NotNull
    public static final HashingSource md5(@NotNull Source source) {
        return Companion.md5(source);
    }

    @NotNull
    public static final HashingSource sha1(@NotNull Source source) {
        return Companion.sha1(source);
    }

    @NotNull
    public static final HashingSource sha256(@NotNull Source source) {
        return Companion.sha256(source);
    }

    @NotNull
    public static final HashingSource sha512(@NotNull Source source) {
        return Companion.sha512(source);
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m180deprecated_hash() {
        return hash();
    }

    @NotNull
    public final ByteString hash() {
        byte[] result;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            result = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            l.b(mac);
            result = mac.doFinal();
        }
        l.d(result, "result");
        return new ByteString(result);
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer sink, long j9) throws IOException {
        l.e(sink, "sink");
        long j10 = super.read(sink, j9);
        if (j10 != -1) {
            long size = sink.size() - j10;
            long size2 = sink.size();
            Segment segment = sink.head;
            l.b(segment);
            while (size2 > size) {
                segment = segment.prev;
                l.b(segment);
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < sink.size()) {
                int i9 = (int) ((((long) segment.pos) + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i9, segment.limit - i9);
                } else {
                    Mac mac = this.mac;
                    l.b(mac);
                    mac.update(segment.data, i9, segment.limit - i9);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                l.b(segment);
                size = size2;
            }
        }
        return j10;
    }
}
