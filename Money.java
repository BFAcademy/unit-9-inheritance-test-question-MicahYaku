public class Money
{
    
    private double val;

    public Money(double v)
    {
        val = v;
    }
    
    public double getAmount()
    {
        return this.val;
    }

}

class Coin extends Money
{
    private String name;
    public Coin(String n, double val)
    {
        super(val);
        name = n;
    }


    
    public boolean equals(Coin a)
    {
        if(a == null)
        {
        return false;
        }
        else if( name.equals(a.name) && (this.getAmount() == a.getAmount()) )
        {
        return true;
        }
        return true;
    }

    public String toString()
    {
        return this.name;
    }
}

class Quarter extends Coin
{
    public Quarter()
    {
        super("Quarter", 0.25);
    }

}

class Nickel extends Coin
{
    public Nickel()
    {
        super("Nickel", 0.05);
    }

}

class Dime extends Coin
{
    public Dime()
    {
        super("Dime", 0.10);
    }
}

class Bill extends Money
{
    private int val;
    public Bill(int v)
    {
        super(v);
        val = v;
    }

    public int getVal()
    {
        return val;
    }

    public String toString()
    {
        return "$" + this.getVal() ;
    }
}
