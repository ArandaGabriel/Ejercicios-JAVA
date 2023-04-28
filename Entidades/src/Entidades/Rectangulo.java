package Entidades;

public class Rectangulo {
 
    private int base;
    private int altura;
    private int superficie;
    private int perimetro;

   
    
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
        
    }
    
    public int superficie(){
        superficie = base*altura;
        return superficie;
    }
    
    public int perimetro(){
        perimetro = (base+altura)*2;
        return perimetro;
    }
    
    public void dibujar(){
        
        for (int i = 0; i < base; i++) {
           System.out.print("* "); 
        }
        System.out.println("");
        int j=0;
                
        while(j<altura){
            System.out.print("*");
            
            for (int i = 0; i < base-1; i++) {
            System.out.print("  ");    
            }
            
            System.out.print("*");
            System.out.println("");
            j+=1;
        }
        
        for (int i = 0; i < base; i++) {
           System.out.print("* "); 
           
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }
    
    
   
}
        
       
            

