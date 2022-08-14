public class Unidad {
    private String palabra;
    private int indice, nroTexto;

    public Unidad(String p, int i, int n){
        this.palabra= p;
        this.indice= i;
        this.nroTexto= n;
    }

    public int getIndice(){ //Devuelve el indice
        return indice;
    }

    public int getTexto(){ //Devuelve el número de texto
        return nroTexto;
    }

    public String toString(){ //Para que imprima la palabra defrente
        return palabra;
    }
}
