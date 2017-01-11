
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author camila
 */
public class Metodos {

    // Lista de arestas
    ArrayList<Vertice> inicio = new ArrayList<Vertice>();
    ArrayList<Vertice> fim = new ArrayList<Vertice>();

    //Lista de vertices
    ArrayList<Vertice> vertices = new ArrayList<Vertice>();

    //Lista de arestas
    ArrayList<Aresta> arestas = new ArrayList<Aresta>();

    // OK
    public void inserirVertices(Vertice v) {
        vertices.add(v);
    }

    // OK
    public void inserirArestas(Aresta a) {
        inicio.add(a.getInicio());
        fim.add(a.getFim());
        arestas.add(a);
    }

    // OK
    public void excluirAresta(Aresta a) {
        for (int i = 0; i < arestas.size(); i++) {
            if (arestas.get(i) == a) {
                inicio.remove(i);
                fim.remove(i);
                arestas.remove(i);
            }
        }
    }

    
    // OK
    public void excluirVertices(Vertice v) {
        // Excluindo vértice da lista de vértices
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i) == v) {
                vertices.remove(i);
            }
        }

        // Excluindo das listas 'inicio', 'fim' e 'arestas'
        for (int i = 0; i < arestas.size(); i++) {
            if ((inicio.get(i).equals(v)) || (fim.get(i).equals(v))) {
                arestas.remove(i);
                fim.remove(i);
                inicio.remove(i);
                i = i - 1;
            }

        }
    }

    // OK
    public void finalVertices(Vertice v){
        for(int i = 0; i < fim.size(); i++){
            if(fim.get(i) == v){
                System.out.println(arestas.get(i).getIdentificadorAresta());
            }
        }
    }
    
    // OK
    public void oposto(Vertice v, Aresta a){
        for(int i = 0; i < arestas.size();i++){
            if(arestas.get(i) == a){
                if(inicio.get(i) == v){
                    System.out.println(fim.get(i).getNome());
                } else if(fim.get(i) == v){
                    System.out.println(inicio.get(i).getNome());
                } else {
                    System.out.println("Inválido!");
                }
            }
        }
    }
    
    // OK
    public void eAdjacente(Vertice v1, Vertice v2){
        boolean teste = false;
        for(int i = 0; i < inicio.size(); i++){
            if((v1 == inicio.get(i)) || (v2 == inicio.get(i))){
                if((v1 == fim.get(i)) || (v2 == fim.get(i))){
                    System.out.println("É adjacente!");
                    teste = true;
                    break;
                }
            }
        }
        if(teste == false) System.out.println("Não é adjacente");
    }
    
    
    // OK
    public void substituirVertice(Vertice v, String nome){
        // Substituindo na lista de vértices
        for(int i = 0; i < vertices.size(); i++){
            if(vertices.get(i) == v){
                vertices.get(i).setNome(nome);
            }
        }
        
        // Substituindo na lista inicio
        for(int i = 0; i < inicio.size(); i++){
            if(inicio.get(i) == v){
                inicio.get(i).setNome(nome);
            }
        }
        
        // Substituindo na lista fim
        for(int i = 0; i < fim.size(); i++){
            if(fim.get(i) == v){
                fim.get(i).setNome(nome);
            }
        }
    }
    
    
    // OK
    public void substituirAresta(Aresta a, String nome){
        for(int i = 0; i < arestas.size(); i++){
            if(arestas.get(i) == a){
                arestas.get(i).setIdentificadorAresta(nome);
            }
        }
    }
    

    // OK
    public void arestasIncidentes(Vertice v){
        for(int i = 0; i < inicio.size(); i++){
            if(inicio.get(i) == v || fim.get(i)== v){
                System.out.println(arestas.get(i).getIdentificadorAresta());
            }
        }
        
       
    }

    
    
    // Método que retorna os vértices
    public void vertices() {
        System.out.println("***   Lista de vértices   ***");
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println(" - " + vertices.get(i).getNome());
        }
    }

    // Método que retorna as arestas
    public void arestas() {
        System.out.println("***   ARESTAS   ***");
        for (int i = 0; i < arestas.size(); i++) {
            System.out.println(" - " + arestas.get(i).getIdentificadorAresta() + ": Início (" + arestas.get(i).getInicio().getNome() + "), Fim (" + arestas.get(i).getFim().getNome() + ")");
        }
    }

    // Método para mostrar a lista 'inicio'
    public void inicio() {
        for (int i = 0; i < inicio.size(); i++) {
            System.out.print(inicio.get(i).getNome() + ", ");
        }
        System.out.println("");
    }

    // Método para mostrar a lista de 'fim'
    public void fim() {
        for (int i = 0; i < fim.size(); i++) {
            System.out.print(fim.get(i).getNome() + ", ");
        }
        System.out.println("");
    }
}
