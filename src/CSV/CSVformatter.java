package CSV;

import java.util.Locale;

public class CSVformatter {
    private final String delimiter;

    public CSVformatter(String delimiter)
    {
   this.delimiter = delimiter;
    }

    public String format(Persona persona)
    {
        //header line
         StringBuilder sb = new StringBuilder();
         sb.append(getHeader("nome"));
         sb.append(getDelimiter());
         sb.append(getHeader("cognome"));
         sb.append(getEndOfLine());

         //data line
        sb.append(persona.getNome());
        sb.append(getDelimiter());
        sb.append(persona.getCognome());
        sb.append(getEndOfLine());
        return sb.toString();
    }

    private String getEndOfLine() {
        return "\n";
    }

    private String getHeader(String name) {
        return name.toUpperCase(Locale.ROOT);
    }

    public String getDelimiter() {
        return delimiter;
    }

    public String format(Studente persona)
    {
        //header line
        StringBuilder sb = new StringBuilder();
        sb.append(getHeader("nome"));
        sb.append(getDelimiter());
        sb.append(getHeader("cognome"));
        sb.append(getDelimiter());
        sb.append(getHeader("classe"));
        sb.append(getEndOfLine());

        //data line
        sb.append(persona.getNome());
        sb.append(getDelimiter());
        sb.append(persona.getCognome());
        sb.append(getDelimiter());
        sb.append(persona.getClasse());
        sb.append(getEndOfLine());
        return sb.toString();
    }
}
