class Akademik : public Human{
    private :
        string kampus;
        string email;

    public :

        Akademik(){
        }

        /* Setter and Getter Kampus*/
        void setKampus(string kampus){
            this->kampus = kampus;
        }

        string getKampus(){
            return this->kampus;
        }

        /* Setter and Getter Email*/
        void setEmail(string email){
            this->email = email;
        }

        string getEmail(){
            return this->email;
        }

        ~Akademik(){

        }
};