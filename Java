document.addEventListener("DOMContentLoaded", () => {
  const btnCalcular = document.getElementById("btn-calcular");
  const barraProgresso = document.getElementById("progresso-sustentavel");
  const statusTexto = document.getElementById("status-texto");

  btnCalcular.addEventListener("click", () => {
    let pontuacaoTotal = 0;

    // Seleciona todos os checkboxes marcados
    const opcoes = document.querySelectorAll('.options input[type="checkbox"]:checked');
    
    opcoes.forEach((opcao) => {
      pontuacaoTotal += parseInt(opcao.value);
    });

    // Atualiza visualmente a barra de progresso
    barraProgresso.style.width = pontuacaoTotal + "%";

    // Altera o texto baseado no resultado do cálculo
    if (pontuacaoTotal === 0) {
      statusTexto.innerText = "Alerta: Baixo equilíbrio! Adote práticas sustentáveis.";
      statusTexto.style.color = "#d32f2f"; // Vermelho
    } else if (pontuacaoTotal > 0 && pontuacaoTotal < 70) {
      statusTexto.innerText = `Equilíbrio em evolução (${pontuacaoTotal}%). Podemos melhorar!`;
      statusTexto.style.color = "#f57c00"; // Laranja
    } else {
      statusTexto.innerText = `Excelente! Agro Forte e Sustentável alcançado com ${pontuacaoTotal}%!`;
      statusTexto.style.color = "#388e3c"; // Verde escuro
    }
  });
});
