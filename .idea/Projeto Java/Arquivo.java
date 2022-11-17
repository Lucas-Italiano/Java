import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class projeto {

    public static void main(String[] args) throws IOException {
        FileWriter fw;
        Scanner ler = new Scanner(System.in);
        System.out.print("digite seu nome :");
        String nome = ler.nextLine();
        System.out.print("digite seu endereço :");
        String end = ler.nextLine();
        System.out.print("digite seu numero :");
        String fone = ler.nextLine();
        fw = new FileWriter("texto.txt"); // criando arquivo.. ("nome do arquivo")
        fw.write("nome: " + nome + " endereço: " + end + " Telefone: " + fone + "\n");
        fw.close();

        FileReader r;
        int x;
        r = new FileReader("texto.txt");
        while ((x = r.read()) != -1) { //ler dados do arquivo
            System.out.print((char) x); // imprime os dados do arquivo
        }
    }
}
