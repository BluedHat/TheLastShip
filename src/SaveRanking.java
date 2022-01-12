import com.account.Player;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static com.account.Round.finished;
import static java.lang.System.out;

public class SaveRanking {

    private static String GetData;


 public static void SaveNewGame(){
    if(finished){
        GetData = LocalDate.now() +"|"+
                Player.pointsp +"|"+
                Player.playerp +"|"+
                Player.turnp +"|"+
                Player.statusp;
    }
}
     public static void SaveRank(){
        try{
                FileWriter updateRank = new FileWriter("ranking.txt",true);
                   updateRank.write(GetData);
                   updateRank.write(System.getProperty( "line.separator" ));
                   updateRank.flush();
                   updateRank.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /* TODO - leitura do arquivo para organização por pontos
        public static  void EditRank(){
     int n = 1;
            try {
                File ReadRank = new File("ranking.txt");
                Scanner myReader = new Scanner(ReadRank);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    GetDataS[n] = String.valueOf(data.substring(0));
                    GetDataP[n] = Integer.parseInt(data.substring(1));
                    GetDataT[n] = Integer.parseInt(data.substring(2));
                    GetDataD[n] = String.valueOf(data.substring(3));
                    GetDataN[n] = String.valueOf(data.substring(4)) ;

                    n += 1;
                }
                myReader.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } */

    public static void Exib(){
     SaveNewGame();
     SaveRank( );
    }

 }

