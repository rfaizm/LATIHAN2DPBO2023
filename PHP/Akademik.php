<?php
require('Human.php');
class Akademik extends Human
{
	//atribut
	private $kampus = "";
	private $email = "";

	//constructor
	public function __construct($kampus = "", $email = "")
	{
		$this->kampus = $kampus;
		$this->email = $email;
	}

	//kampus
	public function setKampus($kampus)
	{
		$this->kampus = $kampus;
	}

	public function getKampus()
	{
		return $this->kampus;
	}

    //email
	public function setEmail($email)
	{
		$this->email = $email;
	}

	public function getEmail()
	{
		return $this->email;
	}

	//destructor
	public function __destruct()
	{
	}
}

?>