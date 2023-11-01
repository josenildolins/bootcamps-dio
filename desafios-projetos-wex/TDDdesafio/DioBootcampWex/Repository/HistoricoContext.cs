using Microsoft.EntityFrameworkCore;

namespace Repository
{
    public class HistoricoContext : DbContext
    {
        public DbSet<Historico> Historico { get; set; }

        public string DbPath { get; }

        public HistoricoContext()
        {
            Environment.SpecialFolder folder = Environment.SpecialFolder.LocalApplicationData;
            string path = Environment.GetFolderPath(folder);
            DbPath = Path.Join(path, "historico.db");
        }

        protected override void OnConfiguring(DbContextOptionsBuilder options)
            => options.UseSqlite($"Data Source={DbPath}");
    }
}