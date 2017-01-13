package stucom.tools;

/**
 * Created by Arnau on 01/12/16.
 */
public class Show {

    public static void error(String mensaje){ System.out.println(Colors.ANSI_RED + mensaje + Colors.ANSI_RESET); }

    public static void success(String mensaje) { System.out.println(Colors.ANSI_GREEN + mensaje + Colors.ANSI_RESET); }

    public static void warning(String mensaje) { System.out.println(Colors.ANSI_YELLOW + mensaje + Colors.ANSI_RESET); }
}
