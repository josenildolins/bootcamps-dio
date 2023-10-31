using DomainService.Interfaces;

namespace DomainService
{
    public class CalculadoraService : IOperacoes
    {
        public double Divide(double x, double y)
        {
            if (y == 0)
            {
                throw new DivideByZeroException();
            }
            
            double result = x / y;
            
            return result;
        }

        public double Multiplicar(double x, double y)
        {
            double result = x * y;
            return result;
        }

        public double Somar(double x, double y)
        {
            double result = x + y;
            return result;
        }

        public double Subtrair(double x, double y)
        {
            double result = x - y;
            return result;
        }
    }
}