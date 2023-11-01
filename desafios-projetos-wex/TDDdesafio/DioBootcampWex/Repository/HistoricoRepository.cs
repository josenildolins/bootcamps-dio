namespace Repository
{
    public class HistoricoRepository : IHistoricoRepository
    {
        public void CriarHistorico(double valor1, double valor2, double resultado, DateTime data)
        {
            using var db = new HistoricoContext();

            db.Add(new Historico()
            {
                primeiroValor = valor1,
                segundoValor = valor2,
                resultado = resultado,
                data = data
            });

            db.SaveChanges();
        }

        public List<Historico> ObterHistorico()
        {
            using var db = new HistoricoContext();

            return db.Historico.ToList();
        }
    }
}
