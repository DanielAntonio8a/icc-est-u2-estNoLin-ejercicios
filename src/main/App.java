package main;

import java.util.LinkedList;
import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        //1) Insertar en un Árbol Binario de Búsqueda (BST)
        System.out.println("\n\tEJERCICIO 1");
        InsertBST bst = new InsertBST();
        Node root = null;

        root= bst.insert(root, 5);
        root= bst.insert(root, 3);
        root= bst.insert(root, 7);
        root= bst.insert(root, 2);
        root= bst.insert(root, 4);
        root= bst.insert(root, 6);
        root= bst.insert(root, 8);
        
        System.out.println("Árbol por niveles Ejercicio 1:");
        bst.printByLevels(root);

        // 2) Invertir un Árbol Binario
        System.out.println("\n\tEJERCICIO 2");
        // Reinicia la raíz a null para empezar un nuevo árbol
        root = null; 

        root= bst.insert(root, 4);
        root= bst.insert(root, 2);
        root= bst.insert(root, 7);
        root= bst.insert(root, 1);
        root= bst.insert(root, 3);
        root= bst.insert(root, 6);
        root= bst.insert(root, 9);
        InvertBinaryTree inverter = new InvertBinaryTree();
        root = inverter.invertTree(root);
        

        System.out.println("\nInvertido:");
        bst.printByLevels(root);

        
        // 3) Listar Niveles en Listas Enlazadas
        System.out.println("\n\tEJERCICIO 3");
        ListLevels lister = new ListLevels();
        // Fíjate: List<List<Node>>, no List<LinkedList<Node>>
        List<List<Node>> niveles = lister.listLevels(root);

        System.out.println("Niveles en listas enlazadas:");
        for (List<Node> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }


        //4) Calcular la Profundidad Máxima
        // Reinicia la raíz a null para empezar un nuevo árbol
        System.out.println("\n\tEJERCICIO 4");
        
        root = new Node(4);
        Node n2   = new Node(2);
        Node n7   = new Node(7);
        Node n1   = new Node(1);
        Node n3   = new Node(3);
        Node n8   = new Node(8);

        root.setLeft(n2);
        root.setRight(n7);
        n2.setLeft(n1);
        n2.setRight(n3);
        n1.setLeft(n8);

        // Calculamos y mostramos la profundidad máxima
        Depth calculator = new Depth();
        int depth = calculator.maxDepth(root);
        System.out.println("Profundidad máxima: " + depth);
    }

}