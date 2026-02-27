package org.apache.http.message;

/* JADX INFO: loaded from: classes4.dex */
public class ParserCursor {
    private final int lowerBound;
    private int pos;
    private final int upperBound;

    public ParserCursor(int i9, int i10) {
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i9 > i10) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.lowerBound = i9;
        this.upperBound = i10;
        this.pos = i9;
    }

    public boolean atEnd() {
        return this.pos >= this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }

    public int getPos() {
        return this.pos;
    }

    public int getUpperBound() {
        return this.upperBound;
    }

    public String toString() {
        return '[' + Integer.toString(this.lowerBound) + '>' + Integer.toString(this.pos) + '>' + Integer.toString(this.upperBound) + ']';
    }

    public void updatePos(int i9) {
        if (i9 < this.lowerBound) {
            throw new IndexOutOfBoundsException("pos: " + i9 + " < lowerBound: " + this.lowerBound);
        }
        if (i9 <= this.upperBound) {
            this.pos = i9;
            return;
        }
        throw new IndexOutOfBoundsException("pos: " + i9 + " > upperBound: " + this.upperBound);
    }
}
