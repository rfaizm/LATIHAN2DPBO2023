<?php

require('Mahasiswa.php');


$array = [];
$aku = new Mahasiswa();
$dia = new Mahasiswa();

$aku->setNik("321.120.777");
$aku->setNama("Rachman");
$aku->setGender('L');
$aku->setKampus("UNI");
$aku->setEmail("unknown@uni.edu");
$aku->setNim("2123040");
$aku->setProdi("IK");
$aku->setFakultas("FPMIPA");

$dia->setNik("321.100.890");
$dia->setNama("Dia_Sayang");
$dia->setGender('P');
$dia->setKampus("UNI");
$dia->setEmail("unknown@uni.edu");
$dia->setNIM("2178090");
$dia->setProdi("IK");
$dia->setFakultas("FPMIPA");

array_push($array, $aku);
array_push($array, $dia);

$i;
$j = 1;
for($i = 0; $i < count($array); $i++){
    echo $j . ". " .$array[$i]->getNik() . " | " .$array[$i]->getNama() . " | " . $array[$i]->getGender() . " | " . $array[$i]->getKampus() . " | " . $array[$i]->getEmail() . " | " . $array[$i]->getNim() . " | " . $array[$i]->getProdi() . " | " . $array[$i]->getFakultas() . "<br/>";
    $j += 1;
}

?>