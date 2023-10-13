<?php
$temp = $_GET["t"];
$temp1=explode(",",$temp);

echo"Array of temprature  : ";
foreach($temp1 as $c)
      echo $c."\t";
echo"<br>";

$sum1=0;
$cnt=count($temp1);
foreach($temp1 as $c)
     $sum1=$sum1+$c;
     
$avg=$sum1/$cnt;     

echo" The average temprature : ".$avg;
echo"<br>";

rsort($temp1);
$slice1=array_slice($temp1,0,5);
sort($temp1); 
$slice2=array_slice($temp1,0,5); 
echo"High temprature : ";

foreach($slice1 as $c)
      echo $c."\t";
echo"<br>";
echo"<br>";
echo"Low temprature : ";

foreach($slice2 as $c)
      echo $c."\t";
  
?>     
