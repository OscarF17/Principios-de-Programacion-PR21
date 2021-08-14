class ProblemaExamenDiagnostico{
    public static void main(String[] args){
       int a, b, c;
       for (a=1; a<101; a++){
          for (b=1; b<101; b++){
             for (c=1; c<101; c++){
                if ((a*a)+(b*b)==(c*c)){
                   System.out.println("a= "+a+" b= "+b+" c= "+c);
                }
             }
          }
       }
       }
    }