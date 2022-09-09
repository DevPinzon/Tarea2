public class Main {
    public static void main(String[] args) {
        //variables del if, while, do while y switch
        int numero = -2;
        int numeroWhile = 0;
        String estaciones = "Invierno";
        //if
        System.out.println("if del numero: "+numero);
        if (numero == 0){
            System.out.println("El numero es CERO.");
        }
        else if (numero < 0){
            System.out.println("El numero es NEGATIVO.");
        }
        else{
            System.out.println("El numero es POSITIVO.");
        }
        System.out.println("while:");
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }
        System.out.println("do while:");
        do{
            System.out.println(numeroWhile);
        }while(numeroWhile<3);
        System.out.println("for:");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }
        System.out.println("switch estaciones:");
        switch (estaciones){
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }

}