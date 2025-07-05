package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    /**
     * Retorna la profundidad máxima de un árbol binario.
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDepth  = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
