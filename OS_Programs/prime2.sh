#!/bin/bash
echo "Enter a number"
read a
i=2
z=0
while [ $i -lt $a ]
do
s=`expr $a % $i`
if [ $s -eq $z ]
then
echo "Not prime"
exit
else
i=`expr $i + 1`
fi
done
echo "Prime"
