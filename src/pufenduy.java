public class pufenduy extends student{
    int diligence;
    int loyalty;
    int honesty;

    public pufenduy(String name,String surname,int transgresion,int powerMagic ,int diligence, int loyalty, int honesty) {
        super(name,surname,transgresion,powerMagic);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public String toString() {
        return " " +  name + ' '
                + surname
                ;
    }
    public static  void sila (pufenduy student1, pufenduy student2) {
        int summ1 = student1.getDiligence() + student1.getHonesty() + student1.getLoyalty();
        int summ2 = student2.getDiligence() + student1.getHonesty() + student1.getLoyalty();
        if (summ1 > summ2) {
            System.out.println(student1 + " лучший Пуфиндуец, чем " + student2);
        } else if (summ2 > summ1) {
            System.out.println(student2 + " лучший Пуфендуец, чем " + student1);
        } else {
            System.out.println("Силы равны");
        }
    }
}
