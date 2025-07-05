package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    /** 
     * Invierte un árbol completo:
     *   * Caso base: root == null → nada que hacer.
     *   * Recursión: invierte subárbol izquierdo y derecho, luego swap.
     */
    public Node invertTree(Node root) {
        if (root == null) return null;

        // Invierte subárboles
        Node leftInverted  = invertTree(root.getLeft());
        Node rightInverted = invertTree(root.getRight());

        // Swap
        root.setLeft(rightInverted);
        root.setRight(leftInverted);

        return root;
    }
}
