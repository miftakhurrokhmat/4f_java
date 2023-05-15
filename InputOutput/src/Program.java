
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nandadotexe
 */
public class Program {
    public static void main(String[] args) {
        try {
            System.out.println("aman");
            
            InputStreamReader inp = new InputStreamReader(System.in);
            BufferedReader buf = new BufferedReader(inp);
            
            // menangkap variable panjang =>
            System.out.println("Masukkan panjang");
            double panjang = Double.parseDouble(buf.readLine());
            System.out.println("panjang = " + panjang);
            
            // menangkap variable lebar =>
            System.out.println("Masukkan lebar");
            double lebar = Double.parseDouble(buf.readLine());
            System.out.println("lebar = " + lebar);
            
            // perhitungan rumus
            double luas = panjang * lebar;
            
            // tampilan hasil
            System.out.println("Luas = " + luas);
        } catch (IOException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
