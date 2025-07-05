package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListLevels {

    /**
     * Retorna una lista de listas, cada una con los nodos de un nivel.
     */
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                currentLevel.add(node);

                if (node.getLeft()  != null) queue.add(node.getLeft());
                if (node.getRight() != null) queue.add(node.getRight());
            }
            result.add(currentLevel);
        }
        return result;
    }
}
