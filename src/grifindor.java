public class grifindor extends student  {
    int blagorodstvo ;
    int chest ;
    int otvaga ;

    public grifindor(String name,String surname,int transgresion,int powerMagic ,int blagorodstvo, int chest, int otvaga) {
        super(name,surname,transgresion,powerMagic);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.otvaga = otvaga;
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }
    public String toString() {
        return " " +  name + ' '
                 + surname
                ;
    }


    public int getChest() {
        return chest;
    }

    public int getOtvaga() {
        return otvaga;
    }

    public void setBlagorodstvo(int blagorodstvo) {
        this.blagorodstvo = blagorodstvo;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public void setOtvaga(int otvaga) {
        this.otvaga = otvaga;
    }

    public int silaGrif() {
        return silaGrif();
    }
    public static  void sila (grifindor student1, grifindor student2) {
        int summ1 = student1.getBlagorodstvo() + student1.getOtvaga() + student1.getChest();
        int summ2 = student2.getBlagorodstvo() + student2.getChest() + student2.getOtvaga();
        if (summ1 > summ2) {
            System.out.println(student1 + " лучший Гриффиндорец, чем " + student2);
        } else if (summ2 > summ1) {
            System.out.println(student2 + " лучший Гриффиндорец, чем " + student1);
        } else {
            System.out.println("Силы равны");
        }
    }



    }

















