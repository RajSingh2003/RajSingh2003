<?php
$title=$_GET["t"];
//$host=;
//$port=;
$con=pg_connect("host=192.168.1.254 dbname=ty55 user=ty55 password=ty55");
if (!$con)
    echo" <br>unsucessful <br>";
else
    echo" <br> sucessful connection <br>";


$sql="SELECT * FROM sc ,competition,student WHERE student.id=sc.id AND competition.cno=sc.cno AND rank=1 AND cname='$cname'";

/*    
$update=" UPDATE  commitee SET status='working' WHERE cno IN( SELECT cno FROM ec WHERE eno IN( SELECT eno FROM event WHERE title='$title')); "; 
$ret=pg_query($con,$update);
if (!$ret)
   echo " Error ";
else 
   echo"status updated successfully";
*/
$ret=pg_query($con,$sql);
while ($row=pg_fetch_row($ret))
{
      echo"<br>  id :  ".$row[0];



pg_close($con );
?>
