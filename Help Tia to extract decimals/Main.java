#include<iostream>
using namespace std;
#include<string>
int main() 
{ 
  int i=0;
	char fnum[50];
	gets(fnum);
  	for(i=0;fnum[i]!='\0';i++)
    {
     if(fnum[i]=='.')
     {
       i++;
      break;
     } 
    }
  cout<<"Floating part is : ";
  for(int j=i;fnum[j]!='\0';j++)
  {
	cout<<fnum[j];
  }
  
  
}