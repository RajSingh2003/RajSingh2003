<?php

$arr = $_GET["t"];
$ins = $_GET["t1"];
$pos=$_GET["n1"];
$arr1=implode(",",$arr);
$arr2=explode(",",$arr1);

// to display
echo"Array is  : ";
foreach($arr2 as $c)
      echo $c."\t";
echo"<br>";

$new=array_splice($arr2,array($ins),1);

echo"Array is  : ";
foreach($arr2 as $c)
      echo $c."\t";
echo"<br>";

echo"Array is  : ";
foreach($new as $c)
      echo $c."\t";
echo"<br>";

?>
