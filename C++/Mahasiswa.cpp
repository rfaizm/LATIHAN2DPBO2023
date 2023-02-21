class Mahasiswa : public Akademik{
    private :
        string nim;
        string prodi;
        string fakultas;

    public :

        Mahasiswa(){
        }

        /* Setter and Getter NIM*/
        void setNIM(string nim){
            this->nim = nim;
        }

        string getNIM(){
            return this->nim;
        }

        /* Setter and Getter Prodi*/
        void setProdi(string prodi){
            this->prodi = prodi;
        }

        string getProdi(){
            return this->prodi;
        }

        /* Setter and Getter Fakultas */
        void setFakultas(string fakultas){
            this->fakultas = fakultas;
        }

        string getFakultas(){
            return this->fakultas;
        }

        ~Mahasiswa(){

        }
};