package CSV;

public class Studente extends  Persona {
   private final String  classe;

    public Studente(String nome, String cognome, String classe) {
        super(nome, cognome);
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }
}
