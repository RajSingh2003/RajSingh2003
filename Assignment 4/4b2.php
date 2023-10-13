<?php

$a=$_GET["t"];
$ins=$_GET["t1"];
$pos=$_GET["n1"];
//$arr1=implode(",",$arr);
$arr2=explode(",",$a);

// to display
echo"Array is  : ";
foreach($arr2 as $c)
      echo $c."\t";
echo"<br>";

$new=array_splice($arr2,$pos,1,$ins);

echo"Removed element is  : ";
foreach($new as $v)
      echo $v."\t";
echo"<br>";

echo"Updated Array is  : ";
foreach($arr2 as $n)
      echo $n."\t";
echo"<br>";

?>
