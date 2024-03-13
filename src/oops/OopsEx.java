package oops;

public abstract class OopsEx {
    String officeName;

    abstract String promotion(String m1);
}
 class Employee extends OopsEx {
     private String dataScientist;
     private String javaDeveloper;
     private String productAnalyst;

     public String getDataScientist() {
         return dataScientist;
     }

     public void setDataScientist(String dataScientist) {
         this.dataScientist = dataScientist;
     }

     public String getJavaDeveloper() {
         return javaDeveloper;
     }

     public void setJavaDeveloper(String javaDeveloper) {
         this.javaDeveloper = javaDeveloper;
     }

     public String getProductAnalyst() {
         return productAnalyst;
     }

     public void setProductAnalyst(String productAnalyst) {
         this.productAnalyst = productAnalyst;
     }

     @Override
     String promotion(String m1) {
         return this.officeName+" is announcing that "+m1+" "+"From the oops.Management are getting promoted ";
     }
     String promotion(Management m1, Employee e1) {
         return e1.officeName+" is announcing that oops.Employee "+e1.getDataScientist() +" "+m1+" "+"From the oops.Management are getting promoted ";
     }

 }

 class Management extends Employee {
    private String director;
    private String partner;
    private String vicePresident;

     public Management(String director, String partner, String vicePresident) {
         this.director = director;
         this.partner = partner;
         this.vicePresident = vicePresident;
     }
 }

 class TestOopsEx {
    public static void main(String[] args){
        Management m1 = new Management("Kevin","John","Emma");
        Employee e1 = new Employee();
        e1.setDataScientist("David");
        e1.officeName="APPLE";
        System.out.println(e1.promotion(m1,e1));
        System.out.println(e1.promotion(m1.getDataScientist()));
    }
 }
