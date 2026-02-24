package org.jsoup.parser;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
class ParseErrorList extends ArrayList<ParseError> {
    private static final int INITIAL_CAPACITY = 16;
    private final int maxSize;

    public ParseErrorList(int i9, int i10) {
        super(i9);
        this.maxSize = i10;
    }

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList tracking(int i9) {
        return new ParseErrorList(16, i9);
    }

    public boolean canAddError() {
        return size() < this.maxSize;
    }

    public int getMaxSize() {
        return this.maxSize;
    }
}
