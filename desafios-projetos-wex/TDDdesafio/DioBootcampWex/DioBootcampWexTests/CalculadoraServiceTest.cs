using DomainService;
using Repository;

namespace DioBootcampWexTests
{
    public class CalculadoraServiceTest
    {
        private CalculadoraService _calculadora = new CalculadoraService(new HistoricoRepository());

        [Fact]
        public void ShouldReturn4()
        {
            //Arrange
            double x = 2;
            double y = 2;
            double expected = 4;

            //Act
            double result = _calculadora.Somar(x, y);

            //Assert
            Assert.Equal(expected, result);
        }

        [Fact]
        public void ShouldReturn10()
        {
            //Arrange
            double x = 2;
            double y = 5;
            double expected = 10;

            //Act
            double result = _calculadora.Multiplicar(x, y);

            //Assert
            Assert.Equal(expected, result);
        }

        [Fact]
        public async void ShouldReturn12()
        {
            //Arrange
            double x = 24;
            double y = 2;
            double expected = 12;

            //Act
            double result = _calculadora.Divide(x, y);

            //Assert
            Assert.Equal(expected, result);
        }

        [Fact]
        public void ShouldReturnDivideByZeroException()
        {
            //Arrange
            double x = 2;
            double y = 0;

            //Assert
            Assert.Throws<DivideByZeroException>(() => _calculadora.Divide(x, y));
        }

        [Fact]
        public void ShouldReturn5()
        {
            //Arrange
            double x = 10;
            double y = 5;
            double expected = 5;

            //Act
            double result = _calculadora.Subtrair(x, y);

            //Assert
            Assert.Equal(expected, result);
        }
    }
}