using DomainService.Interfaces;
using Microsoft.AspNetCore.Mvc;

namespace DioBootcampWex.Controllers
{
    [ApiController]
    [Route("controller")]
    public class CalculadoraController : ControllerBase
    {
        private readonly IOperacoes _operacoes;
        public CalculadoraController(IOperacoes operacoes)
        {
            _operacoes = operacoes;
        }

        [HttpPost("somar")]
        public double somar(double x, double y)
        {
            return _operacoes.Somar(x, y);
        }

        [HttpPost("multiplicar")]
        public double multiplicar(double x, double y)
        {
            return _operacoes.Multiplicar(x, y);
        }

        [HttpPost("dividir")]
        public double dividir(double x, double y)
        {
            return _operacoes.Divide(x, y);
        }

        [HttpGet("ObterHistorico")]
        public string ObterHistorico()
        {
            return "Histórico";
        }
    }
}