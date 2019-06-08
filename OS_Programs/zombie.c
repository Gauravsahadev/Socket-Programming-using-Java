#include<stdio.h>
int main(){
	if(fork()>0)
		sleep(5);
	return 0;
}
