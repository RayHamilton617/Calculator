public class Calculadora Cientifica {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int fim = 0;
    int escolha;
    
    System.out.println("Calculadora Cientifica");
    
    while (fim = 0){
      System.out.println("1- Potencia \n2 - Raiz quadrada \n3 - Sair \n");
      escolha = scn.nextInt();
      
      switch (escolha){
        case 1:
          System.out.println("Base:");
          double b = scn.nextDouble();
          System.out.println("Expoente:");
          double e = scn.nextDouble();
          System.out.println();
          System.out.println("Resultado: " + pow(b, e));
          System.out.println();
          break;
        case 2:
          System.out.println("Radicando:");
          double r = scn.nextDouble();
          System.out.println();
          System.out.println("Resultado: " + sqrt(r));
          System.out.println();
          break;
        case 3:
          System.out.println("Ate mais");
          fim++;
          break;
        default:
          System.out.println("opcao invalida");
          System.out.println();
      }
    }
  }
  public static double pow(double b, double e) {
    DecimalFormat df = new DecimalFormat(".00");
    double p = Math.pow(b, e);
    return p;
  }
  public static double sqrt(double r) {
    DecimalFormat df = new DecimalFormat(".00");
    double rq = Math.sqrt(r);
    return rq;
  }
}
