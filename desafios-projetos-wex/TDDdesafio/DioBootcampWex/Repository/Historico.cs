using Microsoft.EntityFrameworkCore;

namespace Repository
{
    [PrimaryKey(nameof(id))]
    public class Historico
    {
        public Guid id { get; }

        public double resultado { get; set; }

        public double primeiroValor { get; set; }

        public double segundoValor { get; set; }
        public DateTime data { get; set; }
    }
}