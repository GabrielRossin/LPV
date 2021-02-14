public class Calculadora
{

        Double resul;

        public Double somar(Double n1, Double n2)
        {
                this.setResul(n1 + n2);

                return getResul();

        }

        public Double subtrair(Double n1, Double n2)
        {
                this.setResul(n1 - n2);

                return getResul();

        }

        public Double dividir(Double n1, Double n2)
        {
                this.setResul(n1 / n2);

                return getResul();

        }

        public Double multiplicar(Double n1, Double n2)
        {
                this.setResul(n1 * n2);

                return getResul();

        }

        public Double restoDiv(Double n1, Double n2)
        {
                this.setResul(n1 % n2);

                return getResul();

        }

        public Double getResul() {
                return resul;
        }

        public void setResul(Double resul) {
                this.resul = resul;
        }
}
