public class CalculoIRPF {
    public static void main(String[] args) {
        // Definindo o nome do funcionário e o salário fixo 
        String nomeFuncionario = "Maria Oliveira";
        double salarioFixo = 5000.00;

        // Calculando a contribuição do IRPF
        double irpf = 0;
        if (salarioFixo <= 2259.20) {
            irpf = 0; // Isento
        } else if (salarioFixo <= 2826.65) {
            irpf = salarioFixo * 0.075;
        } else if (salarioFixo <= 3751.05) {
            irpf = salarioFixo * 0.15;
        } else if (salarioFixo <= 4664.68) {
            irpf = salarioFixo * 0.2255;
        } else {
            irpf = salarioFixo * 0.275;
        }

        // Exibindo o resultado
        System.out.println("Funcionário: " + nomeFuncionario);
        System.out.println("Salário Fixo: R$ " + String.format("%.2f", salarioFixo));
        System.out.println("Contribuição do IRPF: R$ " + String.format("%.2f", irpf));
    }
}
