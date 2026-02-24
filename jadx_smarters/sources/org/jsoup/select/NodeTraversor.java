package org.jsoup.select;

import org.jsoup.nodes.Node;

/* JADX INFO: loaded from: classes4.dex */
public class NodeTraversor {
    private NodeVisitor visitor;

    public NodeTraversor(NodeVisitor nodeVisitor) {
        this.visitor = nodeVisitor;
    }

    public void traverse(Node node) {
        Node nodeChildNode = node;
        int i9 = 0;
        while (nodeChildNode != null) {
            this.visitor.head(nodeChildNode, i9);
            if (nodeChildNode.childNodeSize() > 0) {
                nodeChildNode = nodeChildNode.childNode(0);
                i9++;
            } else {
                while (nodeChildNode.nextSibling() == null && i9 > 0) {
                    this.visitor.tail(nodeChildNode, i9);
                    nodeChildNode = nodeChildNode.parentNode();
                    i9--;
                }
                this.visitor.tail(nodeChildNode, i9);
                if (nodeChildNode == node) {
                    return;
                } else {
                    nodeChildNode = nodeChildNode.nextSibling();
                }
            }
        }
    }
}
