package actividadrecuperacion1ºevaluacion;


import java.util.StringTokenizer;

public class TokenizarTiradas {

    private String linea; 

    public TokenizarTiradas(String linea) { 
        this.linea = linea; 
    }

   
    public Tirada tokenizar() {

        Tirada t = new Tirada(); 
        StringTokenizer tokens = new StringTokenizer(linea, ",");
        int s1 = Integer.parseInt(tokens.nextToken());
        int s2 = Integer.parseInt(tokens.nextToken());
        int s3 = Integer.parseInt(tokens.nextToken());

       
            System.out.println("Ya está leído todo el objeto");
        

        Slots slot1 =new Slots();
        slot1.setValor(s1);
        t.setS1(slot1);
        
        Slots slot2 =new Slots();
        slot2.setValor(s2);
        t.setS2(slot2);
        
        Slots slot3 =new Slots();
        slot3.setValor(s3);
        t.setS3(slot3);
        
        return t; 
    }

}
