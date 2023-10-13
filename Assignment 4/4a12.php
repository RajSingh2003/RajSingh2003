<?php
$temp1 = $_GET["t"];
$n1=$_GET["n"];
$ch = $_GET["op"];
$a=explode(",",$temp1);

echo"Array is ";
foreach($a as $c)
      echo $c."\t";
echo "<br>";
      
//echo "Entered string is : " . $str;
//echo "<br>";
echo "selected option is : " . $ch;
echo "<br>";

switch ($ch)
 {
    case 1:
        array_push($a,$n1);
        echo " Updated Array by pushing element :";

        break;
    case 2:
        array_pop($a);
        echo " Updated Array by poping element :";

        break;
    case 3:
         echo"Stack is ";
         //foreach($a as $c)
         //        echo $c."\t";
        break;
    case 4:
        array_unshift($a,"$n1");
        echo " Updated Array by inserted element :";
        break;
    case 5:
        array_shift($a);
        echo " Updated Array by deleted element :";
        break;
    case 6:
          echo"Queue is ";
          //foreach($a as $c)
          //      echo $c."\t";
        break;
}
echo "<br>";

foreach($a as $c)
   echo $c."\t";
?>
