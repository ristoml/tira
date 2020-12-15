/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaj
 */
public class Node {
    private String data;
    private BinaryTree left;
    private BinaryTree right;

    public Node(String value) {
        data = new String(value);
        left = right = null;
    }

    public Node(String value, BinaryTree left, BinaryTree right) {
        data = new String(value);
        this.left = left;
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public int getValue() {
        return Integer.valueOf(data);
    }

    public void setValue(int value) {
        data = String.valueOf(value);
    }

    public int minValue() {
        if (left == null) {
            return getValue();
        } else {
            return left.getRoot().minValue();
        }
    }

    public BinaryTree left() {
        return left;
    }

    public BinaryTree right() {
        return right;
    }

    public void setLeft(BinaryTree tree) {
        left = tree;
    }

    public void setRight(BinaryTree tree) {
        right = tree;
    }

    

}
