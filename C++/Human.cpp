class Human{
    private:
        string nik;
        string nama;
        char gender;
    
    public:

        Human(){

        }

        /* Setter and Getter NIK*/
        void setNik(string nik){
            this->nik = nik;
        }

        string getNIK(){
            return this->nik;
        }

        /* Setter and Getter Nama*/
        void setName(string nama){
            this->nama = nama;
        }

        string getName(){
            return this->nama;
        }

        /* Setter and Getter Gender*/
        void setGender(char gender){
            this->gender = gender;
        }

        char getGender(){
            return this->gender;
        }

        ~Human(){
        }
};