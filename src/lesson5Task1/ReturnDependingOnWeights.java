package lesson5Task1;

public class ReturnDependingOnWeights {
    private int[] znach;
    private int[] vesa;
    public ReturnDependingOnWeights(int[] z, int[] v)
    {
        this.znach=z;
        this.vesa = new int[v.length];
        vesa[0] =v[0];
        for (int i = 1; i<v.length;i++)
        {
            vesa[i]=vesa[i-1]+v[i];
        }
    }
    public int randomizer()
    {
        int rand = (int) (Math.random()*vesa[vesa.length-1])+1;
        for (int i = 0;i<vesa.length;i++)
        {
            if (rand<=vesa[i])
            {
                return znach[i];
            }
        }
        return znach[znach.length-1];
    }
}
