<?php

class Human
{
	//atribut
	private $nik = "";
	private $nama = "";
	private $gender = "";

	//constructor
	public function __construct($nik = "", $nama = "", $gender = "")
	{
		$this->nik = $nik;
		$this->nama = $nama;
		$this->gender = $gender;
	}

	//nik
	public function setNik($nik)
	{
		$this->nik = $nik;
	}

	public function getNik()
	{
		return $this->nik;
	}

    //nama
	public function setNama($nama)
	{
		$this->nama = $nama;
	}

	public function getNama()
	{
		return $this->nama;
	}

	public function setGender($gender)
	{
		$this->gender = $gender;
	}

	public function getGender()
	{
		return $this->gender;
	}

	//destructor
	public function __destruct()
	{
	}
}
?>