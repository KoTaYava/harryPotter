public class kogtevran extends student{
    int smatrt;
    int wiese;
    int witty;
    int creativiti;

    public kogtevran(String name,String surname,int transgresion,int powerMagic ,int smatrt, int wiese, int witty, int creativiti) {
        super(name,surname,transgresion,powerMagic);
        this.smatrt = smatrt;
        this.wiese = wiese;
        this.witty = witty;
        this.creativiti = creativiti;
    }

    public int getSmatrt() {
        return smatrt;
    }

    public void setSmatrt(int smatrt) {
        this.smatrt = smatrt;
    }

    public int getWiese() {
        return wiese;
    }

    public void setWiese(int wiese) {
        this.wiese = wiese;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativiti() {
        return creativiti;
    }

    public void setCreativiti(int creativiti) {
        this.creativiti = creativiti;
    }
    public String toString() {
        return " " +  name + ' '
                + surname
                ;
    }
    public static  void sila (kogtevran student1, kogtevran student2) {
        int summ1 = student1.getCreativiti() + student1.getSmatrt() + student1.getWiese() + student1.getWitty();
        int summ2 = student2.getCreativiti() + student2.getSmatrt() + student2.getWiese() + student2.getWitty();
        if (summ1 > summ2) {
            System.out.println(student1 + " лучший Когтевранец, чем " + student2);
        } else if (summ2 > summ1) {
            System.out.println(student2 + " лучший Когтевранец, чем " + student1);
        } else {
            System.out.println("Силы равны");
        }
    }


    }

