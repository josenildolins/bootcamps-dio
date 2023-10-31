using Microsoft.AspNetCore.Mvc;

namespace DioBootcampWex.Controllers
{
    [ApiController]
    [Route("controller")]
    public class CalculadoraController: ControllerBase
    {
        [HttpPost("somar")]
        public double somar(double x, double y)
        {
            return x + y;
        }

        [HttpPost("multiplicar")]
        public double multiplicar(double x, double y)
        {
            return 0;
        }

        [HttpPost("dividir")]
        public double dividir(double x, double y)
        {
            return x / y;
        }

        [HttpGet("ObterHistorico")]
        public string ObterHistorico()
        {
            return "Histórico";
        }
    }
}