package main.Ejercicio_01_insert;

import main.Materia.Models.Node;
import java.util.LinkedList;
import java.util.Queue;

public class InsertBST {

    // Inserta el valor y devuelve la nueva raíz
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }

    // Imprime el árbol por niveles (level-order), línea por línea
    public void printByLevels(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                System.out.print(cur.getValue() + " ");
                if (cur.getLeft()  != null) q.add(cur.getLeft());
                if (cur.getRight() != null) q.add(cur.getRight());
            }
            System.out.println();
        }
    }
}
