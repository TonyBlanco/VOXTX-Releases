package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bkl<T> {
    public final T fromJson(Reader reader) throws IOException {
        return read(new boh(reader));
    }

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final T fromJsonTree(bjy bjyVar) {
        try {
            return read(new bmc(bjyVar));
        } catch (IOException e9) {
            throw new bjz(e9);
        }
    }

    public final bkl<T> nullSafe() {
        return new bkk(this);
    }

    public abstract T read(boh bohVar) throws IOException;

    public final String toJson(T t9) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t9);
            return stringWriter.toString();
        } catch (IOException e9) {
            throw new bjz(e9);
        }
    }

    public final void toJson(Writer writer, T t9) throws IOException {
        write(new boj(writer), t9);
    }

    public final bjy toJsonTree(T t9) {
        try {
            bme bmeVar = new bme();
            write(bmeVar, t9);
            return bmeVar.a();
        } catch (IOException e9) {
            throw new bjz(e9);
        }
    }

    public abstract void write(boj bojVar, T t9) throws IOException;
}
