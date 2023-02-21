#include <bits/stdc++.h>
#include <iostream>
#include <string>

using namespace std;

#include "Human.cpp"
#include "Akademik.cpp"
#include "Mahasiswa.cpp"
int main(){
    int n = 0;
    int i = 0;

    Mahasiswa aku;
    Mahasiswa dia;
    list<Mahasiswa> llist;

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

    llist.push_back(aku);
    llist.push_back(dia);

    i = 0;
    for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
        cout << (i + 1) << ". " << it->getNIK() << " | " << it->getGender() << " | " <<it->getKampus() << " | " << it->getEmail() << " | " <<it->getNIM() << " | " << it->getName() << " | " << it->getProdi() << " | " << it->getFakultas() << endl;
        i++;
    }

}