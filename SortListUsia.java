import java.util.*;
import java.io.*;

public class SortListUsia {

  public static void main(String args[]){
    ArrayList<String> usia = new ArrayList<String>();

    File file = new File("usia_in.txt");
    try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            usia.add(scanner.nextLine());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    // tampilkan data usia sebelum di ASC pada console
    if(usia.size() <= 100) {
      System.out.println("Before");
      int i=0;
      for(String temp: usia){
        System.out.println("Usia " + ++i + " : " + temp);
      }
    }

    Collections.sort(usia); // proses ASC

    // tampilkan data usia sesudah di ASC pada console
    if(usia.size() <= 100) {
      System.out.println("\nAfter");
      int ii=0;
      for(String temp: usia){
        System.out.println("Usia " + ++ii + " : " + temp);
      }
    }


    // hasil ASC di masukan ke dalam file usia_out.txt
    try ( BufferedWriter bw = new BufferedWriter (new FileWriter ("usia_out.txt")) )
    {
      for (String line : usia) {
        bw.write (line + "\n");
      }
      bw.close();
    } catch (IOException e) {
      e.printStackTrace ();
    }

  }
}
