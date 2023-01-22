package CSV;

import java.util.Vector;

public class Application {
    public static void main(String[] args) {
        Persona persona = new Persona("Ciro","Cozzo");
        Studente studente = new Studente("Salvatore","Innocenti","4AS");
        var formatter = new CSVformatter(";");
        System.out.println(formatter.format(persona));
        System.out.println(formatter.format(studente));
    }
}
