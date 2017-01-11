
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author camila
 */


public class Teste {

       
    
    public static void main(String[] args) {
        
        Metodos tad_grafo = new Metodos();
        
        
        Vertice v1 = new Vertice("v1");
        Vertice v2 = new Vertice("v2");
        Vertice v3 = new Vertice("v3");
        Vertice v4 = new Vertice("v4");
        
        
        //Inserindo vértices
        tad_grafo.inserirVertices(v1);
        tad_grafo.inserirVertices(v2);
        tad_grafo.inserirVertices(v3);
        tad_grafo.inserirVertices(v4);
        
        Aresta a1 = new Aresta("a1", v1, v2);
        Aresta a2 = new Aresta("a2", v3, v2);
        Aresta a3 = new Aresta("a3", v2, v1);
        Aresta a4 = new Aresta("a4", v4, v1);
        Aresta a5 = new Aresta("a5", v1, v4);
        Aresta a6 = new Aresta("a6", v4, v3);
        
        
        
        // Inserindo arestas
        tad_grafo.inserirArestas(a1);
        tad_grafo.inserirArestas(a2);
        tad_grafo.inserirArestas(a3);
        tad_grafo.inserirArestas(a4);
        tad_grafo.inserirArestas(a5);
        tad_grafo.inserirArestas(a6);
        
        
        //Mostrar vértices e arestas
        tad_grafo.vertices();
        tad_grafo.arestas();
        
        
        /**
        System.out.println("\n\n--- DEPOIS DA EXCLUSÃO DE ARESTAS ---");
        tad_grafo.excluirAresta(a2);
        //Mostrar vértices e arestas
        tad_grafo.vertices();
        tad_grafo.arestas();
        tad_grafo.inicio();
        tad_grafo.fim();
        
        **/
        /**
        System.out.println("\n\n--- DEPOIS DA EXCLUSÃO DE VÉRTICES ---");
        tad_grafo.excluirVertices(v4);
        //Mostrar vértices e arestas
        tad_grafo.vertices();
        tad_grafo.arestas();
        tad_grafo.inicio();
        tad_grafo.fim();
        **/
        
        tad_grafo.arestasIncidentes(v3);
    }
    
    
    
}
