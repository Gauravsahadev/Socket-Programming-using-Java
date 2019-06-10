#include<stdio.h>
#include<unistd.h>
int main(){
	execl("/usr/bin/cheese","cheese",0);
}
