class Main{
    public static void main(String[] args){
        Mahasiswa aku = new Mahasiswa();

        aku.setNik("321.120.777");
        aku.setName("Rachman");
        aku.setGender('L');
        aku.setKampus("UNI");
        aku.setEmail("unknown@uni.edu");
        aku.setNIM("2123040");
        aku.setProdi("IK");
        aku.setFakultas("FPMIPA");

        System.out.println("NIK : " + aku.getNik());
        System.out.println("Nama : " + aku.getName());
        System.out.println("Gender : " + aku.getGender());
        System.out.println("Kampus : " + aku.getKampus());
        System.out.println("Email : " + aku.getEmail());
        System.out.println("NIM : " + aku.getNIM());
        System.out.println("Program Studi : " + aku.getProdi());
        System.out.println("Fakultas : " + aku.getFakultas());
        aku.eat();
        aku.sleep();

    }
}