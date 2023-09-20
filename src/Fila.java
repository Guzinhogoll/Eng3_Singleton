public class Fila {

    public void ImprimeDocumento(){

    }
    public void RemoveDocumento(){

    }
    public void RemoveTodosDocumentos(){

    }

    private static Fila chave = new Fila();

    private Fila() {
    }

    public static Fila getInstance() {
        return chave  ;
    }
}
