public class Salvadanaio{

    public static int monete;

    public void inserisci(){

        usa(true);
    }

    public void preleva(){
        usa(false);

    }

    private synchronized void usa(boolean inserisci){

        if(inserisci){

            monete++;

        }else{

            monete--;
        }



    }

}