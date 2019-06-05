#!/bin/bash
echo "Enter a number"
read n
s=1
i=1
j=`expr $n + 1`
while [ $i -lt $j ]
do
s=`expr $s \* $i`
i=`expr $i + 1`
done
echo "$s"
