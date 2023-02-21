<?php
require('Akademik.php');
class Mahasiswa extends Akademik
{
	//atribut
	private $nim = "";
	private $fakultas = "";
	private $prodi = "";

	//constructor
	public function __construct($nim = "",  $prodi = "", $fakultas = "")
	{
		$this->nim = $nim;
		$this->fakultas = $fakultas;
		$this->prodi = $prodi;
	}

	//NIM
	public function setNim($nim)
	{
		$this->nim = $nim;
	}

	public function getNim()
	{
		return $this->nim;
	}

    //fakultas
	public function setFakultas($fakultas)
	{
		$this->fakultas = $fakultas;
	}

	public function getFakultas()
	{
		return $this->fakultas;
	}

    //prodi
	public function setProdi($prodi)
	{
		$this->prodi = $prodi;
	}

	public function getProdi()
	{
		return $this->prodi;
	}

	//destructor
	public function __destruct()
	{
	}
}

?>