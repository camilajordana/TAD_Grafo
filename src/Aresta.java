/**
 *
 * @author Camila Jordana
 */
public class Aresta {
    
    private String identificadorAresta;
    private Vertice inicio;
    private Vertice fim;

    public Aresta(String identificadorAresta, Vertice inicio, Vertice fim) {
        this.identificadorAresta = identificadorAresta;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getIdentificadorAresta() {
        return identificadorAresta;
    }

    public void setIdentificadorAresta(String identificadorAresta) {
        this.identificadorAresta = identificadorAresta;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public void setInicio(Vertice inicio) {
        this.inicio = inicio;
    }

    public Vertice getFim() {
        return fim;
    }

    public void setFim(Vertice fim) {
        this.fim = fim;
    }

    
    
}
