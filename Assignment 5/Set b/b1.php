<?php
 $file=$_GET["t"];
 $fp=fopen($file,"r");
 
    if (!$fp)
      echo"file does not exist"; 
     //(file.exist("item.dat"))
   //$fp=fopen("item.dat:");
   else
  {
   echo"<br><br>";
   echo"<table border =3 align=center cellpadding=10>";
   echo"<tr><td colspan=7 align=center> <h3> book records </h3></td></tr>";
   echo"<td align=center> book name </td>";
   echo"<td align=center>  Quantity </td>";
   echo"<td align=center>  Rate </td>";
   echo"<td align=center>  Title </td>";
   echo"<td align=center>  Total </td>";
   while(!feof($fp))
    {
      $d=fgets($fp);
      $s=explode(" ",$d);
      if (!empty($s[0])  &&  !empty($s[1])  &&  !empty($s[2]) &&     !empty($s[3]))
      {
             $m1=$s[2];
             $m2=$s[3];
             $total=$m1*$m2;
             echo"<tr><td align=center> $s[0] </td>";
             echo"<td align=center> $s[1] </td>";
             echo"<td align=center> $m1 </td>";
             echo"<td align=center> $m2 </td>";
             echo"<td align=center> $total </td>";
      }
    }
  }           
  fclose($fp); 
?>
