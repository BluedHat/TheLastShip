import com.account.Computer;
import com.account.Playerdata;
import com.account.Round;
import com.army.Sort;
import com.core.Printer;
import com.places.Sea;
import com.core.Scan;

public class Main {
    public static void main(String[] args) {
      Scan.scanUserNames();
      Scan.scanUserEntry();
      Sea.InitializePlayerTables();
      Sort.SelectArmy();
      Sea.StartGame();

      do {
          Playerdata.playerTable();
          Scan.scanPlayEntry();
            if (Round.CheckInput()) {
                      Round.PlayerRound(Scan.player1, Round.Round(), Sea.Pacifico);
                      Round.PlayerRound(Scan.player2, Computer.ComputerPlay(),Sea.Atlantico);
            } else {
                      Scan.scanPlayEntry();
            }
      }
      while(!Round.finished);
      Printer.EndGame();
      SaveRanking.Exib();
      }
    }

