from Mahasiswa import Mahasiswa

mhs = []

aku = Mahasiswa()
dia = Mahasiswa()
aku.setNik("321.120.777")
aku.setNama("Rachman")
aku.setGender('L')
aku.setKampus("UNI")
aku.setEmail("unknown@uni.edu")
aku.setNim("2123040")
aku.setProdi("IK")
aku.setFakultas("FPMIPA")

dia.setNik("321.100.890")
dia.setNama("Dia_Sayang")
dia.setGender('P')
dia.setKampus("UNI")
dia.setEmail("unknown@uni.edu")
dia.setNim("2178090")
dia.setProdi("IK")
dia.setFakultas("FPMIPA")

mhs.append(aku)
mhs.append(dia)

count = 0
for human in mhs:
    print(str(count + 1) + "." , human.getNik(), " | ", human.getNama(), " | ", human.getGender(), " | ", human.getKampus(), " | ", human.getEmail(), " | ", human.getNim(), " | ", human.getProdi(), " | ", human.getFakultas())
    count += 1