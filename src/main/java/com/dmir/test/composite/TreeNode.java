package com.dmir.test.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by $wally on 2016/9/19.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private List<TreeNode> childNode=new LinkedList<TreeNode>();

    public TreeNode(String name){
        this.name=name;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void addChildNode(TreeNode treeNode){
        childNode.add(treeNode);
    }

    public void removeChildNode(TreeNode treeNode){
        childNode.remove(treeNode);
    }
}
