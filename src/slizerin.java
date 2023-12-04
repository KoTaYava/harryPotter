public class slizerin extends student {
    int cunning;
    int determination;
    int ambition;
    int resource;

    public slizerin(String name,String surname,int transgresion,int powerMagic ,int cunning, int determination, int ambition, int resource) {
        super(name,surname,transgresion,powerMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
    public String toString() {
        return " " +  name + ' '
                + surname
                ;
    }
    public static  void sila (slizerin student1, slizerin student2) {
        int summ1 = student1.getAmbition() + student1.getCunning() + student1.getResource() + student1.getDetermination();
        int summ2 = student2.getAmbition() + student2.getCunning() + student2.getResource() + student2.getDetermination();
        if (summ1 > summ2) {
            System.out.println(student1 + " лучший Слизеринец, чем " + student2);
        } else if (summ2 > summ1) {
            System.out.println(student2 + " лучший Слизеринец, чем " + student1);
        } else {
            System.out.println(" Силы равны ");
}
    }
}
