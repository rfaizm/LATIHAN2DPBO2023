import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        int n = 0;
        int i = 0;
        // Data Dummy
        Mahasiswa aku = new Mahasiswa();
        Mahasiswa dia = new Mahasiswa();
        aku.setNik("321.120.777");
        aku.setName("Rachman");
        aku.setGender('L');
        aku.setKampus("UNI");
        aku.setEmail("unknown@uni.edu");
        aku.setNIM("2123040");
        aku.setProdi("IK");
        aku.setFakultas("FPMIPA");

        dia.setNik("321.100.890");
        dia.setName("Dia_Sayang");
        dia.setGender('P');
        dia.setKampus("UNI");
        dia.setEmail("unknown@uni.edu");
        dia.setNIM("2178090");
        dia.setProdi("IK");
        dia.setFakultas("FPMIPA");
        //Buat array list
        ArrayList<Mahasiswa> list = new ArrayList<>();
        //Masukkan data dummy ke dalam list
        list.add(aku);
        list.add(dia);
        // Output
        System.out.println("Daftar Human : ");
        for(i=0; i<list.size(); i++){
            System.out.println(Integer.toString(i+1) + ". " + list.get(i).getNik() + " | " + list.get(i).getName() + " | " + list.get(i).getGender() + " | " + list.get(i).getKampus() + " | " + list.get(i).getEmail() + " | " + list.get(i).getNIM() + " | " + list.get(i).getProdi() + " | " + list.get(i).getFakultas());
        }

    }
}