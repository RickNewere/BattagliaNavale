package BattagliaNavale;

public class Cella {

    private boolean colpita;
    private boolean occupata;

    public Cella()
    {
        colpita = false;
        occupata = false;
    }

    public boolean isColpita() {
        return colpita;
    }

    public boolean isOccupata() {
        return occupata;
    }

    public void setColpita() {
        colpita = true;
    }

    public void setOccupata() {
        occupata = true;
    }



    public String toString()
    {
        String x = null;
        if(!colpita)
            x = "  ";
        else if(colpita && occupata)
            x = "X ";
        else if(colpita && !occupata)
            x = "# ";

        return x;
    }



}
