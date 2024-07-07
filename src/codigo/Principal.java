package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Charly Ponce
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String root = "C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.flex";
        String root2 = "C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/LexerCup.flex";
        String[] rootS = {"-parser", "Sintax", "C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Sintax.cup"};
        generar(root, root2, rootS);
    }
    public static void generar(String root, String root2, String[] rootS) throws IOException, Exception{
        File archivo;
        archivo = new File(root);
        JFlex.Main.generate(archivo);
        archivo = new File(root2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rootS);
        
        Path rutaSym = Paths.get("C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/sym.java"), 
                Paths.get("C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/sym.java")
        );
        Path rutaSin = Paths.get("C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/Sintax.java"), 
                Paths.get("C:/Users/Gabito/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Sintax.java")
        );
    }
}
