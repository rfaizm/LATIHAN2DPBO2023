from Akademik import Akademik

class Mahasiswa(Akademik):
    __nim = ""
    __prodi = ""
    __fakultas = ""

    def __init__(self, kampus="", email="", nim ="", prodi="", fakultas=""):
        super().__init__(kampus, email)
        self.__nim = nim
        self.__prodi = prodi
        self.__fakultas = fakultas
    
    # Getter
    # NIM
    def getNim(self):
        return self.__nim
    
    # Prodi
    def getProdi(self):
        return self.__prodi
    
    # Fakultas
    def getFakultas(self):
        return self.__fakultas
    
    # Setter
    # NIM
    def setNim(self, nim):
        self.__nim = nim
    
    # Prodi
    def setProdi(self, prodi):
        self.__prodi = prodi
    
    # Fakultas
    def setFakultas(self, fakultas):
        self.__fakultas = fakultas