public class Main {
    public static void main(String[] args) {
        int numeroIf;
        numeroIf = 10;
        if (numeroIf ==0){
            System.out.println("el numero es 0");

        }else if(numeroIf>=0){
            System.out.println("el numero es positivo");
        }else if(numeroIf <=0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("el numero no es valido");
        }

        int numeroWhile=0 ;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println("se incremento numeroWhile, ahora tiene "+numeroWhile);
        }
        do{
            System.out.println("ejecucion del do-while");
        }while (false);

        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("se incremento numeroFor, ahora tiene "+numeroFor);
        }
        int estacion;
        estacion=1;
        switch (estacion){
            case 1:
                System.out.println("Estamos en primavera");
                break;
            case 2:
                System.out.println("Estamos en vereno");
                break;
            case 3:
                System.out.println("Estamos en otoño");
                break;
            case 4:
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("esta no es una estacion valida");
                break;
        }
    }
}