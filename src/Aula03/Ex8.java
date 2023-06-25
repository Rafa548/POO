package Aula03;

public class Ex8 {
    public static void main(String[] args) {
        double nt, np, nf, cn;
        cn = 1;
        System.out.printf("NotaT NotaP Pauta \n");
        do {
            nt = (int)(Math.random()*20.0);
            np = (int)(Math.random()*20.0);
            if (nt < 7.0 || np < 7.0){
                    System.out.printf("%4s %4s    66 \n",nt,np);
                    cn += 1;
                }
            else {
                    nf = Math.round((0.4*nt)+(0.6*np));
                    System.out.printf("%4s %4s %5s \n",nt,np,nf);
                    cn +=1;
                }
            
        }while(cn!=16);
    }
}
