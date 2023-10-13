<?php
$file=$_GET["t"];
echo"Name of file  : ".$file;
  $fp=fopen($file,"r");
if(!$fp)
   echo"<br><br>File does not exist";  
else
{
  $size=filesize($file);
  echo"<br><br> Data of file : <br>";
  $data= fread($fp,$size);
  echo" ".$data;
  }
fclose($fp); 

?>
