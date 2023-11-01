using Repository;

namespace DomainService
{
    public interface ICalculadoraService
    {
        public double Somar(double x, double y);
        public double Multiplicar(double x, double y);
        public double Divide(double x, double y);
        public double Subtrair(double x, double y);
        public List<Historico> ObterHistorico();
    }
}