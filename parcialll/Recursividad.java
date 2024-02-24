public class Recursividad{
    public void Imprimir(int x){

        if(x<=8){


            System.out.println(x+" ");
            Imprimir(x+1);
            Imprimir(x/8);
        }

    }



}

