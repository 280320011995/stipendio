public class Main {
    public static void main(String[] args) {
        /*
        realizzare un programma per determinare, dopo aver inserito in una variabile correttamente dimensionata
        lo stipendio annuale (es 15414) l'aumento e quindi il nuovo stipendio di un dipendente, tramite le
        istruzioni if else con le quali calcolare l'aumento rispetto allo stipendio base.
        L'input al programma include l'attuale stipendio annuo per il dipendente e un numero che indica la valutazione
        della performance (1=eccellente, 2=buona, 3=scarsa).
        un dipendente con una valutazione di 1 riceverà un aumento del 6% , un dipendente con una valutazione di
        2 riceverà un aumento del 4% e uno con una valutazione di 3 riceverà un aumento dell'1,5%.
         */
        System.out.println("calcolare il nuovo stipendio in base all'aumento");

        int stipendioAnnuale=18000;
        float stipendioAnnualeAumentato;
        byte valutazione= 2;
        float aumento;

        if (valutazione==1){
            stipendioAnnualeAumentato= (stipendioAnnuale*6)/100;
            aumento= stipendioAnnualeAumentato+stipendioAnnuale;
            System.out.println("l'aumento sullo stipendio annuale è di:" +stipendioAnnualeAumentato);
            System.out.println("il nuovo stipendio è:" +aumento);
        }
        else if (valutazione==2){
            stipendioAnnualeAumentato= (stipendioAnnuale*4)/100;
            aumento= stipendioAnnualeAumentato+stipendioAnnuale;
            System.out.println("l'aumento sullo stipendio annuale è di:" +stipendioAnnualeAumentato);
            System.out.println("il nuovo stipendio è:" +aumento);
        }
        else if (valutazione==3){
            stipendioAnnualeAumentato= (stipendioAnnuale*1.5f)/100;
            aumento= stipendioAnnualeAumentato+stipendioAnnuale;
            System.out.println("l'aumento sullo stipendio annuale è di:" +stipendioAnnualeAumentato);
            System.out.println("il nuovo stipendio è:" +aumento);
        }

    }
}