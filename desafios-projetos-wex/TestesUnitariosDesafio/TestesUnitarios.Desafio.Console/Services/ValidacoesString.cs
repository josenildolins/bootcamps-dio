namespace TestesUnitarios.Desafio.Console.Services
{
    public class ValidacoesString
    {
        public int RetornarQuantidadeCaracteres(string texto)
        {
            int numeroCaracteres = texto.Length;
            return numeroCaracteres;
        }

        public bool ContemCaractere(string texto, string textoProcurado)
        {
            bool contem = texto.Contains(textoProcurado, StringComparison.OrdinalIgnoreCase);
            return contem;
        }

        public bool TextoTerminaCom(string texto, string textoProcurado)
        {
            bool termina = texto.EndsWith(textoProcurado, StringComparison.OrdinalIgnoreCase);
            return termina;
        }
    }
}