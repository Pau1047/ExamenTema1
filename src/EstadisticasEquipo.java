import java.util.Scanner;

public class EstadisticasEquipo {

    public static int partidosGanados (){
        int contadorG = 0;
        int[] partidos = new int[]{1,2,1,0,0,1};
        for (int i = partidos[1]; i< partidos.length; i++){
            if (partidos[i] == 1);{
                contadorG++;
            }

        }
// El metodo lo que hace esque si el contenido de esa posición en el array es igual a uno suma un punto al
// contador y al final devuelve el numero de partidos a ganado
        return contadorG;
    }

    public static int partidosPerdidos (){
        int contadorP = 0;
        int[] partidos = new int[]{1,2,2,0,0,1};
        for (int i = 0; i< partidos.length; i++){
            if (partidos[i] == 0);{
                contadorP = + 1;
            }
        }
// El metodo lo que hace es que si el contenido de esa posición en el array es igual a 0 suma un punto
// al contador y al final devuelve el numero de partidos a pedido
        return contadorP;

    }

    public static int partidosEmpatados (){
        int contadorE = 0;
        int[] partidos = new int[]{1,2,2,0,0,1};
        for (int i = partidos[1]; i< partidos.length; i++){
            if (partidos[i] == 2);{
                contadorE = + 1;
            }
        }
// El metodo lo que hace es que si el contenido de esa posición en el array es igual a 2 suma un punto
// al contador y al final devuelve el numero de partidos a empatado
        return contadorE;
    }

    public static int filtraPartidosLocal (int[] local){
        int[] numeropartidos = local;
        int contadorp = 0;
        for (int i = 0; i < numeropartidos.length; i++){
            contadorp++;
        }
        int partidosl = contadorp/2 ;
// El metodo lo que hace es que coge el array y coje la largaria que tiene y los divide entre dos ya que siempre va
// a ser par y devolvera el numero de partidos que juegan de local.
        return partidosl;
    }

    public static int filtraPartidosVisitante (int[] totalpartidos){
        int[] numeropartidos = totalpartidos;
        int contadorp = 0;
        for (int i = 0; i < numeropartidos.length; i++){
            contadorp++;
        }
        int[] partidosv = new int[contadorp/2] ;
// El metodo lo que hace es que coge el array y coje la largaria que tiene y los divide entre dos ya que siempre va
// a ser par y devolvera el numero de partidos que juegan de visitante.
        return 0;
    }

    public static int calculaPuntos (int partidosg, int partidosp, int partidose){
        int partidosganados = partidosg * 3;
        int partidosperdidos = partidosp * 0;
        int partidosempatados = partidose ;
//El metodo lo que hace es coger los partidos ganados y los multiplica para saber todos los puntos de los ganados, luego coge los peridos y los multiplica por 0 porque si o si van a sumar entre todos 0 puntos
// y luego en los empatados simplemente los partidos empatados ya son iguales a los puntos que ganan empatando, entoces coge todo y lo suma para saber los puntos totales.
        int resultadospuntos = partidosempatados + partidosganados + partidosperdidos;
        return resultadospuntos;
    }

    public static int muestraEstadisticasEquipo (int puntos, int tganados, int tperdidos){
        int estadisticasglobales= puntos + tperdidos + tganados;
        //no me da tiempo para acabar pero basicamente queria coger el metodo de calcula puntos para los puntos
     //totales, cogiera los metodos de los partidos ganados,perdidos y empatados para que se sumaran y diera el resultado de partidos jugados y ademas que dijera cuantos ha ganado,perdido y empatados;
     return 0;
    }

    public static void main(String[] args) {
        Scanner introducir = new Scanner(System.in);
        System.out.println("Cuantos partidos han jugados");
        int partidoj = introducir.nextInt();

        System.out.println("Cuantos partidos ha ganado el equipo?");
        int partidosg = introducir.nextInt();
        System.out.println("Cuantos partidos ha perdido el equipo?");
        int partidosp = introducir.nextInt();
        System.out.println("Cuantos partidos ha empatado el equipo?");
        int partidose = introducir.nextInt();
        System.out.println("Los puntos totales del equipo son " + calculaPuntos(partidosg,partidosp,partidose));


            int[]visisante = new int[partidoj];
            for (int i = 0; i<visisante.length; i++) {
                System.out.println("introduzca los resultados de los partidos ");

             int[] jugados = new int[introducir.nextInt()];
            }
            System.out.println("Estos son los partidos que han jugado de vivitante " + filtraPartidosVisitante(visisante));
    }
}
