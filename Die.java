public class Die
{

  private int value;
  private int numSides;
  private static int id; // like a counter, shared between classes
  private int dieId;


  public Die()
  {
    this(1, 6);
  }

  public Die(int v, int n)
  {
    setValue(v);
    setNumSides(n);
    id++;
    setDieId(id);
  }


  public int getValue()
  {
    return value;
  }

  public int getNumSides()
  {
    return numSides;
  }


  public void setValue(int v)
  {
    value = v;
  }

  public void setNumSides(int n)
  {
    numSides = n;
  }

  public void setDieId(int d)
  {
    dieId = d;
  }


  public int roll()
  {
    value = (((int) (numSides * Math.random())) + 1);
    return value;
  }

  public String toString()
  {
    String str = "Die ID: " + dieId + "; Value: " + value + "; Number of Sides: " + numSides;
    return str;
  }

  public boolean equals(Die d)
  {
    if(this.getValue() == d.getValue())
    {
      return true;
    }
    else
    {
      return false;
    }
  }

}