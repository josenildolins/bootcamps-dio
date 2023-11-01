using DomainService;
using Microsoft.AspNetCore.Mvc;
using Repository;

namespace DioBootcampWex.Controllers
{
    [ApiController]
    [Route("controller")]
    public class CalculadoraController : ControllerBase
    {
        private readonly ICalculadoraService _operacoes;
        public CalculadoraController(ICalculadoraService operacoes)
        {
            _operacoes = operacoes;
        }

        [HttpGet("somar")]
        public double somar(double x, double y)
        {
            return _operacoes.Somar(x, y);
        }

        [HttpGet("subtrair")]
        public double Subtrair(double x, double y)
        {
            return _operacoes.Subtrair(x, y);
        }

        [HttpGet("multiplicar")]
        public double multiplicar(double x, double y)
        {
            return _operacoes.Multiplicar(x, y);
        }

        [HttpGet("dividir")]
        public double dividir(double x, double y)
        {
            return _operacoes.Divide(x, y);
        }

        [HttpGet("ObterHistorico")]
        public List<Historico> ObterHistorico()
        {
            return _operacoes.ObterHistorico();
        }
    }
}