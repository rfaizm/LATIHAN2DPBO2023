public class Akademik extends Human{
    private String kampus;
    private String email;

    public Akademik(){
        this.kampus = "";
        this.email = "";
    }

    public Akademik(String kampus, String email){
        this.kampus = kampus;
        this.email = email;
    }

    /* Setter */
    public void setKampus(String kampus){
        this.kampus = kampus;
    }

    public void setEmail(String email){
        this.email = email;
    }

    /* Setter */
    public String getKampus(){
        return this.kampus;
    }

    public String getEmail(){
        return this.email;
    }



}