using Repository;

namespace DomainService
{
    public class CalculadoraService : ICalculadoraService
    {
        private readonly IHistoricoRepository _repository;
        public CalculadoraService(IHistoricoRepository repository)
        {
            _repository = repository;
        }

        public double Divide(double x, double y)
        {
            if (y == 0)
            {
                throw new DivideByZeroException();
            }

            double result = x / y;

            _repository.CriarHistorico(x, y, result, DateTime.Now);


            return result;
        }

        public double Multiplicar(double x, double y)
        {
            double result = x * y;
            _repository.CriarHistorico(x, y, result, DateTime.Now);
            return result;
        }

        public double Somar(double x, double y)
        {
            double result = x + y;
            _repository.CriarHistorico(x, y, result, DateTime.Now);
            return result;
        }

        public double Subtrair(double x, double y)
        {
            double result = x - y;
            _repository.CriarHistorico(x, y, result, DateTime.Now);
            return result;
        }

        public List<Historico> ObterHistorico()
        {
            return _repository.ObterHistorico();
        }
    }
}