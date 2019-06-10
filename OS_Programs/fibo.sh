#!/bin/bash
echo "Enter a number"
read n
a=0
b=1
echo "The series is:"
echo "$b"
i=0
while [ $i -lt $n ]
do
c=`expr $a + $b`
echo "$c"
a=`expr $b`
b=`expr $c`
i=`expr $i + 1`
done
