package retrofit2.converter.simplexml;

import java.io.IOException;
import okhttp3.ResponseBody;
import org.simpleframework.xml.Serializer;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
final class SimpleXmlResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Class<T> cls;
    private final Serializer serializer;
    private final boolean strict;

    public SimpleXmlResponseBodyConverter(Class<T> cls, Serializer serializer, boolean z9) {
        this.cls = cls;
        this.serializer = serializer;
        this.strict = z9;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        try {
            try {
                T t9 = (T) this.serializer.read((Class) this.cls, responseBody.charStream(), this.strict);
                if (t9 != null) {
                    return t9;
                }
                throw new IllegalStateException("Could not deserialize body as " + this.cls);
            } catch (IOException e9) {
                throw e9;
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        } finally {
            responseBody.close();
        }
    }
}
