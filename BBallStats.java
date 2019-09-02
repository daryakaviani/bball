import java.io.*;
import java.util.*;

public class BBallStats
{
    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList<String>();
        try {
            FileInputStream fs = new FileInputStream("curry.txt");
            DataInputStream in = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null)   {
                strings.add(strLine);
            }
            in.close();
        }catch (Exception e){}
    }
    
    
    public static Game[] getGameObjects(ArrayList <String> list){
        Game[] games = new Game[list.size()];
        
    }
    
    public double averagePoints(Game[] games){
        double total = 0.0; 
        for(int i = 0; i < games.length; i++){
            if(games[i]){
                
            }
        }
    }
}

public class Game{
    private int FG, FGA, TP, TPA, FT, FTA;
    Game(int FG, int FGA, int TP, int TPA, int FT, int FTA){
        this.FG = FG;
        this.FGA = FGA;
        this.TP = TP;
        this.TPA = TPA;
        this.FT = FT;
        this.FTA = FTA;
    }
    public int getFG(){
        return FG;
    }
    public int getFGA(){
        return FGA;
    }
    public int getTP(){
        return TP;
    }
    public int getTPA(){
        return TPA;
    }
    public int getFT(){
        return FT;
    }
    public int getFTA(){
        return FTA;
    }
}

Write a method that takes the ArrayList of Strings and returns an array of Game objects.  You will need to use substring and Integer.parseInt() as described in class.

Write a method that takes an array of Game objects and returns Curry's average number of points per game for the season.  Since this value will be a double, you should consider how to typecast your result.

Write a method that takes an array of Game objects and returns the number of points in Curry's highest scoring game for the season.