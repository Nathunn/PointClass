package com.Comparable;

public class Fruit implements Comparable<Fruit> {

    public String fruitName;
    public String fruitDesc;
    public int fruitQty;

    public Fruit(String fruitName, String fruitDesc, int fruitQty)
    {
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.fruitQty = fruitQty;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append(", fruitDesc='").append(fruitDesc).append('\'');
        sb.append(", fruitQty=").append(fruitQty);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(Fruit that)
    {
        if(this.fruitName.compareTo(that.fruitName) < 0)
        {
            return -1;
        }else if(this.fruitName.compareTo(that.fruitName) > 0)
        {
            return 1;
        }else
        {

            if(this.fruitQty < that.fruitQty)
            {
                return 1;
            }else if(this.fruitQty > that.fruitQty)
            {
                return -1;
            }else
            {
                return 0;
            }

        }
    }
}
