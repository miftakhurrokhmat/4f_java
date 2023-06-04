import java.util.Scanner;
  
class RohaniNA_256 {
  public static void main(String args[]){
           
    Scanner input = new Scanner(System.in);
      
    System.out.println();
    
    String nama, nim, kelas;
 
    System.out.print("Nama mahasiswa: ");
    nama = input.nextLine();
    
    System.out.print("NIM: ");
    nim = input.nextLine();
    
    System.out.print("Kelas: ");
    kelas = input.nextLine();
    
    System.out.println("");
    
   
    System.out.println(" Data saya ");
    System.out.println("==================");
    System.out.println("Nama: "      + nama);
    System.out.println("NIM: "       + nim);
    System.out.println("Kelas: "  + kelas);
  
  }
}