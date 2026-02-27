package com.amplifyframework.predictions.result;

import j$.util.Objects;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class TextToSpeechResult {
    private final InputStream audioData;

    private TextToSpeechResult(InputStream inputStream) {
        this.audioData = inputStream;
    }

    public static TextToSpeechResult fromAudioData(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        return new TextToSpeechResult(inputStream);
    }

    public InputStream getAudioData() {
        return this.audioData;
    }
}
