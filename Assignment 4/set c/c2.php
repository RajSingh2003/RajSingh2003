<?php

$a=array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
//echo "Entered string is : " . $str;
//echo "<br>";
echo"Original array is : ";
print_r($a);
echo "<br>";

echo "selected option is : ".$ch;
echo "<br>";

switch ($ch)
 {
    case 1:
        asort($a);
        echo " Sorted Array is :";
        //print_r($a);
        break;
    case 2:
        ksort($a);
        echo " Sorted Array is :";
        //print_r($a);
        break;
    case 3:
         arsort($a);
        echo " Sorted Array is :";
        //print_r($a);
        break;
    case 4:
        krsort($a);
        echo " Sorted Array is :";
        break;
}
print_r($a);
        
?>
