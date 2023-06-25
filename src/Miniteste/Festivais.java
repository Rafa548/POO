package Miniteste;

public class Festivais {
        private String nome;
        private String local;
        private int n_bilhetes;
        private DateYMD inic;
        private DateYMD fim;
        
    
        public Festivais(DateYMD inic,DateYMD fim,String nome, String local, int n_bilhetes) {
            this.nome = nome;
            this.local = local;
            this.n_bilhetes = n_bilhetes;
            this.inic = inic;
            this.fim = fim;
        }
        
    
        public DateYMD getD_inic() {
            return inic;
        }
    
        public DateYMD getD_fim() {
            return fim;
        }
    
        public String getNome() {
            return nome;
        }
    
        public String getLocal() {
            return local;
        }
    
        public int getN_Bilhetes() {
            return n_bilhetes;
        }
    
        //@Override
        //public String toString() {
            //return String.format("%-40s%-10.1f%-10s%-10s%-15d", Name, score, Rating, Genre, r_time);
        //}
    
}
