#include <iostream>
#include<string.h>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
cin.getline(str, 20);      
  end=(strlen(str))-1;
  for(int i=end;i>=0;i--)
  {
    cout<<str[i];
  }


}