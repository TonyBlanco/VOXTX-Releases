package org.simpleframework.xml.core;

import java.lang.reflect.Array;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.simpleframework.xml.stream.Position;

/* JADX INFO: loaded from: classes4.dex */
class CompositeArray implements Converter {
    private final Type entry;
    private final ArrayFactory factory;
    private final String parent;
    private final Traverser root;
    private final Type type;

    public CompositeArray(Context context, Type type, Type type2, String str) {
        this.factory = new ArrayFactory(context, type);
        this.root = new Traverser(context);
        this.parent = str;
        this.entry = type2;
        this.type = type;
    }

    private void read(InputNode inputNode, Object obj, int i9) throws Exception {
        Array.set(obj, i9, !inputNode.isEmpty() ? this.root.read(inputNode, this.entry.getType()) : null);
    }

    private boolean validate(InputNode inputNode, Class cls) throws Exception {
        while (true) {
            InputNode next = inputNode.getNext();
            if (next == null) {
                return true;
            }
            if (!next.isEmpty()) {
                this.root.validate(next, cls);
            }
        }
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode) throws Exception {
        Instance arrayFactory = this.factory.getInstance(inputNode);
        Object instance = arrayFactory.getInstance();
        return !arrayFactory.isReference() ? read(inputNode, instance) : instance;
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode, Object obj) throws Exception {
        int length = Array.getLength(obj);
        int i9 = 0;
        while (true) {
            Position position = inputNode.getPosition();
            InputNode next = inputNode.getNext();
            if (next == null) {
                return obj;
            }
            if (i9 >= length) {
                throw new ElementException("Array length missing or incorrect for %s at %s", this.type, position);
            }
            read(next, obj, i9);
            i9++;
        }
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(InputNode inputNode) throws Exception {
        Instance arrayFactory = this.factory.getInstance(inputNode);
        if (arrayFactory.isReference()) {
            return true;
        }
        arrayFactory.setInstance(null);
        return validate(inputNode, arrayFactory.getType());
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(OutputNode outputNode, Object obj) throws Exception {
        int length = Array.getLength(obj);
        for (int i9 = 0; i9 < length; i9++) {
            this.root.write(outputNode, Array.get(obj, i9), this.entry.getType(), this.parent);
        }
        outputNode.commit();
    }
}
