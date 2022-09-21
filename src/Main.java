import DB.Facade;
import Entitet.Bog;
import MineUtil.BrugerInput;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        //Bog bog = new Bog("Lille ole", "Ole Hansen");
        //Facade.opretBog(bog);

        while (true){

            switch(BrugerInput.getString("Hvad ønsker du")){

                case "opret bog":
                    Bog bog = new Bog(BrugerInput.getString("Angiv title"),
                            BrugerInput.getString("Angiv Forfatter"));
                    System.out.println("Du har nu oprettet bogen: " + Facade.opretBog(bog).toString());
            }
        }
    }
}