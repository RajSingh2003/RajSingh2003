<?php
$a=$_GET['n1'];
$b=$_GET['n2'];
echo"Num 1: ".$a;
echo"<br>";
echo"Num 2: ".$b;

function mod($a,$b)
{
     $m=$a%$b;
     echo"Mod is : ".$m;
     echo"<br>";

}
mod($a,$b);
//power
function power($a,$b)
{
       $fn=1;
       $n=$b;
       while ($n > 0)
       {
             $fn=$fn*a;
             $n--;
       }
       echo"power of $a is $b".$fn;
       echo"<br>";
}
power($a,$b);
function factorial($b)
{
         $fact=1;
         for ($i=1;$i<=$b;$i++)
              $fact*=$i;
         echo"Factorial of $b is ".$fact;
       echo"<br>";
}
factorial($a);
factorial($b);


