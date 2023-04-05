public class Main {
    public static void main(String[] args) {

    }
    public String afficher(int nombreMin, int nombreMax){
        return transformerLesNombres(nombreMin, nombreMax);
    }
    private String transformerLesNombres(int nombreMin, int nombreMax){
        String resultat = "";
        for(int i = nombreMin; i <= nombreMax; i++){
            resultat += transformer(i);
        }
        return resultat;
    }
    private String transformer(int nombre){
        if(nombre % 15 == 0){
            return "FizzBuzz";
        }
        if(nombre % 5 == 0){
            return "Buzz";
        }
        if(nombre % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(nombre);
    }
}