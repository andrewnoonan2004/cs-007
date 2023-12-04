import java.util.*;
public class Coin
{

    //define members up here but don't initialize them unless they are final
    private final int TAILS=0;
    private final int HEADS=1;
    private Random r;
    private int numHeads,numTails;

    public Coin ( int seed)
    {
        r = new Random( seed );
        reset();
        numHeads=0;
        numTails=0;
    }

    public String flip()
    {
        int side = r.nextInt(2);
        if (side==HEADS)
        {
        setNumHeads( getNumHeads()+1);
        return "H";
        }
        else
        {
        setNumTails( getNumTails()+1);
        return "T";
        }
    }

    public int getNumHeads()
    {
        return numHeads;
    }

    public int getNumTails()
    {
        return numTails;
    }

    private void setNumHeads( int h)
    {
        numHeads=h;
    }

    private void setNumTails( int t)
    {
        numTails=t;
    }

    public void reset()
    {
        setNumHeads(0);
        setNumTails(0);
    }
}
