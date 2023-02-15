public class Human{
    private String nik;
    private String name;
    private char gender;

    public Human(){
        this.nik = "";
        this.name = "";
        this.gender = '-';
    }

    public Human(String nik,String name, char gender){
        this.nik = nik;
        this.name = name;
        this.gender = gender;
    }

    //Get name
    public String getNik(){
        return this.nik;
    }
    //Set name
    public void setNik(String nik){
        this.nik = nik;
    }

    //Get name
    public String getName(){
        return this.name;
    }
    //Set name
    public void setName(String name){
        this.name = name;
    }
    
    //Get gender
    public char getGender(){
        return this.gender;
    }
    //Set gender
    public void setGender(char gender){
        this.gender = gender;
    }
    
    public void eat(){
        System.out.println(this.name + " is eating!");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping!");
    }
}