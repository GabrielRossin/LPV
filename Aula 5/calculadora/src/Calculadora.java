public class Calculadora
{

    double resul;

    public void somar(double n1, double n2)
    {
        this.resul = n1 + n2;
        System.out.println("A soma dos valores são: " + resul);
    }

    public void dividir(double n1 , double n2)
    {
        this.resul = n1 / n2;
        System.out.println("A divião dos valores são: " + resul);
    }

    public void multi(double n1 , double n2)
    {
        this.resul = n1 * n2;
        System.out.println("A multiplicação dos valores são: " + resul);
    }

    public void subtracao(double n1 , double n2)
    {
        this.resul = n1 - n2;
        System.out.println("A subtração dos valores são: " + resul);
    }


}
