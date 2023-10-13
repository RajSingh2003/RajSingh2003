<?php

$a=$_GET["t"];
$num=$_GET["t1"];
$arr2=explode(",",$a);

echo"Array is  : ";
foreach($arr2 as $c)
      echo $c."\t";
echo"<br>";

$cn=count($arr2);

for($i=0;$i<$cn;$i++)
{
    if ($arr2[$i]==$num)
    {
       echo" The number ".$num." is present";
       return;
    }
}    
echo" The number ".$num." is not present";
       



?>
