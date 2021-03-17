package BattagliaNavale;
import java.util.Random;
import java.io.*;

public class Battaglia_Navale {
    private Cella[][] celle;
    private final int DIM = 10;

    public Battaglia_Navale(){
        celle = new Cella[DIM][DIM];
        Random r = new Random();
        for(int i = 0; i < DIM; i++)
        {
            for(int j=0; j< DIM; j++)
            {
                celle[i][j] = new Cella();
                if(Math.random() < 0.2)
                {
                    celle[i][j].setOccupata();
                }
            }
        }
    }

    public int numeroNavi() {
        int num = 0;
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                if (!celle[i][j].isColpita() && celle[i][j].isOccupata()) {
                    num++;
                }
            }

        }
        return num;
    }

    public void spara(int x, int y)
    {
        if(x >= 0 && x<DIM && y>= 0 && y<DIM)
            celle[x][y].setColpita();
    }

    public String toString()
    {
        String s = "  ";
        for (int i = 0; i < DIM; i++)
            s = s + (i % 10)+ " ";
        s = s + "\n +";
        for (int i = 0; i < DIM; i++)
            s = s + "- ";
        s = s + "+\n";
        for (int r = 0; r < DIM; r++) {
            s = s + (r % 10) + "|";
            for (int c = 0; c < DIM; c++)
                s = s + celle[r][c];
            s = s + "|\n";
        }
        s = s + " +";
        for (int i = 0; i < DIM; i++)
            s = s + "- ";
        s = s + "+\n";
        return s;
    }



}




