import java.util.Random;


public class Dado
{
   public int num1;
  public  int num2;



    public void gerar()
    {
        Random aleatorio = new Random();
        this.setNum1(aleatorio.nextInt(6)+1);
        this.setNum2(aleatorio.nextInt(6)+1);
        System.out.println(num1);
        System.out.println(num2);



    }

    public int getNum1()
    {
        return num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }
}
