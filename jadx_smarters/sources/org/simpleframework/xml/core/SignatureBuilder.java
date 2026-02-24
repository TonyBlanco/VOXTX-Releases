package org.simpleframework.xml.core;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class SignatureBuilder {
    private final Constructor factory;
    private final ParameterTable table = new ParameterTable();

    public static class ParameterList extends ArrayList<Parameter> {
        public ParameterList() {
        }

        public ParameterList(ParameterList parameterList) {
            super(parameterList);
        }
    }

    public static class ParameterTable extends ArrayList<ParameterList> {
        /* JADX INFO: Access modifiers changed from: private */
        public int height() {
            if (width() > 0) {
                return get(0).size();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int width() {
            return size();
        }

        public Parameter get(int i9, int i10) {
            return get(i9).get(i10);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public ParameterList get(int i9) {
            for (int size = size(); size <= i9; size++) {
                add(new ParameterList());
            }
            return (ParameterList) super.get(i9);
        }

        public void insert(Parameter parameter, int i9) {
            ParameterList parameterList = get(i9);
            if (parameterList != null) {
                parameterList.add(parameter);
            }
        }
    }

    public SignatureBuilder(Constructor constructor) {
        this.factory = constructor;
    }

    private List<Signature> build(ParameterTable parameterTable) throws Exception {
        if (this.table.isEmpty()) {
            return create();
        }
        build(parameterTable, 0);
        return create(parameterTable);
    }

    private void build(ParameterTable parameterTable, int i9) {
        build(parameterTable, new ParameterList(), i9);
    }

    private void build(ParameterTable parameterTable, ParameterList parameterList, int i9) {
        ParameterList parameterList2 = this.table.get(i9);
        int size = parameterList2.size();
        if (this.table.width() - 1 <= i9) {
            populate(parameterTable, parameterList, i9);
            return;
        }
        for (int i10 = 0; i10 < size; i10++) {
            ParameterList parameterList3 = new ParameterList(parameterList);
            if (parameterList != null) {
                parameterList3.add(parameterList2.get(i10));
                build(parameterTable, parameterList3, i9 + 1);
            }
        }
    }

    private List<Signature> create() throws Exception {
        ArrayList arrayList = new ArrayList();
        Signature signature = new Signature(this.factory);
        if (isValid()) {
            arrayList.add(signature);
        }
        return arrayList;
    }

    private List<Signature> create(ParameterTable parameterTable) throws Exception {
        ArrayList arrayList = new ArrayList();
        int iHeight = parameterTable.height();
        int iWidth = parameterTable.width();
        for (int i9 = 0; i9 < iHeight; i9++) {
            Signature signature = new Signature(this.factory);
            for (int i10 = 0; i10 < iWidth; i10++) {
                Parameter parameter = parameterTable.get(i10, i9);
                String path = parameter.getPath();
                if (signature.contains(parameter.getKey())) {
                    throw new ConstructorException("Parameter '%s' is a duplicate in %s", path, this.factory);
                }
                signature.add(parameter);
            }
            arrayList.add(signature);
        }
        return arrayList;
    }

    private void populate(ParameterTable parameterTable, ParameterList parameterList, int i9) {
        ParameterList parameterList2 = this.table.get(i9);
        int size = parameterList.size();
        int size2 = parameterList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                parameterTable.get(i11).add(parameterList.get(i11));
            }
            parameterTable.get(i9).add(parameterList2.get(i10));
        }
    }

    public List<Signature> build() throws Exception {
        return build(new ParameterTable());
    }

    public void insert(Parameter parameter, int i9) {
        this.table.insert(parameter, i9);
    }

    public boolean isValid() {
        return this.factory.getParameterTypes().length == this.table.width();
    }
}
