public class student {
    String name;
    String surname;
    int transgresion;
    int powerMagic;
    int MsConjure;

    public student(String name,String surname,int transgresion, int powerMagic) {
        this.name = name;
        this.surname = surname;

        this.transgresion = transgresion;
        this.powerMagic = powerMagic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMsConjure() {
        return MsConjure;
    }

    public void setMsConjure(int msConjure) {
        MsConjure = msConjure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getTransgresion() {
        return transgresion;
    }

    public void setTransgresion(int transgresion) {
        this.transgresion = transgresion;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }
    public String toString() {
        return " " +  name + ' '
                + surname
                ;
    }
    public static  void si (student student1, student student2) {
        int si1 = student1.getPowerMagic();
        int si2 = student2.getPowerMagic();
        if (si1 > si2) {
            System.out.println(student1 + " обладает большей мощностью магии, " + student2);
        } else if (si2 > si1) {
            System.out.println(student2 + " обладает большей мощностью магии, " + student1);
        } else {
            System.out.println(" Силы равны ");
}
    }
    public static void di (student student1, student student2) {
        int si1 = student1.getPowerMagic();
        int si2 = student2.getPowerMagic();
        if (si1 > si2) {
            System.out.println(student1 + " лучшe, чем " + student2);
        } else if (si2 > si1) {
            System.out.println(student2 + " лучшe, чем " + student1);
        } else {
            System.out.println(" Силы равны ");
}
    }
}

