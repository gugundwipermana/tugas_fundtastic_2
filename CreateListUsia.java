import java.util.*;
import java.io.*;

public class CreateListUsia {

  public static void main(String args[]){

    ArrayList<String> usia = new ArrayList<String>();
    Random rand = new Random();

    for (int i=0; i<1000000 ; i++) {
      int n = rand.nextInt(50) + 1;
      String m = String.valueOf(n);
      if(n < 10) m = '0'+m;
      usia.add(m);
    }

    // Usia random akan di masukan ke dalam file usia_in.txt
    try ( BufferedWriter bw = new BufferedWriter (new FileWriter ("usia_in.txt")) )
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
