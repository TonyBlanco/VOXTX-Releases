package com.google.ads.interactivemedia.v3.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
final class qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f24224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f24225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24226c;

    public qj(Queue queue, BufferedReader bufferedReader) {
        this.f24225b = queue;
        this.f24224a = bufferedReader;
    }

    public final String a() throws IOException {
        if (!b()) {
            throw new NoSuchElementException();
        }
        String str = this.f24226c;
        this.f24226c = null;
        return str;
    }

    public final boolean b() throws IOException {
        String strTrim;
        if (this.f24226c != null) {
            return true;
        }
        if (!this.f24225b.isEmpty()) {
            String str = (String) this.f24225b.poll();
            af.s(str);
            this.f24226c = str;
            return true;
        }
        do {
            String line = this.f24224a.readLine();
            this.f24226c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f24226c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }
}
