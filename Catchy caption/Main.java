#include <cstring>
#include <iostream>
using namespace std;
int main()
{

  char s[100];
cin.getline(s,100);
 
  int spaces=0;
 int len=strlen(s);
  for(int i=0;i<len;i++)
  {
    if(s[i]==' ')
    {
      spaces++;
    }
  }
    if(spaces<=9)
    {
      cout<<"Caption eligible for the contest";
    }
  else
  {
    cout<<"Caption not eligible for the contest";
  }
   
}