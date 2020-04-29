#include<iostream>
#include<string.h>
using namespace std;
int main()
{
char s1[50],s2[50];
  cin>>s1>>s2;
   int ans = strcmp(s1, s2);
  if(ans==0)
    cout<<"It is correct";
  else 
    cout<<"It is wrong";
  
}