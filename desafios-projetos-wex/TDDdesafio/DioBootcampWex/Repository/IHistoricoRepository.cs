namespace Repository
{
    public interface IHistoricoRepository
    {
        public void CriarHistorico(double valor1, double valor2, double resultado, DateTime data);
        public List<Historico> ObterHistorico();
    }
}
